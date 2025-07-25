package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Tracking;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class k12 {
    @NotNull

    /* renamed from: a */
    private final gf2 f81229a;
    @NotNull

    /* renamed from: b */
    private final j12 f81230b;

    public /* synthetic */ k12() {
        this(new gf2(), new j12());
    }

    @NotNull
    /* renamed from: a */
    public final HashMap m32687a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f81229a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            this.f81229a.getClass();
            if (gf2.m33837a(parser)) {
                this.f81229a.getClass();
                if (gf2.m33836b(parser)) {
                    if (Intrinsics.m17075f(Tracking.NAME, parser.getName())) {
                        i12 mo28797a = this.f81230b.mo28797a(parser);
                        if (mo28797a != null) {
                            String m33392a = mo28797a.m33392a();
                            String m33390c = mo28797a.m33390c();
                            if (!hashMap.containsKey(m33392a)) {
                                hashMap.put(m33392a, new ArrayList());
                            }
                            List list = (List) hashMap.get(m33392a);
                            if (list != null) {
                                list.add(m33390c);
                            }
                        }
                    } else {
                        this.f81229a.getClass();
                        gf2.m33834d(parser);
                    }
                }
            } else {
                return hashMap;
            }
        }
    }

    public k12(@NotNull gf2 xmlHelper, @NotNull j12 trackingEventParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(trackingEventParser, "trackingEventParser");
        this.f81229a = xmlHelper;
        this.f81230b = trackingEventParser;
    }
}
