package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {
    private WebMessagePortBoundaryInterface mBoundaryInterface;
    private WebMessagePort mFrameworksImpl;

    public WebMessagePortImpl(@NonNull WebMessagePort webMessagePort) {
        this.mFrameworksImpl = webMessagePort;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessage compatToFrameworkMessage(@NonNull WebMessageCompat webMessageCompat) {
        return ApiHelperForM.createWebMessage(webMessageCompat);
    }

    @Nullable
    @RequiresApi(23)
    public static WebMessagePort[] compatToPorts(@Nullable WebMessagePortCompat[] webMessagePortCompatArr) {
        if (webMessagePortCompatArr == null) {
            return null;
        }
        int length = webMessagePortCompatArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = webMessagePortCompatArr[i].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessageCompat frameworkMessageToCompat(@NonNull WebMessage webMessage) {
        return ApiHelperForM.createWebMessageCompat(webMessage);
    }

    private WebMessagePortBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(23)
    private WebMessagePort getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    @Nullable
    public static WebMessagePortCompat[] portsToCompat(@Nullable WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(webMessagePortArr[i]);
        }
        return webMessagePortCompatArr;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE;
        if (c3172m.isSupportedByFramework()) {
            ApiHelperForM.close(getFrameworksImpl());
        } else if (c3172m.isSupportedByWebView()) {
            getBoundaryInterface().close();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    @NonNull
    @RequiresApi(23)
    public WebMessagePort getFrameworkPort() {
        return getFrameworksImpl();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    @NonNull
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(getBoundaryInterface());
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(@NonNull WebMessageCompat webMessageCompat) {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (c3172m.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            ApiHelperForM.postMessage(getFrameworksImpl(), compatToFrameworkMessage(webMessageCompat));
        } else if (c3172m.isSupportedByWebView() && WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
            getBoundaryInterface().postMessage(BoundaryInterfaceReflectionUtil.m13146c(new WebMessageAdapter(webMessageCompat)));
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (c3172m.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(BoundaryInterfaceReflectionUtil.m13146c(new WebMessageCallbackAdapter(webMessageCallbackCompat)));
        } else if (c3172m.isSupportedByFramework()) {
            ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), webMessageCallbackCompat);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public WebMessagePortImpl(@NonNull InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@Nullable Handler handler, @NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        ApiFeature.C3172M c3172m = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (c3172m.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(BoundaryInterfaceReflectionUtil.m13146c(new WebMessageCallbackAdapter(webMessageCallbackCompat)), handler);
        } else if (c3172m.isSupportedByFramework()) {
            ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), webMessageCallbackCompat, handler);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
