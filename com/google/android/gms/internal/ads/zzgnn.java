package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgnn {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgnn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgnn zza(zzgld zzgldVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgldVar.zzd(), zzgldVar.zzc(), null);
        if (this.zzb.containsKey(zzgnoVar)) {
            zzgld zzgldVar2 = (zzgld) this.zzb.get(zzgnoVar);
            if (!zzgldVar2.equals(zzgldVar) || !zzgldVar.equals(zzgldVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
            }
        } else {
            this.zzb.put(zzgnoVar, zzgldVar);
        }
        return this;
    }

    public final zzgnn zzb(zzglh zzglhVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzglhVar.zzc(), zzglhVar.zzd(), null);
        if (this.zza.containsKey(zzgnpVar)) {
            zzglh zzglhVar2 = (zzglh) this.zza.get(zzgnpVar);
            if (!zzglhVar2.equals(zzglhVar) || !zzglhVar.equals(zzglhVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
            }
        } else {
            this.zza.put(zzgnpVar, zzglhVar);
        }
        return this;
    }

    public final zzgnn zzc(zzgmp zzgmpVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgmpVar.zzd(), zzgmpVar.zzc(), null);
        if (this.zzd.containsKey(zzgnoVar)) {
            zzgmp zzgmpVar2 = (zzgmp) this.zzd.get(zzgnoVar);
            if (!zzgmpVar2.equals(zzgmpVar) || !zzgmpVar.equals(zzgmpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgnoVar.toString()));
            }
        } else {
            this.zzd.put(zzgnoVar, zzgmpVar);
        }
        return this;
    }

    public final zzgnn zzd(zzgmt zzgmtVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgmtVar.zzc(), zzgmtVar.zzd(), null);
        if (this.zzc.containsKey(zzgnpVar)) {
            zzgmt zzgmtVar2 = (zzgmt) this.zzc.get(zzgnpVar);
            if (!zzgmtVar2.equals(zzgmtVar) || !zzgmtVar.equals(zzgmtVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnpVar.toString()));
            }
        } else {
            this.zzc.put(zzgnpVar, zzgmtVar);
        }
        return this;
    }

    public zzgnn(zzgnr zzgnrVar) {
        this.zza = new HashMap(zzgnr.zzf(zzgnrVar));
        this.zzb = new HashMap(zzgnr.zze(zzgnrVar));
        this.zzc = new HashMap(zzgnr.zzh(zzgnrVar));
        this.zzd = new HashMap(zzgnr.zzg(zzgnrVar));
    }
}
