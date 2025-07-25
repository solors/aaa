package com.unity3d.ads.adplayer;

import android.content.Context;
import androidx.webkit.WebViewAssetLoader;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37739j;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetWebViewCacheAssetLoader.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetWebViewCacheAssetLoader implements GetWebViewCacheAssetLoader {
    @NotNull
    private final Context context;
    @NotNull
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    public CommonGetWebViewCacheAssetLoader(@NotNull Context context, @NotNull GetLatestWebViewConfiguration getLatestWebViewConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        this.context = context;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
    }

    @Override // com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader
    @NotNull
    public WebViewAssetLoader invoke() {
        Object m16312b;
        m16312b = C37739j.m16312b(null, new CommonGetWebViewCacheAssetLoader$invoke$1(this, null), 1, null);
        Intrinsics.checkNotNullExpressionValue(m16312b, "override fun invoke(): W…           .build()\n    }");
        return (WebViewAssetLoader) m16312b;
    }
}
