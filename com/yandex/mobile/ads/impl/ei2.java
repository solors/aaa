package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ni2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class ei2 extends ni2 {

    /* renamed from: c */
    protected final HashSet<String> f78639c;

    /* renamed from: d */
    protected final JSONObject f78640d;

    /* renamed from: e */
    protected final long f78641e;

    public ei2(ni2.InterfaceC30950b interfaceC30950b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC30950b);
        this.f78639c = new HashSet<>(hashSet);
        this.f78640d = jSONObject;
        this.f78641e = j;
    }
}
