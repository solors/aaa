package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.impl.ec2;
import com.yandex.mobile.ads.impl.id1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class ac1 extends AbstractC31754wj implements je0, id1.InterfaceC30548b, ec2.InterfaceC30229a {

    /* renamed from: i */
    private static boolean f76755i;
    @NotNull

    /* renamed from: b */
    private final ec2 f76756b;
    @NotNull

    /* renamed from: c */
    private final id1 f76757c;
    @NotNull

    /* renamed from: d */
    private final nu1 f76758d;
    @Nullable

    /* renamed from: e */
    private le0 f76759e;
    @Nullable

    /* renamed from: f */
    private ke0 f76760f;

    /* renamed from: g */
    private boolean f76761g;

    /* renamed from: h */
    private boolean f76762h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ac1(android.content.Context r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.yandex.mobile.ads.impl.ec2 r1 = new com.yandex.mobile.ads.impl.ec2
            r1.<init>()
            com.yandex.mobile.ads.impl.id1$a r2 = com.yandex.mobile.ads.impl.id1.f80423h
            com.yandex.mobile.ads.impl.id1 r2 = r2.m33296a(r0)
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ac1.<init>(android.content.Context):void");
    }

    /* renamed from: h */
    public static /* synthetic */ void m35920h(ac1 ac1Var) {
        m35922a(ac1Var);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void mo35923a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        if (C30155da.m34983a(21)) {
            settings.setMixedContentMode(2);
        }
        WebSettings settings2 = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "getSettings(...)");
        settings2.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new ie0(this, so1.m29571b()));
        setWebChromeClient(new de0());
    }

    @Override // com.yandex.mobile.ads.impl.ec2.InterfaceC30229a
    /* renamed from: b */
    public final boolean mo34637b() {
        return this.f76762h;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31754wj
    @NotNull
    /* renamed from: c */
    public String mo27886c() {
        String m28361a = vd2.m28361a();
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + m28361a;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31754wj
    /* renamed from: d */
    public void mo27885d() {
        setHtmlWebViewListener(null);
        super.mo27885d();
    }

    /* renamed from: h */
    protected abstract void mo28770h();

    @Nullable
    /* renamed from: i */
    public le0 mo34634i() {
        return this.f76759e;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f76762h = true;
        this.f76757c.m33302a(this);
        this.f76756b.getClass();
        m35921a(ec2.m34638a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f76762h = false;
        this.f76756b.getClass();
        m35921a(ec2.m34638a(this));
        this.f76757c.m33299b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(@NotNull View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        this.f76756b.getClass();
        m35921a(ec2.m34638a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f76756b.getClass();
        m35921a(ec2.m34638a(this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable ke0 ke0Var) {
        this.f76760f = ke0Var;
    }

    public void setHtmlWebViewListener(@Nullable le0 le0Var) {
        this.f76759e = le0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(@NotNull Context context, @NotNull Context appContext, @NotNull ec2 viewableChecker, @NotNull id1 phoneStateTracker) {
        super(appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f76756b = viewableChecker;
        this.f76757c = phoneStateTracker;
        this.f76758d = new nu1();
        mo35923a(context);
        if (f76755i) {
            return;
        }
        f76755i = true;
    }

    /* renamed from: a */
    private final void m35921a(boolean z) {
        if (this.f76761g != z) {
            this.f76761g = z;
            le0 mo34634i = mo34634i();
            if (mo34634i != null) {
                mo34634i.mo28925a(this.f76761g);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public void mo30793a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        le0 mo34634i = mo34634i();
        if (mo34634i != null) {
            mo34634i.mo28926a(url);
        }
    }

    @Override // com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public void mo30550a() {
        this.f76758d.m31279a(new Runnable() { // from class: com.yandex.mobile.ads.impl.pj2
            @Override // java.lang.Runnable
            public final void run() {
                ac1.m35920h(ac1.this);
            }
        });
    }

    /* renamed from: a */
    public static final void m35922a(ac1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mo28770h();
    }

    @Override // com.yandex.mobile.ads.impl.id1.InterfaceC30548b
    /* renamed from: a */
    public final void mo31161a(@NotNull fd1 phoneState) {
        boolean z;
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        if (phoneState != fd1.f79053c) {
            this.f76756b.getClass();
            if (ec2.m34638a(this) && this.f76757c.m33300b()) {
                z = true;
                m35921a(z);
            }
        }
        z = false;
        m35921a(z);
    }

    @Override // com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public void mo30549a(int i) {
        ke0 ke0Var = this.f76760f;
        if (ke0Var != null) {
            ke0Var.mo30426a(i);
        }
    }
}
