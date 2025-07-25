package com.amazon.p047a.p048a.p049a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEvent;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEventIdentity;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEvent;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEventIdentity;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.WeakHashSet;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.amazon.a.a.a.b */
/* loaded from: classes2.dex */
public final class ContextManagerImplV2 implements ContextManager, ResourcePopulationAware {

    /* renamed from: a */
    public static final KiwiLogger f2300a = new KiwiLogger("ContextManagerImplV2");
    @Resource

    /* renamed from: i */
    private Application f2308i;
    @Resource

    /* renamed from: j */
    private TaskManager f2309j;
    @Resource

    /* renamed from: k */
    private EventManager f2310k;

    /* renamed from: l */
    private String f2311l;

    /* renamed from: b */
    private final AtomicReference<Activity> f2301b = new AtomicReference<>();

    /* renamed from: c */
    private final List<Activity> f2302c = new ArrayList();

    /* renamed from: d */
    private final WeakHashSet<Service> f2303d = new WeakHashSet<>();

    /* renamed from: e */
    private final WeakHashSet<Activity> f2304e = new WeakHashSet<>();

    /* renamed from: f */
    private final AtomicBoolean f2305f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicBoolean f2306g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f2307h = new AtomicBoolean(false);

    /* renamed from: m */
    private boolean f2312m = false;

