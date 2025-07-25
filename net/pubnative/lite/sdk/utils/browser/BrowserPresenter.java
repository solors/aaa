package net.pubnative.lite.sdk.utils.browser;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.browser.BrowserModel;

/* loaded from: classes10.dex */
public class BrowserPresenter {
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BrowserPresenter";
    private final BrowserModel browserModel;
    private final BrowserModel.Callback browserModelCallback;
    private BrowserView browserView;
    private final ClipboardManager clipboardManager;
    private final UrlCreator urlCreator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BrowserPresenter(BrowserModel browserModel, UrlCreator urlCreator, ClipboardManager clipboardManager) {
        BrowserModel.Callback callback = new BrowserModel.Callback() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserPresenter.1
            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onPageNavigationStackChanged(boolean z, boolean z2) {
                BrowserPresenter.this.updateNavigationUiControls(z, z2);
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onProgressChanged(int i) {
                if (BrowserPresenter.this.browserView != null && i >= 0 && i <= 100) {
                    if (i == 100) {
                        BrowserPresenter.this.browserView.hideProgressIndicator();
                        return;
                    }
                    BrowserPresenter.this.browserView.updateProgressIndicator(i);
                    BrowserPresenter.this.browserView.showProgressIndicator();
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            @TargetApi(26)
            public void onRenderProcessGone() {
                if (BrowserPresenter.this.browserView != null) {
                    BrowserPresenter.this.browserView.closeBrowser();
                }
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onUrlLoadingStarted(String str) {
                BrowserPresenter.this.updateHostnameAndSchemeControls(str);
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public boolean shouldOverrideUrlLoading(String str) {
                BrowserPresenter.this.loadUrl(str);
                return true;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            @TargetApi(23)
            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserModel.Callback
            public void onGeneralError(int i, String str, String str2) {
            }
        };
        this.browserModelCallback = callback;
        if (browserModel != null) {
            this.browserModel = browserModel;
            if (urlCreator != null) {
                this.urlCreator = urlCreator;
                if (clipboardManager != null) {
                    this.clipboardManager = clipboardManager;
                    browserModel.setBrowserModelCallback(callback);
                    return;
                }
                throw new NullPointerException("clipboardManager can not be null");
            }
            throw new NullPointerException("urlCreator can not be null");
        }
        throw new NullPointerException("browserModel can not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHostnameAndSchemeControls(String str) {
        if (this.browserView == null) {
            return;
        }
        this.browserView.showHostname(this.urlCreator.extractHostname(str));
        this.browserView.showConnectionSecure(this.urlCreator.isSecureScheme(this.urlCreator.extractScheme(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigationUiControls(boolean z, boolean z2) {
        BrowserView browserView = this.browserView;
        if (browserView == null) {
            return;
        }
        browserView.setPageNavigationBackEnabled(z);
        this.browserView.setPageNavigationForwardEnabled(z2);
    }

    public void dropView() {
        this.browserView = null;
    }

    public void initWithView(BrowserView browserView, WebView webView) {
        if (browserView != null && webView != null) {
            this.browserView = browserView;
            this.browserModel.setWebView(webView);
        }
    }

    public void loadUrl(String str) {
        this.browserModel.load(str);
    }

    public void onCopyHostnameClicked() {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText(null, this.browserModel.getCurrentUrl()));
        Logger.m14229d(TAG, "Link copied");
    }

    public void onPageNavigationBackClicked() {
        this.browserModel.goBack();
    }

    public void onPageNavigationForwardClicked() {
        this.browserModel.goForward();
    }

    public void onPause() {
        this.browserModel.pause();
    }

    public void onReloadClicked() {
        this.browserModel.reload();
    }

    public void onResume() {
        this.browserModel.resume();
    }
}
