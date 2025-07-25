package com.bytedance.sdk.component.p256bg;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.p256bg.InterfaceC7581VB;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.bg.eo */
/* loaded from: classes3.dex */
public class C7588eo {

    /* renamed from: IL */
    AbstractC7586bg f16529IL;

    /* renamed from: Kg */
    boolean f16530Kg;

    /* renamed from: Lq */
    boolean f16531Lq;

    /* renamed from: WR */
    InterfaceC7580Ta f16535WR;

    /* renamed from: bg */
    WebView f16537bg;

    /* renamed from: eo */
    InterfaceC7605yDt f16538eo;
    C7576Kg eqN;

    /* renamed from: iR */
    boolean f16539iR;
    boolean ldr;

    /* renamed from: vb */
    InterfaceC7581VB.InterfaceC7582bg f16540vb;
    boolean yDt;

    /* renamed from: zx */
    Context f16541zx;

    /* renamed from: bX */
    String f16536bX = "IESJSBridge";

    /* renamed from: VB */
    String f16534VB = C26484a.f69188E;

    /* renamed from: PX */
    final Set<String> f16532PX = new LinkedHashSet();

    /* renamed from: Ta */
    final Set<String> f16533Ta = new LinkedHashSet();

    public C7588eo(WebView webView) {
        this.f16537bg = webView;
    }

    /* renamed from: bX */
    private void m88461bX() {
        if ((this.f16537bg != null || this.yDt || this.f16529IL != null) && ((!TextUtils.isEmpty(this.f16536bX) || this.f16537bg == null) && this.eqN != null)) {
            return;
        }
        throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
    }

    /* renamed from: IL */
    public C7588eo m88462IL(boolean z) {
        this.f16539iR = z;
        return this;
    }

    /* renamed from: bg */
    public C7588eo m88458bg(AbstractC7586bg abstractC7586bg) {
        this.f16529IL = abstractC7586bg;
        return this;
    }

    /* renamed from: IL */
    public C7583VzQ m88463IL() {
        m88461bX();
        return new C7583VzQ(this);
    }

    /* renamed from: bg */
    public C7588eo m88457bg(String str) {
        this.f16536bX = str;
        return this;
    }

    /* renamed from: bg */
    public C7588eo m88459bg(InterfaceC7579PX interfaceC7579PX) {
        this.eqN = C7576Kg.m88499bg(interfaceC7579PX);
        return this;
    }

    /* renamed from: bg */
    public C7588eo m88456bg(boolean z) {
        this.ldr = z;
        return this;
    }

    /* renamed from: bg */
    public C7588eo m88460bg() {
        this.f16531Lq = true;
        return this;
    }

    C7588eo() {
    }
}
