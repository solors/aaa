package com.p551my.target;

import android.text.TextUtils;

/* renamed from: com.my.target.z7 */
/* loaded from: classes7.dex */
public final class C26273z7 {
    /* renamed from: a */
    public C26223x7 m42242a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                AbstractC25846ja.m43680a("PostMessageParser: can't parse postMessage – type is empty");
                return null;
            } else if (TextUtils.isEmpty(str2)) {
                AbstractC25846ja.m43680a("PostMessageParser: can't parse postMessage – action is empty");
                return null;
            } else if (TextUtils.isEmpty(str3)) {
                AbstractC25846ja.m43680a("PostMessageParser: can't parse postMessage – params is empty");
                return null;
            } else {
                return C26223x7.m42435a(str, str2, str3);
            }
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("PostMessageParser: can't parse postMessage – " + th.getMessage());
            return null;
        }
    }
}
