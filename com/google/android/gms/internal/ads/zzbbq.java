package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbq {

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzbbq$1 */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C162841 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzgxq.values().length];
            zza = iArr;
            try {
                iArr[zzgxq.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzgxq.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzgxq.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzgxq.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzgxq.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzgxq.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzgxq.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zza extends zzgxr<zza, zzb> implements zzf {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private static final zza zzl;
        private static volatile zzgzk<zza> zzm;
        private zzx zzA;
        private zzz zzB;
        private int zzn;
        private int zzo;
        private zzg zzu;
        private zzi zzv;
        private zzk zzx;
        private zzah zzy;
        private zzac zzz;
        private int zzp = 1000;
        private zzgyd<zzd> zzw = zzgxr.zzbK();
        private zzgyd<zzat> zzC = zzgxr.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbbq$zza$zza */
        /* loaded from: classes5.dex */
        public enum EnumC45351zza implements zzgxv {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);
            
            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzgxw<EnumC45351zza> zzy = new zzgxw<EnumC45351zza>() { // from class: com.google.android.gms.internal.ads.zzbbq.zza.zza.1
                /* renamed from: zza */
                public EnumC45351zza zzb(int i) {
                    return EnumC45351zza.zzb(i);
                }
            };
            private final int zzA;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbq$zza$zza$zza */
            /* loaded from: classes5.dex */
            public final class C45352zza implements zzgxx {
                static final zzgxx zza = new C45352zza();

                private C45352zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (EnumC45351zza.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumC45351zza(int i) {
                this.zzA = i;
            }

            public static EnumC45351zza zzb(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzgxw<EnumC45351zza> zzd() {
                return zzy;
            }

            public static zzgxx zze() {
                return C45352zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzA;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zzb extends zzgxl<zza, zzb> implements zzf {
            public zzb zzA(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcu(zzacVar);
                return this;
            }

            public zzb zzB(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcv(zzgVar);
                return this;
            }

            public zzb zzC(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcw(zziVar);
                return this;
            }

            public zzb zzD(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcx(zzahVar);
                return this;
            }

            public zzb zzE(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcy(zzkVar);
                return this;
            }

            public zzb zzF(int i) {
                zzbu();
                ((zza) this.zza).zzcz(i);
                return this;
            }

            public zzb zzG(int i) {
                zzbu();
                ((zza) this.zza).zzcA(i);
                return this;
            }

            public zzb zzH(EnumC45351zza enumC45351zza) {
                zzbu();
                ((zza) this.zza).zzcB(enumC45351zza);
                return this;
            }

            public zzb zzI(zzx.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzaVar.zzbr());
                return this;
            }

            public zzb zzJ(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzxVar);
                return this;
            }

            public zzb zzK(zzq zzqVar) {
                zzbu();
                ((zza) this.zza).zzcD(zzqVar);
                return this;
            }

            public zzb zzL(zzz.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zzb zzM(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzzVar);
                return this;
            }

            public zzb zzN(zzac.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zzb zzO(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzacVar);
                return this;
            }

            public zzb zzP(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzcG(i, zzbVar.zzbr());
                return this;
            }

            public zzb zzQ(int i, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzcG(i, zzdVar);
                return this;
            }

            public zzb zzR(zzg.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zzb zzS(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzgVar);
                return this;
            }

            public zzb zzT(zzi.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zzb zzU(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcI(zziVar);
                return this;
            }

            public zzb zzV(zzah.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzW(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzahVar);
                return this;
            }

            public zzb zzX(zzk.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zzb zzY(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzkVar);
                return this;
            }

            public zzb zzZ(int i, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcL(i, zzaVar.zzbr());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public int zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(int i, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzcL(i, zzatVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzd zzab(int i) {
                return ((zza) this.zza).zzab(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzg zzac() {
                return ((zza) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzi zzad() {
                return ((zza) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzk zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzq zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzx zzag() {
                return ((zza) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzz zzah() {
                return ((zza) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzac zzai() {
                return ((zza) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzah zzaj() {
                return ((zza) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public zzat zzak(int i) {
                return ((zza) this.zza).zzak(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public List<zzd> zzal() {
                return Collections.unmodifiableList(((zza) this.zza).zzal());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public List<zzat> zzam() {
                return Collections.unmodifiableList(((zza) this.zza).zzam());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzan() {
                return ((zza) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzao() {
                return ((zza) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzap() {
                return ((zza) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzaq() {
                return ((zza) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzar() {
                return ((zza) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzas() {
                return ((zza) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzat() {
                return ((zza) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzau() {
                return ((zza) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public boolean zzav() {
                return ((zza) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public int zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzf
            public EnumC45351zza zzc() {
                return ((zza) this.zza).zzc();
            }

            public zzb zzd(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zza) this.zza).zzaF(iterable);
                return this;
            }

            public zzb zze(Iterable<? extends zzat> iterable) {
                zzbu();
                ((zza) this.zza).zzaG(iterable);
                return this;
            }

            public zzb zzf(zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzbVar.zzbr());
                return this;
            }

            public zzb zzg(zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzdVar);
                return this;
            }

            public zzb zzh(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaI(i, zzbVar.zzbr());
                return this;
            }

            public zzb zzi(int i, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaI(i, zzdVar);
                return this;
            }

            public zzb zzj(zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzk(zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzatVar);
                return this;
            }

            public zzb zzl(int i, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaK(i, zzaVar.zzbr());
                return this;
            }

            public zzb zzm(int i, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaK(i, zzatVar);
                return this;
            }

            public zzb zzn() {
                zzbu();
                ((zza) this.zza).zzcf();
                return this;
            }

            public zzb zzo() {
                zzbu();
                ((zza) this.zza).zzcg();
                return this;
            }

            public zzb zzp() {
                zzbu();
                ((zza) this.zza).zzch();
                return this;
            }

            public zzb zzq() {
                zzbu();
                ((zza) this.zza).zzci();
                return this;
            }

            public zzb zzr() {
                zzbu();
                ((zza) this.zza).zzcj();
                return this;
            }

            public zzb zzs() {
                zzbu();
                ((zza) this.zza).zzck();
                return this;
            }

            public zzb zzt() {
                zzbu();
                ((zza) this.zza).zzcl();
                return this;
            }

            public zzb zzu() {
                zzbu();
                ((zza) this.zza).zzcm();
                return this;
            }

            public zzb zzv() {
                zzbu();
                ((zza) this.zza).zzcn();
                return this;
            }

            public zzb zzw() {
                zzbu();
                ((zza) this.zza).zzco();
                return this;
            }

            public zzb zzx() {
                zzbu();
                ((zza) this.zza).zzcp();
                return this;
            }

            public zzb zzy(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcs(zzxVar);
                return this;
            }

            public zzb zzz(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzct(zzzVar);
                return this;
            }

            private zzb() {
                super(zza.zzl);
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzgxr.zzbZ(zza.class, zzaVar);
        }

        private zza() {
        }

        public void zzaF(Iterable<? extends zzd> iterable) {
            zzcq();
            zzgvs.zzaQ(iterable, this.zzw);
        }

        public void zzaG(Iterable<? extends zzat> iterable) {
            zzcr();
            zzgvs.zzaQ(iterable, this.zzC);
        }

        public void zzaH(zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(zzdVar);
        }

        public void zzaI(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(i, zzdVar);
        }

        public void zzaJ(zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(zzatVar);
        }

        public void zzaK(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(i, zzatVar);
        }

        public void zzcA(int i) {
            zzcr();
            this.zzC.remove(i);
        }

        public void zzcB(EnumC45351zza enumC45351zza) {
            this.zzo = enumC45351zza.zza();
            this.zzn |= 1;
        }

        public void zzcC(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        public void zzcD(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        public void zzcE(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        public void zzcF(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        public void zzcG(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.set(i, zzdVar);
        }

        public void zzcH(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        public void zzcI(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        public void zzcJ(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        public void zzcK(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        public void zzcL(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.set(i, zzatVar);
        }

        public void zzcf() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        public void zzcg() {
            this.zzA = null;
            this.zzn &= -129;
        }

        public void zzch() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        public void zzci() {
            this.zzB = null;
            this.zzn &= -257;
        }

        public void zzcj() {
            this.zzz = null;
            this.zzn &= -65;
        }

        public void zzck() {
            this.zzw = zzgxr.zzbK();
        }

        public void zzcl() {
            this.zzu = null;
            this.zzn &= -5;
        }

        public void zzcm() {
            this.zzv = null;
            this.zzn &= -9;
        }

        public void zzcn() {
            this.zzy = null;
            this.zzn &= -33;
        }

        public void zzco() {
            this.zzx = null;
            this.zzn &= -17;
        }

        public void zzcp() {
            this.zzC = zzgxr.zzbK();
        }

        private void zzcq() {
            zzgyd<zzd> zzgydVar = this.zzw;
            if (!zzgydVar.zzc()) {
                this.zzw = zzgxr.zzbL(zzgydVar);
            }
        }

        private void zzcr() {
            zzgyd<zzat> zzgydVar = this.zzC;
            if (!zzgydVar.zzc()) {
                this.zzC = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzcs(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.zzh()) {
                zzx.zza zzf2 = zzx.zzf(zzxVar2);
                zzf2.zzbj(zzxVar);
                zzxVar = zzf2.zzbs();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        public void zzct(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.zzh()) {
                zzz.zza zzf2 = zzz.zzf(zzzVar2);
                zzf2.zzbj(zzzVar);
                zzzVar = zzf2.zzbs();
            }
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        public void zzcu(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.zzf()) {
                zzac.zza zzc2 = zzac.zzc(zzacVar2);
                zzc2.zzbj(zzacVar);
                zzacVar = zzc2.zzbs();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        public void zzcv(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.zzh()) {
                zzg.zza zzf2 = zzg.zzf(zzgVar2);
                zzf2.zzbj(zzgVar);
                zzgVar = zzf2.zzbs();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        public void zzcw(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.zzh()) {
                zzi.zza zzf2 = zzi.zzf(zziVar2);
                zzf2.zzbj(zziVar);
                zziVar = zzf2.zzbs();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        public void zzcx(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzy;
            if (zzahVar2 != null && zzahVar2 != zzah.zzn()) {
                zzah.zza zzl2 = zzah.zzl(zzahVar2);
                zzl2.zzbj(zzahVar);
                zzahVar = zzl2.zzbs();
            }
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        public void zzcy(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.zzh()) {
                zzk.zza zzf2 = zzk.zzf(zzkVar2);
                zzf2.zzbj(zzkVar);
                zzkVar = zzf2.zzbs();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        public void zzcz(int i) {
            zzcq();
            this.zzw.remove(i);
        }

        public static zzb zzd() {
            return zzl.zzaZ();
        }

        public static zzb zzf(zza zzaVar) {
            return zzl.zzba(zzaVar);
        }

        public static zza zzh() {
            return zzl;
        }

        public static zza zzi(InputStream inputStream) throws IOException {
            return (zza) zzgxr.zzbk(zzl, inputStream);
        }

        public static zza zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zza) zzgxr.zzbl(zzl, inputStream, zzgxbVar);
        }

        public static zza zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zza) zzgxr.zzbm(zzl, zzgwjVar);
        }

        public static zza zzl(zzgwp zzgwpVar) throws IOException {
            return (zza) zzgxr.zzbn(zzl, zzgwpVar);
        }

        public static zza zzm(InputStream inputStream) throws IOException {
            return (zza) zzgxr.zzbo(zzl, inputStream);
        }

        public static zza zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zza) zzgxr.zzbp(zzl, byteBuffer);
        }

        public static zza zzo(byte[] bArr) throws zzgyg {
            return (zza) zzgxr.zzbq(zzl, bArr);
        }

        public static zza zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zza) zzgxr.zzbr(zzl, zzgwjVar, zzgxbVar);
        }

        public static zza zzq(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zza) zzgxr.zzbs(zzl, zzgwpVar, zzgxbVar);
        }

        public static zza zzr(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zza) zzgxr.zzbu(zzl, inputStream, zzgxbVar);
        }

        public static zza zzs(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zza) zzgxr.zzbv(zzl, byteBuffer, zzgxbVar);
        }

        public static zza zzt(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zza) zzgxr.zzbx(zzl, bArr, zzgxbVar);
        }

        public static zzgzk<zza> zzw() {
            return zzl.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public int zza() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzd zzab(int i) {
            return this.zzw.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzg zzac() {
            zzg zzgVar = this.zzu;
            if (zzgVar == null) {
                return zzg.zzh();
            }
            return zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzi zzad() {
            zzi zziVar = this.zzv;
            if (zziVar == null) {
                return zzi.zzh();
            }
            return zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzk zzae() {
            zzk zzkVar = this.zzx;
            if (zzkVar == null) {
                return zzk.zzh();
            }
            return zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzq zzaf() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzx zzag() {
            zzx zzxVar = this.zzA;
            if (zzxVar == null) {
                return zzx.zzh();
            }
            return zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzz zzah() {
            zzz zzzVar = this.zzB;
            if (zzzVar == null) {
                return zzz.zzh();
            }
            return zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzac zzai() {
            zzac zzacVar = this.zzz;
            if (zzacVar == null) {
                return zzac.zzf();
            }
            return zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzah zzaj() {
            zzah zzahVar = this.zzy;
            if (zzahVar == null) {
                return zzah.zzn();
            }
            return zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public zzat zzak(int i) {
            return this.zzC.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public List<zzd> zzal() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public List<zzat> zzam() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzan() {
            if ((this.zzn & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzao() {
            if ((this.zzn & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzap() {
            if ((this.zzn & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzaq() {
            if ((this.zzn & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzar() {
            if ((this.zzn & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzas() {
            if ((this.zzn & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzat() {
            if ((this.zzn & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzau() {
            if ((this.zzn & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public boolean zzav() {
            if ((this.zzn & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzf
        public EnumC45351zza zzc() {
            EnumC45351zza zzb2 = EnumC45351zza.zzb(this.zzo);
            if (zzb2 == null) {
                return EnumC45351zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zza> zzgzkVar = zzm;
                                    if (zzgzkVar == null) {
                                        synchronized (zza.class) {
                                            zzgzkVar = zzm;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzl);
                                                zzm = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzl;
                        }
                        return new zzb();
                    }
                    return new zza();
                }
                return zzgxr.zzbQ(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC45351zza.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
            }
            return (byte) 1;
        }

        public zze zzu(int i) {
            return this.zzw.get(i);
        }

        public zzbi zzv(int i) {
            return this.zzC.get(i);
        }

        public List<? extends zze> zzx() {
            return this.zzw;
        }

        public List<? extends zzbi> zzy() {
            return this.zzC;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzaa extends zzgzd {
        boolean zzA();

        boolean zzB();

        int zza();

        zzq zzb();

        zzv zzc();

        zzan zzw(int i);

        zzap zzx();

        List<zzan> zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzab extends zzgxr<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzgzk<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzab, zza> implements zzae {
            public zza zza() {
                zzbu();
                ((zzab) this.zza).zzz();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzab) this.zza).zzA();
                return this;
            }

            public zza zzc(zzb zzbVar) {
                zzbu();
                ((zzab) this.zza).zzB(zzbVar);
                return this;
            }

            public zza zzd(zzc zzcVar) {
                zzbu();
                ((zzab) this.zza).zzC(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzae
            public zzb zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzae
            public zzc zzf() {
                return ((zzab) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzae
            public boolean zzg() {
                return ((zzab) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzae
            public boolean zzh() {
                return ((zzab) this.zza).zzh();
            }

            private zza() {
                super(zzab.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzb implements zzgxv {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzgxw<zzb> zzi = new zzgxw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzab.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzk;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzb.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.zzk = i;
            }

            public static zzb zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                return null;
                            }
                            return LTE;
                        }
                        return THREE_G;
                    }
                    return TWO_G;
                }
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }

            public static zzgxw<zzb> zzd() {
                return zzi;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzk;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzc implements zzgxv {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgxw<zzc> zzg = new zzgxw<zzc>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzab.zzc.1
                /* renamed from: zza */
                public zzc zzb(int i) {
                    return zzc.zzb(i);
                }
            };
            private final int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzc.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzc(int i) {
                this.zzi = i;
            }

            public static zzc zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return WIFI;
                    }
                    return CELL;
                }
                return NETWORKTYPE_UNSPECIFIED;
            }

            public static zzgxw<zzc> zzd() {
                return zzg;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzgxr.zzbZ(zzab.class, zzabVar);
        }

        private zzab() {
        }

        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzB(zzb zzbVar) {
            this.zzg = zzbVar.zza();
            this.zze |= 2;
        }

        public void zzC(zzc zzcVar) {
            this.zzf = zzcVar.zza();
            this.zze |= 1;
        }

        public static zza zza() {
            return zzc.zzaZ();
        }

        public static zza zzb(zzab zzabVar) {
            return zzc.zzba(zzabVar);
        }

        public static zzab zzd() {
            return zzc;
        }

        public static zzab zzi(InputStream inputStream) throws IOException {
            return (zzab) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzab zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzab) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzab zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzab) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzab zzl(zzgwp zzgwpVar) throws IOException {
            return (zzab) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzab zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzab) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzab zzo(byte[] bArr) throws zzgyg {
            return (zzab) zzgxr.zzbq(zzc, bArr);
        }

        public static zzab zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzab) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzab zzq(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzab) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzab zzr(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzab) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzab zzs(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzab) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzab zzt(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzab) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzab> zzu() {
            return zzc.zzbN();
        }

        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzab> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzab.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzab();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.zze(), "zzg", zzb.zze()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzae
        public zzb zze() {
            zzb zzb2 = zzb.zzb(this.zzg);
            if (zzb2 == null) {
                return zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzae
        public zzc zzf() {
            zzc zzb2 = zzc.zzb(this.zzf);
            if (zzb2 == null) {
                return zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzae
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzae
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzac extends zzgxr<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzgzk<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzac, zza> implements zzad {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzad
            public zzq zza() {
                return ((zzac) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzac) this.zza).zzB();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzac) this.zza).zzC();
                return this;
            }

            public zza zzd(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zze(zzap.zza zzaVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzg(zzq zzqVar) {
                zzbu();
                ((zzac) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzad
            public zzap zzh() {
                return ((zzac) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzad
            public boolean zzi() {
                return ((zzac) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzad
            public boolean zzj() {
                return ((zzac) this.zza).zzj();
            }

            private zza() {
                super(zzac.zzc);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzgxr.zzbZ(zzac.class, zzacVar);
        }

        private zzac() {
        }

        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzb() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzac zzacVar) {
            return zzc.zzba(zzacVar);
        }

        public static zzac zzf() {
            return zzc;
        }

        public static zzac zzg(InputStream inputStream) throws IOException {
            return (zzac) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzac zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzac) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzac zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzac) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzac zzm(zzgwp zzgwpVar) throws IOException {
            return (zzac) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzac zzn(InputStream inputStream) throws IOException {
            return (zzac) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzac zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzac) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzac zzp(byte[] bArr) throws zzgyg {
            return (zzac) zzgxr.zzbq(zzc, bArr);
        }

        public static zzac zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzac) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzac zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzac) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzac zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzac) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzac zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzac) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzac zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzac) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzac> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzad
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzac> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzac.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzac();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzad
        public zzap zzh() {
            zzap zzapVar = this.zzg;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzad
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzad
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzad extends zzgzd {
        zzq zza();

        zzap zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzae extends zzgzd {
        zzab.zzb zze();

        zzab.zzc zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzaf extends zzgxr<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzgzk<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzgyd<zza> zzl = zzgxr.zzbK();
        private String zzp = "";
        private String zzu = "";

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxr<zza, C45353zza> implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzgya<zzd.zza> zzn = new zzgya<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzgya
                /* renamed from: zza */
                public zzd.zza zzb(int i) {
                    zzd.zza zzb2 = zzd.zza.zzb(i);
                    if (zzb2 == null) {
                        return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    return zzb2;
                }
            };
            private static final zza zzo;
            private static volatile zzgzk<zza> zzp;
            private zzab zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private int zzF;
            private int zzG;
            private long zzH;
            private int zzu;
            private long zzv;
            private int zzw;
            private long zzx;
            private long zzy;
            private zzgxz zzz = zzgxr.zzbG();

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbq$zzaf$zza$zza */
            /* loaded from: classes5.dex */
            public final class C45353zza extends zzgxl<zza, C45353zza> implements zzb {
                public C45353zza zzA() {
                    zzbu();
                    ((zza) this.zza).zzaI();
                    return this;
                }

                public C45353zza zzB() {
                    zzbu();
                    ((zza) this.zza).zzaJ();
                    return this;
                }

                public C45353zza zzC(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcf(zzabVar);
                    return this;
                }

                public C45353zza zzD(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcg(zzqVar);
                    return this;
                }

                public C45353zza zzE(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzch(zzqVar);
                    return this;
                }

                public C45353zza zzF(int i, zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzci(i, zzaVar);
                    return this;
                }

                public C45353zza zzG(int i) {
                    zzbu();
                    ((zza) this.zza).zzcj(i);
                    return this;
                }

                public C45353zza zzH(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzck(zzdVar);
                    return this;
                }

                public C45353zza zzI(zzab.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcl(zzaVar.zzbr());
                    return this;
                }

                public C45353zza zzJ(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcl(zzabVar);
                    return this;
                }

                public C45353zza zzK(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzqVar);
                    return this;
                }

                public C45353zza zzL(long j) {
                    zzbu();
                    ((zza) this.zza).zzcn(j);
                    return this;
                }

                public C45353zza zzM(long j) {
                    zzbu();
                    ((zza) this.zza).zzco(j);
                    return this;
                }

                public C45353zza zzN(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcp(zzqVar);
                    return this;
                }

                public C45353zza zzO(long j) {
                    zzbu();
                    ((zza) this.zza).zzcq(j);
                    return this;
                }

                public C45353zza zzP(long j) {
                    zzbu();
                    ((zza) this.zza).zzcr(j);
                    return this;
                }

                public C45353zza zzQ(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcs(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzd zzR() {
                    return ((zza) this.zza).zzR();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public List<zzd.zza> zzS() {
                    return ((zza) this.zza).zzS();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzV() {
                    return ((zza) this.zza).zzV();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzW() {
                    return ((zza) this.zza).zzW();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzZ() {
                    return ((zza) this.zza).zzZ();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public int zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzaa() {
                    return ((zza) this.zza).zzaa();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzad() {
                    return ((zza) this.zza).zzad();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public boolean zzae() {
                    return ((zza) this.zza).zzae();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public int zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public long zzc() {
                    return ((zza) this.zza).zzc();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public long zzd() {
                    return ((zza) this.zza).zzd();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public long zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public long zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzd.zza zzg(int i) {
                    return ((zza) this.zza).zzg(i);
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzq zzh() {
                    return ((zza) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzq zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzq zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzq zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzq zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
                public zzab zzm() {
                    return ((zza) this.zza).zzm();
                }

                public C45353zza zzn(Iterable<? extends zzd.zza> iterable) {
                    zzbu();
                    ((zza) this.zza).zzav(iterable);
                    return this;
                }

                public C45353zza zzo(zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzaw(zzaVar);
                    return this;
                }

                public C45353zza zzp() {
                    zzbu();
                    ((zza) this.zza).zzax();
                    return this;
                }

                public C45353zza zzq() {
                    zzbu();
                    ((zza) this.zza).zzay();
                    return this;
                }

                public C45353zza zzr() {
                    zzbu();
                    ((zza) this.zza).zzaz();
                    return this;
                }

                public C45353zza zzs() {
                    zzbu();
                    ((zza) this.zza).zzaA();
                    return this;
                }

                public C45353zza zzt() {
                    zzbu();
                    ((zza) this.zza).zzaB();
                    return this;
                }

                public C45353zza zzu() {
                    zzbu();
                    ((zza) this.zza).zzaC();
                    return this;
                }

                public C45353zza zzv() {
                    zzbu();
                    ((zza) this.zza).zzaD();
                    return this;
                }

                public C45353zza zzw() {
                    zzbu();
                    ((zza) this.zza).zzaE();
                    return this;
                }

                public C45353zza zzx() {
                    zzbu();
                    ((zza) this.zza).zzaF();
                    return this;
                }

                public C45353zza zzy() {
                    zzbu();
                    ((zza) this.zza).zzaG();
                    return this;
                }

                public C45353zza zzz() {
                    zzbu();
                    ((zza) this.zza).zzaH();
                    return this;
                }

                private C45353zza() {
                    super(zza.zzo);
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzgxr.zzbZ(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbu(zzo, inputStream, zzgxbVar);
            }

            public static zza zzB(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbv(zzo, byteBuffer, zzgxbVar);
            }

            public static zza zzC(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbx(zzo, bArr, zzgxbVar);
            }

            public static zzgzk<zza> zzD() {
                return zzo.zzbN();
            }

            public void zzaA() {
                this.zzu &= -257;
                this.zzE = 0;
            }

            public void zzaB() {
                this.zzu &= -1025;
                this.zzG = 0;
            }

            public void zzaC() {
                this.zzA = null;
                this.zzu &= -17;
            }

            public void zzaD() {
                this.zzu &= -513;
                this.zzF = 0;
            }

            public void zzaE() {
                this.zzu &= -9;
                this.zzy = 0L;
            }

            public void zzaF() {
                this.zzu &= -5;
                this.zzx = 0L;
            }

            public void zzaG() {
                this.zzu &= -3;
                this.zzw = 0;
            }

            public void zzaH() {
                this.zzu &= -2;
                this.zzv = 0L;
            }

            public void zzaI() {
                this.zzu &= -2049;
                this.zzH = 0L;
            }

            public void zzaJ() {
                this.zzu &= -33;
                this.zzB = 0;
            }

            private void zzaK() {
                zzgxz zzgxzVar = this.zzz;
                if (!zzgxzVar.zzc()) {
                    this.zzz = zzgxr.zzbH(zzgxzVar);
                }
            }

            public void zzav(Iterable<? extends zzd.zza> iterable) {
                zzaK();
                for (zzd.zza zzaVar : iterable) {
                    this.zzz.zzi(zzaVar.zza());
                }
            }

            public void zzaw(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zzi(zzaVar.zza());
            }

            public void zzax() {
                this.zzu &= -65;
                this.zzC = 0;
            }

            public void zzay() {
                this.zzu &= -129;
                this.zzD = 0;
            }

            public void zzaz() {
                this.zzz = zzgxr.zzbG();
            }

            public void zzcf(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                    zzab.zza zzb2 = zzab.zzb(zzabVar2);
                    zzb2.zzbj(zzabVar);
                    zzabVar = zzb2.zzbs();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            public void zzcg(zzq zzqVar) {
                this.zzC = zzqVar.zza();
                this.zzu |= 64;
            }

            public void zzch(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzu |= 128;
            }

            public void zzci(int i, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zze(i, zzaVar.zza());
            }

            public void zzcj(int i) {
                this.zzu |= 256;
                this.zzE = i;
            }

            public void zzck(zzd zzdVar) {
                this.zzG = zzdVar.zza();
                this.zzu |= 1024;
            }

            public void zzcl(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            public void zzcm(zzq zzqVar) {
                this.zzF = zzqVar.zza();
                this.zzu |= 512;
            }

            public void zzcn(long j) {
                this.zzu |= 8;
                this.zzy = j;
            }

            public void zzco(long j) {
                this.zzu |= 4;
                this.zzx = j;
            }

            public void zzcp(zzq zzqVar) {
                this.zzw = zzqVar.zza();
                this.zzu |= 2;
            }

            public void zzcq(long j) {
                this.zzu |= 1;
                this.zzv = j;
            }

            public void zzcr(long j) {
                this.zzu |= 2048;
                this.zzH = j;
            }

            public void zzcs(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzu |= 32;
            }

            public static C45353zza zzn() {
                return zzo.zzaZ();
            }

            public static C45353zza zzo(zza zzaVar) {
                return zzo.zzba(zzaVar);
            }

            public static zza zzq() {
                return zzo;
            }

            public static zza zzr(InputStream inputStream) throws IOException {
                return (zza) zzgxr.zzbk(zzo, inputStream);
            }

            public static zza zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbl(zzo, inputStream, zzgxbVar);
            }

            public static zza zzt(zzgwj zzgwjVar) throws zzgyg {
                return (zza) zzgxr.zzbm(zzo, zzgwjVar);
            }

            public static zza zzu(zzgwp zzgwpVar) throws IOException {
                return (zza) zzgxr.zzbn(zzo, zzgwpVar);
            }

            public static zza zzv(InputStream inputStream) throws IOException {
                return (zza) zzgxr.zzbo(zzo, inputStream);
            }

            public static zza zzw(ByteBuffer byteBuffer) throws zzgyg {
                return (zza) zzgxr.zzbp(zzo, byteBuffer);
            }

            public static zza zzx(byte[] bArr) throws zzgyg {
                return (zza) zzgxr.zzbq(zzo, bArr);
            }

            public static zza zzy(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbr(zzo, zzgwjVar, zzgxbVar);
            }

            public static zza zzz(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbs(zzo, zzgwpVar, zzgxbVar);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzd zzR() {
                zzd zzb2 = zzd.zzb(this.zzG);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public List<zzd.zza> zzS() {
                return new zzgyb(this.zzz, zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzT() {
                if ((this.zzu & 64) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzU() {
                if ((this.zzu & 128) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzV() {
                if ((this.zzu & 256) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzW() {
                if ((this.zzu & 1024) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzX() {
                if ((this.zzu & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzY() {
                if ((this.zzu & 512) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzZ() {
                if ((this.zzu & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public int zza() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzaa() {
                if ((this.zzu & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzab() {
                if ((this.zzu & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzac() {
                if ((this.zzu & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzad() {
                if ((this.zzu & 2048) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public boolean zzae() {
                if ((this.zzu & 32) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public int zzb() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public long zzc() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public long zzd() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzgxr
            protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
                int ordinal = zzgxqVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    if (ordinal == 6) {
                                        zzgzk<zza> zzgzkVar = zzp;
                                        if (zzgzkVar == null) {
                                            synchronized (zza.class) {
                                                zzgzkVar = zzp;
                                                if (zzgzkVar == null) {
                                                    zzgzkVar = new zzgxm(zzo);
                                                    zzp = zzgzkVar;
                                                }
                                            }
                                        }
                                        return zzgzkVar;
                                    }
                                    throw null;
                                }
                                return zzo;
                            }
                            return new C45353zza();
                        }
                        return new zza();
                    }
                    return zzgxr.zzbQ(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.zze(), "zzx", "zzy", "zzz", zzd.zza.zze(), "zzA", "zzB", zzq.zze(), "zzC", zzq.zze(), "zzD", zzq.zze(), "zzE", "zzF", zzq.zze(), "zzG", zzd.zze(), "zzH"});
                }
                return (byte) 1;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public long zze() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public long zzf() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzd.zza zzg(int i) {
                zzd.zza zzb2 = zzd.zza.zzb(this.zzz.zzd(i));
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzq zzh() {
                zzq zzb2 = zzq.zzb(this.zzC);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzq zzi() {
                zzq zzb2 = zzq.zzb(this.zzD);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzq zzj() {
                zzq zzb2 = zzq.zzb(this.zzF);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzq zzk() {
                zzq zzb2 = zzq.zzb(this.zzw);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzq zzl() {
                zzq zzb2 = zzq.zzb(this.zzB);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaf.zzb
            public zzab zzm() {
                zzab zzabVar = this.zzA;
                if (zzabVar == null) {
                    return zzab.zzd();
                }
                return zzabVar;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public interface zzb extends zzgzd {
            zzd zzR();

            List<zzd.zza> zzS();

            boolean zzT();

            boolean zzU();

            boolean zzV();

            boolean zzW();

            boolean zzX();

            boolean zzY();

            boolean zzZ();

            int zza();

            boolean zzaa();

            boolean zzab();

            boolean zzac();

            boolean zzad();

            boolean zzae();

            int zzb();

            long zzc();

            long zzd();

            long zze();

            long zzf();

            zzd.zza zzg(int i);

            zzq zzh();

            zzq zzi();

            zzq zzj();

            zzq zzk();

            zzq zzl();

            zzab zzm();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zzc extends zzgxl<zzaf, zzc> implements zzag {
            public zzc zzA(int i) {
                zzbu();
                ((zzaf) this.zza).zzaA(i);
                return this;
            }

            public zzc zzB(long j) {
                zzbu();
                ((zzaf) this.zza).zzaB(j);
                return this;
            }

            public zzc zzC(int i, zza.C45353zza c45353zza) {
                zzbu();
                ((zzaf) this.zza).zzaC(i, c45353zza.zzbr());
                return this;
            }

            public zzc zzD(int i, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaC(i, zzaVar);
                return this;
            }

            public zzc zzE(int i) {
                zzbu();
                ((zzaf) this.zza).zzaD(i);
                return this;
            }

            public zzc zzF(long j) {
                zzbu();
                ((zzaf) this.zza).zzaE(j);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public zzgwj zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public zzgwj zzH() {
                return ((zzaf) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public String zzI() {
                return ((zzaf) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public String zzJ() {
                return ((zzaf) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public List<zza> zzK() {
                return Collections.unmodifiableList(((zzaf) this.zza).zzK());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzM() {
                return ((zzaf) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzN() {
                return ((zzaf) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzQ() {
                return ((zzaf) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public boolean zzR() {
                return ((zzaf) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public int zza() {
                return ((zzaf) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public int zzc() {
                return ((zzaf) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public int zzd() {
                return ((zzaf) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public long zze() {
                return ((zzaf) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public long zzf() {
                return ((zzaf) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzag
            public zza zzg(int i) {
                return ((zzaf) this.zza).zzg(i);
            }

            public zzc zzh(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzaf) this.zza).zzai(iterable);
                return this;
            }

            public zzc zzi(zza.C45353zza c45353zza) {
                zzbu();
                ((zzaf) this.zza).zzaj(c45353zza.zzbr());
                return this;
            }

            public zzc zzj(zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaj(zzaVar);
                return this;
            }

            public zzc zzk(int i, zza.C45353zza c45353zza) {
                zzbu();
                ((zzaf) this.zza).zzak(i, c45353zza.zzbr());
                return this;
            }

            public zzc zzl(int i, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzak(i, zzaVar);
                return this;
            }

            public zzc zzm() {
                zzbu();
                ((zzaf) this.zza).zzal();
                return this;
            }

            public zzc zzn() {
                zzbu();
                ((zzaf) this.zza).zzam();
                return this;
            }

            public zzc zzo() {
                zzbu();
                ((zzaf) this.zza).zzan();
                return this;
            }

            public zzc zzp() {
                zzbu();
                ((zzaf) this.zza).zzao();
                return this;
            }

            public zzc zzq() {
                zzbu();
                ((zzaf) this.zza).zzap();
                return this;
            }

            public zzc zzr() {
                zzbu();
                ((zzaf) this.zza).zzaq();
                return this;
            }

            public zzc zzs() {
                zzbu();
                ((zzaf) this.zza).zzar();
                return this;
            }

            public zzc zzt() {
                zzbu();
                ((zzaf) this.zza).zzas();
                return this;
            }

            public zzc zzu(int i) {
                zzbu();
                ((zzaf) this.zza).zzau(i);
                return this;
            }

            public zzc zzv(String str) {
                zzbu();
                ((zzaf) this.zza).zzav(str);
                return this;
            }

            public zzc zzw(zzgwj zzgwjVar) {
                zzbu();
                ((zzaf) this.zza).zzaw(zzgwjVar);
                return this;
            }

            public zzc zzx(int i) {
                zzbu();
                ((zzaf) this.zza).zzax(i);
                return this;
            }

            public zzc zzy(String str) {
                zzbu();
                ((zzaf) this.zza).zzay(str);
                return this;
            }

            public zzc zzz(zzgwj zzgwjVar) {
                zzbu();
                ((zzaf) this.zza).zzaz(zzgwjVar);
                return this;
            }

            private zzc() {
                super(zzaf.zzi);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzd implements zzgxv {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzgxw<zzd> zzm = new zzgxw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.1
                /* renamed from: zza */
                public zzd zzb(int i) {
                    return zzd.zzb(i);
                }
            };
            private final int zzo;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzd.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i) {
                this.zzo = i;
            }

            public static zzd zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return SUSPENDED;
                                }
                                return DISCONNECTED;
                            }
                            return DISCONNECTING;
                        }
                        return CONNECTED;
                    }
                    return CONNECTING;
                }
                return UNSPECIFIED;
            }

            public static zzgxw<zzd> zzd() {
                return zzm;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzo;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzgxr.zzbZ(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        public void zzaA(int i) {
            this.zzk |= 1;
            this.zzm = i;
        }

        public void zzaB(long j) {
            this.zzk |= 32;
            this.zzv = j;
        }

        public void zzaC(int i, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.set(i, zzaVar);
        }

        public void zzaD(int i) {
            this.zzk |= 2;
            this.zzn = i;
        }

        public void zzaE(long j) {
            this.zzk |= 4;
            this.zzo = j;
        }

        public void zzai(Iterable<? extends zza> iterable) {
            zzat();
            zzgvs.zzaQ(iterable, this.zzl);
        }

        public void zzaj(zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(zzaVar);
        }

        public void zzak(int i, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(i, zzaVar);
        }

        public void zzal() {
            this.zzk &= -9;
            this.zzp = zzl().zzI();
        }

        public void zzam() {
            this.zzk &= -65;
            this.zzw = 0;
        }

        public void zzan() {
            this.zzk &= -17;
            this.zzu = zzl().zzJ();
        }

        public void zzao() {
            this.zzk &= -2;
            this.zzm = 0;
        }

        public void zzap() {
            this.zzk &= -33;
            this.zzv = 0L;
        }

        public void zzaq() {
            this.zzl = zzgxr.zzbK();
        }

        public void zzar() {
            this.zzk &= -3;
            this.zzn = 0;
        }

        public void zzas() {
            this.zzk &= -5;
            this.zzo = 0L;
        }

        private void zzat() {
            zzgyd<zza> zzgydVar = this.zzl;
            if (!zzgydVar.zzc()) {
                this.zzl = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzau(int i) {
            zzat();
            this.zzl.remove(i);
        }

        public void zzav(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        public void zzaw(zzgwj zzgwjVar) {
            this.zzp = zzgwjVar.zzx();
            this.zzk |= 8;
        }

        public void zzax(int i) {
            this.zzk |= 64;
            this.zzw = i;
        }

        public void zzay(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        public void zzaz(zzgwj zzgwjVar) {
            this.zzu = zzgwjVar.zzx();
            this.zzk |= 16;
        }

        public static zzc zzi() {
            return zzi.zzaZ();
        }

        public static zzc zzj(zzaf zzafVar) {
            return zzi.zzba(zzafVar);
        }

        public static zzaf zzl() {
            return zzi;
        }

        public static zzaf zzm(InputStream inputStream) throws IOException {
            return (zzaf) zzgxr.zzbk(zzi, inputStream);
        }

        public static zzaf zzn(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzaf) zzgxr.zzbl(zzi, inputStream, zzgxbVar);
        }

        public static zzaf zzo(zzgwj zzgwjVar) throws zzgyg {
            return (zzaf) zzgxr.zzbm(zzi, zzgwjVar);
        }

        public static zzaf zzp(zzgwp zzgwpVar) throws IOException {
            return (zzaf) zzgxr.zzbn(zzi, zzgwpVar);
        }

        public static zzaf zzq(InputStream inputStream) throws IOException {
            return (zzaf) zzgxr.zzbo(zzi, inputStream);
        }

        public static zzaf zzr(ByteBuffer byteBuffer) throws zzgyg {
            return (zzaf) zzgxr.zzbp(zzi, byteBuffer);
        }

        public static zzaf zzs(byte[] bArr) throws zzgyg {
            return (zzaf) zzgxr.zzbq(zzi, bArr);
        }

        public static zzaf zzt(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzaf) zzgxr.zzbr(zzi, zzgwjVar, zzgxbVar);
        }

        public static zzaf zzu(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzaf) zzgxr.zzbs(zzi, zzgwpVar, zzgxbVar);
        }

        public static zzaf zzv(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzaf) zzgxr.zzbu(zzi, inputStream, zzgxbVar);
        }

        public static zzaf zzw(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzaf) zzgxr.zzbv(zzi, byteBuffer, zzgxbVar);
        }

        public static zzaf zzx(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzaf) zzgxr.zzbx(zzi, bArr, zzgxbVar);
        }

        public static zzgzk<zzaf> zzy() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public zzgwj zzG() {
            return zzgwj.zzw(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public zzgwj zzH() {
            return zzgwj.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public String zzI() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public String zzJ() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public List<zza> zzK() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzL() {
            if ((this.zzk & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzM() {
            if ((this.zzk & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzN() {
            if ((this.zzk & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzO() {
            if ((this.zzk & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzP() {
            if ((this.zzk & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzQ() {
            if ((this.zzk & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public boolean zzR() {
            if ((this.zzk & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public int zza() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public int zzb() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public int zzc() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public int zzd() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzaf> zzgzkVar = zzj;
                                    if (zzgzkVar == null) {
                                        synchronized (zzaf.class) {
                                            zzgzkVar = zzj;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzi);
                                                zzj = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzi;
                        }
                        return new zzc();
                    }
                    return new zzaf();
                }
                return zzgxr.zzbQ(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public long zze() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public long zzf() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzag
        public zza zzg(int i) {
            return this.zzl.get(i);
        }

        public zzb zzh(int i) {
            return this.zzl.get(i);
        }

        public List<? extends zzb> zzz() {
            return this.zzl;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzag extends zzgzd {
        zzgwj zzG();

        zzgwj zzH();

        String zzI();

        String zzJ();

        List<zzaf.zza> zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        long zze();

        long zzf();

        zzaf.zza zzg(int i);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzah extends zzgxr<zzah, zza> implements zzak {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private static final zzah zzl;
        private static volatile zzgzk<zzah> zzm;
        private int zzA;
        private int zzB;
        private zzai zzC;
        private int zzn;
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzah, zza> implements zzak {
            public zza zzA(int i) {
                zzbu();
                ((zzah) this.zza).zzaA(i);
                return this;
            }

            public zza zzB(int i) {
                zzbu();
                ((zzah) this.zza).zzaB(i);
                return this;
            }

            public zza zzC(int i) {
                zzbu();
                ((zzah) this.zza).zzaC(i);
                return this;
            }

            public zza zzD(zzai.zza zzaVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaVar.zzbr());
                return this;
            }

            public zza zzE(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaiVar);
                return this;
            }

            public zza zzF(int i) {
                zzbu();
                ((zzah) this.zza).zzaE(i);
                return this;
            }

            public zza zzG(int i) {
                zzbu();
                ((zzah) this.zza).zzaF(i);
                return this;
            }

            public zza zzH(int i) {
                zzbu();
                ((zzah) this.zza).zzaG(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public zzai zzI() {
                return ((zzah) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzJ() {
                return ((zzah) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzM() {
                return ((zzah) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzN() {
                return ((zzah) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzQ() {
                return ((zzah) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzR() {
                return ((zzah) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzS() {
                return ((zzah) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public boolean zzT() {
                return ((zzah) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzc() {
                return ((zzah) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzd() {
                return ((zzah) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzg() {
                return ((zzah) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public int zzh() {
                return ((zzah) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public zzq zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzak
            public zzq zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk() {
                zzbu();
                ((zzah) this.zza).zzak();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzah) this.zza).zzal();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzah) this.zza).zzam();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzah) this.zza).zzan();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzah) this.zza).zzao();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzah) this.zza).zzap();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzah) this.zza).zzaq();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzah) this.zza).zzar();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzah) this.zza).zzas();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzah) this.zza).zzat();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzah) this.zza).zzau();
                return this;
            }

            public zza zzv(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzav(zzaiVar);
                return this;
            }

            public zza zzw(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzaw(zzqVar);
                return this;
            }

            public zza zzx(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzax(zzqVar);
                return this;
            }

            public zza zzy(int i) {
                zzbu();
                ((zzah) this.zza).zzay(i);
                return this;
            }

            public zza zzz(int i) {
                zzbu();
                ((zzah) this.zza).zzaz(i);
                return this;
            }

            private zza() {
                super(zzah.zzl);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzgxr.zzbZ(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzgzk<zzah> zzA() {
            return zzl.zzbN();
        }

        public void zzaA(int i) {
            this.zzn |= 8;
            this.zzv = i;
        }

        public void zzaB(int i) {
            this.zzn |= 512;
            this.zzB = i;
        }

        public void zzaC(int i) {
            this.zzn |= 256;
            this.zzA = i;
        }

        public void zzaD(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        public void zzaE(int i) {
            this.zzn |= 4;
            this.zzu = i;
        }

        public void zzaF(int i) {
            this.zzn |= 32;
            this.zzx = i;
        }

        public void zzaG(int i) {
            this.zzn |= 16;
            this.zzw = i;
        }

        public void zzak() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        public void zzal() {
            this.zzn &= -2;
            this.zzo = 1000;
        }

        public void zzam() {
            this.zzn &= -65;
            this.zzy = 0;
        }

        public void zzan() {
            this.zzn &= -129;
            this.zzz = 0;
        }

        public void zzao() {
            this.zzn &= -9;
            this.zzv = 0;
        }

        public void zzap() {
            this.zzn &= -513;
            this.zzB = 0;
        }

        public void zzaq() {
            this.zzn &= -257;
            this.zzA = 0;
        }

        public void zzar() {
            this.zzC = null;
            this.zzn &= -1025;
        }

        public void zzas() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        public void zzat() {
            this.zzn &= -33;
            this.zzx = 0;
        }

        public void zzau() {
            this.zzn &= -17;
            this.zzw = 0;
        }

        public void zzav(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzC;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzi()) {
                zzai.zza zzd2 = zzai.zzd(zzaiVar2);
                zzd2.zzbj(zzaiVar);
                zzaiVar = zzd2.zzbs();
            }
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        public void zzaw(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        public void zzax(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzn |= 1;
        }

        public void zzay(int i) {
            this.zzn |= 64;
            this.zzy = i;
        }

        public void zzaz(int i) {
            this.zzn |= 128;
            this.zzz = i;
        }

        public static zza zzk() {
            return zzl.zzaZ();
        }

        public static zza zzl(zzah zzahVar) {
            return zzl.zzba(zzahVar);
        }

        public static zzah zzn() {
            return zzl;
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zzgxr.zzbk(zzl, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzah) zzgxr.zzbl(zzl, inputStream, zzgxbVar);
        }

        public static zzah zzq(zzgwj zzgwjVar) throws zzgyg {
            return (zzah) zzgxr.zzbm(zzl, zzgwjVar);
        }

        public static zzah zzr(zzgwp zzgwpVar) throws IOException {
            return (zzah) zzgxr.zzbn(zzl, zzgwpVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzgxr.zzbo(zzl, inputStream);
        }

        public static zzah zzt(ByteBuffer byteBuffer) throws zzgyg {
            return (zzah) zzgxr.zzbp(zzl, byteBuffer);
        }

        public static zzah zzu(byte[] bArr) throws zzgyg {
            return (zzah) zzgxr.zzbq(zzl, bArr);
        }

        public static zzah zzv(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzah) zzgxr.zzbr(zzl, zzgwjVar, zzgxbVar);
        }

        public static zzah zzw(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzah) zzgxr.zzbs(zzl, zzgwpVar, zzgxbVar);
        }

        public static zzah zzx(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzah) zzgxr.zzbu(zzl, inputStream, zzgxbVar);
        }

        public static zzah zzy(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzah) zzgxr.zzbv(zzl, byteBuffer, zzgxbVar);
        }

        public static zzah zzz(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzah) zzgxr.zzbx(zzl, bArr, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public zzai zzI() {
            zzai zzaiVar = this.zzC;
            if (zzaiVar == null) {
                return zzai.zzi();
            }
            return zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzJ() {
            if ((this.zzn & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzK() {
            if ((this.zzn & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzL() {
            if ((this.zzn & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzM() {
            if ((this.zzn & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzN() {
            if ((this.zzn & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzO() {
            if ((this.zzn & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzP() {
            if ((this.zzn & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzQ() {
            if ((this.zzn & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzR() {
            if ((this.zzn & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzS() {
            if ((this.zzn & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public boolean zzT() {
            if ((this.zzn & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zza() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzb() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzc() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzd() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzah> zzgzkVar = zzm;
                                    if (zzgzkVar == null) {
                                        synchronized (zzah.class) {
                                            zzgzkVar = zzm;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzl);
                                                zzm = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzl;
                        }
                        return new zza();
                    }
                    return new zzah();
                }
                return zzgxr.zzbQ(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zze() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzf() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzg() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public int zzh() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzak
        public zzq zzj() {
            zzq zzb2 = zzq.zzb(this.zzo);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzai extends zzgxr<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzgzk<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzai, zza> implements zzaj {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
            public int zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzai) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzai) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzai) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzai) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
            public boolean zzg() {
                return ((zzai) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
            public boolean zzh() {
                return ((zzai) this.zza).zzh();
            }

            private zza() {
                super(zzai.zzc);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzgxr.zzbZ(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        public void zzC(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public void zzD(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzai zzaiVar) {
            return zzc.zzba(zzaiVar);
        }

        public static zzai zzi() {
            return zzc;
        }

        public static zzai zzj(InputStream inputStream) throws IOException {
            return (zzai) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzai zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzai) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzai zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzai) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzai zzm(zzgwp zzgwpVar) throws IOException {
            return (zzai) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzai zzn(InputStream inputStream) throws IOException {
            return (zzai) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzai zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzai) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzai zzp(byte[] bArr) throws zzgyg {
            return (zzai) zzgxr.zzbq(zzc, bArr);
        }

        public static zzai zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzai) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzai zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzai) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzai zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzai) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzai zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzai) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzai zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzai) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzai> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
        public int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
        public int zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzai> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzai.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzai();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
        public boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaj
        public boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzaj extends zzgzd {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzak extends zzgzd {
        zzai zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        boolean zzS();

        boolean zzT();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        int zzh();

        zzq zzi();

        zzq zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzal extends zzgxr<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzgzk<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzal, zza> implements zzam {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzam
            public int zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzal) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzal) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzal) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzal) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzam
            public boolean zzg() {
                return ((zzal) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzam
            public boolean zzh() {
                return ((zzal) this.zza).zzh();
            }

            private zza() {
                super(zzal.zzc);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzgxr.zzbZ(zzal.class, zzalVar);
        }

        private zzal() {
        }

        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzC(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public void zzD(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzal zzalVar) {
            return zzc.zzba(zzalVar);
        }

        public static zzal zzi() {
            return zzc;
        }

        public static zzal zzj(InputStream inputStream) throws IOException {
            return (zzal) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzal zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzal) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzal zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzal) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzal zzm(zzgwp zzgwpVar) throws IOException {
            return (zzal) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzal zzn(InputStream inputStream) throws IOException {
            return (zzal) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzal zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzal) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzal zzp(byte[] bArr) throws zzgyg {
            return (zzal) zzgxr.zzbq(zzc, bArr);
        }

        public static zzal zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzal) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzal zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzal) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzal zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzal) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzal zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzal) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzal zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzal) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzal> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzam
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzam
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzal> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzal.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzal();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzam
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzam
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzam extends zzgzd {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzan extends zzgxr<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzgzk<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzan, zza> implements zzao {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public zzq zza() {
                return ((zzan) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzan) this.zza).zzH();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzan) this.zza).zzI();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzan) this.zza).zzJ();
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzan) this.zza).zzL(str);
                return this;
            }

            public zza zzg(zzgwj zzgwjVar) {
                zzbu();
                ((zzan) this.zza).zzM(zzgwjVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzj(zzq zzqVar) {
                zzbu();
                ((zzan) this.zza).zzO(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public zzap zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public zzgwj zzl() {
                return ((zzan) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public String zzm() {
                return ((zzan) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public boolean zzn() {
                return ((zzan) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public boolean zzo() {
                return ((zzan) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzao
            public boolean zzp() {
                return ((zzan) this.zza).zzp();
            }

            private zza() {
                super(zzan.zzd);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzgxr.zzbZ(zzan.class, zzanVar);
        }

        private zzan() {
        }

        public void zzH() {
            this.zzf &= -2;
            this.zzg = zzf().zzm();
        }

        public void zzI() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public void zzJ() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzL(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        public void zzM(zzgwj zzgwjVar) {
            this.zzg = zzgwjVar.zzx();
            this.zzf |= 1;
        }

        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzO(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzf |= 2;
        }

        public static zza zzb() {
            return zzd.zzaZ();
        }

        public static zza zzc(zzan zzanVar) {
            return zzd.zzba(zzanVar);
        }

        public static zzan zzf() {
            return zzd;
        }

        public static zzan zzg(InputStream inputStream) throws IOException {
            return (zzan) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzan zzh(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzan) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzan zzi(zzgwj zzgwjVar) throws zzgyg {
            return (zzan) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzan zzj(zzgwp zzgwpVar) throws IOException {
            return (zzan) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzan zzr(ByteBuffer byteBuffer) throws zzgyg {
            return (zzan) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzan zzs(byte[] bArr) throws zzgyg {
            return (zzan) zzgxr.zzbq(zzd, bArr);
        }

        public static zzan zzt(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzan) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzan zzu(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzan) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzan zzv(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzan) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzan zzw(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzan) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzan zzx(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzan) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public static zzgzk<zzan> zzy() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzh);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzan> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzan.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzan();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.zze(), "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public zzap zzk() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public zzgwj zzl() {
            return zzgwj.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public String zzm() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public boolean zzn() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzao
        public boolean zzp() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzao extends zzgzd {
        zzq zza();

        zzap zzk();

        zzgwj zzl();

        String zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzap extends zzgxr<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzgzk<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzap, zza> implements zzaq {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
            public int zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzap) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzap) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzap) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzap) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
            public boolean zzg() {
                return ((zzap) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
            public boolean zzh() {
                return ((zzap) this.zza).zzh();
            }

            private zza() {
                super(zzap.zzc);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzgxr.zzbZ(zzap.class, zzapVar);
        }

        private zzap() {
        }

        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzC(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public void zzD(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzap zzapVar) {
            return zzc.zzba(zzapVar);
        }

        public static zzap zzi() {
            return zzc;
        }

        public static zzap zzj(InputStream inputStream) throws IOException {
            return (zzap) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzap zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzap) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzap zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzap) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzap zzm(zzgwp zzgwpVar) throws IOException {
            return (zzap) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzap zzn(InputStream inputStream) throws IOException {
            return (zzap) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzap zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzap) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzap zzp(byte[] bArr) throws zzgyg {
            return (zzap) zzgxr.zzbq(zzc, bArr);
        }

        public static zzap zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzap) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzap zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzap) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzap zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzap) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzap zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzap) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzap zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzap) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzap> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzap> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzap.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzap();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaq
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzaq extends zzgzd {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzar extends zzgxr<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzgzk<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzar, zza> implements zzas {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public int zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public int zzc() {
                return ((zzar) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzar) this.zza).zzE();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzar) this.zza).zzF();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzar) this.zza).zzG();
                return this;
            }

            public zza zzg(int i) {
                zzbu();
                ((zzar) this.zza).zzH(i);
                return this;
            }

            public zza zzh(int i) {
                zzbu();
                ((zzar) this.zza).zzI(i);
                return this;
            }

            public zza zzi(int i) {
                zzbu();
                ((zzar) this.zza).zzJ(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public boolean zzj() {
                return ((zzar) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public boolean zzk() {
                return ((zzar) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzas
            public boolean zzl() {
                return ((zzar) this.zza).zzl();
            }

            private zza() {
                super(zzar.zzd);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzgxr.zzbZ(zzar.class, zzarVar);
        }

        private zzar() {
        }

        public void zzE() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        public void zzF() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        public void zzG() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        public void zzH(int i) {
            this.zzf |= 1;
            this.zzg = i;
        }

        public void zzI(int i) {
            this.zzf |= 4;
            this.zzi = i;
        }

        public void zzJ(int i) {
            this.zzf |= 2;
            this.zzh = i;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzar zzarVar) {
            return zzd.zzba(zzarVar);
        }

        public static zzar zzh() {
            return zzd;
        }

        public static zzar zzi(InputStream inputStream) throws IOException {
            return (zzar) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzar zzm(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzar) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzar zzn(zzgwj zzgwjVar) throws zzgyg {
            return (zzar) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzar zzo(zzgwp zzgwpVar) throws IOException {
            return (zzar) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzar zzp(InputStream inputStream) throws IOException {
            return (zzar) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzar zzq(ByteBuffer byteBuffer) throws zzgyg {
            return (zzar) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzar zzr(byte[] bArr) throws zzgyg {
            return (zzar) zzgxr.zzbq(zzd, bArr);
        }

        public static zzar zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzar) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzar zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzar) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzar zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzar) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzar zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzar) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzar zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzar) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public static zzgzk<zzar> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public int zzb() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public int zzc() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzar> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzar.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzar();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public boolean zzj() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public boolean zzk() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzas
        public boolean zzl() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzas extends zzgzd {
        int zza();

        int zzb();

        int zzc();

        boolean zzj();

        boolean zzk();

        boolean zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzat extends zzgxr<zzat, zza> implements zzbi {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private static final zzat zzu;
        private static volatile zzgzk<zzat> zzv;
        private zzbj zzA;
        private zzau zzB;
        private zzbc zzC;
        private zzay zzD;
        private int zzE;
        private int zzF;
        private zzap zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private int zzK;
        private int zzL;
        private long zzM;
        private int zzw;
        private zzba zzx;
        private zzbe zzy;
        private zzbg zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzat, zza> implements zzbi {
            public zza zzA(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcw(zzayVar);
                return this;
            }

            public zza zzB(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcx(zzbaVar);
                return this;
            }

            public zza zzC(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcy(zzbcVar);
                return this;
            }

            public zza zzD(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcz(zzbeVar);
                return this;
            }

            public zza zzE(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcA(zzbgVar);
                return this;
            }

            public zza zzF(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcB(zzapVar);
                return this;
            }

            public zza zzG(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcC(zzbjVar);
                return this;
            }

            public zza zzH(zzau.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzaVar.zzbr());
                return this;
            }

            public zza zzI(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzauVar);
                return this;
            }

            public zza zzJ(zzay.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zza zzK(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzayVar);
                return this;
            }

            public zza zzL(zzba.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzM(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzbaVar);
                return this;
            }

            public zza zzN(zzbc.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzO(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzbcVar);
                return this;
            }

            public zza zzP(zzbe.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzQ(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzbeVar);
                return this;
            }

            public zza zzR(zzbg.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzS(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzbgVar);
                return this;
            }

            public zza zzT(int i) {
                zzbu();
                ((zzat) this.zza).zzcJ(i);
                return this;
            }

            public zza zzU(int i) {
                zzbu();
                ((zzat) this.zza).zzcK(i);
                return this;
            }

            public zza zzV(int i) {
                zzbu();
                ((zzat) this.zza).zzcL(i);
                return this;
            }

            public zza zzW(int i) {
                zzbu();
                ((zzat) this.zza).zzcM(i);
                return this;
            }

            public zza zzX(int i) {
                zzbu();
                ((zzat) this.zza).zzcN(i);
                return this;
            }

            public zza zzY(int i) {
                zzbu();
                ((zzat) this.zza).zzcO(i);
                return this;
            }

            public zza zzZ(int i) {
                zzbu();
                ((zzat) this.zza).zzcP(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzaA() {
                return ((zzat) this.zza).zzaA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzaB() {
                return ((zzat) this.zza).zzaB();
            }

            public zza zzaa(zzap.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcQ(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcQ(zzapVar);
                return this;
            }

            public zza zzac(long j) {
                zzbu();
                ((zzat) this.zza).zzcR(j);
                return this;
            }

            public zza zzad(zzbj.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzaVar.zzbr());
                return this;
            }

            public zza zzae(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzau zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzay zzag() {
                return ((zzat) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzba zzah() {
                return ((zzat) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzbc zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzbe zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzbg zzak() {
                return ((zzat) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzbj zzal() {
                return ((zzat) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzao() {
                return ((zzat) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzap() {
                return ((zzat) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzas() {
                return ((zzat) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzat() {
                return ((zzat) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzaw() {
                return ((zzat) this.zza).zzaw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzax() {
                return ((zzat) this.zza).zzax();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public boolean zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zzc() {
                return ((zzat) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zzd() {
                return ((zzat) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zze() {
                return ((zzat) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zzf() {
                return ((zzat) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public int zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public long zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
            public zzap zzi() {
                return ((zzat) this.zza).zzi();
            }

            public zza zzj() {
                zzbu();
                ((zzat) this.zza).zzcf();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzat) this.zza).zzcg();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzat) this.zza).zzch();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzat) this.zza).zzci();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzat) this.zza).zzcj();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzat) this.zza).zzck();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzat) this.zza).zzcl();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzat) this.zza).zzcm();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzat) this.zza).zzcn();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzat) this.zza).zzco();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzat) this.zza).zzcp();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzat) this.zza).zzcq();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzat) this.zza).zzcr();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzat) this.zza).zzcs();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzat) this.zza).zzct();
                return this;
            }

            public zza zzy() {
                zzbu();
                ((zzat) this.zza).zzcu();
                return this;
            }

            public zza zzz(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcv(zzauVar);
                return this;
            }

            private zza() {
                super(zzat.zzu);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzgxr.zzbZ(zzat.class, zzatVar);
        }

        private zzat() {
        }

        public void zzcA(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzh()) {
                zzbg.zza zzf2 = zzbg.zzf(zzbgVar2);
                zzf2.zzbj(zzbgVar);
                zzbgVar = zzf2.zzbs();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        public void zzcB(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        public void zzcC(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzg()) {
                zzbj.zza zzd2 = zzbj.zzd(zzbjVar2);
                zzd2.zzbj(zzbjVar);
                zzbjVar = zzd2.zzbs();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        public void zzcD(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        public void zzcE(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        public void zzcF(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        public void zzcG(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        public void zzcH(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        public void zzcI(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        public void zzcJ(int i) {
            this.zzw |= 8192;
            this.zzK = i;
        }

        public void zzcK(int i) {
            this.zzw |= 16384;
            this.zzL = i;
        }

        public void zzcL(int i) {
            this.zzw |= 1024;
            this.zzH = i;
        }

        public void zzcM(int i) {
            this.zzw |= 128;
            this.zzE = i;
        }

        public void zzcN(int i) {
            this.zzw |= 256;
            this.zzF = i;
        }

        public void zzcO(int i) {
            this.zzw |= 2048;
            this.zzI = i;
        }

        public void zzcP(int i) {
            this.zzw |= 4096;
            this.zzJ = i;
        }

        public void zzcQ(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        public void zzcR(long j) {
            this.zzw |= 32768;
            this.zzM = j;
        }

        public void zzcS(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        public void zzcf() {
            this.zzB = null;
            this.zzw &= -17;
        }

        public void zzcg() {
            this.zzD = null;
            this.zzw &= -65;
        }

        public void zzch() {
            this.zzx = null;
            this.zzw &= -2;
        }

        public void zzci() {
            this.zzC = null;
            this.zzw &= -33;
        }

        public void zzcj() {
            this.zzy = null;
            this.zzw &= -3;
        }

        public void zzck() {
            this.zzz = null;
            this.zzw &= -5;
        }

        public void zzcl() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        public void zzcm() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        public void zzcn() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        public void zzco() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        public void zzcp() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        public void zzcq() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        public void zzcr() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        public void zzcs() {
            this.zzG = null;
            this.zzw &= -513;
        }

        public void zzct() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        public void zzcu() {
            this.zzA = null;
            this.zzw &= -9;
        }

        public void zzcv(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.zzg()) {
                zzau.zza zzd2 = zzau.zzd(zzauVar2);
                zzd2.zzbj(zzauVar);
                zzauVar = zzd2.zzbs();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        public void zzcw(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.zzi()) {
                zzay.zza zzg2 = zzay.zzg(zzayVar2);
                zzg2.zzbj(zzayVar);
                zzayVar = zzg2.zzbs();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        public void zzcx(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzx;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzi()) {
                zzba.zza zzg2 = zzba.zzg(zzbaVar2);
                zzg2.zzbj(zzbaVar);
                zzbaVar = zzg2.zzbs();
            }
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        public void zzcy(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzh()) {
                zzbc.zza zzf2 = zzbc.zzf(zzbcVar2);
                zzf2.zzbj(zzbcVar);
                zzbcVar = zzf2.zzbs();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        public void zzcz(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzy;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzj()) {
                zzbe.zza zzh2 = zzbe.zzh(zzbeVar2);
                zzh2.zzbj(zzbeVar);
                zzbeVar = zzh2.zzbs();
            }
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        public static zza zzj() {
            return zzu.zzaZ();
        }

        public static zza zzk(zzat zzatVar) {
            return zzu.zzba(zzatVar);
        }

        public static zzat zzm() {
            return zzu;
        }

        public static zzat zzn(InputStream inputStream) throws IOException {
            return (zzat) zzgxr.zzbk(zzu, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzat) zzgxr.zzbl(zzu, inputStream, zzgxbVar);
        }

        public static zzat zzp(zzgwj zzgwjVar) throws zzgyg {
            return (zzat) zzgxr.zzbm(zzu, zzgwjVar);
        }

        public static zzat zzq(zzgwp zzgwpVar) throws IOException {
            return (zzat) zzgxr.zzbn(zzu, zzgwpVar);
        }

        public static zzat zzr(InputStream inputStream) throws IOException {
            return (zzat) zzgxr.zzbo(zzu, inputStream);
        }

        public static zzat zzs(ByteBuffer byteBuffer) throws zzgyg {
            return (zzat) zzgxr.zzbp(zzu, byteBuffer);
        }

        public static zzat zzt(byte[] bArr) throws zzgyg {
            return (zzat) zzgxr.zzbq(zzu, bArr);
        }

        public static zzat zzu(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzat) zzgxr.zzbr(zzu, zzgwjVar, zzgxbVar);
        }

        public static zzat zzv(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzat) zzgxr.zzbs(zzu, zzgwpVar, zzgxbVar);
        }

        public static zzat zzw(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzat) zzgxr.zzbu(zzu, inputStream, zzgxbVar);
        }

        public static zzat zzx(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzat) zzgxr.zzbv(zzu, byteBuffer, zzgxbVar);
        }

        public static zzat zzy(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzat) zzgxr.zzbx(zzu, bArr, zzgxbVar);
        }

        public static zzgzk<zzat> zzz() {
            return zzu.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zza() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzaA() {
            if ((this.zzw & 32768) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzaB() {
            if ((this.zzw & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzau zzaf() {
            zzau zzauVar = this.zzB;
            if (zzauVar == null) {
                return zzau.zzg();
            }
            return zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzay zzag() {
            zzay zzayVar = this.zzD;
            if (zzayVar == null) {
                return zzay.zzi();
            }
            return zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzba zzah() {
            zzba zzbaVar = this.zzx;
            if (zzbaVar == null) {
                return zzba.zzi();
            }
            return zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzbc zzai() {
            zzbc zzbcVar = this.zzC;
            if (zzbcVar == null) {
                return zzbc.zzh();
            }
            return zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzbe zzaj() {
            zzbe zzbeVar = this.zzy;
            if (zzbeVar == null) {
                return zzbe.zzj();
            }
            return zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzbg zzak() {
            zzbg zzbgVar = this.zzz;
            if (zzbgVar == null) {
                return zzbg.zzh();
            }
            return zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzbj zzal() {
            zzbj zzbjVar = this.zzA;
            if (zzbjVar == null) {
                return zzbj.zzg();
            }
            return zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzam() {
            if ((this.zzw & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzan() {
            if ((this.zzw & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzao() {
            if ((this.zzw & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzap() {
            if ((this.zzw & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzaq() {
            if ((this.zzw & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzar() {
            if ((this.zzw & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzas() {
            if ((this.zzw & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzat() {
            if ((this.zzw & 16384) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzau() {
            if ((this.zzw & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzav() {
            if ((this.zzw & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzaw() {
            if ((this.zzw & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzax() {
            if ((this.zzw & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzay() {
            if ((this.zzw & 4096) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public boolean zzaz() {
            if ((this.zzw & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zzb() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zzc() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zzd() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzat> zzgzkVar = zzv;
                                    if (zzgzkVar == null) {
                                        synchronized (zzat.class) {
                                            zzgzkVar = zzv;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzu);
                                                zzv = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzu;
                        }
                        return new zza();
                    }
                    return new zzat();
                }
                return zzgxr.zzbQ(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zze() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zzf() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public int zzg() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public long zzh() {
            return this.zzM;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbi
        public zzap zzi() {
            zzap zzapVar = this.zzG;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzau extends zzgxr<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzgzk<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzau, zza> implements zzav {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public zzq zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public zzap zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzau) this.zza).zzG();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzau) this.zza).zzH();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzau) this.zza).zzI();
                return this;
            }

            public zza zzf(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl(zzq zzqVar) {
                zzbu();
                ((zzau) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public zzaw zzm() {
                return ((zzau) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public boolean zzn() {
                return ((zzau) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public boolean zzo() {
                return ((zzau) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzav
            public boolean zzp() {
                return ((zzau) this.zza).zzp();
            }

            private zza() {
                super(zzau.zzd);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzgxr.zzbZ(zzau.class, zzauVar);
        }

        private zzau() {
        }

        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzau zzauVar) {
            return zzd.zzba(zzauVar);
        }

        public static zzau zzg() {
            return zzd;
        }

        public static zzau zzh(InputStream inputStream) throws IOException {
            return (zzau) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzau zzi(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzau) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzau zzj(zzgwj zzgwjVar) throws zzgyg {
            return (zzau) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzau zzk(zzgwp zzgwpVar) throws IOException {
            return (zzau) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzau zzl(InputStream inputStream) throws IOException {
            return (zzau) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzau zzq(ByteBuffer byteBuffer) throws zzgyg {
            return (zzau) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzau zzr(byte[] bArr) throws zzgyg {
            return (zzau) zzgxr.zzbq(zzd, bArr);
        }

        public static zzau zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzau) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzau zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzau) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzau zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzau) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzau zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzau) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzau zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzau) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public static zzgzk<zzau> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzau> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzau.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzau();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public zzaw zzm() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzav
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzav extends zzgzd {
        zzq zza();

        zzap zzb();

        zzaw zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzaw extends zzgxr<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzgzk<zzaw> zzc;
        private int zzd;
        private int zze;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzaw, zza> implements zzax {
            public zza zza() {
                zzbu();
                ((zzaw) this.zza).zzw();
                return this;
            }

            public zza zzb(zzb zzbVar) {
                zzbu();
                ((zzaw) this.zza).zzx(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzax
            public zzb zzc() {
                return ((zzaw) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzax
            public boolean zzd() {
                return ((zzaw) this.zza).zzd();
            }

            private zza() {
                super(zzaw.zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzb implements zzgxv {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzgxw<zzb> zzi = new zzgxw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzaw.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzk;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzb.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.zzk = i;
            }

            public static zzb zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return ANDROID_TARGET_API_TOO_LOW;
                        }
                        return CACHE_LOAD_FAILED;
                    }
                    return OPENGL_RENDERING_FAILED;
                }
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }

            public static zzgxw<zzb> zzd() {
                return zzi;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzgxr.zzbZ(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zza zza() {
            return zzb.zzaZ();
        }

        public static zza zzb(zzaw zzawVar) {
            return zzb.zzba(zzawVar);
        }

        public static zzaw zzg() {
            return zzb;
        }

        public static zzaw zzh(InputStream inputStream) throws IOException {
            return (zzaw) zzgxr.zzbk(zzb, inputStream);
        }

        public static zzaw zzi(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzaw) zzgxr.zzbl(zzb, inputStream, zzgxbVar);
        }

        public static zzaw zzj(zzgwj zzgwjVar) throws zzgyg {
            return (zzaw) zzgxr.zzbm(zzb, zzgwjVar);
        }

        public static zzaw zzk(zzgwp zzgwpVar) throws IOException {
            return (zzaw) zzgxr.zzbn(zzb, zzgwpVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzgxr.zzbo(zzb, inputStream);
        }

        public static zzaw zzm(ByteBuffer byteBuffer) throws zzgyg {
            return (zzaw) zzgxr.zzbp(zzb, byteBuffer);
        }

        public static zzaw zzn(byte[] bArr) throws zzgyg {
            return (zzaw) zzgxr.zzbq(zzb, bArr);
        }

        public static zzaw zzo(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzaw) zzgxr.zzbr(zzb, zzgwjVar, zzgxbVar);
        }

        public static zzaw zzp(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzaw) zzgxr.zzbs(zzb, zzgwpVar, zzgxbVar);
        }

        public static zzaw zzq(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzaw) zzgxr.zzbu(zzb, inputStream, zzgxbVar);
        }

        public static zzaw zzr(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzaw) zzgxr.zzbv(zzb, byteBuffer, zzgxbVar);
        }

        public static zzaw zzs(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzaw) zzgxr.zzbx(zzb, bArr, zzgxbVar);
        }

        public static zzgzk<zzaw> zzt() {
            return zzb.zzbN();
        }

        public void zzw() {
            this.zzd &= -2;
            this.zze = 0;
        }

        public void zzx(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzd |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzax
        public zzb zzc() {
            zzb zzb2 = zzb.zzb(this.zze);
            if (zzb2 == null) {
                return zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzax
        public boolean zzd() {
            if ((this.zzd & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzaw> zzgzkVar = zzc;
                                    if (zzgzkVar == null) {
                                        synchronized (zzaw.class) {
                                            zzgzkVar = zzc;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzb);
                                                zzc = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzb;
                        }
                        return new zza();
                    }
                    return new zzaw();
                }
                return zzgxr.zzbQ(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.zze()});
            }
            return (byte) 1;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzax extends zzgzd {
        zzaw.zzb zzc();

        boolean zzd();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzay extends zzgxr<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzgzk<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzay, zza> implements zzaz {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public zzq zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public zzap zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public zzar zzc() {
                return ((zzay) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public zzaw zzd() {
                return ((zzay) this.zza).zzd();
            }

            public zza zze() {
                zzbu();
                ((zzay) this.zza).zzL();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzay) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzay) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzay) this.zza).zzO();
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzP(zzawVar);
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzQ(zzapVar);
                return this;
            }

            public zza zzk(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzaVar.zzbr());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzapVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzqVar);
                return this;
            }

            public zza zzq(zzar.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzaVar.zzbr());
                return this;
            }

            public zza zzr(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public boolean zzs() {
                return ((zzay) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public boolean zzt() {
                return ((zzay) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public boolean zzu() {
                return ((zzay) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
            public boolean zzv() {
                return ((zzay) this.zza).zzv();
            }

            private zza() {
                super(zzay.zze);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzgxr.zzbZ(zzay.class, zzayVar);
        }

        private zzay() {
        }

        public void zzL() {
            this.zzj = null;
            this.zzg &= -5;
        }

        public void zzM() {
            this.zzk = null;
            this.zzg &= -9;
        }

        public void zzN() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        public void zzO() {
            this.zzh = null;
            this.zzg &= -2;
        }

        public void zzP(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        public void zzQ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        public void zzT(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        public void zzU(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        public void zzV(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public static zza zzf() {
            return zze.zzaZ();
        }

        public static zza zzg(zzay zzayVar) {
            return zze.zzba(zzayVar);
        }

        public static zzay zzi() {
            return zze;
        }

        public static zzay zzj(InputStream inputStream) throws IOException {
            return (zzay) zzgxr.zzbk(zze, inputStream);
        }

        public static zzay zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzay) zzgxr.zzbl(zze, inputStream, zzgxbVar);
        }

        public static zzay zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzay) zzgxr.zzbm(zze, zzgwjVar);
        }

        public static zzay zzm(zzgwp zzgwpVar) throws IOException {
            return (zzay) zzgxr.zzbn(zze, zzgwpVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zzgxr.zzbo(zze, inputStream);
        }

        public static zzay zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzay) zzgxr.zzbp(zze, byteBuffer);
        }

        public static zzay zzp(byte[] bArr) throws zzgyg {
            return (zzay) zzgxr.zzbq(zze, bArr);
        }

        public static zzay zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzay) zzgxr.zzbr(zze, zzgwjVar, zzgxbVar);
        }

        public static zzay zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzay) zzgxr.zzbs(zze, zzgwpVar, zzgxbVar);
        }

        public static zzay zzw(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzay) zzgxr.zzbu(zze, inputStream, zzgxbVar);
        }

        public static zzay zzx(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzay) zzgxr.zzbv(zze, byteBuffer, zzgxbVar);
        }

        public static zzay zzy(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzay) zzgxr.zzbx(zze, bArr, zzgxbVar);
        }

        public static zzgzk<zzay> zzz() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public zzap zzb() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public zzar zzc() {
            zzar zzarVar = this.zzh;
            if (zzarVar == null) {
                return zzar.zzh();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public zzaw zzd() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzay> zzgzkVar = zzf;
                                    if (zzgzkVar == null) {
                                        synchronized (zzay.class) {
                                            zzgzkVar = zzf;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zze);
                                                zzf = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzay();
                }
                return zzgxr.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public boolean zzs() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public boolean zzt() {
            if ((this.zzg & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public boolean zzu() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaz
        public boolean zzv() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzaz extends zzgzd {
        zzq zza();

        zzap zzb();

        zzar zzc();

        zzaw zzd();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzb extends zzgxr<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzgzk<zzb> zzc;
        private zzgyd<zza> zzd = zzgxr.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxr<zza, C45354zza> implements InterfaceC45355zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzgzk<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbq$zzb$zza$zza */
            /* loaded from: classes5.dex */
            public final class C45354zza extends zzgxl<zza, C45354zza> implements InterfaceC45355zzb {
                public C45354zza zza() {
                    zzbu();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C45354zza zzb() {
                    zzbu();
                    ((zza) this.zza).zzH();
                    return this;
                }

                public C45354zza zzc() {
                    zzbu();
                    ((zza) this.zza).zzI();
                    return this;
                }

                public C45354zza zzd(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzJ(zzeVar);
                    return this;
                }

                public C45354zza zze(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzK(zzgVar);
                    return this;
                }

                public C45354zza zzf(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzL(zzdVar);
                    return this;
                }

                public C45354zza zzg(zze.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzaVar.zzbr());
                    return this;
                }

                public C45354zza zzh(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzeVar);
                    return this;
                }

                public C45354zza zzi(zzg.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzaVar.zzbr());
                    return this;
                }

                public C45354zza zzj(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public zzd zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public zze zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public zzg zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public boolean zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public boolean zzo() {
                    return ((zza) this.zza).zzo();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
                public boolean zzp() {
                    return ((zza) this.zza).zzp();
                }

                private C45354zza() {
                    super(zza.zzd);
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzgxr.zzbZ(zza.class, zzaVar);
            }

            private zza() {
            }

            public void zzG() {
                this.zzf &= -2;
                this.zzg = 0;
            }

            public void zzH() {
                this.zzh = null;
                this.zzf &= -3;
            }

            public void zzI() {
                this.zzi = null;
                this.zzf &= -5;
            }

            public void zzJ(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzh;
                if (zzeVar2 != null && zzeVar2 != zze.zzi()) {
                    zze.zza zzc2 = zze.zzc(zzeVar2);
                    zzc2.zzbj(zzeVar);
                    zzeVar = zzc2.zzbs();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            public void zzK(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.zzf()) {
                    zzg.zza zzc2 = zzg.zzc(zzgVar2);
                    zzc2.zzbj(zzgVar);
                    zzgVar = zzc2.zzbs();
                }
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public void zzL(zzd zzdVar) {
                this.zzg = zzdVar.zza();
                this.zzf |= 1;
            }

            public void zzM(zze zzeVar) {
                zzeVar.getClass();
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            public void zzN(zzg zzgVar) {
                zzgVar.getClass();
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public static C45354zza zza() {
                return zzd.zzaZ();
            }

            public static C45354zza zzb(zza zzaVar) {
                return zzd.zzba(zzaVar);
            }

            public static zza zzd() {
                return zzd;
            }

            public static zza zzf(InputStream inputStream) throws IOException {
                return (zza) zzgxr.zzbk(zzd, inputStream);
            }

            public static zza zzg(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
            }

            public static zza zzh(zzgwj zzgwjVar) throws zzgyg {
                return (zza) zzgxr.zzbm(zzd, zzgwjVar);
            }

            public static zza zzi(zzgwp zzgwpVar) throws IOException {
                return (zza) zzgxr.zzbn(zzd, zzgwpVar);
            }

            public static zza zzj(InputStream inputStream) throws IOException {
                return (zza) zzgxr.zzbo(zzd, inputStream);
            }

            public static zza zzq(ByteBuffer byteBuffer) throws zzgyg {
                return (zza) zzgxr.zzbp(zzd, byteBuffer);
            }

            public static zza zzr(byte[] bArr) throws zzgyg {
                return (zza) zzgxr.zzbq(zzd, bArr);
            }

            public static zza zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
            }

            public static zza zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
            }

            public static zza zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zza) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
            }

            public static zza zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
            }

            public static zza zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
                return (zza) zzgxr.zzbx(zzd, bArr, zzgxbVar);
            }

            public static zzgzk<zza> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzgxr
            protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
                int ordinal = zzgxqVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    if (ordinal == 6) {
                                        zzgzk<zza> zzgzkVar = zze;
                                        if (zzgzkVar == null) {
                                            synchronized (zza.class) {
                                                zzgzkVar = zze;
                                                if (zzgzkVar == null) {
                                                    zzgzkVar = new zzgxm(zzd);
                                                    zze = zzgzkVar;
                                                }
                                            }
                                        }
                                        return zzgzkVar;
                                    }
                                    throw null;
                                }
                                return zzd;
                            }
                            return new C45354zza();
                        }
                        return new zza();
                    }
                    return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.zze(), "zzh", "zzi"});
                }
                return (byte) 1;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public zzd zzk() {
                zzd zzb2 = zzd.zzb(this.zzg);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public zze zzl() {
                zze zzeVar = this.zzh;
                if (zzeVar == null) {
                    return zze.zzi();
                }
                return zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public zzg zzm() {
                zzg zzgVar = this.zzi;
                if (zzgVar == null) {
                    return zzg.zzf();
                }
                return zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public boolean zzn() {
                if ((this.zzf & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public boolean zzo() {
                if ((this.zzf & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.InterfaceC45355zzb
            public boolean zzp() {
                if ((this.zzf & 4) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbbq$zzb$zzb */
        /* loaded from: classes5.dex */
        public interface InterfaceC45355zzb extends zzgzd {
            zzd zzk();

            zze zzl();

            zzg zzm();

            boolean zzn();

            boolean zzo();

            boolean zzp();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zzc extends zzgxl<zzb, zzc> implements zzc {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzc
            public int zza() {
                return ((zzb) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzc
            public zza zzb(int i) {
                return ((zzb) this.zza).zzb(i);
            }

            public zzc zzc(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzb) this.zza).zzD(iterable);
                return this;
            }

            public zzc zzd(zza.C45354zza c45354zza) {
                zzbu();
                ((zzb) this.zza).zzE(c45354zza.zzbr());
                return this;
            }

            public zzc zze(zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzE(zzaVar);
                return this;
            }

            public zzc zzf(int i, zza.C45354zza c45354zza) {
                zzbu();
                ((zzb) this.zza).zzF(i, c45354zza.zzbr());
                return this;
            }

            public zzc zzg(int i, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzF(i, zzaVar);
                return this;
            }

            public zzc zzh() {
                zzbu();
                ((zzb) this.zza).zzG();
                return this;
            }

            public zzc zzi(int i) {
                zzbu();
                ((zzb) this.zza).zzI(i);
                return this;
            }

            public zzc zzj(int i, zza.C45354zza c45354zza) {
                zzbu();
                ((zzb) this.zza).zzJ(i, c45354zza.zzbr());
                return this;
            }

            public zzc zzk(int i, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzJ(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzc
            public List<zza> zzl() {
                return Collections.unmodifiableList(((zzb) this.zza).zzl());
            }

            private zzc() {
                super(zzb.zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzd implements zzgxv {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzgxw<zzd> zze = new zzgxw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzb.zzd.1
                /* renamed from: zza */
                public zzd zzb(int i) {
                    return zzd.zzb(i);
                }
            };
            private final int zzg;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzd.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i) {
                this.zzg = i;
            }

            public static zzd zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return IN_MEMORY;
                }
                return UNSPECIFIED;
            }

            public static zzgxw<zzd> zzd() {
                return zze;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzg;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zze extends zzgxr<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzgzk<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza extends zzgxl<zze, zza> implements zzf {
                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
                public int zza() {
                    return ((zze) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zze) this.zza).zzA();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zze) this.zza).zzB();
                    return this;
                }

                public zza zzd(boolean z) {
                    zzbu();
                    ((zze) this.zza).zzC(z);
                    return this;
                }

                public zza zze(int i) {
                    zzbu();
                    ((zze) this.zza).zzD(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
                public boolean zzf() {
                    return ((zze) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
                public boolean zzg() {
                    return ((zze) this.zza).zzg();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
                public boolean zzh() {
                    return ((zze) this.zza).zzh();
                }

                private zza() {
                    super(zze.zzc);
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzgxr.zzbZ(zze.class, zzeVar);
            }

            private zze() {
            }

            public void zzA() {
                this.zze &= -2;
                this.zzf = false;
            }

            public void zzB() {
                this.zze &= -3;
                this.zzg = 0;
            }

            public void zzC(boolean z) {
                this.zze |= 1;
                this.zzf = z;
            }

            public void zzD(int i) {
                this.zze |= 2;
                this.zzg = i;
            }

            public static zza zzb() {
                return zzc.zzaZ();
            }

            public static zza zzc(zze zzeVar) {
                return zzc.zzba(zzeVar);
            }

            public static zze zzi() {
                return zzc;
            }

            public static zze zzj(InputStream inputStream) throws IOException {
                return (zze) zzgxr.zzbk(zzc, inputStream);
            }

            public static zze zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zze) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
            }

            public static zze zzl(zzgwj zzgwjVar) throws zzgyg {
                return (zze) zzgxr.zzbm(zzc, zzgwjVar);
            }

            public static zze zzm(zzgwp zzgwpVar) throws IOException {
                return (zze) zzgxr.zzbn(zzc, zzgwpVar);
            }

            public static zze zzn(InputStream inputStream) throws IOException {
                return (zze) zzgxr.zzbo(zzc, inputStream);
            }

            public static zze zzo(ByteBuffer byteBuffer) throws zzgyg {
                return (zze) zzgxr.zzbp(zzc, byteBuffer);
            }

            public static zze zzp(byte[] bArr) throws zzgyg {
                return (zze) zzgxr.zzbq(zzc, bArr);
            }

            public static zze zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
                return (zze) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
            }

            public static zze zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
                return (zze) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
            }

            public static zze zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zze) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
            }

            public static zze zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
                return (zze) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
            }

            public static zze zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
                return (zze) zzgxr.zzbx(zzc, bArr, zzgxbVar);
            }

            public static zzgzk<zze> zzv() {
                return zzc.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
            public int zza() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzgxr
            protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
                int ordinal = zzgxqVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    if (ordinal == 6) {
                                        zzgzk<zze> zzgzkVar = zzd;
                                        if (zzgzkVar == null) {
                                            synchronized (zze.class) {
                                                zzgzkVar = zzd;
                                                if (zzgzkVar == null) {
                                                    zzgzkVar = new zzgxm(zzc);
                                                    zzd = zzgzkVar;
                                                }
                                            }
                                        }
                                        return zzgzkVar;
                                    }
                                    throw null;
                                }
                                return zzc;
                            }
                            return new zza();
                        }
                        return new zze();
                    }
                    return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                }
                return (byte) 1;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
            public boolean zzg() {
                if ((this.zze & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzf
            public boolean zzh() {
                if ((this.zze & 2) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public interface zzf extends zzgzd {
            int zza();

            boolean zzf();

            boolean zzg();

            boolean zzh();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zzg extends zzgxr<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzgzk<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza extends zzgxl<zzg, zza> implements zzh {
                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public int zza() {
                    return ((zzg) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zzg) this.zza).zzE();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zzg) this.zza).zzF();
                    return this;
                }

                public zza zzd() {
                    zzbu();
                    ((zzg) this.zza).zzG();
                    return this;
                }

                public zza zze(boolean z) {
                    zzbu();
                    ((zzg) this.zza).zzH(z);
                    return this;
                }

                public zza zzf(boolean z) {
                    zzbu();
                    ((zzg) this.zza).zzI(z);
                    return this;
                }

                public zza zzg(int i) {
                    zzbu();
                    ((zzg) this.zza).zzJ(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public boolean zzh() {
                    return ((zzg) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public boolean zzj() {
                    return ((zzg) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public boolean zzk() {
                    return ((zzg) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
                public boolean zzl() {
                    return ((zzg) this.zza).zzl();
                }

                private zza() {
                    super(zzg.zzd);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzgxr.zzbZ(zzg.class, zzgVar);
            }

            private zzg() {
            }

            public void zzE() {
                this.zzf &= -2;
                this.zzg = false;
            }

            public void zzF() {
                this.zzf &= -3;
                this.zzh = false;
            }

            public void zzG() {
                this.zzf &= -5;
                this.zzi = 0;
            }

            public void zzH(boolean z) {
                this.zzf |= 1;
                this.zzg = z;
            }

            public void zzI(boolean z) {
                this.zzf |= 2;
                this.zzh = z;
            }

            public void zzJ(int i) {
                this.zzf |= 4;
                this.zzi = i;
            }

            public static zza zzb() {
                return zzd.zzaZ();
            }

            public static zza zzc(zzg zzgVar) {
                return zzd.zzba(zzgVar);
            }

            public static zzg zzf() {
                return zzd;
            }

            public static zzg zzg(InputStream inputStream) throws IOException {
                return (zzg) zzgxr.zzbk(zzd, inputStream);
            }

            public static zzg zzm(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zzg) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
            }

            public static zzg zzn(zzgwj zzgwjVar) throws zzgyg {
                return (zzg) zzgxr.zzbm(zzd, zzgwjVar);
            }

            public static zzg zzo(zzgwp zzgwpVar) throws IOException {
                return (zzg) zzgxr.zzbn(zzd, zzgwpVar);
            }

            public static zzg zzp(InputStream inputStream) throws IOException {
                return (zzg) zzgxr.zzbo(zzd, inputStream);
            }

            public static zzg zzq(ByteBuffer byteBuffer) throws zzgyg {
                return (zzg) zzgxr.zzbp(zzd, byteBuffer);
            }

            public static zzg zzr(byte[] bArr) throws zzgyg {
                return (zzg) zzgxr.zzbq(zzd, bArr);
            }

            public static zzg zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
                return (zzg) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
            }

            public static zzg zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
                return (zzg) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
            }

            public static zzg zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
                return (zzg) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
            }

            public static zzg zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
                return (zzg) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
            }

            public static zzg zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
                return (zzg) zzgxr.zzbx(zzd, bArr, zzgxbVar);
            }

            public static zzgzk<zzg> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public int zza() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzgxr
            protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
                int ordinal = zzgxqVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    if (ordinal == 6) {
                                        zzgzk<zzg> zzgzkVar = zze;
                                        if (zzgzkVar == null) {
                                            synchronized (zzg.class) {
                                                zzgzkVar = zze;
                                                if (zzgzkVar == null) {
                                                    zzgzkVar = new zzgxm(zzd);
                                                    zze = zzgzkVar;
                                                }
                                            }
                                        }
                                        return zzgzkVar;
                                    }
                                    throw null;
                                }
                                return zzd;
                            }
                            return new zza();
                        }
                        return new zzg();
                    }
                    return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                }
                return (byte) 1;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public boolean zzh() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public boolean zzi() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public boolean zzj() {
                if ((this.zzf & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public boolean zzk() {
                if ((this.zzf & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzb.zzh
            public boolean zzl() {
                if ((this.zzf & 4) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public interface zzh extends zzgzd {
            int zza();

            boolean zzh();

            boolean zzi();

            boolean zzj();

            boolean zzk();

            boolean zzl();
        }

        static {
            zzb zzbVar = new zzb();
            zzb = zzbVar;
            zzgxr.zzbZ(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public void zzD(Iterable<? extends zza> iterable) {
            zzH();
            zzgvs.zzaQ(iterable, this.zzd);
        }

        public void zzE(zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(zzaVar);
        }

        public void zzF(int i, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(i, zzaVar);
        }

        public void zzG() {
            this.zzd = zzgxr.zzbK();
        }

        private void zzH() {
            zzgyd<zza> zzgydVar = this.zzd;
            if (!zzgydVar.zzc()) {
                this.zzd = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzI(int i) {
            zzH();
            this.zzd.remove(i);
        }

        public void zzJ(int i, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.set(i, zzaVar);
        }

        public static zzc zzd() {
            return zzb.zzaZ();
        }

        public static zzc zzf(zzb zzbVar) {
            return zzb.zzba(zzbVar);
        }

        public static zzb zzh() {
            return zzb;
        }

        public static zzb zzi(InputStream inputStream) throws IOException {
            return (zzb) zzgxr.zzbk(zzb, inputStream);
        }

        public static zzb zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzb) zzgxr.zzbl(zzb, inputStream, zzgxbVar);
        }

        public static zzb zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzb) zzgxr.zzbm(zzb, zzgwjVar);
        }

        public static zzb zzm(zzgwp zzgwpVar) throws IOException {
            return (zzb) zzgxr.zzbn(zzb, zzgwpVar);
        }

        public static zzb zzn(InputStream inputStream) throws IOException {
            return (zzb) zzgxr.zzbo(zzb, inputStream);
        }

        public static zzb zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzb) zzgxr.zzbp(zzb, byteBuffer);
        }

        public static zzb zzp(byte[] bArr) throws zzgyg {
            return (zzb) zzgxr.zzbq(zzb, bArr);
        }

        public static zzb zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzb) zzgxr.zzbr(zzb, zzgwjVar, zzgxbVar);
        }

        public static zzb zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzb) zzgxr.zzbs(zzb, zzgwpVar, zzgxbVar);
        }

        public static zzb zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzb) zzgxr.zzbu(zzb, inputStream, zzgxbVar);
        }

        public static zzb zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzb) zzgxr.zzbv(zzb, byteBuffer, zzgxbVar);
        }

        public static zzb zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzb) zzgxr.zzbx(zzb, bArr, zzgxbVar);
        }

        public static zzgzk<zzb> zzv() {
            return zzb.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzc
        public int zza() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzc
        public zza zzb(int i) {
            return this.zzd.get(i);
        }

        public InterfaceC45355zzb zzc(int i) {
            return this.zzd.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzb> zzgzkVar = zzc;
                                    if (zzgzkVar == null) {
                                        synchronized (zzb.class) {
                                            zzgzkVar = zzc;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzb);
                                                zzc = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzb;
                        }
                        return new zzc();
                    }
                    return new zzb();
                }
                return zzgxr.zzbQ(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzc
        public List<zza> zzl() {
            return this.zzd;
        }

        public List<? extends InterfaceC45355zzb> zzw() {
            return this.zzd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzba extends zzgxr<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzgzk<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzba, zza> implements zzbb {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public int zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public int zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public int zzc() {
                return ((zzba) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public zzq zzd() {
                return ((zzba) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public zzaw zze() {
                return ((zzba) this.zza).zze();
            }

            public zza zzf() {
                zzbu();
                ((zzba) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzba) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzba) this.zza).zzO();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzba) this.zza).zzP();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzba) this.zza).zzQ();
                return this;
            }

            public zza zzk(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzba) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzo(int i) {
                zzbu();
                ((zzba) this.zza).zzU(i);
                return this;
            }

            public zza zzp(int i) {
                zzbu();
                ((zzba) this.zza).zzV(i);
                return this;
            }

            public zza zzq(int i) {
                zzbu();
                ((zzba) this.zza).zzW(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public boolean zzr() {
                return ((zzba) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public boolean zzt() {
                return ((zzba) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public boolean zzu() {
                return ((zzba) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
            public boolean zzv() {
                return ((zzba) this.zza).zzv();
            }

            private zza() {
                super(zzba.zzf);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzgxr.zzbZ(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static zzgzk<zzba> zzA() {
            return zzf.zzbN();
        }

        public void zzM() {
            this.zzj = null;
            this.zzh &= -3;
        }

        public void zzN() {
            this.zzh &= -2;
            this.zzi = 1000;
        }

        public void zzO() {
            this.zzh &= -17;
            this.zzm = 0;
        }

        public void zzP() {
            this.zzh &= -5;
            this.zzk = 0;
        }

        public void zzQ() {
            this.zzh &= -9;
            this.zzl = 0;
        }

        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzh |= 1;
        }

        public void zzU(int i) {
            this.zzh |= 16;
            this.zzm = i;
        }

        public void zzV(int i) {
            this.zzh |= 4;
            this.zzk = i;
        }

        public void zzW(int i) {
            this.zzh |= 8;
            this.zzl = i;
        }

        public static zza zzf() {
            return zzf.zzaZ();
        }

        public static zza zzg(zzba zzbaVar) {
            return zzf.zzba(zzbaVar);
        }

        public static zzba zzi() {
            return zzf;
        }

        public static zzba zzj(InputStream inputStream) throws IOException {
            return (zzba) zzgxr.zzbk(zzf, inputStream);
        }

        public static zzba zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzba) zzgxr.zzbl(zzf, inputStream, zzgxbVar);
        }

        public static zzba zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzba) zzgxr.zzbm(zzf, zzgwjVar);
        }

        public static zzba zzm(zzgwp zzgwpVar) throws IOException {
            return (zzba) zzgxr.zzbn(zzf, zzgwpVar);
        }

        public static zzba zzn(InputStream inputStream) throws IOException {
            return (zzba) zzgxr.zzbo(zzf, inputStream);
        }

        public static zzba zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzba) zzgxr.zzbp(zzf, byteBuffer);
        }

        public static zzba zzp(byte[] bArr) throws zzgyg {
            return (zzba) zzgxr.zzbq(zzf, bArr);
        }

        public static zzba zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzba) zzgxr.zzbr(zzf, zzgwjVar, zzgxbVar);
        }

        public static zzba zzw(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzba) zzgxr.zzbs(zzf, zzgwpVar, zzgxbVar);
        }

        public static zzba zzx(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzba) zzgxr.zzbu(zzf, inputStream, zzgxbVar);
        }

        public static zzba zzy(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzba) zzgxr.zzbv(zzf, byteBuffer, zzgxbVar);
        }

        public static zzba zzz(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzba) zzgxr.zzbx(zzf, bArr, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public int zza() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public int zzb() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public int zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public zzq zzd() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzba> zzgzkVar = zzg;
                                    if (zzgzkVar == null) {
                                        synchronized (zzba.class) {
                                            zzgzkVar = zzg;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzf);
                                                zzg = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza();
                    }
                    return new zzba();
                }
                return zzgxr.zzbQ(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public zzaw zze() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public boolean zzr() {
            if ((this.zzh & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public boolean zzs() {
            if ((this.zzh & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public boolean zzt() {
            if ((this.zzh & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public boolean zzu() {
            if ((this.zzh & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbb
        public boolean zzv() {
            if ((this.zzh & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbb extends zzgzd {
        int zza();

        int zzb();

        int zzc();

        zzq zzd();

        zzaw zze();

        boolean zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzbc extends zzgxr<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzgzk<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzbc, zza> implements zzbd {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public zzq zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public zzap zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public zzaw zzc() {
                return ((zzbc) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbc) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbc) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbc) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbc) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public boolean zzn() {
                return ((zzbc) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public boolean zzo() {
                return ((zzbc) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
            public boolean zzp() {
                return ((zzbc) this.zza).zzp();
            }

            private zza() {
                super(zzbc.zzd);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzgxr.zzbZ(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzbc zzbcVar) {
            return zzd.zzba(zzbcVar);
        }

        public static zzbc zzh() {
            return zzd;
        }

        public static zzbc zzi(InputStream inputStream) throws IOException {
            return (zzbc) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzbc zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbc) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzbc zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzbc) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzbc zzl(zzgwp zzgwpVar) throws IOException {
            return (zzbc) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzbc zzq(ByteBuffer byteBuffer) throws zzgyg {
            return (zzbc) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzbc zzr(byte[] bArr) throws zzgyg {
            return (zzbc) zzgxr.zzbq(zzd, bArr);
        }

        public static zzbc zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzbc) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzbc zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzbc) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzbc zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbc) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzbc zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzbc) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzbc zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzbc) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public static zzgzk<zzbc> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzbc> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzbc.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzbc();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbd
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbd extends zzgzd {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzbe extends zzgxr<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzgzk<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzbe, zza> implements zzbf {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public int zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public int zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public int zzc() {
                return ((zzbe) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public long zzd() {
                return ((zzbe) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public zzq zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg() {
                zzbu();
                ((zzbe) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzbe) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzbe) this.zza).zzS();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzbe) this.zza).zzT();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzbe) this.zza).zzU();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzbe) this.zza).zzV();
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzW(zzawVar);
                return this;
            }

            public zza zzn(long j) {
                zzbu();
                ((zzbe) this.zza).zzX(j);
                return this;
            }

            public zza zzo(zzaw.zza zzaVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzp(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzawVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzbe) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzr(int i) {
                zzbu();
                ((zzbe) this.zza).zzaa(i);
                return this;
            }

            public zza zzs(int i) {
                zzbu();
                ((zzbe) this.zza).zzab(i);
                return this;
            }

            public zza zzt(int i) {
                zzbu();
                ((zzbe) this.zza).zzac(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzu() {
                return ((zzbe) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzv() {
                return ((zzbe) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzx() {
                return ((zzbe) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzy() {
                return ((zzbe) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
            public boolean zzz() {
                return ((zzbe) this.zza).zzz();
            }

            private zza() {
                super(zzbe.zzg);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzgxr.zzbZ(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzbe) zzgxr.zzbv(zzg, byteBuffer, zzgxbVar);
        }

        public static zzbe zzB(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzbe) zzgxr.zzbx(zzg, bArr, zzgxbVar);
        }

        public static zzgzk<zzbe> zzC() {
            return zzg.zzbN();
        }

        public void zzQ() {
            this.zzi &= -33;
            this.zzo = 0L;
        }

        public void zzR() {
            this.zzk = null;
            this.zzi &= -3;
        }

        public void zzS() {
            this.zzi &= -2;
            this.zzj = 1000;
        }

        public void zzT() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        public void zzU() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        public void zzV() {
            this.zzi &= -9;
            this.zzm = 0;
        }

        public void zzW(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzk;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        public void zzX(long j) {
            this.zzi |= 32;
            this.zzo = j;
        }

        public void zzY(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        public void zzZ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzi |= 1;
        }

        public void zzaa(int i) {
            this.zzi |= 16;
            this.zzn = i;
        }

        public void zzab(int i) {
            this.zzi |= 4;
            this.zzl = i;
        }

        public void zzac(int i) {
            this.zzi |= 8;
            this.zzm = i;
        }

        public static zza zzg() {
            return zzg.zzaZ();
        }

        public static zza zzh(zzbe zzbeVar) {
            return zzg.zzba(zzbeVar);
        }

        public static zzbe zzj() {
            return zzg;
        }

        public static zzbe zzk(InputStream inputStream) throws IOException {
            return (zzbe) zzgxr.zzbk(zzg, inputStream);
        }

        public static zzbe zzl(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbe) zzgxr.zzbl(zzg, inputStream, zzgxbVar);
        }

        public static zzbe zzm(zzgwj zzgwjVar) throws zzgyg {
            return (zzbe) zzgxr.zzbm(zzg, zzgwjVar);
        }

        public static zzbe zzn(zzgwp zzgwpVar) throws IOException {
            return (zzbe) zzgxr.zzbn(zzg, zzgwpVar);
        }

        public static zzbe zzo(InputStream inputStream) throws IOException {
            return (zzbe) zzgxr.zzbo(zzg, inputStream);
        }

        public static zzbe zzp(ByteBuffer byteBuffer) throws zzgyg {
            return (zzbe) zzgxr.zzbp(zzg, byteBuffer);
        }

        public static zzbe zzq(byte[] bArr) throws zzgyg {
            return (zzbe) zzgxr.zzbq(zzg, bArr);
        }

        public static zzbe zzr(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzbe) zzgxr.zzbr(zzg, zzgwjVar, zzgxbVar);
        }

        public static zzbe zzs(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzbe) zzgxr.zzbs(zzg, zzgwpVar, zzgxbVar);
        }

        public static zzbe zzt(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbe) zzgxr.zzbu(zzg, inputStream, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public int zza() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public int zzc() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public long zzd() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzbe> zzgzkVar = zzh;
                                    if (zzgzkVar == null) {
                                        synchronized (zzbe.class) {
                                            zzgzkVar = zzh;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzg);
                                                zzh = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzg;
                        }
                        return new zza();
                    }
                    return new zzbe();
                }
                return zzgxr.zzbQ(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public zzq zze() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzk;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzu() {
            if ((this.zzi & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzv() {
            if ((this.zzi & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzw() {
            if ((this.zzi & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzx() {
            if ((this.zzi & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzy() {
            if ((this.zzi & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbf
        public boolean zzz() {
            if ((this.zzi & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbf extends zzgzd {
        int zza();

        int zzb();

        int zzc();

        long zzd();

        zzq zze();

        zzaw zzf();

        boolean zzu();

        boolean zzv();

        boolean zzw();

        boolean zzx();

        boolean zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzbg extends zzgxr<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzgzk<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzbg, zza> implements zzbh {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public zzq zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public zzap zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public zzaw zzc() {
                return ((zzbg) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbg) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbg) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbg) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbg) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public boolean zzn() {
                return ((zzbg) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public boolean zzo() {
                return ((zzbg) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
            public boolean zzp() {
                return ((zzbg) this.zza).zzp();
            }

            private zza() {
                super(zzbg.zzd);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzgxr.zzbZ(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzbg zzbgVar) {
            return zzd.zzba(zzbgVar);
        }

        public static zzbg zzh() {
            return zzd;
        }

        public static zzbg zzi(InputStream inputStream) throws IOException {
            return (zzbg) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzbg zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbg) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzbg zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzbg) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzbg zzl(zzgwp zzgwpVar) throws IOException {
            return (zzbg) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzbg zzq(ByteBuffer byteBuffer) throws zzgyg {
            return (zzbg) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzbg zzr(byte[] bArr) throws zzgyg {
            return (zzbg) zzgxr.zzbq(zzd, bArr);
        }

        public static zzbg zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzbg) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzbg zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzbg) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzbg zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbg) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzbg zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzbg) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzbg zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzbg) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public static zzgzk<zzbg> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzbg> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzbg.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzbg();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbh
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbh extends zzgzd {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbi extends zzgzd {
        int zza();

        boolean zzaA();

        boolean zzaB();

        zzau zzaf();

        zzay zzag();

        zzba zzah();

        zzbc zzai();

        zzbe zzaj();

        zzbg zzak();

        zzbj zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        boolean zzaw();

        boolean zzax();

        boolean zzay();

        boolean zzaz();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        long zzh();

        zzap zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzbj extends zzgxr<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzgzk<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzbj, zza> implements zzbk {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
            public zzq zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
            public zzaw zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzbj) this.zza).zzB();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzbj) this.zza).zzC();
                return this;
            }

            public zza zze(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzf(zzaw.zza zzaVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzq zzqVar) {
                zzbu();
                ((zzbj) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
            public boolean zzi() {
                return ((zzbj) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
            public boolean zzj() {
                return ((zzbj) this.zza).zzj();
            }

            private zza() {
                super(zzbj.zzc);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzgxr.zzbZ(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        public void zzC() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzb2 = zzaw.zzb(zzawVar2);
                zzb2.zzbj(zzawVar);
                zzawVar = zzb2.zzbs();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzbj zzbjVar) {
            return zzc.zzba(zzbjVar);
        }

        public static zzbj zzg() {
            return zzc;
        }

        public static zzbj zzh(InputStream inputStream) throws IOException {
            return (zzbj) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzbj zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbj) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzbj zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzbj) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzbj zzm(zzgwp zzgwpVar) throws IOException {
            return (zzbj) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzbj zzn(InputStream inputStream) throws IOException {
            return (zzbj) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzbj zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzbj) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzbj zzp(byte[] bArr) throws zzgyg {
            return (zzbj) zzgxr.zzbq(zzc, bArr);
        }

        public static zzbj zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzbj) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzbj zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzbj) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzbj zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbj) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzbj zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzbj) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzbj zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzbj) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzbj> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
        public zzaw zzb() {
            zzaw zzawVar = this.zzg;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzbj> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzbj.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzbj();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbk
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbk extends zzgzd {
        zzq zza();

        zzaw zzb();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzbl extends zzgxr<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzgzk<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzbl, zza> implements zzbm {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
            public int zza() {
                return ((zzbl) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzbl) this.zza).zzA();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzbl) this.zza).zzB();
                return this;
            }

            public zza zzd(boolean z) {
                zzbu();
                ((zzbl) this.zza).zzC(z);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzbl) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
            public boolean zzf() {
                return ((zzbl) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
            public boolean zzg() {
                return ((zzbl) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
            public boolean zzh() {
                return ((zzbl) this.zza).zzh();
            }

            private zza() {
                super(zzbl.zzc);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzgxr.zzbZ(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        public void zzA() {
            this.zze &= -2;
            this.zzf = false;
        }

        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        public void zzC(boolean z) {
            this.zze |= 1;
            this.zzf = z;
        }

        public void zzD(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public static zza zzb() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzbl zzblVar) {
            return zzc.zzba(zzblVar);
        }

        public static zzbl zzi() {
            return zzc;
        }

        public static zzbl zzj(InputStream inputStream) throws IOException {
            return (zzbl) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzbl zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbl) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzbl zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzbl) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzbl zzm(zzgwp zzgwpVar) throws IOException {
            return (zzbl) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzbl zzn(InputStream inputStream) throws IOException {
            return (zzbl) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzbl zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzbl) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzbl zzp(byte[] bArr) throws zzgyg {
            return (zzbl) zzgxr.zzbq(zzc, bArr);
        }

        public static zzbl zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzbl) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzbl zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzbl) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzbl zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzbl) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzbl zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzbl) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzbl zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzbl) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzbl> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzbl> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzbl.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzbl();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
        public boolean zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
        public boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzbm
        public boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzbm extends zzgzd {
        int zza();

        boolean zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzc extends zzgzd {
        int zza();

        zzb.zza zzb(int i);

        List<zzb.zza> zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzd extends zzgxr<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzgzk<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zza implements zzgxv {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzgxw<zza> zzw = new zzgxw<zza>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzd.zza.1
                /* renamed from: zza */
                public zza zzb(int i) {
                    return zza.zzb(i);
                }
            };
            private final int zzy;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbq$zzd$zza$zza */
            /* loaded from: classes5.dex */
            public final class C45356zza implements zzgxx {
                static final zzgxx zza = new C45356zza();

                private C45356zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zza.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zza(int i) {
                this.zzy = i;
            }

            public static zza zzb(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzgxw<zza> zzd() {
                return zzw;
            }

            public static zzgxx zze() {
                return C45356zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzy;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zzb extends zzgxl<zzd, zzb> implements zze {
            @Override // com.google.android.gms.internal.ads.zzbbq.zze
            public zza zza() {
                return ((zzd) this.zza).zza();
            }

            public zzb zzb() {
                zzbu();
                ((zzd) this.zza).zzB();
                return this;
            }

            public zzb zzc() {
                zzbu();
                ((zzd) this.zza).zzC();
                return this;
            }

            public zzb zzd(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzD(zzalVar);
                return this;
            }

            public zzb zze(zzal.zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zzb zzf(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzalVar);
                return this;
            }

            public zzb zzg(zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzF(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zze
            public zzal zzh() {
                return ((zzd) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zze
            public boolean zzi() {
                return ((zzd) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zze
            public boolean zzj() {
                return ((zzd) this.zza).zzj();
            }

            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzgxr.zzbZ(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        public void zzD(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zzg;
            if (zzalVar2 != null && zzalVar2 != zzal.zzi()) {
                zzal.zza zzd2 = zzal.zzd(zzalVar2);
                zzd2.zzbj(zzalVar);
                zzalVar = zzd2.zzbs();
            }
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        public void zzE(zzal zzalVar) {
            zzalVar.getClass();
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        public void zzF(zza zzaVar) {
            this.zzf = zzaVar.zza();
            this.zze |= 1;
        }

        public static zzb zzb() {
            return zzc.zzaZ();
        }

        public static zzb zzc(zzd zzdVar) {
            return zzc.zzba(zzdVar);
        }

        public static zzd zzf() {
            return zzc;
        }

        public static zzd zzg(InputStream inputStream) throws IOException {
            return (zzd) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzd zzk(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzd) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzd zzl(zzgwj zzgwjVar) throws zzgyg {
            return (zzd) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzd zzm(zzgwp zzgwpVar) throws IOException {
            return (zzd) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzd zzn(InputStream inputStream) throws IOException {
            return (zzd) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzd zzo(ByteBuffer byteBuffer) throws zzgyg {
            return (zzd) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzd zzp(byte[] bArr) throws zzgyg {
            return (zzd) zzgxr.zzbq(zzc, bArr);
        }

        public static zzd zzq(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzd) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzd zzr(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzd) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzd zzs(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzd) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzd zzt(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzd) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzd zzu(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzd) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzd> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zze
        public zza zza() {
            zza zzb2 = zza.zzb(this.zzf);
            if (zzb2 == null) {
                return zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzd> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzd.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zzb();
                    }
                    return new zzd();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.zze(), "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zze
        public zzal zzh() {
            zzal zzalVar = this.zzg;
            if (zzalVar == null) {
                return zzal.zzi();
            }
            return zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zze
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zze
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zze extends zzgzd {
        zzd.zza zza();

        zzal zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzf extends zzgzd {
        int zza();

        zzd zzab(int i);

        zzg zzac();

        zzi zzad();

        zzk zzae();

        zzq zzaf();

        zzx zzag();

        zzz zzah();

        zzac zzai();

        zzah zzaj();

        zzat zzak(int i);

        List<zzd> zzal();

        List<zzat> zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        int zzb();

        zza.EnumC45351zza zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzg extends zzgxr<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzgzk<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzgyd<zzd> zzh = zzgxr.zzbK();
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzg, zza> implements zzh {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public int zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public zzd zzb(int i) {
                return ((zzg) this.zza).zzb(i);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzg) this.zza).zzN(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzdVar);
                return this;
            }

            public zza zzf(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzP(i, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzP(i, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzg) this.zza).zzQ();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzg) this.zza).zzR();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzg) this.zza).zzS();
                return this;
            }

            public zza zzk(int i) {
                zzbu();
                ((zzg) this.zza).zzU(i);
                return this;
            }

            public zza zzl(String str) {
                zzbu();
                ((zzg) this.zza).zzV(str);
                return this;
            }

            public zza zzm(zzgwj zzgwjVar) {
                zzbu();
                ((zzg) this.zza).zzW(zzgwjVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzg) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzo(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzY(i, zzbVar.zzbr());
                return this;
            }

            public zza zzp(int i, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzY(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public zzq zzq() {
                return ((zzg) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public zzgwj zzr() {
                return ((zzg) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public String zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public List<zzd> zzt() {
                return Collections.unmodifiableList(((zzg) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public boolean zzu() {
                return ((zzg) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzh
            public boolean zzv() {
                return ((zzg) this.zza).zzv();
            }

            private zza() {
                super(zzg.zzd);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzgxr.zzbZ(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzgzk<zzg> zzA() {
            return zzd.zzbN();
        }

        public void zzN(Iterable<? extends zzd> iterable) {
            zzT();
            zzgvs.zzaQ(iterable, this.zzh);
        }

        public void zzO(zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(zzdVar);
        }

        public void zzP(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(i, zzdVar);
        }

        public void zzQ() {
            this.zzf &= -2;
            this.zzg = zzh().zzs();
        }

        public void zzR() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        public void zzS() {
            this.zzh = zzgxr.zzbK();
        }

        private void zzT() {
            zzgyd<zzd> zzgydVar = this.zzh;
            if (!zzgydVar.zzc()) {
                this.zzh = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzU(int i) {
            zzT();
            this.zzh.remove(i);
        }

        public void zzV(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        public void zzW(zzgwj zzgwjVar) {
            this.zzg = zzgwjVar.zzx();
            this.zzf |= 1;
        }

        public void zzX(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        public void zzY(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.set(i, zzdVar);
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zzf(zzg zzgVar) {
            return zzd.zzba(zzgVar);
        }

        public static zzg zzh() {
            return zzd;
        }

        public static zzg zzi(InputStream inputStream) throws IOException {
            return (zzg) zzgxr.zzbk(zzd, inputStream);
        }

        public static zzg zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzg) zzgxr.zzbl(zzd, inputStream, zzgxbVar);
        }

        public static zzg zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzg) zzgxr.zzbm(zzd, zzgwjVar);
        }

        public static zzg zzl(zzgwp zzgwpVar) throws IOException {
            return (zzg) zzgxr.zzbn(zzd, zzgwpVar);
        }

        public static zzg zzm(InputStream inputStream) throws IOException {
            return (zzg) zzgxr.zzbo(zzd, inputStream);
        }

        public static zzg zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzg) zzgxr.zzbp(zzd, byteBuffer);
        }

        public static zzg zzo(byte[] bArr) throws zzgyg {
            return (zzg) zzgxr.zzbq(zzd, bArr);
        }

        public static zzg zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzg) zzgxr.zzbr(zzd, zzgwjVar, zzgxbVar);
        }

        public static zzg zzw(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzg) zzgxr.zzbs(zzd, zzgwpVar, zzgxbVar);
        }

        public static zzg zzx(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzg) zzgxr.zzbu(zzd, inputStream, zzgxbVar);
        }

        public static zzg zzy(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzg) zzgxr.zzbv(zzd, byteBuffer, zzgxbVar);
        }

        public static zzg zzz(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzg) zzgxr.zzbx(zzd, bArr, zzgxbVar);
        }

        public List<? extends zze> zzB() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public int zza() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public zzd zzb(int i) {
            return this.zzh.get(i);
        }

        public zze zzc(int i) {
            return this.zzh.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzg> zzgzkVar = zze;
                                    if (zzgzkVar == null) {
                                        synchronized (zzg.class) {
                                            zzgzkVar = zze;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzd);
                                                zze = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza();
                    }
                    return new zzg();
                }
                return zzgxr.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public zzq zzq() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public zzgwj zzr() {
            return zzgwj.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public String zzs() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public List<zzd> zzt() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public boolean zzu() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzh
        public boolean zzv() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzh extends zzgzd {
        int zza();

        zzd zzb(int i);

        zzq zzq();

        zzgwj zzr();

        String zzs();

        List<zzd> zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzi extends zzgxr<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzgzk<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzgyd<zzd> zzj = zzgxr.zzbK();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzi, zza> implements zzj {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public boolean zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public boolean zzC() {
                return ((zzi) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public boolean zzD() {
                return ((zzi) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public int zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public zzd zzb(int i) {
                return ((zzi) this.zza).zzb(i);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzi) this.zza).zzV(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzdVar);
                return this;
            }

            public zza zzf(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzX(i, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzX(i, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzi) this.zza).zzY();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzi) this.zza).zzZ();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzi) this.zza).zzaa();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzi) this.zza).zzab();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzi) this.zza).zzac();
                return this;
            }

            public zza zzm(int i) {
                zzbu();
                ((zzi) this.zza).zzae(i);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaf(zzqVar);
                return this;
            }

            public zza zzo(String str) {
                zzbu();
                ((zzi) this.zza).zzag(str);
                return this;
            }

            public zza zzp(zzgwj zzgwjVar) {
                zzbu();
                ((zzi) this.zza).zzah(zzgwjVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzai(zzqVar);
                return this;
            }

            public zza zzr(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaj(zzqVar);
                return this;
            }

            public zza zzs(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzak(i, zzbVar.zzbr());
                return this;
            }

            public zza zzt(int i, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzak(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public zzq zzu() {
                return ((zzi) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public zzq zzv() {
                return ((zzi) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public zzq zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public zzgwj zzx() {
                return ((zzi) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public String zzy() {
                return ((zzi) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzj
            public List<zzd> zzz() {
                return Collections.unmodifiableList(((zzi) this.zza).zzz());
            }

            private zza() {
                super(zzi.zzf);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzgxr.zzbZ(zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zzgzk<zzi> zzE() {
            return zzf.zzbN();
        }

        public void zzV(Iterable<? extends zzd> iterable) {
            zzad();
            zzgvs.zzaQ(iterable, this.zzj);
        }

        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(zzdVar);
        }

        public void zzX(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(i, zzdVar);
        }

        public void zzY() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        public void zzZ() {
            this.zzh &= -2;
            this.zzi = zzh().zzy();
        }

        public void zzaa() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        public void zzab() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        public void zzac() {
            this.zzj = zzgxr.zzbK();
        }

        private void zzad() {
            zzgyd<zzd> zzgydVar = this.zzj;
            if (!zzgydVar.zzc()) {
                this.zzj = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzae(int i) {
            zzad();
            this.zzj.remove(i);
        }

        public void zzaf(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzh |= 8;
        }

        public void zzag(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        public void zzah(zzgwj zzgwjVar) {
            this.zzi = zzgwjVar.zzx();
            this.zzh |= 1;
        }

        public void zzai(zzq zzqVar) {
            this.zzl = zzqVar.zza();
            this.zzh |= 4;
        }

        public void zzaj(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzh |= 2;
        }

        public void zzak(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.set(i, zzdVar);
        }

        public static zza zzd() {
            return zzf.zzaZ();
        }

        public static zza zzf(zzi zziVar) {
            return zzf.zzba(zziVar);
        }

        public static zzi zzh() {
            return zzf;
        }

        public static zzi zzi(InputStream inputStream) throws IOException {
            return (zzi) zzgxr.zzbk(zzf, inputStream);
        }

        public static zzi zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzi) zzgxr.zzbl(zzf, inputStream, zzgxbVar);
        }

        public static zzi zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzi) zzgxr.zzbm(zzf, zzgwjVar);
        }

        public static zzi zzl(zzgwp zzgwpVar) throws IOException {
            return (zzi) zzgxr.zzbn(zzf, zzgwpVar);
        }

        public static zzi zzm(InputStream inputStream) throws IOException {
            return (zzi) zzgxr.zzbo(zzf, inputStream);
        }

        public static zzi zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzi) zzgxr.zzbp(zzf, byteBuffer);
        }

        public static zzi zzo(byte[] bArr) throws zzgyg {
            return (zzi) zzgxr.zzbq(zzf, bArr);
        }

        public static zzi zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzi) zzgxr.zzbr(zzf, zzgwjVar, zzgxbVar);
        }

        public static zzi zzq(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzi) zzgxr.zzbs(zzf, zzgwpVar, zzgxbVar);
        }

        public static zzi zzr(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzi) zzgxr.zzbu(zzf, inputStream, zzgxbVar);
        }

        public static zzi zzs(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzi) zzgxr.zzbv(zzf, byteBuffer, zzgxbVar);
        }

        public static zzi zzt(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzi) zzgxr.zzbx(zzf, bArr, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public boolean zzA() {
            if ((this.zzh & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public boolean zzB() {
            if ((this.zzh & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public boolean zzC() {
            if ((this.zzh & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public boolean zzD() {
            if ((this.zzh & 2) != 0) {
                return true;
            }
            return false;
        }

        public List<? extends zze> zzF() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public int zza() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public zzd zzb(int i) {
            return this.zzj.get(i);
        }

        public zze zzc(int i) {
            return this.zzj.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzi> zzgzkVar = zzg;
                                    if (zzgzkVar == null) {
                                        synchronized (zzi.class) {
                                            zzgzkVar = zzg;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzf);
                                                zzg = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza();
                    }
                    return new zzi();
                }
                return zzgxr.zzbQ(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.zze(), "zzl", zzq.zze(), "zzm", zzq.zze()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public zzq zzu() {
            zzq zzb2 = zzq.zzb(this.zzm);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public zzq zzv() {
            zzq zzb2 = zzq.zzb(this.zzl);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public zzq zzw() {
            zzq zzb2 = zzq.zzb(this.zzk);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public zzgwj zzx() {
            return zzgwj.zzw(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public String zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzj
        public List<zzd> zzz() {
            return this.zzj;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzj extends zzgzd {
        boolean zzA();

        boolean zzB();

        boolean zzC();

        boolean zzD();

        int zza();

        zzd zzb(int i);

        zzq zzu();

        zzq zzv();

        zzq zzw();

        zzgwj zzx();

        String zzy();

        List<zzd> zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzk extends zzgxr<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzgzk<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzgyd<zzap> zzn = zzgxr.zzbK();
        private int zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzk, zza> implements zzl {
            public zza zzA(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzB(int i) {
                zzbu();
                ((zzk) this.zza).zzat(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public zzap zzC() {
                return ((zzk) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public zzap zzD() {
                return ((zzk) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public zzap zzE(int i) {
                return ((zzk) this.zza).zzE(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public zzap zzF() {
                return ((zzk) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public List<zzap> zzG() {
                return Collections.unmodifiableList(((zzk) this.zza).zzG());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public boolean zzH() {
                return ((zzk) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public boolean zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public boolean zzK() {
                return ((zzk) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public boolean zzL() {
                return ((zzk) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public int zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzl
            public int zzc() {
                return ((zzk) this.zza).zzc();
            }

            public zza zzd(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzaVar.zzbr());
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzf(int i, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzab(i, zzaVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzab(i, zzapVar);
                return this;
            }

            public zza zzh(Iterable<? extends zzap> iterable) {
                zzbu();
                ((zzk) this.zza).zzac(iterable);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzk) this.zza).zzad();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzk) this.zza).zzae();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzk) this.zza).zzaf();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzk) this.zza).zzag();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzk) this.zza).zzah();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzk) this.zza).zzai();
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzp(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzal(zzapVar);
                return this;
            }

            public zza zzq(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzam(zzapVar);
                return this;
            }

            public zza zzr(int i) {
                zzbu();
                ((zzk) this.zza).zzan(i);
                return this;
            }

            public zza zzs(int i) {
                zzbu();
                ((zzk) this.zza).zzao(i);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzaVar.zzbr());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzapVar);
                return this;
            }

            public zza zzv(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzapVar);
                return this;
            }

            public zza zzx(int i, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzar(i, zzaVar.zzbr());
                return this;
            }

            public zza zzy(int i, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzar(i, zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzaVar.zzbr());
                return this;
            }

            private zza() {
                super(zzk.zzg);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzgxr.zzbZ(zzk.class, zzkVar);
        }

        private zzk() {
        }

        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(zzapVar);
        }

        public void zzab(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(i, zzapVar);
        }

        public void zzac(Iterable<? extends zzap> iterable) {
            zzaj();
            zzgvs.zzaQ(iterable, this.zzn);
        }

        public void zzad() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        public void zzae() {
            this.zzl = null;
            this.zzi &= -5;
        }

        public void zzaf() {
            this.zzk = null;
            this.zzi &= -3;
        }

        public void zzag() {
            this.zzn = zzgxr.zzbK();
        }

        public void zzah() {
            this.zzm = null;
            this.zzi &= -9;
        }

        public void zzai() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        private void zzaj() {
            zzgyd<zzap> zzgydVar = this.zzn;
            if (!zzgydVar.zzc()) {
                this.zzn = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        public void zzal(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        public void zzam(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        public void zzan(int i) {
            zzaj();
            this.zzn.remove(i);
        }

        public void zzao(int i) {
            this.zzi |= 1;
            this.zzj = i;
        }

        public void zzap(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        public void zzaq(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        public void zzar(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.set(i, zzapVar);
        }

        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        public void zzat(int i) {
            this.zzi |= 16;
            this.zzo = i;
        }

        public static zza zzd() {
            return zzg.zzaZ();
        }

        public static zza zzf(zzk zzkVar) {
            return zzg.zzba(zzkVar);
        }

        public static zzk zzh() {
            return zzg;
        }

        public static zzk zzi(InputStream inputStream) throws IOException {
            return (zzk) zzgxr.zzbk(zzg, inputStream);
        }

        public static zzk zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzk) zzgxr.zzbl(zzg, inputStream, zzgxbVar);
        }

        public static zzk zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzk) zzgxr.zzbm(zzg, zzgwjVar);
        }

        public static zzk zzl(zzgwp zzgwpVar) throws IOException {
            return (zzk) zzgxr.zzbn(zzg, zzgwpVar);
        }

        public static zzk zzm(InputStream inputStream) throws IOException {
            return (zzk) zzgxr.zzbo(zzg, inputStream);
        }

        public static zzk zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzk) zzgxr.zzbp(zzg, byteBuffer);
        }

        public static zzk zzo(byte[] bArr) throws zzgyg {
            return (zzk) zzgxr.zzbq(zzg, bArr);
        }

        public static zzk zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzk) zzgxr.zzbr(zzg, zzgwjVar, zzgxbVar);
        }

        public static zzk zzq(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzk) zzgxr.zzbs(zzg, zzgwpVar, zzgxbVar);
        }

        public static zzk zzr(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzk) zzgxr.zzbu(zzg, inputStream, zzgxbVar);
        }

        public static zzk zzs(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzk) zzgxr.zzbv(zzg, byteBuffer, zzgxbVar);
        }

        public static zzk zzt(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzk) zzgxr.zzbx(zzg, bArr, zzgxbVar);
        }

        public static zzgzk<zzk> zzv() {
            return zzg.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public zzap zzC() {
            zzap zzapVar = this.zzl;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public zzap zzD() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public zzap zzE(int i) {
            return this.zzn.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public zzap zzF() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public List<zzap> zzG() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public boolean zzH() {
            if ((this.zzi & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public boolean zzI() {
            if ((this.zzi & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public boolean zzJ() {
            if ((this.zzi & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public boolean zzK() {
            if ((this.zzi & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public boolean zzL() {
            if ((this.zzi & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public int zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public int zzb() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzl
        public int zzc() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzk> zzgzkVar = zzh;
                                    if (zzgzkVar == null) {
                                        synchronized (zzk.class) {
                                            zzgzkVar = zzh;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzg);
                                                zzh = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzg;
                        }
                        return new zza();
                    }
                    return new zzk();
                }
                return zzgxr.zzbQ(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
            }
            return (byte) 1;
        }

        public zzaq zzu(int i) {
            return this.zzn.get(i);
        }

        public List<? extends zzaq> zzw() {
            return this.zzn;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzl extends zzgzd {
        zzap zzC();

        zzap zzD();

        zzap zzE(int i);

        zzap zzF();

        List<zzap> zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        int zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzm extends zzgxr<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzgzk<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzm, zza> implements zzn {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzap zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzar zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzgwj zzC() {
                return ((zzm) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public String zzD() {
                return ((zzm) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzG() {
                return ((zzm) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzH() {
                return ((zzm) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzK() {
                return ((zzm) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public boolean zzL() {
                return ((zzm) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public int zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public int zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzm) this.zza).zzac();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzm) this.zza).zzad();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzm) this.zza).zzae();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzm) this.zza).zzaf();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzm) this.zza).zzag();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzm) this.zza).zzah();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzm) this.zza).zzai();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzm) this.zza).zzaj();
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzl(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzal(zzarVar);
                return this;
            }

            public zza zzm(String str) {
                zzbu();
                ((zzm) this.zza).zzam(str);
                return this;
            }

            public zza zzn(zzgwj zzgwjVar) {
                zzbu();
                ((zzm) this.zza).zzan(zzgwjVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzao(zzqVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzap(zzqVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzqVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzapVar);
                return this;
            }

            public zza zzt(int i) {
                zzbu();
                ((zzm) this.zza).zzas(i);
                return this;
            }

            public zza zzu(int i) {
                zzbu();
                ((zzm) this.zza).zzat(i);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzq zzx() {
                return ((zzm) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzq zzy() {
                return ((zzm) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzn
            public zzq zzz() {
                return ((zzm) this.zza).zzz();
            }

            private zza() {
                super(zzm.zzi);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzgxr.zzbZ(zzm.class, zzmVar);
        }

        private zzm() {
        }

        public void zzac() {
            this.zzk &= -2;
            this.zzl = zzg().zzD();
        }

        public void zzad() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        public void zzae() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        public void zzaf() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        public void zzag() {
            this.zzm = null;
            this.zzk &= -3;
        }

        public void zzah() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        public void zzai() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        public void zzaj() {
            this.zzo = null;
            this.zzk &= -9;
        }

        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        public void zzal(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public void zzam(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        public void zzan(zzgwj zzgwjVar) {
            this.zzl = zzgwjVar.zzx();
            this.zzk |= 1;
        }

        public void zzao(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzk |= 32;
        }

        public void zzap(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzk |= 64;
        }

        public void zzaq(zzq zzqVar) {
            this.zzw = zzqVar.zza();
            this.zzk |= 128;
        }

        public void zzar(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        public void zzas(int i) {
            this.zzk |= 16;
            this.zzp = i;
        }

        public void zzat(int i) {
            this.zzk |= 4;
            this.zzn = i;
        }

        public void zzau(zzar zzarVar) {
            zzarVar.getClass();
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public static zza zzc() {
            return zzi.zzaZ();
        }

        public static zza zzd(zzm zzmVar) {
            return zzi.zzba(zzmVar);
        }

        public static zzm zzg() {
            return zzi;
        }

        public static zzm zzh(InputStream inputStream) throws IOException {
            return (zzm) zzgxr.zzbk(zzi, inputStream);
        }

        public static zzm zzi(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzm) zzgxr.zzbl(zzi, inputStream, zzgxbVar);
        }

        public static zzm zzj(zzgwj zzgwjVar) throws zzgyg {
            return (zzm) zzgxr.zzbm(zzi, zzgwjVar);
        }

        public static zzm zzk(zzgwp zzgwpVar) throws IOException {
            return (zzm) zzgxr.zzbn(zzi, zzgwpVar);
        }

        public static zzm zzl(InputStream inputStream) throws IOException {
            return (zzm) zzgxr.zzbo(zzi, inputStream);
        }

        public static zzm zzm(ByteBuffer byteBuffer) throws zzgyg {
            return (zzm) zzgxr.zzbp(zzi, byteBuffer);
        }

        public static zzm zzn(byte[] bArr) throws zzgyg {
            return (zzm) zzgxr.zzbq(zzi, bArr);
        }

        public static zzm zzo(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzm) zzgxr.zzbr(zzi, zzgwjVar, zzgxbVar);
        }

        public static zzm zzp(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzm) zzgxr.zzbs(zzi, zzgwpVar, zzgxbVar);
        }

        public static zzm zzq(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzm) zzgxr.zzbu(zzi, inputStream, zzgxbVar);
        }

        public static zzm zzr(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzm) zzgxr.zzbv(zzi, byteBuffer, zzgxbVar);
        }

        public static zzm zzs(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzm) zzgxr.zzbx(zzi, bArr, zzgxbVar);
        }

        public static zzgzk<zzm> zzt() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzap zzA() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzar zzB() {
            zzar zzarVar = this.zzo;
            if (zzarVar == null) {
                return zzar.zzh();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzgwj zzC() {
            return zzgwj.zzw(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public String zzD() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzE() {
            if ((this.zzk & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzF() {
            if ((this.zzk & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzG() {
            if ((this.zzk & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzH() {
            if ((this.zzk & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzI() {
            if ((this.zzk & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzJ() {
            if ((this.zzk & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzK() {
            if ((this.zzk & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public boolean zzL() {
            if ((this.zzk & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public int zzb() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzm> zzgzkVar = zzj;
                                    if (zzgzkVar == null) {
                                        synchronized (zzm.class) {
                                            zzgzkVar = zzj;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzi);
                                                zzj = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzi;
                        }
                        return new zza();
                    }
                    return new zzm();
                }
                return zzgxr.zzbQ(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.zze(), "zzv", zzq.zze(), "zzw", zzq.zze()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzq zzx() {
            zzq zzb2 = zzq.zzb(this.zzu);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzq zzy() {
            zzq zzb2 = zzq.zzb(this.zzv);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzn
        public zzq zzz() {
            zzq zzb2 = zzq.zzb(this.zzw);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzn extends zzgzd {
        zzap zzA();

        zzar zzB();

        zzgwj zzC();

        String zzD();

        boolean zzE();

        boolean zzF();

        boolean zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        zzq zzx();

        zzq zzy();

        zzq zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzo extends zzgxr<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzgzk<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzo, zza> implements zzp {
            public zza zza() {
                zzbu();
                ((zzo) this.zza).zzN();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzo) this.zza).zzO();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzo) this.zza).zzP();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzo) this.zza).zzQ();
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzo) this.zza).zzS(str);
                return this;
            }

            public zza zzg(zzgwj zzgwjVar) {
                zzbu();
                ((zzo) this.zza).zzT(zzgwjVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzj(zzb zzbVar) {
                zzbu();
                ((zzo) this.zza).zzV(zzbVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzo) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgwj zzgwjVar) {
                zzbu();
                ((zzo) this.zza).zzX(zzgwjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public zzb zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public zzar zzn() {
                return ((zzo) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public zzgwj zzo() {
                return ((zzo) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public zzgwj zzp() {
                return ((zzo) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public String zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public boolean zzs() {
                return ((zzo) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public boolean zzt() {
                return ((zzo) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public boolean zzu() {
                return ((zzo) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzp
            public boolean zzv() {
                return ((zzo) this.zza).zzv();
            }

            private zza() {
                super(zzo.zze);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public enum zzb implements zzgxv {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            
            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgxw<zzb> zzg = new zzgxw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzo.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
            /* loaded from: classes5.dex */
            public final class zza implements zzgxx {
                static final zzgxx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgxx
                public boolean zza(int i) {
                    if (zzb.zzb(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i) {
                this.zzi = i;
            }

            public static zzb zzb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ANDROID;
                    }
                    return IOS;
                }
                return PLATFORM_UNSPECIFIED;
            }

            public static zzgxw<zzb> zzd() {
                return zzg;
            }

            public static zzgxx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgxv
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzgxr.zzbZ(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzo zzA(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzo) zzgxr.zzbx(zze, bArr, zzgxbVar);
        }

        public static zzgzk<zzo> zzB() {
            return zze.zzbN();
        }

        public void zzN() {
            this.zzg &= -5;
            this.zzj = zzd().zzq();
        }

        public void zzO() {
            this.zzi = null;
            this.zzg &= -3;
        }

        public void zzP() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        public void zzQ() {
            this.zzg &= -9;
            this.zzk = zzd().zzr();
        }

        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        public void zzS(String str) {
            str.getClass();
            this.zzg |= 4;
            this.zzj = str;
        }

        public void zzT(zzgwj zzgwjVar) {
            this.zzj = zzgwjVar.zzx();
            this.zzg |= 4;
        }

        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        public void zzV(zzb zzbVar) {
            this.zzh = zzbVar.zza();
            this.zzg |= 1;
        }

        public void zzW(String str) {
            str.getClass();
            this.zzg |= 8;
            this.zzk = str;
        }

        public void zzX(zzgwj zzgwjVar) {
            this.zzk = zzgwjVar.zzx();
            this.zzg |= 8;
        }

        public static zza zza() {
            return zze.zzaZ();
        }

        public static zza zzb(zzo zzoVar) {
            return zze.zzba(zzoVar);
        }

        public static zzo zzd() {
            return zze;
        }

        public static zzo zzf(InputStream inputStream) throws IOException {
            return (zzo) zzgxr.zzbk(zze, inputStream);
        }

        public static zzo zzg(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzo) zzgxr.zzbl(zze, inputStream, zzgxbVar);
        }

        public static zzo zzh(zzgwj zzgwjVar) throws zzgyg {
            return (zzo) zzgxr.zzbm(zze, zzgwjVar);
        }

        public static zzo zzi(zzgwp zzgwpVar) throws IOException {
            return (zzo) zzgxr.zzbn(zze, zzgwpVar);
        }

        public static zzo zzj(InputStream inputStream) throws IOException {
            return (zzo) zzgxr.zzbo(zze, inputStream);
        }

        public static zzo zzk(ByteBuffer byteBuffer) throws zzgyg {
            return (zzo) zzgxr.zzbp(zze, byteBuffer);
        }

        public static zzo zzl(byte[] bArr) throws zzgyg {
            return (zzo) zzgxr.zzbq(zze, bArr);
        }

        public static zzo zzw(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzo) zzgxr.zzbr(zze, zzgwjVar, zzgxbVar);
        }

        public static zzo zzx(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzo) zzgxr.zzbs(zze, zzgwpVar, zzgxbVar);
        }

        public static zzo zzy(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzo) zzgxr.zzbu(zze, inputStream, zzgxbVar);
        }

        public static zzo zzz(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzo) zzgxr.zzbv(zze, byteBuffer, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzo> zzgzkVar = zzf;
                                    if (zzgzkVar == null) {
                                        synchronized (zzo.class) {
                                            zzgzkVar = zzf;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zze);
                                                zzf = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzo();
                }
                return zzgxr.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.zze(), "zzi", "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public zzb zzm() {
            zzb zzb2 = zzb.zzb(this.zzh);
            if (zzb2 == null) {
                return zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public zzar zzn() {
            zzar zzarVar = this.zzi;
            if (zzarVar == null) {
                return zzar.zzh();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public zzgwj zzo() {
            return zzgwj.zzw(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public zzgwj zzp() {
            return zzgwj.zzw(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public String zzq() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public String zzr() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public boolean zzs() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public boolean zzt() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public boolean zzu() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzp
        public boolean zzv() {
            if ((this.zzg & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzp extends zzgzd {
        zzo.zzb zzm();

        zzar zzn();

        zzgwj zzo();

        zzgwj zzp();

        String zzq();

        String zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public enum zzq implements zzgxv {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);
        
        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzgxw<zzq> zzg = new zzgxw<zzq>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzq.1
            /* renamed from: zza */
            public zzq zzb(int i) {
                return zzq.zzb(i);
            }
        };
        private final int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza implements zzgxx {
            static final zzgxx zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzgxx
            public boolean zza(int i) {
                if (zzq.zzb(i) != null) {
                    return true;
                }
                return false;
            }
        }

        zzq(int i) {
            this.zzi = i;
        }

        public static zzq zzb(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_TRUE;
            }
            return ENUM_FALSE;
        }

        public static zzgxw<zzq> zzd() {
            return zzg;
        }

        public static zzgxx zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(zza());
        }

        @Override // com.google.android.gms.internal.ads.zzgxv
        public final int zza() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzr extends zzgxr<zzr, zza> implements zzs {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private static final zzgya<zzd.zza> zzk = new zzgya<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzr.1
            @Override // com.google.android.gms.internal.ads.zzgya
            /* renamed from: zza */
            public zzd.zza zzb(int i) {
                zzd.zza zzb2 = zzd.zza.zzb(i);
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzgya<zzd.zza> zzl = new zzgya<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbq.zzr.2
            @Override // com.google.android.gms.internal.ads.zzgya
            /* renamed from: zza */
            public zzd.zza zzb(int i) {
                zzd.zza zzb2 = zzd.zza.zzb(i);
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzr zzm;
        private static volatile zzgzk<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzgxz zzB = zzgxr.zzbG();
        private zzgxz zzC = zzgxr.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzr, zza> implements zzs {
            public zza zzA(String str) {
                zzbu();
                ((zzr) this.zza).zzch(str);
                return this;
            }

            public zza zzB(zzgwj zzgwjVar) {
                zzbu();
                ((zzr) this.zza).zzci(zzgwjVar);
                return this;
            }

            public zza zzC(String str) {
                zzbu();
                ((zzr) this.zza).zzcj(str);
                return this;
            }

            public zza zzD(zzgwj zzgwjVar) {
                zzbu();
                ((zzr) this.zza).zzck(zzgwjVar);
                return this;
            }

            public zza zzE(int i) {
                zzbu();
                ((zzr) this.zza).zzcl(i);
                return this;
            }

            public zza zzF(zzar.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzaVar.zzbr());
                return this;
            }

            public zza zzG(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzarVar);
                return this;
            }

            public zza zzH(zzo.zzb zzbVar) {
                zzbu();
                ((zzr) this.zza).zzcn(zzbVar);
                return this;
            }

            public zza zzI(int i, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzco(i, zzaVar);
                return this;
            }

            public zza zzJ(int i, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcp(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzab.zzc zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzar zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzgwj zzM() {
                return ((zzr) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzgwj zzN() {
                return ((zzr) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzgwj zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public String zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public String zzQ() {
                return ((zzr) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public String zzR() {
                return ((zzr) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public List<zzd.zza> zzS() {
                return ((zzr) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public List<zzd.zza> zzT() {
                return ((zzr) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzU() {
                return ((zzr) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzX() {
                return ((zzr) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzY() {
                return ((zzr) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzZ() {
                return ((zzr) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public int zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzaa() {
                return ((zzr) this.zza).zzaa();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public boolean zzab() {
                return ((zzr) this.zza).zzab();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public int zzc() {
                return ((zzr) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zza.EnumC45351zza zzd() {
                return ((zzr) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzd.zza zze(int i) {
                return ((zzr) this.zza).zze(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzd.zza zzf(int i) {
                return ((zzr) this.zza).zzf(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzs
            public zzo.zzb zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzas(iterable);
                return this;
            }

            public zza zzi(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzat(iterable);
                return this;
            }

            public zza zzj(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzau(zzaVar);
                return this;
            }

            public zza zzk(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzav(zzaVar);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzr) this.zza).zzaw();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzr) this.zza).zzax();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzr) this.zza).zzay();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzr) this.zza).zzaz();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzr) this.zza).zzaA();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzr) this.zza).zzaB();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzr) this.zza).zzaC();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzr) this.zza).zzaD();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzr) this.zza).zzaE();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzr) this.zza).zzaF();
                return this;
            }

            public zza zzv(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzaI(zzarVar);
                return this;
            }

            public zza zzw(zza.EnumC45351zza enumC45351zza) {
                zzbu();
                ((zzr) this.zza).zzaJ(enumC45351zza);
                return this;
            }

            public zza zzx(String str) {
                zzbu();
                ((zzr) this.zza).zzaK(str);
                return this;
            }

            public zza zzy(zzgwj zzgwjVar) {
                zzbu();
                ((zzr) this.zza).zzcf(zzgwjVar);
                return this;
            }

            public zza zzz(zzab.zzc zzcVar) {
                zzbu();
                ((zzr) this.zza).zzcg(zzcVar);
                return this;
            }

            private zza() {
                super(zzr.zzm);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzgxr.zzbZ(zzr.class, zzrVar);
        }

        private zzr() {
        }

        public void zzaA() {
            this.zzo &= -3;
            this.zzu = zzk().zzR();
        }

        public void zzaB() {
            this.zzo &= -2;
            this.zzp = 0;
        }

        public void zzaC() {
            this.zzv = null;
            this.zzo &= -5;
        }

        public void zzaD() {
            this.zzo &= -9;
            this.zzw = 0;
        }

        public void zzaE() {
            this.zzC = zzgxr.zzbG();
        }

        public void zzaF() {
            this.zzB = zzgxr.zzbG();
        }

        private void zzaG() {
            zzgxz zzgxzVar = this.zzC;
            if (!zzgxzVar.zzc()) {
                this.zzC = zzgxr.zzbH(zzgxzVar);
            }
        }

        private void zzaH() {
            zzgxz zzgxzVar = this.zzB;
            if (!zzgxzVar.zzc()) {
                this.zzB = zzgxr.zzbH(zzgxzVar);
            }
        }

        public void zzaI(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        public void zzaJ(zza.EnumC45351zza enumC45351zza) {
            this.zzA = enumC45351zza.zza();
            this.zzo |= 128;
        }

        public void zzaK(String str) {
            str.getClass();
            this.zzo |= 16;
            this.zzx = str;
        }

        public void zzas(Iterable<? extends zzd.zza> iterable) {
            zzaG();
            for (zzd.zza zzaVar : iterable) {
                this.zzC.zzi(zzaVar.zza());
            }
        }

        public void zzat(Iterable<? extends zzd.zza> iterable) {
            zzaH();
            for (zzd.zza zzaVar : iterable) {
                this.zzB.zzi(zzaVar.zza());
            }
        }

        public void zzau(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zzi(zzaVar.zza());
        }

        public void zzav(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zzi(zzaVar.zza());
        }

        public void zzaw() {
            this.zzo &= -129;
            this.zzA = 0;
        }

        public void zzax() {
            this.zzo &= -17;
            this.zzx = zzk().zzP();
        }

        public void zzay() {
            this.zzo &= -65;
            this.zzz = 0;
        }

        public void zzaz() {
            this.zzo &= -33;
            this.zzy = zzk().zzQ();
        }

        public void zzcf(zzgwj zzgwjVar) {
            this.zzx = zzgwjVar.zzx();
            this.zzo |= 16;
        }

        public void zzcg(zzab.zzc zzcVar) {
            this.zzz = zzcVar.zza();
            this.zzo |= 64;
        }

        public void zzch(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        public void zzci(zzgwj zzgwjVar) {
            this.zzy = zzgwjVar.zzx();
            this.zzo |= 32;
        }

        public void zzcj(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        public void zzck(zzgwj zzgwjVar) {
            this.zzu = zzgwjVar.zzx();
            this.zzo |= 2;
        }

        public void zzcl(int i) {
            this.zzo |= 1;
            this.zzp = i;
        }

        public void zzcm(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        public void zzcn(zzo.zzb zzbVar) {
            this.zzw = zzbVar.zza();
            this.zzo |= 8;
        }

        public void zzco(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zze(i, zzaVar.zza());
        }

        public void zzcp(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zze(i, zzaVar.zza());
        }

        public static zza zzh() {
            return zzm.zzaZ();
        }

        public static zza zzi(zzr zzrVar) {
            return zzm.zzba(zzrVar);
        }

        public static zzr zzk() {
            return zzm;
        }

        public static zzr zzl(InputStream inputStream) throws IOException {
            return (zzr) zzgxr.zzbk(zzm, inputStream);
        }

        public static zzr zzm(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzr) zzgxr.zzbl(zzm, inputStream, zzgxbVar);
        }

        public static zzr zzn(zzgwj zzgwjVar) throws zzgyg {
            return (zzr) zzgxr.zzbm(zzm, zzgwjVar);
        }

        public static zzr zzo(zzgwp zzgwpVar) throws IOException {
            return (zzr) zzgxr.zzbn(zzm, zzgwpVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzgxr.zzbo(zzm, inputStream);
        }

        public static zzr zzq(ByteBuffer byteBuffer) throws zzgyg {
            return (zzr) zzgxr.zzbp(zzm, byteBuffer);
        }

        public static zzr zzr(byte[] bArr) throws zzgyg {
            return (zzr) zzgxr.zzbq(zzm, bArr);
        }

        public static zzr zzs(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzr) zzgxr.zzbr(zzm, zzgwjVar, zzgxbVar);
        }

        public static zzr zzt(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzr) zzgxr.zzbs(zzm, zzgwpVar, zzgxbVar);
        }

        public static zzr zzu(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzr) zzgxr.zzbu(zzm, inputStream, zzgxbVar);
        }

        public static zzr zzv(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzr) zzgxr.zzbv(zzm, byteBuffer, zzgxbVar);
        }

        public static zzr zzw(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzr) zzgxr.zzbx(zzm, bArr, zzgxbVar);
        }

        public static zzgzk<zzr> zzx() {
            return zzm.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzab.zzc zzK() {
            zzab.zzc zzb2 = zzab.zzc.zzb(this.zzz);
            if (zzb2 == null) {
                return zzab.zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzar zzL() {
            zzar zzarVar = this.zzv;
            if (zzarVar == null) {
                return zzar.zzh();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzgwj zzM() {
            return zzgwj.zzw(this.zzx);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzgwj zzN() {
            return zzgwj.zzw(this.zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzgwj zzO() {
            return zzgwj.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public String zzP() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public String zzQ() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public String zzR() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public List<zzd.zza> zzS() {
            return new zzgyb(this.zzC, zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public List<zzd.zza> zzT() {
            return new zzgyb(this.zzB, zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzU() {
            if ((this.zzo & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzV() {
            if ((this.zzo & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzW() {
            if ((this.zzo & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzX() {
            if ((this.zzo & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzY() {
            if ((this.zzo & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzZ() {
            if ((this.zzo & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzaa() {
            if ((this.zzo & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public boolean zzab() {
            if ((this.zzo & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public int zzc() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zza.EnumC45351zza zzd() {
            zza.EnumC45351zza zzb2 = zza.EnumC45351zza.zzb(this.zzA);
            if (zzb2 == null) {
                return zza.EnumC45351zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzr> zzgzkVar = zzn;
                                    if (zzgzkVar == null) {
                                        synchronized (zzr.class) {
                                            zzgzkVar = zzn;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzm);
                                                zzn = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzm;
                        }
                        return new zza();
                    }
                    return new zzr();
                }
                return zzgxr.zzbQ(zzm, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.zze(), "zzx", "zzy", "zzz", zzab.zzc.zze(), "zzA", zza.EnumC45351zza.zze(), "zzB", zzd.zza.zze(), "zzC", zzd.zza.zze()});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzd.zza zze(int i) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzC.zzd(i));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzd.zza zzf(int i) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzB.zzd(i));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzs
        public zzo.zzb zzg() {
            zzo.zzb zzb2 = zzo.zzb.zzb(this.zzw);
            if (zzb2 == null) {
                return zzo.zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzs extends zzgzd {
        zzab.zzc zzK();

        zzar zzL();

        zzgwj zzM();

        zzgwj zzN();

        zzgwj zzO();

        String zzP();

        String zzQ();

        String zzR();

        List<zzd.zza> zzS();

        List<zzd.zza> zzT();

        boolean zzU();

        boolean zzV();

        boolean zzW();

        boolean zzX();

        boolean zzY();

        boolean zzZ();

        int zza();

        boolean zzaa();

        boolean zzab();

        int zzb();

        int zzc();

        zza.EnumC45351zza zzd();

        zzd.zza zze(int i);

        zzd.zza zzf(int i);

        zzo.zzb zzg();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzt extends zzgxr<zzt, zza> implements zzu {
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private static final zzt zzn;
        private static volatile zzgzk<zzt> zzo;
        private zzm zzA;
        private zzo zzB;
        private zzab zzC;
        private zza zzD;
        private zzaf zzE;
        private zzbl zzF;
        private zzb zzG;
        private int zzp;
        private int zzu;
        private int zzw;
        private zzar zzy;
        private String zzv = "";
        private int zzx = 1000;
        private zzgyc zzz = zzgxr.zzbI();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzt, zza> implements zzu {
            public zza zzA(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcq(zzmVar);
                return this;
            }

            public zza zzB(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcr(zzoVar);
                return this;
            }

            public zza zzC(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcs(zzabVar);
                return this;
            }

            public zza zzD(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzct(zzafVar);
                return this;
            }

            public zza zzE(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcu(zzarVar);
                return this;
            }

            public zza zzF(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcv(zzblVar);
                return this;
            }

            public zza zzG(zza.zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzbVar.zzbr());
                return this;
            }

            public zza zzH(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzaVar);
                return this;
            }

            public zza zzI(zzb.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzcVar.zzbr());
                return this;
            }

            public zza zzJ(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzbVar);
                return this;
            }

            public zza zzK(zzm.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzaVar.zzbr());
                return this;
            }

            public zza zzL(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzmVar);
                return this;
            }

            public zza zzM(zzo.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzaVar.zzbr());
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzoVar);
                return this;
            }

            public zza zzO(String str) {
                zzbu();
                ((zzt) this.zza).zzcA(str);
                return this;
            }

            public zza zzP(zzgwj zzgwjVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzgwjVar);
                return this;
            }

            public zza zzQ(int i, long j) {
                zzbu();
                ((zzt) this.zza).zzcC(i, j);
                return this;
            }

            public zza zzR(zzq zzqVar) {
                zzbu();
                ((zzt) this.zza).zzcD(zzqVar);
                return this;
            }

            public zza zzS(int i) {
                zzbu();
                ((zzt) this.zza).zzcE(i);
                return this;
            }

            public zza zzT(zzab.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzU(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzabVar);
                return this;
            }

            public zza zzV(zzaf.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzcVar.zzbr());
                return this;
            }

            public zza zzW(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzafVar);
                return this;
            }

            public zza zzX(zzar.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzY(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzarVar);
                return this;
            }

            public zza zzZ(int i) {
                zzbu();
                ((zzt) this.zza).zzcI(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public int zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zzbl.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzab zzac() {
                return ((zzt) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzaf zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzar zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzbl zzaf() {
                return ((zzt) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzgwj zzag() {
                return ((zzt) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public String zzah() {
                return ((zzt) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public List<Long> zzai() {
                return Collections.unmodifiableList(((zzt) this.zza).zzai());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzal() {
                return ((zzt) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzam() {
                return ((zzt) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzan() {
                return ((zzt) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzao() {
                return ((zzt) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzar() {
                return ((zzt) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzas() {
                return ((zzt) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzat() {
                return ((zzt) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public boolean zzau() {
                return ((zzt) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public int zzc() {
                return ((zzt) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public long zzd(int i) {
                return ((zzt) this.zza).zzd(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zza zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzb zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzm zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzo zzh() {
                return ((zzt) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzu
            public zzq zzi() {
                return ((zzt) this.zza).zzi();
            }

            public zza zzj(Iterable<? extends Long> iterable) {
                zzbu();
                ((zzt) this.zza).zzaE(iterable);
                return this;
            }

            public zza zzk(long j) {
                zzbu();
                ((zzt) this.zza).zzaF(j);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzt) this.zza).zzaG();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzt) this.zza).zzaH();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzt) this.zza).zzaI();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzt) this.zza).zzaJ();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzt) this.zza).zzaK();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzt) this.zza).zzcf();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzt) this.zza).zzcg();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzt) this.zza).zzch();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzt) this.zza).zzci();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzt) this.zza).zzcj();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzt) this.zza).zzck();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzt) this.zza).zzcl();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzt) this.zza).zzcm();
                return this;
            }

            public zza zzy(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzco(zzaVar);
                return this;
            }

            public zza zzz(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcp(zzbVar);
                return this;
            }

            private zza() {
                super(zzt.zzn);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzgxr.zzbZ(zzt.class, zztVar);
        }

        private zzt() {
        }

        public void zzaE(Iterable<? extends Long> iterable) {
            zzcn();
            zzgvs.zzaQ(iterable, this.zzz);
        }

        public void zzaF(long j) {
            zzcn();
            this.zzz.zzg(j);
        }

        public void zzaG() {
            this.zzD = null;
            this.zzp &= -257;
        }

        public void zzaH() {
            this.zzG = null;
            this.zzp &= -2049;
        }

        public void zzaI() {
            this.zzA = null;
            this.zzp &= -33;
        }

        public void zzaJ() {
            this.zzB = null;
            this.zzp &= -65;
        }

        public void zzaK() {
            this.zzp &= -3;
            this.zzv = zzm().zzah();
        }

        public void zzcA(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
        }

        public void zzcB(zzgwj zzgwjVar) {
            this.zzv = zzgwjVar.zzx();
            this.zzp |= 2;
        }

        public void zzcC(int i, long j) {
            zzcn();
            this.zzz.zzd(i, j);
        }

        public void zzcD(zzq zzqVar) {
            this.zzx = zzqVar.zza();
            this.zzp |= 8;
        }

        public void zzcE(int i) {
            this.zzp |= 1;
            this.zzu = i;
        }

        public void zzcF(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        public void zzcG(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        public void zzcH(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        public void zzcI(int i) {
            this.zzp |= 4;
            this.zzw = i;
        }

        public void zzcJ(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        public void zzcf() {
            this.zzz = zzgxr.zzbI();
        }

        public void zzcg() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        public void zzch() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        public void zzci() {
            this.zzC = null;
            this.zzp &= -129;
        }

        public void zzcj() {
            this.zzE = null;
            this.zzp &= -513;
        }

        public void zzck() {
            this.zzy = null;
            this.zzp &= -17;
        }

        public void zzcl() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        public void zzcm() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void zzcn() {
            zzgyc zzgycVar = this.zzz;
            if (!zzgycVar.zzc()) {
                this.zzz = zzgxr.zzbJ(zzgycVar);
            }
        }

        public void zzco(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.zzh()) {
                zza.zzb zzf2 = zza.zzf(zzaVar2);
                zzf2.zzbj(zzaVar);
                zzaVar = zzf2.zzbs();
            }
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        public void zzcp(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.zzh()) {
                zzb.zzc zzf2 = zzb.zzf(zzbVar2);
                zzf2.zzbj(zzbVar);
                zzbVar = zzf2.zzbs();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        public void zzcq(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.zzg()) {
                zzm.zza zzd2 = zzm.zzd(zzmVar2);
                zzd2.zzbj(zzmVar);
                zzmVar = zzd2.zzbs();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        public void zzcr(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.zzd()) {
                zzo.zza zzb2 = zzo.zzb(zzoVar2);
                zzb2.zzbj(zzoVar);
                zzoVar = zzb2.zzbs();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        public void zzcs(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                zzab.zza zzb2 = zzab.zzb(zzabVar2);
                zzb2.zzbj(zzabVar);
                zzabVar = zzb2.zzbs();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        public void zzct(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzE;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzl()) {
                zzaf.zzc zzj2 = zzaf.zzj(zzafVar2);
                zzj2.zzbj(zzafVar);
                zzafVar = zzj2.zzbs();
            }
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        public void zzcu(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzf2 = zzar.zzf(zzarVar2);
                zzf2.zzbj(zzarVar);
                zzarVar = zzf2.zzbs();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        public void zzcv(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzi()) {
                zzbl.zza zzc2 = zzbl.zzc(zzblVar2);
                zzc2.zzbj(zzblVar);
                zzblVar = zzc2.zzbs();
            }
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        public void zzcw(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        public void zzcx(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        public void zzcy(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        public void zzcz(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        public static zza zzj() {
            return zzn.zzaZ();
        }

        public static zza zzk(zzt zztVar) {
            return zzn.zzba(zztVar);
        }

        public static zzt zzm() {
            return zzn;
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zzgxr.zzbk(zzn, inputStream);
        }

        public static zzt zzo(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzt) zzgxr.zzbl(zzn, inputStream, zzgxbVar);
        }

        public static zzt zzp(zzgwj zzgwjVar) throws zzgyg {
            return (zzt) zzgxr.zzbm(zzn, zzgwjVar);
        }

        public static zzt zzq(zzgwp zzgwpVar) throws IOException {
            return (zzt) zzgxr.zzbn(zzn, zzgwpVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzgxr.zzbo(zzn, inputStream);
        }

        public static zzt zzs(ByteBuffer byteBuffer) throws zzgyg {
            return (zzt) zzgxr.zzbp(zzn, byteBuffer);
        }

        public static zzt zzt(byte[] bArr) throws zzgyg {
            return (zzt) zzgxr.zzbq(zzn, bArr);
        }

        public static zzt zzu(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzt) zzgxr.zzbr(zzn, zzgwjVar, zzgxbVar);
        }

        public static zzt zzv(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzt) zzgxr.zzbs(zzn, zzgwpVar, zzgxbVar);
        }

        public static zzt zzw(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzt) zzgxr.zzbu(zzn, inputStream, zzgxbVar);
        }

        public static zzt zzx(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzt) zzgxr.zzbv(zzn, byteBuffer, zzgxbVar);
        }

        public static zzt zzy(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzt) zzgxr.zzbx(zzn, bArr, zzgxbVar);
        }

        public static zzgzk<zzt> zzz() {
            return zzn.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public int zza() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzab zzac() {
            zzab zzabVar = this.zzC;
            if (zzabVar == null) {
                return zzab.zzd();
            }
            return zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzaf zzad() {
            zzaf zzafVar = this.zzE;
            if (zzafVar == null) {
                return zzaf.zzl();
            }
            return zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzar zzae() {
            zzar zzarVar = this.zzy;
            if (zzarVar == null) {
                return zzar.zzh();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzbl zzaf() {
            zzbl zzblVar = this.zzF;
            if (zzblVar == null) {
                return zzbl.zzi();
            }
            return zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzgwj zzag() {
            return zzgwj.zzw(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public String zzah() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public List<Long> zzai() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzaj() {
            if ((this.zzp & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzak() {
            if ((this.zzp & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzal() {
            if ((this.zzp & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzam() {
            if ((this.zzp & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzan() {
            if ((this.zzp & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzao() {
            if ((this.zzp & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzap() {
            if ((this.zzp & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzaq() {
            if ((this.zzp & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzar() {
            if ((this.zzp & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzas() {
            if ((this.zzp & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzat() {
            if ((this.zzp & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public boolean zzau() {
            if ((this.zzp & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public int zzb() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public int zzc() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public long zzd(int i) {
            return this.zzz.zza(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzt> zzgzkVar = zzo;
                                    if (zzgzkVar == null) {
                                        synchronized (zzt.class) {
                                            zzgzkVar = zzo;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzn);
                                                zzo = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzn;
                        }
                        return new zza();
                    }
                    return new zzt();
                }
                return zzgxr.zzbQ(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zza zze() {
            zza zzaVar = this.zzD;
            if (zzaVar == null) {
                return zza.zzh();
            }
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzb zzf() {
            zzb zzbVar = this.zzG;
            if (zzbVar == null) {
                return zzb.zzh();
            }
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzm zzg() {
            zzm zzmVar = this.zzA;
            if (zzmVar == null) {
                return zzm.zzg();
            }
            return zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzo zzh() {
            zzo zzoVar = this.zzB;
            if (zzoVar == null) {
                return zzo.zzd();
            }
            return zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzu
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzx);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzu extends zzgzd {
        int zza();

        zzab zzac();

        zzaf zzad();

        zzar zzae();

        zzbl zzaf();

        zzgwj zzag();

        String zzah();

        List<Long> zzai();

        boolean zzaj();

        boolean zzak();

        boolean zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        int zzb();

        int zzc();

        long zzd(int i);

        zza zze();

        zzb zzf();

        zzm zzg();

        zzo zzh();

        zzq zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzv extends zzgxr<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzgzk<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzgxz zzj = zzgxr.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzv, zza> implements zzw {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public int zza(int i) {
                return ((zzv) this.zza).zza(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public int zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public zzq zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzv) this.zza).zzO(iterable);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzv) this.zza).zzP(i);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzv) this.zza).zzQ();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzv) this.zza).zzR();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzv) this.zza).zzS();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzv) this.zza).zzT();
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzV(zzapVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzv) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgwj zzgwjVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzgwjVar);
                return this;
            }

            public zza zzm(zzap.zza zzaVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzapVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzv) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzp(int i, int i2) {
                zzbu();
                ((zzv) this.zza).zzaa(i, i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public zzap zzq() {
                return ((zzv) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public zzgwj zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public String zzs() {
                return ((zzv) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public List<Integer> zzt() {
                return Collections.unmodifiableList(((zzv) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public boolean zzu() {
                return ((zzv) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public boolean zzv() {
                return ((zzv) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzw
            public boolean zzw() {
                return ((zzv) this.zza).zzw();
            }

            private zza() {
                super(zzv.zze);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzgxr.zzbZ(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzv zzA(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzv) zzgxr.zzbx(zze, bArr, zzgxbVar);
        }

        public static zzgzk<zzv> zzB() {
            return zze.zzbN();
        }

        public void zzO(Iterable<? extends Integer> iterable) {
            zzU();
            zzgvs.zzaQ(iterable, this.zzj);
        }

        public void zzP(int i) {
            zzU();
            this.zzj.zzi(i);
        }

        public void zzQ() {
            this.zzg &= -2;
            this.zzh = zzh().zzs();
        }

        public void zzR() {
            this.zzk = null;
            this.zzg &= -5;
        }

        public void zzS() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        public void zzT() {
            this.zzj = zzgxr.zzbG();
        }

        private void zzU() {
            zzgxz zzgxzVar = this.zzj;
            if (!zzgxzVar.zzc()) {
                this.zzj = zzgxr.zzbH(zzgxzVar);
            }
        }

        public void zzV(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public void zzW(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        public void zzX(zzgwj zzgwjVar) {
            this.zzh = zzgwjVar.zzx();
            this.zzg |= 1;
        }

        public void zzY(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public void zzZ(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        public void zzaa(int i, int i2) {
            zzU();
            this.zzj.zze(i, i2);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zzf(zzv zzvVar) {
            return zze.zzba(zzvVar);
        }

        public static zzv zzh() {
            return zze;
        }

        public static zzv zzi(InputStream inputStream) throws IOException {
            return (zzv) zzgxr.zzbk(zze, inputStream);
        }

        public static zzv zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzv) zzgxr.zzbl(zze, inputStream, zzgxbVar);
        }

        public static zzv zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzv) zzgxr.zzbm(zze, zzgwjVar);
        }

        public static zzv zzl(zzgwp zzgwpVar) throws IOException {
            return (zzv) zzgxr.zzbn(zze, zzgwpVar);
        }

        public static zzv zzm(InputStream inputStream) throws IOException {
            return (zzv) zzgxr.zzbo(zze, inputStream);
        }

        public static zzv zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzv) zzgxr.zzbp(zze, byteBuffer);
        }

        public static zzv zzo(byte[] bArr) throws zzgyg {
            return (zzv) zzgxr.zzbq(zze, bArr);
        }

        public static zzv zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzv) zzgxr.zzbr(zze, zzgwjVar, zzgxbVar);
        }

        public static zzv zzx(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzv) zzgxr.zzbs(zze, zzgwpVar, zzgxbVar);
        }

        public static zzv zzy(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzv) zzgxr.zzbu(zze, inputStream, zzgxbVar);
        }

        public static zzv zzz(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzv) zzgxr.zzbv(zze, byteBuffer, zzgxbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public int zza(int i) {
            return this.zzj.zzd(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzv> zzgzkVar = zzf;
                                    if (zzgzkVar == null) {
                                        synchronized (zzv.class) {
                                            zzgzkVar = zzf;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zze);
                                                zzf = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzv();
                }
                return zzgxr.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public zzap zzq() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public zzgwj zzr() {
            return zzgwj.zzw(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public String zzs() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public List<Integer> zzt() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public boolean zzu() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public boolean zzv() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzw
        public boolean zzw() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzw extends zzgzd {
        int zza(int i);

        int zzb();

        zzq zzc();

        zzap zzq();

        zzgwj zzr();

        String zzs();

        List<Integer> zzt();

        boolean zzu();

        boolean zzv();

        boolean zzw();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzx extends zzgxr<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzgzk<zzx> zzd;
        private int zze;
        private int zzf;
        private zzgxz zzg = zzgxr.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzx, zza> implements zzy {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzy
            public int zza(int i) {
                return ((zzx) this.zza).zza(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzy
            public int zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzy
            public zzq zzc() {
                return ((zzx) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzx) this.zza).zzD(iterable);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzx) this.zza).zzE(i);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzx) this.zza).zzF();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzx) this.zza).zzG();
                return this;
            }

            public zza zzh(int i, int i2) {
                zzbu();
                ((zzx) this.zza).zzI(i, i2);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbu();
                ((zzx) this.zza).zzJ(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzy
            public List<Integer> zzj() {
                return Collections.unmodifiableList(((zzx) this.zza).zzj());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzy
            public boolean zzk() {
                return ((zzx) this.zza).zzk();
            }

            private zza() {
                super(zzx.zzc);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzgxr.zzbZ(zzx.class, zzxVar);
        }

        private zzx() {
        }

        public void zzD(Iterable<? extends Integer> iterable) {
            zzH();
            zzgvs.zzaQ(iterable, this.zzg);
        }

        public void zzE(int i) {
            zzH();
            this.zzg.zzi(i);
        }

        public void zzF() {
            this.zzg = zzgxr.zzbG();
        }

        public void zzG() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void zzH() {
            zzgxz zzgxzVar = this.zzg;
            if (!zzgxzVar.zzc()) {
                this.zzg = zzgxr.zzbH(zzgxzVar);
            }
        }

        public void zzI(int i, int i2) {
            zzH();
            this.zzg.zze(i, i2);
        }

        public void zzJ(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzd() {
            return zzc.zzaZ();
        }

        public static zza zzf(zzx zzxVar) {
            return zzc.zzba(zzxVar);
        }

        public static zzx zzh() {
            return zzc;
        }

        public static zzx zzi(InputStream inputStream) throws IOException {
            return (zzx) zzgxr.zzbk(zzc, inputStream);
        }

        public static zzx zzl(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzx) zzgxr.zzbl(zzc, inputStream, zzgxbVar);
        }

        public static zzx zzm(zzgwj zzgwjVar) throws zzgyg {
            return (zzx) zzgxr.zzbm(zzc, zzgwjVar);
        }

        public static zzx zzn(zzgwp zzgwpVar) throws IOException {
            return (zzx) zzgxr.zzbn(zzc, zzgwpVar);
        }

        public static zzx zzo(InputStream inputStream) throws IOException {
            return (zzx) zzgxr.zzbo(zzc, inputStream);
        }

        public static zzx zzp(ByteBuffer byteBuffer) throws zzgyg {
            return (zzx) zzgxr.zzbp(zzc, byteBuffer);
        }

        public static zzx zzq(byte[] bArr) throws zzgyg {
            return (zzx) zzgxr.zzbq(zzc, bArr);
        }

        public static zzx zzr(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzx) zzgxr.zzbr(zzc, zzgwjVar, zzgxbVar);
        }

        public static zzx zzs(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzx) zzgxr.zzbs(zzc, zzgwpVar, zzgxbVar);
        }

        public static zzx zzt(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzx) zzgxr.zzbu(zzc, inputStream, zzgxbVar);
        }

        public static zzx zzu(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzx) zzgxr.zzbv(zzc, byteBuffer, zzgxbVar);
        }

        public static zzx zzv(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzx) zzgxr.zzbx(zzc, bArr, zzgxbVar);
        }

        public static zzgzk<zzx> zzw() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzy
        public int zza(int i) {
            return this.zzg.zzd(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzy
        public int zzb() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzy
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzx> zzgzkVar = zzd;
                                    if (zzgzkVar == null) {
                                        synchronized (zzx.class) {
                                            zzgzkVar = zzd;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zzc);
                                                zzd = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zza();
                    }
                    return new zzx();
                }
                return zzgxr.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            return (byte) 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzy
        public List<Integer> zzj() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzy
        public boolean zzk() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public interface zzy extends zzgzd {
        int zza(int i);

        int zzb();

        zzq zzc();

        List<Integer> zzj();

        boolean zzk();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
    /* loaded from: classes5.dex */
    public final class zzz extends zzgxr<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzgzk<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzgyd<zzan> zzi = zzgxr.zzbK();
        private int zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
        /* loaded from: classes5.dex */
        public final class zza extends zzgxl<zzz, zza> implements zzaa {
            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public boolean zzA() {
                return ((zzz) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public boolean zzB() {
                return ((zzz) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public int zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public zzq zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public zzv zzc() {
                return ((zzz) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends zzan> iterable) {
                zzbu();
                ((zzz) this.zza).zzR(iterable);
                return this;
            }

            public zza zze(zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzanVar);
                return this;
            }

            public zza zzg(int i, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzT(i, zzaVar.zzbr());
                return this;
            }

            public zza zzh(int i, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzT(i, zzanVar);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzz) this.zza).zzU();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzz) this.zza).zzV();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzz) this.zza).zzW();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzz) this.zza).zzX();
                return this;
            }

            public zza zzm(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzZ(zzvVar);
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzo(int i) {
                zzbu();
                ((zzz) this.zza).zzab(i);
                return this;
            }

            public zza zzp(zzv.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzaVar.zzbr());
                return this;
            }

            public zza zzq(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzvVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzapVar);
                return this;
            }

            public zza zzt(zzq zzqVar) {
                zzbu();
                ((zzz) this.zza).zzae(zzqVar);
                return this;
            }

            public zza zzu(int i, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i, zzaVar.zzbr());
                return this;
            }

            public zza zzv(int i, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public zzan zzw(int i) {
                return ((zzz) this.zza).zzw(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public List<zzan> zzy() {
                return Collections.unmodifiableList(((zzz) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
            public boolean zzz() {
                return ((zzz) this.zza).zzz();
            }

            private zza() {
                super(zzz.zze);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzgxr.zzbZ(zzz.class, zzzVar);
        }

        private zzz() {
        }

        public void zzR(Iterable<? extends zzan> iterable) {
            zzY();
            zzgvs.zzaQ(iterable, this.zzi);
        }

        public void zzS(zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(zzanVar);
        }

        public void zzT(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(i, zzanVar);
        }

        public void zzU() {
            this.zzh = null;
            this.zzg &= -2;
        }

        public void zzV() {
            this.zzk = null;
            this.zzg &= -5;
        }

        public void zzW() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        public void zzX() {
            this.zzi = zzgxr.zzbK();
        }

        private void zzY() {
            zzgyd<zzan> zzgydVar = this.zzi;
            if (!zzgydVar.zzc()) {
                this.zzi = zzgxr.zzbL(zzgydVar);
            }
        }

        public void zzZ(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.zzh()) {
                zzv.zza zzf2 = zzv.zzf(zzvVar2);
                zzf2.zzbj(zzvVar);
                zzvVar = zzf2.zzbs();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public void zzab(int i) {
            zzY();
            this.zzi.remove(i);
        }

        public void zzac(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        public void zzad(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        public void zzae(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzg |= 2;
        }

        public void zzaf(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.set(i, zzanVar);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zzf(zzz zzzVar) {
            return zze.zzba(zzzVar);
        }

        public static zzz zzh() {
            return zze;
        }

        public static zzz zzi(InputStream inputStream) throws IOException {
            return (zzz) zzgxr.zzbk(zze, inputStream);
        }

        public static zzz zzj(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzz) zzgxr.zzbl(zze, inputStream, zzgxbVar);
        }

        public static zzz zzk(zzgwj zzgwjVar) throws zzgyg {
            return (zzz) zzgxr.zzbm(zze, zzgwjVar);
        }

        public static zzz zzl(zzgwp zzgwpVar) throws IOException {
            return (zzz) zzgxr.zzbn(zze, zzgwpVar);
        }

        public static zzz zzm(InputStream inputStream) throws IOException {
            return (zzz) zzgxr.zzbo(zze, inputStream);
        }

        public static zzz zzn(ByteBuffer byteBuffer) throws zzgyg {
            return (zzz) zzgxr.zzbp(zze, byteBuffer);
        }

        public static zzz zzo(byte[] bArr) throws zzgyg {
            return (zzz) zzgxr.zzbq(zze, bArr);
        }

        public static zzz zzp(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
            return (zzz) zzgxr.zzbr(zze, zzgwjVar, zzgxbVar);
        }

        public static zzz zzq(zzgwp zzgwpVar, zzgxb zzgxbVar) throws IOException {
            return (zzz) zzgxr.zzbs(zze, zzgwpVar, zzgxbVar);
        }

        public static zzz zzr(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
            return (zzz) zzgxr.zzbu(zze, inputStream, zzgxbVar);
        }

        public static zzz zzs(ByteBuffer byteBuffer, zzgxb zzgxbVar) throws zzgyg {
            return (zzz) zzgxr.zzbv(zze, byteBuffer, zzgxbVar);
        }

        public static zzz zzt(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
            return (zzz) zzgxr.zzbx(zze, bArr, zzgxbVar);
        }

        public static zzgzk<zzz> zzv() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public boolean zzA() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public boolean zzB() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        public List<? extends zzao> zzC() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public int zza() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public zzq zzb() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public zzv zzc() {
            zzv zzvVar = this.zzh;
            if (zzvVar == null) {
                return zzv.zzh();
            }
            return zzvVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxr
        protected final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
            int ordinal = zzgxqVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal == 6) {
                                    zzgzk<zzz> zzgzkVar = zzf;
                                    if (zzgzkVar == null) {
                                        synchronized (zzz.class) {
                                            zzgzkVar = zzf;
                                            if (zzgzkVar == null) {
                                                zzgzkVar = new zzgxm(zze);
                                                zzf = zzgzkVar;
                                            }
                                        }
                                    }
                                    return zzgzkVar;
                                }
                                throw null;
                            }
                            return zze;
                        }
                        return new zza();
                    }
                    return new zzz();
                }
                return zzgxr.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.zze(), "zzk"});
            }
            return (byte) 1;
        }

        public zzao zzu(int i) {
            return this.zzi.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public zzan zzw(int i) {
            return this.zzi.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzi();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public List<zzan> zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbq.zzaa
        public boolean zzz() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    private zzbbq() {
    }

    public static void zza(zzgxb zzgxbVar) {
    }
}
