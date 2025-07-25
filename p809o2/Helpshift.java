package p809o2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.helpshift.activities.HSMainActivity;
import com.helpshift.log.HSLogger;
import com.helpshift.log.InternalHelpshiftLogger;
import com.helpshift.log.LogCollector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p1006v2.HSContext;
import p1019w2.HSUncaughtExceptionHandler;
import p1051y2.HSAppLifeCycleController;
import p680g3.HelpshiftProactiveAPIConfigCollector;
import p680g3.ProactiveConfigMerge;
import p710i3.UserManager;
import p752k3.ApplicationUtil;
import p752k3.C37382g;
import p752k3.C37383m;
import p752k3.HSTimer;
import p752k3.SchemaUtil;
import p752k3.SdkURLs;

/* renamed from: o2.d */
/* loaded from: classes5.dex */
public class Helpshift {

    /* renamed from: a */
    private static HelpshiftProactiveAPIConfigCollector f102274a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$a */
    /* loaded from: classes5.dex */
    public class RunnableC38858a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102275b;

        /* renamed from: c */
        final /* synthetic */ String f102276c;

        RunnableC38858a(HSContext hSContext, String str) {
            this.f102275b = hSContext;
            this.f102276c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102275b.m2766e().m3042z(this.f102276c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$b */
    /* loaded from: classes5.dex */
    public class RunnableC38859b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102277b;

        RunnableC38859b(HSContext hSContext) {
            this.f102277b = hSContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102277b.m2766e().m3059i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$c */
    /* loaded from: classes5.dex */
    public class RunnableC38860c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102278b;

        /* renamed from: c */
        final /* synthetic */ Map f102279c;

        RunnableC38860c(HSContext hSContext, Map map) {
            this.f102278b = hSContext;
            this.f102279c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            UserManager m2751t = this.f102278b.m2751t();
            if (m2751t.m23195o()) {
                m2751t.m23232I();
                m2751t.m23203g();
            }
            m2751t.m23237D(this.f102279c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$d */
    /* loaded from: classes5.dex */
    public class RunnableC38861d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102280b;

        RunnableC38861d(HSContext hSContext) {
            this.f102280b = hSContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102280b.m2751t().m23236E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$e */
    /* loaded from: classes5.dex */
    public class RunnableC38862e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102281b;

        /* renamed from: c */
        final /* synthetic */ String f102282c;

        RunnableC38862e(HSContext hSContext, String str) {
            this.f102281b = hSContext;
            this.f102282c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102281b.m2766e().m3075E(this.f102282c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$f */
    /* loaded from: classes5.dex */
    public class RunnableC38863f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102283b;

        /* renamed from: c */
        final /* synthetic */ String f102284c;

        RunnableC38863f(HSContext hSContext, String str) {
            this.f102283b = hSContext;
            this.f102284c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102283b.m2751t().m23233H(this.f102284c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$g */
    /* loaded from: classes5.dex */
    public class RunnableC38864g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102285b;

        /* renamed from: c */
        final /* synthetic */ Map f102286c;

        RunnableC38864g(HSContext hSContext, Map map) {
            this.f102285b = hSContext;
            this.f102286c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f102285b.m2778A()) {
                this.f102285b.m2751t().m23207d0(1);
            }
            this.f102285b.m2754q().mo25787f((String) this.f102286c.get("alert"), true);
        }
    }

    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$h */
    /* loaded from: classes5.dex */
    public class RunnableC38865h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102287b;

        /* renamed from: c */
        final /* synthetic */ boolean f102288c;

        RunnableC38865h(HSContext hSContext, boolean z) {
            this.f102287b = hSContext;
            this.f102288c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102287b.m2751t().m23228M(this.f102288c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$i */
    /* loaded from: classes5.dex */
    public class RunnableC38866i implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f102289b;

        /* renamed from: c */
        final /* synthetic */ HSContext f102290c;

        RunnableC38866i(boolean z, HSContext hSContext) {
            this.f102289b = z;
            this.f102290c = hSContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f102289b) {
                this.f102290c.m2752s().m25766f(this.f102290c.m2751t().m23193q());
            } else {
                this.f102290c.m2752s().m25767e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$j */
    /* loaded from: classes5.dex */
    public class RunnableC38867j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HelpshiftEventsListener f102291b;

        RunnableC38867j(HelpshiftEventsListener helpshiftEventsListener) {
            this.f102291b = helpshiftEventsListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSContext.m2757n().m2759l().m12161d(this.f102291b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$k */
    /* loaded from: classes5.dex */
    public class RunnableC38868k implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102292b;

        /* renamed from: c */
        final /* synthetic */ String f102293c;

        RunnableC38868k(HSContext hSContext, String str) {
            this.f102292b = hSContext;
            this.f102293c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102292b.m2766e().m3061g(this.f102293c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$l */
    /* loaded from: classes5.dex */
    public class RunnableC38869l implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HelpshiftProactiveAPIConfigCollector f102294b;

        RunnableC38869l(HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
            this.f102294b = helpshiftProactiveAPIConfigCollector;
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpshiftProactiveAPIConfigCollector unused = Helpshift.f102274a = this.f102294b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$m */
    /* loaded from: classes5.dex */
    public class RunnableC38870m implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102295b;

        /* renamed from: c */
        final /* synthetic */ Application f102296c;

        /* renamed from: d */
        final /* synthetic */ Map f102297d;

        RunnableC38870m(HSContext hSContext, Application application, Map map) {
            this.f102295b = hSContext;
            this.f102296c = application;
            this.f102297d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f102295b.m2755p().m877e();
            this.f102295b.m2748w(this.f102296c);
            HSInstallHelper.m13992e(this.f102296c, this.f102297d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$n */
    /* loaded from: classes5.dex */
    public class RunnableC38871n implements Runnable {

        /* renamed from: b */
        final /* synthetic */ HSContext f102298b;

        /* renamed from: c */
        final /* synthetic */ String f102299c;

        /* renamed from: d */
        final /* synthetic */ String f102300d;

        /* renamed from: f */
        final /* synthetic */ Application f102301f;

        /* renamed from: g */
        final /* synthetic */ Map f102302g;

        /* renamed from: h */
        final /* synthetic */ Map f102303h;

        RunnableC38871n(HSContext hSContext, String str, String str2, Application application, Map map, Map map2) {
            this.f102298b = hSContext;
            this.f102299c = str;
            this.f102300d = str2;
            this.f102301f = application;
            this.f102302g = map;
            this.f102303h = map2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            this.f102298b.m2766e().m3076D(this.f102299c, this.f102300d);
            boolean m18267h = ApplicationUtil.m18267h(this.f102301f);
            Object obj = this.f102302g.get("enableLogging");
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            this.f102298b.m2774E(z);
            InternalHelpshiftLogger internalHelpshiftLogger = new InternalHelpshiftLogger(m18267h, z);
            if (m18267h && z) {
                internalHelpshiftLogger.setLogCollector(new LogCollector(this.f102301f, LogCollector.getLogFileName(), Looper.getMainLooper().getThread().getId()));
                HSUncaughtExceptionHandler.m2375a();
                this.f102298b.m2754q().mo25785h();
            }
            HSLogger.initLogger(internalHelpshiftLogger);
            HSLogger.m65441d("Helpshift", "Install called: Domain : " + this.f102300d + ", Config: " + this.f102303h + " SDK X Version: " + this.f102298b.m2764g().mo2784d());
            HSInstallHelper.m13994c(this.f102301f, this.f102298b.m2754q(), this.f102302g);
            this.f102298b.m2750u().m13319c(this.f102302g);
            HSInstallHelper.m13995b(this.f102302g, this.f102298b.m2753r());
            HSInstallHelper.m13993d(this.f102302g, this.f102298b.m2753r());
            this.f102298b.m2762i().m12704a();
            this.f102298b.m2751t().m23203g();
            if (HSPluginEventBridge.m13989c()) {
                HSAppLifeCycleController.m1096a().m1094c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$o */
    /* loaded from: classes5.dex */
    public class RunnableC38872o implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f102304b;

        /* renamed from: c */
        final /* synthetic */ HSContext f102305c;

        RunnableC38872o(String str, HSContext hSContext) {
            this.f102304b = str;
            this.f102305c = hSContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Uri parse = Uri.parse(this.f102304b);
                if (!"helpshift.com".equals(parse.getHost())) {
                    HSLogger.m65439e("Helpshift", "Incorrect host for proactive link, skipping!");
                    return;
                }
                char c = 0;
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(parse.getQueryParameter("payload"), 0)));
                String optString = jSONObject.optString("action");
                if (C37383m.m18236d(optString)) {
                    HSLogger.m65439e("Helpshift", "No action found in proactive link, skipping!");
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("chatConfig");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("meta");
                JSONObject jSONObject2 = new JSONObject();
                if (!"chat".equals(optString)) {
                    jSONObject2 = jSONObject.optJSONObject("hcConfig");
                }
                Map<String, Object> hashMap = new HashMap<>();
                if (Helpshift.f102274a != null) {
                    hashMap = Helpshift.f102274a.mo24478a();
                    HSLogger.m65441d("Helpshift", "Collected local config for proactive: " + hashMap);
                    if (hashMap == null) {
                        hashMap = new HashMap<>();
                    }
                }
                Helpshift.m13958w(hashMap);
                JSONObject jSONObject3 = new JSONObject(hashMap);
                boolean m18255c = C37382g.m18255c(optJSONObject);
                HSLogger.m65441d("Helpshift", "Is proactive config empty? " + m18255c);
                if (!m18255c) {
                    jSONObject3 = ProactiveConfigMerge.m24477a(jSONObject3, optJSONObject);
                }
                if (!C37382g.m18255c(optJSONObject2)) {
                    jSONObject3.put("outboundSupportMeta", optJSONObject2);
                }
                Map<String, Object> m18249i = C37382g.m18249i(jSONObject3.toString());
                Context context = this.f102305c.f116809z;
                HSLogger.m65441d("Helpshift", "Starting SDK with proactive support action : " + optString);
                switch (optString.hashCode()) {
                    case -1224669617:
                        if (optString.equals("hc-app")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1224665276:
                        if (optString.equals("hc-faq")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3052376:
                        if (optString.equals("chat")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 1280394259:
                        if (optString.equals("hc-section")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    Helpshift.m13987B(context, m18249i, true);
                } else if (c == 1) {
                    Helpshift.m13983F(context, m18249i, true);
                } else {
                    String str = "";
                    if (c != 2) {
                        if (c == 3) {
                            if (!C37382g.m18255c(jSONObject2)) {
                                str = jSONObject2.optString("faqId", "");
                            }
                            Helpshift.m13981H(context, str, m18249i, true);
                            return;
                        }
                        return;
                    }
                    if (!C37382g.m18255c(jSONObject2)) {
                        str = jSONObject2.optString("faqSectionId", "");
                    }
                    Helpshift.m13985D(context, str, m18249i, true);
                }
            } catch (Exception unused) {
                HSLogger.m65439e("Helpshift", "Error handling proactive link : " + this.f102304b);
            }
        }
    }

    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$p */
    /* loaded from: classes5.dex */
    public class RunnableC38873p implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Map f102306b;

        /* renamed from: c */
        final /* synthetic */ Context f102307c;

        /* renamed from: d */
        final /* synthetic */ boolean f102308d;

        RunnableC38873p(Map map, Context context, boolean z) {
            this.f102306b = map;
            this.f102307c = context;
            this.f102308d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Helpshift.m13959v(this.f102306b);
            Intent intent = new Intent(this.f102307c, HSMainActivity.class);
            intent.putExtra("SERVICE_MODE", "WEBCHAT_SERVICE_FLAG");
            intent.putExtra("source", "api");
            if (this.f102308d) {
                intent.putExtra("source", "proactive");
                intent.setFlags(268435456);
            }
            this.f102307c.startActivity(intent);
        }
    }

    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$q */
    /* loaded from: classes5.dex */
    public class RunnableC38874q implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Map f102309b;

        /* renamed from: c */
        final /* synthetic */ Context f102310c;

        /* renamed from: d */
        final /* synthetic */ boolean f102311d;

        RunnableC38874q(Map map, Context context, boolean z) {
            this.f102309b = map;
            this.f102310c = context;
            this.f102311d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Helpshift.m13959v(this.f102309b);
            Intent intent = new Intent(this.f102310c, HSMainActivity.class);
            intent.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
            intent.putExtra("HELPCENTER_MODE", "APP_MAIN_PAGE");
            intent.putExtra("source", "api");
            if (this.f102311d) {
                intent.putExtra("source", "proactive");
                intent.setFlags(268435456);
            }
            this.f102310c.startActivity(intent);
        }
    }

    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$r */
    /* loaded from: classes5.dex */
    public class RunnableC38875r implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Map f102312b;

        /* renamed from: c */
        final /* synthetic */ Context f102313c;

        /* renamed from: d */
        final /* synthetic */ String f102314d;

        /* renamed from: f */
        final /* synthetic */ boolean f102315f;

        RunnableC38875r(Map map, Context context, String str, boolean z) {
            this.f102312b = map;
            this.f102313c = context;
            this.f102314d = str;
            this.f102315f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Helpshift.m13959v(this.f102312b);
            Intent intent = new Intent(this.f102313c, HSMainActivity.class);
            intent.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
            intent.putExtra("HELPCENTER_MODE", "FAQ_SECTION");
            intent.putExtra("FAQ_SECTION_ID", this.f102314d);
            intent.putExtra("source", "api");
            if (this.f102315f) {
                intent.putExtra("source", "proactive");
                intent.setFlags(268435456);
            }
            this.f102313c.startActivity(intent);
        }
    }

    /* compiled from: Helpshift.java */
    /* renamed from: o2.d$s */
    /* loaded from: classes5.dex */
    public class RunnableC38876s implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Map f102316b;

        /* renamed from: c */
        final /* synthetic */ Context f102317c;

        /* renamed from: d */
        final /* synthetic */ String f102318d;

        /* renamed from: f */
        final /* synthetic */ boolean f102319f;

        RunnableC38876s(Map map, Context context, String str, boolean z) {
            this.f102316b = map;
            this.f102317c = context;
            this.f102318d = str;
            this.f102319f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Helpshift.m13959v(this.f102316b);
            Intent intent = new Intent(this.f102317c, HSMainActivity.class);
            intent.putExtra("SERVICE_MODE", "HELP_CENTER_SERVICE_FLAG");
            intent.putExtra("HELPCENTER_MODE", "SINGLE_FAQ");
            intent.putExtra("SINGLE_FAQ_PUBLISH_ID", this.f102318d);
            intent.putExtra("source", "api");
            if (this.f102319f) {
                intent.putExtra("source", "proactive");
                intent.setFlags(268435456);
            }
            this.f102317c.startActivity(intent);
        }
    }

    /* renamed from: A */
    public static void m13988A(@NonNull Activity activity, Map<String, Object> map) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSTimer.m18258b("api");
        m13987B(activity, map, false);
    }

    /* renamed from: B */
    public static void m13987B(Context context, Map<String, Object> map, boolean z) {
        HSLogger.m65441d("Helpshift", "showConversation is called with config: " + map + " \n Is proactive? " + z);
        HSContext.m2757n().m2758m().m3279d(new RunnableC38873p(map, context, z));
    }

    /* renamed from: C */
    public static void m13986C(@NonNull Activity activity, String str, Map<String, Object> map) {
        if (!HSContext.m2771H()) {
            return;
        }
        m13985D(activity, str, map, false);
    }

    /* renamed from: D */
    public static void m13985D(Context context, String str, Map<String, Object> map, boolean z) {
        HSLogger.m65441d("Helpshift", "showFAQSection is called with sectionId" + str + " & config: " + map + " \n Is proactive? : " + z);
        if (C37383m.m18236d(str)) {
            HSLogger.m65439e("Helpshift", "Invalid FAQ Section ID. Ignoring call to showFAQSection API.");
        } else {
            HSContext.m2757n().m2758m().m3279d(new RunnableC38875r(map, context, str, z));
        }
    }

    /* renamed from: E */
    public static void m13984E(@NonNull Activity activity, Map<String, Object> map) {
        if (!HSContext.m2771H()) {
            return;
        }
        m13983F(activity, map, false);
    }

    /* renamed from: F */
    public static void m13983F(Context context, Map<String, Object> map, boolean z) {
        HSLogger.m65441d("Helpshift", "showFAQs is called with config: " + map + " \n Is proactive? " + z);
        HSContext.m2757n().m2758m().m3279d(new RunnableC38874q(map, context, z));
    }

    /* renamed from: G */
    public static void m13982G(@NonNull Activity activity, String str, Map<String, Object> map) {
        if (!HSContext.m2771H()) {
            return;
        }
        m13981H(activity, str, map, false);
    }

    /* renamed from: H */
    public static void m13981H(Context context, String str, Map<String, Object> map, boolean z) {
        HSLogger.m65441d("Helpshift", "showSingleFAQ() is called with publishId" + str + " & config: " + map + " \n Is proactive? : " + z);
        if (C37383m.m18236d(str)) {
            HSLogger.m65439e("Helpshift", "Invalid FAQ ID. Ignoring call to showSingleFAQ API.");
        } else {
            HSContext.m2757n().m2758m().m3279d(new RunnableC38876s(map, context, str, z));
        }
    }

    /* renamed from: i */
    public static void m13972i(String str) {
        if (HSContext.m2771H() && !C37383m.m18236d(str)) {
            HSLogger.m65441d("Helpshift", "addUserTrail() is called for User tracking for clients");
            HSContext m2757n = HSContext.m2757n();
            m2757n.m2758m().m3278e(new RunnableC38868k(m2757n, str));
        }
    }

    @Deprecated
    /* renamed from: j */
    public static void m13971j() {
        HSLogger.m65441d("Helpshift", "Deprecated clearAnonymousUserOnLogin() is called.");
        m13970k(true);
    }

    /* renamed from: k */
    public static void m13970k(boolean z) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "clearAnonymousUserOnLogin() with param " + z + " is called.");
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38865h(m2757n, z));
    }

    /* renamed from: l */
    public static void m13969l() {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "Clearing Breadcrumbs");
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38859b(m2757n));
    }

    /* renamed from: m */
    public static void m13968m() {
        HSLogger.m65441d("Helpshift", "closeSession: called");
        if (!HSContext.m2771H()) {
            return;
        }
        HSContext.m2757n().m2769b();
    }

    /* renamed from: n */
    public static void m13967n(String str) {
        if (!C37383m.m18236d(str) && HSContext.m2771H()) {
            HSLogger.m65441d("Helpshift", "handleProactiveLink is called with: " + str);
            HSContext m2757n = HSContext.m2757n();
            m2757n.m2758m().m3279d(new RunnableC38872o(str, m2757n));
        }
    }

    /* renamed from: o */
    public static void m13966o(Map<String, String> map) {
        if (HSContext.m2771H() && map != null && map.size() != 0) {
            HSLogger.m65441d("Helpshift", "handlePush() is called.");
            HSContext m2757n = HSContext.m2757n();
            m2757n.m2758m().m3278e(new RunnableC38864g(m2757n, map));
        }
    }

    /* renamed from: p */
    public static synchronized void m13965p(@NonNull Application application, @NonNull String str, @NonNull String str2, @Nullable Map<String, Object> map) throws HelpshiftInstallException, UnsupportedOSVersionException {
        synchronized (Helpshift.class) {
            if (HSContext.f116783C.get()) {
                HSLogger.m65441d("Helpshift", "Helpshift is already initialized !");
                return;
            }
            SchemaUtil.m18242b(str2, str);
            String trim = str2.trim();
            String trim2 = str.trim();
            Map<String, Object> m13996a = HSInstallHelper.m13996a(map);
            Object obj = m13996a.get("isForChina");
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                SdkURLs.m18240a("webchat.hsftcn.cn", "media.hsftcn.cn");
            }
            HSContext.m2749v(application);
            HSContext m2757n = HSContext.m2757n();
            m2757n.m2758m().m3277f(new RunnableC38870m(m2757n, application, m13996a));
            m2757n.m2758m().m3278e(new RunnableC38871n(m2757n, trim2, trim, application, m13996a, map));
            HSContext.f116783C.compareAndSet(false, true);
        }
    }

    /* renamed from: q */
    public static void m13964q(String str) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "leaveBreadCrumb() is called with action: " + str);
        if (C37383m.m18236d(str)) {
            return;
        }
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38858a(m2757n, str));
    }

    /* renamed from: r */
    public static boolean m13963r(Map<String, String> map) {
        if (C37383m.m18235e(map) || !HSContext.m2771H()) {
            return false;
        }
        HashMap hashMap = new HashMap(map);
        if (!C37383m.m18228l((String) hashMap.get("userId"), (String) hashMap.get("userEmail"))) {
            HSLogger.m65439e("Helpshift", "userId/userEmail validation failed, skipping login.");
            return false;
        }
        C37383m.m18229k(hashMap);
        HSLogger.m65441d("Helpshift", "Logging in the user: " + hashMap);
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38860c(m2757n, hashMap));
        return true;
    }

    /* renamed from: s */
    public static void m13962s() {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "Logging out the user");
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38861d(m2757n));
    }

    /* renamed from: t */
    public static void m13961t(String str) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "Registering push token, token is empty?- " + C37383m.m18236d(str));
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38863f(m2757n, str));
    }

    /* renamed from: u */
    public static void m13960u(boolean z) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "requestUnreadMessageCount is called with shouldFetchFromServer = " + z);
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38866i(z, m2757n));
    }

    /* renamed from: v */
    public static void m13959v(Map<String, Object> map) {
        HashMap hashMap;
        HSContext m2757n = HSContext.m2757n();
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        if (hashMap.containsKey("customIssueFields") && !hashMap.containsKey("cifs")) {
            hashMap.put("cifs", hashMap.remove("customIssueFields"));
        }
        hashMap.put("enableLogging", Boolean.valueOf(m2757n.m2746y()));
        m2757n.m2766e().m3077C(hashMap);
    }

    /* renamed from: w */
    public static void m13958w(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        HSContext.m2757n().m2766e().m3074F(map);
    }

    /* renamed from: x */
    public static void m13957x(HelpshiftEventsListener helpshiftEventsListener) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "setHelpshiftEventsListener() is called: " + helpshiftEventsListener);
        HSContext.m2757n().m2758m().m3278e(new RunnableC38867j(helpshiftEventsListener));
    }

    /* renamed from: y */
    public static void m13956y(HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "setHelpshiftProactiveConfigCollector() is called.");
        HSContext.m2757n().m2758m().m3278e(new RunnableC38869l(helpshiftProactiveAPIConfigCollector));
    }

    /* renamed from: z */
    public static void m13955z(String str) {
        if (!HSContext.m2771H()) {
            return;
        }
        HSLogger.m65441d("Helpshift", "setLanguage() is called for language - " + str);
        HSContext m2757n = HSContext.m2757n();
        m2757n.m2758m().m3278e(new RunnableC38862e(m2757n, str));
    }
}
