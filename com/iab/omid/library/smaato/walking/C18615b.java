package com.iab.omid.library.smaato.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b;
import com.iab.omid.library.smaato.walking.async.AsyncTaskC18612d;
import com.iab.omid.library.smaato.walking.async.AsyncTaskC18613e;
import com.iab.omid.library.smaato.walking.async.AsyncTaskC18614f;
import com.iab.omid.library.smaato.walking.async.C18611c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.b */
/* loaded from: classes6.dex */
public class C18615b implements AbstractAsyncTaskC18608b.InterfaceC18610b {

    /* renamed from: a */
    private JSONObject f46585a;

    /* renamed from: b */
    private final C18611c f46586b;

    public C18615b(C18611c c18611c) {
        this.f46586b = c18611c;
    }

    @Override // com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b.InterfaceC18610b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo62039a() {
        return this.f46585a;
    }

    /* renamed from: b */
    public void m62036b() {
        this.f46586b.m62046b(new AsyncTaskC18612d(this));
    }

    @Override // com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b.InterfaceC18610b
    @VisibleForTesting
    /* renamed from: a */
    public void mo62038a(JSONObject jSONObject) {
        this.f46585a = jSONObject;
    }

    /* renamed from: b */
    public void m62035b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46586b.m62046b(new AsyncTaskC18614f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m62037a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f46586b.m62046b(new AsyncTaskC18613e(this, hashSet, jSONObject, j));
    }
}
