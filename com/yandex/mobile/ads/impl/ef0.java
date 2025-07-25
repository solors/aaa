package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C15633C;
import com.ironsource.C20517nb;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public final class ef0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, String> m34600a(InterfaceC31376sl.C31377a c31377a) {
        if (c31377a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c31377a.f85294b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = c31377a.f85296d;
        if (j > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public static InterfaceC31376sl.C31377a m34601a(c91 c91Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c91Var.f77558c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long m34599a = str != null ? m34599a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long m34599a2 = str3 != null ? m34599a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long m34599a3 = str4 != null ? m34599a(str4) : 0L;
        String str5 = map.get("ETag");
        if (i != 0) {
            j4 = currentTimeMillis + (j * 1000);
            if (!z) {
                j3 = j4;
                j4 = (j2 * 1000) + j4;
                InterfaceC31376sl.C31377a c31377a = new InterfaceC31376sl.C31377a();
                c31377a.f85293a = c91Var.f77557b;
                c31377a.f85294b = str5;
                c31377a.f85298f = j3;
                c31377a.f85297e = j4;
                c31377a.f85295c = m34599a;
                c31377a.f85296d = m34599a3;
                c31377a.f85299g = map;
                c31377a.f85300h = c91Var.f77559d;
                return c31377a;
            }
            j3 = j4;
            InterfaceC31376sl.C31377a c31377a2 = new InterfaceC31376sl.C31377a();
            c31377a2.f85293a = c91Var.f77557b;
            c31377a2.f85294b = str5;
            c31377a2.f85298f = j3;
            c31377a2.f85297e = j4;
            c31377a2.f85295c = m34599a;
            c31377a2.f85296d = m34599a3;
            c31377a2.f85299g = map;
            c31377a2.f85300h = c91Var.f77559d;
            return c31377a2;
        }
        j3 = 0;
        if (m34599a <= 0 || m34599a2 < m34599a) {
            j4 = 0;
            InterfaceC31376sl.C31377a c31377a22 = new InterfaceC31376sl.C31377a();
            c31377a22.f85293a = c91Var.f77557b;
            c31377a22.f85294b = str5;
            c31377a22.f85298f = j3;
            c31377a22.f85297e = j4;
            c31377a22.f85295c = m34599a;
            c31377a22.f85296d = m34599a3;
            c31377a22.f85299g = map;
            c31377a22.f85300h = c91Var.f77559d;
            return c31377a22;
        }
        j4 = currentTimeMillis + (m34599a2 - m34599a);
        j3 = j4;
        InterfaceC31376sl.C31377a c31377a222 = new InterfaceC31376sl.C31377a();
        c31377a222.f85293a = c91Var.f77557b;
        c31377a222.f85294b = str5;
        c31377a222.f85298f = j3;
        c31377a222.f85297e = j4;
        c31377a222.f85295c = m34599a;
        c31377a222.f85296d = m34599a3;
        c31377a222.f85299g = map;
        c31377a222.f85300h = c91Var.f77559d;
        return c31377a222;
    }

    /* renamed from: a */
    public static String m34598a(@Nullable Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] split = str.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals(C20517nb.f52166M)) {
                    return split2[1];
                }
            }
        }
        return C15633C.ISO88591_NAME;
    }

    /* renamed from: a */
    public static long m34599a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Object[] objArr = {str};
                boolean z = zc2.f88824a;
                um0.m28726c(objArr);
                return 0L;
            }
            Object[] objArr2 = {str};
            boolean z2 = zc2.f88824a;
            um0.m28724e(objArr2);
            return 0L;
        }
    }
}
