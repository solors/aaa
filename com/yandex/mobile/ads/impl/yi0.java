package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yi0 {
    @NotNull

    /* renamed from: b */
    private static final Object f88223b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile yi0 f88224c;

    /* renamed from: d */
    public static final /* synthetic */ int f88225d = 0;
    @NotNull

    /* renamed from: a */
    private final WeakHashMap<View, C31835xr> f88226a;

    /* renamed from: com.yandex.mobile.ads.impl.yi0$a */
    /* loaded from: classes8.dex */
    public static final class C31899a {
        @NotNull
        /* renamed from: a */
        public static yi0 m26892a() {
            if (yi0.f88224c == null) {
                synchronized (yi0.f88223b) {
                    if (yi0.f88224c == null) {
                        yi0.f88224c = new yi0(0);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            yi0 yi0Var = yi0.f88224c;
            if (yi0Var != null) {
                return yi0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private yi0() {
        this.f88226a = new WeakHashMap<>();
    }

    @Nullable
    /* renamed from: a */
    public final C31835xr m26897a(@NotNull View view) {
        C31835xr c31835xr;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (f88223b) {
            c31835xr = this.f88226a.get(view);
        }
        return c31835xr;
    }

    public /* synthetic */ yi0(int i) {
        this();
    }

    /* renamed from: a */
    public final void m26896a(@NotNull View view, @NotNull C31835xr instreamAdBinder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (f88223b) {
            this.f88226a.put(view, instreamAdBinder);
        }
    }

    /* renamed from: a */
    public final boolean m26895a(@NotNull C31835xr instreamAdBinder) {
        boolean z;
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (f88223b) {
            Set<Map.Entry<View, C31835xr>> entrySet = this.f88226a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
            Iterator<Map.Entry<View, C31835xr>> it = entrySet.iterator();
            z = false;
            while (it.hasNext()) {
                if (instreamAdBinder == it.next().getValue()) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
