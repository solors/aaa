package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcil implements zzewo {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcil(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final /* bridge */ /* synthetic */ zzewo zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final /* bridge */ /* synthetic */ zzewo zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewo
    public final zzewp zzc() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        return new zzcim(this.zza, this.zzb, this.zzc, null);
    }
}
