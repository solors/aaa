package com.apm.insight.runtime.p131a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.amazon.p047a.p048a.p059h.Metric;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.DateUtils;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.b */
/* loaded from: classes2.dex */
public class ActivityDataManager {

    /* renamed from: a */
    private static boolean f3991a = true;

    /* renamed from: b */
    private static boolean f3992b = false;

    /* renamed from: c */
    private static boolean f3993c = false;

    /* renamed from: d */
    private static int f3994d = 1;

    /* renamed from: e */
    private static boolean f3995e = false;

    /* renamed from: f */
    private static long f3996f = -1;

    /* renamed from: z */
    private static volatile ActivityDataManager f3997z;

    /* renamed from: B */
    private int f3999B;

    /* renamed from: g */
    private Application f4000g;

    /* renamed from: h */
    private Context f4001h;

    /* renamed from: n */
    private String f4007n;

    /* renamed from: o */
    private long f4008o;

    /* renamed from: p */
    private String f4009p;

    /* renamed from: q */
    private long f4010q;

    /* renamed from: r */
    private String f4011r;

    /* renamed from: s */
    private long f4012s;

    /* renamed from: t */
    private String f4013t;

    /* renamed from: u */
    private long f4014u;

    /* renamed from: v */
    private String f4015v;

    /* renamed from: w */
    private long f4016w;

    /* renamed from: i */
    private List<String> f4002i = new ArrayList();

    /* renamed from: j */
    private List<Long> f4003j = new ArrayList();

    /* renamed from: k */
    private List<String> f4004k = new ArrayList();

    /* renamed from: l */
    private List<Long> f4005l = new ArrayList();

    /* renamed from: m */
    private LinkedList<C3846a> f4006m = new LinkedList<>();

    /* renamed from: x */
    private boolean f4017x = false;

    /* renamed from: y */
    private long f4018y = -1;

    /* renamed from: A */
    private int f3998A = 50;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityDataManager.java */
    /* renamed from: com.apm.insight.runtime.a.b$a */
    /* loaded from: classes2.dex */
    public static class C3846a {

        /* renamed from: a */
        String f4020a;

        /* renamed from: b */
        String f4021b;

        /* renamed from: c */
        long f4022c;

        C3846a(String str, String str2, long j) {
            this.f4021b = str2;
            this.f4022c = j;
            this.f4020a = str;
        }

        public final String toString() {
            return DateUtils.m101749a().format(new Date(this.f4022c)) + " : " + this.f4020a + ' ' + this.f4021b;
        }
    }

