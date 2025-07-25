package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Tuples;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes2.dex */
public final class AFe1ySDK {
    @Nullable
    public static final Tuples<Integer, Integer> AFInAppEventParameterName(@NotNull String str) {
        Integer num;
        Integer num2;
        Integer num3;
        String m16773a;
        String m16773a2;
        String m16773a3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult m16767d = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").m16767d(str);
        if (m16767d != null) {
            MatchGroup matchGroup = m16767d.mo16749b().get(1);
            if (matchGroup != null && (m16773a3 = matchGroup.m16773a()) != null) {
                num = StringNumberConversions.m16640m(m16773a3);
            } else {
                num = null;
            }
            MatchGroup matchGroup2 = m16767d.mo16749b().get(3);
            if (matchGroup2 != null && (m16773a2 = matchGroup2.m16773a()) != null) {
                num2 = StringNumberConversions.m16640m(m16773a2);
            } else {
                num2 = null;
            }
            MatchGroup matchGroup3 = m16767d.mo16749b().get(4);
            if (matchGroup3 != null && (m16773a = matchGroup3.m16773a()) != null) {
                num3 = StringNumberConversions.m16640m(m16773a);
            } else {
                num3 = null;
            }
            if (num != null) {
                return C38513v.m14532a(Integer.valueOf(num.intValue() * 1000000), Integer.valueOf(((num.intValue() + 1) * 1000000) - 1));
            }
            if (num2 != null && num3 != null) {
                return C38513v.m14532a(Integer.valueOf((num2.intValue() * 1000000) + (num3.intValue() * 1000)), Integer.valueOf(((num2.intValue() * 1000000) + ((num3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    @Nullable
    public static final Tuples<Integer, Integer> AFKeystoreWrapper(@NotNull String str) {
        String m16773a;
        String m16773a2;
        String m16773a3;
        String m16773a4;
        String m16773a5;
        String m16773a6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult m16767d = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").m16767d(str);
        if (m16767d != null) {
            MatchGroup matchGroup = m16767d.mo16749b().get(1);
            Integer m16640m = (matchGroup == null || (m16773a6 = matchGroup.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a6);
            MatchGroup matchGroup2 = m16767d.mo16749b().get(2);
            Integer m16640m2 = (matchGroup2 == null || (m16773a5 = matchGroup2.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a5);
            MatchGroup matchGroup3 = m16767d.mo16749b().get(3);
            Integer m16640m3 = (matchGroup3 == null || (m16773a4 = matchGroup3.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a4);
            MatchGroup matchGroup4 = m16767d.mo16749b().get(4);
            Integer m16640m4 = (matchGroup4 == null || (m16773a3 = matchGroup4.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a3);
            MatchGroup matchGroup5 = m16767d.mo16749b().get(5);
            Integer m16640m5 = (matchGroup5 == null || (m16773a2 = matchGroup5.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a2);
            MatchGroup matchGroup6 = m16767d.mo16749b().get(6);
            Integer m16640m6 = (matchGroup6 == null || (m16773a = matchGroup6.m16773a()) == null) ? null : StringNumberConversions.m16640m(m16773a);
            if (AFKeystoreWrapper(m16640m, m16640m2, m16640m3, m16640m4, m16640m5, m16640m6)) {
                Intrinsics.m17074g(m16640m);
                Intrinsics.m17074g(m16640m2);
                Intrinsics.m17074g(m16640m3);
                Integer valueOf = Integer.valueOf((m16640m.intValue() * 1000000) + (m16640m2.intValue() * 1000) + m16640m3.intValue());
                Intrinsics.m17074g(m16640m4);
                Intrinsics.m17074g(m16640m5);
                Intrinsics.m17074g(m16640m6);
                return C38513v.m14532a(valueOf, Integer.valueOf((m16640m4.intValue() * 1000000) + (m16640m5.intValue() * 1000) + m16640m6.intValue()));
            }
        }
        return null;
    }

    public static final String valueOf(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b : digest) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            sb2.append(format);
            str3 = sb2.toString();
        }
        return str3;
    }

    private static boolean AFKeystoreWrapper(@NotNull Object... objArr) {
        boolean m17338N;
        Intrinsics.checkNotNullParameter(objArr, "");
        m17338N = _Arrays.m17338N(objArr, null);
        return !m17338N;
    }
}
