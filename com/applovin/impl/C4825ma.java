package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.ma */
/* loaded from: classes2.dex */
public final class C4825ma extends AbstractC4718ki {

    /* renamed from: d */
    public static final InterfaceC5044o2.InterfaceC5045a f7927d = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.pz
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C4825ma.m97556d(bundle);
        }
    };

    /* renamed from: b */
    private final boolean f7928b;

    /* renamed from: c */
    private final boolean f7929c;

    public C4825ma() {
        this.f7928b = false;
        this.f7929c = false;
    }

    /* renamed from: a */
    private static String m97558a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public static C4825ma m97557b(Bundle bundle) {
        boolean z;
        if (bundle.getInt(m97558a(0), -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        if (bundle.getBoolean(m97558a(1), false)) {
            return new C4825ma(bundle.getBoolean(m97558a(2), false));
        }
        return new C4825ma();
    }

    /* renamed from: d */
    public static /* synthetic */ C4825ma m97556d(Bundle bundle) {
        return m97557b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4825ma)) {
            return false;
        }
        C4825ma c4825ma = (C4825ma) obj;
        if (this.f7929c != c4825ma.f7929c || this.f7928b != c4825ma.f7928b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f7928b), Boolean.valueOf(this.f7929c));
    }

    public C4825ma(boolean z) {
        this.f7928b = true;
        this.f7929c = z;
    }
}
