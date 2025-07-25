package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18215a extends AbstractAsyncTaskC18216b {

    /* renamed from: c */
    protected final HashSet<String> f45776c;

    /* renamed from: d */
    protected final JSONObject f45777d;

    /* renamed from: e */
    protected final long f45778e;

    public AbstractAsyncTaskC18215a(AbstractAsyncTaskC18216b.InterfaceC18218b interfaceC18218b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18218b);
        this.f45776c = new HashSet<>(hashSet);
        this.f45777d = jSONObject;
        this.f45778e = j;
    }
}
