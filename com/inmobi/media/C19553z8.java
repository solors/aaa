package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z8 */
/* loaded from: classes6.dex */
public final class C19553z8 extends C19149W6 {

    /* renamed from: x */
    public final boolean f48962x;

    /* renamed from: y */
    public String f48963y;

    /* renamed from: z */
    public boolean f48964z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19553z8(String assetId, String assetName, C19162X6 assetStyle, String textValue, boolean z) {
        super(assetId, assetName, "WEBVIEW", assetStyle, 16);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        this.f48962x = z;
        this.f47905e = textValue;
    }
}
