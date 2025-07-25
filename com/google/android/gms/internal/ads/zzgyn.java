package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzgyn {
    protected volatile zzgzc zza;
    private volatile zzgwj zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyn)) {
            return false;
        }
        zzgyn zzgynVar = (zzgyn) obj;
        zzgzc zzgzcVar = this.zza;
        zzgzc zzgzcVar2 = zzgynVar.zza;
        if (zzgzcVar == null && zzgzcVar2 == null) {
            return zzb().equals(zzgynVar.zzb());
        }
        if (zzgzcVar != null && zzgzcVar2 != null) {
            return zzgzcVar.equals(zzgzcVar2);
        }
        if (zzgzcVar != null) {
            zzgynVar.zzd(zzgzcVar.zzbt());
            return zzgzcVar.equals(zzgynVar.zza);
        }
        zzd(zzgzcVar2.zzbt());
        return this.zza.equals(zzgzcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgwg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgwj zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzgwj.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            return this.zzb;
        }
    }

    public final zzgzc zzc(zzgzc zzgzcVar) {
        zzgzc zzgzcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzgzcVar;
        return zzgzcVar2;
    }

    protected final void zzd(zzgzc zzgzcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgzcVar;
                this.zzb = zzgwj.zzb;
            } catch (zzgyg unused) {
                this.zza = zzgzcVar;
                this.zzb = zzgwj.zzb;
            }
        }
    }
}
