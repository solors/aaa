package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import androidx.webkit.internal.ApiFeature;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* loaded from: classes2.dex */
public class TracingControllerImpl extends TracingController {
    private TracingControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.TracingController mFrameworksImpl;

    public TracingControllerImpl() {
        ApiFeature.C3175P c3175p = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (c3175p.isSupportedByFramework()) {
            this.mFrameworksImpl = ApiHelperForP.getTracingControllerInstance();
            this.mBoundaryInterface = null;
        } else if (c3175p.isSupportedByWebView()) {
            this.mFrameworksImpl = null;
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getTracingController();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    private TracingControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getTracingController();
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(28)
    private android.webkit.TracingController getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = ApiHelperForP.getTracingControllerInstance();
        }
        return this.mFrameworksImpl;
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        ApiFeature.C3175P c3175p = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (c3175p.isSupportedByFramework()) {
            return ApiHelperForP.isTracing(getFrameworksImpl());
        }
        if (c3175p.isSupportedByWebView()) {
            return getBoundaryInterface().isTracing();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.TracingController
    public void start(@NonNull TracingConfig tracingConfig) {
        if (tracingConfig != null) {
            ApiFeature.C3175P c3175p = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
            if (c3175p.isSupportedByFramework()) {
                ApiHelperForP.start(getFrameworksImpl(), tracingConfig);
                return;
            } else if (c3175p.isSupportedByWebView()) {
                getBoundaryInterface().start(tracingConfig.getPredefinedCategories(), tracingConfig.getCustomIncludedCategories(), tracingConfig.getTracingMode());
                return;
            } else {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
        }
        throw new IllegalArgumentException("Tracing config must be non null");
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(@Nullable OutputStream outputStream, @NonNull Executor executor) {
        ApiFeature.C3175P c3175p = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (c3175p.isSupportedByFramework()) {
            return ApiHelperForP.stop(getFrameworksImpl(), outputStream, executor);
        }
        if (c3175p.isSupportedByWebView()) {
            return getBoundaryInterface().stop(outputStream, executor);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
