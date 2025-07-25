package com.amazon.p047a.p048a.p064l;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.animation.core.C0379a;
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
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.amazon.a.a.l.c */
/* loaded from: classes2.dex */
public class ActivityResultManagerImpl implements ResourcePopulationAware, ActivityResultManager {

    /* renamed from: a */
    private static final KiwiLogger f2502a = new KiwiLogger("ActivityResultManagerImpl");

    /* renamed from: b */
    private static final Random f2503b = new Random();

    /* renamed from: c */
    private static final int f2504c = 65535;
    @Resource

    /* renamed from: d */
    private TaskManager f2505d;
    @Resource

    /* renamed from: e */
    private ContextManager f2506e;
    @Resource

    /* renamed from: f */
    private EventManager f2507f;

    /* renamed from: g */
    private AtomicReference<C3545a> f2508g = new AtomicReference<>();

    /* renamed from: h */
    private BlockingQueue<ActivityResult> f2509h = new LinkedBlockingQueue();

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        this.f2507f.mo103142a(new EventListener<ActivityLifeCycleEvent>() { // from class: com.amazon.a.a.l.c.1
            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.MIDDLE;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ActivityLifeCycleEventIdentity.RESUME;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo102723a(ActivityLifeCycleEvent activityLifeCycleEvent) {
                C3545a c3545a = (C3545a) ActivityResultManagerImpl.this.f2508g.get();
                if (c3545a != null) {
                    c3545a.m103016b(activityLifeCycleEvent.m103210b());
                }
            }
        });
    }

    /* renamed from: b */
    private int m103021b() {
        return f2503b.nextInt(65535) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityResultManagerImpl.java */
    /* renamed from: com.amazon.a.a.l.c$a */
    /* loaded from: classes2.dex */
    public static final class C3545a {

        /* renamed from: a */
        private final Intent f2513a;

        /* renamed from: b */
        private final int f2514b;

        /* renamed from: c */
        private Activity f2515c;

        public C3545a(Intent intent, int i) {
            this.f2513a = intent;
            this.f2514b = i;
        }

        /* renamed from: a */
        public void m103017a(Activity activity) {
            KiwiLogger kiwiLogger = ActivityResultManagerImpl.f2502a;
            kiwiLogger.m102829a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f2513a, this.f2514b);
            this.f2515c = activity;
        }

        /* renamed from: b */
        public void m103016b(Activity activity) {
            ActivityResultManagerImpl.f2502a.m102826b("Context changed while awaiting result!");
            if (this.f2515c != null) {
                KiwiLogger kiwiLogger = ActivityResultManagerImpl.f2502a;
                kiwiLogger.m102826b("Finishing activity from old context: " + this.f2515c);
                this.f2515c.finishActivity(this.f2514b);
            }
            m103017a(activity);
        }

        /* renamed from: a */
        public int m103018a() {
            return this.f2514b;
        }
    }

    @Override // com.amazon.p047a.p048a.p064l.ActivityResultManager
    /* renamed from: a */
    public ActivityResult mo103024a(Intent intent) {
        final C3545a c3545a = new C3545a(intent, m103021b());
        if (!C0379a.m105461a(this.f2508g, null, c3545a)) {
            f2502a.m102826b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        KiwiLogger kiwiLogger = f2502a;
        kiwiLogger.m102829a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + c3545a.m103018a());
        this.f2505d.mo102883b(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.a.a.l.c.2
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                Activity mo103187b = ActivityResultManagerImpl.this.f2506e.mo103187b();
                if (mo103187b == null) {
                    ActivityResultManagerImpl.f2502a.m102829a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                } else {
                    c3545a.m103017a(mo103187b);
                }
            }
        });
        try {
            try {
                kiwiLogger.m102829a("Blocking for request: " + c3545a.m103018a());
                ActivityResult take = this.f2509h.take();
                kiwiLogger.m102829a("Received Response: " + c3545a.m103018a());
                this.f2508g.set(null);
                return take;
            } catch (InterruptedException unused) {
                KiwiLogger kiwiLogger2 = f2502a;
                kiwiLogger2.m102829a("Interrupted while awaiting for request, returning null");
                kiwiLogger2.m102829a("Received Response: " + c3545a.m103018a());
                this.f2508g.set(null);
                return null;
            }
        } catch (Throwable th) {
            KiwiLogger kiwiLogger3 = f2502a;
            kiwiLogger3.m102829a("Received Response: " + c3545a.m103018a());
            this.f2508g.set(null);
            throw th;
        }
    }

    @Override // com.amazon.p047a.p048a.p064l.ActivityResultManager
    /* renamed from: a */
    public boolean mo103023a(ActivityResult activityResult) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2502a;
            kiwiLogger.m102829a("Recieved ActivityResult: " + activityResult);
        }
        C3545a c3545a = this.f2508g.get();
        if (c3545a == null) {
            if (KiwiLogger.f2770a) {
                f2502a.m102829a("We don't have a current open request, returning");
            }
            return false;
        } else if (c3545a.m103018a() != activityResult.m103028b()) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger2 = f2502a;
                kiwiLogger2.m102829a("We don't have a request with code: " + activityResult.m103028b() + ", returning");
            }
            return false;
        } else {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger3 = f2502a;
                kiwiLogger3.m102829a("Signaling thread waiting for request: " + activityResult.m103028b());
            }
            this.f2509h.add(activityResult);
            return true;
        }
    }
}
