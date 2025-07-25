package com.fyber.inneractive.sdk.protobuf;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s */
/* loaded from: classes4.dex */
public abstract class AbstractC15336s implements Iterable, Serializable {

    /* renamed from: b */
    public static final C15330q f30296b = new C15330q(AbstractC15319m0.f30281b);

    /* renamed from: c */
    public static final InterfaceC15324o f30297c;

    /* renamed from: a */
    public int f30298a = 0;

    static {
        InterfaceC15324o c15318m;
        if (AbstractC15291d.m76886a()) {
            c15318m = new C15333r();
        } else {
            c15318m = new C15318m();
        }
        f30297c = c15318m;
    }

    /* renamed from: a */
    public static C15330q m76830a(String str) {
        return new C15330q(str.getBytes(AbstractC15319m0.f30280a));
    }

    /* renamed from: a */
    public abstract int mo76834a(int i, int i2);

    /* renamed from: a */
    public abstract void mo76832a(int i, byte[] bArr);

    /* renamed from: a */
    public abstract void mo76831a(AbstractC15312k abstractC15312k);

    /* renamed from: c */
    public abstract byte mo76828c(int i);

    /* renamed from: c */
    public abstract boolean mo76829c();

    /* renamed from: d */
    public abstract byte mo76826d(int i);

    /* renamed from: d */
    public abstract AbstractC15348w mo76827d();

    /* renamed from: e */
    public abstract AbstractC15336s mo76824e(int i);

    /* renamed from: e */
    public abstract String mo76825e();

    /* renamed from: f */
    public final String m76823f() {
        Charset charset = AbstractC15319m0.f30280a;
        if (size() == 0) {
            return "";
        }
        return mo76825e();
    }

    public final int hashCode() {
        int i = this.f30298a;
        if (i == 0) {
            int size = size();
            i = mo76834a(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f30298a = i;
        }
        return i;
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = AbstractC15308i1.m76848a(this);
        } else {
            str = AbstractC15308i1.m76848a(mo76824e(47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + str + "\">";
    }

    /* renamed from: a */
    public static int m76833a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }
}
