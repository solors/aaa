package com.google.android.exoplayer2.util;

import android.view.SurfaceView;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: com.google.android.exoplayer2.util.a
        @Override // com.google.android.exoplayer2.util.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            return DebugViewProvider.m72658a(i, i2);
        }
    };

    /* renamed from: a */
    static /* synthetic */ SurfaceView m72658a(int i, int i2) {
        return lambda$static$0(i, i2);
    }

    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
