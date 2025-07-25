package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17784a extends AbstractAsyncTaskC17785b {

    /* renamed from: c */
    protected final HashSet<String> f44884c;

    /* renamed from: d */
    protected final JSONObject f44885d;

    /* renamed from: e */
    protected final long f44886e;

    public AbstractAsyncTaskC17784a(AbstractAsyncTaskC17785b.InterfaceC17787b interfaceC17787b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17787b);
        this.f44884c = new HashSet<>(hashSet);
        this.f44885d = jSONObject;
        this.f44886e = j;
    }
}
