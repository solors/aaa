package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class qa1 {
    @NotNull

    /* renamed from: c */
    private static final Object f84273c = new Object();
    @Nullable

    /* renamed from: d */
    private static volatile qa1 f84274d;

    /* renamed from: e */
    public static final /* synthetic */ int f84275e = 0;
    @NotNull

    /* renamed from: a */
    private final za1 f84276a;

    /* renamed from: b */
    private boolean f84277b;

    /* renamed from: com.yandex.mobile.ads.impl.qa1$a */
    /* loaded from: classes8.dex */
    public static final class C31186a {
        @NotNull
        /* renamed from: a */
        public static qa1 m30430a() {
            qa1 qa1Var;
            qa1 qa1Var2 = qa1.f84274d;
            if (qa1Var2 == null) {
                synchronized (qa1.f84273c) {
                    qa1Var = qa1.f84274d;
                    if (qa1Var == null) {
                        qa1Var = new qa1();
                        qa1.f84274d = qa1Var;
                    }
                }
                return qa1Var;
            }
            return qa1Var2;
        }
    }

    /* synthetic */ qa1() {
        this(new za1());
    }

    /* renamed from: a */
    public final void m30433a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f84273c) {
            if (this.f84276a.m26292a(context) && !this.f84277b) {
                cb1.m35318a(context);
                this.f84277b = true;
            }
            Unit unit = Unit.f99208a;
        }
    }

    private qa1(za1 za1Var) {
        this.f84276a = za1Var;
    }
}
