package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r2 */
/* loaded from: classes8.dex */
public final class C31253r2 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f84606a;

    public C31253r2(@NotNull List<C31920yr> adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        this.f84606a = m30165a(adBreaks);
    }

    /* renamed from: a */
    private static LinkedHashMap m30165a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((C31920yr) it.next(), EnumC31169q2.f84154b);
        }
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC31169q2 m30167a(@NotNull C31920yr adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        EnumC31169q2 enumC31169q2 = (EnumC31169q2) this.f84606a.get(adBreak);
        return enumC31169q2 == null ? EnumC31169q2.f84158f : enumC31169q2;
    }

    /* renamed from: a */
    public final boolean m30168a() {
        List m17163p;
        m17163p = C37563v.m17163p(EnumC31169q2.f84161i, EnumC31169q2.f84160h);
        Collection<EnumC31169q2> values = this.f84606a.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        for (EnumC31169q2 enumC31169q2 : values) {
            if (m17163p.contains(enumC31169q2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m30166a(@NotNull C31920yr adBreak, @NotNull EnumC31169q2 status) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(status, "status");
        if (status == EnumC31169q2.f84155c) {
            for (C31920yr c31920yr : this.f84606a.keySet()) {
                EnumC31169q2 enumC31169q2 = (EnumC31169q2) this.f84606a.get(c31920yr);
                if (EnumC31169q2.f84155c == enumC31169q2 || EnumC31169q2.f84156d == enumC31169q2) {
                    this.f84606a.put(c31920yr, EnumC31169q2.f84154b);
                }
            }
        }
        this.f84606a.put(adBreak, status);
    }
}
