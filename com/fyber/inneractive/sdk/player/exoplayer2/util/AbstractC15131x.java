package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.x */
/* loaded from: classes4.dex */
public abstract class AbstractC15131x {
    /* renamed from: a */
    public static Uri m77165a(String str, String str2) {
        String m77164a;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m77166a = m77166a(str2);
        if (m77166a[0] != -1) {
            sb2.append(str2);
            m77164a(sb2, m77166a[1], m77166a[2]);
            m77164a = sb2.toString();
        } else {
            int[] m77166a2 = m77166a(str);
            if (m77166a[3] == 0) {
                sb2.append((CharSequence) str, 0, m77166a2[3]);
                sb2.append(str2);
                m77164a = sb2.toString();
            } else if (m77166a[2] == 0) {
                sb2.append((CharSequence) str, 0, m77166a2[2]);
                sb2.append(str2);
                m77164a = sb2.toString();
            } else {
                int i = m77166a[1];
                if (i != 0) {
                    int i2 = m77166a2[0] + 1;
                    sb2.append((CharSequence) str, 0, i2);
                    sb2.append(str2);
                    m77164a = m77164a(sb2, m77166a[1] + i2, i2 + m77166a[2]);
                } else if (str2.charAt(i) == '/') {
                    sb2.append((CharSequence) str, 0, m77166a2[1]);
                    sb2.append(str2);
                    int i3 = m77166a2[1];
                    m77164a = m77164a(sb2, i3, m77166a[2] + i3);
                } else {
                    int i4 = m77166a2[0] + 2;
                    int i5 = m77166a2[1];
                    if (i4 < i5 && i5 == m77166a2[2]) {
                        sb2.append((CharSequence) str, 0, i5);
                        sb2.append('/');
                        sb2.append(str2);
                        int i6 = m77166a2[1];
                        m77164a = m77164a(sb2, i6, m77166a[2] + i6 + 1);
                    } else {
                        int lastIndexOf = str.lastIndexOf(47, m77166a2[2] - 1);
                        int i7 = lastIndexOf == -1 ? m77166a2[1] : lastIndexOf + 1;
                        sb2.append((CharSequence) str, 0, i7);
                        sb2.append(str2);
                        m77164a = m77164a(sb2, m77166a2[1], i7 + m77166a[2]);
                    }
                }
            }
        }
        return Uri.parse(m77164a);
    }

    /* renamed from: a */
    public static String m77164a(StringBuilder sb2, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb2.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb2.charAt(i6) == '.') {
                sb2.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb2.charAt(i6) == '.' && sb2.charAt(i7) == '.') {
                    i4 = sb2.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING, i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb2.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static int[] m77166a(String str) {
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
}
