package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18147a extends AbstractAsyncTaskC18148b {

    /* renamed from: c */
    protected final HashSet<String> f45647c;

    /* renamed from: d */
    protected final JSONObject f45648d;

    /* renamed from: e */
    protected final long f45649e;

    public AbstractAsyncTaskC18147a(AbstractAsyncTaskC18148b.InterfaceC18150b interfaceC18150b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18150b);
        this.f45647c = new HashSet<>(hashSet);
        this.f45648d = jSONObject;
        this.f45649e = j;
    }
}
