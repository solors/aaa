package com.meevii.soniclib.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class NotchUtils {
    private static boolean isJust = false;
    private static boolean isNotch = false;
    private static int notchSize;

    /* renamed from: com.meevii.soniclib.util.NotchUtils$a */
    /* loaded from: classes5.dex */
    class RunnableC23352a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f61633b;

        RunnableC23352a(Activity activity) {
            this.f61633b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            NotchUtils.setCutOutWindow(this.f61633b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.meevii.soniclib.util.NotchUtils$b */
    /* loaded from: classes5.dex */
    public static class C23353b {

        /* renamed from: a */
        private static Method f61634a;

        /* renamed from: a */
        static int m47841a(String str, int i) {
            Method[] methods;
            try {
                if (f61634a == null) {
                    for (Method method : Class.forName(KiwiConstants.f2713ar).getMethods()) {
                        if (method.getName().equals(KiwiConstants.f2714as)) {
                            f61634a = method;
                        }
                    }
                }
                return ((Integer) f61634a.invoke(null, str, Integer.valueOf(i))).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return i;
            }
        }
    }

    private static int getNotchSize() {
        return notchSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        r4 = r4.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getSafeArea(int r3, android.app.Activity r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            r2 = 28
            if (r1 < r2) goto L41
            android.view.Window r4 = r4.getWindow()     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            if (r4 == 0) goto L4c
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            android.view.WindowInsets r4 = r4.getRootWindowInsets()     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            if (r4 == 0) goto L4c
            android.view.DisplayCutout r4 = androidx.core.view.C1691w2.m104749a(r4)     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3b
            r1 = 1
            if (r3 == r1) goto L36
            r1 = 2
            if (r3 == r1) goto L31
            r1 = 3
            if (r3 == r1) goto L2c
            goto L4c
        L2c:
            int r3 = androidx.core.view.C1663r.m104772a(r4)     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            goto L3f
        L31:
            int r3 = androidx.core.view.C1653p.m104782a(r4)     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            goto L3f
        L36:
            int r3 = androidx.core.view.C1648o.m104786a(r4)     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            goto L3f
        L3b:
            int r3 = androidx.core.view.C1658q.m104777a(r4)     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
        L3f:
            r0 = r3
            goto L4c
        L41:
            int r3 = getNotchSize()     // Catch: java.lang.Error -> L46 java.lang.Exception -> L48
            return r3
        L46:
            r3 = move-exception
            goto L49
        L48:
            r3 = move-exception
        L49:
            r3.printStackTrace()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meevii.soniclib.util.NotchUtils.getSafeArea(int, android.app.Activity):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        r3 = r3.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float getStateBarHeight(android.app.Activity r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            r2 = 28
            if (r1 < r2) goto L2d
            android.view.Window r3 = r3.getWindow()     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            if (r3 == 0) goto L2d
            android.view.View r3 = r3.getDecorView()     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            android.view.WindowInsets r3 = r3.getRootWindowInsets()     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            if (r3 == 0) goto L2d
            android.view.DisplayCutout r3 = androidx.core.view.C1691w2.m104749a(r3)     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            if (r3 == 0) goto L2d
            int r3 = androidx.core.view.C1658q.m104777a(r3)     // Catch: java.lang.Error -> L27 java.lang.Exception -> L29
            float r3 = (float) r3
            r0 = r3
            goto L2d
        L27:
            r3 = move-exception
            goto L2a
        L29:
            r3 = move-exception
        L2a:
            r3.printStackTrace()
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meevii.soniclib.util.NotchUtils.getStateBarHeight(android.app.Activity):float");
    }

    public static void initDisCutout(Activity activity) {
        if (activity != null && Build.VERSION.SDK_INT >= 28) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setCutOutWindow(activity);
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC23352a(activity));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        com.meevii.soniclib.util.NotchUtils.isNotch = ((java.lang.Boolean) r2.invoke(r8, 32)).booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isNotch(android.app.Activity r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meevii.soniclib.util.NotchUtils.isNotch(android.app.Activity):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r1 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        r4 = r4.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: Error -> 0x0084, Error | Exception -> 0x0086, TryCatch #2 {Error | Exception -> 0x0086, blocks: (B:5:0x0004, B:7:0x000a, B:11:0x0015, B:13:0x0020, B:19:0x0030, B:21:0x003a, B:23:0x0040, B:25:0x004a, B:27:0x0054, B:30:0x005c, B:33:0x0067, B:35:0x0071, B:37:0x0077, B:40:0x007e), top: B:47:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isNotchScreen(android.app.Activity r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            r2 = 28
            if (r1 < r2) goto L7e
            android.view.Window r4 = r4.getWindow()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L8a
            r2 = 30
            r3 = 1
            if (r1 < r2) goto L5c
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            int r1 = com.google.android.gms.ads.internal.util.C16243b.m72328a(r1)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            r2 = 3
            if (r1 == r2) goto L2c
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            int r1 = com.google.android.gms.ads.internal.util.C16243b.m72328a(r1)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r1 == r3) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L30
            goto L8a
        L30:
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            android.view.WindowInsets r4 = r4.getRootWindowInsets()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L8a
            android.view.DisplayCutout r4 = androidx.core.view.C1691w2.m104749a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L8a
            android.graphics.Insets r1 = androidx.core.view.C1668s.m104767a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            android.graphics.Insets r2 = com.meevii.soniclib.util.C23356c.m47838a()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r1 == r2) goto L54
            android.graphics.Insets r1 = androidx.core.view.C1668s.m104767a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            int r1 = androidx.appcompat.widget.C0264k.m105495a(r1)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r1 > 0) goto L5a
        L54:
            int r4 = androidx.core.view.C1658q.m104777a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 <= 0) goto L8a
        L5a:
            r0 = r3
            goto L8a
        L5c:
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            int r1 = com.google.android.gms.ads.internal.util.C16243b.m72328a(r1)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r1 == r3) goto L67
            goto L8a
        L67:
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            android.view.WindowInsets r4 = r4.getRootWindowInsets()     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L8a
            android.view.DisplayCutout r4 = androidx.core.view.C1691w2.m104749a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L8a
            int r4 = androidx.core.view.C1658q.m104777a(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            if (r4 <= 0) goto L8a
            goto L5a
        L7e:
            boolean r4 = isNotch(r4)     // Catch: java.lang.Error -> L84 java.lang.Exception -> L86
            r0 = r4
            goto L8a
        L84:
            r4 = move-exception
            goto L87
        L86:
            r4 = move-exception
        L87:
            r4.printStackTrace()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meevii.soniclib.util.NotchUtils.isNotchScreen(android.app.Activity):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setCutOutWindow(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null) {
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                if (i >= 30) {
                    attributes.layoutInDisplayCutoutMode = 3;
                } else {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
    }
}
