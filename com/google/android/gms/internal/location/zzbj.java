package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbj {
    public static Looper zza(@Nullable Looper looper) {
        if (looper != null) {
            return looper;
        }
        return zzb();
    }

    public static Looper zzb() {
        boolean z;
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
