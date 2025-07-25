package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewClientError.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WebViewClientError {
    @NotNull
    private final ErrorReason reason;
    @Nullable
    private final Integer statusCode;
    @Nullable
    private final String url;

    public WebViewClientError(@Nullable String str, @NotNull ErrorReason reason, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final ErrorReason component2() {
        return this.reason;
    }

    @Nullable
    public final Integer component3() {
        return this.statusCode;
    }

    @NotNull
    public final WebViewClientError copy(@Nullable String str, @NotNull ErrorReason reason, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        if (Intrinsics.m17075f(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && Intrinsics.m17075f(this.statusCode, webViewClientError.statusCode)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ErrorReason getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        String str = this.url;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, errorReason, (i & 4) != 0 ? null : num);
    }
}
