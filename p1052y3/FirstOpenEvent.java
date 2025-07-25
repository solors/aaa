package p1052y3;

import android.os.Bundle;
import p027b4.SharedUtil;
import p1020w3.InnerEvent;
import p1036x3.InnerAnalyzeManager;

/* renamed from: y3.c */
/* loaded from: classes6.dex */
public class FirstOpenEvent extends InnerEvent {
    public FirstOpenEvent() {
        super("learnings_first_open", new Bundle());
    }

    /* renamed from: o */
    private boolean m1086o() {
        if (SharedUtil.m103936a(InnerAnalyzeManager.m2018p().mo2023g(), "key_first_open", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private void m1085p() {
        SharedUtil.m103933d(InnerAnalyzeManager.m2018p().mo2023g(), "key_first_open", 2);
    }

    @Override // p1020w3.InnerEvent, p1067z3.IInnerEventOpportunity
    /* renamed from: a */
    public void mo839a() {
        super.mo839a();
        if (m1086o()) {
            mo2359k();
            m1085p();
        }
    }
}
