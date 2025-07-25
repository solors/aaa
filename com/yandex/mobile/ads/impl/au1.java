package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Extension;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class au1 implements ff2<i50> {
    @NotNull

    /* renamed from: a */
    private final gf2 f76913a;

    public au1(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f76913a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @Nullable
    /* renamed from: b */
    public final i50 mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f76913a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, Extension.NAME);
        String type = parser.getAttributeValue(null, "type");
        this.f76913a.getClass();
        String value = gf2.m33835c(parser);
        if (value == null) {
            value = "";
        }
        if (type == null || type.length() == 0 || value.length() <= 0) {
            return null;
        }
        Intrinsics.m17074g(type);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new i50(type, value);
    }
}
