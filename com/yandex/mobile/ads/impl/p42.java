package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class p42 {
    @NotNull

    /* renamed from: a */
    private final gf2 f83717a;
    @NotNull

    /* renamed from: b */
    private final v62 f83718b;

    public /* synthetic */ p42(Context context, jl1 jl1Var) {
        this(context, jl1Var, new gf2(), new v62(context, jl1Var));
    }

    @Nullable
    /* renamed from: a */
    public final l42 m30834a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        C31233qt.m30237a(this.f83717a, parser, "parser", "version", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f83717a.getClass();
            if (!gf2.m33837a(parser)) {
                break;
            }
            this.f83717a.getClass();
            if (gf2.m33836b(parser)) {
                if (Intrinsics.m17075f("Ad", parser.getName())) {
                    z52 m28521a = this.f83718b.m28521a(parser);
                    if (m28521a != null) {
                        arrayList.add(m28521a);
                    }
                } else {
                    this.f83717a.getClass();
                    gf2.m33834d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new l42(attributeValue, arrayList);
    }

    public p42(@NotNull Context context, @NotNull jl1 reporter, @NotNull gf2 xmlHelper, @NotNull v62 videoAdParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoAdParser, "videoAdParser");
        this.f83717a = xmlHelper;
        this.f83718b = videoAdParser;
    }
}
