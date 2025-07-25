package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractAsyncTaskC10174rc;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.ic */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC9968ic extends AbstractAsyncTaskC10174rc {

    /* renamed from: c */
    public final HashSet f22375c;

    /* renamed from: d */
    public final JSONObject f22376d;

    /* renamed from: e */
    public final long f22377e;

    public AbstractAsyncTaskC9968ic(AbstractAsyncTaskC10174rc.InterfaceC10176b interfaceC10176b, HashSet hashSet, JSONObject jSONObject, long j) {
        super(interfaceC10176b);
        this.f22375c = new HashSet(hashSet);
        this.f22376d = jSONObject;
        this.f22377e = j;
    }
}
