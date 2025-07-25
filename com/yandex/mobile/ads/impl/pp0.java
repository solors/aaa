package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pp0 {
    @NotNull

    /* renamed from: d */
    private static final Object f84042d = new Object();
    @Nullable

    /* renamed from: e */
    private static volatile pp0 f84043e;

    /* renamed from: f */
    public static final /* synthetic */ int f84044f = 0;
    @NotNull

    /* renamed from: a */
    private final y01 f84045a;
    @NotNull

    /* renamed from: b */
    private final ArrayList f84046b;

    /* renamed from: c */
    private int f84047c;

    /* renamed from: com.yandex.mobile.ads.impl.pp0$a */
    /* loaded from: classes8.dex */
    public static final class C31146a {
        @NotNull
        /* renamed from: a */
        public static pp0 m30600a() {
            pp0 pp0Var;
            pp0 pp0Var2 = pp0.f84043e;
            if (pp0Var2 == null) {
                synchronized (pp0.f84042d) {
                    pp0Var = pp0.f84043e;
                    if (pp0Var == null) {
                        pp0Var = new pp0();
                        pp0.f84043e = pp0Var;
                    }
                }
                return pp0Var;
            }
            return pp0Var2;
        }
    }

    /* synthetic */ pp0() {
        this(new y01(y01.f87979c));
    }

    @NotNull
    /* renamed from: c */
    public final Executor m30601c() {
        Executor executor;
        synchronized (f84042d) {
            if (this.f84046b.size() < 4) {
                executor = Executors.newSingleThreadExecutor(this.f84045a);
                Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor(...)");
                this.f84046b.add(executor);
            } else {
                ArrayList arrayList = this.f84046b;
                int i = this.f84047c;
                this.f84047c = i + 1;
                executor = (Executor) arrayList.get(i);
                if (this.f84047c == 4) {
                    this.f84047c = 0;
                }
            }
        }
        return executor;
    }

    private pp0(y01 y01Var) {
        this.f84045a = y01Var;
        this.f84046b = new ArrayList();
    }
}
