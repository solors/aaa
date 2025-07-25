package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Icon;
import com.yandex.mobile.ads.impl.tf0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class uf0 implements ff2<tf0> {
    @NotNull

    /* renamed from: a */
    private final gf2 f86249a;

    public /* synthetic */ uf0() {
        this(new gf2());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    /* renamed from: a */
    public final tf0 mo28797a(XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f86249a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Icon");
        tf0.C31443a c31443a = new tf0.C31443a();
        C31233qt.m30237a(this.f86249a, parser, "parser", Icon.PROGRAM, "attributeName");
        String attributeValue = parser.getAttributeValue(null, Icon.PROGRAM);
        C31233qt.m30237a(this.f86249a, parser, "parser", "height", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "height");
        C31233qt.m30237a(this.f86249a, parser, "parser", "width", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "width");
        C31233qt.m30237a(this.f86249a, parser, "parser", Icon.X_POSITION, "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, Icon.X_POSITION);
        C31233qt.m30237a(this.f86249a, parser, "parser", Icon.Y_POSITION, "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, Icon.Y_POSITION);
        C31233qt.m30237a(this.f86249a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        C31233qt.m30237a(this.f86249a, parser, "parser", "offset", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "offset");
        C31233qt.m30237a(this.f86249a, parser, "parser", "duration", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "duration");
        while (true) {
            this.f86249a.getClass();
            if (gf2.m33837a(parser)) {
                this.f86249a.getClass();
                if (gf2.m33836b(parser)) {
                    String name = parser.getName();
                    tf0.EnumC31445c.f85641c.getClass();
                    tf0.EnumC31445c[] values = tf0.EnumC31445c.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (Intrinsics.m17075f(values[i].m29184a(), name)) {
                                this.f86249a.getClass();
                                c31443a.m29189g(name).m29188h(gf2.m33835c(parser));
                                break;
                            }
                            i++;
                        } else {
                            this.f86249a.getClass();
                            gf2.m33834d(parser);
                            break;
                        }
                    }
                }
            } else {
                return c31443a.m29190f(attributeValue).m29193c(attributeValue2).m29186j(attributeValue3).m29192d(attributeValue4).m29187i(attributeValue5).m29195a(attributeValue6).m29191e(attributeValue7).m29194b(attributeValue8).m29196a();
            }
        }
    }

    public uf0(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f86249a = xmlHelper;
    }
}
