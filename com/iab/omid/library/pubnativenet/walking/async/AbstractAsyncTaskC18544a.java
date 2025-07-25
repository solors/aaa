package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18544a extends AbstractAsyncTaskC18545b {

    /* renamed from: c */
    protected final HashSet<String> f46441c;

    /* renamed from: d */
    protected final JSONObject f46442d;

    /* renamed from: e */
    protected final long f46443e;

    public AbstractAsyncTaskC18544a(AbstractAsyncTaskC18545b.InterfaceC18547b interfaceC18547b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18547b);
        this.f46441c = new HashSet<>(hashSet);
        this.f46442d = jSONObject;
        this.f46443e = j;
    }
}
