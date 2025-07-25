package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class v71 implements b72<u71> {
    @Override // com.yandex.mobile.ads.impl.b72
    /* renamed from: a */
    public final u71 mo28519a(z52 videoAd, C30746kt creative, et0 mediaFile, i72 adPodInfo, String str, String str2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        return new u71(mediaFile.m34445f(), mediaFile.m34443h(), mediaFile.m34447d());
    }
}
