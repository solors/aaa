package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18722a extends AbstractAsyncTaskC18723b {

    /* renamed from: c */
    protected final HashSet<String> f46832c;

    /* renamed from: d */
    protected final JSONObject f46833d;

    /* renamed from: e */
    protected final long f46834e;

    public AbstractAsyncTaskC18722a(AbstractAsyncTaskC18723b.InterfaceC18725b interfaceC18725b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18725b);
        this.f46832c = new HashSet<>(hashSet);
        this.f46833d = jSONObject;
        this.f46834e = j;
    }
}
