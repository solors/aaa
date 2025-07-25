package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.settings.C8999PX;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9010ldr;
import com.bytedance.sdk.openadsdk.eqN.C9224bg;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9252eqN;
import com.bytedance.sdk.openadsdk.yDt.p364bX.C9625bX;
import com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9624IL;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.core.VzQ */
/* loaded from: classes3.dex */
public class C8838VzQ {

    /* renamed from: IL */
    private static volatile InterfaceC8512Fy<C9224bg> f19508IL = null;

    /* renamed from: bX */
    private static int f19509bX = -1;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bg */
    private static volatile Context f19510bg;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VzQ$bg */
    /* loaded from: classes3.dex */
    public static class C8839bg {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: bg */
        private static volatile Application f19511bg;

        static {
            try {
                Object m84737IL = m84737IL();
                f19511bg = (Application) m84737IL.getClass().getMethod("getApplication", new Class[0]).invoke(m84737IL, new Object[0]);
                C7741PX.m87873bg("MyApplication", "application get success");
            } catch (Throwable th) {
                C7741PX.m87871bg("MyApplication", "application get failed", th);
            }
        }

        /* renamed from: IL */
        private static Object m84737IL() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                C7741PX.m87871bg("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        @Nullable
        /* renamed from: bg */
        public static Application m84736bg() {
            return f19511bg;
        }
    }

    /* renamed from: IL */
    public static void m84742IL(Context context) {
        if (f19510bg == null) {
            synchronized (C8838VzQ.class) {
                if (f19510bg == null) {
                    if (context != null) {
                        f19510bg = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            f19510bg = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application m84736bg = C8839bg.m84736bg();
                        if (m84736bg != null) {
                            f19510bg = m84736bg;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: bX */
    public static InterfaceC8512Fy<C9224bg> m84741bX() {
        if (f19508IL == null) {
            synchronized (C8838VzQ.class) {
                if (f19508IL == null) {
                    f19508IL = new C8599LZ(f19510bg);
                }
            }
        }
        return f19508IL;
    }

    /* renamed from: bg */
    public static Context m84740bg() {
        if (f19510bg == null) {
            m84742IL(null);
        }
        return f19510bg;
    }

    public static InterfaceC9010ldr eqN() {
        return C9011xxp.m83746zU();
    }

    /* renamed from: zx */
    public static InterfaceC9624IL m84738zx() {
        if (!C8999PX.m83842bg()) {
            return C9625bX.m82276bg();
        }
        return C9252eqN.m83300bg();
    }

    /* renamed from: bg */
    public static Context m84739bg(Context context) {
        if (context == null) {
            context = m84740bg();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    /* renamed from: IL */
    public static int m84743IL() {
        Context m84740bg;
        if (f19509bX < 0 && (m84740bg = m84740bg()) != null) {
            f19509bX = ViewConfiguration.get(m84740bg).getScaledTouchSlop();
        }
        return f19509bX;
    }
}
