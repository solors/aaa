package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a1 */
/* loaded from: classes8.dex */
public final class C29912a1 {
    @NotNull

    /* renamed from: b */
    private static final Object f76653b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C29912a1 f76654c;

    /* renamed from: d */
    public static final /* synthetic */ int f76655d = 0;
    @NotNull

    /* renamed from: a */
    private final HashMap<Long, C31942z0> f76656a;

    /* renamed from: com.yandex.mobile.ads.impl.a1$a */
    /* loaded from: classes8.dex */
    public static final class C29913a {
        @NotNull
        /* renamed from: a */
        public static C29912a1 m36014a() {
            C29912a1 c29912a1;
            C29912a1 c29912a12 = C29912a1.f76654c;
            if (c29912a12 == null) {
                synchronized (C29912a1.f76653b) {
                    c29912a1 = C29912a1.f76654c;
                    if (c29912a1 == null) {
                        c29912a1 = new C29912a1(0);
                        C29912a1.f76654c = c29912a1;
                    }
                }
                return c29912a1;
            }
            return c29912a12;
        }
    }

    private C29912a1() {
        this.f76656a = new HashMap<>();
    }

    @Nullable
    /* renamed from: a */
    public final C31942z0 m36018a(long j) {
        C31942z0 remove;
        synchronized (f76653b) {
            remove = this.f76656a.remove(Long.valueOf(j));
        }
        return remove;
    }

    public /* synthetic */ C29912a1(int i) {
        this();
    }

    /* renamed from: a */
    public final void m36017a(long j, @NotNull C31942z0 adActivityData) {
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        synchronized (f76653b) {
            this.f76656a.put(Long.valueOf(j), adActivityData);
        }
    }
}
