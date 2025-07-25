package p755k6;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.firebase.messaging.FirebaseMessaging;
import com.learnings.unity.push.BuildConfig;
import com.meevii.push.notification.IDisplayPush;
import com.meevii.push.notification.MeeviiNotificationManager;
import com.meevii.push.permission.IPushPermissionCustomUI;
import com.meevii.push.permission.OnFullScreenIntentPermissionCallback;
import com.meevii.push.permission.OnPushPermissionCallback;
import com.meevii.push.permission.PushPermissionManager;
import com.meevii.push.permission.PushPermissionUtils;
import java.util.Locale;
import java.util.TimeZone;
import p042c7.RelyTaskManager;
import p042c7.UserBehaviorManager;
import p1010v6.LocalPushData;
import p1055y6.C45035a;
import p636d7.PushLogUtil;
import p772l6.IEventSend;
import p772l6.PushEvent;
import p844q6.DataManager;
import p844q6.RequestData;
import p981t6.LocalPushSdk;

/* renamed from: k6.e */
/* loaded from: classes4.dex */
public class PushSdk {

    /* renamed from: a */
    private static boolean f98677a;

    /* renamed from: b */
    private static boolean f98678b;

    /* compiled from: PushSdk.java */
    /* renamed from: k6.e$a */
    /* loaded from: classes4.dex */
    public static class C37394a {

        /* renamed from: a */
        private final Context f98679a;

        /* renamed from: b */
        private String f98680b;

        /* renamed from: c */
        private String f98681c;

        /* renamed from: d */
        private String f98682d;

        /* renamed from: e */
        private String f98683e;

        /* renamed from: f */
        private String f98684f;

        /* renamed from: g */
        private String f98685g;

        /* renamed from: h */
        private String f98686h;

        /* renamed from: i */
        private String f98687i;

        /* renamed from: j */
        private boolean f98688j;

        /* renamed from: k */
        private IDisplayPush f98689k;

        /* renamed from: l */
        private IEventSend f98690l;

        /* renamed from: m */
        private LocalPushSdk.C44361a f98691m;

        /* renamed from: n */
        private IPushPermissionCustomUI f98692n;

        /* renamed from: o */
        private String f98693o;

        private C37394a(Context context) {
            this.f98679a = context;
        }

        /* renamed from: o */
        private void m18163o() {
            if (!TextUtils.isEmpty(this.f98685g)) {
                if (!TextUtils.isEmpty(this.f98686h)) {
                    if (!TextUtils.isEmpty(this.f98687i)) {
                        if (this.f98690l != null) {
                            return;
                        }
                        throw new IllegalArgumentException("eventSend cannot be null");
                    }
                    throw new IllegalArgumentException("secret cannot be null");
                }
                throw new IllegalArgumentException("apiKey cannot be null");
            }
            throw new IllegalArgumentException("productionId cannot be null");
        }

        /* renamed from: p */
        public static C37394a m18162p(Context context) {
            return new C37394a(context);
        }

        /* renamed from: s */
        public void m18159s() {
            String str;
            m18163o();
            if (TextUtils.isEmpty(this.f98684f)) {
                Locale locale = this.f98679a.getResources().getConfiguration().getLocales().get(0);
                String script = locale.getScript();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(script)) {
                    this.f98684f = language + "-" + script;
                } else {
                    this.f98684f = language;
                }
            }
            if (TextUtils.isEmpty(this.f98680b)) {
                this.f98680b = Locale.getDefault().getCountry();
            }
            if (TextUtils.isEmpty(this.f98693o)) {
                if (this.f98679a.getPackageName().endsWith(".amz")) {
                    str = "Amazon";
                } else {
                    str = "Android";
                }
                this.f98693o = str;
            }
            if (TextUtils.isEmpty(this.f98681c)) {
                try {
                    this.f98681c = this.f98679a.getPackageManager().getPackageInfo(this.f98679a.getPackageName(), 0).versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(this.f98682d)) {
                this.f98682d = BuildConfig.VERSION_NAME;
            }
            if (TextUtils.isEmpty(this.f98683e)) {
                this.f98683e = TimeZone.getDefault().getID();
            }
            PushPermissionManager.m47887a().m47883e(this.f98692n);
        }

