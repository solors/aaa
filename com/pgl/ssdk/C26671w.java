package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.w */
/* loaded from: classes7.dex */
public class C26671w {

    /* renamed from: a */
    private static int f69973a = 0;

    /* renamed from: b */
    private static int f69974b = 0;

    /* renamed from: c */
    private static int f69975c = 0;

    /* renamed from: d */
    private static int f69976d = 0;

    /* renamed from: e */
    private static int f69977e = 0;

    /* renamed from: f */
    private static int f69978f = 0;

    /* renamed from: g */
    private static boolean f69979g = false;

    /* renamed from: h */
    private static InputManager f69980h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.w$a */
    /* loaded from: classes7.dex */
    public static class RunnableC26672a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f69981a;

        /* renamed from: b */
        final /* synthetic */ int f69982b;

        RunnableC26672a(Context context, int i) {
            this.f69981a = context;
            this.f69982b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isExternal;
            InputManager m40726b = C26671w.m40726b(this.f69981a);
            if (m40726b == null) {
                return;
            }
            InputDevice inputDevice = m40726b.getInputDevice(this.f69982b);
            C26671w.m40720g();
            if (inputDevice == null) {
                C26671w.m40732a();
                C26671w.m40727b();
                C26671w.m40725b("nihc");
            } else if (inputDevice.isVirtual()) {
                C26671w.m40724c();
                C26671w.m40723d();
                C26671w.m40725b("vihc");
            } else if (Build.VERSION.SDK_INT >= 29) {
                isExternal = inputDevice.isExternal();
                if (isExternal) {
                    C26671w.m40722e();
                    C26671w.m40721f();
                    C26671w.m40725b("eihc");
                }
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m40727b() {
        int i = f69978f;
        f69978f = i + 1;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m40724c() {
        int i = f69973a;
        f69973a = i + 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m40723d() {
        int i = f69976d;
        f69976d = i + 1;
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m40722e() {
        int i = f69974b;
        f69974b = i + 1;
        return i;
    }

    /* renamed from: f */
    static /* synthetic */ int m40721f() {
        int i = f69977e;
        f69977e = i + 1;
        return i;
    }

    /* renamed from: g */
    public static void m40720g() {
        if (f69979g) {
            return;
        }
        try {
            SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
            if (m40743a != null) {
                f69978f = m40743a.getInt("nihc", 0);
                f69977e = m40743a.getInt("eihc", 0);
                f69976d = m40743a.getInt("vihc", 0);
                f69979g = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m40732a() {
        int i = f69975c;
        f69975c = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m40725b(String str) {
        try {
            SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
            if (m40743a != null) {
                m40743a.edit().putInt(str, m40743a.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m40730a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            C26652o0.m40800b(new RunnableC26672a(context, motionEvent.getDeviceId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static InputManager m40726b(Context context) {
        if (f69980h == null) {
            f69980h = (InputManager) context.getSystemService("input");
        }
        return f69980h;
    }

    /* renamed from: a */
    public static void m40728a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", f69976d);
            jSONObject.put("eihc", f69977e);
            jSONObject.put("nihc", f69978f);
            jSONObject.put("vic", f69973a);
            jSONObject.put("nic", f69975c);
            jSONObject.put("eic", f69974b);
        } catch (JSONException unused) {
        }
    }
}
