package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzclj implements zzcla {
    private final zzecu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclj(zzecu zzecuVar) {
        this.zza = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        zzgby zzgbyVar = (zzgby) zzgch.zzf(zzgby.zzu(this.zza.zza(true)), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcli
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkn)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgch.zzh(new GetTopicsResponse(zzfxn.zzn()));
            }
        }, zzbzw.zza);
    }
}
