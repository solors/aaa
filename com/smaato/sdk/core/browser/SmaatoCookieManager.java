package com.smaato.sdk.core.browser;

import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public class SmaatoCookieManager {
    @NonNull
    private final CookieManager cookieManager;
    @NonNull
    private final CookieSyncManagerHolder cookieSyncManagerHolder;

    public SmaatoCookieManager(@NonNull CookieManager cookieManager, @NonNull CookieSyncManagerHolder cookieSyncManagerHolder) {
        this.cookieManager = (CookieManager) Objects.requireNonNull(cookieManager, "Parameter cookieManager cannot be null for SmaatoCookieManager::new");
        this.cookieSyncManagerHolder = (CookieSyncManagerHolder) Objects.requireNonNull(cookieSyncManagerHolder, "Parameter cookieSyncManagerHolder cannot be null for SmaatoCookieManager::new");
    }

    private void callOnCookieSyncManager(@NonNull Consumer<CookieSyncManager> consumer) {
        CookieSyncManager cookieSyncManager = this.cookieSyncManagerHolder.getCookieSyncManager();
        if (cookieSyncManager != null) {
            consumer.accept(cookieSyncManager);
            return;
        }
        throw new IllegalStateException("CookieSyncManager is expected to be present on API < 21");
    }

    public void forceCookieSync() {
        this.cookieManager.flush();
    }

    public void setupCookiePolicy(@NonNull WebView webView) {
        Objects.requireNonNull(webView, "Parameter webView cannot be null for SmaatoCookieManager::setupCookiePolicy");
        this.cookieManager.setAcceptThirdPartyCookies(webView, true);
    }

    public void startSync() {
    }

    public void stopSync() {
    }
}
