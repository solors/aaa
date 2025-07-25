package com.iab.omid.library.ironsrc.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC18276d;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC18277e;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC18278f;
import com.iab.omid.library.ironsrc.walking.async.C18275c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
/* loaded from: classes6.dex */
public class C18279b implements AbstractAsyncTaskC18272b.InterfaceC18274b {

    /* renamed from: a */
    private JSONObject f45910a;

    /* renamed from: b */
    private final C18275c f45911b;

    public C18279b(C18275c c18275c) {
        this.f45911b = c18275c;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b.InterfaceC18274b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo63304a() {
        return this.f45910a;
    }

    /* renamed from: b */
    public void m63301b() {
        this.f45911b.m63311b(new AsyncTaskC18276d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b.InterfaceC18274b
    @VisibleForTesting
    /* renamed from: a */
    public void mo63303a(JSONObject jSONObject) {
        this.f45910a = jSONObject;
    }

    /* renamed from: b */
    public void m63300b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45911b.m63311b(new AsyncTaskC18278f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m63302a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45911b.m63311b(new AsyncTaskC18277e(this, hashSet, jSONObject, j));
    }
}
