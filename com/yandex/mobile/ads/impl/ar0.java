package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ar0 {
    @NotNull

    /* renamed from: b */
    private static final Object f76880b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile ar0 f76881c;

    /* renamed from: d */
    public static final /* synthetic */ int f76882d = 0;
    @NotNull

    /* renamed from: a */
    private final WeakHashMap f76883a;

    /* renamed from: com.yandex.mobile.ads.impl.ar0$a */
    /* loaded from: classes8.dex */
    public static final class C29959a {
        @NotNull
        /* renamed from: a */
        public static ar0 m35803a() {
            if (ar0.f76881c == null) {
                synchronized (ar0.f76880b) {
                    if (ar0.f76881c == null) {
                        ar0.f76881c = new ar0(0);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            ar0 ar0Var = ar0.f76881c;
            if (ar0Var != null) {
                return ar0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private ar0() {
        this.f76883a = new WeakHashMap();
    }

    @Nullable
    /* renamed from: a */
    public final uq0 m35807a(@NotNull h50 view) {
        uq0 uq0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (f76880b) {
            uq0Var = (uq0) this.f76883a.get(view);
        }
        return uq0Var;
    }

    public /* synthetic */ ar0(int i) {
        this();
    }

    /* renamed from: a */
    public final void m35806a(@NotNull h50 view, @NotNull uq0 presenter) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (f76880b) {
            uq0 uq0Var = (uq0) this.f76883a.put(view, presenter);
        }
    }

    /* renamed from: a */
    public final boolean m35805a(@NotNull uq0 presenter) {
        boolean z;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (f76880b) {
            Iterator it = this.f76883a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (Intrinsics.m17075f(presenter, (uq0) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
