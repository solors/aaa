package com.bytedance.sdk.openadsdk.rri.p354bg;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.C7741PX;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.iR */
/* loaded from: classes3.dex */
public class C9367iR {

    /* renamed from: IL */
    private static HandlerThread f20896IL;

    /* renamed from: bg */
    private static HandlerC9368bg f20897bg;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.rri.bg.iR$bg */
    /* loaded from: classes3.dex */
    public static class HandlerC9368bg extends Handler {
        public HandlerC9368bg(Looper looper) {
            super(looper);
        }

        /* renamed from: bg */
        public void m82926bg(AbstractC9361IL abstractC9361IL) {
            if (abstractC9361IL == null) {
                return;
            }
            int intValue = abstractC9361IL.m82945VB().intValue();
            if (!hasMessages(intValue)) {
                Message obtain = Message.obtain();
                obtain.what = intValue;
                obtain.obj = abstractC9361IL;
                sendMessageDelayed(obtain, abstractC9361IL.ldr());
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC9361IL abstractC9361IL = (AbstractC9361IL) message.obj;
            if (abstractC9361IL == null) {
                return;
            }
            int m82948IL = abstractC9361IL.m82948IL();
            if (m82948IL == 1) {
                abstractC9361IL.m82939iR();
            } else if (m82948IL == 2) {
                abstractC9361IL.m82947Kg();
            } else {
                C9370zx.m82922IL(abstractC9361IL.m82945VB());
                return;
            }
            if (abstractC9361IL.m82944WR()) {
                C9370zx.m82922IL(abstractC9361IL.m82945VB());
            } else if (abstractC9361IL.mo82937PX()) {
                m82926bg(abstractC9361IL);
            }
        }
    }

    /* renamed from: IL */
    public static void m82929IL(AbstractC9361IL abstractC9361IL) {
        if (abstractC9361IL == null || f20897bg == null) {
            return;
        }
        try {
            int intValue = abstractC9361IL.m82945VB().intValue();
            if (f20897bg.hasMessages(intValue)) {
                f20897bg.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: bg */
    public static void m82928bg() {
    }

    /* renamed from: bg */
    public static void m82927bg(AbstractC9361IL abstractC9361IL) {
        if (abstractC9361IL == null) {
            return;
        }
        m82930IL();
        HandlerC9368bg handlerC9368bg = f20897bg;
        if (handlerC9368bg != null) {
            handlerC9368bg.m82926bg(abstractC9361IL);
        }
    }

    /* renamed from: IL */
    public static void m82930IL() {
        if (f20897bg != null) {
            return;
        }
        try {
            HandlerThread handlerThread = f20896IL;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (C9367iR.class) {
                HandlerThread handlerThread2 = f20896IL;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    f20896IL = handlerThread3;
                    handlerThread3.start();
                    f20897bg = new HandlerC9368bg(f20896IL.getLooper());
                }
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("MRC", th.getMessage());
        }
    }
}
