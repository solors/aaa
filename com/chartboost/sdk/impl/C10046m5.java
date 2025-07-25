package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.C10127p9;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.chartboost.sdk.impl.m5 */
/* loaded from: classes3.dex */
public class C10046m5 {

    /* renamed from: a */
    public final C10148q8 f22602a;

    public C10046m5(C10148q8 c10148q8) {
        this.f22602a = c10148q8;
    }

    /* renamed from: a */
    public List m81105a(C10127p9.C10129b c10129b) {
        HashMap m80756a = this.f22602a.m80756a();
        List<DataUseConsent> m81104a = m81104a(m80756a);
        ArrayList arrayList = new ArrayList();
        HashSet m81102b = m81102b(c10129b);
        if (m81102b != null) {
            for (DataUseConsent dataUseConsent : m81104a) {
                if (m81103a(m81102b, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (m80756a.containsKey("us_privacy")) {
                arrayList.add((DataUseConsent) m80756a.get("us_privacy"));
            }
            if (m80756a.containsKey("coppa")) {
                arrayList.add((DataUseConsent) m80756a.get("coppa"));
            }
            if (m80756a.containsKey("lgpd")) {
                arrayList.add((DataUseConsent) m80756a.get("lgpd"));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final HashSet m81102b(C10127p9.C10129b c10129b) {
        if (c10129b != null) {
            return c10129b.m80808a();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m81103a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandard())) {
            return true;
        }
        C9763c7.m81920b("DataUseConsent " + dataUseConsent.getPrivacyStandard() + " is not whitelisted.", null);
        return false;
    }

    /* renamed from: a */
    public final List m81104a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("gdpr");
        return new ArrayList(hashMap2.values());
    }
}
