package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.c */
/* loaded from: classes7.dex */
public final class C25399c {
    @NotNull

    /* renamed from: a */
    public static final InterfaceC38501j f65963a;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.c$a */
    /* loaded from: classes7.dex */
    public static final class C25400a extends Lambda implements Functions<C25401d> {

        /* renamed from: g */
        public static final C25400a f65964g = new C25400a();

        public C25400a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final C25401d invoke() {
            return new C25401d();
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C25400a.f65964g);
        f65963a = m14554a;
    }

    @NotNull
    /* renamed from: a */
    public static final InterfaceC25396a m44619a() {
        return m44618b();
    }

    /* renamed from: b */
    public static final C25401d m44618b() {
        return (C25401d) f65963a.getValue();
    }
}
