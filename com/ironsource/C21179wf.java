package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.wf */
/* loaded from: classes6.dex */
public class C21179wf implements InterfaceC20204ke {
    @Override // com.ironsource.InterfaceC20204ke
    /* renamed from: a */
    public String mo54342a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(C20517nb.f52170Q, C20517nb.f52171R).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
