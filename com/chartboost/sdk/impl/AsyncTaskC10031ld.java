package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.ld */
/* loaded from: classes3.dex */
public class AsyncTaskC10031ld extends AbstractAsyncTaskC9968ic {
    public AsyncTaskC10031ld(AbstractAsyncTaskC10174rc.InterfaceC10176b interfaceC10176b, HashSet hashSet, JSONObject jSONObject, long j) {
        super(interfaceC10176b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m81142b(String str) {
        C10300vc m80229c = C10300vc.m80229c();
        if (m80229c != null) {
            for (C9746bc c9746bc : m80229c.m80231b()) {
                if (this.f22375c.contains(c9746bc.m81975j())) {
                    c9746bc.m81974k().m80571b(str, this.f22377e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (AbstractC10359xc.m80038h(this.f22376d, this.f23079b.mo80648a())) {
            return null;
        }
        this.f23079b.mo80647a(this.f22376d);
        return this.f22376d.toString();
    }

    @Override // com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m81142b(str);
        }
        super.onPostExecute(str);
    }
}
