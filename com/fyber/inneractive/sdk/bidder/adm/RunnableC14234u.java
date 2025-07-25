package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C14475B;
import com.fyber.inneractive.sdk.response.AbstractC15386e;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.u */
/* loaded from: classes4.dex */
public final class RunnableC14234u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14475B f26902a;

    /* renamed from: b */
    public final /* synthetic */ Exception f26903b;

    public RunnableC14234u(C14475B c14475b, Exception exc) {
        this.f26902a = c14475b;
        this.f26903b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14475B c14475b = this.f26902a;
        if (c14475b != null) {
            c14475b.m77875a(this.f26903b, InneractiveErrorCode.INVALID_INPUT, new AbstractC15386e[0]);
        }
    }
}
