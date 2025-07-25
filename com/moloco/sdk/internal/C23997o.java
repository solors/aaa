package com.moloco.sdk.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C25168f;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.internal.o */
/* loaded from: classes7.dex */
public final class C23997o {
    @NotNull

    /* renamed from: a */
    public static final InterfaceC38501j f62080a;
    @NotNull

    /* renamed from: b */
    public static final InterfaceC38501j f62081b;

    static {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        m14554a = LazyJVM.m14554a(C23998a.f62082g);
        f62080a = m14554a;
        m14554a2 = LazyJVM.m14554a(C24000b.f62084g);
        f62081b = m14554a2;
    }

    /* renamed from: a */
    public static final C25168f m47224a() {
        return (C25168f) f62080a.getValue();
    }

    @Nullable
    /* renamed from: b */
    public static final C25168f m47223b(boolean z) {
        if (z) {
            return null;
        }
        return m47224a();
    }

    /* renamed from: com.moloco.sdk.internal.o$a */
    /* loaded from: classes7.dex */
    public static final class C23998a extends Lambda implements Functions<C25168f> {

        /* renamed from: g */
        public static final C23998a f62082g = new C23998a();

        public C23998a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final C25168f invoke() {
            return new C25168f(C23999a.f62083g, null, null, 6, null);
        }

        /* renamed from: com.moloco.sdk.internal.o$a$a */
        /* loaded from: classes7.dex */
        public static final class C23999a extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            public static final C23999a f62083g = new C23999a();

            public C23999a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                m47221a();
                return Unit.f99208a;
            }

            /* renamed from: a */
            public final void m47221a() {
            }
        }
    }

    /* renamed from: com.moloco.sdk.internal.o$b */
    /* loaded from: classes7.dex */
    public static final class C24000b extends Lambda implements Functions<C25168f> {

        /* renamed from: g */
        public static final C24000b f62084g = new C24000b();

        public C24000b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final C25168f invoke() {
            return new C25168f(C24001a.f62085g, C24002b.f62086g, C24003c.f62087g);
        }

        /* renamed from: com.moloco.sdk.internal.o$b$a */
        /* loaded from: classes7.dex */
        public static final class C24001a extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            public static final C24001a f62085g = new C24001a();

            public C24001a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                m47219a();
                return Unit.f99208a;
            }

            /* renamed from: a */
            public final void m47219a() {
            }
        }

        /* renamed from: com.moloco.sdk.internal.o$b$b */
        /* loaded from: classes7.dex */
        public static final class C24002b extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            public static final C24002b f62086g = new C24002b();

            public C24002b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                m47218a();
                return Unit.f99208a;
            }

            /* renamed from: a */
            public final void m47218a() {
            }
        }

        /* renamed from: com.moloco.sdk.internal.o$b$c */
        /* loaded from: classes7.dex */
        public static final class C24003c extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            public static final C24003c f62087g = new C24003c();

            public C24003c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                m47217a();
                return Unit.f99208a;
            }

            /* renamed from: a */
            public final void m47217a() {
            }
        }
    }
}
