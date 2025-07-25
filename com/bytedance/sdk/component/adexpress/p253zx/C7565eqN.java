package com.bytedance.sdk.component.adexpress.p253zx;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.p256bg.C7574Ja;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.adexpress.zx.eqN */
/* loaded from: classes3.dex */
public class C7565eqN {

    /* renamed from: bg */
    private WeakReference<C7574Ja> f16482bg;

    public C7565eqN(C7574Ja c7574Ja) {
        this.f16482bg = new WeakReference<>(c7574Ja);
    }

    /* renamed from: bg */
    public void m88538bg(C7574Ja c7574Ja) {
        this.f16482bg = new WeakReference<>(c7574Ja);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<C7574Ja> weakReference = this.f16482bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f16482bg.get().invokeMethod(str);
        }
    }
}
