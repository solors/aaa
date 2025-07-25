package com.bytedance.sdk.component.adexpress.p253zx;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.InterfaceC7299bX;
import com.bytedance.sdk.component.adexpress.InterfaceC7301bg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import com.bytedance.sdk.component.adexpress.p241IL.C7297yDt;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7279Kg;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7284VB;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7290eqN;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7291iR;
import com.bytedance.sdk.component.adexpress.p243bg.p244IL.C7302IL;
import com.bytedance.sdk.component.adexpress.theme.InterfaceC7560bg;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.utils.C7732IL;
import com.bytedance.sdk.component.utils.C7744VB;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.zx.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7563bg implements InterfaceC7284VB, InterfaceC7290eqN<C7268eqN>, InterfaceC7301bg, InterfaceC7560bg {

    /* renamed from: IL */
    protected boolean f16467IL;

    /* renamed from: Kg */
    private String f16468Kg;

    /* renamed from: PX */
    private C7282Ta f16470PX;

    /* renamed from: Ta */
    private boolean f16471Ta;

    /* renamed from: VB */
    private InterfaceC7279Kg f16472VB;

    /* renamed from: WR */
    private volatile InterfaceC7291iR f16473WR;

    /* renamed from: bX */
    protected C7268eqN f16474bX;

    /* renamed from: bg */
    protected JSONObject f16475bg;

    /* renamed from: eo */
    private boolean f16476eo;

    /* renamed from: iR */
    private String f16477iR;
    private Context ldr;
    private int yDt;
    protected int eqN = 8;

    /* renamed from: zx */
    protected AtomicBoolean f16478zx = new AtomicBoolean(false);

    /* renamed from: Lq */
    private boolean f16469Lq = false;

    public AbstractC7563bg(Context context, C7282Ta c7282Ta, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f16476eo = false;
        this.ldr = context;
        this.f16470PX = c7282Ta;
        this.f16477iR = c7282Ta.eqN();
        themeStatusBroadcastReceiver.m88556bg(this);
        if (C7487eqN.m88685IL()) {
            m88551PX();
            return;
        }
        C7268eqN m88550Ta = m88550Ta();
        this.f16474bX = m88550Ta;
        if (m88550Ta == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (C7487eqN.m88683bg() != null) {
                this.f16474bX = new C7268eqN(C7487eqN.m88683bg());
                return;
            }
            return;
        }
        this.f16476eo = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    /* renamed from: PX */
    private void m88551PX() {
        if (this.ldr == null && C7487eqN.m88683bg() != null) {
            this.ldr = C7487eqN.m88683bg();
        }
        if (this.ldr != null) {
            C7268eqN m88550Ta = m88550Ta();
            this.f16474bX = m88550Ta;
            if (m88550Ta == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.f16474bX = new C7268eqN(new MutableContextWrapper(this.ldr.getApplicationContext()));
                return;
            }
            this.f16476eo = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        }
    }

    /* renamed from: Ta */
    private C7268eqN m88550Ta() {
        if (this.f16470PX.rri()) {
            return C7566zx.m88531bg().m88529bg(this.ldr, this.f16477iR);
        }
        return C7566zx.m88531bg().m88535IL(this.ldr, this.f16477iR);
    }

    private void yDt() {
        if (this.f16470PX.rri()) {
            C7566zx.m88531bg().m88534IL(this.f16474bX);
        } else {
            C7566zx.m88531bg().m88532bX(this.f16474bX);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7290eqN
    /* renamed from: IL */
    public C7268eqN mo84820zx() {
        return mo85663bg();
    }

    /* renamed from: Kg */
    public void mo85672Kg() {
        mo85667WR();
        Activity m87906bg = C7732IL.m87906bg(this.f16474bX);
        if (m87906bg != null) {
            this.yDt = m88553IL(m87906bg);
        }
    }

    /* renamed from: VB */
    public C7282Ta m88549VB() {
        return this.f16470PX;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7290eqN
    /* renamed from: bX */
    public int mo84834bX() {
        return 0;
    }

    /* renamed from: bg */
    public abstract void mo85662bg(int i);

    public void eqN() {
        if (this.f16478zx.get()) {
            return;
        }
        this.f16478zx.set(true);
        mo85653iR();
        if (this.f16474bX.getParent() != null) {
            ((ViewGroup) this.f16474bX.getParent()).removeView(this.f16474bX);
        }
        if (this.f16467IL) {
            yDt();
        } else {
            C7566zx.m88531bg().m88523zx(this.f16474bX);
        }
    }

    /* renamed from: iR */
    public abstract void mo85653iR();

    public void ldr() {
        if (mo85663bg() == null) {
            return;
        }
        try {
            mo85663bg().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    /* renamed from: IL */
    private int m88553IL(Activity activity) {
        return activity.hashCode();
    }

    /* renamed from: bg */
    public void m88541bg(String str) {
        this.f16468Kg = str;
    }

    /* renamed from: IL */
    public void m88552IL(boolean z) {
        this.f16469Lq = z;
    }

    /* renamed from: bg */
    public C7268eqN mo85663bg() {
        return this.f16474bX;
    }

    /* renamed from: bg */
    public void m88544bg(InterfaceC7279Kg interfaceC7279Kg) {
        this.f16472VB = interfaceC7279Kg;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7290eqN
    /* renamed from: bg */
    public void mo84828bg(InterfaceC7291iR interfaceC7291iR) {
        this.f16473WR = interfaceC7291iR;
        if (mo85663bg() != null && mo85663bg().getWebView() != null) {
            if (TextUtils.isEmpty(this.f16468Kg)) {
                this.f16473WR.mo84918bg(102, "url is empty");
                return;
            }
            if (!this.f16470PX.rri()) {
                if (!this.f16469Lq && !C7302IL.m89229bg(this.f16475bg)) {
                    InterfaceC7291iR interfaceC7291iR2 = this.f16473WR;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.f16475bg == null);
                    interfaceC7291iR2.mo84918bg(103, sb2.toString());
                    return;
                } else if (this.f16469Lq && !C7302IL.m89236bX(this.f16475bg)) {
                    InterfaceC7291iR interfaceC7291iR3 = this.f16473WR;
                    StringBuilder sb3 = new StringBuilder("choice ad data null is ");
                    sb3.append(this.f16475bg == null);
                    interfaceC7291iR3.mo84918bg(103, sb3.toString());
                    return;
                }
            } else if (mo84834bX() == 9 && !C7302IL.m89239IL(this.f16475bg)) {
                InterfaceC7291iR interfaceC7291iR4 = this.f16473WR;
                StringBuilder sb4 = new StringBuilder("data null is ");
                sb4.append(this.f16475bg == null);
                interfaceC7291iR4.mo84918bg(103, sb4.toString());
                return;
            }
            this.f16470PX.m89328zx().mo85762bg(this.f16476eo);
            if (this.f16476eo) {
                try {
                    this.f16474bX.m89405Ta();
                    this.f16470PX.m89328zx();
                    C7744VB.m87859bg(this.f16474bX.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e) {
                    C7566zx.m88531bg().m88523zx(this.f16474bX);
                    InterfaceC7291iR interfaceC7291iR5 = this.f16473WR;
                    interfaceC7291iR5.mo84918bg(102, "load exception is " + e.getMessage());
                    return;
                }
            }
            C7268eqN mo85663bg = mo85663bg();
            mo85663bg.m89405Ta();
            this.f16470PX.m89328zx();
            mo85663bg.m89402a_(this.f16468Kg);
            return;
        }
        InterfaceC7291iR interfaceC7291iR6 = this.f16473WR;
        StringBuilder sb5 = new StringBuilder("SSWebview null is ");
        sb5.append(mo85663bg() == null);
        sb5.append(" or Webview is null");
        interfaceC7291iR6.mo84918bg(102, sb5.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: WR */
    public void mo85667WR() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: eo */
    public void mo85655eo() {
    }

    /* renamed from: bg */
    public void m88539bg(boolean z) {
        this.f16471Ta = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7284VB
    /* renamed from: bg */
    public void mo85660bg(final C7297yDt c7297yDt) {
        if (c7297yDt == null) {
            if (this.f16473WR != null) {
                this.f16473WR.mo84918bg(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean m89263bX = c7297yDt.m89263bX();
        final float eqN = (float) c7297yDt.eqN();
        final float m89251zx = (float) c7297yDt.m89251zx();
        if (mo84834bX() == 0 && (eqN <= 0.0f || m89251zx <= 0.0f)) {
            if (this.f16473WR != null) {
                InterfaceC7291iR interfaceC7291iR = this.f16473WR;
                interfaceC7291iR.mo84918bg(105, "width is " + eqN + "height is " + m89251zx);
                return;
            }
            return;
        }
        this.f16467IL = m89263bX;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m88543bg(c7297yDt, eqN, m89251zx);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.zx.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC7563bg.this.m88543bg(c7297yDt, eqN, m89251zx);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m88543bg(C7297yDt c7297yDt, float f, float f2) {
        c7297yDt.m89265VB();
        boolean z = this.f16467IL;
        if (z && !this.f16471Ta) {
            m88548bg(f, f2);
            mo85662bg(this.eqN);
            if (this.f16473WR != null) {
                this.f16473WR.mo84917bg(mo85663bg(), c7297yDt);
                return;
            }
            return;
        }
        if (!z) {
            C7566zx.m88531bg().m88523zx(this.f16474bX);
        }
        m88547bg(c7297yDt.m89265VB(), c7297yDt.m89253eo());
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7284VB
    /* renamed from: bg */
    public void mo88545bg(View view, int i, InterfaceC7299bX interfaceC7299bX) {
        InterfaceC7279Kg interfaceC7279Kg = this.f16472VB;
        if (interfaceC7279Kg != null) {
            interfaceC7279Kg.mo85634bg(view, i, interfaceC7299bX);
        }
    }

    @UiThread
    /* renamed from: bg */
    private void m88548bg(float f, float f2) {
        this.f16470PX.m89328zx().mo85759zx();
        if (mo84834bX() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo85663bg().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            mo85663bg().setLayoutParams(layoutParams);
            return;
        }
        int m88675bg = (int) C7489Kg.m88675bg(this.ldr, f);
        int m88675bg2 = (int) C7489Kg.m88675bg(this.ldr, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mo85663bg().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(m88675bg, m88675bg2);
        }
        layoutParams2.width = m88675bg;
        layoutParams2.height = m88675bg2;
        mo85663bg().setLayoutParams(layoutParams2);
    }

    /* renamed from: bg */
    private void m88547bg(int i, String str) {
        if (this.f16473WR != null) {
            this.f16473WR.mo84918bg(i, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.InterfaceC7301bg
    /* renamed from: bg */
    public void mo88546bg(Activity activity) {
        if (this.yDt == 0 || activity == null || activity.hashCode() != this.yDt) {
            return;
        }
        eqN();
        mo85655eo();
    }

    /* renamed from: bg */
    public void m88540bg(JSONObject jSONObject) {
        this.f16475bg = jSONObject;
    }
}
