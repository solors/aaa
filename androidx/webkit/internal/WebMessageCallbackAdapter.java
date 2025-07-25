package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import pf.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebMessageCallbackAdapter implements WebMessageCallbackBoundaryInterface {
    private final WebMessagePortCompat.WebMessageCallbackCompat mImpl;

    public WebMessageCallbackAdapter(@NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        this.mImpl = webMessageCallbackCompat;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(@NonNull InvocationHandler invocationHandler, @NonNull InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatFromBoundaryInterface = WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.m13148a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (webMessageCompatFromBoundaryInterface != null) {
            this.mImpl.onMessage(new WebMessagePortImpl(invocationHandler), webMessageCompatFromBoundaryInterface);
        }
    }
}
