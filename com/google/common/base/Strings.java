package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Strings {
    private Strings() {
    }

    /* renamed from: a */
    private static String m70003a(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb2.append(name);
            sb2.append('@');
            sb2.append(hexString);
            String sb3 = sb2.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb3);
            if (valueOf.length() != 0) {
                str = "Exception during lenientFormat for ".concat(valueOf);
            } else {
                str = new String("Exception during lenientFormat for ");
            }
            logger.log(level, str, (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + name2.length());
            sb4.append("<");
            sb4.append(sb3);
            sb4.append(" threw ");
            sb4.append(name2);
            sb4.append(">");
            return sb4.toString();
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    static boolean m70002b(CharSequence charSequence, int i) {
        if (i >= 0 && i <= charSequence.length() - 2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (m70002b(charSequence, i2) || m70002b(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (m70002b(charSequence, (charSequence.length() - i) - 1) || m70002b(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    public static String emptyToNull(String str) {
        return Platform.m70051b(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return Platform.m70044i(str);
    }

    public static String lenientFormat(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = m70003a(objArr[i2]);
            }
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String nullToEmpty(String str) {
        return Platform.m70047f(str);
    }

    public static String padEnd(String str, int i, char c) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        for (int length = str.length(); length < i; length++) {
            sb2.append(c);
        }
        return sb2.toString();
    }

    public static String padStart(String str, int i, char c) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb2.append(c);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String repeat(String str, int i) {
        Preconditions.checkNotNull(str);
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            Preconditions.checkArgument(z, "invalid count: %s", i);
            if (i == 0) {
                return "";
            }
            return str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Required array size too large: ");
            sb2.append(j);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }
}
