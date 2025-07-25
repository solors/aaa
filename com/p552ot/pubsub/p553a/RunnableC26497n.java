package com.p552ot.pubsub.p553a;

import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.util.C26582g;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26591m;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.n */
/* loaded from: classes7.dex */
public class RunnableC26497n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f69281a;

    /* renamed from: b */
    final /* synthetic */ C26487d f69282b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26497n(C26487d c26487d, Map map) {
        this.f69282b = c26487d;
        this.f69281a = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Configuration configuration;
        JSONObject jSONObject;
        Configuration configuration2;
        try {
            JSONObject m41028a = C26591m.m41028a((Map<String, Object>) this.f69281a, true);
            configuration = this.f69282b.f69254h;
            String m41099a = C26582g.m41099a(C26591m.m41035a(configuration));
            if (!TextUtils.isEmpty(m41099a)) {
                jSONObject = new JSONObject(m41099a);
            } else {
                jSONObject = null;
            }
            JSONObject m41027a = C26591m.m41027a(m41028a, jSONObject);
            configuration2 = this.f69282b.f69254h;
            C26582g.m41097a(C26591m.m41035a(configuration2), m41027a.toString());
        } catch (Exception e) {
            C26586j.m41074b("PubSubTrackImp", " " + e.toString());
        }
    }
}
