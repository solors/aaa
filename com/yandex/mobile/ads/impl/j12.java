package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.offset.C25619a;
import com.monetization.ads.video.parser.offset.VastTimeOffset;
import com.smaato.sdk.video.vast.model.Tracking;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class j12 implements ff2<i12> {
    @NotNull

    /* renamed from: a */
    private final gf2 f80704a;
    @NotNull

    /* renamed from: b */
    private final C25619a f80705b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ j12() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.gf2 r0 = new com.yandex.mobile.ads.impl.gf2
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            com.yandex.mobile.ads.impl.b02[] r2 = com.yandex.mobile.ads.impl.b02.values()
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.util.List r2 = kotlin.collections.C37561t.m17197p(r2)
            r1.<init>(r2)
            com.monetization.ads.video.parser.offset.a r2 = new com.monetization.ads.video.parser.offset.a
            r2.<init>(r1)
            r4.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j12.<init>():void");
    }

    @Override // com.yandex.mobile.ads.impl.ff2
    @Nullable
    /* renamed from: b */
    public final i12 mo28797a(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f80704a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        VastTimeOffset vastTimeOffset = null;
        parser.require(2, null, Tracking.NAME);
        String attributeValue = parser.getAttributeValue(null, "event");
        String attributeValue2 = parser.getAttributeValue(null, "offset");
        this.f80704a.getClass();
        String m33835c = gf2.m33835c(parser);
        if (m33835c == null) {
            m33835c = "";
        }
        if (attributeValue == null || attributeValue.length() == 0 || m33835c.length() <= 0) {
            return null;
        }
        if (attributeValue2 != null) {
            vastTimeOffset = this.f80705b.m44261a(attributeValue2);
        }
        Intrinsics.m17074g(attributeValue);
        return new i12(attributeValue, m33835c, vastTimeOffset);
    }

    public j12(@NotNull gf2 xmlHelper, @NotNull C25619a timeOffsetParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f80704a = xmlHelper;
        this.f80705b = timeOffsetParser;
    }
}
