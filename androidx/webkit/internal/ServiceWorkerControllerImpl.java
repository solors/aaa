package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.internal.ApiFeature;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    private ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private ServiceWorkerController mFrameworksImpl;
    private final ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (c3173n.isSupportedByFramework()) {
            this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
            this.mBoundaryInterface = null;
            this.mWebSettings = ApiHelperForN.getServiceWorkerWebSettingsImpl(getFrameworksImpl());
        } else if (c3173n.isSupportedByWebView()) {
            this.mFrameworksImpl = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            this.mBoundaryInterface = serviceWorkerController;
            this.mWebSettings = new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    private ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(24)
    private ServiceWorkerController getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
        }
        return this.mFrameworksImpl;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    @NonNull
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.mWebSettings;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat) {
        ApiFeature.C3173N c3173n = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (c3173n.isSupportedByFramework()) {
            if (serviceWorkerClientCompat == null) {
                ApiHelperForN.setServiceWorkerClient(getFrameworksImpl(), null);
            } else {
                ApiHelperForN.setServiceWorkerClientCompat(getFrameworksImpl(), serviceWorkerClientCompat);
            }
        } else if (c3173n.isSupportedByWebView()) {
            if (serviceWorkerClientCompat == null) {
                getBoundaryInterface().setServiceWorkerClient(null);
            } else {
                getBoundaryInterface().setServiceWorkerClient(BoundaryInterfaceReflectionUtil.m13146c(new ServiceWorkerClientAdapter(serviceWorkerClientCompat)));
            }
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
