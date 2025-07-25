package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfch {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzs zzb;
    private String zzc;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    @Nullable
    private zzbfl zzh;
    private com.google.android.gms.ads.internal.client.zzy zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzcm zzl;
    @Nullable
    private zzblz zzn;
    @Nullable
    private zzekn zzr;
    private Bundle zzt;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzcq zzu;
    private int zzm = 1;
    private final zzfbu zzo = new zzfbu();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public static /* bridge */ /* synthetic */ String zzK(zzfch zzfchVar) {
        return zzfchVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzfch zzfchVar) {
        return zzfchVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzfch zzfchVar) {
        return zzfchVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzfch zzfchVar) {
        return zzfchVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzfch zzfchVar) {
        return zzfchVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzfch zzfchVar) {
        return zzfchVar.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzfch zzfchVar) {
        return zzfchVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcq zzU(zzfch zzfchVar) {
        return zzfchVar.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfch zzfchVar) {
        return zzfchVar.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzfch zzfchVar) {
        return zzfchVar.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzfch zzfchVar) {
        return zzfchVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzfch zzfchVar) {
        return zzfchVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzm zze(zzfch zzfchVar) {
        return zzfchVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzg(zzfch zzfchVar) {
        return zzfchVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzy zzi(zzfch zzfchVar) {
        return zzfchVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcm zzj(zzfch zzfchVar) {
        return zzfchVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzk(zzfch zzfchVar) {
        return zzfchVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbfl zzl(zzfch zzfchVar) {
        return zzfchVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzblz zzm(zzfch zzfchVar) {
        return zzfchVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzekn zzn(zzfch zzfchVar) {
        return zzfchVar.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfbu zzo(zzfch zzfchVar) {
        return zzfchVar.zzo;
    }

    public final zzfch zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfch zzB(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfch zzC(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfch zzD(@Nullable zzbfl zzbflVar) {
        this.zzh = zzbflVar;
        return this;
    }

    public final zzfch zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfch zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfch zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfch zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzfch zzI(@Nullable com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfcj zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcj(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfch zzV(@Nullable com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzu = zzcqVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzs zzh() {
        return this.zzb;
    }

    public final zzfbu zzp() {
        return this.zzo;
    }

    public final zzfch zzq(zzfcj zzfcjVar) {
        this.zzo.zza(zzfcjVar.zzo.zza);
        this.zza = zzfcjVar.zzd;
        this.zzb = zzfcjVar.zze;
        this.zzu = zzfcjVar.zzt;
        this.zzc = zzfcjVar.zzf;
        this.zzd = zzfcjVar.zza;
        this.zzf = zzfcjVar.zzg;
        this.zzg = zzfcjVar.zzh;
        this.zzh = zzfcjVar.zzi;
        this.zzi = zzfcjVar.zzj;
        zzr(zzfcjVar.zzl);
        zzG(zzfcjVar.zzm);
        this.zzp = zzfcjVar.zzp;
        this.zzq = zzfcjVar.zzq;
        this.zzr = zzfcjVar.zzc;
        this.zzs = zzfcjVar.zzr;
        this.zzt = zzfcjVar.zzs;
        return this;
    }

    public final zzfch zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfch zzs(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb = zzsVar;
        return this;
    }

    public final zzfch zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfch zzu(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi = zzyVar;
        return this;
    }

    public final zzfch zzv(@Nullable zzekn zzeknVar) {
        this.zzr = zzeknVar;
        return this;
    }

    public final zzfch zzw(@Nullable zzblz zzblzVar) {
        this.zzn = zzblzVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzfch zzx(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfch zzy(boolean z) {
        this.zzq = z;
        return this;
    }

    public final zzfch zzz(boolean z) {
        this.zzs = true;
        return this;
    }
}