        /* renamed from: A */
        public C37394a m18179A(IPushPermissionCustomUI iPushPermissionCustomUI) {
            this.f98692n = iPushPermissionCustomUI;
            return this;
        }

        /* renamed from: B */
        public C37394a m18178B(String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            this.f98687i = str;
            return this;
        }

        /* renamed from: q */
        public Context m18161q() {
            return this.f98679a;
        }

        /* renamed from: r */
        public String m18160r() {
            return this.f98693o;
        }

        /* renamed from: t */
        public boolean m18158t() {
            return this.f98688j;
        }

        /* renamed from: u */
        public C37394a m18157u(String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            this.f98686h = str;
            return this;
        }

        /* renamed from: v */
        public C37394a m18156v(boolean z) {
            this.f98688j = z;
            return this;
        }

        /* renamed from: w */
        public C37394a m18155w(IEventSend iEventSend) {
            this.f98690l = iEventSend;
            return this;
        }

        /* renamed from: x */
        public C37394a m18154x(LocalPushSdk.C44361a c44361a) {
            this.f98691m = c44361a;
            return this;
        }

        /* renamed from: y */
        public C37394a m18153y(IDisplayPush iDisplayPush) {
            this.f98689k = iDisplayPush;
            return this;
        }

        /* renamed from: z */
        public C37394a m18152z(String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            this.f98685g = str;
            return this;
        }
    }

    @SafeVarargs
    /* renamed from: d */
    public static void m18198d(Class<? extends Activity>... clsArr) {
        C45035a.m1048b().m1049a(clsArr);
    }

    /* renamed from: e */
    public static void m18197e(boolean z) {
        m18196f(z, false);
    }

    /* renamed from: f */
    private static void m18196f(boolean z, boolean z2) {
        PushLogUtil.m25698a("enablePush :" + z);
        if (DataManager.m12928g().m12920o() == z && !z2) {
            PushLogUtil.m25698a("currentEnable == enable, skip");
            return;
        }
        DataManager.m12928g().m12916s(z);
        if (z) {
            PushLogUtil.m25698a("disable to enable, register token");
            RemotePushManager.m18148d().m18141k(DataManager.m12928g().m12924k());
            return;
        }
        PushLogUtil.m25698a("enable to disable, unregister token");
        DataManager.m12928g().m12917r(false);
        RemotePushManager.m18148d().m18140l();
        DataManager.m12928g().m12933b();
    }

    /* renamed from: g */
    public static void m18195g(C37394a c37394a) {
        if (f98678b) {
            return;
        }
        f98678b = true;
        boolean z = c37394a.f98688j;
        f98677a = z;
        PushLogUtil.m25695d(z);
        c37394a.m18159s();
        PushEvent.m15668f(c37394a.f98690l);
        FirebaseMessaging.getInstance().setDeliveryMetricsExportToBigQuery(true);
        MeeviiNotificationManager.m47899b().m47900a(CustomTabsCallback.ONLINE_EXTRAS_KEY, c37394a.f98689k);
        DataManager.m12928g().m12922m(c37394a.f98679a);
        PushConfigManager.m18207a().m18204d(c37394a);
        String m12925j = DataManager.m12928g().m12925j();
        final RequestData requestData = new RequestData();
        requestData.m12892r(m12925j);
        requestData.m12895o(c37394a.f98681c);
        requestData.m12894p(c37394a.f98680b);
        requestData.m12893q(c37394a.f98684f);
        requestData.m12890t(c37394a.f98685g);
        requestData.m12889u(c37394a.f98682d);
        requestData.m12887w(c37394a.f98683e);
        requestData.m12896n(c37394a.f98686h);
        requestData.m12888v(c37394a.f98687i);
        requestData.m12891s(c37394a.f98679a.getPackageName());
        DataManager.m12928g().m12912w(requestData);
        RelyTaskManager.m103596b().m103597a("task_name_token_register", new Runnable() { // from class: k6.b
            @Override // java.lang.Runnable
            public final void run() {
                PushSdk.m18188n(requestData);
            }
        });
        RelyTaskManager.m103596b().m103597a("task_name_user_behavior", new Runnable() { // from class: k6.c
            @Override // java.lang.Runnable
            public final void run() {
                PushSdk.m18187o(requestData);
            }
        });
        if (!DataManager.m12928g().m12920o() && !DataManager.m12928g().m12921n()) {
            m18196f(false, true);
        }
        if (c37394a.f98691m != null) {
            LocalPushSdk.m3243e(c37394a.f98691m);
        }
        RelyTaskManager.m103596b().m103595c("task_name_push_sdk_init");
    }

