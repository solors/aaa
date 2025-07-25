package p1068z4;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006a5.AfDataManager;
import p028b5.BridgeManager;
import p028b5.UserTagAdData;
import p040c5.ConfigData;
import p040c5.ConfigLoader;
import p682g5.C33205c;
import p682g5.LifeCycleManager;
import p695h5.IUserTagProcessor;
import p695h5.LocalTagProcessor;
import p695h5.RemoteTagProcessor;
import p712i5.AdValueTagProcessor;
import p712i5.AfTagProcessor;
import p712i5.DeviceTagProcessor;
import p712i5.DynamicAdValueTagProcessor;
import p712i5.MoFlowDomainProcessor;
import p712i5.PmFlowDomainProcessor;
import p712i5.UaAdTagProcessor;
import p738j5.DataProcessUtils;
import p738j5.LogUtils;

/* renamed from: z4.t */
/* loaded from: classes6.dex */
public class UserTagProcessorManager implements BridgeManager.InterfaceC3352a, IUserTagProcessor {

    /* renamed from: a */
    private final String f118754a;

    /* renamed from: b */
    private final List<IUserTagProcessor> f118755b;

    /* renamed from: c */
    private ConfigLoader f118756c;

    /* renamed from: d */
    private volatile boolean f118757d;

    /* compiled from: UserTagProcessorManager.java */
    /* renamed from: z4.t$a */
    /* loaded from: classes6.dex */
    public class C45141a implements LifeCycleManager.InterfaceC33203b {
        C45141a() {
            UserTagProcessorManager.this = r1;
        }

        @Override // p682g5.LifeCycleManager.InterfaceC33203b
        /* renamed from: a */
        public void mo699a() {
            C33205c.m24302b().m24301c("task_key_app_enter_front");
            LifeCycleManager.m24309f().m24306i(this);
        }
    }

    /* compiled from: UserTagProcessorManager.java */
    /* renamed from: z4.t$b */
    /* loaded from: classes6.dex */
    public class C45142b implements ConfigLoader.InterfaceC3434a {
        C45142b() {
            UserTagProcessorManager.this = r1;
        }

        @Override // p040c5.ConfigLoader.InterfaceC3434a
        /* renamed from: a */
        public void mo698a(Throwable th) {
            C33205c.m24302b().m24301c("task_key_init_request");
        }

        @Override // p040c5.ConfigLoader.InterfaceC3434a
        /* renamed from: b */
        public void mo697b(ConfigData configData) {
            UserTagProcessorManager.this.mo714d(configData);
            C33205c.m24302b().m24301c("task_key_init_request");
        }
    }

    /* compiled from: UserTagProcessorManager.java */
    /* renamed from: z4.t$d */
    /* loaded from: classes6.dex */
    public static class C45144d {

        /* renamed from: a */
        private static final UserTagProcessorManager f118761a = new UserTagProcessorManager(null);
    }

    /* synthetic */ UserTagProcessorManager(C45141a c45141a) {
        this();
    }

    /* renamed from: m */
    public static UserTagProcessorManager m705m() {
        return C45144d.f118761a;
    }

