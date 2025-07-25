package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgyt implements zzgza {
    private final zzgza[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyt(zzgza... zzgzaVarArr) {
        this.zza = zzgzaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final zzgyz zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgza zzgzaVar = this.zza[i];
            if (zzgzaVar.zzc(cls)) {
                return zzgzaVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
