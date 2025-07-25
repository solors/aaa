package p1035x2;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.helpshift.log.HSLogger;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import p856r2.HelpshiftResourceCacheManager;
import p977t2.HSThreadingService;
import p991u2.HSConfigManager;

/* renamed from: x2.a */
/* loaded from: classes5.dex */
public class HSHelpcenterEventsHandler {

    /* renamed from: a */
    private WeakReference<HelpcenterToUiCallback> f117381a;

    /* renamed from: b */
    private HSConfigManager f117382b;

    /* renamed from: c */
    private HSThreadingService f117383c;

    /* renamed from: d */
    private HelpshiftResourceCacheManager f117384d;

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$a */
    /* loaded from: classes5.dex */
    class RunnableC44693a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f117385b;

        RunnableC44693a(String str) {
            this.f117385b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONArray jSONArray = new JSONArray(this.f117385b);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getJSONObject(i).getString(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE);
                    HSLogger.m65441d("HSHelpcenterEventsHandler", "Received action type " + string);
                    if ("clearUserTrail".equalsIgnoreCase(string)) {
                        HSHelpcenterEventsHandler.this.f117382b.m3058j();
                    }
                }
            } catch (JSONException e) {
                HSLogger.m65438e("HSHelpcenterEventsHandler", "Error in reading action type content ", e);
            }
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$b */
    /* loaded from: classes5.dex */
    class RunnableC44694b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f117387b;

        RunnableC44694b(String str) {
            this.f117387b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSHelpcenterEventsHandler.this.f117382b.m3069K(this.f117387b);
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$c */
    /* loaded from: classes5.dex */
    class RunnableC44695c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f117389b;

        RunnableC44695c(String str) {
            this.f117389b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSHelpcenterEventsHandler.this.f117382b.m3079A(this.f117389b);
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$d */
    /* loaded from: classes5.dex */
    class RunnableC44696d implements Runnable {
        RunnableC44696d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpcenterToUiCallback helpcenterToUiCallback = (HelpcenterToUiCallback) HSHelpcenterEventsHandler.this.f117381a.get();
            if (helpcenterToUiCallback != null) {
                helpcenterToUiCallback.closeHelpcenter();
            }
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$e */
    /* loaded from: classes5.dex */
    class RunnableC44697e implements Runnable {
        RunnableC44697e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpcenterToUiCallback helpcenterToUiCallback = (HelpcenterToUiCallback) HSHelpcenterEventsHandler.this.f117381a.get();
            if (helpcenterToUiCallback != null) {
                helpcenterToUiCallback.openWebchat();
            }
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$f */
    /* loaded from: classes5.dex */
    class RunnableC44698f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f117393b;

        RunnableC44698f(String str) {
            this.f117393b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpcenterToUiCallback helpcenterToUiCallback = (HelpcenterToUiCallback) HSHelpcenterEventsHandler.this.f117381a.get();
            if (helpcenterToUiCallback != null) {
                helpcenterToUiCallback.mo2034e();
                helpcenterToUiCallback.mo2030r(this.f117393b);
                helpcenterToUiCallback.mo2031q();
            }
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$g */
    /* loaded from: classes5.dex */
    class RunnableC44699g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f117395b;

        RunnableC44699g(String str) {
            this.f117395b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSHelpcenterEventsHandler.this.f117382b.m3071I(this.f117395b);
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$h */
    /* loaded from: classes5.dex */
    class RunnableC44700h implements Runnable {
        RunnableC44700h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpcenterToUiCallback helpcenterToUiCallback = (HelpcenterToUiCallback) HSHelpcenterEventsHandler.this.f117381a.get();
            if (helpcenterToUiCallback != null) {
                helpcenterToUiCallback.mo2033i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$i */
    /* loaded from: classes5.dex */
    public class RunnableC44701i implements Runnable {
        RunnableC44701i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HSHelpcenterEventsHandler.this.f117384d.m12701a();
        }
    }

    /* compiled from: HSHelpcenterEventsHandler.java */
    /* renamed from: x2.a$j */
    /* loaded from: classes5.dex */
    class RunnableC44702j implements Runnable {
        RunnableC44702j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HelpcenterToUiCallback helpcenterToUiCallback = (HelpcenterToUiCallback) HSHelpcenterEventsHandler.this.f117381a.get();
            if (helpcenterToUiCallback != null) {
                helpcenterToUiCallback.mo2032p();
            }
        }
    }

    public HSHelpcenterEventsHandler(HSConfigManager hSConfigManager, HSThreadingService hSThreadingService, HelpshiftResourceCacheManager helpshiftResourceCacheManager) {
        this.f117382b = hSConfigManager;
        this.f117383c = hSThreadingService;
        this.f117384d = helpshiftResourceCacheManager;
    }

    /* renamed from: e */
    private void m2068e() {
        this.f117383c.m3278e(new RunnableC44701i());
    }

    /* renamed from: d */
    public void m2069d() {
        this.f117383c.m3279d(new RunnableC44696d());
    }

    /* renamed from: f */
    public void m2067f() {
        this.f117383c.m3278e(new RunnableC44702j());
    }

    /* renamed from: g */
    public void m2066g(String str) {
        this.f117383c.m3278e(new RunnableC44693a(str));
    }

    /* renamed from: h */
    public void m2065h() {
        m2068e();
        this.f117383c.m3279d(new RunnableC44700h());
    }

    /* renamed from: i */
    public void m2064i(String str) {
        this.f117383c.m3279d(new RunnableC44698f(str));
        this.f117383c.m3278e(new RunnableC44699g(str));
    }

    /* renamed from: j */
    public void m2063j(String str) {
        this.f117383c.m3278e(new RunnableC44695c(str));
    }

    /* renamed from: k */
    public void m2062k(String str) {
        this.f117383c.m3278e(new RunnableC44694b(str));
    }

    /* renamed from: l */
    public void m2061l() {
        this.f117383c.m3279d(new RunnableC44697e());
    }

    /* renamed from: m */
    public void m2060m(HelpcenterToUiCallback helpcenterToUiCallback) {
        this.f117381a = new WeakReference<>(helpcenterToUiCallback);
    }
}
