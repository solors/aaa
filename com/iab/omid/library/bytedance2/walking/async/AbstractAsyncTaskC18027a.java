package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18027a extends AbstractAsyncTaskC18028b {

    /* renamed from: c */
    protected final HashSet<String> f45398c;

    /* renamed from: d */
    protected final JSONObject f45399d;

    /* renamed from: e */
    protected final long f45400e;

    public AbstractAsyncTaskC18027a(AbstractAsyncTaskC18028b.InterfaceC18030b interfaceC18030b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18030b);
        this.f45398c = new HashSet<>(hashSet);
        this.f45399d = jSONObject;
        this.f45400e = j;
    }
}
