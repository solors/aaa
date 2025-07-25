package com.yandex.mobile.ads.impl;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class vs0 extends ks0 {
    public vs0(IllegalStateException illegalStateException, @Nullable ls0 ls0Var, @Nullable Surface surface) {
        super(illegalStateException, ls0Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
