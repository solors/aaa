package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l4 */
/* loaded from: classes8.dex */
public final class C30767l4 {
    @NotNull

    /* renamed from: c */
    private static final Object f81680c = new Object();
    @Nullable

    /* renamed from: d */
    private static volatile C30767l4 f81681d;

    /* renamed from: e */
    public static final /* synthetic */ int f81682e = 0;
    @NotNull

    /* renamed from: a */
    private final ArrayList f81683a;
    @NotNull

    /* renamed from: b */
    private final ArrayList f81684b;

    /* renamed from: com.yandex.mobile.ads.impl.l4$a */
    /* loaded from: classes8.dex */
    public static final class C30768a {
        @NotNull
        /* renamed from: a */
        public static C30767l4 m32352a() {
            C30767l4 c30767l4;
            C30767l4 c30767l42 = C30767l4.f81681d;
            if (c30767l42 == null) {
                synchronized (C30767l4.f81680c) {
                    c30767l4 = C30767l4.f81681d;
                    if (c30767l4 == null) {
                        c30767l4 = new C30767l4(0);
                        C30767l4.f81681d = c30767l4;
                    }
                }
                return c30767l4;
            }
            return c30767l42;
        }
    }

    private C30767l4() {
        this.f81683a = new ArrayList();
        this.f81684b = new ArrayList();
    }

    /* renamed from: b */
    public final void m32355b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (f81680c) {
            this.f81683a.remove(id2);
            this.f81683a.add(id2);
        }
    }

    @NotNull
    /* renamed from: c */
    public final List<String> m32354c() {
        List<String> m17553Z0;
        synchronized (f81680c) {
            m17553Z0 = _Collections.m17553Z0(this.f81684b);
        }
        return m17553Z0;
    }

    @NotNull
    /* renamed from: d */
    public final List<String> m32353d() {
        List<String> m17553Z0;
        synchronized (f81680c) {
            m17553Z0 = _Collections.m17553Z0(this.f81683a);
        }
        return m17553Z0;
    }

    /* renamed from: a */
    public final void m32357a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (f81680c) {
            this.f81684b.remove(id2);
            this.f81684b.add(id2);
        }
    }

    public /* synthetic */ C30767l4(int i) {
        this();
    }
}
