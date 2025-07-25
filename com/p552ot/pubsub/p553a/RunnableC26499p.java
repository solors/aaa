package com.p552ot.pubsub.p553a;

import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.util.C26582g;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26591m;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.p */
/* loaded from: classes7.dex */
public class RunnableC26499p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69284a;

    /* renamed from: b */
    final /* synthetic */ C26487d f69285b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26499p(C26487d c26487d, String str) {
        this.f69285b = c26487d;
        this.f69284a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Configuration configuration;
        Configuration configuration2;
        try {
            configuration = this.f69285b.f69254h;
            String m41099a = C26582g.m41099a(C26591m.m41035a(configuration));
            if (!TextUtils.isEmpty(m41099a)) {
                JSONObject jSONObject = new JSONObject(m41099a);
                jSONObject.remove(this.f69284a);
                configuration2 = this.f69285b.f69254h;
                C26582g.m41097a(C26591m.m41035a(configuration2), jSONObject.toString());
            }
        } catch (Exception e) {
            C26586j.m41074b("PubSubTrackImp", "removeCommonProperty error:" + e.toString());
        }
    }
}
