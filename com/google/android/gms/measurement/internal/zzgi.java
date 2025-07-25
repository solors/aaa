package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
final class zzgi {
    private final zzim zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzim zzimVar) {
        this.zza = zzimVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgi zza(String str) {
        zzim zzimVar;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            zzimVar = zzin.zza(str.charAt(0));
        } else {
            zzimVar = zzim.UNINITIALIZED;
        }
        return new zzgi(zzimVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return String.valueOf(zzin.zza(this.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzim zza() {
        return this.zza;
    }
}
