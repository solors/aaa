package com.iab.omid.library.smaato.walking.async;

import com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18607a extends AbstractAsyncTaskC18608b {

    /* renamed from: c */
    protected final HashSet<String> f46576c;

    /* renamed from: d */
    protected final JSONObject f46577d;

    /* renamed from: e */
    protected final long f46578e;

    public AbstractAsyncTaskC18607a(AbstractAsyncTaskC18608b.InterfaceC18610b interfaceC18610b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18610b);
        this.f46576c = new HashSet<>(hashSet);
        this.f46577d = jSONObject;
        this.f46578e = j;
    }
}
