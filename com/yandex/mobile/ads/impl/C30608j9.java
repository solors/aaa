package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.j9 */
/* loaded from: classes8.dex */
public final class C30608j9 {
    @NotNull

    /* renamed from: a */
    private final gf2 f80798a;

    public C30608j9(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f80798a = xmlHelper;
    }

    @Nullable
    /* renamed from: a */
    public final C30538i9 m33019a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f80798a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "AdTagURI");
        parser.getAttributeValue(null, "templateType");
        this.f80798a.getClass();
        String uri = gf2.m33835c(parser);
        if (uri.length() <= 0) {
            return null;
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new C30538i9(uri);
    }
}
