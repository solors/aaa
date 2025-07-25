package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class UnicodeEscaper extends Escaper {
    /* renamed from: a */
    protected static int m68550a(CharSequence charSequence, int i, int i2) {
        Preconditions.checkNotNull(charSequence);
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt <= 57343) {
                if (charAt <= 56319) {
                    if (i3 == i2) {
                        return -charAt;
                    }
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isLowSurrogate(charAt2)) {
                        return Character.toCodePoint(charAt, charAt2);
                    }
                    String valueOf = String.valueOf(charSequence);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 89);
                    sb2.append("Expected low surrogate but got char '");
                    sb2.append(charAt2);
                    sb2.append("' with value ");
                    sb2.append((int) charAt2);
                    sb2.append(" at index ");
                    sb2.append(i3);
                    sb2.append(" in '");
                    sb2.append(valueOf);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 88);
                sb3.append("Unexpected low surrogate character '");
                sb3.append(charAt);
                sb3.append("' with value ");
                sb3.append((int) charAt);
                sb3.append(" at index ");
                sb3.append(i3 - 1);
                sb3.append(" in '");
                sb3.append(valueOf2);
                sb3.append("'");
                throw new IllegalArgumentException(sb3.toString());
            }
            return charAt;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    /* renamed from: d */
    private static char[] m68548d(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract char[] mo68075b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m68549c(String str, int i) {
        int i2;
        int length = str.length();
        char[] m68552a = Platform.m68552a();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int m68550a = m68550a(str, i, length);
            if (m68550a >= 0) {
                char[] mo68075b = mo68075b(m68550a);
                if (Character.isSupplementaryCodePoint(m68550a)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i;
                if (mo68075b != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = mo68075b.length + i7;
                    if (m68552a.length < length2) {
                        m68552a = m68548d(m68552a, i4, length2 + (length - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, m68552a, i4);
                        i4 = i7;
                    }
                    if (mo68075b.length > 0) {
                        System.arraycopy(mo68075b, 0, m68552a, i4, mo68075b.length);
                        i4 += mo68075b.length;
                    }
                    i3 = i5;
                }
                i = mo68074e(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (m68552a.length < i9) {
                m68552a = m68548d(m68552a, i4, i9);
            }
            str.getChars(i3, length, m68552a, i4);
            i4 = i9;
        }
        return new String(m68552a, 0, i4);
    }

    /* renamed from: e */
    protected int mo68074e(CharSequence charSequence, int i, int i2) {
        int i3;
        while (i < i2) {
            int m68550a = m68550a(charSequence, i, i2);
            if (m68550a < 0 || mo68075b(m68550a) != null) {
                break;
            }
            if (Character.isSupplementaryCodePoint(m68550a)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            i += i3;
        }
        return i;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int mo68074e = mo68074e(str, 0, length);
        if (mo68074e != length) {
            return m68549c(str, mo68074e);
        }
        return str;
    }
}
