package com.mbridge.msdk.tracker.network.toolbox;

import com.google.android.exoplayer2.C15633C;
import com.ironsource.C20517nb;
import com.mbridge.msdk.tracker.network.C22899ae;
import com.mbridge.msdk.tracker.network.C22909h;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.InterfaceC22902b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* compiled from: HttpHeaderParser.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.f */
/* loaded from: classes6.dex */
public final class C22921f {
    /* renamed from: a */
    public static InterfaceC22902b.C22903a m49444a(C22913r c22913r) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c22913r.f59818c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long m49443a = str != null ? m49443a(str) : 0L;
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
        long m49443a2 = str3 != null ? m49443a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long m49443a3 = str4 != null ? m49443a(str4) : 0L;
        String str5 = map.get("ETag");
        if (i != 0) {
            j4 = currentTimeMillis + (j * 1000);
            j3 = z ? j4 : (j2 * 1000) + j4;
        } else {
            j3 = 0;
            if (m49443a <= 0 || m49443a2 < m49443a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (m49443a2 - m49443a);
                j3 = j4;
            }
        }
        InterfaceC22902b.C22903a c22903a = new InterfaceC22902b.C22903a();
        c22903a.f59734a = c22913r.f59817b;
        c22903a.f59735b = str5;
        c22903a.f59739f = j4;
        c22903a.f59738e = j3;
        c22903a.f59736c = m49443a;
        c22903a.f59737d = m49443a3;
        c22903a.f59740g = map;
        c22903a.f59741h = c22913r.f59819d;
        return c22903a;
    }

    /* renamed from: b */
    private static SimpleDateFormat m49440b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    private static long m49443a(String str) {
        try {
            Date parse = m49440b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                C22899ae.m49516a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                C22899ae.m49517a("Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m49445a(long j) {
        return m49440b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<C22909h> m49442a(List<C22909h> list, InterfaceC22902b.C22903a c22903a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C22909h c22909h : list) {
                treeSet.add(c22909h.m49512a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C22909h> list2 = c22903a.f59741h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C22909h c22909h2 : c22903a.f59741h) {
                    if (!treeSet.contains(c22909h2.m49512a())) {
                        arrayList.add(c22909h2);
                    }
                }
            }
        } else if (!c22903a.f59740g.isEmpty()) {
            for (Map.Entry<String, String> entry : c22903a.f59740g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C22909h(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m49441a(Map<String, String> map) {
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
}
