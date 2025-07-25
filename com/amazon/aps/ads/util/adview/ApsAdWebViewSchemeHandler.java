package com.amazon.aps.ads.util.adview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.amazon.aps.ads.util.ApsAdExtensions;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.device.ads.DtbConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApsAdWebViewSchemeHandler.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsAdWebViewSchemeHandler {
    @NotNull
    private final String AMAZON_SCHEME;
    @NotNull
    private final String MARKET_SCHEME;
    @NotNull
    private final String MOBILE_SHOPPING_SCHEME;
    @NotNull
    private final String MOBILE_SHOPPING_WEB_SCHEME;
    @NotNull
    private final String MSHOP_PKG_NAME;
    @NotNull
    private final ApsAdWebViewClientListener webviewClientListener;

    public ApsAdWebViewSchemeHandler(@NotNull ApsAdWebViewClientListener webviewClientListener) {
        Intrinsics.checkNotNullParameter(webviewClientListener, "webviewClientListener");
        this.webviewClientListener = webviewClientListener;
        this.MSHOP_PKG_NAME = "com.amazon.mShop.android.shopping";
        this.MOBILE_SHOPPING_WEB_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_WEB_SCHEME;
        this.MOBILE_SHOPPING_SCHEME = ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME;
        this.MARKET_SCHEME = ApsAdWebViewSupportClient.MARKET_SCHEME;
        this.AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;
    }

    protected boolean handleMarketAndAmazonScheme(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                this.webviewClientListener.getAdViewContext().startActivity(intent);
                this.webviewClientListener.onAdLeftApplication();
                return true;
            } catch (ActivityNotFoundException unused) {
                ApsUtils.Companion.directAppStoreLinkToBrowser(this.webviewClientListener.getAdViewContext(), uri);
                this.webviewClientListener.onAdLeftApplication();
                return true;
            }
        } catch (RuntimeException unused2) {
            ApsAdExtensions.m102708d(this, "App stores and browsers not found");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
        r9 = kotlin.text.C37690r.m16566e0(r8, "products/", 0, false, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean handleMshopApp(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull android.net.Uri r9) {
        /*
            r7 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r0.setData(r9)
            com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener r9 = r7.webviewClientListener
            android.content.Context r9 = r9.getAdViewContext()
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.lang.String r1 = r7.MSHOP_PKG_NAME
            android.content.Intent r9 = r9.getLaunchIntentForPackage(r1)
            if (r9 != 0) goto L4e
            java.lang.String r2 = "products/"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            int r9 = kotlin.text.C37686h.m16690e0(r1, r2, r3, r4, r5, r6)
            if (r9 <= 0) goto L4e
            int r9 = r9 + 9
            java.lang.String r8 = r8.substring(r9)
            java.lang.String r9 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.String r9 = "https://www.amazon.com/dp/"
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.m17064q(r9, r8)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.setData(r8)
        L4e:
            com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener r8 = r7.webviewClientListener
            android.content.Context r8 = r8.getAdViewContext()
            r8.startActivity(r0)
            com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener r8 = r7.webviewClientListener
            r8.onAdLeftApplication()
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.ads.util.adview.ApsAdWebViewSchemeHandler.handleMshopApp(java.lang.String, android.net.Uri):boolean");
    }

    protected boolean handleMshopWeb(@NotNull String url) {
        int m16566e0;
        int i;
        Intrinsics.checkNotNullParameter(url, "url");
        m16566e0 = C37690r.m16566e0(url, "//", 0, false, 6, null);
        if (m16566e0 >= 0 && (i = m16566e0 + 2) < url.length()) {
            String substring = url.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            this.webviewClientListener.getAdViewContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.m17064q(DtbConstants.HTTPS, substring))));
            this.webviewClientListener.onAdLeftApplication();
            return true;
        }
        return false;
    }

    protected boolean launchIntent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.webviewClientListener.getAdViewContext().startActivity(intent);
        this.webviewClientListener.onAdLeftApplication();
        return true;
    }

    public final boolean openUrl(@NotNull String url) {
        boolean m17075f;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = uri(url);
            if (uri != null && uri.getScheme() != null) {
                String scheme = uri.getScheme();
                if (Intrinsics.m17075f(scheme, this.MOBILE_SHOPPING_WEB_SCHEME)) {
                    return handleMshopWeb(url);
                }
                if (Intrinsics.m17075f(scheme, this.MOBILE_SHOPPING_SCHEME)) {
                    return handleMshopApp(url, uri);
                }
                if (Intrinsics.m17075f(scheme, this.MARKET_SCHEME)) {
                    m17075f = true;
                } else {
                    m17075f = Intrinsics.m17075f(scheme, this.AMAZON_SCHEME);
                }
                if (m17075f) {
                    return handleMarketAndAmazonScheme(uri);
                }
                return launchIntent(uri);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    protected Uri uri(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
        return parse;
    }
}
