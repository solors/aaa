package com.iab.omid.library.mmadbridge.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC18339d;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC18340e;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC18341f;
import com.iab.omid.library.mmadbridge.walking.async.C18338c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.b */
/* loaded from: classes6.dex */
public class C18342b implements AbstractAsyncTaskC18335b.InterfaceC18337b {

    /* renamed from: a */
    private JSONObject f46045a;

    /* renamed from: b */
    private final C18338c f46046b;

    public C18342b(C18338c c18338c) {
        this.f46046b = c18338c;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b.InterfaceC18337b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo63051a() {
        return this.f46045a;
    }

    /* renamed from: b */
    public void m63048b() {
        this.f46046b.m63058b(new AsyncTaskC18339d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b.InterfaceC18337b
    @VisibleForTesting
    /* renamed from: a */
    public void mo63050a(JSONObject jSONObject) {
        this.f46045a = jSONObject;
    }

    /* renamed from: b */
    public void m63047b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46046b.m63058b(new AsyncTaskC18341f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m63049a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46046b.m63058b(new AsyncTaskC18340e(this, hashSet, jSONObject, j));
    }
}
