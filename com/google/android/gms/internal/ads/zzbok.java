package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbok implements zzbnw {
    private final zzbny zza;
    private final zzbnz zzb;
    private final zzbns zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbok(zzbns zzbnsVar, String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        this.zzc = zzbnsVar;
        this.zzd = str;
        this.zzb = zzbnzVar;
        this.zza = zzbnyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzbok zzbokVar, zzbnm zzbnmVar, zzbnt zzbntVar, Object obj, zzcab zzcabVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            String uuid = UUID.randomUUID().toString();
            zzbjo.zzo.zzc(uuid, new zzboj(zzbokVar, zzbnmVar, zzcabVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbokVar.zzb.zzb(obj));
            zzbntVar.zzl(zzbokVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcabVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbnmVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final ListenableFuture zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final ListenableFuture zzb(Object obj) {
        zzcab zzcabVar = new zzcab();
        zzbnm zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzboh(this, zzb, obj, zzcabVar), new zzboi(this, zzcabVar, zzb));
        return zzcabVar;
    }
}
