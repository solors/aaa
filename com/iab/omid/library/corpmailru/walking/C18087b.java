package com.iab.omid.library.corpmailru.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b;
import com.iab.omid.library.corpmailru.walking.p397a.AsyncTaskC18084d;
import com.iab.omid.library.corpmailru.walking.p397a.AsyncTaskC18085e;
import com.iab.omid.library.corpmailru.walking.p397a.AsyncTaskC18086f;
import com.iab.omid.library.corpmailru.walking.p397a.C18083c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.b */
/* loaded from: classes6.dex */
public class C18087b implements AbstractAsyncTaskC18080b.InterfaceC18082b {

    /* renamed from: a */
    private JSONObject f45520a;

    /* renamed from: b */
    private final C18083c f45521b;

    public C18087b(C18083c c18083c) {
        this.f45521b = c18083c;
    }

    /* renamed from: a */
    public void m64033a() {
        this.f45521b.m64040b(new AsyncTaskC18084d(this));
    }

    @Override // com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b.InterfaceC18082b
    @VisibleForTesting
    /* renamed from: b */
    public JSONObject mo64030b() {
        return this.f45520a;
    }

    @Override // com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b.InterfaceC18082b
    @VisibleForTesting
    /* renamed from: a */
    public void mo64032a(JSONObject jSONObject) {
        this.f45520a = jSONObject;
    }

    /* renamed from: b */
    public void m64029b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45521b.m64040b(new AsyncTaskC18085e(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m64031a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45521b.m64040b(new AsyncTaskC18086f(this, hashSet, jSONObject, j));
    }
}
