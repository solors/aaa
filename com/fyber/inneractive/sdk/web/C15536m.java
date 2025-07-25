package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.m */
/* loaded from: classes4.dex */
public class C15536m extends WebView {

    /* renamed from: a */
    public boolean f30808a;

    /* renamed from: b */
    public boolean f30809b;

    /* renamed from: c */
    public InterfaceC15535l f30810c;

    /* renamed from: d */
    public View$OnTouchListenerC15512Z f30811d;

    /* renamed from: e */
    public final C15446f0 f30812e;

    /* renamed from: f */
    public int f30813f;

    /* renamed from: g */
    public int f30814g;

    public C15536m() {
        super(IAConfigManager.f27060O.f27098v.m77924a());
        this.f30808a = false;
        this.f30812e = new C15446f0();
    }

    /* renamed from: a */
    public final void m76365a(String str) {
        IAlog.m76529a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:".concat(str));
            } catch (Throwable th) {
                IAlog.m76530a("Failed to inject JS", th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void m76363b() {
        boolean z;
        boolean z2 = false;
        IAlog.m76525e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f30808a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f30808a) {
                z2 = true;
            }
            m76364a(z2);
            return;
        }
        if (isShown() && this.f30808a) {
            z = true;
        } else {
            z = false;
        }
        if (!IAConfigManager.f27060O.f27097u.f27275b.m77916a(false, "ignore_w_f")) {
            if (z && hasWindowFocus()) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        m76364a(z2);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f30810c = null;
    }

    public int getHeightDp() {
        return this.f30814g;
    }

    public boolean getIsVisible() {
        return this.f30809b;
    }

    public C15446f0 getLastClickedLocation() {
        return this.f30812e;
    }

    public int getWidthDp() {
        return this.f30813f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f30808a) {
            this.f30808a = true;
            InterfaceC15535l interfaceC15535l = this.f30810c;
            if (interfaceC15535l != null) {
                interfaceC15535l.mo76368b();
            }
            m76366a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30809b = false;
        if (this.f30808a) {
            this.f30808a = false;
            InterfaceC15535l interfaceC15535l = this.f30810c;
            if (interfaceC15535l != null) {
                interfaceC15535l.mo76367c();
            }
            m76366a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m76366a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x, y, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x, y, 0));
        }
        View$OnTouchListenerC15512Z view$OnTouchListenerC15512Z = this.f30811d;
        if (view$OnTouchListenerC15512Z != null) {
            view$OnTouchListenerC15512Z.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            C15446f0 c15446f0 = this.f30812e;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            c15446f0.f30595a = x2;
            c15446f0.f30596b = y2;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m76366a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m76525e("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        m76366a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            m76364a(false);
        } else {
            m76366a();
        }
    }

    public void setHeightDp(int i) {
        this.f30814g = i;
    }

    public void setListener(InterfaceC15535l interfaceC15535l) {
        this.f30810c = interfaceC15535l;
    }

    public void setTapListener(InterfaceC15511Y interfaceC15511Y) {
        this.f30811d = new View$OnTouchListenerC15512Z(interfaceC15511Y, IAConfigManager.f27060O.f27098v.m77924a());
    }

    public void setWidthDp(int i) {
        this.f30813f = i;
    }

    /* renamed from: a */
    public final void m76364a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m76525e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m76525e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f30809b != z) {
            this.f30809b = z;
            InterfaceC15535l interfaceC15535l = this.f30810c;
            if (interfaceC15535l != null) {
                interfaceC15535l.mo76369a(z);
            }
        }
    }

    /* renamed from: a */
    public final void m76366a() {
        if (IAConfigManager.f27060O.f27097u.f27275b.m77916a(false, "update_v_mth")) {
            AbstractC15465p.f30612b.post(new RunnableC15533k(this));
        } else {
            m76363b();
        }
    }
}
