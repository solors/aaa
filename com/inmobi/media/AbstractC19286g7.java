package com.inmobi.media;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.g7 */
/* loaded from: classes6.dex */
public abstract class AbstractC19286g7 {
    /* renamed from: a */
    public static byte m60326a(String referencedCreativeString) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(referencedCreativeString, "referencedCreativeString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = referencedCreativeString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int length = lowerCase.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.m17071j(lowerCase.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        String m61239a = AbstractC18880C6.m61239a(length, 1, lowerCase, i2);
        int hashCode = m61239a.hashCode();
        if (hashCode != -1412832500) {
            if (hashCode != 0) {
                if (hashCode == 112202875 && m61239a.equals("video")) {
                    return (byte) 1;
                }
            } else if (m61239a.equals("")) {
                return (byte) 1;
            }
        } else if (m61239a.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
