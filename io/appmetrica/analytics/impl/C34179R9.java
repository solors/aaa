package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.R9 */
/* loaded from: classes9.dex */
public final class C34179R9 {

    /* renamed from: a */
    public final C34334Xk f93444a = new C34334Xk();

    /* renamed from: b */
    public C34227T9 f93445b = new C34227T9();

    /* renamed from: a */
    public final synchronized void m22318a(C34227T9 c34227t9) {
        this.f93445b = c34227t9;
    }

    /* renamed from: a */
    public final synchronized void m22317a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m17075f((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f93445b.f93529a) != null) {
                boolean booleanValue = bool.booleanValue();
                C34227T9 c34227t9 = this.f93445b;
                IdentifierStatus identifierStatus = c34227t9.f93530b;
                String str2 = c34227t9.f93531c;
                if (booleanValue) {
                    str = "true";
                } else if (booleanValue) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    str = "false";
                }
                hashMap.put("appmetrica_lib_ssl_enabled", this.f93444a.m22091a(new IdentifiersResult(str, identifierStatus, str2)));
            }
        }
    }
}
