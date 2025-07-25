package com.yandex.mobile.ads.nativeads;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes8.dex */
public final class NativeAdType {
    public static final NativeAdType APP_INSTALL;
    public static final NativeAdType CONTENT;
    public static final NativeAdType MEDIA;

    /* renamed from: c */
    private static final /* synthetic */ NativeAdType[] f89224c;

    /* renamed from: d */
    private static final /* synthetic */ EnumEntries f89225d;
    @NotNull

    /* renamed from: b */
    private final String f89226b;

    static {
        NativeAdType nativeAdType = new NativeAdType(0, "CONTENT", "content");
        CONTENT = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType(1, "APP_INSTALL", "app");
        APP_INSTALL = nativeAdType2;
        NativeAdType nativeAdType3 = new NativeAdType(2, ShareConstants.MEDIA, "media");
        MEDIA = nativeAdType3;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2, nativeAdType3};
        f89224c = nativeAdTypeArr;
        f89225d = C44401b.m3113a(nativeAdTypeArr);
    }

    private NativeAdType(int i, String str, String str2) {
        this.f89226b = str2;
    }

    @NotNull
    public static EnumEntries<NativeAdType> getEntries() {
        return f89225d;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) f89224c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f89226b;
    }
}
