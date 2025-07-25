package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcjc implements zzezt {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjc(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final /* bridge */ /* synthetic */ zzezt zza(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzsVar.getClass();
        this.zzd = zzsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final /* bridge */ /* synthetic */ zzezt zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final /* bridge */ /* synthetic */ zzezt zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezt
    public final zzezu zzd() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        zzhez.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzs.class);
        return new zzcjd(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
