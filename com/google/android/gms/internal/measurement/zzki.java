package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzki implements zzkq {
    private zzkq[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zzkq... zzkqVarArr) {
        this.zza = zzkqVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final zzkr zza(Class<?> cls) {
        zzkq[] zzkqVarArr;
        for (zzkq zzkqVar : this.zza) {
            if (zzkqVar.zzb(cls)) {
                return zzkqVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final boolean zzb(Class<?> cls) {
        for (zzkq zzkqVar : this.zza) {
            if (zzkqVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
