package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.co */
/* loaded from: classes2.dex */
public final class C4202co extends AbstractC4718ki {

    /* renamed from: d */
    public static final InterfaceC5044o2.InterfaceC5045a f5368d = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.lu
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C4202co.m100088d(bundle);
        }
    };

    /* renamed from: b */
    private final boolean f5369b;

    /* renamed from: c */
    private final boolean f5370c;

    public C4202co() {
        this.f5369b = false;
        this.f5370c = false;
    }

    /* renamed from: a */
    private static String m100090a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public static C4202co m100089b(Bundle bundle) {
        boolean z;
        if (bundle.getInt(m100090a(0), -1) == 3) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        if (bundle.getBoolean(m100090a(1), false)) {
            return new C4202co(bundle.getBoolean(m100090a(2), false));
        }
        return new C4202co();
    }

    /* renamed from: d */
    public static /* synthetic */ C4202co m100088d(Bundle bundle) {
        return m100089b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4202co)) {
            return false;
        }
        C4202co c4202co = (C4202co) obj;
        if (this.f5370c != c4202co.f5370c || this.f5369b != c4202co.f5369b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f5369b), Boolean.valueOf(this.f5370c));
    }

    public C4202co(boolean z) {
        this.f5369b = true;
        this.f5370c = z;
    }
}
