package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C21114v8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.i9 */
/* loaded from: classes6.dex */
public class C20086i9 {

    /* renamed from: k */
    private static final String f50545k = "1.0.6";

    /* renamed from: l */
    public static String f50546l = "";

    /* renamed from: a */
    private final InterfaceC19697ce f50547a;

    /* renamed from: b */
    private String f50548b;

    /* renamed from: c */
    private String f50549c;

    /* renamed from: d */
    private String f50550d;

    /* renamed from: e */
    private String f50551e;

    /* renamed from: f */
    private ContextProvider f50552f;

    /* renamed from: g */
    public Thread.UncaughtExceptionHandler f50553g;

    /* renamed from: h */
    public String f50554h;

    /* renamed from: i */
    private String f50555i;

    /* renamed from: j */
    private boolean f50556j;

    /* renamed from: com.ironsource.i9$b */
    /* loaded from: classes6.dex */
    class RunnableC20088b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f50558a;

        /* renamed from: b */
        final /* synthetic */ String f50559b;

        RunnableC20088b(Context context, String str) {
            this.f50558a = context;
            this.f50559b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String mo57120p = C20086i9.this.f50547a.mo57120p(this.f50558a);
                if (!TextUtils.isEmpty(mo57120p)) {
                    C20086i9.this.f50549c = mo57120p;
                }
                String mo57157a = C20086i9.this.f50547a.mo57157a(this.f50558a);
                if (!TextUtils.isEmpty(mo57157a)) {
                    C20086i9.this.f50551e = mo57157a;
                }
                SharedPreferences.Editor edit = this.f50558a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", C20086i9.this.f50549c);
                edit.putString("sId", this.f50559b);
                edit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.i9$c */
    /* loaded from: classes6.dex */
    public class C20089c extends RunnableC20142j9 {
        C20089c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.ironsource.i9$d */
    /* loaded from: classes6.dex */
    public static class C20090d {

        /* renamed from: a */
        static volatile C20086i9 f50562a = new C20086i9(null);

        private C20090d() {
        }
    }

    private C20086i9() {
        this.f50556j = false;
        this.f50547a = C19821el.m58797N().mo57096f();
        this.f50552f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f50553g = defaultUncaughtExceptionHandler;
        this.f50555i = " ";
        this.f50554h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C19965g9(defaultUncaughtExceptionHandler));
    }

    /* renamed from: c */
    static List<C21173wb> m57998c() {
        return null;
    }

    /* renamed from: d */
    public static C20086i9 m57997d() {
        return C20090d.f50562a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Context m58008a() {
        return this.f50552f.getApplicationContext();
    }

    /* renamed from: b */
    public String m58001b() {
        return f50545k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m57996e() {
        return this.f50555i;
    }

    /* synthetic */ C20086i9(C20087a c20087a) {
        this();
    }

    /* renamed from: a */
    private String m58007a(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                return networkCapabilities.hasTransport(1) ? C20747r8.f52730b : networkCapabilities.hasTransport(0) ? C20747r8.f52735g : "none";
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
                return "none";
            }
        }
        return "none";
    }

    /* renamed from: a */
    private void m58006a(Context context, HashSet<String> hashSet) {
        String m58007a = m58007a(m58008a());
        if (m58007a.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f50549c);
        String string2 = sharedPreferences.getString("sId", this.f50550d);
        List<C21173wb> m55371b = C20794s9.m55371b();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("reportList size " + m55371b.size());
        for (C21173wb c21173wb : m55371b) {
            JSONObject jSONObject = new JSONObject();
            String m54358b = c21173wb.m54358b();
            String m54355e = c21173wb.m54355e();
            String m54356d = c21173wb.m54356d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("crashDate", m54358b);
                jSONObject2.put("stacktraceCrash", m54355e);
                jSONObject2.put("crashType", m54356d);
                jSONObject2.put("CrashReporterVersion", f50545k);
                jSONObject2.put(C21114v8.C21123i.f54163q, "8.4.0");
                jSONObject2.put(C21114v8.C21123i.f54172x, this.f50547a.mo57150b(context));
                jSONObject2.put("appVersion", C21109v3.m54522b(context, packageName));
                jSONObject2.put(C21114v8.C21123i.f54157n, this.f50547a.mo57123o());
                jSONObject2.put("network", m58007a);
                jSONObject2.put(C21114v8.C21123i.f54161p, this.f50547a.mo57131k());
                jSONObject2.put(C21114v8.C21123i.f54153l, this.f50547a.mo57143e());
                jSONObject2.put("deviceOS", this.f50547a.mo57129l());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(C21114v8.C21123i.f54151k, this.f50547a.mo57139g());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f50551e)) {
                    jSONObject2.put(C21114v8.C21123i.f54118M, Boolean.parseBoolean(this.f50551e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e) {
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new C20089c(jSONObject)).start();
            }
        }
        C20794s9.m55374a();
    }

    /* renamed from: a */
    public void m58003a(Throwable th) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isInitialized=" + this.f50556j);
        if (!this.f50556j || th == null) {
            return;
        }
        String m58220b = new C20038h9(th).m58220b();
        new C21173wb(m58220b, "" + System.currentTimeMillis(), "Caught_IS_Crash").m54359a();
    }

    /* renamed from: a */
    public void m58002a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f50552f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f50555i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f50554h = str;
            }
            this.f50550d = str3;
            if (z) {
                new C19559a(i).m59497a(z2).m59494b(true).m59500a(new C20087a()).start();
            }
            m58006a(applicationContext, hashSet);
            new Thread(new RunnableC20088b(applicationContext, str3)).start();
        }
        this.f50556j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    /* renamed from: com.ironsource.i9$a */
    /* loaded from: classes6.dex */
    class C20087a implements InterfaceC19608b {
        C20087a() {
        }

        @Override // com.ironsource.InterfaceC19608b
        /* renamed from: a */
        public void mo57995a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" ");
                    sb2.append("(");
                    sb2.append(thread.getState().toString());
                    sb2.append(")");
                    sb2.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            C20086i9.f50546l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC19608b
        /* renamed from: b */
        public void mo57994b() {
        }
    }
}
