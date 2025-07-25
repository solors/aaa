package com.bytedance.sdk.component.p256bg;

import android.webkit.WebView;
import com.bytedance.sdk.component.p256bg.AbstractC7589eqN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.bg.VzQ */
/* loaded from: classes3.dex */
public class C7583VzQ {

    /* renamed from: bg */
    static C7597rri f16515bg;

    /* renamed from: IL */
    private final AbstractC7586bg f16516IL;

    /* renamed from: bX */
    private final WebView f16517bX;
    private final C7588eo eqN;
    private volatile boolean ldr;

    /* renamed from: zx */
    private final List<InterfaceC7605yDt> f16518zx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7583VzQ(C7588eo c7588eo) {
        ArrayList arrayList = new ArrayList();
        this.f16518zx = arrayList;
        this.ldr = false;
        this.eqN = c7588eo;
        if (c7588eo.f16530Kg && f16515bg != null) {
            throw null;
        }
        if (c7588eo.f16537bg != null) {
            AbstractC7586bg abstractC7586bg = c7588eo.f16529IL;
            if (abstractC7586bg == null) {
                this.f16516IL = new C7574Ja();
            } else {
                this.f16516IL = abstractC7586bg;
            }
        } else {
            this.f16516IL = c7588eo.f16529IL;
        }
        this.f16516IL.m88468bg(c7588eo, (C7599tC) null);
        this.f16517bX = c7588eo.f16537bg;
        arrayList.add(c7588eo.f16538eo);
        JAA.m88501bg(c7588eo.f16539iR);
    }

    /* renamed from: IL */
    private void m88483IL() {
        if (this.ldr) {
            C7584WR.m88476bg(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    /* renamed from: bg */
    public static C7588eo m88481bg(WebView webView) {
        return new C7588eo(webView);
    }

    /* renamed from: bg */
    public C7583VzQ m88479bg(String str, AbstractC7606zx<?, ?> abstractC7606zx) {
        return m88477bg(str, (String) null, abstractC7606zx);
    }

    /* renamed from: bg */
    public C7583VzQ m88477bg(String str, String str2, AbstractC7606zx<?, ?> abstractC7606zx) {
        m88483IL();
        this.f16516IL.f16525iR.m88438bg(str, abstractC7606zx);
        return this;
    }

    /* renamed from: bg */
    public C7583VzQ m88480bg(String str, AbstractC7589eqN.InterfaceC7590IL interfaceC7590IL) {
        return m88478bg(str, (String) null, interfaceC7590IL);
    }

    /* renamed from: bg */
    public C7583VzQ m88478bg(String str, String str2, AbstractC7589eqN.InterfaceC7590IL interfaceC7590IL) {
        m88483IL();
        this.f16516IL.f16525iR.m88439bg(str, interfaceC7590IL);
        return this;
    }

    /* renamed from: bg */
    public void m88482bg() {
        if (this.ldr) {
            return;
        }
        this.f16516IL.mo88475IL();
        this.ldr = true;
        Iterator<InterfaceC7605yDt> it = this.f16518zx.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
