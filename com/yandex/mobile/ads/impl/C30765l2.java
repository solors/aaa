package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.l2 */
/* loaded from: classes8.dex */
public final class C30765l2 {
    @NotNull

    /* renamed from: a */
    private final gf2 f81671a;
    @NotNull

    /* renamed from: b */
    private final m50 f81672b;
    @NotNull

    /* renamed from: c */
    private final C29925a9 f81673c;
    @NotNull

    /* renamed from: d */
    private final C30033bl f81674d;
    @NotNull

    /* renamed from: e */
    private final uk1 f81675e;
    @NotNull

    /* renamed from: f */
    private final c02 f81676f;
    @NotNull

    /* renamed from: g */
    private final k12 f81677g;

    public /* synthetic */ C30765l2(gf2 gf2Var, m50 m50Var) {
        this(gf2Var, m50Var, new C29925a9(gf2Var), new C30033bl(), new uk1(), new c02(), new k12());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138 A[EDGE_INSN: B:64:0x0138->B:51:0x0138 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cd -> B:35:0x00d2). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.C30530i2 m32366a(@org.jetbrains.annotations.NotNull org.xmlpull.v1.XmlPullParser r11) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, org.json.JSONException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30765l2.m32366a(org.xmlpull.v1.XmlPullParser):com.yandex.mobile.ads.impl.i2");
    }

    public C30765l2(@NotNull gf2 xmlHelper, @NotNull m50 extensionsParser, @NotNull C29925a9 adSourceParser, @NotNull C30033bl breakTypeParser, @NotNull uk1 repeatAfterParser, @NotNull c02 timeOffsetParser, @NotNull k12 trackingEventsParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(extensionsParser, "extensionsParser");
        Intrinsics.checkNotNullParameter(adSourceParser, "adSourceParser");
        Intrinsics.checkNotNullParameter(breakTypeParser, "breakTypeParser");
        Intrinsics.checkNotNullParameter(repeatAfterParser, "repeatAfterParser");
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        Intrinsics.checkNotNullParameter(trackingEventsParser, "trackingEventsParser");
        this.f81671a = xmlHelper;
        this.f81672b = extensionsParser;
        this.f81673c = adSourceParser;
        this.f81674d = breakTypeParser;
        this.f81675e = repeatAfterParser;
        this.f81676f = timeOffsetParser;
        this.f81677g = trackingEventsParser;
    }
}
