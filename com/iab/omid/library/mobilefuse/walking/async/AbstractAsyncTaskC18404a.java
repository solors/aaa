package com.iab.omid.library.mobilefuse.walking.async;

import com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18404a extends AbstractAsyncTaskC18405b {

    /* renamed from: c */
    protected final HashSet<String> f46171c;

    /* renamed from: d */
    protected final JSONObject f46172d;

    /* renamed from: e */
    protected final long f46173e;

    public AbstractAsyncTaskC18404a(AbstractAsyncTaskC18405b.InterfaceC18407b interfaceC18407b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18407b);
        this.f46171c = new HashSet<>(hashSet);
        this.f46172d = jSONObject;
        this.f46173e = j;
    }
}
