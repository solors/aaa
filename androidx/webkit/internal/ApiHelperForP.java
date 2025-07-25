package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;

@RequiresApi(28)
/* loaded from: classes2.dex */
public class ApiHelperForP {
    private ApiHelperForP() {
    }

    @NonNull
    @DoNotInline
    public static TracingController getTracingControllerInstance() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    @NonNull
    @DoNotInline
    public static ClassLoader getWebViewClassLoader() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    @NonNull
    @DoNotInline
    public static Looper getWebViewLooper(@NonNull WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    @DoNotInline
    public static boolean isTracing(@NonNull TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    @DoNotInline
    public static void setDataDirectorySuffix(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    @DoNotInline
    public static void start(@NonNull TracingController tracingController, @NonNull TracingConfig tracingConfig) {
        TracingConfig.Builder addCategories;
        TracingConfig.Builder addCategories2;
        TracingConfig.Builder tracingMode;
        android.webkit.TracingConfig build;
        addCategories = new TracingConfig.Builder().addCategories(tracingConfig.getPredefinedCategories());
        addCategories2 = addCategories.addCategories(tracingConfig.getCustomIncludedCategories());
        tracingMode = addCategories2.setTracingMode(tracingConfig.getTracingMode());
        build = tracingMode.build();
        tracingController.start(build);
    }

    @DoNotInline
    public static boolean stop(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
