package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class ws1 {
    @NotNull

    /* renamed from: a */
    private final gf2 f87388a;

    public /* synthetic */ ws1() {
        this(new gf2());
    }

    @Nullable
    /* renamed from: a */
    public final Integer m27797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f87388a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        Integer m33345b = i82.m33345b(parser.getAttributeValue(null, "sequence"));
        if (m33345b != null && m33345b.intValue() < 0) {
            return null;
        }
        return m33345b;
    }

    public ws1(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f87388a = xmlHelper;
    }
}
