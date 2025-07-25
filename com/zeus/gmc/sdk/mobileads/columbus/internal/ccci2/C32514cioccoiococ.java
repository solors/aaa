package com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2;

import android.content.Context;
import android.webkit.WebViewClient;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.C32438coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.p627ui.EndCardBridge;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.cioccoiococ */
/* loaded from: classes8.dex */
public class C32514cioccoiococ extends C32438coi222o222 {
    private EndCardBridge c2oc2o;

    public C32514cioccoiococ(Context context) {
        super(context);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.C32438coi222o222
    public void cioccoiococ() {
        super.cioccoiococ();
        EndCardBridge endCardBridge = new EndCardBridge();
        this.c2oc2o = endCardBridge;
        addJavascriptInterface(endCardBridge, EndCardBridge.coi222o222);
        setWebViewClient(new WebViewClient());
        getSettings().setTextZoom(100);
    }

    public void setEndCardListener(InterfaceC32513c2oc2i interfaceC32513c2oc2i) {
        EndCardBridge endCardBridge = this.c2oc2o;
        if (endCardBridge != null) {
            endCardBridge.coo2iico(interfaceC32513c2oc2i);
        }
    }
}
