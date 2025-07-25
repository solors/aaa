package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(30)
/* loaded from: classes5.dex */
final class zzaam {
    public static void zza(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            zzdo.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
