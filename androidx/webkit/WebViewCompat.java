package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes2.dex */
public class WebViewCompat {
    private static final Uri WILDCARD_URI = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final Uri EMPTY_URI = Uri.parse("");

    /* loaded from: classes2.dex */
    public interface VisualStateCallback {
        @UiThread
        void onComplete(long j);
    }

    /* loaded from: classes2.dex */
    public interface WebMessageListener {
        @UiThread
        void onPostMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri, boolean z, @NonNull JavaScriptReplyProxy javaScriptReplyProxy);
    }

    private WebViewCompat() {
    }

    @NonNull
    public static ScriptHandler addDocumentStartJavaScript(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set) {
        if (WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getProvider(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebMessageListener webMessageListener) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), webMessageListener);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static void checkThread(WebView webView) {
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = ApiHelperForP.getWebViewLooper(webView);
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
            return;
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webView, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static WebViewProviderBoundaryInterface createProvider(WebView webView) {
        return getFactory().createWebView(webView);
    }

    @NonNull
    public static WebMessagePortCompat[] createWebMessageChannel(@NonNull WebView webView) {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (c3172m.isSupportedByFramework()) {
            return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webView));
        }
        if (c3172m.isSupportedByWebView()) {
            return getProvider(webView).createWebMessageChannel();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static PackageInfo getCurrentLoadedWebViewPackage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ApiHelperForO.getCurrentWebViewPackage();
        }
        try {
            return getLoadedWebViewPackageInfo();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public static PackageInfo getCurrentWebViewPackage(@NonNull Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        return getNotYetLoadedWebViewPackageInfo(context);
    }

    private static WebViewProviderFactory getFactory() {
        return WebViewGlueCommunicator.getFactory();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo getLoadedWebViewPackageInfo() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo getNotYetLoadedWebViewPackageInfo(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @NonNull
    @UiThread
    public static Profile getProfile(@NonNull WebView webView) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getProvider(webView).getProfile();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderAdapter getProvider(WebView webView) {
        return new WebViewProviderAdapter(createProvider(webView));
    }

    @NonNull
    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static String getVariationsHeader() {
        if (WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getFactory().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView) {
        ApiFeature.C3174O c3174o = WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (c3174o.isSupportedByFramework()) {
            return ApiHelperForO.getWebChromeClient(webView);
        }
        if (c3174o.isSupportedByWebView()) {
            return getProvider(webView).getWebChromeClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static WebViewClient getWebViewClient(@NonNull WebView webView) {
        ApiFeature.C3174O c3174o = WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (c3174o.isSupportedByFramework()) {
            return ApiHelperForO.getWebViewClient(webView);
        }
        if (c3174o.isSupportedByWebView()) {
            return getProvider(webView).getWebViewClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        ApiFeature.C3176Q c3176q = WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (c3176q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = ApiHelperForQ.getWebViewRenderProcess(webView);
            if (webViewRenderProcess != null) {
                return WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
            }
            return null;
        } else if (c3176q.isSupportedByWebView()) {
            return getProvider(webView).getWebViewRenderProcess();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Nullable
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        ApiFeature.C3176Q c3176q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (c3176q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = ApiHelperForQ.getWebViewRenderProcessClient(webView);
            if (webViewRenderProcessClient != null && (webViewRenderProcessClient instanceof WebViewRenderProcessClientFrameworkAdapter)) {
                return ((WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
            }
            return null;
        } else if (c3176q.isSupportedByWebView()) {
            return getProvider(webView).getWebViewRenderProcessClient();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static boolean isAudioMuted(@NonNull WebView webView) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getProvider(webView).isAudioMuted();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getFactory().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(@NonNull WebView webView, long j, @NonNull VisualStateCallback visualStateCallback) {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (c3172m.isSupportedByFramework()) {
            ApiHelperForM.postVisualStateCallback(webView, j, visualStateCallback);
        } else if (c3172m.isSupportedByWebView()) {
            checkThread(webView);
            getProvider(webView).insertVisualStateCallback(j, visualStateCallback);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void postWebMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        if (WILDCARD_URI.equals(uri)) {
            uri = EMPTY_URI;
        }
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (c3172m.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            ApiHelperForM.postWebMessage(webView, WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else if (c3172m.isSupportedByWebView() && WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
            getProvider(webView).postWebMessage(webMessageCompat, uri);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void removeWebMessageListener(@NonNull WebView webView, @NonNull String str) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).removeWebMessageListener(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAudioMuted(@NonNull WebView webView, boolean z) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            getProvider(webView).setAudioMuted(z);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @UiThread
    public static void setProfile(@NonNull WebView webView, @NonNull String str) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            getProvider(webView).setProfileWithName(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSafeBrowsingAllowlist(@NonNull Set<String> set, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 o_mr12 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (o_mr12.isSupportedByFramework()) {
            ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else if (o_mr12.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    @SuppressLint({"LambdaLast"})
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @NonNull WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.C3176Q c3176q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (c3176q.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else if (c3176q.isSupportedByWebView()) {
            getProvider(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void startSafeBrowsing(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().initSafeBrowsing(context, valueCallback);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.C3176Q c3176q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (c3176q.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else if (c3176q.isSupportedByWebView()) {
            getProvider(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
