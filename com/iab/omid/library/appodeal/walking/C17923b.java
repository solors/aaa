package com.iab.omid.library.appodeal.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b;
import com.iab.omid.library.appodeal.walking.async.AsyncTaskC17920d;
import com.iab.omid.library.appodeal.walking.async.AsyncTaskC17921e;
import com.iab.omid.library.appodeal.walking.async.AsyncTaskC17922f;
import com.iab.omid.library.appodeal.walking.async.C17919c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.b */
/* loaded from: classes6.dex */
public class C17923b implements AbstractAsyncTaskC17916b.InterfaceC17918b {

    /* renamed from: a */
    private JSONObject f45157a;

    /* renamed from: b */
    private final C17919c f45158b;

    public C17923b(C17919c c17919c) {
        this.f45158b = c17919c;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b.InterfaceC17918b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo64697a() {
        return this.f45157a;
    }

    /* renamed from: b */
    public void m64694b() {
        this.f45158b.m64704b(new AsyncTaskC17920d(this));
    }

    @Override // com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b.InterfaceC17918b
    @VisibleForTesting
    /* renamed from: a */
    public void mo64696a(JSONObject jSONObject) {
        this.f45157a = jSONObject;
    }

    /* renamed from: b */
    public void m64693b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45158b.m64704b(new AsyncTaskC17922f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m64695a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45158b.m64704b(new AsyncTaskC17921e(this, hashSet, jSONObject, j));
    }
}
