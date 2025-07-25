package p872s2;

import com.helpshift.log.HSLogger;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p1066z2.NativeToSdkxMigrator;
import p693h3.HSGenericDataManager;
import p710i3.UserManager;
import p856r2.HelpshiftResourceCacheManager;
import p977t2.HSThreadingService;
import p991u2.HSConfigManager;

/* renamed from: s2.a */
/* loaded from: classes5.dex */
public class HSChatEventsHandler {

    /* renamed from: a */
    private final HSThreadingService f104005a;

    /* renamed from: b */
    private final HSConfigManager f104006b;

    /* renamed from: c */
    private final UserManager f104007c;

    /* renamed from: d */
    private final HelpshiftResourceCacheManager f104008d;

    /* renamed from: e */
    private final HSGenericDataManager f104009e;

    /* renamed from: f */
    private final NativeToSdkxMigrator f104010f;

    /* renamed from: g */
    private WeakReference<HSWebchatToUiCallback> f104011g;

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$a */
    /* loaded from: classes5.dex */
    class RunnableC39582a implements Runnable {
        RunnableC39582a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.f104011g.get();
            if (hSWebchatToUiCallback != null) {
                hSWebchatToUiCallback.mo12154s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$b */
    /* loaded from: classes5.dex */
    public class RunnableC39583b implements Runnable {
        RunnableC39583b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104008d.m12701a();
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$c */
    /* loaded from: classes5.dex */
    class RunnableC39584c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104014b;

        RunnableC39584c(String str) {
            this.f104014b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.f104011g.get();
            if (hSWebchatToUiCallback != null) {
                hSWebchatToUiCallback.mo12159d(this.f104014b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$d */
    /* loaded from: classes5.dex */
    public class RunnableC39585d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104016b;

        RunnableC39585d(String str) {
            this.f104016b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104006b.m3070J(this.f104016b);
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$e */
    /* loaded from: classes5.dex */
    class RunnableC39586e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104018b;

        RunnableC39586e(String str) {
            this.f104018b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104006b.m3068L(this.f104018b);
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$f */
    /* loaded from: classes5.dex */
    class RunnableC39587f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104020b;

        RunnableC39587f(String str) {
            this.f104020b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104006b.m3078B(this.f104020b);
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$g */
    /* loaded from: classes5.dex */
    class RunnableC39588g implements Runnable {
        RunnableC39588g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104007c.m23220U(true);
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$h */
    /* loaded from: classes5.dex */
    class RunnableC39589h implements Runnable {
        RunnableC39589h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104007c.m23232I();
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$i */
    /* loaded from: classes5.dex */
    class RunnableC39590i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104024b;

        RunnableC39590i(String str) {
            this.f104024b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSChatEventsHandler.this.f104009e.m23813j(this.f104024b);
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$j */
    /* loaded from: classes5.dex */
    class RunnableC39591j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104026b;

        RunnableC39591j(String str) {
            this.f104026b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean optBoolean = new JSONObject(this.f104026b).optBoolean("issueExists", false);
                HSChatEventsHandler.this.f104007c.m23218W(optBoolean);
                if (optBoolean) {
                    HSChatEventsHandler.this.f104007c.m23231J(HSChatEventsHandler.this.f104007c.m23193q());
                }
            } catch (Exception e) {
                HSLogger.m65438e("wbEvntHndlr", "error in getting the issue exist flag", e);
            }
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$k */
    /* loaded from: classes5.dex */
    class RunnableC39592k implements Runnable {
        RunnableC39592k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.f104011g.get();
            if (hSWebchatToUiCallback != null) {
                hSWebchatToUiCallback.mo12158g();
            }
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$l */
    /* loaded from: classes5.dex */
    class RunnableC39593l implements Runnable {
        RunnableC39593l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.f104011g.get();
            if (hSWebchatToUiCallback != null) {
                hSWebchatToUiCallback.mo12155m();
            }
        }
    }

    /* compiled from: HSChatEventsHandler.java */
    /* renamed from: s2.a$m */
    /* loaded from: classes5.dex */
    class RunnableC39594m implements Runnable {
        RunnableC39594m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSWebchatToUiCallback hSWebchatToUiCallback = (HSWebchatToUiCallback) HSChatEventsHandler.this.f104011g.get();
            if (hSWebchatToUiCallback != null) {
                hSWebchatToUiCallback.mo12160c();
            }
        }
    }

    public HSChatEventsHandler(UserManager userManager, HSThreadingService hSThreadingService, HSConfigManager hSConfigManager, HelpshiftResourceCacheManager helpshiftResourceCacheManager, HSGenericDataManager hSGenericDataManager, NativeToSdkxMigrator nativeToSdkxMigrator) {
        this.f104005a = hSThreadingService;
        this.f104007c = userManager;
        this.f104006b = hSConfigManager;
        this.f104008d = helpshiftResourceCacheManager;
        this.f104009e = hSGenericDataManager;
        this.f104010f = nativeToSdkxMigrator;
    }

    /* renamed from: f */
    private void m12211f() {
        this.f104005a.m3278e(new RunnableC39583b());
    }

    /* renamed from: r */
    private void m12199r(String str) {
        this.f104005a.m3278e(new RunnableC39585d(str));
    }

    /* renamed from: g */
    public void m12210g() {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.f104011g.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.mo12157j();
        }
    }

    /* renamed from: h */
    public void m12209h(String str) {
        this.f104005a.m3278e(new RunnableC39588g());
    }

    /* renamed from: i */
    public void m12208i() {
        this.f104005a.m3278e(new RunnableC39589h());
    }

    /* renamed from: j */
    public void m12207j(String str) {
        this.f104005a.m3278e(new RunnableC39587f(str));
    }

    /* renamed from: k */
    public void m12206k(String str) {
        this.f104005a.m3278e(new RunnableC39586e(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m12205l(String str) {
        m12199r(str);
        this.f104005a.m3279d(new RunnableC39584c(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m12204m() {
        m12211f();
        this.f104005a.m3279d(new RunnableC39582a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m12203n() {
        this.f104005a.m3279d(new RunnableC39592k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m12202o() {
        m12211f();
        this.f104005a.m3279d(new RunnableC39594m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m12201p() {
        this.f104005a.m3279d(new RunnableC39593l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m12200q(String str) {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.f104011g.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.mo12153u(str);
        }
    }

    /* renamed from: s */
    public void m12198s(boolean z) {
        this.f104010f.m869m(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m12197t(String str) {
        this.f104005a.m3278e(new RunnableC39590i(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m12196u(String str) {
        this.f104005a.m3278e(new RunnableC39591j(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m12195v(String str) {
        try {
            this.f104007c.m23219V(new JSONObject(str).optBoolean("shouldPoll", false));
        } catch (Exception e) {
            HSLogger.m65438e("wbEvntHndlr", "Error getting polling status", e);
        }
    }

    /* renamed from: w */
    public void m12194w(HSWebchatToUiCallback hSWebchatToUiCallback) {
        this.f104011g = new WeakReference<>(hSWebchatToUiCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m12193x() {
        HSWebchatToUiCallback hSWebchatToUiCallback = this.f104011g.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.mo12156l();
        }
    }
}
