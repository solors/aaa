package p1052y3;

import android.os.Bundle;
import io.appmetrica.analytics.impl.C33933H2;
import p1020w3.InnerEvent;
import p1036x3.InnerAnalyzeManager;

/* renamed from: y3.b */
/* loaded from: classes6.dex */
public class AppStartEvent extends InnerEvent {
    public AppStartEvent() {
        super("learnings_app_start", new Bundle());
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
        m1087p("normal");
        m1088o(InnerAnalyzeManager.m2018p().m2019o());
        mo2359k();
    }

    /* renamed from: o */
    public void m1088o(String str) {
        this.f116988b.putString("source", str);
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    public void onBackToForeground() {
        m1087p(C33933H2.f92945g);
        m1088o(InnerAnalyzeManager.m2018p().m2019o());
        mo2359k();
    }

    /* renamed from: p */
    public void m1087p(String str) {
        this.f116988b.putString("type", str);
    }
}
