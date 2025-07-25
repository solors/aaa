package p1007v3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C21018tj;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p005a4.AnalyzePlatform;
import p027b4.AnalyzeLog;
import p027b4.EncryptUtil;
import p027b4.SharedUtil;
import p1007v3.LearningsIdManager;
import p1020w3.C44574a;
import p1020w3.EventWork;
import p1036x3.InnerAnalyzeManager;
import p858r4.SharedPreferencesManager;
import p992u3.LogLevel;
import p992u3.NetworkUtils;

/* renamed from: v3.c */
/* loaded from: classes6.dex */
public class AnalyzeManager {

    /* renamed from: a */
    private static volatile boolean f116821a = false;

    /* renamed from: b */
    private static volatile String f116822b;

    /* renamed from: c */
    private static volatile String f116823c;

    /* renamed from: d */
    private static String f116824d;

    /* renamed from: e */
    private static ConcurrentHashMap<String, String> f116825e;

    /* renamed from: f */
    private static ConcurrentHashMap<String, String> f116826f;

    /* renamed from: g */
    private static CopyOnWriteArrayList<C44574a> f116827g;

    /* renamed from: h */
    private static HashMap<String, IAnalyze> f116828h;

    /* renamed from: i */
    private static IAnalyze[] f116829i;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: j */
    private static Context f116830j;

    /* renamed from: A */
    private static void m2742A() {
        String m103935b = SharedUtil.m103935b(f116830j, "key_pseudoId", "unset");
        if (!TextUtils.isEmpty(m103935b) && !m103935b.equals("unset")) {
            for (IAnalyze iAnalyze : f116829i) {
                iAnalyze.mo2690c(m103935b);
            }
            return;
        }
        m2726o(3);
    }

    /* renamed from: B */
    public static void m2741B(@NonNull String str, String str2) {
        EventAndPropertyChecker.m2693b(str, str2, 1);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (f116821a) {
            for (IAnalyze iAnalyze : f116829i) {
                iAnalyze.mo2686g(str, str2);
            }
            return;
        }
        AnalyzeLog.m103949a(LogLevel.DEBUG, "AnalyzeManager is not init when setUserProperty. cache it.");
        m2736e(str, str2);
    }

    /* renamed from: c */
    private static void m2738c(C44574a c44574a) {
        if (f116827g == null) {
            f116827g = new CopyOnWriteArrayList<>();
        }
        f116827g.add(c44574a);
    }

    /* renamed from: d */
    private static void m2737d(@NonNull String str, String str2) {
        if (f116826f == null) {
            f116826f = new ConcurrentHashMap<>();
        }
        f116826f.put(str, str2);
    }

    /* renamed from: e */
    private static void m2736e(@NonNull String str, String str2) {
        if (f116825e == null) {
            f116825e = new ConcurrentHashMap<>();
        }
        f116825e.put(str, str2);
    }

    @SafeVarargs
    /* renamed from: f */
    public static void m2735f(Class<? extends Activity>... clsArr) {
        InnerAnalyzeManager.m2018p().m2021m(clsArr);
    }

