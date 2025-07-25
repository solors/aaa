package com.iab.omid.library.pubmatic.walking.async;

import com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18474a extends AbstractAsyncTaskC18475b {

    /* renamed from: c */
    protected final HashSet<String> f46306c;

    /* renamed from: d */
    protected final JSONObject f46307d;

    /* renamed from: e */
    protected final long f46308e;

    public AbstractAsyncTaskC18474a(AbstractAsyncTaskC18475b.InterfaceC18477b interfaceC18477b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18477b);
        this.f46306c = new HashSet<>(hashSet);
        this.f46307d = jSONObject;
        this.f46308e = j;
    }
}
