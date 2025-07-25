package com.iab.omid.library.amazon.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b;
import com.iab.omid.library.amazon.walking.async.AsyncTaskC17789d;
import com.iab.omid.library.amazon.walking.async.AsyncTaskC17790e;
import com.iab.omid.library.amazon.walking.async.AsyncTaskC17791f;
import com.iab.omid.library.amazon.walking.async.C17788c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.b */
/* loaded from: classes6.dex */
public class C17792b implements AbstractAsyncTaskC17785b.InterfaceC17787b {

    /* renamed from: a */
    private JSONObject f44893a;

    /* renamed from: b */
    private final C17788c f44894b;

    public C17792b(C17788c c17788c) {
        this.f44894b = c17788c;
    }

    @Override // com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b.InterfaceC17787b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo65191a() {
        return this.f44893a;
    }

    /* renamed from: b */
    public void m65188b() {
        this.f44894b.m65198b(new AsyncTaskC17789d(this));
    }

    @Override // com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b.InterfaceC17787b
    @VisibleForTesting
    /* renamed from: a */
    public void mo65190a(JSONObject jSONObject) {
        this.f44893a = jSONObject;
    }

    /* renamed from: b */
    public void m65187b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f44894b.m65198b(new AsyncTaskC17791f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m65189a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f44894b.m65198b(new AsyncTaskC17790e(this, hashSet, jSONObject, j));
    }
}
