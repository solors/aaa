package com.p552ot.pubsub.p560h;

import com.p552ot.pubsub.p554b.C26511h;
import com.p552ot.pubsub.util.C26586j;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.h.c */
/* loaded from: classes7.dex */
public class C26557c extends C26552a {

    /* renamed from: e */
    private static final String f69624e = "CustomMessage";

    public C26557c(String str, String str2, String str3, String str4) {
        try {
            m41220a(str);
            m41212c(str3);
            m41214b(str2);
            m41215b(System.currentTimeMillis());
            m41217a(new JSONObject(str4));
            m41222a(C26511h.m41408a().m41402a(str, str3, "level", 1));
        } catch (Exception e) {
            C26586j.m41080a(f69624e, "CustomMessage error:" + e.toString());
        }
    }
}
