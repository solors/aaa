package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.MediaFile;
import com.yandex.mobile.ads.impl.et0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class gt0 implements ff2<et0> {
    @NotNull

    /* renamed from: a */
    private final gf2 f79767a;

    public /* synthetic */ gt0() {
        this(new gf2());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    /* renamed from: a */
    public final et0 mo28797a(XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f79767a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, MediaFile.NAME);
        C31233qt.m30237a(this.f79767a, parser, "parser", "delivery", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "delivery");
        C31233qt.m30237a(this.f79767a, parser, "parser", "type", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "type");
        C31233qt.m30237a(this.f79767a, parser, "parser", "height", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "height");
        C31233qt.m30237a(this.f79767a, parser, "parser", "width", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "width");
        C31233qt.m30237a(this.f79767a, parser, "parser", MediaFile.BITRATE, "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, MediaFile.BITRATE);
        C31233qt.m30237a(this.f79767a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        C31233qt.m30237a(this.f79767a, parser, "parser", "id", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "id");
        C31233qt.m30237a(this.f79767a, parser, "parser", MediaFile.CODEC, "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, MediaFile.CODEC);
        C31233qt.m30237a(this.f79767a, parser, "parser", "vmaf", "attributeName");
        String attributeValue9 = parser.getAttributeValue(null, "vmaf");
        this.f79767a.getClass();
        return new et0.C30270a(gf2.m33835c(parser)).m34436f(attributeValue7).m34438d(attributeValue).m34437e(attributeValue3).m34433i(attributeValue4).m34440b(attributeValue5).m34441a(attributeValue6).m34435g(attributeValue2).m34439c(attributeValue8).m34434h(attributeValue9).m34442a();
    }

    public gt0(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f79767a = xmlHelper;
    }
}
