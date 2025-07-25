package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.q6 */
/* loaded from: classes2.dex */
public final class C5171q6 implements InterfaceC5044o2 {

    /* renamed from: d */
    public static final C5171q6 f9152d = new C5171q6(0, 0, 0);

    /* renamed from: f */
    public static final InterfaceC5044o2.InterfaceC5045a f9153f = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.f10
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            C5171q6 m96416a;
            m96416a = C5171q6.m96416a(bundle);
            return m96416a;
        }
    };

    /* renamed from: a */
    public final int f9154a;

    /* renamed from: b */
    public final int f9155b;

    /* renamed from: c */
    public final int f9156c;

    public C5171q6(int i, int i2, int i3) {
        this.f9154a = i;
        this.f9155b = i2;
        this.f9156c = i3;
    }

    /* renamed from: a */
    private static String m96417a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5171q6)) {
            return false;
        }
        C5171q6 c5171q6 = (C5171q6) obj;
        if (this.f9154a == c5171q6.f9154a && this.f9155b == c5171q6.f9155b && this.f9156c == c5171q6.f9156c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9154a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9155b) * 31) + this.f9156c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C5171q6 m96416a(Bundle bundle) {
        return new C5171q6(bundle.getInt(m96417a(0), 0), bundle.getInt(m96417a(1), 0), bundle.getInt(m96417a(2), 0));
    }
}
