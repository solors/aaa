package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfvg implements Serializable, zzfvf {
    final zzfvf zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfvm zzd = new zzfvm();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvg(zzfvf zzfvfVar) {
        this.zza = zzfvfVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
