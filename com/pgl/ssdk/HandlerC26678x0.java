package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.HandlerC26605a1;
import java.lang.ref.WeakReference;

/* renamed from: com.pgl.ssdk.x0 */
/* loaded from: classes7.dex */
public class HandlerC26678x0 extends HandlerC26605a1 implements InterfaceC26681y0 {

    /* renamed from: b */
    private final HandlerThread f69987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC26678x0(HandlerThread handlerThread, HandlerC26605a1.InterfaceC26606a interfaceC26606a) {
        super(handlerThread.getLooper(), interfaceC26606a);
        this.f69987b = handlerThread;
    }

    /* renamed from: a */
    public void m40705a(HandlerC26605a1.InterfaceC26606a interfaceC26606a) {
        this.f69843a = new WeakReference<>(interfaceC26606a);
    }

    /* renamed from: a */
    public void m40704a(String str) {
        HandlerThread handlerThread = this.f69987b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
