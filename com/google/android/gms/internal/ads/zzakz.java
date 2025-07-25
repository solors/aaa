package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzakz implements zzakf {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzdy zze = new zzdy();

    @VisibleForTesting(otherwise = 2)
    public static float zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long zzc(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = j + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        String str;
        char c;
        char c2;
        int i3;
        zzco zzp;
        zzakz zzakzVar = this;
        zzakzVar.zze.zzJ(bArr, i + i2);
        zzakzVar.zze.zzL(i);
        Charset zzC = zzakzVar.zze.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzz = zzakzVar.zze.zzz(zzC);
            if (zzz == null) {
                return;
            }
            if (zzz.length() != 0) {
                try {
                    Integer.parseInt(zzz);
                    String zzz2 = zzakzVar.zze.zzz(zzC);
                    if (zzz2 == null) {
                        zzdo.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzz2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        int i4 = 0;
                        zzakzVar.zzc.setLength(0);
                        zzakzVar.zzd.clear();
                        String zzz3 = zzakzVar.zze.zzz(zzC);
                        while (!TextUtils.isEmpty(zzz3)) {
                            if (zzakzVar.zzc.length() > 0) {
                                zzakzVar.zzc.append("<br>");
                            }
                            StringBuilder sb2 = zzakzVar.zzc;
                            ArrayList arrayList = zzakzVar.zzd;
                            String trim = zzz3.trim();
                            StringBuilder sb3 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i5;
                                int length = group.length();
                                sb3.replace(start, start + length, "");
                                i5 += length;
                            }
                            sb2.append(sb3.toString());
                            zzz3 = zzakzVar.zze.zzz(zzC);
                            i4 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(zzakzVar.zzc.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 < zzakzVar.zzd.size()) {
                                str = (String) zzakzVar.zzd.get(i6);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i6++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcm zzcmVar = new zzcm();
                        zzcmVar.zzl(fromHtml);
                        if (str == null) {
                            zzp = zzcmVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0 || c == 1 || c == 2) {
                                zzcmVar.zzi(0);
                            } else if (c != 3 && c != 4 && c != 5) {
                                zzcmVar.zzi(1);
                            } else {
                                zzcmVar.zzi(2);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0 || c2 == 1) {
                                i3 = 2;
                            } else if (c2 != 2) {
                                if (c2 != 3 && c2 != 4 && c2 != 5) {
                                    zzcmVar.zzf(1);
                                } else {
                                    zzcmVar.zzf(0);
                                }
                                zzcmVar.zzh(zzb(zzcmVar.zzb()));
                                zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                                zzp = zzcmVar.zzp();
                            } else {
                                i3 = 2;
                            }
                            zzcmVar.zzf(i3);
                            zzcmVar.zzh(zzb(zzcmVar.zzb()));
                            zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                            zzp = zzcmVar.zzp();
                        }
                        zzdbVar.zza(new zzajx(zzfxn.zzo(zzp), zzc, zzc2 - zzc));
                    } else {
                        zzdo.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdo.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                }
            }
            zzakzVar = this;
        }
    }
}
