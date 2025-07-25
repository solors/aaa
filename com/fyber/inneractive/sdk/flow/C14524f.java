package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.metrics.AbstractC14599a;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.f */
/* loaded from: classes4.dex */
public final class C14524f extends AbstractC14599a {

    /* renamed from: e */
    public static final String f27506e = String.valueOf(24);

    /* renamed from: f */
    public static final String f27507f = String.valueOf(1);

    /* renamed from: b */
    public final AbstractC15386e f27508b;

    /* renamed from: c */
    public final InneractiveAdRequest f27509c;

    /* renamed from: d */
    public final JSONArray f27510d;

    public C14524f(AbstractC15386e abstractC15386e, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f27508b = abstractC15386e;
        this.f27509c = inneractiveAdRequest;
        this.f27510d = jSONArray;
    }
}
