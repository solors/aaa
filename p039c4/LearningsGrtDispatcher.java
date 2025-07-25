package p039c4;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.learnings.grt.debug.GrtDebugActivity;
import java.util.List;
import java.util.Map;
import p649e4.C32925g;
import p694h4.C33471g;
import p694h4.LTVManager;
import p737j4.C37276a;
import p737j4.C37279b;
import p753k4.LogUtil;

/* renamed from: c4.d */
/* loaded from: classes6.dex */
public class LearningsGrtDispatcher {

    /* renamed from: a */
    private final String f1862a;

    /* renamed from: b */
    private volatile boolean f1863b;

    /* renamed from: c */
    private volatile boolean f1864c;

    /* compiled from: LearningsGrtDispatcher.java */
    /* renamed from: c4.d$b */
    /* loaded from: classes6.dex */
    private static class C3423b {

        /* renamed from: a */
        private static final LearningsGrtDispatcher f1865a = new LearningsGrtDispatcher();
    }

    /* renamed from: c */
    public static LearningsGrtDispatcher m103659c() {
        return C3423b.f1865a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m103656f(List list) {
        C33471g.m23720j().m23710t(list);
    }

    /* renamed from: b */
    public void m103660b(Class<? extends Activity>... clsArr) {
        C37276a.m18592b().m18593a(clsArr);
    }

    /* renamed from: d */
    public void m103658d(LTVManager.InterfaceC33478c interfaceC33478c) {
        LTVManager.m23704c().m23701f(interfaceC33478c);
    }

    /* renamed from: e */
    public void m103657e(GrtInitParameter grtInitParameter) {
        if (this.f1863b) {
            return;
        }
        LogUtil.m18215c(grtInitParameter.m103677e());
        LogUtil.m18216b("GRT_LearningsGrtDispatcher", "init");
        m103653i((Application) grtInitParameter.m103681a().getApplicationContext());
        C33471g.m23720j().m23719k(grtInitParameter);
        C32925g.m25520f().m25519g(grtInitParameter, new C32925g.InterfaceC32928c() { // from class: c4.c
            @Override // p649e4.C32925g.InterfaceC32928c
            public final void onSuccess(List list) {
                LearningsGrtDispatcher.m103656f(list);
            }
        });
        this.f1863b = true;
    }

    /* renamed from: g */
    public void m103655g(Activity activity) {
        activity.startActivity(new Intent(activity, GrtDebugActivity.class));
    }

    /* renamed from: h */
    public void m103654h(Map<String, String> map) {
        C33471g.m23720j().m23712r(map);
    }

    /* renamed from: i */
    public void m103653i(Application application) {
        if (application == null) {
            return;
        }
        if (this.f1864c) {
            LogUtil.m18216b("GRT_LearningsGrtDispatcher", "has Observe");
            return;
        }
        LogUtil.m18216b("GRT_LearningsGrtDispatcher", "startObserve");
        C37279b.m18579k().m18574p(application);
        C32925g.m25520f().m25508r();
        C33471g.m23720j().m23711s();
        this.f1864c = true;
    }

    private LearningsGrtDispatcher() {
        this.f1862a = "GRT_LearningsGrtDispatcher";
    }
}
