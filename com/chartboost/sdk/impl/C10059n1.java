package com.chartboost.sdk.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.chartboost.sdk.impl.n1 */
/* loaded from: classes3.dex */
public final class C10059n1 {
    /* renamed from: a */
    public final String m81046a(String str) {
        String m16628I;
        int i;
        boolean z;
        m16628I = StringsJVM.m16628I(str, "\n", "", false, 4, null);
        int length = m16628I.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.m17071j(m16628I.charAt(i), 32) <= 0) {
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
        return m16628I.subSequence(i2, length + 1).toString();
    }

    /* renamed from: b */
    public final String m81045b(String encodedString) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        try {
            Result.C38506a c38506a = Result.f101870c;
            byte[] decode = Base64.decode(m81046a(encodedString), 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            m14549b = Result.m14549b(new String(decode, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            String localizedMessage = m14546e.getLocalizedMessage();
            C9763c7.m81919b("Cannot decode base64 string: " + localizedMessage, null, 2, null);
        }
        if (Result.m14544g(m14549b)) {
            m14549b = "";
        }
        return (String) m14549b;
    }

    /* renamed from: c */
    public final String m81044c(String originalString) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        try {
            Result.C38506a c38506a = Result.f101870c;
            byte[] bytes = originalString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
            m14549b = Result.m14549b(m81046a(encodeToString));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            String localizedMessage = m14546e.getLocalizedMessage();
            C9763c7.m81919b("Cannot encode to base64 string: " + localizedMessage, null, 2, null);
        }
        if (Result.m14544g(m14549b)) {
            m14549b = "";
        }
        return (String) m14549b;
    }
}
