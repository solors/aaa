package com.google.android.gms.internal.ads;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaky {
    public final String zza;
    public final int zzb;
    @Nullable
    @ColorInt
    public final Integer zzc;
    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaky(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
        if (r4 != 3) goto L54;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaky zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzakw r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaky.zzb(java.lang.String, com.google.android.gms.internal.ads.zzakw):com.google.android.gms.internal.ads.zzaky");
    }

    @Nullable
    @ColorInt
    public static Integer zzc(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            zzcw.zzd(z);
            int zzb = zzgaq.zzb(((parseLong >> 24) & 255) ^ 255);
            int zzb2 = zzgaq.zzb((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(zzb, zzgaq.zzb(parseLong & 255), zzgaq.zzb((parseLong >> 8) & 255), zzb2));
        } catch (IllegalArgumentException e) {
            zzdo.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        zzdo.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            zzdo.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
