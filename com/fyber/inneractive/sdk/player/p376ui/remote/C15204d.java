package com.fyber.inneractive.sdk.player.p376ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C14491S;
import com.fyber.inneractive.sdk.flow.C14525g;
import com.fyber.inneractive.sdk.player.p376ui.InterfaceC15196n;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.remoteui.C15544c;
import com.fyber.inneractive.sdk.web.remoteui.EnumC15542a;
import com.fyber.inneractive.sdk.web.remoteui.InterfaceC15543b;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.player.ui.remote.d */
/* loaded from: classes4.dex */
public final class C15204d implements InterfaceC15543b, InterfaceC15201a {

    /* renamed from: a */
    public InterfaceC15543b f30090a;

    /* renamed from: b */
    public final C15544c f30091b;

    /* renamed from: c */
    public final C14491S f30092c;

    /* renamed from: d */
    public final C15205e f30093d;

    /* renamed from: e */
    public InterfaceC15196n f30094e;

    /* renamed from: f */
    public final String f30095f;

    /* renamed from: i */
    public boolean f30098i;

    /* renamed from: j */
    public C14525g f30099j;

    /* renamed from: g */
    public boolean f30096g = false;

    /* renamed from: h */
    public boolean f30097h = false;

    /* renamed from: k */
    public final RunnableC15202b f30100k = new RunnableC15202b(this);

    /* renamed from: l */
    public final RunnableC15203c f30101l = new RunnableC15203c(this);

    /* renamed from: m */
    public boolean f30102m = false;

    /* renamed from: n */
    public boolean f30103n = false;

