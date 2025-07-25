package com.iab.omid.library.pubmatic.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b;
import com.iab.omid.library.pubmatic.walking.async.AsyncTaskC18479d;
import com.iab.omid.library.pubmatic.walking.async.AsyncTaskC18480e;
import com.iab.omid.library.pubmatic.walking.async.AsyncTaskC18481f;
import com.iab.omid.library.pubmatic.walking.async.C18478c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.walking.b */
/* loaded from: classes6.dex */
public class C18482b implements AbstractAsyncTaskC18475b.InterfaceC18477b {

    /* renamed from: a */
    private JSONObject f46315a;

    /* renamed from: b */
    private final C18478c f46316b;

    public C18482b(C18478c c18478c) {
        this.f46316b = c18478c;
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b.InterfaceC18477b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo62545a() {
        return this.f46315a;
    }

    /* renamed from: b */
    public void m62542b() {
        this.f46316b.m62552b(new AsyncTaskC18479d(this));
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b.InterfaceC18477b
    @VisibleForTesting
    /* renamed from: a */
    public void mo62544a(JSONObject jSONObject) {
        this.f46315a = jSONObject;
    }

    /* renamed from: b */
    public void m62541b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46316b.m62552b(new AsyncTaskC18481f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m62543a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46316b.m62552b(new AsyncTaskC18480e(this, hashSet, jSONObject, j));
    }
}
