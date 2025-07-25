package com.amazon.p047a;

import android.app.Application;
import android.content.Context;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p049a.ContextManagerImplV3;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEvent;
import com.amazon.p047a.p048a.p049a.p050a.ActivityLifeCycleEventIdentity;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEvent;
import com.amazon.p047a.p048a.p049a.p050a.ApplicationEventIdentity;
import com.amazon.p047a.p048a.p051b.CrashManagerImpl;
import com.amazon.p047a.p048a.p054c.EventIdentity;
import com.amazon.p047a.p048a.p054c.EventListener;
import com.amazon.p047a.p048a.p054c.EventListenerNotificationOrder;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p054c.EventManagerImpl;
import com.amazon.p047a.p048a.p057f.ApplicationLifecycleObserver;
import com.amazon.p047a.p048a.p057f.LifeCycleEventTask;
import com.amazon.p047a.p048a.p058g.DefaultLogHandler;
import com.amazon.p047a.p048a.p058g.KiwiLogHandler;
import com.amazon.p047a.p048a.p058g.LogHandler;
import com.amazon.p047a.p048a.p058g.SandboxLogHandler;
import com.amazon.p047a.p048a.p059h.MetricsManagerImpl;
import com.amazon.p047a.p048a.p061i.PromptManager;
import com.amazon.p047a.p048a.p061i.PromptManagerImpl;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourceManagerImpl;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p064l.ActivityResultManager;
import com.amazon.p047a.p048a.p064l.ActivityResultManagerImpl;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.TaskManagerImpl;
import com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask;
import com.amazon.p047a.p048a.p066n.p067a.AuthenticationTokenVerifier;
import com.amazon.p047a.p048a.p066n.p067a.CommandServiceClient;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.amazon.p047a.p048a.p071o.p073b.DataAuthenticationKeyLoader;
import com.amazon.p047a.p048a.p071o.p073b.DataAuthenticationKeyLoaderV3;
import com.amazon.p047a.p048a.p071o.p073b.SignatureVerifier;
import com.amazon.p047a.p048a.p071o.p073b.p074a.DataAuthenticationKeyLoadException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: com.amazon.a.a */
/* loaded from: classes2.dex */
public final class AppstoreSDK implements ResourcePopulationAware {

    /* renamed from: a */
    protected static final String f2265a = "ActivityName";

    /* renamed from: b */
    protected static final String f2266b = "EventName";

    /* renamed from: c */
    protected static final String f2267c = "Timestamp";

    /* renamed from: d */
    private static final KiwiLogger f2268d = new KiwiLogger("AppstoreSDK");

    /* renamed from: e */
    private static final LogHandler f2269e = new DefaultLogHandler();

    /* renamed from: f */
    private static AppstoreSDK f2270f;
    @Resource

    /* renamed from: g */
    private ContextManager f2271g;
    @Resource

    /* renamed from: h */
    private ActivityResultManager f2272h;
    @Resource

    /* renamed from: i */
    private EventManager f2273i;
    @Resource

    /* renamed from: j */
    private TaskManager f2274j;
    @Resource

    /* renamed from: k */
    private PromptManager f2275k;
    @Resource

    /* renamed from: l */
    private KiwiDataStore f2276l;
    @Resource

    /* renamed from: m */
    private Application f2277m;
    @Resource

    /* renamed from: n */
    private DataAuthenticationKeyLoader f2278n;
    @Resource

    /* renamed from: o */
    private LogHandler f2279o;

