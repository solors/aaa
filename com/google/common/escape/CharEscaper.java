package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CharEscaper extends Escaper {
    /* renamed from: c */
    private static char[] m68557c(char[] cArr, int i, int i2) {
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
    /* renamed from: a */
    public abstract char[] mo68555a(char c);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m68558b(String str, int i) {
        int length = str.length();
        char[] m68552a = Platform.m68552a();
        int length2 = m68552a.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] mo68555a = mo68555a(str.charAt(i));
            if (mo68555a != null) {
                int length3 = mo68555a.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = ((length - i) * 2) + i6;
                    m68552a = m68557c(m68552a, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, m68552a, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(mo68555a, 0, m68552a, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                m68552a = m68557c(m68552a, i3, i8);
            }
            str.getChars(i2, length, m68552a, i3);
            i3 = i8;
        }
        return new String(m68552a, 0, i3);
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (mo68555a(str.charAt(i)) != null) {
                return m68558b(str, i);
            }
        }
        return str;
    }
}
