package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class zzbcr {
    public static final void zza(zzbcq zzbcqVar, @Nullable zzbco zzbcoVar) {
        if (zzbcoVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbcoVar.zzb())) {
                zzbcqVar.zzd(zzbcoVar.zza(), zzbcoVar.zzb(), zzbcoVar.zzc(), zzbcoVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
