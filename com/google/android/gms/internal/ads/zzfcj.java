package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfcj {
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzga zza;
    @Nullable
    public final zzblz zzb;
    @Nullable
    public final zzekn zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    @Nullable
    public final zzbfl zzi;
    public final com.google.android.gms.ads.internal.client.zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcm zzn;
    public final zzfbw zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcq zzt;

    public /* synthetic */ zzfcj(zzfch zzfchVar, zzfci zzfciVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar;
        zzbfl zzl;
        this.zze = zzfch.zzg(zzfchVar);
        this.zzf = zzfch.zzK(zzfchVar);
        this.zzt = zzfch.zzU(zzfchVar);
        int i = zzfch.zze(zzfchVar).zza;
        long j = zzfch.zze(zzfchVar).zzb;
        Bundle bundle = zzfch.zze(zzfchVar).zzc;
        int i2 = zzfch.zze(zzfchVar).zzd;
        List list = zzfch.zze(zzfchVar).zze;
        boolean z = zzfch.zze(zzfchVar).zzf;
        int i3 = zzfch.zze(zzfchVar).zzg;
        boolean z2 = true;
        if (!zzfch.zze(zzfchVar).zzh && !zzfch.zzR(zzfchVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfch.zze(zzfchVar).zzi, zzfch.zze(zzfchVar).zzj, zzfch.zze(zzfchVar).zzk, zzfch.zze(zzfchVar).zzl, zzfch.zze(zzfchVar).zzm, zzfch.zze(zzfchVar).zzn, zzfch.zze(zzfchVar).zzo, zzfch.zze(zzfchVar).zzp, zzfch.zze(zzfchVar).zzq, zzfch.zze(zzfchVar).zzr, zzfch.zze(zzfchVar).zzs, zzfch.zze(zzfchVar).zzt, zzfch.zze(zzfchVar).zzu, zzfch.zze(zzfchVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfch.zze(zzfchVar).zzw), zzfch.zze(zzfchVar).zzx, zzfch.zze(zzfchVar).zzy, zzfch.zze(zzfchVar).zzz);
        if (zzfch.zzk(zzfchVar) != null) {
            zzgaVar = zzfch.zzk(zzfchVar);
        } else if (zzfch.zzl(zzfchVar) != null) {
            zzgaVar = zzfch.zzl(zzfchVar).zzf;
        } else {
            zzgaVar = null;
        }
        this.zza = zzgaVar;
        this.zzg = zzfch.zzM(zzfchVar);
        this.zzh = zzfch.zzN(zzfchVar);
        if (zzfch.zzM(zzfchVar) == null) {
            zzl = null;
        } else if (zzfch.zzl(zzfchVar) == null) {
            zzl = new zzbfl(new NativeAdOptions.Builder().build());
        } else {
            zzl = zzfch.zzl(zzfchVar);
        }
        this.zzi = zzl;
        this.zzj = zzfch.zzi(zzfchVar);
        this.zzk = zzfch.zza(zzfchVar);
        this.zzl = zzfch.zzc(zzfchVar);
        this.zzm = zzfch.zzd(zzfchVar);
        this.zzn = zzfch.zzj(zzfchVar);
        this.zzb = zzfch.zzm(zzfchVar);
        this.zzo = new zzfbw(zzfch.zzo(zzfchVar), null);
        this.zzp = zzfch.zzO(zzfchVar);
        this.zzq = zzfch.zzP(zzfchVar);
        this.zzc = zzfch.zzn(zzfchVar);
        this.zzr = zzfch.zzQ(zzfchVar);
        this.zzs = zzfch.zzb(zzfchVar);
    }

    @Nullable
    public final zzbhn zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        zzbcc zzbccVar = zzbcl.zzdn;
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar));
    }
}
