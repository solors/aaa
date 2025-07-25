package p1036x3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p027b4.SharedUtil;
import p1020w3.C44574a;
import p1020w3.InnerEvent;
import p1052y3.AppEngagementEvent;
import p1052y3.AppStartEvent;
import p1052y3.FirstOpenEvent;
import p1052y3.FirstScrCreateEvent;
import p1052y3.SesStartEvent;
import p1067z3.AnalyzeLifeCycleManager;

/* renamed from: x3.b */
/* loaded from: classes6.dex */
public class InnerAnalyzeManager extends AbsInnerAnalyzeManager {

    /* renamed from: g */
    private static volatile InnerAnalyzeManager f117419g;

    /* renamed from: e */
    private volatile int f117420e;

    /* renamed from: f */
    private List<Class<? extends Activity>> f117421f;

    private InnerAnalyzeManager() {
    }

    /* renamed from: p */
    public static InnerAnalyzeManager m2018p() {
        if (f117419g == null) {
            synchronized (InnerAnalyzeManager.class) {
                if (f117419g == null) {
                    f117419g = new InnerAnalyzeManager();
                }
            }
        }
        return f117419g;
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo839a() {
        super.mo839a();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo838b() {
        super.mo838b();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo837c() {
        super.mo837c();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo836d() {
        super.mo836d();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager
    /* renamed from: e */
    void mo2025e(Context context) {
        int i;
        if (SharedUtil.m103936a(context, "key_first_open", 0) == 0) {
            if (TextUtils.equals("unset", SharedUtil.m103935b(context, "key_learningsId", "unset"))) {
                i = 1;
            } else {
                i = 2;
            }
            SharedUtil.m103933d(context, "key_first_open", i);
        }
    }

    @Override // p1036x3.AbsInnerAnalyzeManager
    /* renamed from: f */
    void mo2024f(List<InnerEvent> list) {
        list.add(new FirstOpenEvent());
        list.add(new SesStartEvent());
        list.add(new AppStartEvent());
        list.add(new FirstScrCreateEvent());
        list.add(new AppEngagementEvent());
    }

    @Override // p1036x3.AbsInnerAnalyzeManager
    /* renamed from: g */
    public /* bridge */ /* synthetic */ Context mo2023g() {
        return super.mo2023g();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo2022k(Application application) {
        super.mo2022k(application);
    }

    @SafeVarargs
    /* renamed from: m */
    public final void m2021m(Class<? extends Activity>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            if (this.f117421f == null) {
                this.f117421f = new ArrayList();
            }
            this.f117421f.addAll(new ArrayList(Arrays.asList(clsArr)));
            return;
        }
        throw new NullPointerException("addDisObserveActivity method parameter cannot be empty or null");
    }

    /* renamed from: n */
    public void m2020n(C44574a c44574a) {
        if (c44574a != null && !(c44574a instanceof InnerEvent)) {
            c44574a.m2368l(AnalyzeLifeCycleManager.m847p().m846q());
            for (InnerEvent innerEvent : m2029h()) {
                if (TextUtils.equals(innerEvent.m2371g(), c44574a.m2371g())) {
                    String str = "this is event is innerEvent，you must delete it，the name of event :" + c44574a.m2371g();
                    Log.v("AnalyzeLog", str);
                    throw new RuntimeException(str);
                }
            }
        }
    }

    /* renamed from: o */
    public String m2019o() {
        int i = this.f117420e;
        if (i != 1) {
            if (i != 2) {
                return "normal";
            }
            this.f117420e = 0;
            return "push";
        }
        this.f117420e = 0;
        return "unknown";
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    public /* bridge */ /* synthetic */ void onBackToForeground() {
        super.onBackToForeground();
    }

    @Override // p1036x3.AbsInnerAnalyzeManager, p1067z3.IInnerEventOpportunity
    public /* bridge */ /* synthetic */ void onBackground() {
        super.onBackground();
    }

    /* renamed from: q */
    public boolean m2017q(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls != null && (list = this.f117421f) != null) {
            return list.contains(cls);
        }
        return false;
    }

    /* renamed from: r */
    public void m2016r(int i) {
        this.f117420e = i;
    }

    /* renamed from: s */
    public void m2015s(C44574a c44574a) {
        if (c44574a == null || (c44574a instanceof InnerEvent) || !c44574a.m2369j()) {
            return;
        }
        Bundle m2372f = c44574a.m2372f();
        if (m2372f == null) {
            m2372f = new Bundle();
            c44574a.m2367m(m2372f);
        }
        m2372f.putString("ses_id", m2028i());
        m2372f.putInt("ses_num", m2027j());
    }
}
