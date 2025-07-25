package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    final WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(DropDataContentProviderBoundaryInterface.class, this.mImpl.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(ProfileStoreBoundaryInterface.class, this.mImpl.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }
}
