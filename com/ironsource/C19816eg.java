package com.ironsource;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.eg */
/* loaded from: classes6.dex */
public final class C19816eg {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m58809b(JSONObject jSONObject, String str) {
        boolean z;
        String optString = jSONObject.optString(str);
        if (optString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return optString;
    }
}
