package p1052y3;

import android.os.Bundle;
import io.appmetrica.analytics.impl.C33933H2;
import p027b4.DebugUtil;
import p1020w3.InnerEvent;

/* renamed from: y3.e */
/* loaded from: classes6.dex */
public class SesStartEvent extends InnerEvent {

    /* renamed from: f */
    public static final int f118458f = DebugUtil.m103941b();

    public SesStartEvent() {
        super("learnings_ses_start", new Bundle());
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
        m1084o("normal");
        mo2359k();
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: d */
    public void mo836d() {
        m1084o(C33933H2.f92945g);
        mo2359k();
    }

    /* renamed from: o */
    public void m1084o(String str) {
        this.f116988b.putString("type", str);
    }
}
