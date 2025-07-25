package io.bidmachine.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: io.bidmachine.media3.common.f
        @Override // io.bidmachine.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            return DebugViewProvider.m20049a(i, i2);
        }
    };

    /* renamed from: a */
    static /* synthetic */ SurfaceView m20049a(int i, int i2) {
        return lambda$static$0(i, i2);
    }

    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
