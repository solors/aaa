package com.bytedance.sdk.component.ldr.p261bg.p273iR;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.sdk.component.ldr.bg.iR.bg */
/* loaded from: classes3.dex */
public class C7710bg {

    /* renamed from: IL */
    private static volatile Handler f16871IL = null;

    /* renamed from: bX */
    private static int f16872bX = 3000;

    /* renamed from: bg */
    private static volatile HandlerThread f16873bg;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        f16873bg = handlerThread;
        handlerThread.start();
    }

    /* renamed from: IL */
    public static int m87973IL() {
        if (f16872bX <= 0) {
            f16872bX = 3000;
        }
        return f16872bX;
    }

    /* renamed from: bg */
    public static Handler m87972bg() {
        if (f16873bg != null && f16873bg.isAlive()) {
            if (f16871IL == null) {
                synchronized (C7710bg.class) {
                    if (f16871IL == null) {
                        f16871IL = new Handler(f16873bg.getLooper());
                    }
                }
            }
        } else {
            synchronized (C7710bg.class) {
                if (f16873bg == null || !f16873bg.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    f16873bg = handlerThread;
                    handlerThread.start();
                    f16871IL = new Handler(f16873bg.getLooper());
                }
            }
        }
        return f16871IL;
    }
}
