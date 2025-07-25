package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.B */
/* loaded from: classes4.dex */
public abstract class AbstractC15216B extends AbstractC15312k {

    /* renamed from: b */
    public static final Logger f30145b = Logger.getLogger(AbstractC15216B.class.getName());

    /* renamed from: c */
    public static final boolean f30146c = AbstractC15356y1.f30348e;

    /* renamed from: a */
    public C15219C f30147a;

    /* renamed from: a */
    public static int m77027a(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: b */
    public static long m77022b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    public static int m77021c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    /* renamed from: d */
    public static int m77020d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo76695a(byte b);

    /* renamed from: a */
    public abstract void mo76694a(int i, int i2);

    /* renamed from: a */
    public abstract void mo76693a(int i, long j);

    /* renamed from: a */
    public abstract void mo76692a(int i, InterfaceC15226E0 interfaceC15226E0);

    /* renamed from: a */
    public abstract void mo76691a(int i, InterfaceC15226E0 interfaceC15226E0, InterfaceC15271U0 interfaceC15271U0);

    /* renamed from: a */
    public abstract void mo76690a(int i, AbstractC15336s abstractC15336s);

    /* renamed from: a */
    public abstract void mo76689a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo76688a(String str, int i);

    /* renamed from: b */
    public abstract void mo76686b(int i, int i2);

    /* renamed from: b */
    public abstract void mo76685b(int i, long j);

    /* renamed from: b */
    public abstract void mo76684b(int i, AbstractC15336s abstractC15336s);

    /* renamed from: c */
    public abstract void mo76681c(int i, int i2);

    /* renamed from: c */
    public abstract void mo76680c(long j);

    /* renamed from: d */
    public abstract void mo76679d(int i, int i2);

    /* renamed from: d */
    public abstract void mo76678d(long j);

    /* renamed from: e */
    public abstract void mo76677e(int i);

    /* renamed from: f */
    public abstract void mo76676f(int i);

    /* renamed from: g */
    public abstract void mo76675g(int i);

    /* renamed from: a */
    public static int m77028a(int i) {
        if (i >= 0) {
            return m77021c(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m77023b(int i) {
        return m77021c(i << 3);
    }

    /* renamed from: a */
    public static int m77025a(String str) {
        int length;
        try {
            length = AbstractC15227E1.m77005a(str);
        } catch (C15221C1 unused) {
            length = str.getBytes(AbstractC15319m0.f30280a).length;
        }
        return m77021c(length) + length;
    }

    /* renamed from: a */
    public static int m77026a(AbstractC15336s abstractC15336s) {
        int size = abstractC15336s.size();
        return m77021c(size) + size;
    }

    /* renamed from: a */
    public final void m77024a(String str, C15221C1 c15221c1) {
        f30145b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c15221c1);
        byte[] bytes = str.getBytes(AbstractC15319m0.f30280a);
        try {
            mo76675g(bytes.length);
            mo76687a(bytes, 0, bytes.length);
        } catch (C15357z e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C15357z(e2);
        }
    }
}
