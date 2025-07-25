package p1051y2;

import p1006v2.HSContext;

/* renamed from: y2.d */
/* loaded from: classes5.dex */
public class HSAppLifeCycleEventsHandler {

    /* compiled from: HSAppLifeCycleEventsHandler.java */
    /* renamed from: y2.d$a */
    /* loaded from: classes5.dex */
    class RunnableC45017a implements Runnable {
        RunnableC45017a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSContext m2757n = HSContext.m2757n();
            m2757n.m2768c().m13327i();
            m2757n.m2768c().m13324l();
            m2757n.m2777B();
            if (!m2757n.m2751t().m23229L() && !m2757n.m2778A()) {
                m2757n.m2765f().m24957a();
            }
        }
    }

    /* compiled from: HSAppLifeCycleEventsHandler.java */
    /* renamed from: y2.d$b */
    /* loaded from: classes5.dex */
    class RunnableC45018b implements Runnable {
        RunnableC45018b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSContext.m2757n().m2765f().m24956b();
        }
    }

    /* renamed from: a */
    public void m1093a() {
        HSContext.m2757n().m2758m().m3278e(new RunnableC45018b());
    }

    /* renamed from: b */
    public void m1092b() {
        HSContext.m2757n().m2758m().m3278e(new RunnableC45017a());
    }
}
