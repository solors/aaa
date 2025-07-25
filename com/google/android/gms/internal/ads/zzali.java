package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzali {
    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    @Nullable
    private String zzl;
    @Nullable
    private Layout.Alignment zzo;
    @Nullable
    private Layout.Alignment zzp;
    @Nullable
    private zzalb zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzali zzA(boolean z) {
        this.zzq = z ? 1 : 0;
        return this;
    }

    public final zzali zzB(@Nullable zzalb zzalbVar) {
        this.zzr = zzalbVar;
        return this;
    }

    public final zzali zzC(boolean z) {
        this.zzg = z ? 1 : 0;
        return this;
    }

    @Nullable
    public final String zzD() {
        return this.zza;
    }

    @Nullable
    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        if (this.zzq == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        if (this.zzf == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzJ() {
        if (this.zzg == 1) {
            return true;
        }
        return false;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i;
        int i2 = this.zzh;
        if (i2 == -1 && this.zzi == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.zzi == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    @Nullable
    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    @Nullable
    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    @Nullable
    public final zzalb zzk() {
        return this.zzr;
    }

    public final zzali zzl(@Nullable zzali zzaliVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaliVar != null) {
            if (!this.zzc && zzaliVar.zzc) {
                zzo(zzaliVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzaliVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzaliVar.zzi;
            }
            if (this.zza == null && (str = zzaliVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzaliVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzaliVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzaliVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzaliVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzaliVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzaliVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzaliVar.zzj;
                this.zzk = zzaliVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzaliVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzaliVar.zzs;
            }
            if (!this.zze && zzaliVar.zze) {
                zzm(zzaliVar.zzd);
            }
            if (this.zzm == -1 && (i = zzaliVar.zzm) != -1) {
                this.zzm = i;
            }
        }
        return this;
    }

    public final zzali zzm(int i) {
        this.zzd = i;
        this.zze = true;
        return this;
    }

    public final zzali zzn(boolean z) {
        this.zzh = z ? 1 : 0;
        return this;
    }

    public final zzali zzo(int i) {
        this.zzb = i;
        this.zzc = true;
        return this;
    }

    public final zzali zzp(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final zzali zzq(float f) {
        this.zzk = f;
        return this;
    }

    public final zzali zzr(int i) {
        this.zzj = i;
        return this;
    }

    public final zzali zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    public final zzali zzt(boolean z) {
        this.zzi = z ? 1 : 0;
        return this;
    }

    public final zzali zzu(boolean z) {
        this.zzf = z ? 1 : 0;
        return this;
    }

    public final zzali zzv(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzali zzw(int i) {
        this.zzn = i;
        return this;
    }

    public final zzali zzx(int i) {
        this.zzm = i;
        return this;
    }

    public final zzali zzy(float f) {
        this.zzs = f;
        return this;
    }

    public final zzali zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
