package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18271a extends AbstractAsyncTaskC18272b {

    /* renamed from: c */
    protected final HashSet<String> f45901c;

    /* renamed from: d */
    protected final JSONObject f45902d;

    /* renamed from: e */
    protected final long f45903e;

    public AbstractAsyncTaskC18271a(AbstractAsyncTaskC18272b.InterfaceC18274b interfaceC18274b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18274b);
        this.f45901c = new HashSet<>(hashSet);
        this.f45902d = jSONObject;
        this.f45903e = j;
    }
}
