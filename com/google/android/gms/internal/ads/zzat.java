package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzat {
    @Nullable
    private CharSequence zza;
    @Nullable
    private CharSequence zzb;
    @Nullable
    private CharSequence zzc;
    @Nullable
    private CharSequence zzd;
    @Nullable
    private CharSequence zze;
    @Nullable
    private byte[] zzf;
    @Nullable
    private Integer zzg;
    @Nullable
    private Integer zzh;
    @Nullable
    private Integer zzi;
    @Nullable
    private Integer zzj;
    @Nullable
    private Boolean zzk;
    @Nullable
    private Integer zzl;
    @Nullable
    private Integer zzm;
    @Nullable
    private Integer zzn;
    @Nullable
    private Integer zzo;
    @Nullable
    private Integer zzp;
    @Nullable
    private Integer zzq;
    @Nullable
    private CharSequence zzr;
    @Nullable
    private CharSequence zzs;
    @Nullable
    private CharSequence zzt;
    @Nullable
    private CharSequence zzu;
    @Nullable
    private CharSequence zzv;
    @Nullable
    private Integer zzw;
    private final zzfxn zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzat(zzav zzavVar, zzau zzauVar) {
        this.zza = zzavVar.zzb;
        this.zzb = zzavVar.zzc;
        this.zzc = zzavVar.zzd;
        this.zzd = zzavVar.zze;
        this.zze = zzavVar.zzf;
        this.zzf = zzavVar.zzg;
        this.zzg = zzavVar.zzh;
        this.zzh = zzavVar.zzi;
        this.zzi = zzavVar.zzj;
        this.zzj = zzavVar.zzk;
        this.zzk = zzavVar.zzl;
        this.zzl = zzavVar.zzn;
        this.zzm = zzavVar.zzo;
        this.zzn = zzavVar.zzp;
        this.zzo = zzavVar.zzq;
        this.zzp = zzavVar.zzr;
        this.zzq = zzavVar.zzs;
        this.zzr = zzavVar.zzt;
        this.zzs = zzavVar.zzu;
        this.zzt = zzavVar.zzv;
        this.zzu = zzavVar.zzw;
        this.zzv = zzavVar.zzx;
        this.zzw = zzavVar.zzy;
        this.zzx = zzavVar.zzz;
    }

    public final zzat zza(byte[] bArr, int i) {
        if (this.zzf == null || Objects.equals(Integer.valueOf(i), 3) || !Objects.equals(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzat zzb(@Nullable zzav zzavVar) {
        if (zzavVar != null) {
            CharSequence charSequence = zzavVar.zzb;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzavVar.zzc;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzavVar.zzd;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzavVar.zze;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzavVar.zzf;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzavVar.zzg;
            if (bArr != null) {
                Integer num = zzavVar.zzh;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzavVar.zzi;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzavVar.zzj;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzavVar.zzk;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzavVar.zzl;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzavVar.zzm;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzavVar.zzn;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzavVar.zzo;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzavVar.zzp;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzavVar.zzq;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzavVar.zzr;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzavVar.zzs;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzavVar.zzt;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzavVar.zzu;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzavVar.zzv;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            CharSequence charSequence9 = zzavVar.zzw;
            if (charSequence9 != null) {
                this.zzu = charSequence9;
            }
            CharSequence charSequence10 = zzavVar.zzx;
            if (charSequence10 != null) {
                this.zzv = charSequence10;
            }
            Integer num12 = zzavVar.zzy;
            if (num12 != null) {
                this.zzw = num12;
            }
        }
        return this;
    }

    public final zzat zzc(@Nullable CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzat zzd(@Nullable CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzat zze(@Nullable CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzat zzf(@Nullable CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzat zzg(@Nullable CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzat zzh(@Nullable CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzat zzi(@Nullable CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzat zzj(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzat zzk(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzat zzl(@Nullable Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzat zzm(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzat zzn(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzat zzo(@Nullable Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzat zzp(@Nullable CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzat zzq(@Nullable CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzat zzr(@Nullable Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzat zzs(@Nullable Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzat zzt(@Nullable CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzav zzu() {
        return new zzav(this);
    }

    public zzat() {
        this.zzx = zzfxn.zzn();
    }
}
