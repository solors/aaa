package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbos implements zzgbo {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbos(ListenableFuture listenableFuture, String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgch.zzn(this.zzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzboq
            {
                zzbos.this = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj2) {
                return zzbos.this.zzc(obj, (zzbnt) obj2);
            }
        }, zzbzw.zzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Object obj, zzbnt zzbntVar) throws Exception {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzbjo.zzo.zzc(uuid, new zzbor(this, zzcabVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbntVar.zzl(this.zza, jSONObject);
        return zzcabVar;
    }
}
