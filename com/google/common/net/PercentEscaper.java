package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class PercentEscaper extends UnicodeEscaper {

    /* renamed from: d */
    private static final char[] f41422d = {'+'};

    /* renamed from: e */
    private static final char[] f41423e = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private final boolean f41424b;

    /* renamed from: c */
    private final boolean[] f41425c;

    public PercentEscaper(String str, boolean z) {
        Preconditions.checkNotNull(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (z && concat.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            this.f41424b = z;
            this.f41425c = m68073f(concat);
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    /* renamed from: f */
    private static boolean[] m68073f(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: b */
    public char[] mo68075b(int i) {
        boolean[] zArr = this.f41425c;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.f41424b) {
            return f41422d;
        }
        if (i <= 127) {
            char[] cArr = f41423e;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        } else if (i <= 2047) {
            char[] cArr2 = f41423e;
            char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i & 15]};
            int i2 = i >>> 4;
            int i3 = i2 >>> 2;
            return cArr3;
        } else if (i <= 65535) {
            char[] cArr4 = f41423e;
            char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i & 15]};
            int i4 = i >>> 4;
            int i5 = i4 >>> 2;
            int i6 = i5 >>> 4;
            return cArr5;
        } else if (i <= 1114111) {
            char[] cArr6 = f41423e;
            char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i & 15]};
            int i7 = i >>> 4;
            int i8 = i7 >>> 2;
            int i9 = i8 >>> 4;
            int i10 = i9 >>> 2;
            int i11 = i10 >>> 4;
            return cArr7;
        } else {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid unicode character value ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: e */
    protected int mo68074e(CharSequence charSequence, int i, int i2) {
        Preconditions.checkNotNull(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.f41425c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.f41425c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return m68549c(str, i);
            }
        }
        return str;
    }
}
