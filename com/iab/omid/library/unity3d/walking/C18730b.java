package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC18727d;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC18728e;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC18729f;
import com.iab.omid.library.unity3d.walking.async.C18726c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.b */
/* loaded from: classes6.dex */
public class C18730b implements AbstractAsyncTaskC18723b.InterfaceC18725b {

    /* renamed from: a */
    private JSONObject f46841a;

    /* renamed from: b */
    private final C18726c f46842b;

    public C18730b(C18726c c18726c) {
        this.f46842b = c18726c;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b.InterfaceC18725b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo61570a() {
        return this.f46841a;
    }

    /* renamed from: b */
    public void m61567b() {
        this.f46842b.m61577b(new AsyncTaskC18727d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b.InterfaceC18725b
    @VisibleForTesting
    /* renamed from: a */
    public void mo61569a(JSONObject jSONObject) {
        this.f46841a = jSONObject;
    }

    /* renamed from: b */
    public void m61566b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46842b.m61577b(new AsyncTaskC18729f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m61568a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46842b.m61577b(new AsyncTaskC18728e(this, hashSet, jSONObject, j));
    }
}
