package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.h
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            return DebugViewProvider.m104671a(i, i2);
        }
    };

    /* renamed from: a */
    static /* synthetic */ SurfaceView m104671a(int i, int i2) {
        return lambda$static$0(i, i2);
    }

    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
