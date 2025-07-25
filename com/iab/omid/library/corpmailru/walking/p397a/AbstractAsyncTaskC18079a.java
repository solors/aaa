package com.iab.omid.library.corpmailru.walking.p397a;

import com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18079a extends AbstractAsyncTaskC18080b {

    /* renamed from: a */
    protected final HashSet<String> f45511a;

    /* renamed from: b */
    protected final JSONObject f45512b;

    /* renamed from: c */
    protected final long f45513c;

    public AbstractAsyncTaskC18079a(AbstractAsyncTaskC18080b.InterfaceC18082b interfaceC18082b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18082b);
        this.f45511a = new HashSet<>(hashSet);
        this.f45512b = jSONObject;
        this.f45513c = j;
    }
}
