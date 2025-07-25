package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC18032d;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC18033e;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC18034f;
import com.iab.omid.library.bytedance2.walking.async.C18031c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.walking.b */
/* loaded from: classes6.dex */
public class C18035b implements AbstractAsyncTaskC18028b.InterfaceC18030b {

    /* renamed from: a */
    private JSONObject f45407a;

    /* renamed from: b */
    private final C18031c f45408b;

    public C18035b(C18031c c18031c) {
        this.f45408b = c18031c;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b.InterfaceC18030b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo64242a() {
        return this.f45407a;
    }

    /* renamed from: b */
    public void m64239b() {
        this.f45408b.m64249b(new AsyncTaskC18032d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b.InterfaceC18030b
    @VisibleForTesting
    /* renamed from: a */
    public void mo64241a(JSONObject jSONObject) {
        this.f45407a = jSONObject;
    }

    /* renamed from: b */
    public void m64238b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45408b.m64249b(new AsyncTaskC18034f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m64240a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45408b.m64249b(new AsyncTaskC18033e(this, hashSet, jSONObject, j));
    }
}
