package p1052y3;

import android.os.Bundle;
import io.appmetrica.analytics.impl.C33933H2;
import p027b4.DebugUtil;
import p1020w3.InnerEvent;

/* renamed from: y3.a */
/* loaded from: classes6.dex */
public class AppEngagementEvent extends InnerEvent {

    /* renamed from: g */
    public static final int f118456g = DebugUtil.m103942a();

    /* renamed from: f */
    private long f118457f;

    public AppEngagementEvent() {
        super("learnings_app_engagement", new Bundle());
        this.f118457f = System.currentTimeMillis();
    }

    /* renamed from: o */
    private int m1091o() {
        long abs = Math.abs(System.currentTimeMillis() - this.f118457f);
        if (abs > 600000) {
            return 0;
        }
        return (int) abs;
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
        this.f118457f = System.currentTimeMillis();
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: b */
    public void mo838b() {
        m1090p(m1091o());
        m1089q("crash");
        mo2359k();
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: c */
    public void mo837c() {
        m1090p(f118456g);
        m1089q("normal");
        mo2359k();
        this.f118457f = System.currentTimeMillis();
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    public void onBackToForeground() {
        this.f118457f = System.currentTimeMillis();
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    public void onBackground() {
        m1090p(m1091o());
        m1089q(C33933H2.f92945g);
        mo2359k();
    }

    /* renamed from: p */
    public void m1090p(int i) {
        this.f116988b.putInt("engagement_time", i);
    }

    /* renamed from: q */
    public void m1089q(String str) {
        this.f116988b.putString("type", str);
    }
}
