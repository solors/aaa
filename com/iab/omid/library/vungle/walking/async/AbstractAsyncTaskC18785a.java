package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18785a extends AbstractAsyncTaskC18786b {

    /* renamed from: c */
    protected final HashSet<String> f46967c;

    /* renamed from: d */
    protected final JSONObject f46968d;

    /* renamed from: e */
    protected final long f46969e;

    public AbstractAsyncTaskC18785a(AbstractAsyncTaskC18786b.InterfaceC18788b interfaceC18788b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18788b);
        this.f46967c = new HashSet<>(hashSet);
        this.f46968d = jSONObject;
        this.f46969e = j;
    }
}
