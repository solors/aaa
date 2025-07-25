package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.p627ui;

import android.webkit.JavascriptInterface;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.InterfaceC32513c2oc2i;
import java.lang.ref.WeakReference;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.ui.EndCardBridge */
/* loaded from: classes8.dex */
public class EndCardBridge {
    public static final String coi222o222 = "EndCardBridge";
    private WeakReference<InterfaceC32513c2oc2i> coo2iico;

    public void coo2iico(InterfaceC32513c2oc2i interfaceC32513c2oc2i) {
        this.coo2iico = new WeakReference<>(interfaceC32513c2oc2i);
    }

    @JavascriptInterface
    public void onEndCardClicked(int i) {
        InterfaceC32513c2oc2i interfaceC32513c2oc2i;
        WeakReference<InterfaceC32513c2oc2i> weakReference = this.coo2iico;
        if (weakReference != null && (interfaceC32513c2oc2i = weakReference.get()) != null) {
            interfaceC32513c2oc2i.coo2iico(i);
        }
    }

    @JavascriptInterface
    public void onEndCardLoaded(int i, int i2) {
        InterfaceC32513c2oc2i interfaceC32513c2oc2i;
        WeakReference<InterfaceC32513c2oc2i> weakReference = this.coo2iico;
        if (weakReference != null && (interfaceC32513c2oc2i = weakReference.get()) != null) {
            interfaceC32513c2oc2i.coo2iico(i, i2);
        }
    }
}
