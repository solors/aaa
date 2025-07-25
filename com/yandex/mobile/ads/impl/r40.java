package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class r40 {
    @NotNull

    /* renamed from: c */
    private static final Object f84619c = new Object();
    @Nullable

    /* renamed from: d */
    private static volatile r40 f84620d;

    /* renamed from: e */
    public static final /* synthetic */ int f84621e = 0;
    @NotNull

    /* renamed from: a */
    private final q40 f84622a;
    @Nullable

    /* renamed from: b */
    private wt1 f84623b;

    /* renamed from: com.yandex.mobile.ads.impl.r40$a */
    /* loaded from: classes8.dex */
    public static final class C31257a {
        @NotNull
        /* renamed from: a */
        public static r40 m30152a() {
            r40 r40Var;
            r40 r40Var2 = r40.f84620d;
            if (r40Var2 == null) {
                synchronized (r40.f84619c) {
                    r40Var = r40.f84620d;
                    if (r40Var == null) {
                        r40Var = new r40(0);
                        r40.f84620d = r40Var;
                    }
                }
                return r40Var;
            }
            return r40Var2;
        }
    }

    private r40() {
        this.f84622a = new q40();
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31296rl m30155a(@NotNull Context context) {
        wt1 wt1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f84619c) {
            wt1Var = this.f84623b;
            if (wt1Var == null) {
                wt1Var = this.f84622a.m30476a(context);
                this.f84623b = wt1Var;
            }
        }
        return wt1Var;
    }

    public /* synthetic */ r40(int i) {
        this();
    }
}
