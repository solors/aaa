package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfvi implements zzfvf {
    private static final zzfvf zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfvh
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfvm zzb = new zzfvm();
    private volatile zzfvf zzc;
    private Object zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvi(zzfvf zzfvfVar) {
        this.zzc = zzfvfVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzd) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        zzfvf zzfvfVar = this.zzc;
        zzfvf zzfvfVar2 = zza;
        if (zzfvfVar != zzfvfVar2) {
            synchronized (this.zzb) {
                if (this.zzc != zzfvfVar2) {
                    Object zza2 = this.zzc.zza();
                    this.zzd = zza2;
                    this.zzc = zzfvfVar2;
                    return zza2;
                }
            }
        }
        return this.zzd;
    }
}
