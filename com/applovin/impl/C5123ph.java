package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.ph */
/* loaded from: classes2.dex */
public final class C5123ph implements InterfaceC5044o2 {

    /* renamed from: d */
    public static final C5123ph f9017d = new C5123ph(1.0f);

    /* renamed from: f */
    public static final InterfaceC5044o2.InterfaceC5045a f9018f = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.s00
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C5123ph.m96535b(bundle);
        }
    };

    /* renamed from: a */
    public final float f9019a;

    /* renamed from: b */
    public final float f9020b;

    /* renamed from: c */
    private final int f9021c;

    public C5123ph(float f) {
        this(f, 1.0f);
    }

    /* renamed from: b */
    public static /* synthetic */ C5123ph m96535b(Bundle bundle) {
        return m96536a(bundle);
    }

    /* renamed from: a */
    public long m96537a(long j) {
        return j * this.f9021c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5123ph.class != obj.getClass()) {
            return false;
        }
        C5123ph c5123ph = (C5123ph) obj;
        if (this.f9019a == c5123ph.f9019a && this.f9020b == c5123ph.f9020b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f9019a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f9020b);
    }

    public String toString() {
        return AbstractC5863xp.m93012a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9019a), Float.valueOf(this.f9020b));
    }

    public C5123ph(float f, float f2) {
        AbstractC4100b1.m100580a(f > 0.0f);
        AbstractC4100b1.m100580a(f2 > 0.0f);
        this.f9019a = f;
        this.f9020b = f2;
        this.f9021c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    private static String m96538a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public static /* synthetic */ C5123ph m96536a(Bundle bundle) {
        return new C5123ph(bundle.getFloat(m96538a(0), 1.0f), bundle.getFloat(m96538a(1), 1.0f));
    }

    /* renamed from: a */
    public C5123ph m96539a(float f) {
        return new C5123ph(f, this.f9020b);
    }
}
