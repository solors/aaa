package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cg2 implements InstreamAd {
    @NotNull

    /* renamed from: a */
    private final C31763wr f77624a;

    public cg2(@NotNull C31763wr coreInstreamAd) {
        Intrinsics.checkNotNullParameter(coreInstreamAd, "coreInstreamAd");
        this.f77624a = coreInstreamAd;
    }

    @NotNull
    /* renamed from: a */
    public final C31763wr m35234a() {
        return this.f77624a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cg2) && Intrinsics.m17075f(this.f77624a, ((cg2) obj).f77624a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    @NotNull
    public final List<InstreamAdBreak> getAdBreaks() {
        int m17154x;
        List<C31920yr> m27849a = this.f77624a.m27849a();
        m17154x = C37566w.m17154x(m27849a, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (C31920yr c31920yr : m27849a) {
            arrayList.add(new dg2(c31920yr));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f77624a.hashCode();
    }

    @NotNull
    public final String toString() {
        C31763wr c31763wr = this.f77624a;
        return "YandexInstreamAd(coreInstreamAd=" + c31763wr + ")";
    }
}
