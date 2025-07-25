package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y8 */
/* loaded from: classes6.dex */
public abstract class AbstractC19539y8 {
    /* renamed from: a */
    public static String m59539a(String valueTypeString) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(valueTypeString, "valueTypeString");
        int length = valueTypeString.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.m17071j(valueTypeString.charAt(i), 32) <= 0) {
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
        String m61239a = AbstractC18880C6.m61239a(length, 1, valueTypeString, i2);
        int hashCode = m61239a.hashCode();
        if (hashCode != -1900324833) {
            if (hashCode != -835221992) {
                if (hashCode != 116079) {
                    if (hashCode == 3213227 && m61239a.equals("html")) {
                        return "HTML";
                    }
                } else if (m61239a.equals("url")) {
                    return "URL";
                }
            } else if (m61239a.equals("reference_iframe")) {
                return "REF_IFRAME";
            }
        } else if (m61239a.equals("reference_html")) {
            return "REF_HTML";
        }
        return "UNKNOWN";
    }
}
