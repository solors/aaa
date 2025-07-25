package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {
    private ServiceWorkerWebSettingsBoundaryInterface mBoundaryInterface;
    private ServiceWorkerWebSettings mFrameworksImpl;

    public ServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.mFrameworksImpl = serviceWorkerWebSettings;
    }

    private ServiceWorkerWebSettingsBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(ServiceWorkerWebSettingsBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(24)
    private ServiceWorkerWebSettings getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (c3173n.isSupportedByFramework()) {
            return ApiHelperForN.getAllowContentAccess(getFrameworksImpl());
        }
        if (c3173n.isSupportedByWebView()) {
            return getBoundaryInterface().getAllowContentAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (c3173n.isSupportedByFramework()) {
            return ApiHelperForN.getAllowFileAccess(getFrameworksImpl());
        }
        if (c3173n.isSupportedByWebView()) {
            return getBoundaryInterface().getAllowFileAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (c3173n.isSupportedByFramework()) {
            return ApiHelperForN.getBlockNetworkLoads(getFrameworksImpl());
        }
        if (c3173n.isSupportedByWebView()) {
            return getBoundaryInterface().getBlockNetworkLoads();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (c3173n.isSupportedByFramework()) {
            return ApiHelperForN.getCacheMode(getFrameworksImpl());
        }
        if (c3173n.isSupportedByWebView()) {
            return getBoundaryInterface().getCacheMode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    @NonNull
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        if (WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            return getBoundaryInterface().getRequestedWithHeaderOriginAllowList();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z) {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (c3173n.isSupportedByFramework()) {
            ApiHelperForN.setAllowContentAccess(getFrameworksImpl(), z);
        } else if (c3173n.isSupportedByWebView()) {
            getBoundaryInterface().setAllowContentAccess(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z) {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (c3173n.isSupportedByFramework()) {
            ApiHelperForN.setAllowFileAccess(getFrameworksImpl(), z);
        } else if (c3173n.isSupportedByWebView()) {
            getBoundaryInterface().setAllowFileAccess(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z) {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (c3173n.isSupportedByFramework()) {
            ApiHelperForN.setBlockNetworkLoads(getFrameworksImpl(), z);
        } else if (c3173n.isSupportedByWebView()) {
            getBoundaryInterface().setBlockNetworkLoads(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int i) {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (c3173n.isSupportedByFramework()) {
            ApiHelperForN.setCacheMode(getFrameworksImpl(), i);
        } else if (c3173n.isSupportedByWebView()) {
            getBoundaryInterface().setCacheMode(i);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderOriginAllowList(@NonNull Set<String> set) {
        if (WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            getBoundaryInterface().setRequestedWithHeaderOriginAllowList(set);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public ServiceWorkerWebSettingsImpl(@NonNull InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
