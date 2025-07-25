package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaqj {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzapy.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapy.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    public static zzaov zzb(zzapi zzapiVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapiVar.zzc;
        if (map != null) {
            String str = (String) map.get("Date");
            if (str != null) {
                j = zza(str);
            } else {
                j = 0;
            }
            String str2 = (String) map.get("Cache-Control");
            int i = 0;
            if (str2 != null) {
                String[] split = str2.split(",", 0);
                z = false;
                j2 = 0;
                j3 = 0;
                while (i < split.length) {
                    String trim = split[i].trim();
                    if (!trim.equals("no-cache") && !trim.equals("no-store")) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j3 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            j2 = Long.parseLong(trim.substring(23));
                        } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    } else {
                        return null;
                    }
                }
                i = 1;
            } else {
                z = false;
                j2 = 0;
                j3 = 0;
            }
            String str3 = (String) map.get("Expires");
            if (str3 != null) {
                j4 = zza(str3);
            } else {
                j4 = 0;
            }
            String str4 = (String) map.get("Last-Modified");
            if (str4 != null) {
                j5 = zza(str4);
            } else {
                j5 = 0;
            }
            String str5 = (String) map.get("ETag");
            if (i != 0) {
                j7 = currentTimeMillis + (j3 * 1000);
                if (z) {
                    j8 = j7;
                } else {
                    j8 = (j2 * 1000) + j7;
                }
                j6 = j8;
            } else {
                j6 = 0;
                if (j > 0 && j4 >= j) {
                    j7 = currentTimeMillis + (j4 - j);
                    j6 = j7;
                } else {
                    j7 = 0;
                }
            }
            zzaov zzaovVar = new zzaov();
            zzaovVar.zza = zzapiVar.zzb;
            zzaovVar.zzb = str5;
            zzaovVar.zzf = j7;
            zzaovVar.zze = j6;
            zzaovVar.zzc = j;
            zzaovVar.zzd = j5;
            zzaovVar.zzg = map;
            zzaovVar.zzh = zzapiVar.zzd;
            return zzaovVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
