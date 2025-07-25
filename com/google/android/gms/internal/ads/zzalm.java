package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzalm {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzdy zzc = new zzdy();
    private final StringBuilder zzd = new StringBuilder();

    @Nullable
    static String zza(zzdy zzdyVar, StringBuilder sb2) {
        zzc(zzdyVar);
        if (zzdyVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzdyVar, sb2);
        if (!"".equals(zzd)) {
            return zzd;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) zzdyVar.zzm());
        return sb3.toString();
    }

    static void zzc(zzdy zzdyVar) {
        while (true) {
            for (boolean z = true; zzdyVar.zzb() > 0 && z; z = false) {
                char c = (char) zzdyVar.zzN()[zzdyVar.zzd()];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    int zzd = zzdyVar.zzd();
                    int zze = zzdyVar.zze();
                    byte[] zzN = zzdyVar.zzN();
                    if (zzd + 2 <= zze) {
                        int i = zzd + 1;
                        if (zzN[zzd] == 47) {
                            int i2 = i + 1;
                            if (zzN[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    } else if (((char) zzN[i2]) == '*' && ((char) zzN[i3]) == '/') {
                                        zze = i3 + 1;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzdyVar.zzM(zze - zzdyVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    zzdyVar.zzM(1);
                }
            }
            return;
        }
    }

    private static String zzd(zzdy zzdyVar, StringBuilder sb2) {
        sb2.setLength(0);
        int zzd = zzdyVar.zzd();
        int zze = zzdyVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzd < zze && !z; z = true) {
                char c = (char) zzdyVar.zzN()[zzd];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb2.append(c);
                    zzd++;
                }
            }
        }
        zzdyVar.zzM(zzd - zzdyVar.zzd());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x031a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzdy r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalm.zzb(com.google.android.gms.internal.ads.zzdy):java.util.List");
    }
}
