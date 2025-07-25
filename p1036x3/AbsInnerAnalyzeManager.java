package p1036x3;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p027b4.SharedUtil;
import p1020w3.InnerEvent;
import p1067z3.AnalyzeCrashHandler;
import p1067z3.AnalyzeLifeCycleManager;
import p1067z3.IInnerEventOpportunity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x3.a */
/* loaded from: classes6.dex */
public abstract class AbsInnerAnalyzeManager implements IInnerEventOpportunity {

    /* renamed from: a */
    private final List<InnerEvent> f117415a = new ArrayList();

    /* renamed from: b */
    private String f117416b;

    /* renamed from: c */
    private volatile boolean f117417c;

    /* renamed from: d */
    private Context f117418d;

    /* renamed from: l */
    private void m2026l() {
        this.f117416b = String.valueOf(System.currentTimeMillis());
        SharedUtil.m103933d(this.f117418d, "key_ses_num", SharedUtil.m103936a(this.f117418d, "key_ses_num", 0) + 1);
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
        m2026l();
        mo2024f(this.f117415a);
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.m2358n(m2028i(), m2027j());
            innerEvent.mo839a();
        }
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: b */
    public void mo838b() {
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.mo838b();
        }
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: c */
    public void mo837c() {
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.mo837c();
        }
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: d */
    public void mo836d() {
        m2026l();
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.m2358n(m2028i(), m2027j());
            innerEvent.mo836d();
        }
    }

    /* renamed from: e */
    abstract void mo2025e(Context context);

    /* renamed from: f */
    abstract void mo2024f(List<InnerEvent> list);

    /* renamed from: g */
    public Context mo2023g() {
        return this.f117418d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public List<InnerEvent> m2029h() {
        return this.f117415a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public String m2028i() {
        return this.f117416b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public int m2027j() {
        return SharedUtil.m103936a(this.f117418d, "key_ses_num", 0);
    }

    /* renamed from: k */
    public void mo2022k(Application application) {
        if (this.f117417c) {
            return;
        }
        this.f117418d = application;
        mo2025e(application);
        AnalyzeCrashHandler.m864a().m863b(this);
        AnalyzeLifeCycleManager.m847p().m841v(this);
        AnalyzeLifeCycleManager.m847p().m843t(application);
        this.f117417c = true;
    }

    @Override // p1067z3.IInnerEventOpportunity
    public void onBackToForeground() {
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.onBackToForeground();
        }
    }

    @Override // p1067z3.IInnerEventOpportunity
    public void onBackground() {
        for (InnerEvent innerEvent : this.f117415a) {
            innerEvent.onBackground();
        }
    }
}
