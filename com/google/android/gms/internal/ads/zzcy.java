package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes5.dex */
public final class zzcy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, C26485b.f69244a, "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzab r19) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcy.zza(com.google.android.gms.internal.ads.zzab):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r11.equals("L123") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0260  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzk r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcy.zzb(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }

    public static String zzc(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c;
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        if (true != z) {
            c = 'L';
        } else {
            c = 'H';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb2.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
