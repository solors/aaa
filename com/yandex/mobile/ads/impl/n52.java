package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.models.p550ad.JavaScriptResource;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class n52 implements ff2<j52> {
    @NotNull

    /* renamed from: a */
    private final gf2 f82617a;
    @NotNull

    /* renamed from: b */
    private final qn0 f82618b;
    @NotNull

    /* renamed from: c */
    private final m52 f82619c;
    @NotNull

    /* renamed from: d */
    private final k12 f82620d;

    public /* synthetic */ n52() {
        this(new gf2(), new qn0(), new m52(), new k12());
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    /* renamed from: a */
    public final j52 mo28797a(XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f82617a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, Verification.NAME);
        C31233qt.m30237a(this.f82617a, parser, "parser", Verification.VENDOR, "attributeName");
        String attributeValue = parser.getAttributeValue(null, Verification.VENDOR);
        HashMap hashMap = new HashMap();
        JavaScriptResource javaScriptResource = null;
        String str = null;
        while (true) {
            this.f82617a.getClass();
            if (!gf2.m33837a(parser)) {
                break;
            }
            this.f82617a.getClass();
            if (gf2.m33836b(parser)) {
                String name = parser.getName();
                if (Intrinsics.m17075f("JavaScriptResource", name)) {
                    javaScriptResource = this.f82618b.m30258a(parser);
                } else if (Intrinsics.m17075f(Verification.VERIFICATION_PARAMETERS, name)) {
                    str = this.f82619c.m32090a(parser);
                } else if (Intrinsics.m17075f("TrackingEvents", name)) {
                    hashMap = this.f82620d.m32687a(parser);
                } else {
                    this.f82617a.getClass();
                    gf2.m33834d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new j52(attributeValue, javaScriptResource, str, hashMap);
    }

    public n52(@NotNull gf2 xmlHelper, @NotNull qn0 javaScriptResourceParser, @NotNull m52 verificationParametersParser, @NotNull k12 trackingEventsParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(javaScriptResourceParser, "javaScriptResourceParser");
        Intrinsics.checkNotNullParameter(verificationParametersParser, "verificationParametersParser");
        Intrinsics.checkNotNullParameter(trackingEventsParser, "trackingEventsParser");
        this.f82617a = xmlHelper;
        this.f82618b = javaScriptResourceParser;
        this.f82619c = verificationParametersParser;
        this.f82620d = trackingEventsParser;
    }
}
