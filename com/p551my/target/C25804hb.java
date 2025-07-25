package com.p551my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p551my.target.C25719e0;
import com.p551my.target.InterfaceC25636aa;
import com.p551my.target.InterfaceC25661ba;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.hb */
/* loaded from: classes7.dex */
public class C25804hb implements InterfaceC25661ba, C25719e0.InterfaceC25720a {

    /* renamed from: a */
    public final C25719e0 f66940a;

    /* renamed from: b */
    public final C25743f1 f66941b;

    /* renamed from: c */
    public InterfaceC25636aa.InterfaceC25637a f66942c;

    /* renamed from: d */
    public InterfaceC25661ba.InterfaceC25662a f66943d;

    /* renamed from: e */
    public C26066r9 f66944e;

    public C25804hb(Context context) {
        this(new C25719e0(context), new C25743f1(context));
    }

    @Override // com.p551my.target.InterfaceC25636aa
    /* renamed from: a */
    public void mo42520a() {
    }

    @Override // com.p551my.target.C25719e0.InterfaceC25720a
    /* renamed from: b */
    public void mo43381b(String str) {
        if (this.f66944e != null) {
            m43778c(str);
        }
    }

    /* renamed from: c */
    public final void m43778c(String str) {
        C26066r9 c26066r9;
        InterfaceC25636aa.InterfaceC25637a interfaceC25637a = this.f66942c;
        if (interfaceC25637a != null && (c26066r9 = this.f66944e) != null) {
            interfaceC25637a.mo42802a(c26066r9, str);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m43777d(String str) {
        m43776e(str);
        this.f66940a.setOnLayoutListener(null);
    }

    /* renamed from: e */
    public final void m43776e(String str) {
        this.f66940a.setData(str);
    }

    @Override // com.p551my.target.InterfaceC25636aa
    public C25743f1 getView() {
        return this.f66941b;
    }

    @Override // com.p551my.target.InterfaceC25636aa
    public void start() {
        C26066r9 c26066r9;
        InterfaceC25636aa.InterfaceC25637a interfaceC25637a = this.f66942c;
        if (interfaceC25637a != null && (c26066r9 = this.f66944e) != null) {
            interfaceC25637a.mo42803a(c26066r9);
        }
    }

    public C25804hb(C25719e0 c25719e0, C25743f1 c25743f1) {
        this.f66940a = c25719e0;
        this.f66941b = c25743f1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        c25743f1.addView(c25719e0, 0);
        c25719e0.setLayoutParams(layoutParams);
        c25719e0.setBannerWebViewListener(this);
    }

    @Override // com.p551my.target.C25719e0.InterfaceC25720a
    /* renamed from: a */
    public void mo43384a(String str) {
    }

    @Override // com.p551my.target.C25719e0.InterfaceC25720a
    /* renamed from: b */
    public void mo43383b() {
        InterfaceC25636aa.InterfaceC25637a interfaceC25637a = this.f66942c;
        if (interfaceC25637a == null) {
            return;
        }
        C25656b5 m44173e = C25656b5.m44178a("WebView error").m44173e("WebView renderer crashed");
        C26066r9 c26066r9 = this.f66944e;
        C25656b5 m44174d = m44173e.m44174d(c26066r9 == null ? null : c26066r9.getSource());
        C26066r9 c26066r92 = this.f66944e;
        interfaceC25637a.mo42804a(m44174d.m44175c(c26066r92 != null ? c26066r92.getId() : null));
    }

    @Override // com.p551my.target.InterfaceC25636aa
    /* renamed from: a */
    public void mo42508a(boolean z) {
    }

    /* renamed from: a */
    private void m43779a(IAdLoadingError iAdLoadingError) {
        InterfaceC25661ba.InterfaceC25662a interfaceC25662a = this.f66943d;
        if (interfaceC25662a != null) {
            interfaceC25662a.onNoAd(iAdLoadingError);
        }
    }

    @Override // com.p551my.target.InterfaceC25636aa
    /* renamed from: a */
    public void mo42519a(int i) {
        mo43780a((InterfaceC25661ba.InterfaceC25662a) null);
        mo42516a((InterfaceC25636aa.InterfaceC25637a) null);
        if (this.f66940a.getParent() != null) {
            ((ViewGroup) this.f66940a.getParent()).removeView(this.f66940a);
        }
        this.f66940a.m43818a(i);
    }

    /* renamed from: a */
    public static C25804hb m43781a(Context context) {
        return new C25804hb(context);
    }

    @Override // com.p551my.target.C25719e0.InterfaceC25720a
    /* renamed from: a */
    public void mo43390a(WebView webView) {
        InterfaceC25636aa.InterfaceC25637a interfaceC25637a = this.f66942c;
        if (interfaceC25637a != null) {
            interfaceC25637a.mo42805a(webView);
        }
    }

    @Override // com.p551my.target.InterfaceC25636aa
    /* renamed from: a */
    public void mo42514a(C26066r9 c26066r9) {
        this.f66944e = c26066r9;
        final String source = c26066r9.getSource();
        if (source == null) {
            m43779a(C25902m.f67235q);
            return;
        }
        if (this.f66940a.getMeasuredHeight() == 0 || this.f66940a.getMeasuredWidth() == 0) {
            this.f66940a.setOnLayoutListener(new C25719e0.InterfaceC25723d() { // from class: com.my.target.cc
                {
                    C25804hb.this = this;
                }

                @Override // com.p551my.target.C25719e0.InterfaceC25723d
                /* renamed from: a */
                public final void mo43985a() {
                    C25804hb.this.m43777d(source);
                }
            });
        } else {
            m43776e(source);
        }
        InterfaceC25661ba.InterfaceC25662a interfaceC25662a = this.f66943d;
        if (interfaceC25662a != null) {
            interfaceC25662a.onLoad();
        }
    }

    @Override // com.p551my.target.InterfaceC25636aa
    /* renamed from: a */
    public void mo42516a(InterfaceC25636aa.InterfaceC25637a interfaceC25637a) {
        this.f66942c = interfaceC25637a;
    }

    @Override // com.p551my.target.InterfaceC25661ba
    /* renamed from: a */
    public void mo43780a(InterfaceC25661ba.InterfaceC25662a interfaceC25662a) {
        this.f66943d = interfaceC25662a;
    }

    @Override // com.p551my.target.InterfaceC25636aa
    public void pause() {
    }
}
