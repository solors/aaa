package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbr {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzab[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbr(String str, zzab... zzabVarArr) {
        boolean z;
        int length = zzabVarArr.length;
        int i = 1;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zzb = str;
        this.zzd = zzabVarArr;
        this.zza = length;
        int zzb = zzbb.zzb(zzabVarArr[0].zzo);
        this.zzc = zzb == -1 ? zzbb.zzb(zzabVarArr[0].zzn) : zzb;
        String zzc = zzc(zzabVarArr[0].zzd);
        int i2 = zzabVarArr[0].zzf | 16384;
        while (true) {
            zzab[] zzabVarArr2 = this.zzd;
            if (i < zzabVarArr2.length) {
                if (!zzc.equals(zzc(zzabVarArr2[i].zzd))) {
                    zzab[] zzabVarArr3 = this.zzd;
                    zzd("languages", zzabVarArr3[0].zzd, zzabVarArr3[i].zzd, i);
                    return;
                }
                zzab[] zzabVarArr4 = this.zzd;
                if (i2 != (zzabVarArr4[i].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzabVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        if (str != null && !str.equals("und")) {
            return str;
        }
        return "";
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i) {
        zzdo.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbr.class == obj.getClass()) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.zzb.equals(zzbrVar.zzb) && Arrays.equals(this.zzd, zzbrVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = ((this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzab zzabVar) {
        int i = 0;
        while (true) {
            zzab[] zzabVarArr = this.zzd;
            if (i < zzabVarArr.length) {
                if (zzabVar == zzabVarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final zzab zzb(int i) {
        return this.zzd[i];
    }
}
