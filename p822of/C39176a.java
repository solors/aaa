package p822of;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import okio.C39206f1;
import okio.Options;
import okio.Segment;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata
/* renamed from: of.a */
/* loaded from: classes10.dex */
public final class C39176a {
    @NotNull

    /* renamed from: a */
    private static final byte[] f102882a = C39206f1.m13575a("0123456789abcdef");

    @NotNull
    /* renamed from: a */
    public static final byte[] m13721a() {
        return f102882a;
    }

    /* renamed from: b */
    public static final boolean m13720b(@NotNull Segment segment, int i, @NotNull byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i4 = segment.f103023c;
        byte[] bArr = segment.f103021a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f103026f;
                Intrinsics.m17074g(segment);
                byte[] bArr2 = segment.f103021a;
                bArr = bArr2;
                i = segment.f103022b;
                i4 = segment.f103023c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @NotNull
    /* renamed from: c */
    public static final String m13719c(@NotNull C39200e c39200e, long j) {
        Intrinsics.checkNotNullParameter(c39200e, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c39200e.m13590m(j2) == 13) {
                String readUtf8 = c39200e.readUtf8(j2);
                c39200e.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = c39200e.readUtf8(j);
        c39200e.skip(1L);
        return readUtf82;
    }

    /* renamed from: d */
    public static final int m13718d(@NotNull C39200e c39200e, @NotNull Options options, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        Segment segment;
        Intrinsics.checkNotNullParameter(c39200e, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Segment segment2 = c39200e.f102937b;
        if (segment2 == null) {
            if (z) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = segment2.f103021a;
        int i5 = segment2.f103022b;
        int i6 = segment2.f103023c;
        int[] m13480f = options.m13480f();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = m13480f[i8];
            int i11 = i9 + 1;
            int i12 = m13480f[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * (-1));
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != m13480f[i11]) {
                        return i7;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        Intrinsics.m17074g(segment3);
                        Segment segment4 = segment3.f103026f;
                        Intrinsics.m17074g(segment4);
                        i4 = segment4.f103022b;
                        byte[] bArr2 = segment4.f103021a;
                        i3 = segment4.f103023c;
                        if (segment4 == segment2) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        } else {
                            segment = segment4;
                            bArr = bArr2;
                        }
                    } else {
                        Segment segment5 = segment3;
                        i3 = i6;
                        i4 = i14;
                        segment = segment5;
                    }
                    if (z2) {
                        i2 = m13480f[i15];
                        i = i4;
                        i6 = i3;
                        segment3 = segment;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    segment3 = segment;
                }
            } else {
                i = i5 + 1;
                int i16 = bArr[i5] & 255;
                int i17 = i11 + i10;
                while (i11 != i17) {
                    if (i16 == m13480f[i11]) {
                        i2 = m13480f[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.f103026f;
                            Intrinsics.m17074g(segment3);
                            i = segment3.f103022b;
                            bArr = segment3.f103021a;
                            i6 = segment3.f103023c;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    /* renamed from: e */
    public static /* synthetic */ int m13717e(C39200e c39200e, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13718d(c39200e, options, z);
    }
}
