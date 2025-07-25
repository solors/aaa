package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Escapers {

    /* renamed from: a */
    private static final Escaper f40901a = new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.escape.CharEscaper
        /* renamed from: a */
        public char[] mo68555a(char c) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    };

    /* renamed from: com.google.common.escape.Escapers$2 */
    /* loaded from: classes4.dex */
    class C169332 extends UnicodeEscaper {

        /* renamed from: b */
        final /* synthetic */ CharEscaper f40902b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.escape.UnicodeEscaper
        /* renamed from: b */
        public char[] mo68075b(int i) {
            int i2;
            int i3;
            if (i < 65536) {
                return this.f40902b.mo68555a((char) i);
            }
            char[] cArr = new char[2];
            Character.toChars(i, cArr, 0);
            char[] mo68555a = this.f40902b.mo68555a(cArr[0]);
            char[] mo68555a2 = this.f40902b.mo68555a(cArr[1]);
            if (mo68555a == null && mo68555a2 == null) {
                return null;
            }
            if (mo68555a != null) {
                i2 = mo68555a.length;
            } else {
                i2 = 1;
            }
            if (mo68555a2 != null) {
                i3 = mo68555a2.length;
            } else {
                i3 = 1;
            }
            char[] cArr2 = new char[i3 + i2];
            if (mo68555a != null) {
                for (int i4 = 0; i4 < mo68555a.length; i4++) {
                    cArr2[i4] = mo68555a[i4];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (mo68555a2 != null) {
                for (int i5 = 0; i5 < mo68555a2.length; i5++) {
                    cArr2[i2 + i5] = mo68555a2[i5];
                }
            } else {
                cArr2[i2] = cArr[1];
            }
            return cArr2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private final Map<Character, String> f40903a;

        /* renamed from: b */
        private char f40904b;

        /* renamed from: c */
        private char f40905c;

        /* renamed from: d */
        private String f40906d;

        @CanIgnoreReturnValue
        public Builder addEscape(char c, String str) {
            Preconditions.checkNotNull(str);
            this.f40903a.put(Character.valueOf(c), str);
            return this;
        }

        public Escaper build() {
            return new ArrayBasedCharEscaper(this.f40903a, this.f40904b, this.f40905c) { // from class: com.google.common.escape.Escapers.Builder.1

                /* renamed from: f */
                private final char[] f40907f;

                {
                    char[] cArr;
                    if (Builder.this.f40906d != null) {
                        cArr = Builder.this.f40906d.toCharArray();
                    } else {
                        cArr = null;
                    }
                    this.f40907f = cArr;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                /* renamed from: d */
                protected char[] mo68553d(char c) {
                    return this.f40907f;
                }
            };
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c, char c2) {
            this.f40904b = c;
            this.f40905c = c2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.f40906d = str;
            return this;
        }

        private Builder() {
            this.f40903a = new HashMap();
            this.f40904b = (char) 0;
            this.f40905c = (char) 65535;
            this.f40906d = null;
        }
    }

    private Escapers() {
    }

    /* renamed from: a */
    private static String m68556a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static String computeReplacement(CharEscaper charEscaper, char c) {
        return m68556a(charEscaper.mo68555a(c));
    }

    public static Escaper nullEscaper() {
        return f40901a;
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
        return m68556a(unicodeEscaper.mo68075b(i));
    }
}
