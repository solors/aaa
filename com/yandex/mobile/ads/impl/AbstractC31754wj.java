package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.C21114v8;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wj */
/* loaded from: classes8.dex */
public abstract class AbstractC31754wj extends WebView {
    @NotNull

    /* renamed from: a */
    public final LinkedHashMap f87282a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31754wj(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87282a = new LinkedHashMap();
        m27882g();
    }

    /* renamed from: a */
    private final String m27888a(String str) {
        String mo27886c = mo27886c();
        return str + mo27886c + "<body style='margin:0; padding:0;'>";
    }

    /* renamed from: g */
    private final void m27882g() {
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setAllowFileAccess(false);
        if (C30155da.m34983a(11)) {
            settings.setAllowContentAccess(false);
            if (C30155da.m34983a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void addJavascriptInterface(@NotNull Object any, @NotNull String jsName) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        super.addJavascriptInterface(any, jsName);
        this.f87282a.put(jsName, any);
    }

    /* renamed from: b */
    public final void m27887b(@NotNull String sourcePageData) {
        Intrinsics.checkNotNullParameter(sourcePageData, "sourcePageData");
        loadDataWithBaseURL("https://yandex.ru", m27888a(sourcePageData), "text/html", "UTF-8", null);
    }

    @NotNull
    /* renamed from: c */
    public String mo27886c() {
        return "";
    }

    /* renamed from: d */
    public void mo27885d() {
        cc2.m35255a((ViewGroup) this);
        for (String str : this.f87282a.keySet()) {
            removeJavascriptInterface(str);
        }
        this.f87282a.clear();
        destroy();
        um0.m28723f(getClass().toString());
    }

    /* renamed from: e */
    public final void m27884e() {
        int i = C30079ca.f77562b;
        try {
            WebView.class.getDeclaredMethod(C21114v8.C21122h.f54092t0, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        um0.m28725d(getClass().toString());
    }

    /* renamed from: f */
    public final void m27883f() {
        int i = C30079ca.f77562b;
        try {
            WebView.class.getDeclaredMethod(C21114v8.C21122h.f54094u0, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        um0.m28725d(getClass().toString());
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(@NotNull String jsName) {
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        if (C30155da.m34983a(11)) {
            super.removeJavascriptInterface(jsName);
        }
    }

    public final void setDisplayZoomControls(boolean z) {
        if (C30155da.m34983a(11)) {
            getSettings().setDisplayZoomControls(z);
        }
    }
}
