package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.EnumC14527i;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a */
    public final InneractiveErrorCode f27359a;

    /* renamed from: b */
    public final EnumC14527i f27360b;

    /* renamed from: c */
    public final Throwable f27361c;

    /* renamed from: d */
    public Exception f27362d;

    /* renamed from: e */
    public final ArrayList f27363e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, EnumC14527i enumC14527i) {
        this(inneractiveErrorCode, enumC14527i, null);
    }

    public void addReportedError(EnumC14730t enumC14730t) {
        this.f27363e.add(enumC14730t);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27359a);
        if (this.f27361c != null) {
            sb2.append(" : ");
            sb2.append(this.f27361c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f27362d;
        if (exc == null) {
            return this.f27361c;
        }
        return exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f27359a;
    }

    public EnumC14527i getFyberMarketplaceAdLoadFailureReason() {
        return this.f27360b;
    }

    public boolean isErrorAlreadyReported(EnumC14730t enumC14730t) {
        return this.f27363e.contains(enumC14730t);
    }

    public void setCause(Exception exc) {
        this.f27362d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, EnumC14527i enumC14527i, Throwable th) {
        this.f27363e = new ArrayList();
        this.f27359a = inneractiveErrorCode;
        this.f27360b = enumC14527i;
        this.f27361c = th;
    }
}
