package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18334a extends AbstractAsyncTaskC18335b {

    /* renamed from: c */
    protected final HashSet<String> f46036c;

    /* renamed from: d */
    protected final JSONObject f46037d;

    /* renamed from: e */
    protected final long f46038e;

    public AbstractAsyncTaskC18334a(AbstractAsyncTaskC18335b.InterfaceC18337b interfaceC18337b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18337b);
        this.f46036c = new HashSet<>(hashSet);
        this.f46037d = jSONObject;
        this.f46038e = j;
    }
}
