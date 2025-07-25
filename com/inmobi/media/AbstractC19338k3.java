package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import be.MathJVM;
import com.inmobi.media.AbstractC19338k3;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.k3 */
/* loaded from: classes6.dex */
public abstract class AbstractC19338k3 {

    /* renamed from: c */
    public static String f48432c;

    /* renamed from: f */
    public static JSONObject f48435f;

    /* renamed from: g */
    public static Integer f48436g;

    /* renamed from: h */
    public static Float f48437h;

    /* renamed from: a */
    public static final C19352l3 f48430a = new C19352l3(0, 2.0f, 0);

    /* renamed from: b */
    public static final C19324j3 f48431b = new C19324j3(0, 0);

    /* renamed from: d */
    public static float f48433d = -1.0f;

    /* renamed from: e */
    public static boolean f48434e = true;

    /* renamed from: i */
    public static final boolean f48438i = C19212b3.f48088a.m60439x();

    /* renamed from: a */
    public static String m60141a() {
        Display m60139a;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null || (m60139a = m60139a(m61068d)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m60139a.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append('x');
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: b */
    public static float m60132b() {
        Display m60139a;
        if (f48433d == -1.0f) {
            Context m61068d = C18954Ha.m61068d();
            if (m61068d == null || (m60139a = m60139a(m61068d)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            m60139a.getMetrics(displayMetrics);
            float f = displayMetrics.density;
            if (f == 0.0f) {
                return 2.0f;
            }
            f48433d = f;
        }
        return f48433d;
    }

    /* renamed from: c */
    public static HashMap m60129c() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(m60132b()));
            C19352l3 m60127d = m60127d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m60127d.f48459a);
            sb2.append('X');
            sb2.append(m60127d.f48460b);
            hashMap.put("d-device-screen-size", sb2.toString());
            hashMap.put("d-density-dependent-screen-size", m60141a());
            hashMap.put("d-orientation", String.valueOf((int) m60124g()));
            Float f = f48437h;
            hashMap.put("d-textsize", String.valueOf(f != null ? f.floatValue() : 37.0f));
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("k3", "TAG");
        }
        return hashMap;
    }

    /* renamed from: d */
    public static C19352l3 m60127d() {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return f48430a;
        }
        Display m60139a = m60139a(m61068d);
        if (m60139a == null) {
            return f48430a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m60139a.getMetrics(displayMetrics);
        float f = displayMetrics.density;
        return new C19352l3((int) (displayMetrics.widthPixels / f), f, (int) (displayMetrics.heightPixels / f));
    }

