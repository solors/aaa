package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import java.util.Locale;

/* loaded from: classes10.dex */
public class UrlHandler {
    private static final String TAG = "UrlHandler";
    private final IntentHandler mIntentHandler;

    public UrlHandler(Context context) {
        this.mIntentHandler = new IntentHandler(context);
    }

    public void handleUrl(String str, String str2) {
        if (str == null) {
            return;
        }
        String str3 = TAG;
        Logger.m14229d(str3, "Handling url: " + str);
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String lowerCase = parse.toString().toLowerCase(Locale.ROOT);
        if (!"play.google.com".equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host) && !ApsAdWebViewSupportClient.MARKET_SCHEME.equalsIgnoreCase(scheme) && !lowerCase.startsWith("play.google.com") && !lowerCase.startsWith("market.android.com/")) {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (!TextUtils.isEmpty(scheme)) {
                    this.mIntentHandler.handleDeepLink(parse);
                    return;
                }
                return;
            } else if (str2 != null && str2.equalsIgnoreCase("internal")) {
                this.mIntentHandler.handleBrowserLinkBrowserActivity(parse);
                return;
            } else {
                this.mIntentHandler.handleBrowserLink(parse);
                return;
            }
        }
        this.mIntentHandler.handleDeepLink(parse);
    }
}
