package com.iab.omid.library.taurusx.walking.async;

import com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.walking.async.a */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18665a extends AbstractAsyncTaskC18666b {

    /* renamed from: c */
    protected final HashSet<String> f46704c;

    /* renamed from: d */
    protected final JSONObject f46705d;

    /* renamed from: e */
    protected final long f46706e;

    public AbstractAsyncTaskC18665a(AbstractAsyncTaskC18666b.InterfaceC18668b interfaceC18668b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18668b);
        this.f46704c = new HashSet<>(hashSet);
        this.f46705d = jSONObject;
        this.f46706e = j;
    }
}
