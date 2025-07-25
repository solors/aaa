package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C14475B;
import com.fyber.inneractive.sdk.response.AbstractC15386e;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.x */
/* loaded from: classes4.dex */
public final class RunnableC14237x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14475B f26908a;

    public RunnableC14237x(C14475B c14475b) {
        this.f26908a = c14475b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14475B c14475b = this.f26908a;
        if (c14475b != null) {
            c14475b.m77875a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new AbstractC15386e[0]);
        }
    }
}
