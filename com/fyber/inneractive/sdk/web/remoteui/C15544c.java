package com.fyber.inneractive.sdk.web.remoteui;

import com.fyber.inneractive.sdk.player.p376ui.remote.InterfaceC15201a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C15536m;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.web.remoteui.c */
/* loaded from: classes4.dex */
public final class C15544c extends C15536m implements InterfaceC15543b, InterfaceC15201a {

    /* renamed from: h */
    public InterfaceC15543b f30819h;

    /* renamed from: i */
    public InterfaceC15201a f30820i;

    /* renamed from: j */
    public boolean f30821j = false;

    /* renamed from: k */
    public final C15545d f30822k;

    public C15544c() {
        C15545d c15545d = new C15545d(this, this);
        this.f30822k = c15545d;
        setWebViewClient(c15545d);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.InterfaceC15543b
    /* renamed from: a */
    public final void mo76362a(EnumC15542a enumC15542a, String str, boolean z, HashMap hashMap) {
        this.f30821j = false;
        InterfaceC15543b interfaceC15543b = this.f30819h;
        if (interfaceC15543b != null) {
            interfaceC15543b.mo76362a(enumC15542a, str, z, hashMap);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.C15536m, android.webkit.WebView
    public final void destroy() {
        this.f30819h = null;
        this.f30820i = null;
        C15545d c15545d = this.f30822k;
        c15545d.getClass();
        IAlog.m76529a("%s: destroy()", "RemoteUiWebViewClient");
        c15545d.f30824b = null;
        c15545d.f30823a = null;
        super.destroy();
    }

    public void setCommandHandler(InterfaceC15201a interfaceC15201a) {
        this.f30820i = interfaceC15201a;
    }

    public void setResultFailureListener(InterfaceC15543b interfaceC15543b) {
        this.f30819h = interfaceC15543b;
    }

    public void setUiReady(boolean z) {
        this.f30821j = z;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.remote.InterfaceC15201a
    /* renamed from: a */
    public final void mo76361a(String str, HashMap hashMap) {
        InterfaceC15201a interfaceC15201a = this.f30820i;
        if (interfaceC15201a != null) {
            interfaceC15201a.mo76361a(str, hashMap);
        }
    }
}
