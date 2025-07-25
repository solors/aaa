package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.VideoClicks;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class o82 implements ff2<n82> {
    @NotNull

    /* renamed from: a */
    private final gf2 f83368a;

    public /* synthetic */ o82() {
        this(new gf2());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @NotNull
    /* renamed from: b */
    public final n82 mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f83368a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        String str = null;
        parser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f83368a.getClass();
            if (gf2.m33837a(parser)) {
                this.f83368a.getClass();
                if (gf2.m33836b(parser)) {
                    String name = parser.getName();
                    if (Intrinsics.m17075f(VideoClicks.CLICK_THROUGH, name)) {
                        this.f83368a.getClass();
                        String m33835c = gf2.m33835c(parser);
                        if (m33835c.length() > 0) {
                            str = m33835c;
                        }
                    } else if (Intrinsics.m17075f(VideoClicks.CLICK_TRACKING, name)) {
                        this.f83368a.getClass();
                        String m33835c2 = gf2.m33835c(parser);
                        if (m33835c2.length() > 0) {
                            arrayList.add(m33835c2);
                        }
                    } else {
                        this.f83368a.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return new n82(str, arrayList);
            }
        }
    }

    public o82(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f83368a = xmlHelper;
    }
}
