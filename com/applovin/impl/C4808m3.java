package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* renamed from: com.applovin.impl.m3 */
/* loaded from: classes2.dex */
public class C4808m3 {

    /* renamed from: a */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f7870a;

    public C4808m3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f7870a = consentFlowUserGeography;
    }

    /* renamed from: a */
    protected boolean m97612a(Object obj) {
        return obj instanceof C4808m3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4808m3)) {
            return false;
        }
        C4808m3 c4808m3 = (C4808m3) obj;
        if (!c4808m3.m97612a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography m97613a = m97613a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography m97613a2 = c4808m3.m97613a();
        if (m97613a != null ? m97613a.equals(m97613a2) : m97613a2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AppLovinSdkConfiguration.ConsentFlowUserGeography m97613a = m97613a();
        if (m97613a == null) {
            hashCode = 43;
        } else {
            hashCode = m97613a.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + m97613a() + ")";
    }

    /* renamed from: a */
    public AppLovinSdkConfiguration.ConsentFlowUserGeography m97613a() {
        return this.f7870a;
    }
}
