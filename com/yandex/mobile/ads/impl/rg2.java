package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rg2 implements MediaFile {
    @NotNull

    /* renamed from: a */
    private final cl0 f84755a;

    public rg2(@NotNull cl0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        this.f84755a = mediaFile;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rg2) && Intrinsics.m17075f(this.f84755a, ((rg2) obj).f84755a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f84755a.getAdHeight();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f84755a.getAdWidth();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final String getApiFramework() {
        return this.f84755a.getApiFramework();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final Integer getBitrate() {
        return this.f84755a.getBitrate();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    @Nullable
    public final String getMediaType() {
        return this.f84755a.getMediaType();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.a72
    @NotNull
    public final String getUrl() {
        return this.f84755a.getUrl();
    }

    public final int hashCode() {
        return this.f84755a.hashCode();
    }

    @NotNull
    public final String toString() {
        cl0 cl0Var = this.f84755a;
        return "YandexMediaFile(mediaFile=" + cl0Var + ")";
    }
}
