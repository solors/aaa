package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.yandex.mobile.ads.impl.z52;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class af2 {
    @NotNull

    /* renamed from: a */
    private final gf2 f76779a;
    @NotNull

    /* renamed from: b */
    private final e62 f76780b;
    @NotNull

    /* renamed from: c */
    private final ye2 f76781c;

    public /* synthetic */ af2(Context context, jl1 jl1Var) {
        this(context, jl1Var, new gf2(), new e62(context, jl1Var), new ye2());
    }

    @NotNull
    /* renamed from: a */
    public final z52 m35904a(@NotNull XmlPullParser parser, @NotNull z52.C31954a videoAdBuilder) throws IOException, XmlPullParserException, JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(videoAdBuilder, "videoAdBuilder");
        this.f76779a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Wrapper");
        this.f76781c.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        videoAdBuilder.m26352a(new xe2(Boolean.parseBoolean(parser.getAttributeValue(null, Wrapper.ALLOW_MULTIPLE_ADS)), Boolean.parseBoolean(parser.getAttributeValue(null, Wrapper.FOLLOW_ADDITIONAL_WRAPPERS))));
        while (true) {
            this.f76779a.getClass();
            if (gf2.m33837a(parser)) {
                this.f76779a.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f("VASTAdTagURI", parser.getName())) {
                        this.f76779a.getClass();
                        videoAdBuilder.m26340h(gf2.m33835c(parser));
                    } else {
                        this.f76780b.m34656a(parser, videoAdBuilder);
                    }
                }
            } else {
                return videoAdBuilder.m26355a();
            }
        }
    }

    public af2(@NotNull Context context, @NotNull jl1 reporter, @NotNull gf2 xmlHelper, @NotNull e62 videoAdElementParser, @NotNull ye2 wrapperConfigurationParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoAdElementParser, "videoAdElementParser");
        Intrinsics.checkNotNullParameter(wrapperConfigurationParser, "wrapperConfigurationParser");
        this.f76779a = xmlHelper;
        this.f76780b = videoAdElementParser;
        this.f76781c = wrapperConfigurationParser;
    }
}
