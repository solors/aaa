package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.vast.AbstractC14550j;
import com.fyber.inneractive.sdk.model.vast.C14609b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.fyber.inneractive.sdk.response.g */
/* loaded from: classes4.dex */
public final class C15388g extends AbstractC15386e {

    /* renamed from: M */
    public long f30484M;

    /* renamed from: N */
    public C14609b f30485N;

    /* renamed from: Q */
    public final ArrayList f30488Q = new ArrayList();

    /* renamed from: O */
    public final LinkedHashMap f30486O = new LinkedHashMap();

    /* renamed from: P */
    public final ArrayList f30487P = new ArrayList();

    /* renamed from: R */
    public final LinkedHashMap f30489R = new LinkedHashMap();

    @Override // com.fyber.inneractive.sdk.response.AbstractC15386e
    /* renamed from: a */
    public final InneractiveErrorCode mo76577a(InneractiveAdRequest inneractiveAdRequest, C14388r c14388r) {
        return AbstractC14550j.m77812a(inneractiveAdRequest, this, c14388r);
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC15386e
    /* renamed from: b */
    public final InneractiveErrorCode mo76576b() {
        return AbstractC14550j.m77812a(null, this, null);
    }
}