    private AppstoreSDK(Application application) {
        long currentTimeMillis = System.currentTimeMillis();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2268d;
            kiwiLogger.m102829a("Starting initialization process for application: " + application.getPackageName());
        }
        m103229b(application);
        if (KiwiLogger.f2770a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            KiwiLogger kiwiLogger2 = f2268d;
            kiwiLogger2.m102829a("AppstoreSDK.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    /* renamed from: c */
    public static void m103224c(AbstractCommandTask abstractCommandTask) {
        if (!m103223d()) {
            f2268d.m102826b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        } else {
            f2270f.f2274j.mo102888a(TaskPipelineId.COMMAND, abstractCommandTask);
        }
    }

    /* renamed from: d */
    public static boolean m103223d() {
        if (f2270f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m103216l() {
        String m103233a;
        try {
            m103233a = (String) Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, KiwiConstants.f2710ao);
        } catch (Throwable unused) {
            f2268d.m102826b("Unable to retrieve Sandbox property through reflection, using getProp");
            m103233a = m103233a(KiwiConstants.f2710ao);
        }
        return "debug".equals(m103233a);
    }

    /* renamed from: m */
    private Task m103215m() {
        return new DrmFreeApplicationLaunchTaskWorkflow();
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        m103220h();
        m103218j();
        m103222f();
        m103221g();
    }

    /* renamed from: f */
    public void m103222f() {
        this.f2273i.mo103142a(new EventListener<ActivityLifeCycleEvent>() { // from class: com.amazon.a.a.1
            {
                AppstoreSDK.this = this;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.MIDDLE;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ActivityLifeCycleEventIdentity.PAUSE;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public void mo102723a(ActivityLifeCycleEvent activityLifeCycleEvent) {
                HashMap hashMap = new HashMap();
                hashMap.put(AppstoreSDK.f2266b, ActivityLifeCycleEventIdentity.PAUSE.name());
                hashMap.put(AppstoreSDK.f2265a, activityLifeCycleEvent.m103210b().getClass().getName());
                hashMap.put(AppstoreSDK.f2267c, Long.valueOf(System.currentTimeMillis()));
                LifeCycleEventTask lifeCycleEventTask = new LifeCycleEventTask(hashMap);
                if (KiwiLogger.f2770a) {
                    AppstoreSDK.f2268d.m102829a("Adding lifecycle PAUSE command to pipeline");
                }
                AppstoreSDK.m103224c(lifeCycleEventTask);
            }
        });
    }

    /* renamed from: g */
    public void m103221g() {
        this.f2273i.mo103142a(new EventListener<ActivityLifeCycleEvent>() { // from class: com.amazon.a.a.2
            {
                AppstoreSDK.this = this;
            }

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
            /* renamed from: a */
            public void mo102723a(ActivityLifeCycleEvent activityLifeCycleEvent) {
                HashMap hashMap = new HashMap();
                hashMap.put(AppstoreSDK.f2266b, ActivityLifeCycleEventIdentity.RESUME.name());
                hashMap.put(AppstoreSDK.f2265a, activityLifeCycleEvent.m103210b().getClass().getName());
                hashMap.put(AppstoreSDK.f2267c, Long.valueOf(System.currentTimeMillis()));
                LifeCycleEventTask lifeCycleEventTask = new LifeCycleEventTask(hashMap);
                if (KiwiLogger.f2770a) {
                    AppstoreSDK.f2268d.m102829a("Adding lifecycle RESUME command to pipeline");
                }
                AppstoreSDK.m103224c(lifeCycleEventTask);
            }
        });
    }

    /* renamed from: h */
    public void m103220h() {
        this.f2273i.mo103142a(new EventListener<ApplicationEvent>() { // from class: com.amazon.a.a.3
            {
                AppstoreSDK.this = this;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.LAST;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ApplicationEventIdentity.CREATE;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public void mo102723a(ApplicationEvent applicationEvent) {
                AppstoreSDK.this.m103219i();
            }
        });
    }

    /* renamed from: i */
    public void m103219i() {
        if (KiwiLogger.f2770a) {
            f2268d.m102829a("Enqueuing launch workflow");
        }
        if (!m103238a(this.f2277m)) {
            this.f2274j.mo102888a(TaskPipelineId.COMMAND, m103215m());
        }
    }

    /* renamed from: j */
    public void m103218j() {
        this.f2273i.mo103142a(new EventListener<ApplicationEvent>() { // from class: com.amazon.a.a.4
            {
                AppstoreSDK.this = this;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: b */
            public EventListenerNotificationOrder mo102722b() {
                return EventListenerNotificationOrder.LAST;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public EventIdentity mo102725a() {
                return ApplicationEventIdentity.DESTROY;
            }

            @Override // com.amazon.p047a.p048a.p054c.EventListener
            /* renamed from: a */
            public void mo102723a(ApplicationEvent applicationEvent) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger = AppstoreSDK.f2268d;
                    kiwiLogger.m102829a("Beginning shutdown process for application: " + AppstoreSDK.this.f2277m.getPackageName());
                }
                AppstoreSDK unused = AppstoreSDK.f2270f = null;
            }
        });
    }

    /* renamed from: a */
    public static void m103237a(Context context) {
        if (m103223d()) {
            return;
        }
        synchronized (AppstoreSDK.class) {
            if (!m103223d()) {
                Application application = (Application) context.getApplicationContext();
                f2270f = new AppstoreSDK(application);
                application.registerActivityLifecycleCallbacks(ApplicationLifecycleObserver.m103129a());
            }
        }
    }

    /* renamed from: b */
    private void m103229b(Application application) {
        Object kiwiLogHandler;
        ResourceManagerImpl resourceManagerImpl = new ResourceManagerImpl();
        resourceManagerImpl.mo103035a(application);
        resourceManagerImpl.mo103035a(new TaskManagerImpl());
        resourceManagerImpl.mo103035a(new KiwiDataStore());
        resourceManagerImpl.mo103035a(new ActivityResultManagerImpl());
        resourceManagerImpl.mo103035a(new ContextManagerImplV3());
        resourceManagerImpl.mo103035a(new PromptManagerImpl());
        resourceManagerImpl.mo103035a(new EventManagerImpl());
        resourceManagerImpl.mo103035a(new CrashManagerImpl());
        resourceManagerImpl.mo103035a(new MetricsManagerImpl());
        resourceManagerImpl.mo103035a(new CommandServiceClient());
        resourceManagerImpl.mo103035a(new DataAuthenticationKeyLoaderV3());
        resourceManagerImpl.mo103035a(new AuthenticationTokenVerifier());
        if (m103238a(application)) {
            kiwiLogHandler = new SandboxLogHandler();
        } else {
            kiwiLogHandler = new KiwiLogHandler();
        }
        resourceManagerImpl.mo103035a(kiwiLogHandler);
        resourceManagerImpl.mo103037a();
        resourceManagerImpl.mo103032b(this);
    }

    /* renamed from: c */
    public static LogHandler m103225c() {
        if (!m103223d()) {
            f2268d.m102829a("Appstore SDK is not initialized. Returning default log handler");
            return f2269e;
        }
        return f2270f.f2279o;
    }

    /* renamed from: a */
    public static boolean m103238a(Application application) {
        boolean z = (application.getApplicationInfo().flags & 2) != 0;
        boolean m103216l = m103216l();
        if (z && m103216l) {
            f2268d.m102829a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
            return true;
        }
        f2268d.m102829a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
        return false;
    }

    /* renamed from: a */
    private static String m103233a(String str) {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{KiwiConstants.f2712aq, str}).getInputStream()));
                try {
                    String readLine = bufferedReader2.readLine();
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                        f2268d.m102826b("Unable to close BufferedReader instance");
                    }
                    return readLine;
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    f2268d.m102828a("Can't get system property", e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (Exception unused2) {
                            f2268d.m102826b("Unable to close BufferedReader instance");
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                            f2268d.m102826b("Unable to close BufferedReader instance");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m103236a(AbstractCommandTask abstractCommandTask) {
        if (KiwiLogger.f2770a) {
            f2268d.m102829a("WARNING: Use of deprecated method detected.");
        }
        if (m103223d()) {
            m103224c(abstractCommandTask);
        } else {
            f2268d.m102826b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    /* renamed from: a */
    public static void m103235a(AbstractCommandTask abstractCommandTask, Context context) {
        if (!m103223d()) {
            if (context != null && context.getApplicationContext() != null) {
                f2270f = new AppstoreSDK((Application) context.getApplicationContext());
            } else {
                f2268d.m102826b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        m103224c(abstractCommandTask);
    }

    /* renamed from: b */
    public static ContextManager m103230b() {
        if (!m103223d()) {
            f2268d.m102826b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
            return null;
        }
        return f2270f.f2271g;
    }

    /* renamed from: a */
    public static PromptManager m103239a() {
        if (!m103223d()) {
            f2268d.m102826b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
            return null;
        }
        return f2270f.f2275k;
    }

    /* renamed from: b */
    private static void m103226b(String str, Context context) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2268d;
            kiwiLogger.m102829a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    /* renamed from: a */
    public static boolean m103231a(String str, String str2) {
        if (m103223d()) {
            try {
                return SignatureVerifier.m102835a(str, str2, f2270f.f2278n.mo102840a());
            } catch (DataAuthenticationKeyLoadException e) {
                KiwiLogger kiwiLogger = f2268d;
                kiwiLogger.m102829a("Unable to validate signature: " + e.getMessage());
                return false;
            }
        }
        f2268d.m102829a("AppstoreSDK was not yet initialized - cannot do the IAP call");
        return false;
    }

    /* renamed from: a */
    public static boolean m103232a(String str, Context context) {
        Assert.m102876a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2268d;
            kiwiLogger.m102829a(str + ": " + context);
        }
        if (m103223d()) {
            return true;
        }
        m103226b(str, context);
        return false;
    }
}
