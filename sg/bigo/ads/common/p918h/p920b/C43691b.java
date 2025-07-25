package sg.bigo.ads.common.p918h.p920b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.h.b.b */
/* loaded from: classes10.dex */
public final class C43691b {
    /* renamed from: a */
    public static C43681a m5193a(String str) {
        C43690a m5163c = C43699i.m5163c(str);
        if (m5163c != null) {
            return m5163c.f114377b;
        }
        return null;
    }

    /* renamed from: b */
    public static <T> void m5189b(T t) {
        if (t == null) {
            return;
        }
        if (t.getClass() == String.class) {
            C43699i.m5165b((String) t);
        } else {
            C43782a.m5009a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    /* renamed from: c */
    public static <T> void m5188c(T t) {
        if (t == null) {
            return;
        }
        if (t.getClass() == String.class) {
            C43699i.m5168a((String) t);
        } else {
            C43782a.m5009a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    /* renamed from: a */
    public static void m5195a() {
        for (C43690a c43690a : C43699i.m5166b()) {
            C43699i.m5167a(c43690a);
        }
        C43699i.m5169a();
    }

    /* renamed from: a */
    public static <T> void m5194a(T t) {
        if (t == null) {
            return;
        }
        if (t.getClass() == C43681a.class) {
            m5191a((C43681a) t);
        } else if (!(t instanceof List)) {
            C43782a.m5009a(0, "DownloadHandler", "argument is only Downloader or List ");
        } else {
            List<C43681a> list = (List) t;
            if (list.size() <= 0 || list.get(0).getClass() != C43681a.class) {
                C43782a.m5009a(0, "DownloadHandler", "argument of collect is only Downloader");
                return;
            }
            for (C43681a c43681a : list) {
                m5191a(c43681a);
            }
        }
    }

    /* renamed from: a */
    public static void m5192a(String str, InterfaceC43694e interfaceC43694e) {
        CopyOnWriteArrayList<InterfaceC43694e> copyOnWriteArrayList;
        C43695f m5177a = C43695f.m5177a();
        if (m5177a.f114387a.containsKey(str)) {
            copyOnWriteArrayList = m5177a.f114387a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.contains(interfaceC43694e)) {
            return;
        }
        copyOnWriteArrayList.add(interfaceC43694e);
        m5177a.f114387a.put(str, copyOnWriteArrayList);
    }

    /* renamed from: a */
    private static void m5191a(C43681a c43681a) {
        C43690a m5163c = C43699i.m5163c(c43681a.f114335a);
        if (m5163c != null) {
            if (m5163c.f114377b.equals(c43681a)) {
                m5163c.m5196b(c43681a.f114340f);
                m5163c.m5197a(c43681a.f114342h);
                m5163c.f114380e = C43698h.f114390a;
                C43695f.m5177a().m5176a(c43681a.f114335a);
                return;
            }
            m5189b(c43681a.f114335a);
        }
        C43690a c43690a = new C43690a(c43681a);
        c43690a.f114378c = new RunnableC43693d(c43690a);
        c43690a.f114380e = C43698h.f114390a;
        C43699i.m5164b(c43690a);
    }

    /* renamed from: a */
    public static void m5190a(boolean z) {
        C43697g.m5171a(z);
    }
}
