package com.amazon.p047a.p048a.p049a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEvent;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEventIdentity;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEvent;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEventIdentity;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.WeakHashSet;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.amazon.a.a.a.c */
/* loaded from: classes2.dex */
public final class ContextManagerImplV3 implements ContextManager {

    /* renamed from: a */
    public static final KiwiLogger f2316a = new KiwiLogger("ContextManagerImplV3");
    @Resource

    /* renamed from: e */
    private Application f2320e;
    @Resource

    /* renamed from: f */
    private EventManager f2321f;

    /* renamed from: b */
    private final AtomicReference<Activity> f2317b = new AtomicReference<>();

    /* renamed from: c */
    private final WeakHashSet<Activity> f2318c = new WeakHashSet<>();

    /* renamed from: d */
    private final LinkedHashSet<Activity> f2319d = new LinkedHashSet<>();

    /* renamed from: g */
    private boolean f2322g = false;

    /* renamed from: e */
    private boolean m103180e() {
        return !this.f2322g && this.f2319d.size() == 1;
    }

    /* renamed from: h */
    private boolean m103173h(Activity activity) {
        if (KiwiLogger.f2770a) {
            f2316a.m102829a("Checking if application is destroyed");
        }
        if (this.f2319d.isEmpty()) {
            KiwiLogger kiwiLogger = f2316a;
            kiwiLogger.m102829a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
            return activity.isTaskRoot() && activity.isFinishing();
        }
        return false;
    }

    /* renamed from: i */
    private Activity m103172i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public void mo103190a(Service service) {
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public void mo103185b(Service service) {
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: c */
    public void mo103183c(Activity activity) {
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2316a;
        kiwiLogger.m102829a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        this.f2318c.m102802a(activity);
        this.f2319d.add(activity);
        Activity m103172i = m103172i(activity);
        this.f2317b.set(m103172i);
        kiwiLogger.m102829a("Setting visible to: " + m103172i);
        if (KiwiLogger.f2770a) {
            kiwiLogger.m102829a("Activity now visible: " + activity + ", publishing resume event");
        }
        m103189a(ActivityLifeCycleEventIdentity.RESUME, activity);
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: d */
    public boolean mo103182d() {
        return false;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: f */
    public void mo103178f() {
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: g */
    public void mo103176g() {
    }

    /* renamed from: g */
    private boolean m103175g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public Activity mo103192a() {
        Assert.m102876a();
        Object[] array = this.f2319d.toArray();
        Activity activity = null;
        for (int length = array.length - 1; length >= 0; length--) {
            activity = (Activity) array[length];
            if (m103175g(activity)) {
                f2316a.m102829a("root activity" + activity);
                return activity;
            }
        }
        if (activity != null || array.length <= 0) {
            return activity;
        }
        f2316a.m102829a("root not fount returning" + activity);
        return (Activity) array[array.length - 1];
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public void mo103186b(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        this.f2319d.remove(activity);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2316a;
            kiwiLogger.m102829a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f2319d.size());
        }
        m103189a(ActivityLifeCycleEventIdentity.DESTROY, activity);
        if (m103173h(activity)) {
            f2316a.m102829a("AppLifeCycle application has been destroyed");
            this.f2322g = false;
            m103188a(ApplicationEventIdentity.DESTROY);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: d */
    public void mo103181d(Activity activity) {
        Assert.m102876a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2316a;
            kiwiLogger.m102829a("Activity paused: " + activity + ", visible activity: " + mo103187b());
        }
        this.f2319d.add(activity);
        if (mo103187b() == activity) {
            if (KiwiLogger.f2770a) {
                f2316a.m102829a("Setting visible activity to null");
            }
            this.f2317b.set(null);
            m103189a(ActivityLifeCycleEventIdentity.PAUSE, activity);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: f */
    public void mo103177f(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2316a;
        kiwiLogger.m102829a("Activity stopped: " + activity);
        this.f2319d.add(activity);
        this.f2318c.m102800b(activity);
        m103189a(ActivityLifeCycleEventIdentity.STOP, activity);
        if (this.f2318c.m102803a()) {
            m103188a(ApplicationEventIdentity.STOP);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: e */
    public void mo103179e(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        KiwiLogger kiwiLogger = f2316a;
        kiwiLogger.m102829a("Activity started: " + activity);
        this.f2319d.add(activity);
        this.f2318c.m102802a(activity);
        m103189a(ActivityLifeCycleEventIdentity.START, activity);
        if (m103180e()) {
            this.f2322g = true;
            m103188a(ApplicationEventIdentity.CREATE);
        }
        if (this.f2318c.m102801b() == 1) {
            m103188a(ApplicationEventIdentity.START);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: h */
    public boolean mo103174h() {
        Assert.m102876a();
        return (!mo103184c() && this.f2319d.isEmpty() && this.f2318c.m102803a()) ? false : true;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: a */
    public void mo103191a(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        this.f2319d.add(activity);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2316a;
            kiwiLogger.m102829a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f2319d.size());
        }
        m103189a(ActivityLifeCycleEventIdentity.CREATE, activity);
        if (m103180e()) {
            this.f2322g = true;
            m103188a(ApplicationEventIdentity.CREATE);
        }
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: c */
    public boolean mo103184c() {
        return this.f2317b.get() != null;
    }

    @Override // com.amazon.p047a.p048a.p049a.ContextManager
    /* renamed from: b */
    public Activity mo103187b() {
        Assert.m102876a();
        return this.f2317b.get();
    }

    /* renamed from: a */
    private void m103189a(ActivityLifeCycleEventIdentity activityLifeCycleEventIdentity, Activity activity) {
        this.f2321f.mo103143a(new ActivityLifeCycleEvent(activityLifeCycleEventIdentity, activity));
    }

    /* renamed from: a */
    private void m103188a(ApplicationEventIdentity applicationEventIdentity) {
        this.f2321f.mo103143a(new ApplicationEvent(applicationEventIdentity, this.f2320e));
    }
}
