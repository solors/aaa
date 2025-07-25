package com.amazon.p047a.p048a.p066n;

import com.amazon.p047a.p048a.p049a.p050a.ApplicationEvent;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEventIdentity;
import com.amazon.p047a.p048a.p054c.EventIdentity;
import com.amazon.p047a.p048a.p054c.EventListener;
import com.amazon.p047a.p048a.p054c.EventListenerNotificationOrder;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourceManager;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p066n.p069b.ForegroundTaskPipeline;
import com.amazon.p047a.p048a.p066n.p069b.SimpleTaskPipeline;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipeline;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.a.a.n.d */
/* loaded from: classes2.dex */
public class TaskManagerImpl implements ResourcePopulationAware, TaskManager {

    /* renamed from: a */
    private static final KiwiLogger f2655a = new KiwiLogger("TaskManagerImpl");
    @Resource

    /* renamed from: b */
    private ResourceManager f2656b;
    @Resource

    /* renamed from: c */
    private EventManager f2657c;

    /* renamed from: d */
    private final AtomicBoolean f2658d = new AtomicBoolean(false);

    /* renamed from: e */
    private final Map<TaskPipelineId, TaskPipeline> f2659e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TaskManagerImpl.java */
    /* renamed from: com.amazon.a.a.n.d$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3563a {
        /* renamed from: a */
        void mo102880a(Task task, TaskPipeline taskPipeline);
    }

    public TaskManagerImpl() {
        HashMap hashMap = new HashMap();
        this.f2659e = hashMap;
        TaskPipelineId taskPipelineId = TaskPipelineId.COMMAND;
        SimpleTaskPipeline m102909a = SimpleTaskPipeline.m102909a(taskPipelineId.name());
        TaskPipelineId taskPipelineId2 = TaskPipelineId.BACKGROUND;
        SimpleTaskPipeline m102909a2 = SimpleTaskPipeline.m102909a(taskPipelineId2.name());
        ForegroundTaskPipeline foregroundTaskPipeline = new ForegroundTaskPipeline(m102909a2);
        hashMap.put(taskPipelineId, m102909a);
        hashMap.put(taskPipelineId2, m102909a2);
        hashMap.put(TaskPipelineId.FOREGROUND, foregroundTaskPipeline);
    }

    /* renamed from: c */
    private void m102882c() {
        this.f2657c.mo103142a(new EventListener<ApplicationEvent>() { // from class: com.amazon.a.a.n.d.5
            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.MIDDLE;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ApplicationEventIdentity.DESTROY;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo102723a(ApplicationEvent applicationEvent) {
                TaskManagerImpl.this.m102890a();
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p066n.TaskManager
    /* renamed from: a */
    public void mo102888a(TaskPipelineId taskPipelineId, Task task) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2655a;
            kiwiLogger.m102829a("Enqueue task on pipeline id: " + taskPipelineId);
        }
        m102886a(taskPipelineId, task, new InterfaceC3563a() { // from class: com.amazon.a.a.n.d.1
            @Override // com.amazon.p047a.p048a.p066n.TaskManagerImpl.InterfaceC3563a
            /* renamed from: a */
            public void mo102880a(Task task2, TaskPipeline taskPipeline) {
                taskPipeline.mo102902a(task2);
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p066n.TaskManager
    /* renamed from: b */
    public void mo102883b(TaskPipelineId taskPipelineId, Task task) {
        m102886a(taskPipelineId, task, new InterfaceC3563a() { // from class: com.amazon.a.a.n.d.2
            @Override // com.amazon.p047a.p048a.p066n.TaskManagerImpl.InterfaceC3563a
            /* renamed from: a */
            public void mo102880a(Task task2, TaskPipeline taskPipeline) {
                taskPipeline.mo102899b(task2);
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        for (TaskPipeline taskPipeline : this.f2659e.values()) {
            this.f2656b.mo103032b(taskPipeline);
        }
        m102882c();
    }

    /* renamed from: b */
    private boolean m102884b() {
        return this.f2658d.get();
    }

    /* renamed from: a */
    private void m102886a(TaskPipelineId taskPipelineId, Task task, InterfaceC3563a interfaceC3563a) {
        if (m102884b()) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger = f2655a;
                kiwiLogger.m102826b("Task enqueued after TaskManager has been finished! Task: " + task);
                return;
            }
            return;
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger2 = f2655a;
            kiwiLogger2.m102829a("Populating Task: " + task);
        }
        this.f2656b.mo103032b(task);
        interfaceC3563a.mo102880a(task, m102889a(taskPipelineId));
    }

    /* renamed from: a */
    private TaskPipeline m102889a(TaskPipelineId taskPipelineId) {
        TaskPipeline taskPipeline = this.f2659e.get(taskPipelineId);
        if (taskPipeline != null) {
            return taskPipeline;
        }
        throw new IllegalStateException("No pipeline registered with id: " + taskPipelineId);
    }

    @Override // com.amazon.p047a.p048a.p066n.TaskManager
    /* renamed from: a */
    public void mo102885a(TaskPipelineId taskPipelineId, Task task, final Date date) {
        m102886a(taskPipelineId, task, new InterfaceC3563a() { // from class: com.amazon.a.a.n.d.3
            @Override // com.amazon.p047a.p048a.p066n.TaskManagerImpl.InterfaceC3563a
            /* renamed from: a */
            public void mo102880a(Task task2, TaskPipeline taskPipeline) {
                taskPipeline.mo102900a(task2, date);
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p066n.TaskManager
    /* renamed from: a */
    public void mo102887a(TaskPipelineId taskPipelineId, Task task, final long j) {
        m102886a(taskPipelineId, task, new InterfaceC3563a() { // from class: com.amazon.a.a.n.d.4
            @Override // com.amazon.p047a.p048a.p066n.TaskManagerImpl.InterfaceC3563a
            /* renamed from: a */
            public void mo102880a(Task task2, TaskPipeline taskPipeline) {
                taskPipeline.mo102901a(task2, j);
            }
        });
    }

    /* renamed from: a */
    public void m102890a() {
        if (this.f2658d.compareAndSet(false, true)) {
            if (KiwiLogger.f2770a) {
                f2655a.m102829a("TaskManager finishing....");
            }
            for (TaskPipeline taskPipeline : this.f2659e.values()) {
                taskPipeline.mo102903a();
            }
        }
    }
}
