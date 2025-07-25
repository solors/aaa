package com.smaato.sdk.video.vast.widget;

import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface VastSurfaceHolder {

    /* loaded from: classes7.dex */
    public interface OnSurfaceAvailableListener {
        void onSurfaceAvailable(@NonNull Surface surface, int i, int i2);
    }

    /* loaded from: classes7.dex */
    public interface OnSurfaceChangedListener {
        void onSurfaceChanged(@NonNull Surface surface, int i, int i2);
    }

    /* loaded from: classes7.dex */
    public interface OnSurfaceDestroyedListener {
        void onSurfaceDestroyed(@NonNull Surface surface);
    }

    @Nullable
    Surface getSurface();

    @NonNull
    View getView();

    void setOnSurfaceAvailableListener(@Nullable OnSurfaceAvailableListener onSurfaceAvailableListener);

    void setOnSurfaceChangedListener(@Nullable OnSurfaceChangedListener onSurfaceChangedListener);

    void setOnSurfaceDestroyedListener(@Nullable OnSurfaceDestroyedListener onSurfaceDestroyedListener);
}
