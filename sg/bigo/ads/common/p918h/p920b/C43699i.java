package sg.bigo.ads.common.p918h.p920b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.h.b.i */
/* loaded from: classes10.dex */
public final class C43699i {

    /* renamed from: a */
    private static Map<String, C43690a> f114398a = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5169a() {
        f114398a.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static Collection<C43690a> m5166b() {
        return f114398a.values();
    }

    /* renamed from: c */
    public static C43690a m5163c(String str) {
        if (f114398a.containsKey(str)) {
            return f114398a.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m5168a(String str) {
        C43690a m5163c = m5163c(str);
        if (m5163c == null) {
            C43782a.m5009a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i = m5163c.f114380e;
        if (i == C43698h.f114393d || i == C43698h.f114395f) {
            C43782a.m5010a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(m5163c)));
            return;
        }
        m5163c.f114380e = C43698h.f114391b;
        C43695f.m5177a().m5176a(m5163c.f114376a);
        C43697g.f114389a.execute(m5163c.f114378c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static void m5165b(String str) {
        C43690a m5163c = m5163c(str);
        if (m5163c != null) {
            m5167a(m5163c);
        } else {
            C43782a.m5009a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f114398a.containsKey(str)) {
            f114398a.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5167a(C43690a c43690a) {
        c43690a.f114381f = "It's remove !!!";
        if (c43690a.f114380e != C43698h.f114395f) {
            c43690a.f114380e = C43698h.f114396g;
            C43695f.m5177a().m5176a(c43690a.f114376a);
        }
        C43695f.m5177a().m5173b(c43690a.f114376a);
        C43697g.m5172a(c43690a.f114378c);
    }

    /* renamed from: b */
    public static void m5164b(C43690a c43690a) {
        if (f114398a.containsKey(c43690a.f114376a)) {
            return;
        }
        C43782a.m5010a(0, 3, "TaskManager", " " + f114398a.keySet().size());
        f114398a.put(c43690a.f114376a, c43690a);
    }
}
