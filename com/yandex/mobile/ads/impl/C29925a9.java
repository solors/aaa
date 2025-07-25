package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Wrapper;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.a9 */
/* loaded from: classes8.dex */
public final class C29925a9 {
    @NotNull

    /* renamed from: a */
    private final gf2 f76740a;
    @NotNull

    /* renamed from: b */
    private final C30608j9 f76741b;

    public /* synthetic */ C29925a9(gf2 gf2Var) {
        this(gf2Var, new C30608j9(gf2Var));
    }

    @Nullable
    /* renamed from: a */
    public final C31958z8 m35936a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f76740a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        C31958z8 c31958z8 = null;
        parser.require(2, null, "AdSource");
        C31233qt.m30237a(this.f76740a, parser, "parser", Wrapper.ALLOW_MULTIPLE_ADS, "attributeName");
        String attributeValue = parser.getAttributeValue(null, Wrapper.ALLOW_MULTIPLE_ADS);
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        C31233qt.m30237a(this.f76740a, parser, "parser", "followRedirects", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = parser.getAttributeValue(null, "id");
        while (true) {
            this.f76740a.getClass();
            if (gf2.m33837a(parser)) {
                this.f76740a.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f("AdTagURI", parser.getName())) {
                        C30538i9 adTagUri = this.f76741b.m33019a(parser);
                        if (adTagUri != null) {
                            Intrinsics.checkNotNullParameter(adTagUri, "adTagUri");
                            c31958z8 = new C31958z8(adTagUri, attributeValue3);
                        }
                    } else {
                        this.f76740a.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return c31958z8;
            }
        }
    }

    public C29925a9(@NotNull gf2 xmlHelper, @NotNull C30608j9 adTagUriParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(adTagUriParser, "adTagUriParser");
        this.f76740a = xmlHelper;
        this.f76741b = adTagUriParser;
    }
}