    /* renamed from: g */
    public static void m2734g(Context context) {
        FirebaseAnalytics.ConsentStatus consentStatus = FirebaseAnalytics.ConsentStatus.GRANTED;
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus);
        hashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        hashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus);
        hashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus);
        FirebaseAnalytics.getInstance(context).setConsent(hashMap);
    }

    /* renamed from: h */
    public static String m2733h(Context context) {
        if (!TextUtils.isEmpty(f116824d)) {
            return f116824d;
        }
        if (context == null) {
            AnalyzeLog.m103949a(LogLevel.WARN, "context is null when getLearningsId");
            return "";
        }
        String m12678e = SharedPreferencesManager.m12681b().m12678e(context, "learnings_analyze", "key_learningsId", "unset");
        if (!TextUtils.equals("unset", m12678e) && !TextUtils.isEmpty(m12678e)) {
            f116824d = m12678e;
            return m12678e;
        }
        String m103935b = SharedUtil.m103935b(context, "key_learningsId", "unset");
        f116824d = m103935b;
        if (TextUtils.equals("unset", m103935b) || TextUtils.isEmpty(f116824d)) {
            f116824d = LearningsIdManager.m2683a(context).f116852c;
        }
        return f116824d;
    }

    /* renamed from: i */
    public static String m2732i(Context context) {
        return UUIDManager.m2681a().m2680b(context);
    }

    /* renamed from: j */
    public static void m2731j(@NonNull AnalyzeParams analyzeParams) {
        f116830j = analyzeParams.m2713b().getApplicationContext();
        InnerAnalyzeManager.m2018p().mo2022k((Application) f116830j);
        AnalyzeLog.m103945e(analyzeParams.m2711d());
        AnalyzeLog.m103944f(analyzeParams.m2712c());
        m2730k(analyzeParams.m2714a());
        m2721t();
        m2719v();
        m2718w();
        m2720u();
        m2725p();
    }

    /* renamed from: k */
    private static void m2730k(IAnalyze... iAnalyzeArr) {
        f116829i = iAnalyzeArr;
        f116828h = new HashMap<>();
        for (IAnalyze iAnalyze : iAnalyzeArr) {
            iAnalyze.init();
            f116828h.put(iAnalyze.mo2684i(), iAnalyze);
        }
        NetworkUtils.m3035f(f116830j);
        m2742A();
        m2716y();
        f116821a = true;
    }

    /* renamed from: l */
    public static /* synthetic */ void m2729l(C44574a c44574a) {
        if (c44574a.m2372f() == null) {
            c44574a.m2367m(new Bundle());
        }
        EventAndPropertyChecker.m2694a(c44574a);
        InnerAnalyzeManager.m2018p().m2015s(c44574a);
        if (FirebaseAnalytics.Event.AD_IMPRESSION.equals(c44574a.m2371g())) {
            m2723r(AnalyzePlatform.f50b.m105878a(), c44574a);
            return;
        }
        AnalyzePlatform[] mo2360h = c44574a.mo2360h();
        int i = 0;
        if (mo2360h != null && mo2360h.length != 0) {
            int length = mo2360h.length;
            while (i < length) {
                m2723r(mo2360h[i].m105878a(), c44574a);
                i++;
            }
        } else if (!TextUtils.isEmpty(c44574a.m2371g()) && c44574a.m2371g().startsWith("grt_")) {
            IAnalyze[] iAnalyzeArr = f116829i;
            int length2 = iAnalyzeArr.length;
            while (i < length2) {
                iAnalyzeArr[i].mo2691b(c44574a);
                i++;
            }
        } else {
            m2723r(AnalyzePlatform.f53e.m105878a(), c44574a);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m2728m(int i, Task task) {
        String str = (String) task.getResult();
        if (task.isSuccessful() && !TextUtils.isEmpty(str)) {
            SharedUtil.m103932e(f116830j, "key_pseudoId", str);
            for (IAnalyze iAnalyze : f116829i) {
                iAnalyze.mo2690c(str);
            }
            return;
        }
        new C44574a.C44575a("pseudo_get_fail").m2364c(AnalyzePlatform.f53e).m2366a().mo2359k();
        m2726o(i - 1);
    }

    /* renamed from: n */
    private static void m2727n(@NonNull final C44574a c44574a) {
        EventWork.m2361b(new Runnable() { // from class: v3.b
            @Override // java.lang.Runnable
            public final void run() {
                AnalyzeManager.m2729l(c44574a);
            }
        });
    }

    /* renamed from: o */
    private static void m2726o(final int i) {
        if (i <= 0) {
            return;
        }
        FirebaseAnalytics.getInstance(f116830j).getAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: v3.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AnalyzeManager.m2728m(i, task);
            }
        });
    }

    /* renamed from: p */
    private static void m2725p() {
        CopyOnWriteArrayList<C44574a> copyOnWriteArrayList = f116827g;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            while (!f116827g.isEmpty()) {
                m2727n(f116827g.remove(0));
            }
        }
    }

    /* renamed from: q */
    public static void m2724q(@NonNull C44574a c44574a) {
        InnerAnalyzeManager.m2018p().m2020n(c44574a);
        if (f116821a) {
            m2727n(c44574a);
            return;
        }
        AnalyzeLog.m103949a(LogLevel.DEBUG, "AnalyzeManager is not init when sendEvent. cache it.");
        m2738c(c44574a);
    }

    /* renamed from: r */
    private static void m2723r(String str, C44574a c44574a) {
        IAnalyze iAnalyze = f116828h.get(str);
        if (iAnalyze != null) {
            iAnalyze.mo2691b(c44574a);
            return;
        }
        LogLevel logLevel = LogLevel.WARN;
        AnalyzeLog.m103949a(logLevel, "platform:" + str + " not support. current support platform:" + Arrays.toString((String[]) f116828h.keySet().toArray(new String[f116828h.size()])));
    }

    /* renamed from: s */
    public static void m2722s(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f116821a) {
            IAnalyze iAnalyze = f116828h.get(AnalyzePlatform.f53e.m105878a());
            if (iAnalyze != null) {
                iAnalyze.mo2689d(str);
            }
            IAnalyze iAnalyze2 = f116828h.get(AnalyzePlatform.f50b.m105878a());
            if (iAnalyze2 != null) {
                iAnalyze2.mo2689d(str);
                return;
            }
            return;
        }
        f116823c = str;
        AnalyzeLog.m103949a(LogLevel.DEBUG, "AnalyzeManager is not init when setAccountId. cache it.");
    }

    /* renamed from: t */
    private static void m2721t() {
        if (TextUtils.isEmpty(f116823c)) {
            return;
        }
        m2722s(f116823c);
        f116823c = "";
    }

    /* renamed from: u */
    private static void m2720u() {
        ConcurrentHashMap<String, String> concurrentHashMap = f116826f;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            for (Map.Entry<String, String> entry : f116826f.entrySet()) {
                m2717x(entry.getKey(), entry.getValue());
            }
            f116826f.clear();
        }
    }

    /* renamed from: v */
    private static void m2719v() {
        if (TextUtils.isEmpty(f116822b)) {
            return;
        }
        m2715z(f116822b);
        f116822b = "";
    }

    /* renamed from: w */
    private static void m2718w() {
        ConcurrentHashMap<String, String> concurrentHashMap = f116825e;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            for (Map.Entry<String, String> entry : f116825e.entrySet()) {
                m2741B(entry.getKey(), entry.getValue());
            }
            f116825e.clear();
        }
    }

    /* renamed from: x */
    public static void m2717x(@NonNull String str, String str2) {
        EventAndPropertyChecker.m2693b(str, str2, 2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (f116821a) {
            if (TextUtils.equals("learnings_user_tags", str)) {
                IAnalyze iAnalyze = f116828h.get(AnalyzePlatform.f53e.m105878a());
                if (iAnalyze != null) {
                    iAnalyze.mo2687f(str, str2);
                    return;
                }
                return;
            }
            for (IAnalyze iAnalyze2 : f116829i) {
                iAnalyze2.mo2687f(str, str2);
            }
            return;
        }
        m2737d(str, str2);
        AnalyzeLog.m103949a(LogLevel.DEBUG, "AnalyzeManager is not init when setEventProperty. cache it.");
    }

    /* renamed from: y */
    private static void m2716y() {
        String str;
        String m103935b = SharedUtil.m103935b(f116830j, "key_learningsId", "unset");
        String m12678e = SharedPreferencesManager.m12681b().m12678e(f116830j, "learnings_analyze", "key_learningsId", "unset");
        if (TextUtils.equals("unset", m103935b)) {
            LearningsIdManager.C44499b m2683a = LearningsIdManager.m2683a(f116830j);
            AnalyzeLog.m103949a(LogLevel.DEBUG, "create learningsIdInfo = " + m2683a);
            if (TextUtils.equals("unset", m12678e)) {
                str = m2683a.f116852c;
                SharedUtil.m103932e(f116830j, "key_learningsId", str);
                SharedPreferencesManager.m12681b().m12675h(f116830j, "learnings_analyze", "key_learningsId", str);
            } else {
                SharedUtil.m103932e(f116830j, "key_learningsId", m12678e);
                str = m12678e;
            }
            Bundle bundle = new Bundle();
            bundle.putString(CommonUrlParts.UUID, UUIDManager.m2681a().m2680b(f116830j));
            bundle.putString("first_install_time", String.valueOf(m2683a.f116850a));
            bundle.putString(C21018tj.f53565b, EncryptUtil.m103939a(m2683a.f116851b, String.valueOf(m2683a.f116850a)));
            bundle.putString("learnings_id", str);
            C44574a m2366a = new C44574a.C44575a("learnings_id_create").m2364c(AnalyzePlatform.f53e).m2366a();
            m2366a.m2367m(bundle);
            m2366a.mo2359k();
            m103935b = str;
        } else if (TextUtils.equals("unset", m12678e)) {
            SharedPreferencesManager.m12681b().m12675h(f116830j, "learnings_analyze", "key_learningsId", m103935b);
        } else {
            SharedUtil.m103932e(f116830j, "key_learningsId", m12678e);
            m103935b = m12678e;
        }
        for (IAnalyze iAnalyze : f116829i) {
            iAnalyze.mo2685h(m103935b);
        }
    }

    /* renamed from: z */
    public static void m2715z(@NonNull String str) {
        if (f116821a) {
            for (IAnalyze iAnalyze : f116829i) {
                iAnalyze.mo2692a(str);
            }
            return;
        }
        f116822b = str;
        AnalyzeLog.m103949a(LogLevel.DEBUG, "AnalyzeManager is not init when setLuid. cache it.");
    }
}
