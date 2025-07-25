package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzab {
    public static final /* synthetic */ int zzL = 0;
    @Nullable
    public final byte[] zzA;
    public final int zzB;
    @Nullable
    public final zzk zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    private int zzM;
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    public final List zzc;
    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    @Nullable
    public final String zzk;
    @Nullable
    public final zzay zzl;
    @Nullable
    public final Object zzm;
    @Nullable
    public final String zzn;
    @Nullable
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    @Nullable
    public final zzu zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final float zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzab(new zzz());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzab.class == obj.getClass()) {
            zzab zzabVar = (zzab) obj;
            int i2 = this.zzM;
            if ((i2 == 0 || (i = zzabVar.zzM) == 0 || i2 == i) && this.zze == zzabVar.zze && this.zzf == zzabVar.zzf && this.zzh == zzabVar.zzh && this.zzi == zzabVar.zzi && this.zzp == zzabVar.zzp && this.zzt == zzabVar.zzt && this.zzv == zzabVar.zzv && this.zzw == zzabVar.zzw && this.zzy == zzabVar.zzy && this.zzB == zzabVar.zzB && this.zzD == zzabVar.zzD && this.zzE == zzabVar.zzE && this.zzF == zzabVar.zzF && this.zzG == zzabVar.zzG && this.zzH == zzabVar.zzH && this.zzI == zzabVar.zzI && this.zzK == zzabVar.zzK && Float.compare(this.zzx, zzabVar.zzx) == 0 && Float.compare(this.zzz, zzabVar.zzz) == 0 && Objects.equals(this.zza, zzabVar.zza) && Objects.equals(this.zzb, zzabVar.zzb) && this.zzc.equals(zzabVar.zzc) && Objects.equals(this.zzk, zzabVar.zzk) && Objects.equals(this.zzn, zzabVar.zzn) && Objects.equals(this.zzo, zzabVar.zzo) && Objects.equals(this.zzd, zzabVar.zzd) && Arrays.equals(this.zzA, zzabVar.zzA) && Objects.equals(this.zzl, zzabVar.zzl) && Objects.equals(this.zzC, zzabVar.zzC) && Objects.equals(this.zzs, zzabVar.zzs) && zzd(zzabVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.zzM;
        if (i == 0) {
            String str = this.zza;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzb;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = ((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode2) * 31) + this.zzc.hashCode();
            String str3 = this.zzd;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = ((((((((((hashCode7 * 31) + hashCode3) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzh) * 31) + this.zzi) * 31;
            String str4 = this.zzk;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            zzay zzayVar = this.zzl;
            if (zzayVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = zzayVar.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.zzn;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.zzo;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((((((((((((i6 + i2) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + Float.floatToIntBits(this.zzx)) * 31) + this.zzy) * 31) + Float.floatToIntBits(this.zzz)) * 31) + this.zzB) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) - 1) * 31) - 1) * 31) + this.zzK;
            this.zzM = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzC);
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzn + ", " + this.zzo + ", " + this.zzk + ", " + this.zzj + ", " + this.zzd + ", [" + this.zzv + ", " + this.zzw + ", " + this.zzx + ", " + valueOf + "], [" + this.zzD + ", " + this.zzE + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzv;
        if (i2 == -1 || (i = this.zzw) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzz zzb() {
        return new zzz(this, null);
    }

    public final zzab zzc(int i) {
        zzz zzzVar = new zzz(this, null);
        zzzVar.zzD(i);
        return new zzab(zzzVar);
    }

    public final boolean zzd(zzab zzabVar) {
        if (this.zzr.size() != zzabVar.zzr.size()) {
            return false;
        }
        for (int i = 0; i < this.zzr.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzr.get(i), (byte[]) zzabVar.zzr.get(i))) {
                return false;
            }
        }
        return true;
    }

    private zzab(zzz zzzVar) {
        boolean z;
        String str;
        this.zza = zzz.zzak(zzzVar);
        String zzE = zzei.zzE(zzz.zzam(zzzVar));
        this.zzd = zzE;
        if (zzz.zzap(zzzVar).isEmpty() && zzz.zzal(zzzVar) != null) {
            this.zzc = zzfxn.zzo(new zzad(zzE, zzz.zzal(zzzVar)));
            this.zzb = zzz.zzal(zzzVar);
        } else if (!zzz.zzap(zzzVar).isEmpty() && zzz.zzal(zzzVar) == null) {
            this.zzc = zzz.zzap(zzzVar);
            List zzap = zzz.zzap(zzzVar);
            Iterator it = zzap.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzad zzadVar = (zzad) it.next();
                    if (TextUtils.equals(zzadVar.zza, zzE)) {
                        str = zzadVar.zzb;
                        break;
                    }
                } else {
                    str = ((zzad) zzap.get(0)).zzb;
                    break;
                }
            }
            this.zzb = str;
        } else {
            if (!zzz.zzap(zzzVar).isEmpty() || zzz.zzal(zzzVar) != null) {
                for (int i = 0; i < zzz.zzap(zzzVar).size(); i++) {
                    if (!((zzad) zzz.zzap(zzzVar).get(i)).zzb.equals(zzz.zzal(zzzVar))) {
                    }
                }
                z = false;
                zzcw.zzf(z);
                this.zzc = zzz.zzap(zzzVar);
                this.zzb = zzz.zzal(zzzVar);
            }
            z = true;
            zzcw.zzf(z);
            this.zzc = zzz.zzap(zzzVar);
            this.zzb = zzz.zzal(zzzVar);
        }
        this.zze = zzz.zzr(zzzVar);
        zzcw.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzz.zzo(zzzVar);
        this.zzg = 0;
        int zzd = zzz.zzd(zzzVar);
        this.zzh = zzd;
        int zzn = zzz.zzn(zzzVar);
        this.zzi = zzn;
        this.zzj = zzn != -1 ? zzn : zzd;
        this.zzk = zzz.zzai(zzzVar);
        this.zzl = zzz.zzah(zzzVar);
        this.zzm = null;
        this.zzn = zzz.zzaj(zzzVar);
        this.zzo = zzz.zzan(zzzVar);
        this.zzp = zzz.zzk(zzzVar);
        this.zzq = zzz.zzl(zzzVar);
        this.zzr = zzz.zzao(zzzVar) == null ? Collections.emptyList() : zzz.zzao(zzzVar);
        zzu zzw = zzz.zzw(zzzVar);
        this.zzs = zzw;
        this.zzt = zzz.zzu(zzzVar);
        this.zzu = zzz.zzaq(zzzVar);
        this.zzv = zzz.zzt(zzzVar);
        this.zzw = zzz.zzj(zzzVar);
        this.zzx = zzz.zza(zzzVar);
        this.zzy = zzz.zzp(zzzVar) == -1 ? 0 : zzz.zzp(zzzVar);
        this.zzz = zzz.zzb(zzzVar) == -1.0f ? 1.0f : zzz.zzb(zzzVar);
        this.zzA = zzz.zzar(zzzVar);
        this.zzB = zzz.zzs(zzzVar);
        this.zzC = zzz.zzv(zzzVar);
        this.zzD = zzz.zze(zzzVar);
        this.zzE = zzz.zzq(zzzVar);
        this.zzF = zzz.zzm(zzzVar);
        this.zzG = zzz.zzh(zzzVar) == -1 ? 0 : zzz.zzh(zzzVar);
        this.zzH = zzz.zzi(zzzVar) != -1 ? zzz.zzi(zzzVar) : 0;
        this.zzI = zzz.zzc(zzzVar);
        this.zzJ = zzz.zzg(zzzVar);
        if (zzz.zzf(zzzVar) != 0 || zzw == null) {
            this.zzK = zzz.zzf(zzzVar);
        } else {
            this.zzK = 1;
        }
    }
}
