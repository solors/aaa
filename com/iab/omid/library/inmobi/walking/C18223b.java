package com.iab.omid.library.inmobi.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b;
import com.iab.omid.library.inmobi.walking.async.AsyncTaskC18220d;
import com.iab.omid.library.inmobi.walking.async.AsyncTaskC18221e;
import com.iab.omid.library.inmobi.walking.async.AsyncTaskC18222f;
import com.iab.omid.library.inmobi.walking.async.C18219c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.b */
/* loaded from: classes6.dex */
public class C18223b implements AbstractAsyncTaskC18216b.InterfaceC18218b {

    /* renamed from: a */
    private JSONObject f45785a;

    /* renamed from: b */
    private final C18219c f45786b;

    public C18223b(C18219c c18219c) {
        this.f45786b = c18219c;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b.InterfaceC18218b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo63539a() {
        return this.f45785a;
    }

    /* renamed from: b */
    public void m63536b() {
        this.f45786b.m63546b(new AsyncTaskC18220d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b.InterfaceC18218b
    @VisibleForTesting
    /* renamed from: a */
    public void mo63538a(JSONObject jSONObject) {
        this.f45785a = jSONObject;
    }

    /* renamed from: b */
    public void m63535b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45786b.m63546b(new AsyncTaskC18222f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m63537a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45786b.m63546b(new AsyncTaskC18221e(this, hashSet, jSONObject, j));
    }
}
