package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzchs implements zzher {
    private final zzcha zza;

    public zzchs(zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static VersionInfoParcel zzc(zzcha zzchaVar) {
        VersionInfoParcel zze = zzchaVar.zze();
        zzhez.zzb(zze);
        return zze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
