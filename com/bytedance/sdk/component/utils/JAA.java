package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class JAA extends Handler {

    /* renamed from: bg */
    protected WeakReference<InterfaceC7736bg> f16912bg;

    /* renamed from: com.bytedance.sdk.component.utils.JAA$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7736bg {
        /* renamed from: bg */
        void mo83648bg(Message message);
    }

    public JAA(InterfaceC7736bg interfaceC7736bg) {
        if (interfaceC7736bg != null) {
            this.f16912bg = new WeakReference<>(interfaceC7736bg);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC7736bg interfaceC7736bg;
        WeakReference<InterfaceC7736bg> weakReference = this.f16912bg;
        if (weakReference != null && (interfaceC7736bg = weakReference.get()) != null && message != null) {
            interfaceC7736bg.mo83648bg(message);
        }
    }

    public JAA(Looper looper, InterfaceC7736bg interfaceC7736bg) {
        super(looper);
        if (interfaceC7736bg != null) {
            this.f16912bg = new WeakReference<>(interfaceC7736bg);
        }
    }
}
