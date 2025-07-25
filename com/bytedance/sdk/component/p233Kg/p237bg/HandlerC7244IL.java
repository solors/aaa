package com.bytedance.sdk.component.p233Kg.p237bg;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.JAA;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.Kg.bg.IL */
/* loaded from: classes3.dex */
public class HandlerC7244IL extends JAA implements InterfaceC7245bX {

    /* renamed from: IL */
    private final HandlerThread f15642IL;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC7244IL(HandlerThread handlerThread, JAA.InterfaceC7736bg interfaceC7736bg) {
        super(handlerThread.getLooper(), interfaceC7736bg);
        this.f15642IL = handlerThread;
    }

    /* renamed from: IL */
    public void m89495IL() {
        HandlerThread handlerThread = this.f15642IL;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.p233Kg.p237bg.InterfaceC7245bX
    /* renamed from: bg */
    public void mo89493bg() {
        removeCallbacksAndMessages(null);
        WeakReference<JAA.InterfaceC7736bg> weakReference = this.f16912bg;
        if (weakReference != null) {
            weakReference.clear();
            this.f16912bg = null;
        }
    }

    /* renamed from: bg */
    public void m89494bg(JAA.InterfaceC7736bg interfaceC7736bg) {
        this.f16912bg = new WeakReference<>(interfaceC7736bg);
    }
}