    /* renamed from: g */
    private boolean m103201g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    /* renamed from: h */
    private boolean m103200h(Activity activity) {
        if (KiwiLogger.f2770a) {
            f2300a.m102829a("Checking if application is destroyed");
        }
        if (this.f2302c.isEmpty()) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
            return activity.isTaskRoot() && activity.isFinishing();
        }
        return false;
    }

    /* renamed from: i */
    private boolean m103199i() {
        return !this.f2312m && this.f2302c.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m103197j() {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("----------- EXECUTING FINISH ACTIVITIES -----------");
            kiwiLogger.m102829a(this.f2308i.getPackageName());
            kiwiLogger.m102829a("---------------------------------------------------");
        }
        m103195k();
        m103194l();
        m103193m();
    }

    /* renamed from: k */
    private void m103195k() {
        Activity mo103192a = mo103192a();
        for (Activity activity : this.f2302c) {
            if (!activity.equals(mo103192a)) {
                m103196j(activity);
            }
        }
    }

    /* renamed from: l */
    private void m103194l() {
        Activity mo103192a = mo103192a();
        if (mo103192a == null) {
            f2300a.m102829a("Shutdown found no root, no activities to pop off stack!");
            return;
        }
        KiwiLogger kiwiLogger = f2300a;
        kiwiLogger.m102829a("Moving task to background");
        mo103192a.moveTaskToBack(true);
        kiwiLogger.m102829a("Popping activity stack, root: " + mo103192a);
        Intent intent = new Intent(mo103192a, mo103192a.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        mo103192a.startActivity(intent);
    }

    /* renamed from: m */
    private void m103193m() {
        this.f2309j.mo102888a(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.a.a.a.b.2
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                Activity mo103192a = ContextManagerImplV2.this.mo103192a();
                KiwiLogger kiwiLogger = ContextManagerImplV2.f2300a;
                kiwiLogger.m102829a("Finishing Root Task: " + mo103192a);
                if (mo103192a != null) {
                    kiwiLogger.m102829a("Finishing Root");
                    mo103192a.finish();
                }
            }

            public String toString() {
                return "ContextManager: kill root task";
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public void mo103186b(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        this.f2302c.remove(activity);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f2302c.size());
        }
        m103206a(ActivityLifeCycleEventIdentity.DESTROY, activity);
        if (m103200h(activity)) {
            this.f2312m = false;
            m103205a(ApplicationEventIdentity.DESTROY);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: c */
    public void mo103183c(Activity activity) {
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2300a;
        kiwiLogger.m102829a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity m103198i = m103198i(activity);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting visible to: ");
        sb2.append(m103198i);
        kiwiLogger.m102829a(sb2.toString());
        this.f2301b.set(m103198i);
        if (KiwiLogger.f2770a) {
            kiwiLogger.m102829a("Activity now visible: " + activity + ", publishing resume event");
        }
        m103206a(ActivityLifeCycleEventIdentity.RESUME, activity);
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: d */
    public void mo103181d(Activity activity) {
        Assert.m102876a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Activity paused: " + activity + ", visible activity: " + mo103187b());
        }
        if (mo103187b() == activity) {
            if (KiwiLogger.f2770a) {
                f2300a.m102829a("Setting visible activity to null");
            }
            this.f2301b.set(null);
            m103206a(ActivityLifeCycleEventIdentity.PAUSE, activity);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: e */
    public void mo103179e(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2300a;
        kiwiLogger.m102829a("Activity started: " + activity);
        this.f2304e.m102802a(activity);
        m103206a(ActivityLifeCycleEventIdentity.START, activity);
        if (this.f2304e.m102801b() == 1) {
            m103205a(ApplicationEventIdentity.START);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: f */
    public void mo103177f(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2300a;
        kiwiLogger.m102829a("Activity stopped: " + activity);
        this.f2304e.m102800b(activity);
        m103206a(ActivityLifeCycleEventIdentity.STOP, activity);
        if (this.f2304e.m102803a()) {
            m103205a(ApplicationEventIdentity.STOP);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: g */
    public void mo103176g() {
        if (!this.f2306g.compareAndSet(false, true) && KiwiLogger.f2770a) {
            f2300a.m102829a("Ignoring duplicate stopServices request");
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("------------- STOPPING SERVICES -------------------");
            kiwiLogger.m102829a(this.f2308i.getPackageName());
            kiwiLogger.m102829a("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f2311l);
        intent.setPackage(this.f2308i.getPackageName());
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger2 = f2300a;
            kiwiLogger2.m102829a("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f2308i.sendBroadcast(intent);
    }

    /* renamed from: i */
    private Activity m103198i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public Activity mo103192a() {
        Assert.m102876a();
        for (int size = this.f2302c.size() - 1; size >= 0; size--) {
            Activity activity = this.f2302c.get(size);
            if (m103201g(activity)) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public void mo103191a(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        this.f2302c.add(activity);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f2302c.size());
        }
        m103206a(ActivityLifeCycleEventIdentity.CREATE, activity);
        if (m103199i()) {
            this.f2312m = true;
            m103205a(ApplicationEventIdentity.CREATE);
        }
    }

    /* renamed from: j */
    private void m103196j(Activity activity) {
        if (activity == null) {
            return;
        }
        if (activity.isChild()) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
            return;
        }
        KiwiLogger kiwiLogger2 = f2300a;
        kiwiLogger2.m102829a("Finishing Activity: " + activity);
        activity.finish();
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        String packageName = this.f2308i.getPackageName();
        this.f2311l = "com.amazon." + packageName + ".shutdown";
        this.f2308i.registerReceiver(new BroadcastReceiver() { // from class: com.amazon.a.a.a.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ContextManagerImplV2.this.m103207a(intent);
            }
        }, new IntentFilter(this.f2311l));
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: f */
    public void mo103178f() {
        if (this.f2305f.compareAndSet(false, true)) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger = f2300a;
                kiwiLogger.m102829a("---------- SCHEDULING FINISH ACTIVITIES -----------");
                kiwiLogger.m102829a(this.f2308i.getPackageName());
                kiwiLogger.m102829a(Thread.currentThread().toString());
                kiwiLogger.m102829a("---------------------------------------------------");
            }
            this.f2309j.mo102888a(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.a.a.a.b.1
                @Override // com.amazon.p047a.p048a.p066n.Task
                /* renamed from: a */
                public void mo102336a() {
                    ContextManagerImplV2.this.m103197j();
                }

                public String toString() {
                    return "ContextManager: init app shutdown on main thread";
                }
            });
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: h */
    public boolean mo103174h() {
        Assert.m102871a("Method isContextAware() is not used for Kiwi's ContextManagerImplV2");
        return false;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: c */
    public boolean mo103184c() {
        return this.f2301b.get() != null;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: d */
    public boolean mo103182d() {
        return this.f2306g.get() || this.f2305f.get();
    }

    /* renamed from: c */
    private void m103202c(Service service) {
        if (service == null) {
            return;
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Stopping service: " + service);
        }
        service.stopSelf();
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public void mo103185b(Service service) {
        Assert.m102876a();
        this.f2303d.m102800b(service);
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public Activity mo103187b() {
        Assert.m102876a();
        return this.f2301b.get();
    }

    /* renamed from: a */
    private void m103206a(ActivityLifeCycleEventIdentity activityLifeCycleEventIdentity, Activity activity) {
        this.f2310k.mo103143a(new ActivityLifeCycleEvent(activityLifeCycleEventIdentity, activity));
    }

    /* renamed from: a */
    private void m103205a(ApplicationEventIdentity applicationEventIdentity) {
        this.f2310k.mo103143a(new ApplicationEvent(applicationEventIdentity, this.f2308i));
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public void mo103190a(Service service) {
        Assert.m102876a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Service->onCreate: " + service);
        }
        this.f2303d.m102802a(service);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m103207a(Intent intent) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2300a;
            kiwiLogger.m102829a("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(this.f2311l)) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger2 = f2300a;
                kiwiLogger2.m102826b("Received broadcast for unrequested action: " + intent.getAction());
            }
        } else if (!this.f2306g.get()) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger3 = f2300a;
                kiwiLogger3.m102826b("Received intent to shutdown app when we are not in shutdown state: " + intent);
            }
        } else if (!this.f2307h.compareAndSet(false, true)) {
            if (KiwiLogger.f2770a) {
                f2300a.m102829a("shutdown broadcast already received, ignoring");
            }
        } else {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger4 = f2300a;
                kiwiLogger4.m102829a("Stopping services in response to broadcast");
                kiwiLogger4.m102829a("Service to stop: " + this.f2303d.m102801b());
            }
            Iterator<Service> it = this.f2303d.iterator();
            while (it.hasNext()) {
                m103202c(it.next());
            }
        }
    }
}
