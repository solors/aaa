package com.iab.omid.library.fyber.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC18152d;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC18153e;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC18154f;
import com.iab.omid.library.fyber.walking.async.C18151c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.b */
/* loaded from: classes6.dex */
public class C18155b implements AbstractAsyncTaskC18148b.InterfaceC18150b {

    /* renamed from: a */
    private JSONObject f45656a;

    /* renamed from: b */
    private final C18151c f45657b;

    public C18155b(C18151c c18151c) {
        this.f45657b = c18151c;
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b.InterfaceC18150b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo63780a() {
        return this.f45656a;
    }

    /* renamed from: b */
    public void m63777b() {
        this.f45657b.m63787b(new AsyncTaskC18152d(this));
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b.InterfaceC18150b
    @VisibleForTesting
    /* renamed from: a */
    public void mo63779a(JSONObject jSONObject) {
        this.f45656a = jSONObject;
    }

    /* renamed from: b */
    public void m63776b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45657b.m63787b(new AsyncTaskC18154f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m63778a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45657b.m63787b(new AsyncTaskC18153e(this, hashSet, jSONObject, j));
    }
}
