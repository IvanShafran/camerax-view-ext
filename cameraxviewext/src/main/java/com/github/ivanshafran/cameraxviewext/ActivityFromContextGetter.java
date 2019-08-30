package com.github.ivanshafran.cameraxviewext;

import android.content.Context;
import android.content.ContextWrapper;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

public class ActivityFromContextGetter {

    private ActivityFromContextGetter() {
        // Utility class
    }

    public FragmentActivity tryGetFragmentActivity(@NonNull final Context context) {
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        } else if (context instanceof ContextWrapper) {
            final ContextWrapper contextWrapper = (ContextWrapper) context;
            return tryGetFragmentActivity(contextWrapper.getBaseContext());
        } else {
            return null;
        }
    }
}
