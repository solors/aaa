package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.xq */
/* loaded from: classes2.dex */
public final class C5864xq implements InterfaceC5044o2 {

    /* renamed from: f */
    public static final C5864xq f12166f = new C5864xq(0, 0);

    /* renamed from: g */
    public static final InterfaceC5044o2.InterfaceC5045a f12167g = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.u80
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            C5864xq m92955a;
            m92955a = C5864xq.m92955a(bundle);
            return m92955a;
        }
    };

    /* renamed from: a */
    public final int f12168a;

    /* renamed from: b */
    public final int f12169b;

    /* renamed from: c */
    public final int f12170c;

    /* renamed from: d */
    public final float f12171d;

    public C5864xq(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* renamed from: a */
    private static String m92956a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5864xq)) {
            return false;
        }
        C5864xq c5864xq = (C5864xq) obj;
        if (this.f12168a == c5864xq.f12168a && this.f12169b == c5864xq.f12169b && this.f12170c == c5864xq.f12170c && this.f12171d == c5864xq.f12171d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f12168a + 217) * 31) + this.f12169b) * 31) + this.f12170c) * 31) + Float.floatToRawIntBits(this.f12171d);
    }

    public C5864xq(int i, int i2, int i3, float f) {
        this.f12168a = i;
        this.f12169b = i2;
        this.f12170c = i3;
        this.f12171d = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C5864xq m92955a(Bundle bundle) {
        return new C5864xq(bundle.getInt(m92956a(0), 0), bundle.getInt(m92956a(1), 0), bundle.getInt(m92956a(2), 0), bundle.getFloat(m92956a(3), 1.0f));
    }
}
