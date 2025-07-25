package com.yandex.mobile.ads.video.playback.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class VideoAdInfo {
    @Nullable

    /* renamed from: a */
    private final String f89323a;
    @Nullable

    /* renamed from: b */
    private final String f89324b;
    @Nullable

    /* renamed from: c */
    private final String f89325c;
    @Nullable

    /* renamed from: d */
    private final String f89326d;
    @Nullable

    /* renamed from: e */
    private final String f89327e;

    public VideoAdInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f89323a = str;
        this.f89324b = str2;
        this.f89325c = str3;
        this.f89326d = str4;
        this.f89327e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(VideoAdInfo.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.video.playback.model.VideoAdInfo");
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        if (Intrinsics.m17075f(this.f89323a, videoAdInfo.f89323a) && Intrinsics.m17075f(this.f89324b, videoAdInfo.f89324b) && Intrinsics.m17075f(this.f89325c, videoAdInfo.f89325c) && Intrinsics.m17075f(this.f89326d, videoAdInfo.f89326d) && Intrinsics.m17075f(this.f89327e, videoAdInfo.f89327e)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getAdId() {
        return this.f89323a;
    }

    @Nullable
    public final String getAdvertiserInfo() {
        return this.f89327e;
    }

    @Nullable
    public final String getBannerId() {
        return this.f89325c;
    }

    @Nullable
    public final String getCreativeId() {
        return this.f89324b;
    }

    @Nullable
    public final String getData() {
        return this.f89326d;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f89323a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f89324b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f89325c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f89326d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f89327e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }

    @NotNull
    public String toString() {
        String str = this.f89323a;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.f89324b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f89325c;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.f89326d;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.f89327e;
        if (str6 != null) {
            str2 = str6;
        }
        return "VideoAdInfo (adId: " + str + ", creativeId: " + str3 + ", bannerId: " + str4 + ", data: " + str5 + ", advertiserInfo: " + str2 + ")";
    }
}
