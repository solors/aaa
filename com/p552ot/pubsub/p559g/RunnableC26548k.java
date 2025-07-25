package com.p552ot.pubsub.p559g;

import android.text.TextUtils;
import com.p552ot.pubsub.p553a.InterfaceC26486c;
import com.p552ot.pubsub.util.C26578c;
import com.p552ot.pubsub.util.C26586j;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.g.k */
/* loaded from: classes7.dex */
public final class RunnableC26548k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC26486c f69546a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26548k(InterfaceC26486c interfaceC26486c) {
        this.f69546a = interfaceC26486c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            List<JSONObject> m41244b = C26546i.m41244b();
            C26586j.m41080a("NetworkAccessManager", "jsonData :" + m41244b);
            if (m41244b != null && m41244b.size() > 0) {
                for (JSONObject jSONObject : m41244b) {
                    String optString = jSONObject.optString("projectid");
                    String optString2 = jSONObject.optString("topic");
                    String optString3 = jSONObject.optString("eventName");
                    String optString4 = jSONObject.optString("data");
                    Map<String, String> m41108a = C26578c.m41108a(jSONObject.optString(C26546i.f69531h));
                    C26586j.m41080a("NetworkAccessManager", "attributes values : " + m41108a.toString());
                    boolean optBoolean = jSONObject.optBoolean(C26546i.f69532i, false);
                    if (TextUtils.isEmpty(optString3)) {
                        this.f69546a.mo41449a(optString, optString2, optString4, m41108a, optBoolean);
                    } else {
                        this.f69546a.mo41450a(optString, optString2, optString3, optString4, m41108a);
                    }
                }
            }
            C26546i.m41242b(true);
        } catch (Exception e) {
            C26586j.m41074b("NetworkAccessManager", "cta event error: " + e.toString());
        }
        boolean unused = C26546i.f69538o = false;
    }
}
