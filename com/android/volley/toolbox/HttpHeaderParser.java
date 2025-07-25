package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import com.google.android.exoplayer2.C15633C;
import com.ironsource.C20517nb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.android.volley.toolbox.e */
/* loaded from: classes2.dex */
public class HttpHeaderParser {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<Header> m102239a(List<Header> list, Cache.C3744a c3744a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (Header header : list) {
                treeSet.add(header.m102295a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<Header> list2 = c3744a.f3452h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header2 : c3744a.f3452h) {
                    if (!treeSet.contains(header2.m102295a())) {
                        arrayList.add(header2);
                    }
                }
            }
        } else if (!c3744a.f3451g.isEmpty()) {
            for (Map.Entry<String, String> entry : c3744a.f3451g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new Header(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    static String m102238b(long j) {
        return m102236d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Map<String, String> m102237c(Cache.C3744a c3744a) {
        if (c3744a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c3744a.f3446b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = c3744a.f3448d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", m102238b(j));
        }
        return hashMap;
    }

    /* renamed from: d */
    private static SimpleDateFormat m102236d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    @Nullable
    /* renamed from: e */
    public static Cache.C3744a m102235e(NetworkResponse networkResponse) {
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
        Map<String, String> map = networkResponse.f3481c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j = m102232h(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j4 = m102232h(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j5 = m102232h(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get("ETag");
        if (i != 0) {
            j7 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j8 = j7;
            } else {
                j8 = (j3 * 1000) + j7;
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
        Cache.C3744a c3744a = new Cache.C3744a();
        c3744a.f3445a = networkResponse.f3480b;
        c3744a.f3446b = str5;
        c3744a.f3450f = j7;
        c3744a.f3449e = j6;
        c3744a.f3447c = j;
        c3744a.f3448d = j5;
        c3744a.f3451g = map;
        c3744a.f3452h = networkResponse.f3482d;
        return c3744a;
    }

    /* renamed from: f */
    public static String m102234f(@Nullable Map<String, String> map) {
        return m102233g(map, C15633C.ISO88591_NAME);
    }

    /* renamed from: g */
    public static String m102233g(@Nullable Map<String, String> map, String str) {
        if (map == null) {
            return str;
        }
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals(C20517nb.f52166M)) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: h */
    public static long m102232h(String str) {
        try {
            return m102236d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                VolleyLog.m102195d(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            VolleyLog.m102194e("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static List<Header> m102231i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Map<String, String> m102230j(List<Header> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.m102295a(), header.m102294b());
        }
        return treeMap;
    }
}
