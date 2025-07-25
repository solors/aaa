package io.appmetrica.analytics.coreutils.internal;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import kotlin.collections._Arrays;

/* loaded from: classes9.dex */
public final class StringUtils {
    public static final String COMMA = ",";
    public static final String EMPTY = "";
    public static final String PROCESS_POSTFIX_DELIMITER = ":";
    public static final String UNDEFINED = "undefined";

    public static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static int compare(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return -1;
        } else if (str2 == null) {
            return 1;
        } else {
            return str.compareTo(str2);
        }
    }

    @NonNull
    public static String contentValuesToString(@Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return "null";
        }
        return contentValues.toString();
    }

    @NonNull
    public static String correctIllFormedString(@NonNull String str) {
        return new String(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String emptyIfNull(String str) {
        return ifIsNullToDef(str, "");
    }

    public static boolean equalsNullSafety(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static String formatSha1(@NonNull byte[] bArr) {
        return toHexString(bArr).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    public static byte[] getUTF8Bytes(@Nullable String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getUtf8BytesLength(@Nullable String str) {
        return getUTF8Bytes(str).length;
    }

    public static byte[] hexToBytes(@NonNull String str) {
        if (str.length() % 2 == 0) {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Input string must contain an even number of characters");
    }

    public static String ifIsEmptyToDef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    public static String ifIsNullToDef(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return str;
    }

    @NonNull
    public static byte[] stringToBytesForProtobuf(@Nullable String str) {
        if (str == null) {
            return new byte[0];
        }
        return str.getBytes();
    }

    @NonNull
    public static String throwableToString(@NonNull Throwable th) {
        String m17315k0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.getClass().getName());
        sb2.append(": ");
        sb2.append(th.getMessage());
        sb2.append("\n");
        m17315k0 = _Arrays.m17315k0(th.getStackTrace(), "\n", "", "", -1, APSSharedUtil.TRUNCATE_SEPARATOR, null);
        sb2.append(m17315k0);
        return sb2.toString();
    }

    public static String toHexString(@NonNull byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb2.append("0123456789abcdef".charAt(b & 15));
        }
        return sb2.toString();
    }

    public static final String wrapFeatures(String... strArr) {
        return TextUtils.join(",", strArr);
    }

    public static byte[][] getUTF8Bytes(@Nullable List<String> list) {
        byte[][] bArr = new byte[0];
        if (list != null) {
            bArr = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = getUTF8Bytes(list.get(i));
            }
        }
        return bArr;
    }
}
