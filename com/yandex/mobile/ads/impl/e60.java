package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class e60 implements ff2<FalseClick> {
    @NotNull

    /* renamed from: a */
    private final gf2 f78465a;

    public e60(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f78465a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    /* renamed from: a */
    public final FalseClick mo28797a(XmlPullParser parser) {
        Long l;
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f78465a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "FalseClick");
        C31233qt.m30237a(this.f78465a, parser, "parser", "interval", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "interval");
        if (attributeValue != null) {
            l = StringNumberConversions.m16638o(attributeValue);
        } else {
            l = null;
        }
        this.f78465a.getClass();
        String m33835c = gf2.m33835c(parser);
        if (m33835c.length() <= 0 || l == null) {
            return null;
        }
        return new FalseClick(m33835c, l.longValue());
    }
}
