package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.models.p550ad.JavaScriptResource;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class qn0 {
    @NotNull

    /* renamed from: a */
    private final gf2 f84437a;

    public /* synthetic */ qn0() {
        this(new gf2());
    }

    @Nullable
    /* renamed from: a */
    public final JavaScriptResource m30258a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Boolean bool;
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f84437a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "JavaScriptResource");
        C31233qt.m30237a(this.f84437a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "apiFramework");
        C31233qt.m30237a(this.f84437a, parser, "parser", com.smaato.sdk.video.vast.model.JavaScriptResource.BROWSER_OPTIONAL, "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, com.smaato.sdk.video.vast.model.JavaScriptResource.BROWSER_OPTIONAL);
        if (attributeValue2 != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(attributeValue2));
        } else {
            bool = null;
        }
        this.f84437a.getClass();
        String m33835c = gf2.m33835c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || bool == null || m33835c.length() <= 0) {
            return null;
        }
        return new JavaScriptResource(attributeValue, m33835c, bool.booleanValue());
    }

    public qn0(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f84437a = xmlHelper;
    }
}
