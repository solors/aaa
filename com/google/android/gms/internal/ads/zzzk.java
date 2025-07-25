package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzzk extends zzsf {
    public zzzk(Throwable th, @Nullable zzsg zzsgVar, @Nullable Surface surface) {
        super(th, zzsgVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
