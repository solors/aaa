package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfkq {
    private final zzflb zza;
    private final zzflb zzb;
    private final boolean zzc;
    private final zzfku zzd;
    private final zzfkx zze;

    private zzfkq(zzfku zzfkuVar, zzfkx zzfkxVar, zzflb zzflbVar, zzflb zzflbVar2, boolean z) {
        this.zzd = zzfkuVar;
        this.zze = zzfkxVar;
        this.zza = zzflbVar;
        if (zzflbVar2 == null) {
            this.zzb = zzflb.NONE;
        } else {
            this.zzb = zzflbVar2;
        }
        this.zzc = z;
    }

    public static zzfkq zza(zzfku zzfkuVar, zzfkx zzfkxVar, zzflb zzflbVar, zzflb zzflbVar2, boolean z) {
        zzfmk.zzc(zzfkuVar, "CreativeType is null");
        zzfmk.zzc(zzfkxVar, "ImpressionType is null");
        zzfmk.zzc(zzflbVar, "Impression owner is null");
        if (zzflbVar != zzflb.NONE) {
            if (zzfkuVar == zzfku.DEFINED_BY_JAVASCRIPT && zzflbVar == zzflb.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfkxVar == zzfkx.DEFINED_BY_JAVASCRIPT && zzflbVar == zzflb.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfkq(zzfkuVar, zzfkxVar, zzflbVar, zzflbVar2, z);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfmg.zze(jSONObject, "impressionOwner", this.zza);
        zzfmg.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfmg.zze(jSONObject, "creativeType", this.zzd);
        zzfmg.zze(jSONObject, "impressionType", this.zze);
        zzfmg.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
