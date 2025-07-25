package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {

    /* renamed from: b */
    private final char[][] f40890b;

    /* renamed from: c */
    private final int f40891c;

    /* renamed from: d */
    private final int f40892d;

    /* renamed from: e */
    private final int f40893e;

    /* renamed from: f */
    private final char f40894f;

    /* renamed from: g */
    private final char f40895g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: b */
    public final char[] mo68075b(int i) {
        char[] cArr;
        if (i < this.f40891c && (cArr = this.f40890b[i]) != null) {
            return cArr;
        }
        if (i >= this.f40892d && i <= this.f40893e) {
            return null;
        }
        return m68559f(i);
    }

    @Override // com.google.common.escape.UnicodeEscaper
    /* renamed from: e */
    protected final int mo68074e(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.f40891c && this.f40890b[charAt] != null) || charAt > this.f40895g || charAt < this.f40894f) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f40891c && this.f40890b[charAt] != null) || charAt > this.f40895g || charAt < this.f40894f) {
                return m68549c(str, i);
            }
        }
        return str;
    }

    /* renamed from: f */
    protected abstract char[] m68559f(int i);
}
