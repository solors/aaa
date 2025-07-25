package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* loaded from: classes2.dex */
public class ProxyControllerImpl extends ProxyController {
    private ProxyControllerBoundaryInterface mBoundaryInterface;

    private ProxyControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getProxyController();
        }
        return this.mBoundaryInterface;
    }

    @NonNull
    @VisibleForTesting
    public static String[][] proxyRulesToStringArray(@NonNull List<ProxyConfig.ProxyRule> list) {
        String[][] strArr = (String[][]) Array.newInstance(String.class, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getSchemeFilter();
            strArr[i][1] = list.get(i).getUrl();
        }
        return strArr;
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(@NonNull Executor executor, @NonNull Runnable runnable) {
        if (WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
            getBoundaryInterface().clearProxyOverride(runnable, executor);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable) {
        ApiFeature.NoFramework noFramework = WebViewFeatureInternal.PROXY_OVERRIDE;
        ApiFeature.NoFramework noFramework2 = WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        String[][] proxyRulesToStringArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        String[] strArr = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        if (noFramework.isSupportedByWebView() && !proxyConfig.isReverseBypassEnabled()) {
            getBoundaryInterface().setProxyOverride(proxyRulesToStringArray, strArr, runnable, executor);
        } else if (noFramework.isSupportedByWebView() && noFramework2.isSupportedByWebView()) {
            getBoundaryInterface().setProxyOverride(proxyRulesToStringArray, strArr, runnable, executor, proxyConfig.isReverseBypassEnabled());
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
