package okio;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p822of.SegmentedByteString;

/* compiled from: SegmentedByteString.kt */
@Metadata
/* renamed from: okio.y0 */
/* loaded from: classes10.dex */
public final class C39231y0 extends C39208h {
    @NotNull

    /* renamed from: h */
    private final transient byte[][] f103033h;
    @NotNull

    /* renamed from: i */
    private final transient int[] f103034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39231y0(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(C39208h.f102953g.m13561h());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f103033h = segments;
        this.f103034i = directory;
    }

    /* renamed from: M */
    private final C39208h m13399M() {
        return new C39208h(m13400L());
    }

    private final Object writeReplace() {
        C39208h m13399M = m13399M();
        Intrinsics.m17073h(m13399M, "null cannot be cast to non-null type java.lang.Object");
        return m13399M;
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: E */
    public C39208h mo13405E(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Object[] m17386s;
        int m13631d = C39189b.m13631d(this, i2);
        int i3 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m13631d <= m13569C()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = m13631d - i;
                if (i4 >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (i == 0 && m13631d == m13569C()) {
                        return this;
                    }
                    if (i == m13631d) {
                        return C39208h.f102953g;
                    }
                    int m13687b = SegmentedByteString.m13687b(this, i);
                    int m13687b2 = SegmentedByteString.m13687b(this, m13631d - 1);
                    m17386s = _ArraysJvm.m17386s(m13401K(), m13687b, m13687b2 + 1);
                    byte[][] bArr = (byte[][]) m17386s;
                    int[] iArr = new int[bArr.length * 2];
                    if (m13687b <= m13687b2) {
                        int i5 = 0;
                        int i6 = m13687b;
                        while (true) {
                            iArr[i5] = Math.min(m13402J()[i6] - i, i4);
                            int i7 = i5 + 1;
                            iArr[i5 + bArr.length] = m13402J()[m13401K().length + i6];
                            if (i6 == m13687b2) {
                                break;
                            }
                            i6++;
                            i5 = i7;
                        }
                    }
                    if (m13687b != 0) {
                        i3 = m13402J()[m13687b - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i3);
                    return new C39231y0(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + m13631d + " < beginIndex=" + i).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + m13631d + " > length(" + m13569C() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: G */
    public C39208h mo13404G() {
        return m13399M().mo13404G();
    }

    @Override // okio.C39208h
    /* renamed from: I */
    public void mo13403I(@NotNull C39200e buffer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i4 = i + i2;
        int m13687b = SegmentedByteString.m13687b(this, i);
        while (i < i4) {
            if (m13687b == 0) {
                i3 = 0;
            } else {
                i3 = m13402J()[m13687b - 1];
            }
            int i5 = m13402J()[m13401K().length + m13687b];
            int min = Math.min(i4, (m13402J()[m13687b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            Segment segment = new Segment(m13401K()[m13687b], i6, i6 + min, true, false);
            Segment segment2 = buffer.f102937b;
            if (segment2 == null) {
                segment.f103027g = segment;
                segment.f103026f = segment;
                buffer.f102937b = segment;
            } else {
                Intrinsics.m17074g(segment2);
                Segment segment3 = segment2.f103027g;
                Intrinsics.m17074g(segment3);
                segment3.m13414c(segment);
            }
            i += min;
            m13687b++;
        }
        buffer.m13586t(buffer.size() + i2);
    }

    @NotNull
    /* renamed from: J */
    public final int[] m13402J() {
        return this.f103034i;
    }

    @NotNull
    /* renamed from: K */
    public final byte[][] m13401K() {
        return this.f103033h;
    }

    @NotNull
    /* renamed from: L */
    public byte[] m13400L() {
        byte[] bArr = new byte[m13569C()];
        int length = m13401K().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m13402J()[length + i];
            int i5 = m13402J()[i];
            int i6 = i5 - i2;
            _ArraysJvm.m17398g(m13401K()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: b */
    public String mo13398b() {
        return m13399M().mo13398b();
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: d */
    public C39208h mo13397d(@NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = m13401K().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m13402J()[length + i];
            int i4 = m13402J()[i];
            messageDigest.update(m13401K()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new C39208h(digestBytes);
    }

    @Override // okio.C39208h
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39208h) {
            C39208h c39208h = (C39208h) obj;
            if (c39208h.m13569C() == m13569C() && mo13390w(0, c39208h, 0, m13569C())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.C39208h
    public int hashCode() {
        int m13560i = m13560i();
        if (m13560i == 0) {
            int length = m13401K().length;
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < length) {
                int i4 = m13402J()[length + i];
                int i5 = m13402J()[i];
                byte[] bArr = m13401K()[i];
                int i6 = (i5 - i3) + i4;
                while (i4 < i6) {
                    i2 = (i2 * 31) + bArr[i4];
                    i4++;
                }
                i++;
                i3 = i5;
            }
            m13552y(i2);
            return i2;
        }
        return m13560i;
    }

    @Override // okio.C39208h
    /* renamed from: j */
    public int mo13396j() {
        return m13402J()[m13401K().length - 1];
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: l */
    public String mo13395l() {
        return m13399M().mo13395l();
    }

    @Override // okio.C39208h
    /* renamed from: n */
    public int mo13394n(@NotNull byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m13399M().mo13394n(other, i);
    }

    @Override // okio.C39208h
    @NotNull
    /* renamed from: p */
    public byte[] mo13393p() {
        return m13400L();
    }

    @Override // okio.C39208h
    /* renamed from: q */
    public byte mo13392q(int i) {
        int i2;
        C39189b.m13633b(m13402J()[m13401K().length - 1], i, 1L);
        int m13687b = SegmentedByteString.m13687b(this, i);
        if (m13687b == 0) {
            i2 = 0;
        } else {
            i2 = m13402J()[m13687b - 1];
        }
        return m13401K()[m13687b][(i - i2) + m13402J()[m13401K().length + m13687b]];
    }

    @Override // okio.C39208h
    /* renamed from: s */
    public int mo13391s(@NotNull byte[] other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m13399M().mo13391s(other, i);
    }

    @Override // okio.C39208h
    @NotNull
    public String toString() {
        return m13399M().toString();
    }

    @Override // okio.C39208h
    /* renamed from: w */
    public boolean mo13390w(int i, @NotNull C39208h other, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > m13569C() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m13687b = SegmentedByteString.m13687b(this, i);
        while (i < i5) {
            if (m13687b == 0) {
                i4 = 0;
            } else {
                i4 = m13402J()[m13687b - 1];
            }
            int i6 = m13402J()[m13401K().length + m13687b];
            int min = Math.min(i5, (m13402J()[m13687b] - i4) + i4) - i;
            if (!other.mo13389x(i2, m13401K()[m13687b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            m13687b++;
        }
        return true;
    }

    @Override // okio.C39208h
    /* renamed from: x */
    public boolean mo13389x(int i, @NotNull byte[] other, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > m13569C() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m13687b = SegmentedByteString.m13687b(this, i);
        while (i < i5) {
            if (m13687b == 0) {
                i4 = 0;
            } else {
                i4 = m13402J()[m13687b - 1];
            }
            int i6 = m13402J()[m13401K().length + m13687b];
            int min = Math.min(i5, (m13402J()[m13687b] - i4) + i4) - i;
            if (!C39189b.m13634a(m13401K()[m13687b], i6 + (i - i4), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m13687b++;
        }
        return true;
    }
}
