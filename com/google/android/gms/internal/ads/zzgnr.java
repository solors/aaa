package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgnr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgnr(zzgnn zzgnnVar, zzgnq zzgnqVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgnnVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgnnVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgnnVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgnnVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzb.containsKey(zzgnoVar)) {
            return ((zzgld) this.zzb.get(zzgnoVar)).zza(zzgnmVar, zzgeoVar);
        }
        String obj = zzgnoVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgek zzb(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzd.containsKey(zzgnoVar)) {
            return ((zzgmp) this.zzd.get(zzgnoVar)).zza(zzgnmVar);
        }
        String obj = zzgnoVar.toString();
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
    }

    public final zzgnm zzc(zzgdx zzgdxVar, Class cls, zzgeo zzgeoVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgnpVar)) {
            return ((zzglh) this.zza.get(zzgnpVar)).zza(zzgdxVar, zzgeoVar);
        }
        String obj = zzgnpVar.toString();
        throw new GeneralSecurityException("No Key serializer for " + obj + " available");
    }

    public final zzgnm zzd(zzgek zzgekVar, Class cls) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgekVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgnpVar)) {
            return ((zzgmt) this.zzc.get(zzgnpVar)).zza(zzgekVar);
        }
        String obj = zzgnpVar.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean zzi(zzgnm zzgnmVar) {
        return this.zzb.containsKey(new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }

    public final boolean zzj(zzgnm zzgnmVar) {
        return this.zzd.containsKey(new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }
}
