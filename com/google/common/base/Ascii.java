package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;

    /* renamed from: BS */
    public static final byte f39305BS = 8;
    public static final byte CAN = 24;

    /* renamed from: CR */
    public static final byte f39306CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = Byte.MAX_VALUE;
    public static final byte DLE = 16;

    /* renamed from: EM */
    public static final byte f39307EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;

    /* renamed from: FF */
    public static final byte f39308FF = 12;

    /* renamed from: FS */
    public static final byte f39309FS = 28;

    /* renamed from: GS */
    public static final byte f39310GS = 29;

    /* renamed from: HT */
    public static final byte f39311HT = 9;

    /* renamed from: LF */
    public static final byte f39312LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;

    /* renamed from: NL */
    public static final byte f39313NL = 10;
    public static final byte NUL = 0;

    /* renamed from: RS */
    public static final byte f39314RS = 30;

    /* renamed from: SI */
    public static final byte f39315SI = 15;

    /* renamed from: SO */
    public static final byte f39316SO = 14;
    public static final byte SOH = 1;

    /* renamed from: SP */
    public static final byte f39317SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;

    /* renamed from: US */
    public static final byte f39318US = 31;

    /* renamed from: VT */
    public static final byte f39319VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    /* renamed from: a */
    private static int m70108a(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int m70108a;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((m70108a = m70108a(charAt)) >= 26 || m70108a != m70108a(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLowerCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public static boolean isUpperCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (isUpperCase(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isUpperCase(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (isLowerCase(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isLowerCase(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i, String str) {
        boolean z;
        Preconditions.checkNotNull(charSequence);
        int length = i - str.length();
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "maxLength (%s) must be >= length of the truncation indicator (%s)", i, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i) {
                return charSequence2;
            }
        }
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append((CharSequence) str2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toLowerCase(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toUpperCase(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c) {
        return isUpperCase(c) ? (char) (c ^ ' ') : c;
    }

    public static char toUpperCase(char c) {
        return isLowerCase(c) ? (char) (c ^ ' ') : c;
    }
}
