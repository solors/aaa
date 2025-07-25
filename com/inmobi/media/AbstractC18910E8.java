package com.inmobi.media;

import com.ironsource.C21114v8;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.E8 */
/* loaded from: classes6.dex */
public abstract class AbstractC18910E8 {
    /* renamed from: a */
    public static final boolean m61135a(C19289ga c19289ga) {
        String str;
        boolean m16592R;
        Intrinsics.checkNotNullParameter(c19289ga, "<this>");
        Map map = c19289ga.f48264c;
        if (map == null || (str = (String) map.get("Content-Encoding")) == null) {
            return false;
        }
        m16592R = C37690r.m16592R(str, "gzip", false, 2, null);
        return m16592R;
    }

    /* renamed from: a */
    public static final String m61134a(String url, Map map) {
        boolean m16592R;
        boolean m16616x;
        boolean m16616x2;
        Intrinsics.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        AbstractC18994K8.m60974a(map);
        String m60976a = AbstractC18994K8.m60976a(C21114v8.C21123i.f54135c, map);
        StringBuilder sb2 = new StringBuilder(url);
        int length = m60976a.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.m17071j(m60976a.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (m60976a.subSequence(i, length + 1).toString().length() > 0) {
            m16592R = C37690r.m16592R(url, "?", false, 2, null);
            if (!m16592R) {
                sb2.append("?");
            }
            m16616x = StringsJVM.m16616x(url, C21114v8.C21123i.f54135c, false, 2, null);
            if (!m16616x) {
                m16616x2 = StringsJVM.m16616x(url, "?", false, 2, null);
                if (!m16616x2) {
                    sb2.append(C21114v8.C21123i.f54135c);
                }
            }
            sb2.append(m60976a);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: a */
    public static final String m61133a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                try {
                } catch (UnsupportedEncodingException | Exception unused) {
                    return "";
                }
            }
            return new String(bArr, Charsets.UTF_8);
        }
        return "";
    }
}
