package com.p552ot.pubsub.p554b;

import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.p555c.C26521a;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26599t;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.b.p */
/* loaded from: classes7.dex */
public class RunnableC26520p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Configuration f69389a;

    /* renamed from: b */
    final /* synthetic */ String f69390b;

    /* renamed from: c */
    final /* synthetic */ C26519o f69391c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26520p(C26519o c26519o, Configuration configuration, String str) {
        this.f69391c = c26519o;
        this.f69389a = configuration;
        this.f69390b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String m40984c = C26599t.m40984c();
            if (!TextUtils.isEmpty(m40984c)) {
                String str = C26521a.f69392a;
                String m41363c = C26521a.m41363c(m40984c, str);
                if (!TextUtils.isEmpty(m41363c)) {
                    JSONObject jSONObject = new JSONObject(m41363c);
                    jSONObject.put(this.f69390b, this.f69391c.m41376b(this.f69389a));
                    C26599t.m40989b(C26521a.m41372a(jSONObject.toString(), str));
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f69390b, this.f69391c.m41376b(this.f69389a));
            C26599t.m40989b(C26521a.m41372a(jSONObject2.toString(), C26521a.f69392a));
        } catch (Throwable th) {
            C26586j.m41080a("ConfigEntityManager", "putProjectIdConfigBySP Throwable:" + th.getMessage());
        }
    }
}
