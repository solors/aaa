package com.bytedance.sdk.component.p233Kg.p237bg;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.JAA;

/* renamed from: com.bytedance.sdk.component.Kg.bg.bg */
/* loaded from: classes3.dex */
public class C7246bg {

    /* renamed from: IL */
    private Handler f15643IL;

    /* renamed from: bg */
    private final C7250eqN<HandlerC7244IL> f15644bg;

    /* renamed from: com.bytedance.sdk.component.Kg.bg.bg$bg */
    /* loaded from: classes3.dex */
    private static class C7249bg {

        /* renamed from: bg */
        private static final C7246bg f15650bg = new C7246bg();
    }

    /* renamed from: IL */
    public Handler m89492IL() {
        if (this.f15643IL == null) {
            synchronized (C7246bg.class) {
                if (this.f15643IL == null) {
                    this.f15643IL = m89480bg("csj_io_handler");
                }
            }
        }
        return this.f15643IL;
    }

    private C7246bg() {
        this.f15644bg = C7250eqN.m89473bg(2);
    }

    /* renamed from: bg */
    public static C7246bg m89489bg() {
        return C7249bg.f15650bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m89485bg(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
            return;
        }
        handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.Kg.bg.bg.1
            @Override // java.lang.Runnable
            public void run() {
                C7246bg.this.m89485bg(handler, handler2);
            }
        }, 1000L);
    }

    /* renamed from: IL */
    private HandlerC7244IL m89490IL(JAA.InterfaceC7736bg interfaceC7736bg, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new HandlerC7244IL(handlerThread, interfaceC7736bg);
    }

    /* renamed from: bg */
    public JAA m89483bg(JAA.InterfaceC7736bg interfaceC7736bg, final String str) {
        HandlerC7244IL m89474bg = this.f15644bg.m89474bg();
        if (m89474bg != null) {
            m89474bg.m89494bg(interfaceC7736bg);
            m89474bg.post(new Runnable() { // from class: com.bytedance.sdk.component.Kg.bg.bg.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return m89474bg;
        }
        return m89490IL(interfaceC7736bg, str);
    }

    /* renamed from: bg */
    public JAA m89480bg(String str) {
        return m89483bg((JAA.InterfaceC7736bg) null, str);
    }

    /* renamed from: bg */
    public boolean m89482bg(JAA jaa) {
        if (jaa instanceof HandlerC7244IL) {
            HandlerC7244IL handlerC7244IL = (HandlerC7244IL) jaa;
            if (this.f15644bg.m89472bg((C7250eqN<HandlerC7244IL>) handlerC7244IL)) {
                return true;
            }
            handlerC7244IL.m89495IL();
            return true;
        }
        return false;
    }
}
