package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.io.StringReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class h52 {
    @NotNull

    /* renamed from: a */
    private final gf2 f79958a;
    @NotNull

    /* renamed from: b */
    private final p42 f79959b;

    public /* synthetic */ h52(Context context, jl1 jl1Var) {
        this(context, jl1Var, new gf2(), new p42(context, jl1Var));
    }

    @Nullable
    /* renamed from: a */
    public final l42 m33612a(@NotNull String data) throws XmlPullParserException, IOException, JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(new StringReader(data));
        Intrinsics.m17074g(parser);
        parser.nextTag();
        this.f79958a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, VastTree.VAST);
        return this.f79959b.m30834a(parser);
    }

    public h52(@NotNull Context context, @NotNull jl1 reporter, @NotNull gf2 xmlHelper, @NotNull p42 vastAdsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(vastAdsParser, "vastAdsParser");
        this.f79958a = xmlHelper;
        this.f79959b = vastAdsParser;
    }
}
