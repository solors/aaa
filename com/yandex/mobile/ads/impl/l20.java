package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Linear;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class l20 {
    @NotNull

    /* renamed from: a */
    private final gf2 f81678a;

    public /* synthetic */ l20() {
        this(new gf2());
    }

    /* renamed from: a */
    public final int m32365a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f81678a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, Linear.DURATION);
        this.f81678a.getClass();
        Long m33346a = i82.m33346a(gf2.m33835c(parser));
        if (m33346a != null) {
            return (int) m33346a.longValue();
        }
        return 0;
    }

    public l20(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f81678a = xmlHelper;
    }
}
