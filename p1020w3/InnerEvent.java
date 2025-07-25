package p1020w3;

import android.os.Bundle;
import p005a4.AnalyzePlatform;
import p1007v3.AnalyzeManager;
import p1067z3.IInnerEventOpportunity;

/* renamed from: w3.c */
/* loaded from: classes6.dex */
public class InnerEvent extends C44574a implements IInnerEventOpportunity {
    public InnerEvent(String str, Bundle bundle) {
        super(str, bundle, new AnalyzePlatform[0]);
    }

    @Override // p1020w3.C44574a
    /* renamed from: h */
    public AnalyzePlatform[] mo2360h() {
        return new AnalyzePlatform[]{AnalyzePlatform.f53e};
    }

    @Override // p1020w3.C44574a
    /* renamed from: k */
    public void mo2359k() {
        Bundle bundle = new Bundle();
        bundle.putAll(this.f116988b);
        AnalyzeManager.m2724q(new InnerEvent(this.f116987a, bundle));
    }

    /* renamed from: n */
    public void m2358n(String str, int i) {
        this.f116988b.putString("ses_id", str);
        this.f116988b.putInt("ses_num", i);
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: b */
    public void mo838b() {
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: c */
    public void mo837c() {
    }

    @Override // p1067z3.IInnerEventOpportunity
    /* renamed from: d */
    public void mo836d() {
    }

    @Override // p1067z3.IInnerEventOpportunity
    public void onBackToForeground() {
    }

    @Override // p1067z3.IInnerEventOpportunity
    public void onBackground() {
    }
}
