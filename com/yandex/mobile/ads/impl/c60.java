package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c60 {
    @NotNull

    /* renamed from: a */
    private final sp0 f77530a;
    @NotNull

    /* renamed from: b */
    private final b60 f77531b;

    /* renamed from: com.yandex.mobile.ads.impl.c60$a */
    /* loaded from: classes8.dex */
    public static final class C30073a {
        @Nullable

        /* renamed from: a */
        private static c60 f77532a;

        @NotNull
        /* renamed from: a */
        public static final synchronized c60 m35349a(@NotNull Context context) {
            c60 c60Var;
            synchronized (C30073a.class) {
                Intrinsics.checkNotNullParameter(context, "context");
                c60Var = f77532a;
                if (c60Var == null) {
                    c60Var = new c60(context, 0);
                    f77532a = c60Var;
                }
            }
            return c60Var;
        }
    }

    private c60(Context context) {
        this(up0.m28713a(context, "FalseClickDataStorage"));
    }

    /* renamed from: a */
    public final void m35353a() {
        this.f77530a.clear();
    }

    @NotNull
    /* renamed from: b */
    public final List<a60> m35350b() {
        List<a60> m17553Z0;
        Set<String> keySet = this.f77530a.mo29098a().keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            String mo29082d = this.f77530a.mo29082d(str);
            if (mo29082d != null) {
                arrayList.add(mo29082d);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a60 m35637a = this.f77531b.m35637a((String) it.next());
            if (m35637a != null) {
                arrayList2.add(m35637a);
            }
        }
        m17553Z0 = _Collections.m17553Z0(arrayList2);
        return m17553Z0;
    }

    public /* synthetic */ c60(Context context, int i) {
        this(context);
    }

    /* renamed from: a */
    public final void m35352a(long j) {
        this.f77530a.mo29094a(String.valueOf(j));
    }

    public /* synthetic */ c60(sp0 sp0Var) {
        this(sp0Var, new b60(0));
    }

    /* renamed from: a */
    public final void m35351a(@NotNull a60 falseClickData) {
        Intrinsics.checkNotNullParameter(falseClickData, "falseClickData");
        this.f77530a.mo29092a(String.valueOf(falseClickData.m35958f()), this.f77531b.m35638a(falseClickData));
    }

    @VisibleForTesting
    public c60(@NotNull sp0 localStorage, @NotNull b60 falseClickDataFormatter) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(falseClickDataFormatter, "falseClickDataFormatter");
        this.f77530a = localStorage;
        this.f77531b = falseClickDataFormatter;
    }
}
