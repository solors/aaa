package sg.bigo.ads.common.p937v;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import sg.bigo.ads.common.p912f.C43620c;

/* renamed from: sg.bigo.ads.common.v.a */
/* loaded from: classes10.dex */
public final class C43847a {

    /* renamed from: a */
    public static int f114694a = 0;

    /* renamed from: b */
    public static int f114695b = 1;

    /* renamed from: c */
    public static int f114696c = 2;

    /* renamed from: d */
    public static int f114697d = 3;

    /* renamed from: e */
    public static int f114698e = 4;

    /* renamed from: f */
    public static int f114699f = 5;

    /* renamed from: g */
    public int f114700g = f114694a;

    /* renamed from: b */
    public static boolean m4788b(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null) {
            return false;
        }
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof WindowManager.LayoutParams) {
                layoutParams = (WindowManager.LayoutParams) layoutParams2;
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                layoutParams = null;
                break;
            }
        }
        if (layoutParams == null) {
            return false;
        }
        int i = layoutParams.type;
        if (i != 2002 && i != 2003 && i != 2006 && i != 2007 && i != 2010 && i != 2038) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int m4790a() {
        int m5296c = C43620c.m5296c();
        this.f114700g = m5296c != 1 ? m5296c != 2 ? f114694a : f114698e : f114695b;
        return this.f114700g;
    }

    /* renamed from: a */
    public static boolean m4789a(View view) {
        if (view == null) {
            return false;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
