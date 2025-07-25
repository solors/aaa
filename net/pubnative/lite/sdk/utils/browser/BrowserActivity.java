package net.pubnative.lite.sdk.utils.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.core.C38563R;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class BrowserActivity extends Activity implements BrowserView {
    private static final String KEY_CTA_URL = "KEY_CTA_URL";
    private static final String TAG = "net.pubnative.lite.sdk.utils.browser.BrowserActivity";
    private BrowserPresenter browserPresenter;
    private View btnNavigationBackward;
    private View btnNavigationForward;
    private ProgressBar progressBar;
    private TextView tvHostname;
    private WebView webView;

    /* loaded from: classes10.dex */
    public interface WebViewCloseListener {
        void onWebViewCloseRequested();
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, BrowserActivity.class);
        intent.addFlags(536870912);
        intent.putExtra(KEY_CTA_URL, str);
        return intent;
    }

    private void initLogic() {
        BrowserPresenter browserPresenter;
        WebView webView = this.webView;
        if (webView != null && (browserPresenter = this.browserPresenter) != null) {
            browserPresenter.initWithView(this, webView);
        }
        String stringExtra = getIntent().getStringExtra(KEY_CTA_URL);
        BrowserPresenter browserPresenter2 = this.browserPresenter;
        if (browserPresenter2 != null) {
            browserPresenter2.loadUrl(stringExtra);
        }
    }

    private void initViews() {
        this.webView = (WebView) findViewById(C38563R.C38566id.webView);
        this.progressBar = (ProgressBar) findViewById(C38563R.C38566id.progressBar);
        findViewById(C38563R.C38566id.btnClose).setOnClickListener(new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.1
            {
                BrowserActivity.this = this;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                BrowserActivity.this.finish();
            }
        });
        findViewById(C38563R.C38566id.btnRefresh).setOnClickListener(new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.2
            {
                BrowserActivity.this = this;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                if (BrowserActivity.this.browserPresenter != null) {
                    BrowserActivity.this.browserPresenter.onReloadClicked();
                }
            }
        });
        View findViewById = findViewById(C38563R.C38566id.btnBackward);
        this.btnNavigationBackward = findViewById;
        findViewById.setOnClickListener(new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.3
            {
                BrowserActivity.this = this;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                if (BrowserActivity.this.browserPresenter != null) {
                    BrowserActivity.this.browserPresenter.onPageNavigationBackClicked();
                }
            }
        });
        View findViewById2 = findViewById(C38563R.C38566id.btnForward);
        this.btnNavigationForward = findViewById2;
        findViewById2.setOnClickListener(new DoubleClickPreventionListener() { // from class: net.pubnative.lite.sdk.utils.browser.BrowserActivity.4
            {
                BrowserActivity.this = this;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener
            protected void processClick() {
                if (BrowserActivity.this.browserPresenter != null) {
                    BrowserActivity.this.browserPresenter.onPageNavigationForwardClicked();
                }
            }
        });
        TextView textView = (TextView) findViewById(C38563R.C38566id.tvHostname);
        this.tvHostname = textView;
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: net.pubnative.lite.sdk.utils.browser.b
            {
                BrowserActivity.this = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$initViews$0;
                lambda$initViews$0 = BrowserActivity.this.lambda$initViews$0(view);
                return lambda$initViews$0;
            }
        });
    }

    private void initWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
    }

    public /* synthetic */ boolean lambda$initViews$0(View view) {
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onCopyHostnameClicked();
            return true;
        }
        return false;
    }

    public void onWebViewCloseRequested() {
        finish();
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void closeBrowser() {
        finish();
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void hideProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void launchExternalBrowser(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Logger.m14227e(TAG, "The url seems to be invalid while launching external browser");
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrowserCookieManager browserCookieManager = new BrowserCookieManager(CookieManager.getInstance());
        this.browserPresenter = new BrowserPresenter(new BrowserModel(new BaseWebViewClient(new WebViewCloseListener() { // from class: net.pubnative.lite.sdk.utils.browser.a
            {
                BrowserActivity.this = this;
            }

            @Override // net.pubnative.lite.sdk.utils.browser.BrowserActivity.WebViewCloseListener
            public final void onWebViewCloseRequested() {
                BrowserActivity.this.onWebViewCloseRequested();
            }
        }), new BaseWebChromeClient(), browserCookieManager), new UrlCreator(), (ClipboardManager) getApplication().getSystemService("clipboard"));
        setContentView(C38563R.C38567layout.activity_internal_browser);
        initViews();
        initWebView();
        initLogic();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
        }
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.dropView();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        BrowserPresenter browserPresenter = this.browserPresenter;
        if (browserPresenter != null) {
            browserPresenter.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void redirectToExternalApp(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Logger.m14227e(TAG, "The url seems to be invalid while redirecting to external app");
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationBackEnabled(boolean z) {
        View view = this.btnNavigationBackward;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void setPageNavigationForwardEnabled(boolean z) {
        View view = this.btnNavigationForward;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showConnectionSecure(boolean z) {
        int i;
        if (z) {
            i = C38563R.C38565drawable.browser_secure_connection;
        } else {
            i = 0;
        }
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showHostname(String str) {
        TextView textView = this.tvHostname;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void showProgressIndicator() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // net.pubnative.lite.sdk.utils.browser.BrowserView
    public void updateProgressIndicator(int i) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }
}
