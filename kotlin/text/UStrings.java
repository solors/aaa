package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;
import p804nd.UByte;
import p804nd.UInt;
import p804nd.ULong;
import p804nd.UShort;

@Metadata
/* renamed from: kotlin.text.x */
/* loaded from: classes7.dex */
public final class UStrings {
    /* renamed from: a */
    public static final byte m16526a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte m16525b = m16525b(str);
        if (m16525b != null) {
            return m16525b.m14526g();
        }
        StringNumberConversions.m16641l(str);
        throw new ExceptionsH();
    }

    @Nullable
    /* renamed from: b */
    public static final UByte m16525b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16524c(str, 10);
    }

    @Nullable
    /* renamed from: c */
    public static final UByte m16524c(@NotNull String str, int i) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt m16521f = m16521f(str, i);
        if (m16521f == null) {
            return null;
        }
        int m14503g = m16521f.m14503g();
        compare = Integer.compare(m14503g ^ Integer.MIN_VALUE, UInt.m14507c(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UByte.m14531b(UByte.m14530c((byte) m14503g));
    }

    /* renamed from: d */
    public static final int m16523d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt m16522e = m16522e(str);
        if (m16522e != null) {
            return m16522e.m14503g();
        }
        StringNumberConversions.m16641l(str);
        throw new ExceptionsH();
    }

    @Nullable
    /* renamed from: e */
    public static final UInt m16522e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16521f(str, 10);
    }

    @Nullable
    /* renamed from: f */
    public static final UInt m16521f(@NotNull String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.m17071j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int m14507c = UInt.m14507c(i);
        int i4 = 119304647;
        while (i2 < length) {
            int m16780a = CharJVM.m16780a(str.charAt(i2), i);
            if (m16780a >= 0) {
                compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i4 == 119304647) {
                        i4 = C37696w.m16527a(-1, m14507c);
                        compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int m14507c2 = UInt.m14507c(i3 * m14507c);
                int m14507c3 = UInt.m14507c(UInt.m14507c(m16780a) + m14507c2);
                compare2 = Integer.compare(m14507c3 ^ Integer.MIN_VALUE, m14507c2 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i2++;
                i3 = m14507c3;
            } else {
                return null;
            }
        }
        return UInt.m14508b(i3);
    }

    /* renamed from: g */
    public static final long m16520g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong m16519h = m16519h(str);
        if (m16519h != null) {
            return m16519h.m14613g();
        }
        StringNumberConversions.m16641l(str);
        throw new ExceptionsH();
    }

    @Nullable
    /* renamed from: h */
    public static final ULong m16519h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16518i(str, 10);
    }

    @Nullable
    /* renamed from: i */
    public static final ULong m16518i(@NotNull String str, int i) {
        int m16780a;
        int compare;
        int compare2;
        int compare3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.m17071j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m14617c = ULong.m14617c(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (CharJVM.m16780a(str.charAt(i2), i) >= 0) {
                compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j2 == 512409557603043100L) {
                        j2 = C37695v.m16528a(-1L, m14617c);
                        compare3 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long m14617c2 = ULong.m14617c(j * m14617c);
                long m14617c3 = ULong.m14617c(ULong.m14617c(UInt.m14507c(m16780a) & 4294967295L) + m14617c2);
                compare2 = Long.compare(m14617c3 ^ Long.MIN_VALUE, m14617c2 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i2++;
                j = m14617c3;
            } else {
                return null;
            }
        }
        return ULong.m14618b(j);
    }

    /* renamed from: j */
    public static final short m16517j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort m16516k = m16516k(str);
        if (m16516k != null) {
            return m16516k.m14586g();
        }
        StringNumberConversions.m16641l(str);
        throw new ExceptionsH();
    }

    @Nullable
    /* renamed from: k */
    public static final UShort m16516k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16515l(str, 10);
    }

    @Nullable
    /* renamed from: l */
    public static final UShort m16515l(@NotNull String str, int i) {
        int compare;
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt m16521f = m16521f(str, i);
        if (m16521f == null) {
            return null;
        }
        int m14503g = m16521f.m14503g();
        compare = Integer.compare(m14503g ^ Integer.MIN_VALUE, UInt.m14507c(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UShort.m14591b(UShort.m14590c((short) m14503g));
    }
}
