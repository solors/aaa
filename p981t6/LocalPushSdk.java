package p981t6;

import android.app.Application;
import com.meevii.push.local.data.p541db.PushDatabase;
import p030b7.PushWork;
import p1010v6.LocalPushData;
import p1039x6.IDisplayNotification;
import p1039x6.LocalNotificationManager;
import p844q6.DataManager;
import p995u6.AlarmManager;

/* renamed from: t6.e */
/* loaded from: classes5.dex */
public class LocalPushSdk {

    /* renamed from: a */
    public static boolean f116495a;

    /* compiled from: LocalPushSdk.java */
    /* renamed from: t6.e$a */
    /* loaded from: classes5.dex */
    public static class C44361a {

        /* renamed from: a */
        private final Application f116496a;

        /* renamed from: b */
        private Integer f116497b;

        /* renamed from: c */
        private String f116498c;

        /* renamed from: d */
        private IDisplayNotification f116499d;

        private C44361a(Application application) {
            this.f116496a = application;
        }

        /* renamed from: b */
        public static C44361a m3234b(Application application) {
            return new C44361a(application);
        }

        /* renamed from: c */
        public IDisplayNotification m3233c() {
            return this.f116499d;
        }

        /* renamed from: d */
        public Integer m3232d() {
            return this.f116497b;
        }

        /* renamed from: e */
        public String m3231e() {
            return this.f116498c;
        }

        /* renamed from: f */
        public C44361a m3230f(IDisplayNotification iDisplayNotification) {
            this.f116499d = iDisplayNotification;
            return this;
        }

        /* renamed from: g */
        public C44361a m3229g(int i) {
            this.f116497b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C44361a m3228h(String str) {
            this.f116498c = str;
            return this;
        }
    }

    /* renamed from: e */
    public static void m3243e(C44361a c44361a) {
        if (!f116495a) {
            Application application = c44361a.f116496a;
            DataManager.m12928g().m12922m(application);
            PushDatabase.m47913c(application);
            AlarmManager.m2973a().m2972b(application);
            LocalNotificationManager.m1903a().m1900d(c44361a);
            PushWork.m103897b(new Runnable() { // from class: t6.d
                @Override // java.lang.Runnable
                public final void run() {
                    LocalPushSdk.m3242f();
                }
            });
            f116495a = true;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m3242f() {
        AlarmManager.m2973a().m2965i();
        AlarmManager.m2973a().m2967g();
    }

    /* renamed from: g */
    public static /* synthetic */ void m3241g() {
        AlarmManager.m2973a().m2969e();
    }

    /* renamed from: h */
    public static /* synthetic */ void m3240h(String str) {
        AlarmManager.m2973a().m2970d(str);
    }

    /* renamed from: i */
    public static /* synthetic */ void m3239i(LocalPushData localPushData) {
        AlarmManager.m2973a().m2968f(localPushData);
    }

    /* renamed from: j */
    public static void m3238j() {
        PushWork.m103897b(new Runnable() { // from class: t6.a
            @Override // java.lang.Runnable
            public final void run() {
                LocalPushSdk.m3241g();
            }
        });
    }

    /* renamed from: k */
    public static void m3237k(final String str) {
        PushWork.m103897b(new Runnable() { // from class: t6.b
            @Override // java.lang.Runnable
            public final void run() {
                LocalPushSdk.m3240h(str);
            }
        });
    }

    /* renamed from: l */
    public static void m3236l(final LocalPushData localPushData) {
        PushWork.m103897b(new Runnable() { // from class: t6.c
            @Override // java.lang.Runnable
            public final void run() {
                LocalPushSdk.m3239i(localPushData);
            }
        });
    }
}