    /* renamed from: n */
    private void m704n(UserTagInitParameter userTagInitParameter) {
        UserTagData m773c = UserTagDataManager.m774b().m773c();
        this.f118755b.add(new DeviceTagProcessor(m773c));
        this.f118755b.add(new AfTagProcessor(m773c));
        this.f118755b.add(new UaAdTagProcessor(m773c));
        this.f118755b.add(new AdValueTagProcessor(m773c));
        this.f118755b.add(new DynamicAdValueTagProcessor(m773c));
        this.f118755b.add(new MoFlowDomainProcessor(m773c));
        this.f118755b.add(new PmFlowDomainProcessor(m773c));
        this.f118755b.add(new LocalTagProcessor(m773c));
        this.f118755b.add(new RemoteTagProcessor(m773c));
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo715c(userTagInitParameter);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.INIT);
        AfDataManager.m105854b().m105852d();
    }

    /* renamed from: o */
    public /* synthetic */ void m703o() {
        this.f118756c.m103605j(new C45142b());
    }

    /* renamed from: p */
    public /* synthetic */ void m702p() {
        this.f118756c.m103605j(new C45143c());
    }

    /* renamed from: q */
    private void m701q(UserTagInitParameter userTagInitParameter) {
        this.f118756c = new ConfigLoader(userTagInitParameter);
        C33205c.m24302b().m24303a("task_key_app_enter_front", new Runnable() { // from class: z4.s
            {
                UserTagProcessorManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserTagProcessorManager.this.m703o();
            }
        });
    }

    @Override // p028b5.BridgeManager.InterfaceC3352a, p695h5.IUserTagProcessor
    /* renamed from: a */
    public void mo717a(UserTagAdData userTagAdData) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo717a(userTagAdData);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.ON_AD_IMPRESSION);
    }

    @Override // p028b5.BridgeManager.InterfaceC3352a, p695h5.IUserTagProcessor
    /* renamed from: b */
    public void mo716b(UserTagAdData userTagAdData) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo716b(userTagAdData);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.ON_AD_FILL);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: c */
    public void mo715c(UserTagInitParameter userTagInitParameter) {
        m704n(userTagInitParameter);
        m701q(userTagInitParameter);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo714d(configData);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.SET_CONFIG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: e */
    public void mo713e(String str, List<String> list) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo713e(str, list);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.ADD_LOCAL_TAG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: f */
    public void mo712f(String str) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo712f(str);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.REMOVE_LOCAL_TAG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: g */
    public void mo711g(Map<String, String> map) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo711g(map);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.SET_PM_FLOW_DOMAIN_TAG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: h */
    public void mo710h(Map<String, String> map) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo710h(map);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.SET_MO_FLOW_DOMAIN_TAG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: i */
    public void mo709i(String str, String str2) {
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo709i(str, str2);
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.ADD_LOCAL_TAG);
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: j */
    public void mo708j(Map<String, String> map) {
        Map<String, String> m105866e = AfDataManager.m105854b().m105853c().m105866e();
        for (IUserTagProcessor iUserTagProcessor : this.f118755b) {
            iUserTagProcessor.mo708j(map);
        }
        if (!DataProcessUtils.m18554c(m105866e, AfDataManager.m105854b().m105853c().m105866e())) {
            C33205c.m24302b().m24303a("task_key_init_request", new Runnable() { // from class: z4.r
                {
                    UserTagProcessorManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserTagProcessorManager.this.m702p();
                }
            });
        }
        UserTagDataManager.m774b().m772d(IUserTagProcessor.EnumC33479a.SET_AF_DATA);
        AfDataManager.m105854b().m105852d();
    }

    /* renamed from: r */
    public void m700r(Application application) {
        if (application == null) {
            return;
        }
        if (this.f118757d) {
            LogUtils.m18537b("UserTag_ProcessorManager", "has Observe");
            return;
        }
        LogUtils.m18537b("UserTag_ProcessorManager", "startObserve");
        LifeCycleManager.m24309f().m24311d(new C45141a());
        LifeCycleManager.m24309f().m24305j(application);
        BridgeManager.m103920l(application, this);
        this.f118757d = true;
    }

    private UserTagProcessorManager() {
        this.f118754a = "UserTag_ProcessorManager";
        this.f118755b = new ArrayList();
    }

    /* compiled from: UserTagProcessorManager.java */
    /* renamed from: z4.t$c */
    /* loaded from: classes6.dex */
    public class C45143c implements ConfigLoader.InterfaceC3434a {
        C45143c() {
            UserTagProcessorManager.this = r1;
        }

        @Override // p040c5.ConfigLoader.InterfaceC3434a
        /* renamed from: b */
        public void mo697b(ConfigData configData) {
            UserTagProcessorManager.this.mo714d(configData);
        }

        @Override // p040c5.ConfigLoader.InterfaceC3434a
        /* renamed from: a */
        public void mo698a(Throwable th) {
        }
    }
}
