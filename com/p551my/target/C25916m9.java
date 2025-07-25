package com.p551my.target;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.m9 */
/* loaded from: classes7.dex */
public final class C25916m9 {
    /* renamed from: a */
    public C25894l9 m43439a(String str) {
        try {
            String string = new JSONObject(str).getString("id");
            if (TextUtils.isEmpty(string)) {
                AbstractC25846ja.m43680a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – shoppableAdsDataId is empty");
                return null;
            }
            return new C25894l9(string);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – " + th.getMessage());
            return null;
        }
    }
}
