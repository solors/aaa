package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.util.C29518o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.platform.e */
/* loaded from: classes7.dex */
public final class WebViewUtil {
    @NotNull
    public static final C29393a Companion = new C29393a(null);
    private static final String TAG = WebViewUtil.class.getSimpleName();
    @NotNull
    private final Context context;

    /* compiled from: WebViewUtil.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.platform.e$a */
    /* loaded from: classes7.dex */
    public static final class C29393a {
        private C29393a() {
        }

        public /* synthetic */ C29393a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebViewUtil(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void getUserAgent(@NotNull Consumer<String> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            consumer.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e) {
            if (e instanceof AndroidRuntimeException) {
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37467e(TAG2, "WebView could be missing here");
            }
            consumer.accept(null);
        }
    }
}