    public C15204d(Context context, C14491S c14491s, String str) {
        InneractiveAdRequest inneractiveAdRequest;
        this.f30092c = c14491s;
        this.f30095f = str;
        C15544c c15544c = new C15544c();
        this.f30091b = c15544c;
        this.f30093d = new C15205e(this);
        c15544c.setCommandHandler(this);
        c15544c.setResultFailureListener(this);
        c15544c.setCommandHandler(this);
        if (c14491s != null) {
            inneractiveAdRequest = c14491s.f27572a;
        } else {
            inneractiveAdRequest = null;
        }
        this.f30099j = new C14525g(context, true, inneractiveAdRequest, m77076b(), null);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.InterfaceC15543b
    /* renamed from: a */
    public final void mo76362a(EnumC15542a enumC15542a, String str, boolean z, HashMap hashMap) {
        String str2;
        IAlog.m76529a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        AbstractC15465p.f30612b.removeCallbacks(this.f30100k);
        if (hashMap != null && hashMap.containsKey("failedURL")) {
            str2 = (String) hashMap.get("failedURL");
        } else {
            str2 = this.f30095f;
        }
        if (z) {
            if (m77076b() != null) {
                m77076b().f30456L = false;
            }
            m77077a();
            C14491S c14491s = this.f30092c;
            AbstractC15206f.m77073a(enumC15542a, c14491s != null ? c14491s.f27572a : null, m77076b(), str, str2, Boolean.valueOf(this.f30098i));
        } else {
            C14491S c14491s2 = this.f30092c;
            AbstractC15206f.m77072a(enumC15542a, str2, c14491s2 != null ? c14491s2.f27572a : null, m77076b(), hashMap, this.f30098i);
        }
        InterfaceC15543b interfaceC15543b = this.f30090a;
        if (interfaceC15543b != null) {
            interfaceC15543b.mo76362a(enumC15542a, str, z, hashMap);
        }
    }

    /* renamed from: b */
    public final AbstractC15386e m77076b() {
        C14491S c14491s = this.f30092c;
        if (c14491s != null) {
            return c14491s.f27573b;
        }
        return null;
    }

    /* renamed from: a */
    public final void m77077a() {
        this.f30097h = true;
        this.f30094e = null;
        C15205e c15205e = this.f30093d;
        c15205e.f30105b.clear();
        c15205e.f30104a = null;
        IAlog.m76529a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        AbstractC15465p.f30612b.removeCallbacks(this.f30100k);
        this.f30091b.setVisibility(8);
        this.f30091b.setUiReady(false);
        this.f30091b.destroy();
        this.f30099j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.remote.InterfaceC15201a
    /* renamed from: a */
    public final void mo76361a(String str, HashMap hashMap) {
        C15204d c15204d;
        C14525g c14525g;
        C15446f0 lastClickedLocation = this.f30091b.getLastClickedLocation();
        C15205e c15205e = this.f30093d;
        c15205e.getClass();
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1965090009:
                if (str.equals("clickSkip")) {
                    c = 0;
                    break;
                }
                break;
            case -1744940703:
                if (str.equals("expandCollapseClick")) {
                    c = 1;
                    break;
                }
                break;
            case -1379096487:
                if (str.equals("appInfoClick")) {
                    c = 2;
                    break;
                }
                break;
            case -1351774483:
                if (str.equals("shouldSkipUpdateUi.true")) {
                    c = 3;
                    break;
                }
                break;
            case -866863745:
                if (str.equals("onGeneralError")) {
                    c = 4;
                    break;
                }
                break;
            case -841999016:
                if (str.equals("ctaClick")) {
                    c = 5;
                    break;
                }
                break;
            case -791299859:
                if (str.equals("isSkipEnabled.false")) {
                    c = 6;
                    break;
                }
                break;
            case -671397037:
                if (str.equals("clickMuteUnmute")) {
                    c = 7;
                    break;
                }
                break;
            case -505134137:
                if (str.equals("DOMLoaded")) {
                    c = '\b';
                    break;
                }
                break;
            case -315413572:
                if (str.equals("adIdentifierClick")) {
                    c = '\t';
                    break;
                }
                break;
            case 1031220132:
                if (str.equals("shouldSkipUpdateUi.false")) {
                    c = '\n';
                    break;
                }
                break;
            case 1221833860:
                if (str.equals("isSkipEnabled.true")) {
                    c = 11;
                    break;
                }
                break;
            case 1696642316:
                if (str.equals("onVideoClick")) {
                    c = '\f';
                    break;
                }
                break;
            case 1812159227:
                if (str.equals("onResourceError")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c15205e.m77075a(6, lastClickedLocation);
                break;
            case 1:
                c15205e.m77075a(5, lastClickedLocation);
                break;
            case 2:
                c15205e.m77075a(10, lastClickedLocation);
                break;
            case 3:
                C15204d c15204d2 = c15205e.f30104a;
                if (c15204d2 != null) {
                    c15204d2.f30102m = true;
                    break;
                }
                break;
            case 4:
                C15204d c15204d3 = c15205e.f30104a;
                if (c15204d3 != null) {
                    c15204d3.mo76362a(EnumC15542a.TEMPLATE_GENERAL_ERROR, (String) hashMap.get("error"), "true".equalsIgnoreCase((String) hashMap.get("shouldFailUi")), hashMap);
                    break;
                }
                break;
            case 5:
                c15205e.m77075a(3, lastClickedLocation);
                break;
            case 6:
                C15204d c15204d4 = c15205e.f30104a;
                if (c15204d4 != null) {
                    c15204d4.f30103n = false;
                    break;
                }
                break;
            case 7:
                c15205e.m77075a(1, lastClickedLocation);
                break;
            case '\b':
                String str2 = c15205e.f30106c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                C15204d c15204d5 = c15205e.f30104a;
                if (c15204d5 != null) {
                    c15204d5.f30091b.m76365a(str2);
                }
                for (String str3 : c15205e.f30105b.keySet()) {
                    String str4 = (String) c15205e.f30105b.get(str3);
                    if (!TextUtils.isEmpty(str4) && (c15204d = c15205e.f30104a) != null) {
                        c15204d.f30091b.m76365a(str4);
                    }
                }
                c15205e.f30105b.clear();
                C15204d c15204d6 = c15205e.f30104a;
                if (c15204d6 != null) {
                    IAlog.m76529a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.m76529a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    AbstractC15465p.f30612b.removeCallbacks(c15204d6.f30100k);
                    c15204d6.f30096g = false;
                    c15204d6.f30091b.setUiReady(true);
                    if (c15204d6.m77076b() != null) {
                        c15204d6.m77076b().f30456L = true;
                    }
                    c15204d6.f30091b.setVisibility(0);
                    break;
                }
                break;
            case '\t':
                C15204d c15204d7 = c15205e.f30104a;
                if (c15204d7 != null && (c14525g = c15204d7.f30099j) != null) {
                    c14525g.mo76540a();
                    break;
                }
                break;
            case '\n':
                C15204d c15204d8 = c15205e.f30104a;
                if (c15204d8 != null) {
                    c15204d8.f30102m = false;
                    break;
                }
                break;
            case 11:
                C15204d c15204d9 = c15205e.f30104a;
                if (c15204d9 != null) {
                    c15204d9.f30103n = true;
                    break;
                }
                break;
            case '\f':
                c15205e.m77075a(7, lastClickedLocation);
                break;
            case '\r':
                C15204d c15204d10 = c15205e.f30104a;
                if (c15204d10 != null) {
                    c15204d10.mo76362a(EnumC15542a.TEMPLATE_RESOURCE_ERROR, (String) hashMap.get("error"), true, hashMap);
                    break;
                }
                break;
            default:
                IAlog.m76529a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        C15204d c15204d11 = c15205e.f30104a;
        if (c15204d11 != null) {
            c15204d11.f30091b.m76365a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
