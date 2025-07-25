package com.amazon.p047a.p048a.p066n.p069b;

import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEvent;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEventIdentity;
import com.amazon.p047a.p048a.p054c.EventIdentity;
import com.amazon.p047a.p048a.p054c.EventListener;
import com.amazon.p047a.p048a.p054c.EventListenerNotificationOrder;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.amazon.a.a.n.b.a */
/* loaded from: classes2.dex */
public class ForegroundTaskPipeline implements ResourcePopulationAware, TaskPipeline {

    /* renamed from: a */
    private static final KiwiLogger f2631a = new KiwiLogger("ForegroundTaskPipeline");
    @Resource

    /* renamed from: b */
    private ContextManager f2632b;
    @Resource

    /* renamed from: c */
    private EventManager f2633c;

    /* renamed from: e */
    private TaskPipeline f2635e;

    /* renamed from: f */
    private List<Task> f2636f = new ArrayList();

    /* renamed from: d */
    private TaskPipeline f2634d = SimpleTaskPipeline.m102905b("KIWI_UI");

    public ForegroundTaskPipeline(TaskPipeline taskPipeline) {
        this.f2635e = taskPipeline;
    }

    /* renamed from: c */
    private Task m102912c(final Task task) {
        return new Task() { // from class: com.amazon.a.a.n.b.a.2
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                ForegroundTaskPipeline.this.m102916a(task, true);
            }

            public String toString() {
                return "Future:PostToUITask: " + task.toString();
            }
        };
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: b */
    public void mo102899b(Task task) {
        m102916a(task, true);
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        this.f2633c.mo103142a(new EventListener<ActivityLifeCycleEvent>() { // from class: com.amazon.a.a.n.b.a.1
            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.MIDDLE;
            }

            public String toString() {
                return "ForegroundTaskPipeline:onResume listener";
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ActivityLifeCycleEventIdentity.RESUME;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo102723a(ActivityLifeCycleEvent activityLifeCycleEvent) {
                ForegroundTaskPipeline.this.m102913b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m102913b() {
        if (KiwiLogger.f2770a) {
            f2631a.m102829a("Activity resumed, scheduling tasks on UI thread");
        }
        for (Task task : this.f2636f) {
            mo102899b(task);
        }
        this.f2636f.clear();
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102902a(Task task) {
        m102916a(task, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m102916a(Task task, boolean z) {
        if (this.f2632b.mo103184c()) {
            if (z) {
                this.f2634d.mo102899b(task);
                return;
            } else {
                this.f2634d.mo102902a(task);
                return;
            }
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2631a;
            kiwiLogger.m102829a("No UI visible to execute task: " + task + ", placing into pending queue until task is visible");
        }
        this.f2636f.add(task);
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102900a(Task task, Date date) {
        this.f2635e.mo102900a(m102912c(task), date);
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102901a(Task task, long j) {
        this.f2635e.mo102901a(m102912c(task), j);
    }

    @Override // com.amazon.p047a.p048a.p066n.p069b.TaskPipeline
    /* renamed from: a */
    public void mo102903a() {
        this.f2634d.mo102903a();
        this.f2635e.mo102903a();
        this.f2636f.clear();
    }
}
