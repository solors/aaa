package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcix implements zzdtg {
    private final zzcih zza;
    private Context zzb;
    private zzbko zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcix(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final /* bridge */ /* synthetic */ zzdtg zza(zzbko zzbkoVar) {
        zzbkoVar.getClass();
        this.zzc = zzbkoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final /* bridge */ /* synthetic */ zzdtg zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final zzdth zzc() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, zzbko.class);
        return new zzciy(this.zza, this.zzb, this.zzc, null);
    }
}
