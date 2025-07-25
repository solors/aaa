package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: com.ironsource.ls */
/* loaded from: classes6.dex */
public final class C20289ls {
    @NotNull

    /* renamed from: a */
    public static final C20289ls f51040a = new C20289ls();
    @NotNull

    /* renamed from: b */
    private static final InterfaceC38501j f51041b;

    @Metadata
    /* renamed from: com.ironsource.ls$a */
    /* loaded from: classes6.dex */
    static final class C20290a extends Lambda implements Functions<C21327zp> {

        /* renamed from: a */
        public static final C20290a f51042a = new C20290a();

        C20290a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final C21327zp invoke() {
            return new C21327zp(16, null, null, 6, null);
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C20290a.f51042a);
        f51041b = m14554a;
    }

    private C20289ls() {
    }

    /* renamed from: a */
    private final C21327zp m57368a() {
        return (C21327zp) f51041b.getValue();
    }

    /* renamed from: a */
    public static /* synthetic */ void m57367a(C20289ls c20289ls, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c20289ls.m57365a(runnable, j);
    }

    /* renamed from: a */
    public final void m57366a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m57367a(this, action, 0L, 2, null);
    }

    /* renamed from: a */
    public final void m57365a(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        m57368a().schedule(action, j, TimeUnit.MILLISECONDS);
    }
}
