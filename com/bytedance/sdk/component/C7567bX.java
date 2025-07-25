package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.bytedance.sdk.component.bX */
/* loaded from: classes3.dex */
public class C7567bX {
    @GuardedBy("sLock")

    /* renamed from: IL */
    private static volatile Handler f16490IL;

    /* renamed from: bg */
    private static final Object f16492bg = new Object();
    @GuardedBy("sLock")

    /* renamed from: bX */
    private static final LinkedList<Runnable> f16491bX = new LinkedList<>();
    private static Object eqN = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.component.bX$bg */
    /* loaded from: classes3.dex */
    public static class HandlerC7568bg extends Handler {
        HandlerC7568bg(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    C7567bX.m88521bX();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* renamed from: IL */
    private static Handler m88522IL() {
        Handler handler;
        if (f16490IL == null) {
            synchronized (f16492bg) {
                if (f16490IL == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    f16490IL = new HandlerC7568bg(handlerThread.getLooper());
                }
                handler = f16490IL;
            }
            return handler;
        }
        return f16490IL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m88521bX() {
        LinkedList linkedList;
        synchronized (eqN) {
            synchronized (f16492bg) {
                LinkedList<Runnable> linkedList2 = f16491bX;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                m88522IL().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* renamed from: bg */
    public static void m88519bg(Runnable runnable, boolean z) {
        try {
            Handler m88522IL = m88522IL();
            synchronized (f16492bg) {
                f16491bX.add(runnable);
                if (z) {
                    m88522IL.sendEmptyMessageDelayed(1, 100L);
                } else {
                    m88522IL.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
