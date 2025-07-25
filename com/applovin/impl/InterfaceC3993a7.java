package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.InterfaceC3993a7;
import com.applovin.impl.InterfaceC5897y6;
import com.applovin.impl.InterfaceC5956z6;

/* renamed from: com.applovin.impl.a7 */
/* loaded from: classes2.dex */
public interface InterfaceC3993a7 {

    /* renamed from: a */
    public static final InterfaceC3993a7 f4531a;

    /* renamed from: b */
    public static final InterfaceC3993a7 f4532b;

    static {
        C3994a c3994a = new C3994a();
        f4531a = c3994a;
        f4532b = c3994a;
    }

    /* renamed from: a */
    int mo93271a(C4310e9 c4310e9);

    /* renamed from: a */
    InterfaceC5897y6 mo93273a(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9);

    /* renamed from: b */
    default void mo93261b() {
    }

    /* renamed from: com.applovin.impl.a7$a */
    /* loaded from: classes2.dex */
    class C3994a implements InterfaceC3993a7 {
        C3994a() {
        }

        @Override // com.applovin.impl.InterfaceC3993a7
        /* renamed from: a */
        public InterfaceC5897y6 mo93273a(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9) {
            if (c4310e9.f5816p == null) {
                return null;
            }
            return new C5543t7(new InterfaceC5897y6.C5898a(new C5523sp(1), 6001));
        }

        @Override // com.applovin.impl.InterfaceC3993a7
        /* renamed from: a */
        public int mo93271a(C4310e9 c4310e9) {
            return c4310e9.f5816p != null ? 1 : 0;
        }
    }

    /* renamed from: b */
    default InterfaceC3995b mo93259b(Looper looper, InterfaceC5956z6.C5957a c5957a, C4310e9 c4310e9) {
        return InterfaceC3995b.f4533a;
    }

    /* renamed from: com.applovin.impl.a7$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3995b {

        /* renamed from: a */
        public static final InterfaceC3995b f4533a = new InterfaceC3995b() { // from class: com.applovin.impl.ks
            @Override // com.applovin.impl.InterfaceC3993a7.InterfaceC3995b
            /* renamed from: a */
            public final void mo93239a() {
                InterfaceC3993a7.InterfaceC3995b.m101023d();
            }
        };

        /* renamed from: d */
        static /* synthetic */ void m101023d() {
            m101024b();
        }

        /* renamed from: a */
        void mo93239a();

        /* renamed from: b */
        static /* synthetic */ void m101024b() {
        }
    }

    /* renamed from: a */
    default void mo93277a() {
    }
}
