package com.github.ivanshafran.cameraxviewext;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.io.File;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraX;
import androidx.camera.core.FlashMode;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.VideoCapture;
import androidx.camera.view.CameraView;
import androidx.lifecycle.LifecycleOwner;

public class CameraXViewExt extends FrameLayout {

    private CameraView cameraView;

    public CameraXViewExt(@NonNull final Context context) {
        this(context, null);
    }

    public CameraXViewExt(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CameraXViewExt(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs,
            final int defStyleAttr
    ) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public CameraXViewExt(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs,
            final int defStyleAttr,
            final int defStyleRes
    ) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(@NonNull final Context context) {
        cameraView = new CameraView(context);
        final LayoutParams layoutParams = new LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        cameraView.setLayoutParams(layoutParams);
        addView(cameraView);
    }

    // CAMERA VIEW METHODS START

    /** @see CameraView#bindToLifecycle(LifecycleOwner) */
    public void bindToLifecycle(LifecycleOwner lifecycleOwner) {

    }

    /** @see CameraView#getScaleType() **/
    public CameraView.ScaleType getScaleType() {
        return cameraView.getScaleType();
    }

    /** @see CameraView#setScaleType(CameraView.ScaleType) **/
    public void setScaleType(CameraView.ScaleType scaleType) {
        cameraView.setScaleType(scaleType);
    }

    /** @see CameraView#getCaptureMode() **/
    public CameraView.CaptureMode getCaptureMode() {
        return cameraView.getCaptureMode();
    }

    /** @see CameraView#setCaptureMode(CameraView.CaptureMode) **/
    public void setCaptureMode(CameraView.CaptureMode captureMode) {
        cameraView.setCaptureMode(captureMode);
    }

    /** @see CameraView#takePicture(ImageCapture.OnImageCapturedListener) **/
    public void takePicture(ImageCapture.OnImageCapturedListener listener) {
        cameraView.takePicture(listener);
    }

    /** @see CameraView#takePicture(File, ImageCapture.OnImageSavedListener) **/
    public void takePicture(File file, ImageCapture.OnImageSavedListener listener) {
        cameraView.takePicture(file, listener);
    }

    /** @see CameraView#startRecording(File, VideoCapture.OnVideoSavedListener) **/
    public void startRecording(File file, VideoCapture.OnVideoSavedListener listener) {
        cameraView.startRecording(file, listener);
    }

    /** @see CameraView#stopRecording() **/
    public void stopRecording() {
        cameraView.stopRecording();
    }

    /** @see CameraView#isRecording() **/
    public boolean isRecording() {
        return cameraView.isRecording();
    }

    /** @see CameraView#hasCameraWithLensFacing(CameraX.LensFacing) **/
    public boolean hasCameraWithLensFacing(CameraX.LensFacing lensFacing) {
        return cameraView.hasCameraWithLensFacing(lensFacing);
    }

    /** @see CameraView#toggleCamera() **/
    public void toggleCamera() {
        cameraView.toggleCamera();
    }

    /** @see CameraView#setCameraLensFacing(CameraX.LensFacing) **/
    public void setCameraLensFacing(@Nullable CameraX.LensFacing lensFacing) {
        cameraView.setCameraLensFacing(lensFacing);
    }

    /** @see CameraView#getCameraLensFacing() **/
    @Nullable
    public CameraX.LensFacing getCameraLensFacing() {
        return cameraView.getCameraLensFacing();
    }

    /** @see CameraView#focus(Rect, Rect) **/
    public void focus(Rect focus, Rect metering) {
        cameraView.focus(focus, metering);
    }

    /** @see CameraView#getFlash() **/
    public FlashMode getFlash() {
        return cameraView.getFlash();
    }

    /** @see CameraView#setFlash(FlashMode) **/
    public void setFlash(FlashMode flashMode) {
        cameraView.setFlash(flashMode);
    }

    /** @see CameraView#isPinchToZoomEnabled() **/
    public boolean isPinchToZoomEnabled() {
        return cameraView.isPinchToZoomEnabled();
    }

    /** @see CameraView#setPinchToZoomEnabled(boolean) **/
    public void setPinchToZoomEnabled(boolean enabled) {
        cameraView.setPinchToZoomEnabled(enabled);
    }

    /** @see CameraView#getZoomLevel() **/
    public float getZoomLevel() {
        return cameraView.getZoomLevel();
    }

    /** @see CameraView#setZoomLevel(float) **/
    public void setZoomLevel(float zoomLevel) {
        cameraView.setZoomLevel(zoomLevel);
    }

    /** @see CameraView#getMinZoomLevel() **/
    public float getMinZoomLevel() {
        return cameraView.getMinZoomLevel();
    }

    /** @see CameraView#getMaxZoomLevel() **/
    public float getMaxZoomLevel() {
        return cameraView.getMaxZoomLevel();
    }

    /** @see CameraView#isZoomSupported() **/
    public boolean isZoomSupported() {
        return cameraView.isZoomSupported();
    }

    /** @see CameraView#enableTorch(boolean) **/
    public void enableTorch(boolean torch) {
        cameraView.enableTorch(torch);
    }

    /** @see CameraView#isTorchOn() **/
    public boolean isTorchOn() {
        return cameraView.isTorchOn();
    }

    // CAMERA VIEW METHODS END

    // VIEW GETTERS START

    public CameraView getCameraView() {
        return cameraView;
    }

    // VIEW GETTERS END
}
