package com.maticoo.sdk.p405ad.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.p405ad.utils.webview.GPWebViewClient;
import com.maticoo.sdk.p405ad.utils.webview.TrackWebViewClient;
import com.maticoo.sdk.p405ad.utils.webview.WebViewUrlMonitor;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.ViewUtils;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import java.util.List;

/* renamed from: com.maticoo.sdk.ad.utils.GpUtil */
/* loaded from: classes6.dex */
public class GpUtil {
    private static final String PACKAGE_GOOGLE_PLAY = "com.android.vending";
    private static final String TAG = "GpUtil";
    @SuppressLint({"StaticFieldLeak"})
    private static WebView bgWebView;

    public static String getInstalledBrowserPackageName() {
        try {
            PackageManager packageManager = ApplicationUtil.getInstance().getApplicationContext().getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("http://"));
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                return queryIntentActivities.get(0).activityInfo.packageName;
            }
            return null;
        } catch (Exception e) {
            DeveloperLog.LogD("getInstalledBrowserList", e);
            CrashUtil.getSingleton().reportSDKException(e, TAG);
            return null;
        }
    }

    public static boolean goGp(Context context, String str) {
        Intent intent;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (!str.startsWith("intent://")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(parse);
                    intent2.setFlags(268435456);
                    if (isGoogleStoreInstalled()) {
                        intent2.setPackage("com.android.vending");
                    }
                    context.startActivity(intent2);
                    return true;
                }
                try {
                    intent = parseIntent(str);
                    if (intent != null) {
                        try {
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                            return true;
                        } catch (ActivityNotFoundException e) {
                            e = e;
                            DeveloperLog.LogD(TAG, e);
                            CrashUtil.getSingleton().reportSDKException(e, TAG);
                            if (intent != null && intent.getExtras() != null) {
                                String str2 = "market://details?id=" + intent.getPackage() + "&referrer=" + intent.getExtras().getString("market_referrer");
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                intent3.setData(Uri.parse(str2));
                                intent3.setFlags(268435456);
                                if (isGoogleStoreInstalled()) {
                                    intent3.setPackage("com.android.vending");
                                }
                                context.startActivity(intent3);
                                return true;
                            }
                            return false;
                        }
                    }
                } catch (ActivityNotFoundException e2) {
                    e = e2;
                    intent = null;
                }
            } catch (Exception e3) {
                DeveloperLog.LogD(TAG, e3);
                CrashUtil.getSingleton().reportSDKException(e3, TAG);
            }
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

    private static boolean isGoogleStoreInstalled() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(applicationContext.getPackageManager()) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            CrashUtil.getSingleton().reportSDKException(e, TAG);
            return false;
        }
    }

    public static boolean isGp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String lowerCase = lowerCase(parse.getScheme());
            String lowerCase2 = lowerCase(parse.getHost());
            if (!ApsAdWebViewSupportClient.MARKET_SCHEME.equals(lowerCase) && !"play.google.com".equals(lowerCase2)) {
                if (!"mobile.gmarket.co.kr".equals(lowerCase2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            DeveloperLog.LogD(TAG, e);
            CrashUtil.getSingleton().reportSDKException(e, TAG);
            return false;
        }
    }

    public static boolean isHttpUrl(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"http".equalsIgnoreCase(parse.getScheme())) {
                if (!"https".equalsIgnoreCase(parse.getScheme())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void lambda$parseDeepLinkAndOpen$0(boolean z) {
        WebView webView = bgWebView;
        if (webView != null) {
            ViewUtils.webViewDestroy(webView, new String[0]);
        }
    }

    public static /* synthetic */ void lambda$parseDeepLinkAndOpen$1(Context context, String str, GPWebViewClient.FinishListener finishListener, AdBean adBean) {
        int i;
        WebView webView = bgWebView;
        if (webView != null) {
            ViewUtils.webViewDestroy(webView, new String[0]);
        }
        WebView webView2 = new WebView(context);
        bgWebView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        bgWebView.getSettings().setMixedContentMode(0);
        bgWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        GPWebViewClient gPWebViewClient = new GPWebViewClient(str, finishListener);
        if (adBean.getBidBean().getLandingType() == 3) {
            gPWebViewClient.setMonitor(new WebViewUrlMonitor(adBean.getBidBean().getCrid()));
        }
        bgWebView.setWebViewClient(gPWebViewClient);
        bgWebView.loadUrl(str);
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value != null) {
            i = value.getClickTimeOut();
        } else {
            i = 10;
        }
        gPWebViewClient.startTimer(i * 1000);
    }

    public static /* synthetic */ void lambda$trackClickThroughUrl$2(Context context, String str) {
        WebView webView = bgWebView;
        if (webView != null) {
            ViewUtils.webViewDestroy(webView, new String[0]);
        }
        WebView webView2 = new WebView(context);
        bgWebView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        bgWebView.getSettings().setMixedContentMode(0);
        bgWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        bgWebView.setWebViewClient(new TrackWebViewClient());
        bgWebView.loadUrl(str);
    }

    private static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static boolean openDeepLink(Context context, String str) {
        Intent parseIntent;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (str.startsWith("intent://") && (parseIntent = parseIntent(str)) != null) {
                    parseIntent.setFlags(268435456);
                    context.startActivity(parseIntent);
                    return true;
                }
                DeveloperLog.LogD("LandingManager::parseClickUrl::" + str);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                DeveloperLog.LogD(TAG, "openDeepLink failed::" + th.getMessage());
            }
        }
        return false;
    }

    public static boolean openGooglePlay(Context context, String str) {
        Intent intent;
        if (context != null && !TextUtils.isEmpty(str)) {
            if (!str.startsWith("intent://")) {
                try {
                    Uri parse = Uri.parse(str);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(parse);
                    intent2.setFlags(268435456);
                    intent2.setPackage("com.android.vending");
                    context.startActivity(intent2);
                    return true;
                } catch (Throwable th) {
                    DeveloperLog.LogD(TAG, th);
                    CrashUtil.getSingleton().reportSDKException(th, TAG);
                    return false;
                }
            }
            try {
                intent = parseIntent(str);
                if (intent != null) {
                    try {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        DeveloperLog.LogD(TAG, th);
                        CrashUtil.getSingleton().reportSDKException(th, TAG);
                        if (intent != null && intent.getExtras() != null) {
                            String str2 = "market://details?id=" + intent.getPackage() + "&referrer=" + intent.getExtras().getString("market_referrer");
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setData(Uri.parse(str2));
                            intent3.setFlags(268435456);
                            intent3.setPackage("com.android.vending");
                            try {
                                context.startActivity(intent3);
                                return true;
                            } catch (Throwable unused) {
                                DeveloperLog.LogD(TAG, th);
                                CrashUtil.getSingleton().reportSDKException(th, TAG);
                            }
                        }
                        return false;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                intent = null;
            }
        }
        return false;
    }

    public static boolean openUrl(Context context, String str, AdBean adBean) {
        String str2;
        int i;
        DeveloperLog.LogD("openUrl, url = " + str);
        try {
            if (adBean.getBidBean() == null) {
                str2 = "";
                i = 0;
            } else {
                i = adBean.getBidBean().getLandingType();
                str2 = adBean.getBidBean().getFinalUrl();
            }
            DeveloperLog.LogD("openUrl, landingType = " + i);
            DeveloperLog.LogD("openUrl, finalUrl = " + str2);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    return openUrlDirectly(context, str);
                }
                parseDeepLinkAndOpen(context, str, adBean);
                return true;
            } else if (TextUtils.isEmpty(str2)) {
                return startWithExternalBrowser(context, str);
            } else {
                openUrlDirectly(context, str2);
                trackClickThroughUrl(context, str);
                return true;
            }
        } catch (Exception unused) {
            return openUrlDirectly(context, str);
        }
    }

    private static boolean openUrlDirectly(Context context, String str) {
        if (tryOpenUrlWithSpecial(context, str)) {
            return true;
        }
        if (!isHttpUrl(str)) {
            return false;
        }
        return startWithExternalBrowser(context, str);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static boolean parseDeepLinkAndOpen(final Context context, final String str, final AdBean adBean) {
        if (context != null && !TextUtils.isEmpty(str)) {
            final GPWebViewClient.FinishListener finishListener = new GPWebViewClient.FinishListener() { // from class: com.maticoo.sdk.ad.utils.b
                @Override // com.maticoo.sdk.p405ad.utils.webview.GPWebViewClient.FinishListener
                public final void finish(boolean z) {
                    GpUtil.lambda$parseDeepLinkAndOpen$0(z);
                }
            };
            Runnable runnable = new Runnable() { // from class: com.maticoo.sdk.ad.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    GpUtil.lambda$parseDeepLinkAndOpen$1(context, str, finishListener, adBean);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
                return true;
            }
            HandlerUtil.runOnUiThread(runnable);
            return true;
        }
        return false;
    }

    public static Intent parseIntent(String str) {
        try {
            int indexOf = str.indexOf("%23Intent&");
            if (indexOf != -1) {
                str = str.substring(0, indexOf) + '#' + str.substring(indexOf + 3).replace('&', ';');
            }
            return Intent.parseUri(str, 1);
        } catch (Exception e) {
            DeveloperLog.LogD(TAG, e);
            CrashUtil.getSingleton().reportSDKException(e, TAG);
            return null;
        }
    }

    public static boolean startWithExternalBrowser(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                DeveloperLog.LogD("uri host = " + parse.getHost() + "   Scheme = " + parse.getScheme());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                DeveloperLog.LogD(TAG, e);
                CrashUtil.getSingleton().reportSDKException(e, TAG);
            }
        }
        return false;
    }

    private static void trackClickThroughUrl(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            Runnable runnable = new Runnable() { // from class: com.maticoo.sdk.ad.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    GpUtil.lambda$trackClickThroughUrl$2(context, str);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                HandlerUtil.runOnUiThread(runnable);
            }
        }
    }

    private static boolean tryOpenUrlWithSpecial(Context context, String str) {
        if (isGp(str)) {
            DeveloperLog.LogD(String.format("openUrl isGp %s", str));
            if (openGooglePlay(context, str)) {
                return true;
            }
        }
        if (isDeepLinkUrl(str)) {
            DeveloperLog.LogD(String.format("GPWebViewClient::beforeOpen isDeeplink %s", str));
            if (openDeepLink(context, str)) {
                return true;
            }
        }
        return false;
    }
}
