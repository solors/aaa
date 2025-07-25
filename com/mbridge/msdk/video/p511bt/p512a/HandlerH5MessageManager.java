package com.mbridge.msdk.video.p511bt.p512a;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.p473a.H5ReportManager;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.mbridge.msdk.video.p511bt.p512a.H5MediaPlayerManager;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.c */
/* loaded from: classes6.dex */
public final class HandlerH5MessageManager {

    /* renamed from: a */
    int f59973a;

    /* renamed from: b */
    int f59974b;

    /* renamed from: c */
    private String f59975c;

    /* compiled from: HandlerH5MessageManager.java */
    /* renamed from: com.mbridge.msdk.video.bt.a.c$a */
    /* loaded from: classes6.dex */
    private static final class C22962a {

        /* renamed from: a */
        private static HandlerH5MessageManager f59976a = new HandlerH5MessageManager();
    }

    /* renamed from: a */
    public static HandlerH5MessageManager m49217a() {
        return C22962a.f59976a;
    }

    private HandlerH5MessageManager() {
        this.f59975c = "handlerNativeResult";
        this.f59973a = 0;
        this.f59974b = 1;
    }

    /* renamed from: a */
    public final void m49215a(Object obj, JSONObject jSONObject) {
        H5MediaPlayerManager unused;
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject optJSONObject = jSONObject.optJSONObject("result");
                        int i = 0;
                        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                            i = optJSONObject.optInt("type", 0);
                        }
                        m49216a(this.f59973a, "receivedMessage", obj);
                        if (optString.equalsIgnoreCase("reporter")) {
                            H5ReportManager.m51174a().m51172a(obj, optString2, optJSONArray, i);
                            return;
                        } else if (optString.equalsIgnoreCase("MediaPlayer")) {
                            unused = H5MediaPlayerManager.C22960a.f59972a;
                            return;
                        } else {
                            return;
                        }
                    }
                    m49216a(this.f59974b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                SameLogTool.m51827a("HandlerH5MessageManager", e.getMessage());
                m49216a(this.f59974b, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                SameLogTool.m51827a("HandlerH5MessageManager", th.getMessage());
                m49216a(this.f59974b, th.getMessage(), obj);
                return;
            }
        }
        m49216a(this.f59974b, "params is null", obj);
    }

    /* renamed from: a */
    private void m49216a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, i);
            jSONObject.put("message", str);
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            SameLogTool.m51827a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            SameLogTool.m51827a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
