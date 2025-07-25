package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.qc */
/* loaded from: classes3.dex */
public class C10155qc implements AbstractAsyncTaskC10174rc.InterfaceC10176b {

    /* renamed from: a */
    public JSONObject f23027a;

    /* renamed from: b */
    public final C10414zc f23028b;

    public C10155qc(C10414zc c10414zc) {
        this.f23028b = c10414zc;
    }

    @Override // com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc.InterfaceC10176b
    /* renamed from: a */
    public JSONObject mo80648a() {
        return this.f23027a;
    }

    /* renamed from: b */
    public void m80716b() {
        this.f23028b.m79782b(new AsyncTaskC9838ed(this));
    }

    @Override // com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc.InterfaceC10176b
    /* renamed from: a */
    public void mo80647a(JSONObject jSONObject) {
        this.f23027a = jSONObject;
    }

    /* renamed from: b */
    public void m80715b(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f23028b.m79782b(new AsyncTaskC10031ld(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m80717a(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f23028b.m79782b(new AsyncTaskC9969id(this, hashSet, jSONObject, j));
    }
}
