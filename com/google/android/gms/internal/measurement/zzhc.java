package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzhc extends zzgz<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(zzhh zzhhVar, String str, Boolean bool, boolean z) {
        super(zzhhVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzgz
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfy.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfy.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb + ": " + valueOf);
        return null;
    }
}
