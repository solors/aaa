package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Verification;
import com.yandex.mobile.ads.impl.z52;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class e62 {
    @NotNull

    /* renamed from: a */
    private final gf2 f78469a;
    @NotNull

    /* renamed from: b */
    private final ef2<C30746kt> f78470b;
    @NotNull

    /* renamed from: c */
    private final ef2<j52> f78471c;
    @NotNull

    /* renamed from: d */
    private final gc2 f78472d;
    @NotNull

    /* renamed from: e */
    private final i62 f78473e;

    public /* synthetic */ e62(Context context, jl1 jl1Var) {
        this(context, jl1Var, new gf2(), new ef2(new C31311rt(context, jl1Var), "Creatives", Creative.NAME), new ef2(new n52(), "AdVerifications", Verification.NAME), new gc2(), new i62());
    }

    /* renamed from: a */
    public final void m34656a(@NotNull XmlPullParser parser, @NotNull z52.C31954a videoAdBuilder) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(videoAdBuilder, "videoAdBuilder");
        String name = parser.getName();
        if (Intrinsics.m17075f("Impression", name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26346b(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f("ViewableImpression", name)) {
            videoAdBuilder.m26354a(this.f78472d.mo28797a(parser));
        } else if (Intrinsics.m17075f("Error", name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26350a(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f("Survey", name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26341g(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f(InLine.DESCRIPTION, name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26343e(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f(InLine.AD_TITLE, name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26344d(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f("AdSystem", name)) {
            this.f78469a.getClass();
            videoAdBuilder.m26345c(gf2.m33835c(parser));
        } else if (Intrinsics.m17075f("Creatives", name)) {
            videoAdBuilder.m26349a(this.f78470b.mo28797a(parser));
        } else if (Intrinsics.m17075f("AdVerifications", name)) {
            videoAdBuilder.m26348a((List) this.f78471c.mo28797a(parser));
        } else if (Intrinsics.m17075f("Extensions", name)) {
            videoAdBuilder.m26353a(this.f78473e.m33358a(parser));
        } else {
            this.f78469a.getClass();
            gf2.m33834d(parser);
        }
    }

    public e62(@NotNull Context context, @NotNull jl1 reporter, @NotNull gf2 xmlHelper, @NotNull ef2<C30746kt> creativeArrayParser, @NotNull ef2<j52> verificationArrayParser, @NotNull gc2 viewableImpressionParser, @NotNull i62 videoAdExtensionsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(creativeArrayParser, "creativeArrayParser");
        Intrinsics.checkNotNullParameter(verificationArrayParser, "verificationArrayParser");
        Intrinsics.checkNotNullParameter(viewableImpressionParser, "viewableImpressionParser");
        Intrinsics.checkNotNullParameter(videoAdExtensionsParser, "videoAdExtensionsParser");
        this.f78469a = xmlHelper;
        this.f78470b = creativeArrayParser;
        this.f78471c = verificationArrayParser;
        this.f78472d = viewableImpressionParser;
        this.f78473e = videoAdExtensionsParser;
    }
}
