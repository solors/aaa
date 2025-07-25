package com.amazon.p047a.p048a.p066n.p070c;

import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourceManager;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.a.a.n.c.b */
/* loaded from: classes2.dex */
public abstract class TaskWorkflow extends AbstractTaskWorkflowAwareTask implements ResourcePopulationAware {

    /* renamed from: b */
    private static final KiwiLogger f2651b = new KiwiLogger("TaskWorkflow");
    @Resource

    /* renamed from: c */
    private ResourceManager f2653c;

    /* renamed from: a */
    protected final List<Task> f2652a = new ArrayList();

    /* renamed from: d */
    private AtomicBoolean f2654d = new AtomicBoolean(false);

    /* renamed from: f */
    private void m102892f() {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2651b;
            kiwiLogger.m102829a("Exiting task workflow: " + this);
        }
        for (Task task : this.f2652a) {
            if (this.f2654d.get()) {
                if (KiwiLogger.f2770a) {
                    f2651b.m102829a("Finished set, exiting task workflow early");
                    return;
                }
                return;
            }
            task.mo102336a();
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.Task
    /* renamed from: a */
    public final void mo102336a() {
        try {
            m102894c();
            m102892f();
        } finally {
            mo102762b();
        }
    }

    /* renamed from: b_ */
    protected abstract String mo102761b_();

    /* renamed from: d */
    public final void m102893d() {
        this.f2654d.set(true);
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public final void mo102735e() {
        for (Task task : this.f2652a) {
            this.f2653c.mo103032b(task);
        }
    }

    public final String toString() {
        return mo102761b_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m102895a(Task task) {
        Assert.m102872a((Object) task, "task");
        this.f2652a.add(task);
        if (task instanceof TaskWorkflowAwareTask) {
            ((TaskWorkflowAwareTask) task).mo102891a(this);
        }
    }

    /* renamed from: b */
    protected void mo102762b() {
    }

    /* renamed from: c */
    protected void m102894c() {
    }
}
