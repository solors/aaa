package com.yandex.mobile.ads.impl;

import com.monetization.ads.video.parser.offset.C25619a;
import com.monetization.ads.video.parser.offset.VastTimeOffset;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bv1 {
    @NotNull

    /* renamed from: b */
    private static final HashSet f77413b;
    @NotNull

    /* renamed from: a */
    private final C25619a f77414a;

    static {
        List m17163p;
        m17163p = C37563v.m17163p(b02.f76981c, b02.f76980b);
        f77413b = new HashSet(m17163p);
    }

    public /* synthetic */ bv1() {
        this(new C25619a(f77413b));
    }

    @Nullable
    /* renamed from: a */
    public final x72 m35431a(@NotNull C30746kt creative) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        int m32443d = creative.m32443d();
        cv1 m32439h = creative.m32439h();
        if (m32439h != null) {
            VastTimeOffset m44261a = this.f77414a.m44261a(m32439h.m35147a());
            if (m44261a != null) {
                float m44262d = m44261a.m44262d();
                if (VastTimeOffset.EnumC25618b.f66577c == m44261a.m44263c()) {
                }
                return new x72(Math.min(m44262d, m32443d));
            }
        }
        return null;
    }

    public bv1(@NotNull C25619a timeOffsetParser) {
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f77414a = timeOffsetParser;
    }
}
