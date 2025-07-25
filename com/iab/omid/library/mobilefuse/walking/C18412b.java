package com.iab.omid.library.mobilefuse.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b;
import com.iab.omid.library.mobilefuse.walking.async.AsyncTaskC18409d;
import com.iab.omid.library.mobilefuse.walking.async.AsyncTaskC18410e;
import com.iab.omid.library.mobilefuse.walking.async.AsyncTaskC18411f;
import com.iab.omid.library.mobilefuse.walking.async.C18408c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.walking.b */
/* loaded from: classes6.dex */
public class C18412b implements AbstractAsyncTaskC18405b.InterfaceC18407b {

    /* renamed from: a */
    private JSONObject f46180a;

    /* renamed from: b */
    private final C18408c f46181b;

    public C18412b(C18408c c18408c) {
        this.f46181b = c18408c;
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b.InterfaceC18407b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo62798a() {
        return this.f46180a;
    }

    /* renamed from: b */
    public void m62795b() {
        this.f46181b.m62805b(new AsyncTaskC18409d(this));
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b.InterfaceC18407b
    @VisibleForTesting
    /* renamed from: a */
    public void mo62797a(JSONObject jSONObject) {
        this.f46180a = jSONObject;
    }

    /* renamed from: b */
    public void m62794b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46181b.m62805b(new AsyncTaskC18411f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m62796a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46181b.m62805b(new AsyncTaskC18410e(this, hashSet, jSONObject, j));
    }
}
