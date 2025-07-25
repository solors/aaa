package com.monetization.ads.exo.drm;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: com.monetization.ads.exo.drm.j */
/* loaded from: classes7.dex */
final class C25500j {
    @DoNotInline
    /* renamed from: a */
    public static boolean m44418a(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
