package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC17850d;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC17851e;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC17852f;
import com.iab.omid.library.applovin.walking.async.C17849c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
/* loaded from: classes6.dex */
public class C17853b implements AbstractAsyncTaskC17846b.InterfaceC17848b {

    /* renamed from: a */
    private JSONObject f45022a;

    /* renamed from: b */
    private final C17849c f45023b;

    public C17853b(C17849c c17849c) {
        this.f45023b = c17849c;
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b.InterfaceC17848b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo64950a() {
        return this.f45022a;
    }

    /* renamed from: b */
    public void m64947b() {
        this.f45023b.m64957b(new AsyncTaskC17850d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b.InterfaceC17848b
    @VisibleForTesting
    /* renamed from: a */
    public void mo64949a(JSONObject jSONObject) {
        this.f45022a = jSONObject;
    }

    /* renamed from: b */
    public void m64946b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45023b.m64957b(new AsyncTaskC17852f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m64948a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45023b.m64957b(new AsyncTaskC17851e(this, hashSet, jSONObject, j));
    }
}
