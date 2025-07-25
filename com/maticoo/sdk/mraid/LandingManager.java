package com.maticoo.sdk.mraid;

import android.net.Uri;
import com.maticoo.sdk.mraid.utils.Utils;

/* loaded from: classes6.dex */
public class LandingManager {
    public static final String GOOGLE_PLAY_PKG_NAME = "com.android.vending";
    private static final String GP_HOST = "play.google.com";
    private static final String GP_MARKET_SCHEMA = "market";
    private static final String TAG = "LandingManager";

    public static boolean isDeepLink(String str) {
        if (!Utils.isNullOrEmpty(str) && (isGooglePlayUrl(str) || isDeepLinkUrl(str))) {
            return true;
        }
        return false;
    }

    public static boolean isDeepLinkUrl(String str) {
        try {
            Uri parse = Uri.parse(str);
            if ("http".equalsIgnoreCase(parse.getScheme())) {
                return false;
            }
            if ("https".equalsIgnoreCase(parse.getScheme())) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isGooglePlayUrl(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"market".equalsIgnoreCase(parse.getScheme())) {
                if (!GP_HOST.equalsIgnoreCase(parse.getHost())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWebViewPossibleCrashDeepLink(String str) {
        return false;
    }
}
