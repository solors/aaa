package io.bidmachine.analytics.internal;

import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: io.bidmachine.analytics.internal.l */
/* loaded from: classes9.dex */
public final class C35632l {

    /* renamed from: a */
    private final InterfaceC38501j f96519a;

    /* renamed from: io.bidmachine.analytics.internal.l$a */
    /* loaded from: classes9.dex */
    static final class C35633a extends Lambda implements Functions {

        /* renamed from: a */
        public static final C35633a f96520a = new C35633a();

        C35633a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final C35535F invoke() {
            return new C35535F(0, 1, null);
        }
    }

    public C35632l() {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C35633a.f96520a);
        this.f96519a = m14554a;
    }

    /* renamed from: a */
    public final C35535F m20160a() {
        return (C35535F) this.f96519a.getValue();
    }
}
