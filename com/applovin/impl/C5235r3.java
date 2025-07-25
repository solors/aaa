package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.r3 */
/* loaded from: classes2.dex */
public final class C5235r3 implements InterfaceC5044o2 {

    /* renamed from: g */
    public static final InterfaceC5044o2.InterfaceC5045a f9299g = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.v30
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            C5235r3 m96033a;
            m96033a = C5235r3.m96033a(bundle);
            return m96033a;
        }
    };

    /* renamed from: a */
    public final int f9300a;

    /* renamed from: b */
    public final int f9301b;

    /* renamed from: c */
    public final int f9302c;

    /* renamed from: d */
    public final byte[] f9303d;

    /* renamed from: f */
    private int f9304f;

    public C5235r3(int i, int i2, int i3, byte[] bArr) {
        this.f9300a = i;
        this.f9301b = i2;
        this.f9302c = i3;
        this.f9303d = bArr;
    }

    /* renamed from: a */
    public static int m96034a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    /* renamed from: c */
    private static String m96030c(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5235r3.class != obj.getClass()) {
            return false;
        }
        C5235r3 c5235r3 = (C5235r3) obj;
        if (this.f9300a == c5235r3.f9300a && this.f9301b == c5235r3.f9301b && this.f9302c == c5235r3.f9302c && Arrays.equals(this.f9303d, c5235r3.f9303d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9304f == 0) {
            this.f9304f = ((((((this.f9300a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9301b) * 31) + this.f9302c) * 31) + Arrays.hashCode(this.f9303d);
        }
        return this.f9304f;
    }

    public String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f9300a);
        sb2.append(", ");
        sb2.append(this.f9301b);
        sb2.append(", ");
        sb2.append(this.f9302c);
        sb2.append(", ");
        if (this.f9303d != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C5235r3 m96033a(Bundle bundle) {
        return new C5235r3(bundle.getInt(m96030c(0), -1), bundle.getInt(m96030c(1), -1), bundle.getInt(m96030c(2), -1), bundle.getByteArray(m96030c(3)));
    }

    /* renamed from: b */
    public static int m96032b(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }
}
