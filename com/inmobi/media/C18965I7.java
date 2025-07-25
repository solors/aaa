package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.I7 */
/* loaded from: classes6.dex */
public class C18965I7 extends C19149W6 {
    public /* synthetic */ C18965I7(String str, String str2, C18951H7 c18951h7, String str3) {
        this(str, str2, "TEXT", c18951h7, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18965I7(String assetId, String assetName, String assetType, C18951H7 assetStyle, String str) {
        super(assetId, assetName, assetType, assetStyle, 16);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        this.f47905e = str;
    }
}
