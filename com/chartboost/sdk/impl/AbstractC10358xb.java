package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.chartboost.sdk.impl.xb */
/* loaded from: classes3.dex */
public abstract class AbstractC10358xb extends RelativeLayout {

    /* renamed from: a */
    public C10110p2 f23546a;

    /* renamed from: b */
    public WebChromeClient f23547b;

    /* renamed from: c */
    public RelativeLayout f23548c;

    /* renamed from: d */
    public EnumC9734b8 f23549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10358xb(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    /* renamed from: a */
    public void mo80060a() {
        Unit unit;
        C10110p2 c10110p2 = this.f23546a;
        if (c10110p2 == null) {
            C9763c7.m81922a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.f23548c;
        if (relativeLayout != null) {
            relativeLayout.removeView(c10110p2);
            removeView(relativeLayout);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            C9763c7.m81922a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        C10110p2 c10110p22 = this.f23546a;
        if (c10110p22 != null) {
            c10110p22.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            c10110p22.onPause();
            c10110p22.removeAllViews();
            c10110p22.destroy();
        }
        removeAllViews();
    }

    @Nullable
    public final EnumC9734b8 getLastOrientation() {
        return this.f23549d;
    }

    @Nullable
    public final WebChromeClient getWebChromeClient() {
        return this.f23547b;
    }

    @Nullable
    public final C10110p2 getWebView() {
        return this.f23546a;
    }

    @Nullable
    public final RelativeLayout getWebViewContainer() {
        return this.f23548c;
    }

    public final void setLastOrientation(@Nullable EnumC9734b8 enumC9734b8) {
        this.f23549d = enumC9734b8;
    }

    public final void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.f23547b = webChromeClient;
    }

    public final void setWebView(@Nullable C10110p2 c10110p2) {
        this.f23546a = c10110p2;
    }

    public final void setWebViewContainer(@Nullable RelativeLayout relativeLayout) {
        this.f23548c = relativeLayout;
    }
}
