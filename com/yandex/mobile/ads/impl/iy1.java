package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class iy1 {
    @NotNull

    /* renamed from: a */
    private final gf2 f80688a;

    public iy1() {
        Intrinsics.checkNotNullParameter("id", "attribute");
        Intrinsics.checkNotNullParameter("Ad", "parentTag");
        this.f80688a = new gf2();
    }

    @Nullable
    /* renamed from: a */
    public final String m33091a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f80688a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        String attributeValue = parser.getAttributeValue(null, "id");
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
