package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.pubmatic.sdk.webrendering.mraid.s */
/* loaded from: classes7.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC26939s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View$OnTouchListenerC26942v f71234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserver$OnGlobalLayoutListenerC26939s(View$OnTouchListenerC26942v view$OnTouchListenerC26942v) {
        this.f71234a = view$OnTouchListenerC26942v;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Context context;
        int i;
        int i2;
        boolean z;
        context = this.f71234a.f71238b;
        int deviceOrientation = POBUtils.getDeviceOrientation(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("currentOrientation :");
        i = this.f71234a.f71244h;
        sb2.append(i);
        sb2.append(", changedOrientation:");
        sb2.append(deviceOrientation);
        POBLog.debug("POBResizeView", sb2.toString(), new Object[0]);
        i2 = this.f71234a.f71244h;
        if (deviceOrientation != i2) {
            z = this.f71234a.f71245i;
            if (z) {
                this.f71234a.m39859b();
            }
        }
    }
}
