package com.smaato.sdk.core.browser;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.browser.BrowserModel;
import com.smaato.sdk.core.browser.BrowserPresenter;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* renamed from: com.smaato.sdk.core.browser.i */
/* loaded from: classes7.dex */
public class BrowserPresenter {
    @NonNull

    /* renamed from: a */
    private final Logger f71427a;
    @NonNull

    /* renamed from: b */
    private final BrowserModel f71428b;
    @NonNull

    /* renamed from: c */
    private final UrlCreator f71429c;
    @NonNull

    /* renamed from: d */
    private final LinkHandler f71430d;
    @NonNull

    /* renamed from: e */
    private final ClipboardManager f71431e;
    @Nullable

    /* renamed from: f */
    private BrowserView f71432f;
    @NonNull

    /* renamed from: g */
    private final BrowserModel.Callback f71433g;

    public BrowserPresenter(@NonNull Logger logger, @NonNull BrowserModel browserModel, @NonNull UrlCreator urlCreator, @NonNull LinkHandler linkHandler, @NonNull ClipboardManager clipboardManager) {
        C27042a c27042a = new C27042a();
        this.f71433g = c27042a;
        this.f71427a = (Logger) Objects.requireNonNull(logger, "Parameter logger cannot be null for BrowserPresenter::new");
        this.f71428b = (BrowserModel) Objects.requireNonNull(browserModel, "Parameter browserModel cannot be null for BrowserPresenter::new");
        this.f71429c = (UrlCreator) Objects.requireNonNull(urlCreator, "Parameter urlCreator cannot be null for BrowserPresenter::new");
        this.f71430d = (LinkHandler) Objects.requireNonNull(linkHandler, "Parameter linkHandler cannot be null for BrowserPresenter::new");
        this.f71431e = (ClipboardManager) Objects.requireNonNull(clipboardManager, "Parameter clipboardManager cannot be null for BrowserPresenter::new");
        browserModel.m39711m(c27042a);
    }

    /* renamed from: r */
    public void m39669r(@NonNull String str) {
        if (this.f71432f == null) {
            return;
        }
        this.f71432f.showHostname(this.f71429c.extractHostname(str));
        this.f71432f.showConnectionSecure(this.f71429c.isSecureScheme(this.f71429c.extractScheme(str)));
    }

    /* renamed from: s */
    public void m39668s(boolean z, boolean z2) {
        BrowserView browserView = this.f71432f;
        if (browserView == null) {
            return;
        }
        browserView.setPageNavigationBackEnabled(z);
        this.f71432f.setPageNavigationForwardEnabled(z2);
    }

    /* renamed from: f */
    public void m39681f() {
        this.f71432f = null;
    }

    /* renamed from: g */
    public void m39680g(@NonNull BrowserView browserView, @NonNull WebView webView) {
        this.f71432f = (BrowserView) Objects.requireNonNull(browserView, "Parameter browserView cannot be null for BrowserPresenter::initWithView");
        Objects.requireNonNull(webView, "Parameter webView cannot be null for BrowserPresenter::initWithView");
        this.f71428b.m39710n(webView);
    }

    /* renamed from: h */
    public void m39679h(@NonNull String str) {
        this.f71428b.m39715i(str);
    }

    /* renamed from: i */
    public void m39678i() {
        this.f71431e.setPrimaryClip(ClipData.newPlainText(null, this.f71428b.m39718f()));
        this.f71427a.debug(LogDomain.BROWSER, "Link copied", new Object[0]);
    }

    /* renamed from: j */
    public void m39677j() {
        String m39718f;
        if (this.f71432f == null || (m39718f = this.f71428b.m39718f()) == null) {
            return;
        }
        this.f71430d.lambda$handleUrlOnBackGround$2(m39718f, null, null);
        this.f71432f.closeBrowser();
    }

    /* renamed from: k */
    public void m39676k() {
        this.f71428b.m39717g();
    }

    /* renamed from: l */
    public void m39675l() {
        this.f71428b.m39716h();
    }

    /* renamed from: m */
    public void m39674m() {
        this.f71428b.m39714j();
    }

    /* renamed from: n */
    public void m39673n() {
        this.f71428b.m39713k();
    }

    /* renamed from: o */
    public void m39672o() {
        this.f71428b.m39712l();
    }

