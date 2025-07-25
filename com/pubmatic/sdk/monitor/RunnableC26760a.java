package com.pubmatic.sdk.monitor;

import com.pubmatic.sdk.monitor.POBMonitor;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.monitor.a */
/* loaded from: classes7.dex */
class RunnableC26760a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f70391a;

    /* renamed from: b */
    final /* synthetic */ POBMonitor.C26746c f70392b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26760a(POBMonitor.C26746c c26746c, JSONObject jSONObject) {
        this.f70392b = c26746c;
        this.f70391a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (POBMonitor.this.webView != null) {
            POBMonitor.this.webView.appendData(this.f70391a);
        }
    }
}
