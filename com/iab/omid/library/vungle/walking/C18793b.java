package com.iab.omid.library.vungle.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC18790d;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC18791e;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC18792f;
import com.iab.omid.library.vungle.walking.async.C18789c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.b */
/* loaded from: classes6.dex */
public class C18793b implements AbstractAsyncTaskC18786b.InterfaceC18788b {

    /* renamed from: a */
    private JSONObject f46976a;

    /* renamed from: b */
    private final C18789c f46977b;

    public C18793b(C18789c c18789c) {
        this.f46977b = c18789c;
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b.InterfaceC18788b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo61317a() {
        return this.f46976a;
    }

    /* renamed from: b */
    public void m61314b() {
        this.f46977b.m61324b(new AsyncTaskC18790d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b.InterfaceC18788b
    @VisibleForTesting
    /* renamed from: a */
    public void mo61316a(JSONObject jSONObject) {
        this.f46976a = jSONObject;
    }

    /* renamed from: b */
    public void m61313b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46977b.m61324b(new AsyncTaskC18792f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m61315a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46977b.m61324b(new AsyncTaskC18791e(this, hashSet, jSONObject, j));
    }
}
