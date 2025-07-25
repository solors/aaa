package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.chartboost.sdk.impl.s4 */
/* loaded from: classes3.dex */
public final class C10183s4 implements InterfaceC10163r4 {

    /* renamed from: a */
    public final InterfaceC38501j f23095a;

    /* renamed from: b */
    public final InterfaceC38501j f23096b;

    /* renamed from: com.chartboost.sdk.impl.s4$a */
    /* loaded from: classes3.dex */
    public static final class C10184a extends Lambda implements Functions {

        /* renamed from: b */
        public static final C10184a f23097b = new C10184a();

        public C10184a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final ScheduledExecutorService invoke() {
            return C10108p1.m80862a(0, null, 3, null);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.s4$b */
    /* loaded from: classes3.dex */
    public static final class C10185b extends Lambda implements Functions {

        /* renamed from: b */
        public static final C10185b f23098b = new C10185b();

        public C10185b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final ExecutorService invoke() {
            return C10108p1.m80864a(4, 0L, null, 6, null);
        }
    }

    public C10183s4() {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        m14554a = LazyJVM.m14554a(C10185b.f23098b);
        this.f23095a = m14554a;
        m14554a2 = LazyJVM.m14554a(C10184a.f23097b);
        this.f23096b = m14554a2;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10163r4
    /* renamed from: a */
    public ScheduledExecutorService mo80630a() {
        return (ScheduledExecutorService) this.f23096b.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10163r4
    /* renamed from: b */
    public ExecutorService mo80629b() {
        return (ExecutorService) this.f23095a.getValue();
    }
}
