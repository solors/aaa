package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class CharEscaperBuilder {

    /* renamed from: b */
    private int f40897b = -1;

    /* renamed from: a */
    private final Map<Character, String> f40896a = new HashMap();

    /* loaded from: classes4.dex */
    private static class CharArrayDecorator extends CharEscaper {

        /* renamed from: b */
        private final char[][] f40898b;

        /* renamed from: c */
        private final int f40899c;

        CharArrayDecorator(char[][] cArr) {
            this.f40898b = cArr;
            this.f40899c = cArr.length;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.escape.CharEscaper
        /* renamed from: a */
        public char[] mo68555a(char c) {
            if (c < this.f40899c) {
                return this.f40898b[c];
            }
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.f40898b;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return m68558b(str, i);
                }
            }
            return str;
        }
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscape(char c, String str) {
        this.f40896a.put(Character.valueOf(c), (String) Preconditions.checkNotNull(str));
        if (c > this.f40897b) {
            this.f40897b = c;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public CharEscaperBuilder addEscapes(char[] cArr, String str) {
        Preconditions.checkNotNull(str);
        for (char c : cArr) {
            addEscape(c, str);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.f40897b + 1];
        for (Map.Entry<Character, String> entry : this.f40896a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public Escaper toEscaper() {
        return new CharArrayDecorator(toArray());
    }
}
