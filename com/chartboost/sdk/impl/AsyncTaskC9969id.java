package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.id */
/* loaded from: classes3.dex */
public class AsyncTaskC9969id extends AbstractAsyncTaskC9968ic {
    public AsyncTaskC9969id(AbstractAsyncTaskC10174rc.InterfaceC10176b interfaceC10176b, HashSet hashSet, JSONObject jSONObject, long j) {
        super(interfaceC10176b, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f22376d.toString();
    }

    /* renamed from: b */
    public final void m81360b(String str) {
        C10300vc m80229c = C10300vc.m80229c();
        if (m80229c != null) {
            for (C9746bc c9746bc : m80229c.m80231b()) {
                if (this.f22375c.contains(c9746bc.m81975j())) {
                    c9746bc.m81974k().m80577a(str, this.f22377e);
                }
            }
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m81360b(str);
        super.onPostExecute(str);
    }
}
