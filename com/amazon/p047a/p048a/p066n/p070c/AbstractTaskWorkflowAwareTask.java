package com.amazon.p047a.p048a.p066n.p070c;

import com.amazon.p047a.p048a.p071o.p072a.Assert;

/* renamed from: com.amazon.a.a.n.c.a */
/* loaded from: classes2.dex */
public abstract class AbstractTaskWorkflowAwareTask implements TaskWorkflowAwareTask {

    /* renamed from: a */
    private TaskWorkflow f2650a;

    @Override // com.amazon.p047a.p048a.p066n.p070c.TaskWorkflowAwareTask
    /* renamed from: a */
    public final void mo102891a(TaskWorkflow taskWorkflow) {
        Assert.m102872a((Object) taskWorkflow, "workflow");
        Assert.m102866c(this.f2650a, "workflow instance can only be set once");
        this.f2650a = taskWorkflow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean m102897m() {
        if (this.f2650a != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m102896n() {
        Assert.m102869a(m102897m(), "task is no a workflow child");
        this.f2650a.m102893d();
    }
}
