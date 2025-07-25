package p752k3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: k3.f */
/* loaded from: classes5.dex */
public class HSTimer {

    /* renamed from: a */
    private static final Map<String, Long> f98660a = new HashMap();

    /* renamed from: a */
    public static long m18259a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (C37383m.m18236d(str)) {
            return -1L;
        }
        Map<String, Long> map = f98660a;
        if (!map.containsKey(str)) {
            return -1L;
        }
        return currentTimeMillis - map.remove(str).longValue();
    }

    /* renamed from: b */
    public static void m18258b(String str) {
        f98660a.put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
