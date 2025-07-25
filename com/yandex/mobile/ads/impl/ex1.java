package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ex1 {
    @NotNull

    /* renamed from: a */
    private final C30834m9 f78833a = new C30834m9();

    @NotNull
    /* renamed from: a */
    public final String m34413a(@NotNull String sponsoredText, @NotNull C30777l9 adTuneInfo) {
        List m17160s;
        boolean m16635B;
        String m17521z0;
        Intrinsics.checkNotNullParameter(sponsoredText, "sponsoredText");
        Intrinsics.checkNotNullParameter(adTuneInfo, "adTuneInfo");
        m17160s = C37563v.m17160s(sponsoredText);
        this.f78833a.getClass();
        String m32077a = C30834m9.m32077a(adTuneInfo);
        m16635B = StringsJVM.m16635B(m32077a);
        if (!m16635B) {
            m17160s.add(m32077a);
        }
        m17521z0 = _Collections.m17521z0(m17160s, " · ", null, null, 0, null, null, 62, null);
        return m17521z0;
    }
}
