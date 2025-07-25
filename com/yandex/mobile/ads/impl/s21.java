package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class s21 {
    @NotNull

    /* renamed from: a */
    private final ii0 f84990a;

    public /* synthetic */ s21() {
        this(new ii0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Nullable
    /* renamed from: a */
    public final String m29879a(@Nullable f31 f31Var) {
        String str;
        ?? m17162q;
        String m17521z0;
        if (f31Var instanceof lv1) {
            ArrayList mo26377d = ((lv1) f31Var).mo26377d();
            m17162q = new ArrayList();
            Iterator it = mo26377d.iterator();
            while (it.hasNext()) {
                String info = ((f31) it.next()).getInfo();
                if (info != null) {
                    m17162q.add(info);
                }
            }
        } else {
            if (f31Var != null) {
                str = f31Var.getInfo();
            } else {
                str = null;
            }
            m17162q = C37563v.m17162q(str);
        }
        List list = m17162q;
        this.f84990a.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        if (!list.isEmpty()) {
            m17521z0 = _Collections.m17521z0(list, ",", C21114v8.C21123i.f54137d, C21114v8.C21123i.f54139e, 0, null, null, 56, null);
            return m17521z0;
        }
        return null;
    }

    public s21(@NotNull ii0 formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f84990a = formatter;
    }
}
