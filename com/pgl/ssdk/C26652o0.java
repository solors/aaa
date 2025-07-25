package com.pgl.ssdk;

import android.os.Handler;

/* renamed from: com.pgl.ssdk.o0 */
/* loaded from: classes7.dex */
public class C26652o0 {
    /* renamed from: a */
    public static Handler m40803a() {
        return C26673w0.m40719a().m40716b();
    }

    /* renamed from: b */
    public static Handler m40801b() {
        return C26673w0.m40719a().m40714c();
    }

    /* renamed from: a */
    public static void m40802a(Runnable runnable) {
        Handler m40803a;
        if (runnable == null || (m40803a = m40803a()) == null) {
            return;
        }
        m40803a.post(runnable);
    }

    /* renamed from: b */
    public static void m40800b(Runnable runnable) {
        Handler m40801b;
        if (runnable == null || (m40801b = m40801b()) == null) {
            return;
        }
        m40801b.post(runnable);
    }
}
