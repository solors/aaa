package com.amazon.p047a;

import com.amazon.p047a.p048a.p051b.p053b.SubmitCrashReportsTask;
import com.amazon.p047a.p048a.p059h.p060a.SubmitMetricsTask;
import com.amazon.p047a.p048a.p066n.p070c.TaskWorkflow;

/* renamed from: com.amazon.a.e */
/* loaded from: classes2.dex */
public class DrmFreeApplicationLaunchTaskWorkflow extends TaskWorkflow {
    public DrmFreeApplicationLaunchTaskWorkflow() {
        m102895a(new CheckifAppIsBlockedTask());
        m102895a(new SubmitCrashReportsTask());
        m102895a(new SubmitMetricsTask());
    }

    @Override // com.amazon.p047a.p048a.p066n.p070c.TaskWorkflow
    /* renamed from: b_ */
    protected String mo102761b_() {
        return "DrmFreeApplicationLaunchTaskWorkflow";
    }
}