    /* renamed from: p */
    public void m39671p() {
        this.f71428b.m39709o();
    }

    /* renamed from: q */
    public void m39670q() {
        this.f71428b.m39708p();
    }

    /* compiled from: BrowserPresenter.java */
    /* renamed from: com.smaato.sdk.core.browser.i$a */
    /* loaded from: classes7.dex */
    public class C27042a implements BrowserModel.Callback {
        C27042a() {
            BrowserPresenter.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m39667a(C27042a c27042a, Intent intent) {
            c27042a.m39662f(intent);
        }

        /* renamed from: b */
        public static /* synthetic */ void m39666b(C27042a c27042a, String str) {
            c27042a.m39660h(str);
        }

        /* renamed from: c */
        public static /* synthetic */ void m39665c(C27042a c27042a, Intent intent, BrowserView browserView) {
            c27042a.m39663e(intent, browserView);
        }

        /* renamed from: d */
        public static /* synthetic */ void m39664d(C27042a c27042a, String str, BrowserView browserView) {
            c27042a.m39661g(str, browserView);
        }

        /* renamed from: e */
        public /* synthetic */ void m39663e(Intent intent, BrowserView browserView) {
            BrowserPresenter.this.f71427a.debug(LogDomain.BROWSER, "Redirecting to the external app: %s", intent.toString());
            browserView.redirectToExternalApp(intent);
        }

        /* renamed from: f */
        public /* synthetic */ void m39662f(final Intent intent) {
            Objects.onNotNull(BrowserPresenter.this.f71432f, new Consumer() { // from class: com.smaato.sdk.core.browser.h
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    BrowserPresenter.C27042a.m39665c(BrowserPresenter.C27042a.this, intent, (BrowserView) obj);
                }
            });
        }

        /* renamed from: g */
        public /* synthetic */ void m39661g(String str, BrowserView browserView) {
            BrowserPresenter.this.f71427a.debug(LogDomain.BROWSER, "Redirecting to other url: %s", str);
            BrowserPresenter.this.m39679h(str);
        }

        /* renamed from: h */
        public /* synthetic */ void m39660h(final String str) {
            Objects.onNotNull(BrowserPresenter.this.f71432f, new Consumer() { // from class: com.smaato.sdk.core.browser.g
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    BrowserPresenter.C27042a.m39664d(BrowserPresenter.C27042a.this, str, (BrowserView) obj);
                }
            });
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        public void onPageNavigationStackChanged(boolean z, boolean z2) {
            BrowserPresenter.this.m39668s(z, z2);
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        public void onProgressChanged(int i) {
            if (BrowserPresenter.this.f71432f == null) {
                return;
            }
            if (i == 100) {
                BrowserPresenter.this.f71432f.hideProgressIndicator();
                return;
            }
            BrowserPresenter.this.f71432f.updateProgressIndicator(i);
            BrowserPresenter.this.f71432f.showProgressIndicator();
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        @TargetApi(26)
        public void onRenderProcessGone() {
            Objects.onNotNull(BrowserPresenter.this.f71432f, new Consumer() { // from class: com.smaato.sdk.core.browser.f
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((BrowserView) obj).closeBrowser();
                }
            });
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        public void onUrlLoadingStarted(@NonNull String str) {
            BrowserPresenter.this.m39669r(str);
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        public boolean shouldOverrideUrlLoading(@NonNull String str) {
            Either<Intent, String> findExternalAppForUrl = BrowserPresenter.this.f71430d.findExternalAppForUrl(str);
            if (findExternalAppForUrl == null) {
                return false;
            }
            Objects.onNotNull(findExternalAppForUrl.left(), new Consumer() { // from class: com.smaato.sdk.core.browser.d
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    BrowserPresenter.C27042a.m39667a(BrowserPresenter.C27042a.this, (Intent) obj);
                }
            });
            Objects.onNotNull(findExternalAppForUrl.right(), new Consumer() { // from class: com.smaato.sdk.core.browser.e
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    BrowserPresenter.C27042a.m39666b(BrowserPresenter.C27042a.this, (String) obj);
                }
            });
            return true;
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        @TargetApi(23)
        public void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
        }

        @Override // com.smaato.sdk.core.browser.BrowserModel.Callback
        public void onGeneralError(int i, @NonNull String str, @NonNull String str2) {
        }
    }
}
