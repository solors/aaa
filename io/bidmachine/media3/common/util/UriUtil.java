package io.bidmachine.media3.common.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;

@UnstableApi
/* loaded from: classes9.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    private static int[] getUriIndices(String str) {
        boolean z;
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(@Nullable String str) {
        if (str == null || getUriIndices(str)[0] == -1) {
            return false;
        }
        return true;
    }

    private static String removeDotSegments(StringBuilder sb2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i >= i2) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i6 = i;
        int i7 = i6;
        while (i6 <= i2) {
            if (i6 == i2) {
                i3 = i6;
            } else if (sb2.charAt(i6) == '/') {
                i3 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb2.charAt(i7) == '.') {
                sb2.delete(i7, i3);
                i2 -= i3 - i7;
            } else {
                if (i6 == i7 + 2 && sb2.charAt(i7) == '.' && sb2.charAt(i8) == '.') {
                    i4 = sb2.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING, i7 - 2) + 1;
                    if (i4 > i) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    sb2.delete(i5, i3);
                    i2 -= i3 - i5;
                } else {
                    i4 = i6 + 1;
                }
                i7 = i4;
            }
            i6 = i7;
        }
        return sb2.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                for (String str3 : uri.getQueryParameters(str2)) {
                    buildUpon.appendQueryParameter(str2, str3);
                }
            }
        }
        return buildUpon.build();
    }

    public static String resolve(@Nullable String str, @Nullable String str2) {
        int i;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb2.append(str2);
            removeDotSegments(sb2, uriIndices[1], uriIndices[2]);
            return sb2.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb2.append((CharSequence) str, 0, uriIndices2[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (uriIndices[2] == 0) {
            sb2.append((CharSequence) str, 0, uriIndices2[2]);
            sb2.append(str2);
            return sb2.toString();
        } else {
            int i2 = uriIndices[1];
            if (i2 != 0) {
                int i3 = uriIndices2[0] + 1;
                sb2.append((CharSequence) str, 0, i3);
                sb2.append(str2);
                return removeDotSegments(sb2, uriIndices[1] + i3, i3 + uriIndices[2]);
            } else if (str2.charAt(i2) == '/') {
                sb2.append((CharSequence) str, 0, uriIndices2[1]);
                sb2.append(str2);
                int i4 = uriIndices2[1];
                return removeDotSegments(sb2, i4, uriIndices[2] + i4);
            } else {
                int i5 = uriIndices2[0] + 2;
                int i6 = uriIndices2[1];
                if (i5 < i6 && i6 == uriIndices2[2]) {
                    sb2.append((CharSequence) str, 0, i6);
                    sb2.append('/');
                    sb2.append(str2);
                    int i7 = uriIndices2[1];
                    return removeDotSegments(sb2, i7, uriIndices[2] + i7 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
                if (lastIndexOf == -1) {
                    i = uriIndices2[1];
                } else {
                    i = lastIndexOf + 1;
                }
                sb2.append((CharSequence) str, 0, i);
                sb2.append(str2);
                return removeDotSegments(sb2, uriIndices2[1], i + uriIndices[2]);
            }
        }
    }

    public static Uri resolveToUri(@Nullable String str, @Nullable String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
