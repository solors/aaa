package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;

/* renamed from: com.pgl.ssdk.y */
/* loaded from: classes7.dex */
public class C26679y {

    /* renamed from: a */
    private static volatile DisplayManager.DisplayListener f69988a = null;

    /* renamed from: b */
    private static volatile boolean f69989b = false;

    /* renamed from: c */
    private static String f69990c;

    /* renamed from: d */
    private static String f69991d;

    /* renamed from: e */
    private static String f69992e;

    /* renamed from: f */
    private static DisplayManager f69993f;

    /* renamed from: com.pgl.ssdk.y$a */
    /* loaded from: classes7.dex */
    static class C26680a implements DisplayManager.DisplayListener {
        C26680a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            C26679y.m40699b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            C26679y.m40699b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            C26679y.m40699b(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m40699b(int i, int i2) {
        if (i == 0) {
            return;
        }
        try {
            String m40703a = m40703a(i);
            if (i2 == 1) {
                if (m40703a.equals(f69990c)) {
                    return;
                }
                f69990c = m40703a;
            } else if (i2 != 2) {
                if (i2 != 3 || m40703a.equals(f69992e)) {
                    return;
                }
                f69992e = m40703a;
            } else if (m40703a.equals(f69991d)) {
            } else {
                f69991d = m40703a;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m40697c(Context context) {
        Handler m40801b;
        if (f69989b) {
            return;
        }
        f69989b = true;
        if (f69988a == null) {
            f69988a = new C26680a();
        }
        if (f69993f == null) {
            f69993f = (DisplayManager) context.getSystemService("display");
        }
        if (f69993f != null && (m40801b = C26652o0.m40801b()) != null) {
            try {
                f69993f.registerDisplayListener(f69988a, m40801b);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m40700a(Display display) {
        String name = display.getName();
        Object m40774a = C26661s0.m40774a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object m40774a2 = C26661s0.m40774a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object m40775a = C26661s0.m40775a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", m40774a2, name, Boolean.valueOf((m40774a == null || m40775a == null || ((Integer) m40774a).intValue() != ((Integer) m40775a).intValue()) ? false : true));
    }

    /* renamed from: b */
    public static boolean m40698b(Context context) {
        if (f69990c == null && f69991d == null && f69992e == null) {
            return (context == null || TextUtils.isEmpty(m40701a(context))) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    private static String m40703a(int i) {
        Display display = f69993f.getDisplay(i);
        return display != null ? m40700a(display) : "pd";
    }

    /* renamed from: a */
    public static String m40701a(Context context) {
        Display[] displays;
        if (f69993f == null) {
            f69993f = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f69993f;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < displays.length; i++) {
            Display display = displays[i];
            if (display != null && display.getDisplayId() != 0) {
                stringBuffer.append(m40700a(displays[i]));
                if (i != displays.length - 1) {
                    stringBuffer.append(",");
                }
            }
        }
        return stringBuffer.toString();
    }
}
