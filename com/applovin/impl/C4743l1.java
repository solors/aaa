package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.l1 */
/* loaded from: classes2.dex */
public final class C4743l1 implements InterfaceC5044o2 {

    /* renamed from: g */
    public static final C4743l1 f7604g = new C4745b().m97876a();

    /* renamed from: h */
    public static final InterfaceC5044o2.InterfaceC5045a f7605h = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.uy
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C4743l1.m97877b(bundle);
        }
    };

    /* renamed from: a */
    public final int f7606a;

    /* renamed from: b */
    public final int f7607b;

    /* renamed from: c */
    public final int f7608c;

    /* renamed from: d */
    public final int f7609d;

    /* renamed from: f */
    private AudioAttributes f7610f;

    /* renamed from: com.applovin.impl.l1$b */
    /* loaded from: classes2.dex */
    public static final class C4745b {

        /* renamed from: a */
        private int f7611a = 0;

        /* renamed from: b */
        private int f7612b = 0;

        /* renamed from: c */
        private int f7613c = 1;

        /* renamed from: d */
        private int f7614d = 1;

        /* renamed from: a */
        public C4745b m97875a(int i) {
            this.f7614d = i;
            return this;
        }

        /* renamed from: b */
        public C4745b m97874b(int i) {
            this.f7611a = i;
            return this;
        }

        /* renamed from: c */
        public C4745b m97873c(int i) {
            this.f7612b = i;
            return this;
        }

        /* renamed from: d */
        public C4745b m97872d(int i) {
            this.f7613c = i;
            return this;
        }

        /* renamed from: a */
        public C4743l1 m97876a() {
            return new C4743l1(this.f7611a, this.f7612b, this.f7613c, this.f7614d);
        }
    }

    private C4743l1(int i, int i2, int i3, int i4) {
        this.f7606a = i;
        this.f7607b = i2;
        this.f7608c = i3;
        this.f7609d = i4;
    }

    /* renamed from: b */
    public static /* synthetic */ C4743l1 m97877b(Bundle bundle) {
        return m97878a(bundle);
    }

    /* renamed from: a */
    public AudioAttributes m97880a() {
        if (this.f7610f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f7606a).setFlags(this.f7607b).setUsage(this.f7608c);
            if (AbstractC5863xp.f12151a >= 29) {
                usage.setAllowedCapturePolicy(this.f7609d);
            }
            this.f7610f = usage.build();
        }
        return this.f7610f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4743l1.class != obj.getClass()) {
            return false;
        }
        C4743l1 c4743l1 = (C4743l1) obj;
        if (this.f7606a == c4743l1.f7606a && this.f7607b == c4743l1.f7607b && this.f7608c == c4743l1.f7608c && this.f7609d == c4743l1.f7609d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f7606a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f7607b) * 31) + this.f7608c) * 31) + this.f7609d;
    }

    /* renamed from: a */
    private static String m97879a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public static /* synthetic */ C4743l1 m97878a(Bundle bundle) {
        C4745b c4745b = new C4745b();
        if (bundle.containsKey(m97879a(0))) {
            c4745b.m97874b(bundle.getInt(m97879a(0)));
        }
        if (bundle.containsKey(m97879a(1))) {
            c4745b.m97873c(bundle.getInt(m97879a(1)));
        }
        if (bundle.containsKey(m97879a(2))) {
            c4745b.m97872d(bundle.getInt(m97879a(2)));
        }
        if (bundle.containsKey(m97879a(3))) {
            c4745b.m97875a(bundle.getInt(m97879a(3)));
        }
        return c4745b.m97876a();
    }
}
