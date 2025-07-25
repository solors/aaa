package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: se.i1 */
/* loaded from: classes8.dex */
public final class StringOps {
    @NotNull

    /* renamed from: a */
    private static final String[] f111844a;
    @NotNull

    /* renamed from: b */
    private static final byte[] f111845b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m6765e(i >> 12) + m6765e(i >> 8) + m6765e(i >> 4) + m6765e(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f111844a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f111845b = bArr;
    }

    @NotNull
    /* renamed from: a */
    public static final byte[] m6769a() {
        return f111845b;
    }

    @NotNull
    /* renamed from: b */
    public static final String[] m6768b() {
        return f111844a;
    }

    /* renamed from: c */
    public static final void m6767c(@NotNull StringBuilder sb2, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            String[] strArr = f111844a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i, i2);
                sb2.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb2.append((CharSequence) value, i, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    @Nullable
    /* renamed from: d */
    public static final Boolean m6766d(@NotNull String str) {
        boolean m16615y;
        boolean m16615y2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        m16615y = StringsJVM.m16615y(str, "true", true);
        if (!m16615y) {
            m16615y2 = StringsJVM.m16615y(str, "false", true);
            if (m16615y2) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: e */
    private static final char m6765e(int i) {
        int i2;
        int i3 = i & 15;
        if (i3 < 10) {
            i2 = i3 + 48;
        } else {
            i2 = (i3 - 10) + 97;
        }
        return (char) i2;
    }
}
