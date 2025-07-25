package com.iab.omid.library.pubnativenet.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b;
import com.iab.omid.library.pubnativenet.walking.async.AsyncTaskC18549d;
import com.iab.omid.library.pubnativenet.walking.async.AsyncTaskC18550e;
import com.iab.omid.library.pubnativenet.walking.async.AsyncTaskC18551f;
import com.iab.omid.library.pubnativenet.walking.async.C18548c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.walking.b */
/* loaded from: classes6.dex */
public class C18552b implements AbstractAsyncTaskC18545b.InterfaceC18547b {

    /* renamed from: a */
    private JSONObject f46450a;

    /* renamed from: b */
    private final C18548c f46451b;

    public C18552b(C18548c c18548c) {
        this.f46451b = c18548c;
    }

    @Override // com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b.InterfaceC18547b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo62292a() {
        return this.f46450a;
    }

    /* renamed from: b */
    public void m62289b() {
        this.f46451b.m62299b(new AsyncTaskC18549d(this));
    }

    @Override // com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b.InterfaceC18547b
    @VisibleForTesting
    /* renamed from: a */
    public void mo62291a(JSONObject jSONObject) {
        this.f46450a = jSONObject;
    }

    /* renamed from: b */
    public void m62288b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46451b.m62299b(new AsyncTaskC18551f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m62290a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46451b.m62299b(new AsyncTaskC18550e(this, hashSet, jSONObject, j));
    }
}
