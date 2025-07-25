package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class gc2 implements ff2<fc2> {
    @NotNull

    /* renamed from: a */
    private final gf2 f79597a;

    public /* synthetic */ gc2() {
        this(new gf2());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @NotNull
    /* renamed from: b */
    public final fc2 mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f79597a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f79597a.getClass();
            if (gf2.m33837a(parser)) {
                this.f79597a.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f(ViewableImpression.VIEWABLE, parser.getName())) {
                        this.f79597a.getClass();
                        arrayList.add(gf2.m33835c(parser));
                    } else {
                        this.f79597a.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return new fc2(arrayList);
            }
        }
    }

    public gc2(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f79597a = xmlHelper;
    }
}
