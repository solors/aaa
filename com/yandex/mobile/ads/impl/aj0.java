package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.offset.C25619a;
import com.monetization.ads.video.parser.offset.VastTimeOffset;
import com.yandex.mobile.ads.impl.C32011zr;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C37559r0;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class aj0 {
    @NotNull

    /* renamed from: b */
    private static final Set<b02> f76810b;
    @NotNull

    /* renamed from: c */
    private static final Map<VastTimeOffset.EnumC25618b, C32011zr.EnumC32012a> f76811c;
    @NotNull

    /* renamed from: a */
    private final C25619a f76812a;

    static {
        Set<b02> m17121h;
        Map<VastTimeOffset.EnumC25618b, C32011zr.EnumC32012a> m17281m;
        m17121h = C37572z0.m17121h(b02.f76982d, b02.f76983e, b02.f76981c, b02.f76980b, b02.f76984f);
        f76810b = m17121h;
        m17281m = C37559r0.m17281m(C38513v.m14532a(VastTimeOffset.EnumC25618b.f66576b, C32011zr.EnumC32012a.f89081c), C38513v.m14532a(VastTimeOffset.EnumC25618b.f66577c, C32011zr.EnumC32012a.f89080b), C38513v.m14532a(VastTimeOffset.EnumC25618b.f66578d, C32011zr.EnumC32012a.f89082d));
        f76811c = m17281m;
    }

    public /* synthetic */ aj0() {
        this(new C25619a(f76810b));
    }

    @Nullable
    /* renamed from: a */
    public final C32011zr m35854a(@NotNull a02 timeOffset) {
        C32011zr.EnumC32012a enumC32012a;
        Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
        VastTimeOffset m44261a = this.f76812a.m44261a(timeOffset.m36020a());
        if (m44261a != null && (enumC32012a = f76811c.get(m44261a.m44263c())) != null) {
            return new C32011zr(enumC32012a, m44261a.m44262d());
        }
        return null;
    }

    public aj0(@NotNull C25619a timeOffsetParser) {
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f76812a = timeOffsetParser;
    }
}
