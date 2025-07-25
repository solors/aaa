package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Verification;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class m52 {
    @NotNull

    /* renamed from: a */
    private final gf2 f82055a;

    public /* synthetic */ m52() {
        this(new gf2());
    }

    @Nullable
    /* renamed from: a */
    public final String m32090a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f82055a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, Verification.VERIFICATION_PARAMETERS);
        this.f82055a.getClass();
        String m33835c = gf2.m33835c(parser);
        if (m33835c.length() == 0) {
            return null;
        }
        return m33835c;
    }

    public m52(@NotNull gf2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f82055a = xmlHelper;
    }
}
