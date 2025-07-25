package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Extension;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class m50 {
    @NotNull

    /* renamed from: a */
    private final gf2 f82051a;
    @NotNull

    /* renamed from: b */
    private final au1 f82052b;

    public /* synthetic */ m50(gf2 gf2Var) {
        this(gf2Var, new au1(gf2Var));
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m32092a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f82051a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f82051a.getClass();
            if (gf2.m33837a(parser)) {
                this.f82051a.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f(Extension.NAME, parser.getName())) {
                        i50 mo28797a = this.f82052b.mo28797a(parser);
                        if (mo28797a != null) {
                            arrayList.add(mo28797a);
                        }
                    } else {
                        this.f82051a.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return arrayList;
            }
        }
    }

    public m50(@NotNull gf2 xmlHelper, @NotNull au1 simpleExtensionParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(simpleExtensionParser, "simpleExtensionParser");
        this.f82051a = xmlHelper;
        this.f82052b = simpleExtensionParser;
    }
}
