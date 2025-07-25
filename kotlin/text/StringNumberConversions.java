package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.p */
/* loaded from: classes7.dex */
public class StringNumberConversions extends C37689o {
    @NotNull
    /* renamed from: l */
    public static final Void m16641l(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @Nullable
    /* renamed from: m */
    public static Integer m16640m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16639n(str, 10);
    }

    @Nullable
    /* renamed from: n */
    public static final Integer m16639n(@NotNull String str, int i) {
        boolean z;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.m17071j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int m16780a = CharJVM.m16780a(str.charAt(i2), i);
            if (m16780a < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + m16780a) {
                return null;
            }
            i4 = i3 - m16780a;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    @Nullable
    /* renamed from: o */
    public static Long m16638o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m16637p(str, 10);
    }

    @Nullable
    /* renamed from: p */
    public static final Long m16637p(@NotNull String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharJVM.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.m17071j(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int m16780a = CharJVM.m16780a(str.charAt(i2), i);
            if (m16780a < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = m16780a;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        if (z) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(-j3);
    }
}
