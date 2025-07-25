package p694h4;

import p694h4.LTVManager;
import p737j4.C37279b;
import p737j4.C37287d;
import p753k4.C37388f;
import p753k4.LogUtil;

/* renamed from: h4.k */
/* loaded from: classes6.dex */
public class LTVManager {

    /* renamed from: a */
    private final String f91335a;

    /* renamed from: b */
    private final String f91336b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LTVManager.java */
    /* renamed from: h4.k$b */
    /* loaded from: classes6.dex */
    public static class C33477b {

        /* renamed from: a */
        private static final LTVManager f91337a = new LTVManager();
    }

    /* compiled from: LTVManager.java */
    /* renamed from: h4.k$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC33478c {
        /* renamed from: a */
        void mo2357a(double d);
    }

    /* renamed from: a */
    public static /* synthetic */ void m23706a(LTVManager lTVManager, InterfaceC33478c interfaceC33478c) {
        lTVManager.m23698i(interfaceC33478c);
    }

    /* renamed from: b */
    public static /* synthetic */ void m23705b(InterfaceC33478c interfaceC33478c, double d) {
        interfaceC33478c.mo2357a(d);
    }

    /* renamed from: c */
    public static LTVManager m23704c() {
        return C33477b.f91337a;
    }

    /* renamed from: d */
    private C37287d.C37290c m23703d() {
        return C37287d.m18566a().m18565b(C37279b.m18579k().m18578l());
    }

    /* renamed from: i */
    public /* synthetic */ void m23698i(final InterfaceC33478c interfaceC33478c) {
        final double m23702e = m23702e();
        if (LogUtil.m18217a()) {
            LogUtil.m18216b("GRT_LTVManager", "getLtv result: " + m23702e);
        }
        C37388f.m18208b(new Runnable() { // from class: h4.j
            @Override // java.lang.Runnable
            public final void run() {
                LTVManager.m23705b(LTVManager.InterfaceC33478c.this, m23702e);
            }
        });
    }

    /* renamed from: e */
    public double m23702e() {
        try {
            return Double.parseDouble(m23703d().m18559c("sp_key_ltv", "0"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: f */
    public void m23701f(final InterfaceC33478c interfaceC33478c) {
        if (interfaceC33478c == null) {
            return;
        }
        EventWorker.m23707b(new Runnable() { // from class: h4.i
            @Override // java.lang.Runnable
            public final void run() {
                LTVManager.m23706a(LTVManager.this, interfaceC33478c);
            }
        });
    }

    /* renamed from: g */
    public void m23700g(double d) {
        LogUtil.m18216b("GRT_LTVManager", "increaseLTV : " + d);
        if (d == 0.0d) {
            return;
        }
        m23703d().m18557e("sp_key_ltv", String.valueOf(m23702e() + d));
    }

    /* renamed from: j */
    public void m23697j() {
        try {
            if (m23702e() > 0.0d) {
                return;
            }
            String m18559c = C37287d.m18566a().m18564c(C37279b.m18579k().m18578l(), "meevii_adconfig").m18559c("meevii_total_ltv", "0");
            m23703d().m18557e("sp_key_ltv", m18559c);
            C37287d.m18566a().m18563d("meevii_adconfig");
            if (LogUtil.m18217a()) {
                LogUtil.m18216b("GRT_LTVManager", "merge ltv：" + m18559c);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private LTVManager() {
        this.f91335a = "GRT_LTVManager";
        this.f91336b = "sp_key_ltv";
    }
}