    /* renamed from: h */
    public static boolean m18194h() {
        return f98677a;
    }

    /* renamed from: i */
    public static boolean m18193i(Context context) {
        return PushPermissionManager.m47887a().m47882f(context);
    }

    /* renamed from: j */
    public static boolean m18192j(Context context) {
        return PushPermissionManager.m47887a().m47881g(context);
    }

    /* renamed from: k */
    public static boolean m18191k(Context context) {
        return PushPermissionManager.m47887a().m47880h(context);
    }

    /* renamed from: l */
    public static boolean m18190l() {
        return f98678b;
    }

    /* renamed from: m */
    public static boolean m18189m(Context context) {
        return PushPermissionUtils.m47862c(context);
    }

    /* renamed from: n */
    public static /* synthetic */ void m18188n(RequestData requestData) {
        RemotePushManager.m18148d().m18141k(requestData);
    }

    /* renamed from: o */
    public static /* synthetic */ void m18187o(RequestData requestData) {
        UserBehaviorManager.m103590d().m103586h(requestData);
    }

    /* renamed from: p */
    public static /* synthetic */ void m18186p(String str) {
        if (!TextUtils.equals(str, DataManager.m12928g().m12925j())) {
            DataManager.m12928g().m12913v(str);
            RequestData m12924k = DataManager.m12928g().m12924k();
            RemotePushManager.m18148d().m18141k(m12924k);
            UserBehaviorManager.m103590d().m103585i(m12924k);
        }
    }

    /* renamed from: q */
    public static void m18185q(Activity activity, int i) {
        PushPermissionManager.m47887a().m47873o(activity, i);
        PushPermissionManager.m47887a().m47879i(activity, i);
    }

    /* renamed from: r */
    public static void m18184r(Activity activity, String str, OnFullScreenIntentPermissionCallback onFullScreenIntentPermissionCallback) {
        PushPermissionManager.m47887a().m47870r(activity, str, onFullScreenIntentPermissionCallback);
    }

    /* renamed from: s */
    public static void m18183s(Activity activity, int i, String str, OnPushPermissionCallback onPushPermissionCallback) {
        PushPermissionManager.m47887a().m47868t(activity, i, str, onPushPermissionCallback);
    }

    /* renamed from: t */
    public static void m18182t(Activity activity, String str, OnPushPermissionCallback onPushPermissionCallback) {
        PushPermissionManager.m47887a().m47866v(activity, str, onPushPermissionCallback);
    }

    /* renamed from: u */
    public static void m18181u(LocalPushData localPushData) {
        LocalPushSdk.m3236l(localPushData);
    }

    /* renamed from: v */
    public static void m18180v(final String str) {
        RelyTaskManager.m103596b().m103597a("task_name_push_sdk_init", new Runnable() { // from class: k6.d
            @Override // java.lang.Runnable
            public final void run() {
                PushSdk.m18186p(str);
            }
        });
    }
}
