package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbnu implements zzbmm, zzbnt {
    private final zzbnt zza;
    private final HashSet zzb = new HashSet();

    public zzbnu(zzbnt zzbntVar) {
        this.zza = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbml.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjp) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbml.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmk
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbml.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbml.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzq(String str, zzbjp zzbjpVar) {
        this.zza.zzq(str, zzbjpVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzr(String str, zzbjp zzbjpVar) {
        this.zza.zzr(str, zzbjpVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjpVar));
    }
}
