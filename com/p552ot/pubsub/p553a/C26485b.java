package com.p552ot.pubsub.p553a;

import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p560h.C26552a;
import com.p552ot.pubsub.util.C26591m;
import com.p552ot.pubsub.util.C26596q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.a.b */
/* loaded from: classes7.dex */
public class C26485b {

    /* renamed from: a */
    public static final String f69244a = "B";

    /* renamed from: b */
    public static final String f69245b = "H";

    /* renamed from: c */
    private static final String f69246c = "EventDataBuilder";

    /* renamed from: a */
    public static String m41479a(String str, JSONObject jSONObject, Configuration configuration, PubSubTrack.IEventHook iEventHook, JSONObject jSONObject2, C26596q c26596q) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f69245b, C26552a.m41219a(str, configuration, iEventHook, c26596q));
        jSONObject3.put(f69244a, C26591m.m41027a(jSONObject, jSONObject2));
        return jSONObject3.toString();
    }
}
