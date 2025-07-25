package p1029wc;

import kotlin.Metadata;
import p804nd.UShort;

@Metadata
/* renamed from: wc.c */
/* loaded from: classes9.dex */
public final class EncodeResult {
    /* renamed from: a */
    public static final short m2138a(int i) {
        return m2133f(i);
    }

    /* renamed from: b */
    public static final short m2137b(int i) {
        return m2134e(i);
    }

    /* renamed from: d */
    public static int m2135d(short s, short s2) {
        return m2136c(((s & 65535) << 16) | (s2 & 65535));
    }

    /* renamed from: e */
    public static final short m2134e(int i) {
        return UShort.m14590c((short) (i & 65535));
    }

    /* renamed from: f */
    public static final short m2133f(int i) {
        return UShort.m14590c((short) (i >>> 16));
    }

    /* renamed from: c */
    public static int m2136c(int i) {
        return i;
    }
}
