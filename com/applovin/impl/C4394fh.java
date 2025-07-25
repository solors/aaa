package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.fh */
/* loaded from: classes2.dex */
public final class C4394fh extends AbstractC4718ki {

    /* renamed from: c */
    public static final InterfaceC5044o2.InterfaceC5045a f6122c = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.uw
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C4394fh.m99170d(bundle);
        }
    };

    /* renamed from: b */
    private final float f6123b;

    public C4394fh() {
        this.f6123b = -1.0f;
    }

    /* renamed from: a */
    private static String m99172a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public static C4394fh m99171b(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m99172a(0), -1) == 1) {
            z = true;
        }
        AbstractC4100b1.m100580a(z);
        float f = bundle.getFloat(m99172a(1), -1.0f);
        if (f == -1.0f) {
            return new C4394fh();
        }
        return new C4394fh(f);
    }

    /* renamed from: d */
    public static /* synthetic */ C4394fh m99170d(Bundle bundle) {
        return m99171b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4394fh) || this.f6123b != ((C4394fh) obj).f6123b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f6123b));
    }

    public C4394fh(float f) {
        AbstractC4100b1.m100579a(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f6123b = f;
    }
}
