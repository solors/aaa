package com.iab.omid.library.taurusx.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b;
import com.iab.omid.library.taurusx.walking.async.AsyncTaskC18670d;
import com.iab.omid.library.taurusx.walking.async.AsyncTaskC18671e;
import com.iab.omid.library.taurusx.walking.async.AsyncTaskC18672f;
import com.iab.omid.library.taurusx.walking.async.C18669c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.walking.b */
/* loaded from: classes6.dex */
public class C18673b implements AbstractAsyncTaskC18666b.InterfaceC18668b {

    /* renamed from: a */
    private JSONObject f46713a;

    /* renamed from: b */
    private final C18669c f46714b;

    public C18673b(C18669c c18669c) {
        this.f46714b = c18669c;
    }

    @Override // com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b.InterfaceC18668b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo61804a() {
        return this.f46713a;
    }

    /* renamed from: b */
    public void m61801b() {
        this.f46714b.m61811b(new AsyncTaskC18670d(this));
    }

    @Override // com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b.InterfaceC18668b
    @VisibleForTesting
    /* renamed from: a */
    public void mo61803a(JSONObject jSONObject) {
        this.f46713a = jSONObject;
    }

    /* renamed from: b */
    public void m61800b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46714b.m61811b(new AsyncTaskC18672f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m61802a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46714b.m61811b(new AsyncTaskC18671e(this, hashSet, jSONObject, j));
    }
}
