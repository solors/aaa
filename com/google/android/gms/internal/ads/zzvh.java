package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzvh implements zzvy {
    final /* synthetic */ zzvk zza;
    private final int zzb;

    public zzvh(zzvk zzvkVar, int i) {
        this.zza = zzvkVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzkeVar, zzhh zzhhVar, int i) {
        return this.zza.zzg(this.zzb, zzkeVar, zzhhVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