    /* renamed from: e */
    public static String m60126e() {
        String str = null;
        if (f48434e) {
            return null;
        }
        String str2 = f48432c;
        if (str2 != null) {
            return str2;
        }
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "display_info_store");
            Intrinsics.checkNotNullParameter("gesture_margin", "key");
            str = m59823a.f48820a.getString("gesture_margin", null);
        }
        f48432c = str;
        return str;
    }

    /* renamed from: f */
    public static Integer m60125f() {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return null;
        }
        int i = Settings.Secure.getInt(m61068d.getContentResolver(), "navigation_mode", -1);
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: g */
    public static byte m60124g() {
        Display m60139a;
        int rotation;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null || (m60139a = m60139a(m61068d)) == null || (rotation = m60139a.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation != 3) {
            Intrinsics.checkNotNullExpressionValue("k3", "TAG");
            return (byte) 1;
        }
        return (byte) 4;
    }

    /* renamed from: h */
    public static C19352l3 m60123h() {
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return f48430a;
        }
        Display m60139a = m60139a(m61068d);
        if (m60139a == null) {
            return f48430a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m60139a.getRealMetrics(displayMetrics);
        float f = displayMetrics.density;
        return new C19352l3((int) (displayMetrics.widthPixels / f), f, (int) (displayMetrics.heightPixels / f));
    }

    /* renamed from: b */
    public static final void m60130b(WindowInsets insets, Context context) {
        Insets systemGestureInsets;
        String insets2;
        Intrinsics.checkNotNullParameter(insets, "$insets");
        try {
            systemGestureInsets = insets.getSystemGestureInsets();
            insets2 = systemGestureInsets.toString();
            Intrinsics.checkNotNullExpressionValue(insets2, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").m16763h(insets2, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(",").m16763h(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i = 0; i < length; i++) {
                    String[] strArr3 = (String[]) new Regex("=").m16763h(strArr2[i], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append('\"' + strArr3[0] + '\"');
                        stringBuffer.append(":");
                        stringBuffer.append(m60140a(Integer.parseInt(strArr3[1])));
                        if (i < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f48432c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                Intrinsics.m17074g(context);
                C19508w5 m59823a = AbstractC19494v5.m59823a(context, "display_info_store");
                String stringBuffer2 = stringBuffer.toString();
                Intrinsics.checkNotNullParameter("gesture_margin", "key");
                SharedPreferences.Editor edit = m59823a.f48820a.edit();
                edit.putString("gesture_margin", stringBuffer2);
                edit.apply();
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("k3", "TAG");
        }
    }

    /* renamed from: a */
    public static final int m60140a(int i) {
        int m103791d;
        try {
            m103791d = MathJVM.m103791d(i / m60132b());
            return m103791d;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m60137a(final WindowInsets insets, final Context context) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (f48434e) {
            return;
        }
        C18954Ha.m61079a(new Runnable() { // from class: o3.q4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19338k3.m60130b(insets, context);
            }
        });
    }

    /* renamed from: a */
    public static Display m60139a(Context context) {
        if (C19212b3.f48088a.m60440w()) {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                return displayManager.getDisplay(0);
            }
            return null;
        }
        Object systemService2 = context.getSystemService("window");
        WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: c */
    public static final void m60128c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f48434e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        m60137a(rootWindowInsets, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
        if (r3 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004e, code lost:
        if (r3 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005b, code lost:
        if (r3 == 0) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m60138a(android.view.WindowInsets r3) {
        /*
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.inmobi.media.b3 r0 = com.inmobi.media.C19212b3.f48088a
            boolean r0 = r0.m60476E()
            if (r0 == 0) goto L5d
            byte r0 = m60124g()
            com.inmobi.media.c9 r0 = com.inmobi.media.AbstractC19246d9.m60379a(r0)
            int r1 = androidx.core.view.WindowInsetsCompat.Type.systemGestures()
            android.graphics.Insets r3 = androidx.core.view.C1592f3.m104838a(r3, r1)
            java.lang.String r1 = "getInsets(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 == r1) goto L44
            r2 = 2
            if (r0 == r2) goto L51
            r2 = 3
            if (r0 != r2) goto L3e
            int r0 = androidx.appcompat.widget.C0265l.m105494a(r3)
            if (r0 != 0) goto L5e
            int r3 = androidx.appcompat.widget.C0266m.m105493a(r3)
            if (r3 != 0) goto L5e
            goto L5d
        L3e:
            nd.o r3 = new nd.o
            r3.<init>()
            throw r3
        L44:
            int r0 = androidx.appcompat.widget.C0263j.m105496a(r3)
            if (r0 != 0) goto L5e
            int r3 = androidx.appcompat.widget.C0266m.m105493a(r3)
            if (r3 != 0) goto L5e
            goto L5d
        L51:
            int r0 = androidx.appcompat.widget.C0263j.m105496a(r3)
            if (r0 != 0) goto L5e
            int r3 = androidx.appcompat.widget.C0265l.m105494a(r3)
            if (r3 != 0) goto L5e
        L5d:
            r1 = 0
        L5e:
            java.lang.String r3 = "k3"
            java.lang.String r0 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC19338k3.m60138a(android.view.WindowInsets):int");
    }

    /* renamed from: a */
    public static void m60134a(final Map value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return;
        }
        C18954Ha.m61079a(new Runnable() { // from class: o3.o4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19338k3.m60133a(value, m61068d);
            }
        });
    }

    /* renamed from: a */
    public static final void m60133a(Map value, Context context) {
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullExpressionValue("k3", "TAG");
        Objects.toString(value);
        if (f48435f == null) {
            f48435f = new JSONObject();
        }
        for (Number number : value.keySet()) {
            int intValue = number.intValue();
            JSONObject jSONObject = f48435f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(intValue), value.get(Integer.valueOf(intValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(context, "display_info_store");
        JSONObject jSONObject2 = f48435f;
        m59823a.m59618a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null);
    }

    /* renamed from: a */
    public static void m60136a(final Integer num) {
        final Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return;
        }
        C18954Ha.m61079a(new Runnable() { // from class: o3.p4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19338k3.m60135a(num, m61068d);
            }
        });
    }

    /* renamed from: b */
    public static C19324j3 m60131b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Display m60139a = m60139a(context);
        if (m60139a == null) {
            return f48431b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m60139a.getRealMetrics(displayMetrics);
        return new C19324j3(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: a */
    public static final void m60135a(Integer num, Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullExpressionValue("k3", "TAG");
        f48436g = num;
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        AbstractC19494v5.m59823a(context, "display_info_store").m59620a("nav_bar_type", num != null ? num.intValue() : -1);
    }
}
