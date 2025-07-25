package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewConfiguration.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WebViewConfiguration {
    @NotNull
    private final List<String> additionalFiles;
    @NotNull
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int i, @NotNull String entryPoint, @NotNull List<String> additionalFiles) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        this.version = i;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i, str, list);
    }

    public final int component1() {
        return this.version;
    }

    @NotNull
    public final String component2() {
        return this.entryPoint;
    }

    @NotNull
    public final List<String> component3() {
        return this.additionalFiles;
    }

    @NotNull
    public final WebViewConfiguration copy(int i, @NotNull String entryPoint, @NotNull List<String> additionalFiles) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        return new WebViewConfiguration(i, entryPoint, additionalFiles);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        if (this.version == webViewConfiguration.version && Intrinsics.m17075f(this.entryPoint, webViewConfiguration.entryPoint) && Intrinsics.m17075f(this.additionalFiles, webViewConfiguration.additionalFiles)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    @NotNull
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}
