package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.cl */
/* loaded from: classes2.dex */
public final class C4197cl extends AbstractC4718ki {

    /* renamed from: d */
    public static final InterfaceC5044o2.InterfaceC5045a f5358d = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.ku
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C4197cl.m100100d(bundle);
        }
    };

    /* renamed from: b */
    private final int f5359b;

    /* renamed from: c */
    private final float f5360c;

    public C4197cl(int i) {
        AbstractC4100b1.m100579a(i > 0, "maxStars must be a positive integer");
        this.f5359b = i;
        this.f5360c = -1.0f;
    }

    /* renamed from: a */
    private static String m100102a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public static C4197cl m100101b(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m100102a(0), -1) == 2) {
            z = true;
        }
        AbstractC4100b1.m100580a(z);
        int i = bundle.getInt(m100102a(1), 5);
        float f = bundle.getFloat(m100102a(2), -1.0f);
        if (f == -1.0f) {
            return new C4197cl(i);
        }
        return new C4197cl(i, f);
    }

    /* renamed from: d */
    public static /* synthetic */ C4197cl m100100d(Bundle bundle) {
        return m100101b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4197cl)) {
            return false;
        }
        C4197cl c4197cl = (C4197cl) obj;
        if (this.f5359b != c4197cl.f5359b || this.f5360c != c4197cl.f5360c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f5359b), Float.valueOf(this.f5360c));
    }

    public C4197cl(int i, float f) {
        boolean z = true;
        AbstractC4100b1.m100579a(i > 0, "maxStars must be a positive integer");
        AbstractC4100b1.m100579a((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.f5359b = i;
        this.f5360c = f;
    }
}
