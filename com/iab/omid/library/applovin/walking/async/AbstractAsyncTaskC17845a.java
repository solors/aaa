package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17845a extends AbstractAsyncTaskC17846b {

    /* renamed from: c */
    protected final HashSet<String> f45013c;

    /* renamed from: d */
    protected final JSONObject f45014d;

    /* renamed from: e */
    protected final long f45015e;

    public AbstractAsyncTaskC17845a(AbstractAsyncTaskC17846b.InterfaceC17848b interfaceC17848b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17848b);
        this.f45013c = new HashSet<>(hashSet);
        this.f45014d = jSONObject;
        this.f45015e = j;
    }
}
