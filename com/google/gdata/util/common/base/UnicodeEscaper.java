package com.google.gdata.util.common.base;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class UnicodeEscaper implements Escaper {
    private static final int DEST_PAD = 32;
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() { // from class: com.google.gdata.util.common.base.UnicodeEscaper.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    protected static final int codePointAt(CharSequence charSequence, int i, int i2) {
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
                    throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected low surrogate character '");
                sb2.append(charAt);
                sb2.append("' with value ");
                sb2.append((int) charAt);
                sb2.append(" at index ");
                sb2.append(i3 - 1);
                throw new IllegalArgumentException(sb2.toString());
            }
            return charAt;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static final char[] growBuffer(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    @Override // com.google.gdata.util.common.base.Escaper
    public String escape(String str) {
        int length = str.length();
        int nextEscapeIndex = nextEscapeIndex(str, 0, length);
        return nextEscapeIndex == length ? str : escapeSlow(str, nextEscapeIndex);
    }

    protected abstract char[] escape(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String escapeSlow(String str, int i) {
        int i2;
        int length = str.length();
        char[] cArr = DEST_TL.get();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int codePointAt = codePointAt(str, i, length);
            if (codePointAt >= 0) {
                char[] escape = escape(codePointAt);
                if (escape != null) {
                    int i5 = i - i3;
                    int i6 = i4 + i5;
                    int length2 = escape.length + i6;
                    if (cArr.length < length2) {
                        cArr = growBuffer(cArr, i4, length2 + (length - i) + 32);
                    }
                    if (i5 > 0) {
                        str.getChars(i3, i, cArr, i4);
                        i4 = i6;
                    }
                    if (escape.length > 0) {
                        System.arraycopy(escape, 0, cArr, i4, escape.length);
                        i4 += escape.length;
                    }
                }
                if (Character.isSupplementaryCodePoint(codePointAt)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                i3 = i2 + i;
                i = nextEscapeIndex(str, i3, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i7 = length - i3;
        if (i7 > 0) {
            int i8 = i7 + i4;
            if (cArr.length < i8) {
                cArr = growBuffer(cArr, i4, i8);
            }
            str.getChars(i3, length, cArr, i4);
            i4 = i8;
        }
        return new String(cArr, 0, i4);
    }

    protected int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        int i3;
        while (i < i2) {
            int codePointAt = codePointAt(charSequence, i, i2);
            if (codePointAt < 0 || escape(codePointAt) != null) {
                break;
            }
            if (Character.isSupplementaryCodePoint(codePointAt)) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            i += i3;
        }
        return i;
    }

    @Override // com.google.gdata.util.common.base.Escaper
    public Appendable escape(final Appendable appendable) {
        Preconditions.checkNotNull(appendable);
        return new Appendable() { // from class: com.google.gdata.util.common.base.UnicodeEscaper.1
            int pendingHighSurrogate = -1;
            char[] decodedChars = new char[2];

            private void outputChars(char[] cArr, int i) throws IOException {
                for (int i2 = 0; i2 < i; i2++) {
                    appendable.append(cArr[i2]);
                }
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) throws IOException {
                return append(charSequence, 0, charSequence.length());
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
                int i3;
                if (i < i2) {
                    if (this.pendingHighSurrogate != -1) {
                        int i4 = i + 1;
                        char charAt = charSequence.charAt(i);
                        if (Character.isLowSurrogate(charAt)) {
                            char[] escape = UnicodeEscaper.this.escape(Character.toCodePoint((char) this.pendingHighSurrogate, charAt));
                            if (escape != null) {
                                outputChars(escape, escape.length);
                                i = i4;
                            } else {
                                appendable.append((char) this.pendingHighSurrogate);
                            }
                            this.pendingHighSurrogate = -1;
                            i3 = i;
                            i = i4;
                        } else {
                            throw new IllegalArgumentException("Expected low surrogate character but got " + charAt);
                        }
                    } else {
                        i3 = i;
                    }
                    while (true) {
                        int nextEscapeIndex = UnicodeEscaper.this.nextEscapeIndex(charSequence, i, i2);
                        if (nextEscapeIndex > i3) {
                            appendable.append(charSequence, i3, nextEscapeIndex);
                        }
                        if (nextEscapeIndex == i2) {
                            break;
                        }
                        int codePointAt = UnicodeEscaper.codePointAt(charSequence, nextEscapeIndex, i2);
                        if (codePointAt < 0) {
                            this.pendingHighSurrogate = -codePointAt;
                            break;
                        }
                        char[] escape2 = UnicodeEscaper.this.escape(codePointAt);
                        if (escape2 != null) {
                            outputChars(escape2, escape2.length);
                        } else {
                            outputChars(this.decodedChars, Character.toChars(codePointAt, this.decodedChars, 0));
                        }
                        i3 = (Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1) + nextEscapeIndex;
                        i = i3;
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c) throws IOException {
                if (this.pendingHighSurrogate != -1) {
                    if (Character.isLowSurrogate(c)) {
                        char[] escape = UnicodeEscaper.this.escape(Character.toCodePoint((char) this.pendingHighSurrogate, c));
                        if (escape != null) {
                            outputChars(escape, escape.length);
                        } else {
                            appendable.append((char) this.pendingHighSurrogate);
                            appendable.append(c);
                        }
                        this.pendingHighSurrogate = -1;
                    } else {
                        throw new IllegalArgumentException("Expected low surrogate character but got '" + c + "' with value " + ((int) c));
                    }
                } else if (Character.isHighSurrogate(c)) {
                    this.pendingHighSurrogate = c;
                } else if (!Character.isLowSurrogate(c)) {
                    char[] escape2 = UnicodeEscaper.this.escape(c);
                    if (escape2 != null) {
                        outputChars(escape2, escape2.length);
                    } else {
                        appendable.append(c);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + ((int) c));
                }
                return this;
            }
        };
    }
}
