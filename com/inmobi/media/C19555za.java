package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.za */
/* loaded from: classes6.dex */
public final class C19555za {

    /* renamed from: a */
    public final C19304hb f48967a;

    /* renamed from: b */
    public final double f48968b;

    /* renamed from: c */
    public final List f48969c;

    public C19555za(C19304hb telemetryConfigMetaData, double d, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f48967a = telemetryConfigMetaData;
        this.f48968b = d;
        this.f48969c = samplingEvents;
        Intrinsics.checkNotNullExpressionValue(C19555za.class.getSimpleName(), "getSimpleName(...)");
    }
}
