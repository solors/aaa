package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.pgl.ssdk.a1 */
/* loaded from: classes7.dex */
public class HandlerC26605a1 extends Handler {

    /* renamed from: a */
    protected WeakReference<InterfaceC26606a> f69843a;

    /* renamed from: com.pgl.ssdk.a1$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26606a {
        /* renamed from: a */
        void m40938a(Message message);
    }

    public HandlerC26605a1(Looper looper, InterfaceC26606a interfaceC26606a) {
        super(looper);
        if (interfaceC26606a != null) {
            this.f69843a = new WeakReference<>(interfaceC26606a);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC26606a interfaceC26606a;
        WeakReference<InterfaceC26606a> weakReference = this.f69843a;
        if (weakReference != null && (interfaceC26606a = weakReference.get()) != null && message != null) {
            interfaceC26606a.m40938a(message);
        }
    }
}
