package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.Pf */
/* loaded from: classes9.dex */
public final class C34138Pf {

    /* renamed from: a */
    public final String f93335a;

    /* renamed from: b */
    public final String f93336b;

    /* renamed from: c */
    public final C34940ui f93337c;

    public C34138Pf(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C34940ui(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f93335a + "', identifier='" + this.f93336b + "', screen=" + this.f93337c + '}';
    }

    public C34138Pf(String str, String str2, C34940ui c34940ui) {
        this.f93335a = str;
        this.f93336b = str2;
        this.f93337c = c34940ui;
    }
}
