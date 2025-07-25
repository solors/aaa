package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qa2 {
    @NotNull

    /* renamed from: c */
    private static final List<String> f84278c;
    @NotNull

    /* renamed from: a */
    private final x82 f84279a;
    @NotNull

    /* renamed from: b */
    private final m32 f84280b;

    static {
        List<String> m17163p;
        m17163p = C37563v.m17163p("clickTracking", "impression");
        f84278c = m17163p;
    }

    public qa2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84279a = new x82(context);
        this.f84280b = new m32(context);
    }

    /* renamed from: a */
    public final void m30429a(@NotNull pa2 trackable, @NotNull String eventName) {
        int m17154x;
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        List<String> list = trackable.mo26370a().get(eventName);
        if (f84278c.contains(eventName)) {
            if (list != null) {
                m17154x = C37566w.m17154x(list, 10);
                ArrayList arrayList = new ArrayList(m17154x);
                for (String str : list) {
                    arrayList.add(this.f84280b.m32106a(str));
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            this.f84279a.m27625a(list, null);
        }
    }

    /* renamed from: a */
    public final void m30428a(@NotNull pa2 trackable, @NotNull String eventName, @NotNull Map<String, String> macros) {
        Intrinsics.checkNotNullParameter(trackable, "trackable");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        List<String> list = trackable.mo26370a().get(eventName);
        if (list != null) {
            this.f84279a.m27625a(list, macros);
        }
    }
}