    private ActivityDataManager(@NonNull Application application) {
        this.f4001h = application;
        this.f4000g = application;
        if (application != null) {
            try {
                this.f4000g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        boolean z;
                        ActivityDataManager.this.f4007n = activity.getClass().getName();
                        ActivityDataManager.this.f4008o = System.currentTimeMillis();
                        if (bundle != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean unused = ActivityDataManager.f3992b = z;
                        boolean unused2 = ActivityDataManager.f3993c = true;
                        ActivityDataManager.this.f4002i.add(ActivityDataManager.this.f4007n);
                        ActivityDataManager.this.f4003j.add(Long.valueOf(ActivityDataManager.this.f4008o));
                        ActivityDataManager activityDataManager = ActivityDataManager.this;
                        ActivityDataManager.m101496a(activityDataManager, activityDataManager.f4007n, ActivityDataManager.this.f4008o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int indexOf = ActivityDataManager.this.f4002i.indexOf(name);
                        if (indexOf >= 0 && indexOf < ActivityDataManager.this.f4002i.size()) {
                            ActivityDataManager.this.f4002i.remove(indexOf);
                            ActivityDataManager.this.f4003j.remove(indexOf);
                        }
                        ActivityDataManager.this.f4004k.add(name);
                        long currentTimeMillis = System.currentTimeMillis();
                        ActivityDataManager.this.f4005l.add(Long.valueOf(currentTimeMillis));
                        ActivityDataManager.m101496a(ActivityDataManager.this, name, currentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        ActivityDataManager.this.f4013t = activity.getClass().getName();
                        ActivityDataManager.this.f4014u = System.currentTimeMillis();
                        ActivityDataManager.m101461l(ActivityDataManager.this);
                        if (ActivityDataManager.this.f3999B == 0) {
                            ActivityDataManager.this.f4017x = false;
                            boolean unused = ActivityDataManager.f3993c = false;
                            ActivityDataManager.this.f4018y = SystemClock.uptimeMillis();
                        } else if (ActivityDataManager.this.f3999B < 0) {
                            ActivityDataManager.m101457n(ActivityDataManager.this);
                            ActivityDataManager.this.f4017x = false;
                            boolean unused2 = ActivityDataManager.f3993c = false;
                            ActivityDataManager.this.f4018y = SystemClock.uptimeMillis();
                        }
                        ActivityDataManager activityDataManager = ActivityDataManager.this;
                        ActivityDataManager.m101496a(activityDataManager, activityDataManager.f4013t, ActivityDataManager.this.f4014u, C21114v8.C21122h.f54092t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        ActivityDataManager.this.f4011r = activity.getClass().getName();
                        ActivityDataManager.this.f4012s = System.currentTimeMillis();
                        ActivityDataManager.m101471g(ActivityDataManager.this);
                        if (!ActivityDataManager.this.f4017x) {
                            if (ActivityDataManager.f3991a) {
                                ActivityDataManager.m101464k();
                                int unused = ActivityDataManager.f3994d = 1;
                                long unused2 = ActivityDataManager.f3996f = ActivityDataManager.this.f4012s;
                            }
                            if (!ActivityDataManager.this.f4011r.equals(ActivityDataManager.this.f4013t)) {
                                return;
                            }
                            if (ActivityDataManager.f3993c && !ActivityDataManager.f3992b) {
                                int unused3 = ActivityDataManager.f3994d = 4;
                                long unused4 = ActivityDataManager.f3996f = ActivityDataManager.this.f4012s;
                                return;
                            } else if (!ActivityDataManager.f3993c) {
                                int unused5 = ActivityDataManager.f3994d = 3;
                                long unused6 = ActivityDataManager.f3996f = ActivityDataManager.this.f4012s;
                                return;
                            }
                        }
                        ActivityDataManager.this.f4017x = true;
                        ActivityDataManager activityDataManager = ActivityDataManager.this;
                        ActivityDataManager.m101496a(activityDataManager, activityDataManager.f4011r, ActivityDataManager.this.f4012s, C21114v8.C21122h.f54094u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        ActivityDataManager.this.f4009p = activity.getClass().getName();
                        ActivityDataManager.this.f4010q = System.currentTimeMillis();
                        ActivityDataManager activityDataManager = ActivityDataManager.this;
                        ActivityDataManager.m101496a(activityDataManager, activityDataManager.f4009p, ActivityDataManager.this.f4010q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        ActivityDataManager.this.f4015v = activity.getClass().getName();
                        ActivityDataManager.this.f4016w = System.currentTimeMillis();
                        ActivityDataManager activityDataManager = ActivityDataManager.this;
                        ActivityDataManager.m101496a(activityDataManager, activityDataManager.f4015v, ActivityDataManager.this.f4016w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ int m101471g(ActivityDataManager activityDataManager) {
        int i = activityDataManager.f3999B;
        activityDataManager.f3999B = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m101461l(ActivityDataManager activityDataManager) {
        int i = activityDataManager.f3999B;
        activityDataManager.f3999B = i - 1;
        return i;
    }

    /* renamed from: n */
    static /* synthetic */ int m101457n(ActivityDataManager activityDataManager) {
        activityDataManager.f3999B = 0;
        return 0;
    }

    /* renamed from: k */
    static /* synthetic */ boolean m101464k() {
        f3991a = false;
        return false;
    }

    /* renamed from: n */
    private JSONArray m101458n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f4002i;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f4002i.size(); i++) {
                try {
                    jSONArray.put(m101494a(this.f4002i.get(i), this.f4003j.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: o */
    private JSONArray m101456o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f4004k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f4004k.size(); i++) {
                try {
                    jSONArray.put(m101494a(this.f4004k.get(i), this.f4005l.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: g */
    public final JSONObject m101472g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m101494a(this.f4007n, this.f4008o));
            jSONObject.put("last_start_activity", m101494a(this.f4009p, this.f4010q));
            jSONObject.put("last_resume_activity", m101494a(this.f4011r, this.f4012s));
            jSONObject.put("last_pause_activity", m101494a(this.f4013t, this.f4014u));
            jSONObject.put("last_stop_activity", m101494a(this.f4015v, this.f4016w));
            jSONObject.put("alive_activities", m101458n());
            jSONObject.put("finish_activities", m101456o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* renamed from: h */
    public final String m101470h() {
        return String.valueOf(this.f4011r);
    }

    /* renamed from: i */
    public final JSONArray m101468i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f4006m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C3846a) it.next()).toString());
        }
        return jSONArray;
    }

    /* renamed from: f */
    public final boolean m101475f() {
        return this.f4017x;
    }

    /* renamed from: c */
    public static long m101487c() {
        return f3996f;
    }

    /* renamed from: d */
    public static ActivityDataManager m101483d() {
        if (f3997z == null) {
            synchronized (ActivityDataManager.class) {
                if (f3997z == null) {
                    f3997z = new ActivityDataManager(NpthBus.m102010h());
                }
            }
        }
        return f3997z;
    }

    /* renamed from: e */
    public final long m101479e() {
        return SystemClock.uptimeMillis() - this.f4018y;
    }

    /* renamed from: b */
    public static int m101492b() {
        int i = f3994d;
        return i == 1 ? f3995e ? 2 : 1 : i;
    }

    /* renamed from: a */
    public static void m101502a() {
        f3995e = true;
    }

    /* renamed from: a */
    private static JSONObject m101494a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put(Metric.f2405b, j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static /* synthetic */ void m101496a(ActivityDataManager activityDataManager, String str, long j, String str2) {
        C3846a c3846a;
        try {
            if (activityDataManager.f4006m.size() >= activityDataManager.f3998A) {
                c3846a = activityDataManager.f4006m.poll();
                if (c3846a != null) {
                    activityDataManager.f4006m.add(c3846a);
                }
            } else {
                c3846a = null;
            }
            if (c3846a == null) {
                c3846a = new C3846a(str, str2, j);
                activityDataManager.f4006m.add(c3846a);
            }
            c3846a.f4021b = str2;
            c3846a.f4020a = str;
            c3846a.f4022c = j;
        } catch (Throwable unused) {
        }
    }
}
