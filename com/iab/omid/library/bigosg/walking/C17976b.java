package com.iab.omid.library.bigosg.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b;
import com.iab.omid.library.bigosg.walking.p391a.AsyncTaskC17973d;
import com.iab.omid.library.bigosg.walking.p391a.AsyncTaskC17974e;
import com.iab.omid.library.bigosg.walking.p391a.AsyncTaskC17975f;
import com.iab.omid.library.bigosg.walking.p391a.C17972c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.walking.b */
/* loaded from: classes6.dex */
public class C17976b implements AbstractAsyncTaskC17969b.InterfaceC17971b {

    /* renamed from: a */
    private JSONObject f45278a;

    /* renamed from: b */
    private final C17972c f45279b;

    public C17976b(C17972c c17972c) {
        this.f45279b = c17972c;
    }

    /* renamed from: a */
    public void m64483a() {
        this.f45279b.m64490b(new AsyncTaskC17973d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b.InterfaceC17971b
    @VisibleForTesting
    /* renamed from: b */
    public JSONObject mo64480b() {
        return this.f45278a;
    }

    @Override // com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b.InterfaceC17971b
    @VisibleForTesting
    /* renamed from: a */
    public void mo64482a(JSONObject jSONObject) {
        this.f45278a = jSONObject;
    }

    /* renamed from: b */
    public void m64479b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45279b.m64490b(new AsyncTaskC17974e(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m64481a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f45279b.m64490b(new AsyncTaskC17975f(this, hashSet, jSONObject, j));
    }
}
