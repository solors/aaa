package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.qj */
/* loaded from: classes6.dex */
public interface InterfaceC20705qj {

    @Metadata
    /* renamed from: com.ironsource.qj$a */
    /* loaded from: classes6.dex */
    public static final class C20706a implements InterfaceC20705qj {
        @Nullable

        /* renamed from: a */
        private WebView f52603a;

        /* renamed from: b */
        private boolean f52604b;

        public C20706a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        /* renamed from: b */
        private final void m55611b(String str) {
            WebView webView = this.f52603a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        /* renamed from: c */
        private final void m55610c(String str) {
            WebView webView = this.f52603a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC20705qj
        /* renamed from: a */
        public void mo55613a(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.f52603a = webView;
        }

        public C20706a(int i) {
            this.f52604b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC20705qj
        /* renamed from: a */
        public void mo55612a(@NotNull String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.f52604b) {
                    m55611b(script);
                } else {
                    m55610c(script);
                }
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                this.f52604b = false;
                m55610c(script);
            }
        }

        public /* synthetic */ C20706a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC20705qj
        /* renamed from: a */
        public boolean mo55614a() {
            return this.f52603a != null;
        }
    }

    /* renamed from: a */
    void mo55613a(@NotNull WebView webView);

    /* renamed from: a */
    void mo55612a(@NotNull String str);

    /* renamed from: a */
    boolean mo55614a();
}
