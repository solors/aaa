package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgu {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(@Nullable String str, @Nullable String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzdo.zzc("HttpUtil", "Unexpected Content-Length [" + str + C21114v8.C21123i.f54139e);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = zza.matcher(str2);
            if (matcher.matches()) {
                try {
                    String group = matcher.group(2);
                    group.getClass();
                    long parseLong = Long.parseLong(group);
                    String group2 = matcher.group(1);
                    group2.getClass();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                    if (i < 0) {
                        return parseLong2;
                    }
                    if (j != parseLong2) {
                        zzdo.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C21114v8.C21123i.f54139e);
                        return Math.max(j, parseLong2);
                    }
                    return j;
                } catch (NumberFormatException unused2) {
                    zzdo.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + C21114v8.C21123i.f54139e);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    public static long zzb(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zzb.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                return Long.parseLong(group);
            }
            return -1L;
        }
        return -1L;
    }
}
