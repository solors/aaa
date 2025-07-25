package com.pubmatic.sdk.monitor;

import com.pubmatic.sdk.monitor.POBMonitorWebView;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.monitor.c */
/* loaded from: classes7.dex */
class RunnableC26762c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f70394a;

    /* renamed from: b */
    final /* synthetic */ POBMonitorWebView.C26757c f70395b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26762c(POBMonitorWebView.C26757c c26757c, JSONObject jSONObject) {
        this.f70395b = c26757c;
        this.f70394a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        POBMonitorWebView.m40493a(this.f70395b.f70387a, this.f70394a.optString("body", ""));
    }
}
