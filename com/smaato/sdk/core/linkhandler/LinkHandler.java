package com.smaato.sdk.core.linkhandler;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.device.ads.DtbConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.p552ot.pubsub.p559g.C26542f;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class LinkHandler {
    public static final int MAX_REDIRECTS = 16;
    public static final String SMAATO_FORCE_BROWSER_PARAM = "SMAATO_OPEN_BROWSER";
    private final ActivityQueries activityQueries;
    private final Application application;
    private final HttpClient httpClient;
    private final IntentLauncher intentLauncher;
    private final SimpleHttpClient simpleHttpClient;

    public LinkHandler(Application application, HttpClient httpClient, SimpleHttpClient simpleHttpClient, IntentLauncher intentLauncher, ActivityQueries activityQueries) {
        this.application = application;
        this.intentLauncher = intentLauncher;
        HttpClient.Builder buildUpon = httpClient.buildUpon();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.httpClient = buildUpon.connectTimeout(5000L, timeUnit).readTimeout(5000L, timeUnit).build();
        this.simpleHttpClient = simpleHttpClient;
        this.activityQueries = activityQueries;
    }

    private Request buildHttpRequestWithBlockedRedirection(String str) {
        return Request.get(str).buildUpon().followRedirects(false).build();
    }

    private Intent createBrowserIntent(String str) {
        Intent createExternalBrowserIntent = createExternalBrowserIntent(str);
        if (createExternalBrowserIntent == null) {
            return createInternalBrowserIntent(str);
        }
        return createExternalBrowserIntent;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private Intent createCheckedAppLinkIntent(String str) {
        Set<String> queryTargetActivityNames = this.activityQueries.queryTargetActivityNames(DtbConstants.HTTPS);
        Set<String> queryTargetActivityNames2 = this.activityQueries.queryTargetActivityNames(str);
        queryTargetActivityNames2.removeAll(queryTargetActivityNames);
        if (!queryTargetActivityNames2.isEmpty()) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        }
        throw new IllegalArgumentException("No app supports " + str);
    }

    private Intent createExternalAppIntent(String str) {
        return createExternalAppIntent(str, false);
    }

    @Nullable
    private Intent createExternalBrowserIntent(String str) {
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE");
        Intent intent = new Intent(addCategory);
        intent.setPackage("com.android.chrome");
        if (this.activityQueries.canBeLaunched(intent)) {
            return intent;
        }
        if (!this.activityQueries.canBeLaunched(addCategory)) {
            return null;
        }
        return addCategory;
    }

    private Intent createIntentForFallback(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                return createBrowserIntent(stringExtra);
            }
            String stringExtra2 = parseUri.getStringExtra(C26542f.C26543a.f69507e);
            if (!TextUtils.isEmpty(stringExtra2)) {
                return createMarketIntent(stringExtra2);
            }
            throw new IllegalArgumentException("No such app supports " + str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private Intent createInternalBrowserIntent(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            throw new IllegalArgumentException("Not browsable url " + str);
        }
        return SmaatoSdkBrowserActivity.createIntent(this.application, str);
    }

    private Intent createMarketIntent(String str) {
        return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(ApsAdWebViewSupportClient.MARKET_SCHEME).authority("details").appendQueryParameter("id", str).build());
    }

    private Request createRequestForRedirection(Request request, Response response) {
        List<String> values = response.headers().values("Location");
        if (!values.isEmpty()) {
            Uri parse = Uri.parse(values.get(0));
            if (parse.isAbsolute()) {
                return request.buildUpon().uri(parse).build();
            }
            return request.buildUpon().uri(request.uri().buildUpon().path(parse.getPath()).query(parse.getQuery()).build()).build();
        }
        return request;
    }

    private Intent createUncheckedExternalAppIntent(String str) {
        return createExternalAppIntent(str, true);
    }

    private Intent createUncheckedIntentForUrl(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (isIntentUrl(str)) {
                return createUncheckedExternalAppIntent(str);
            }
            return createViewIntent(str);
        }
        return new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT");
    }

    private Intent createViewIntent(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    private boolean fireTrackingUrls(final List<String> list) {
        try {
            Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.linkhandler.b
                {
                    LinkHandler.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LinkHandler.this.lambda$fireTrackingUrls$3(list);
                }
            });
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresApi(api = 30)
    private boolean handleFailedUrl(@NonNull String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (isIntentUrl(str)) {
                return this.intentLauncher.launch(createIntentForFallback(str));
            }
            return false;
        }
        return resolveRedirectAndStartAsAppLink(str);
    }

    private boolean handleUrl(@NonNull String str) {
        SmaDeepLink smaDeepLink;
        if (str.startsWith(SmaDeepLink.SMAATO_DEEPLINK_SCHEME)) {
            try {
                smaDeepLink = new SmaDeepLink(str);
            } catch (Exception unused) {
            }
            if (launchUrl(smaDeepLink.primaryUrl)) {
                return fireTrackingUrls(smaDeepLink.primaryTrackerUrls);
            }
            if (launchUrl(smaDeepLink.fallbackUrl)) {
                return fireTrackingUrls(smaDeepLink.fallbackTrackerUrls);
            }
            return false;
        }
        return launchUrl(str);
    }

    @ChecksSdkIntAtLeast(api = 30)
    @VisibleForTesting
    public static boolean isApiLevel30Plus() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    private boolean isForceNativeBrowserEnabled(String str) {
        return str.contains(SMAATO_FORCE_BROWSER_PARAM);
    }

    private boolean isIntentUrl(String str) {
        if (str.length() < 6 || !SDKConstants.PARAM_INTENT.equalsIgnoreCase(str.substring(0, 6))) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$fireTrackingUrls$3(List list) {
        this.simpleHttpClient.fireAndForget(list);
    }

    public static /* synthetic */ void lambda$handleUrlOnBackGround$0(Runnable runnable) {
        Objects.onNotNull(runnable, new C27154c());
    }

    public static /* synthetic */ void lambda$handleUrlOnBackGround$1(Runnable runnable) {
        Objects.onNotNull(runnable, new C27154c());
    }

    private boolean launchUrl(@NonNull String str) {
        if ((URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) && isForceNativeBrowserEnabled(str)) {
            return startInBrowser(str);
        }
        if (isApiLevel30Plus()) {
            boolean tryToStartAsAppLink = tryToStartAsAppLink(str, true);
            if (!tryToStartAsAppLink) {
                return handleFailedUrl(str);
            }
            return tryToStartAsAppLink;
        }
        try {
            if (this.intentLauncher.launch(resolveExternalAppUrl(str))) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return false;
        }
        try {
        } catch (Exception e) {
            Log.e(LinkHandler.class.getSimpleName(), "intent launcher resolver exception", e);
        }
        if (this.intentLauncher.launch(resolveRedirectUrlAndCreateIntent(str))) {
            return true;
        }
        return false;
    }

    private Intent resolveExternalAppUrl(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (str.length() >= 6 && SDKConstants.PARAM_INTENT.equalsIgnoreCase(str.substring(0, 6))) {
                return createExternalAppIntent(str);
            }
            return createViewIntent(str);
        }
        return createCheckedAppLinkIntent(str);
    }

    @RequiresApi(api = 30)
    private boolean resolveRedirectAndStartAsAppLink(@NonNull String str) {
        try {
            ResolvedRedirection resolveRedirectUrl = resolveRedirectUrl(str);
            if (!URLUtil.isHttpUrl(resolveRedirectUrl.url) && !URLUtil.isHttpsUrl(resolveRedirectUrl.url)) {
                return tryToStartAsAppLink(resolveRedirectUrl.url, false);
            }
            return startInBrowser(resolveRedirectUrl.url);
        } catch (Exception unused) {
            return false;
        }
    }

    private ResolvedRedirection resolveRedirectUrl(String str) {
        Request buildHttpRequestWithBlockedRedirection = buildHttpRequestWithBlockedRedirection(str);
        int i = 0;
        do {
            try {
                Response execute = this.httpClient.newCall(buildHttpRequestWithBlockedRedirection).execute();
                if (execute.isRedirect()) {
                    buildHttpRequestWithBlockedRedirection = createRequestForRedirection(buildHttpRequestWithBlockedRedirection, execute);
                    if (!isForceNativeBrowserEnabled(buildHttpRequestWithBlockedRedirection.uri().toString())) {
                        i++;
                        execute.close();
                    } else {
                        ResolvedRedirection resolvedRedirection = new ResolvedRedirection(buildHttpRequestWithBlockedRedirection.uri().toString());
                        execute.close();
                        return resolvedRedirection;
                    }
                } else {
                    ResolvedRedirection resolvedRedirection2 = new ResolvedRedirection(execute.request().uri().toString());
                    execute.close();
                    return resolvedRedirection2;
                }
            } catch (Exception unused) {
                return new ResolvedRedirection(buildHttpRequestWithBlockedRedirection.uri().toString());
            }
        } while (i <= 16);
        throw new IllegalArgumentException("Unable to resolve redirect " + str);
    }

    private Intent resolveRedirectUrlAndCreateIntent(String str) {
        ResolvedRedirection resolveRedirectUrl = resolveRedirectUrl(str);
        if (!URLUtil.isHttpUrl(resolveRedirectUrl.url) && !URLUtil.isHttpsUrl(resolveRedirectUrl.url)) {
            try {
                return resolveExternalAppUrl(resolveRedirectUrl.url);
            } catch (Exception unused) {
                return createBrowserIntent(resolveRedirectUrl.url);
            }
        }
        return createBrowserIntent(resolveRedirectUrl.url);
    }

    private boolean startInBrowser(String str) {
        return this.intentLauncher.launch(createBrowserIntent(str));
    }

    @RequiresApi(api = 30)
    @SuppressLint({"WrongConstant"})
    private boolean tryToStartAsAppLink(@NonNull String str, boolean z) {
        Intent createUncheckedIntentForUrl = createUncheckedIntentForUrl(str);
        if (z) {
            createUncheckedIntentForUrl.addFlags(1024);
        }
        return this.intentLauncher.launch(createUncheckedIntentForUrl);
    }

    public Either<Intent, String> findExternalAppForUrl(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (isIntentUrl(str)) {
                try {
                    return Either.left(createUncheckedExternalAppIntent(str));
                } catch (Exception unused) {
                    return Either.right(str);
                }
            }
            return Either.left(createViewIntent(str));
        }
        return Either.right(str);
    }

    @WorkerThread
    /* renamed from: handleUrlOnBackGround */
    public void lambda$handleUrlOnBackGround$2(@NonNull final String str, @Nullable final Runnable runnable, @Nullable final Runnable runnable2) {
        boolean z;
        if (!Threads.isMainThread()) {
            if (!TextUtils.isEmpty(str) && handleUrl(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.core.linkhandler.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        LinkHandler.lambda$handleUrlOnBackGround$0(runnable);
                    }
                });
                return;
            } else {
                Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.core.linkhandler.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        LinkHandler.lambda$handleUrlOnBackGround$1(runnable2);
                    }
                });
                return;
            }
        }
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.core.linkhandler.f
            {
                LinkHandler.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LinkHandler.this.lambda$handleUrlOnBackGround$2(str, runnable, runnable2);
            }
        });
    }

    public boolean launchAsUncheckedIntent(@NonNull String str) {
        try {
            return this.intentLauncher.launch(createUncheckedIntentForUrl(str));
        } catch (Exception unused) {
            return false;
        }
    }

    private Intent createExternalAppIntent(String str, boolean z) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (!z && !this.activityQueries.canBeLaunched(parseUri)) {
                return createIntentForFallback(str);
            }
            return parseUri;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
