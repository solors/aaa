package com.bytedance.adsdk.ugeno.eqN;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.eqN.C7086IL;
import com.bytedance.adsdk.ugeno.p213bX.C7033IL;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.Kg */
/* loaded from: classes3.dex */
public class C7093Kg {
    /* renamed from: bg */
    public static C7086IL.C7087bg m90043bg(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C7086IL.C7087bg c7087bg = new C7086IL.C7087bg();
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            c7087bg.m90048bg(parse.getScheme());
        }
        String authority = parse.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = parse.getPath();
        }
        c7087bg.m90051IL(authority);
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, C7033IL.m90221bg(parse.getQueryParameter(str2), jSONObject));
            }
        }
        c7087bg.m90047bg(hashMap);
        return c7087bg;
    }
}
