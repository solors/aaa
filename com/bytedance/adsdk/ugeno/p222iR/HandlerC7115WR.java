package com.bytedance.adsdk.ugeno.p222iR;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.adsdk.ugeno.iR.WR */
/* loaded from: classes3.dex */
public class HandlerC7115WR extends Handler {

    /* renamed from: bg */
    private final WeakReference<InterfaceC7116bg> f15286bg;

    /* renamed from: com.bytedance.adsdk.ugeno.iR.WR$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7116bg {
        /* renamed from: bg */
        void mo90004bg(Message message);
    }

    public HandlerC7115WR(Looper looper, InterfaceC7116bg interfaceC7116bg) {
        super(looper);
        this.f15286bg = new WeakReference<>(interfaceC7116bg);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC7116bg interfaceC7116bg = this.f15286bg.get();
        if (interfaceC7116bg != null && message != null) {
            interfaceC7116bg.mo90004bg(message);
        }
    }
}
