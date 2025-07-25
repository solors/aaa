package p1007v3;

import android.content.Context;
import p005a4.AppsflyerAnalyze;
import p005a4.AppsflyerCallback;
import p005a4.FacebookAnalyze;
import p005a4.FirebaseAnalyze;
import p005a4.LearningsAnalyze;
import p992u3.LogLevel;

/* renamed from: v3.d */
/* loaded from: classes6.dex */
public class AnalyzeParams {

    /* renamed from: a */
    private final C44497b f116831a;

    /* compiled from: AnalyzeParams.java */
    /* renamed from: v3.d$b */
    /* loaded from: classes6.dex */
    public static class C44497b {

        /* renamed from: a */
        private final Context f116832a;

        /* renamed from: b */
        private boolean f116833b;

        /* renamed from: c */
        private String f116834c;

        /* renamed from: d */
        private String f116835d;

        /* renamed from: e */
        private String f116836e;

        /* renamed from: f */
        private String f116837f;

        /* renamed from: g */
        private String f116838g;

        /* renamed from: h */
        private IAnalyze[] f116839h;

        /* renamed from: i */
        private AppsflyerCallback f116840i;

        /* renamed from: j */
        private LogLevel f116841j = LogLevel.SILENCE;

        public C44497b(Context context) {
            this.f116832a = context;
        }

        /* renamed from: e */
        public AnalyzeParams m2706e() {
            FacebookAnalyze facebookAnalyze = new FacebookAnalyze(this.f116832a);
            FirebaseAnalyze firebaseAnalyze = new FirebaseAnalyze(this.f116832a);
            LearningsAnalyze learningsAnalyze = new LearningsAnalyze(this.f116832a, this.f116834c, this.f116835d, this.f116836e, this.f116838g, this.f116833b, this.f116841j);
            this.f116839h = new IAnalyze[]{learningsAnalyze, firebaseAnalyze, facebookAnalyze, new AppsflyerAnalyze(this.f116832a, new IAnalyze[]{firebaseAnalyze, learningsAnalyze}, this.f116840i, this.f116837f)};
            return new AnalyzeParams(this);
        }

        /* renamed from: f */
        public C44497b m2705f(String str) {
            this.f116837f = str;
            return this;
        }

        /* renamed from: g */
        public C44497b m2704g(AppsflyerCallback appsflyerCallback) {
            this.f116840i = appsflyerCallback;
            return this;
        }

        /* renamed from: h */
        public C44497b m2703h(boolean z) {
            this.f116833b = z;
            return this;
        }

        /* renamed from: i */
        public C44497b m2702i(String str) {
            this.f116834c = str;
            return this;
        }

        /* renamed from: j */
        public C44497b m2701j(LogLevel logLevel) {
            this.f116841j = logLevel;
            return this;
        }

        /* renamed from: k */
        public C44497b m2700k(String str) {
            this.f116836e = str;
            return this;
        }

        /* renamed from: l */
        public C44497b m2699l(String str) {
            this.f116835d = str;
            return this;
        }

        /* renamed from: m */
        public C44497b m2698m(String str) {
            this.f116838g = str;
            return this;
        }
    }

    /* renamed from: a */
    public IAnalyze[] m2714a() {
        return this.f116831a.f116839h;
    }

    /* renamed from: b */
    public Context m2713b() {
        return this.f116831a.f116832a;
    }

    /* renamed from: c */
    public LogLevel m2712c() {
        return this.f116831a.f116841j;
    }

    /* renamed from: d */
    public boolean m2711d() {
        return this.f116831a.f116833b;
    }

    private AnalyzeParams(C44497b c44497b) {
        this.f116831a = c44497b;
    }
}
