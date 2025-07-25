package com.facebook.gamingservices.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomUpdateContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class CustomUpdateMediaInfo {
    @NotNull
    private final String url;

    public CustomUpdateMediaInfo(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public static /* synthetic */ CustomUpdateMediaInfo copy$default(CustomUpdateMediaInfo customUpdateMediaInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customUpdateMediaInfo.url;
        }
        return customUpdateMediaInfo.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final CustomUpdateMediaInfo copy(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new CustomUpdateMediaInfo(url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CustomUpdateMediaInfo) && Intrinsics.m17075f(this.url, ((CustomUpdateMediaInfo) obj).url)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMediaInfo(url=" + this.url + ')';
    }
}
