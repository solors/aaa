package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class oj0 {
    @NotNull

    /* renamed from: c */
    public static final C31048a f83536c = new C31048a(0);
    @Nullable

    /* renamed from: d */
    private static volatile oj0 f83537d;
    @NotNull

    /* renamed from: a */
    private final Object f83538a;
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<InterfaceC30043bs, c32> f83539b;

    /* renamed from: com.yandex.mobile.ads.impl.oj0$a */
    /* loaded from: classes8.dex */
    public static final class C31048a {
        private C31048a() {
        }

        @NotNull
        /* renamed from: a */
        public final oj0 m30975a() {
            oj0 oj0Var = oj0.f83537d;
            if (oj0Var == null) {
                synchronized (this) {
                    oj0Var = oj0.f83537d;
                    if (oj0Var == null) {
                        oj0Var = new oj0(0);
                        oj0.f83537d = oj0Var;
                    }
                }
            }
            return oj0Var;
        }

        public /* synthetic */ C31048a(int i) {
            this();
        }
    }

    private oj0() {
        this.f83538a = new Object();
        this.f83539b = new WeakHashMap<>();
    }

    /* renamed from: b */
    public final void m30976b(@NotNull InterfaceC30043bs instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f83538a) {
            this.f83539b.remove(instreamAdPlayer);
        }
    }

    @Nullable
    /* renamed from: a */
    public final c32 m30979a(@NotNull InterfaceC30043bs instreamAdPlayer) {
        c32 c32Var;
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f83538a) {
            c32Var = this.f83539b.get(instreamAdPlayer);
        }
        return c32Var;
    }

    public /* synthetic */ oj0(int i) {
        this();
    }

    /* renamed from: a */
    public final void m30978a(@NotNull InterfaceC30043bs instreamAdPlayer, @NotNull c32 adBinder) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f83538a) {
            this.f83539b.put(instreamAdPlayer, adBinder);
            Unit unit = Unit.f99208a;
        }
    }
}
