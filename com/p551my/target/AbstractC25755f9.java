package com.p551my.target;

import android.content.Context;
import com.unity3d.player.UnityPlayerActivity;

/* renamed from: com.my.target.f9 */
/* loaded from: classes7.dex */
public abstract class AbstractC25755f9 {

    /* renamed from: a */
    public static int f66849a;

    static {
        if (AbstractC25795h5.m43802a()) {
            f66849a |= 2;
        }
        if (m43905b()) {
            f66849a |= 1;
        }
    }

    /* renamed from: a */
    public static int m43908a() {
        return f66849a;
    }

    /* renamed from: b */
    public static boolean m43905b() {
        try {
            try {
                int i = UnityPlayerActivity.f74821b;
                return true;
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
            Runtime.getRuntime().loadLibrary("unity");
            return true;
        }
    }

    /* renamed from: c */
    public static void m43902c() {
        f66849a |= 8;
    }

    /* renamed from: d */
    public static void m43901d() {
        f66849a |= 4;
    }

    /* renamed from: e */
    public static void m43900e() {
        f66849a |= 64;
    }

    /* renamed from: f */
    public static void m43899f() {
        f66849a |= 128;
    }

    /* renamed from: g */
    public static void m43898g() {
        f66849a &= -3;
    }

    /* renamed from: a */
    public static /* synthetic */ void m43907a(Context context) {
        C25634a8.m44224a(context).m44219b(f66849a);
    }

    /* renamed from: b */
    public static void m43904b(final Context context) {
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.yb
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25755f9.m43907a(context);
            }
        });
    }

    /* renamed from: a */
    public static void m43906a(boolean z) {
        f66849a = z ? f66849a | 16 : f66849a & (-17);
    }

    /* renamed from: b */
    public static void m43903b(boolean z) {
        f66849a = z ? f66849a | 32 : f66849a & (-33);
    }
}
