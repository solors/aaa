package com.bytedance.sdk.openadsdk.core.settings;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.PX */
/* loaded from: classes3.dex */
public class C8999PX {

    /* renamed from: bg */
    private static final AtomicInteger f20088bg = new AtomicInteger(1);

    /* renamed from: bg */
    public static boolean m83842bg() {
        return f20088bg.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m83841bg(int r5) {
        /*
            java.lang.String r0 = "SdkSwitch"
            r1 = 1
            if (r5 == r1) goto L9
            r2 = 2
            if (r5 == r2) goto L9
            return
        L9:
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = com.bytedance.sdk.openadsdk.core.settings.C8999PX.f20088bg     // Catch: java.lang.Throwable -> L1a
            int r4 = r3.get()     // Catch: java.lang.Throwable -> L1a
            if (r4 == r5) goto L18
            r3.set(r5)     // Catch: java.lang.Throwable -> L16
            goto L23
        L16:
            r5 = move-exception
            goto L1c
        L18:
            r1 = r2
            goto L23
        L1a:
            r5 = move-exception
            r1 = r2
        L1c:
            java.lang.String r5 = r5.getMessage()
            com.bytedance.sdk.component.utils.C7741PX.m87873bg(r0, r5)
        L23:
            if (r1 == 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "switch status changed: "
            r5.<init>(r1)
            boolean r1 = m83842bg()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            boolean r5 = m83842bg()
            if (r5 == 0) goto L44
            com.bytedance.sdk.openadsdk.eqN.p344bg.C9252eqN.m83302IL()
            return
        L44:
            com.bytedance.sdk.openadsdk.eqN.p344bg.C9252eqN.m83301bX()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.C8999PX.m83841bg(int):void");
    }
}
