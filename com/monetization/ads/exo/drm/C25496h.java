package com.monetization.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: com.monetization.ads.exo.drm.h */
/* loaded from: classes7.dex */
final class C25496h {
    @DoNotInline
    /* renamed from: a */
    public static boolean m44422a(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m44421b(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
