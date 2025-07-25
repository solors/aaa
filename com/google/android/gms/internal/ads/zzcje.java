package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcje implements zzfbh {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcje(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* synthetic */ zzfbh zza(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final /* bridge */ /* synthetic */ zzfbh zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbh
    public final zzfbi zzc() {
        zzhez.zzc(this.zzb, Context.class);
        return new zzcjf(this.zza, this.zzb, this.zzc, null);
    }
}
