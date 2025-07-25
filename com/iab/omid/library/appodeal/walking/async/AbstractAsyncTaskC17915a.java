package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17915a extends AbstractAsyncTaskC17916b {

    /* renamed from: c */
    protected final HashSet<String> f45148c;

    /* renamed from: d */
    protected final JSONObject f45149d;

    /* renamed from: e */
    protected final long f45150e;

    public AbstractAsyncTaskC17915a(AbstractAsyncTaskC17916b.InterfaceC17918b interfaceC17918b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17918b);
        this.f45148c = new HashSet<>(hashSet);
        this.f45149d = jSONObject;
        this.f45150e = j;
    }
}
