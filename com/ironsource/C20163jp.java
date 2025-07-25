package com.ironsource;

import com.ironsource.C19950g2;
import kotlin.Metadata;

@Metadata
/* renamed from: com.ironsource.jp */
/* loaded from: classes6.dex */
public final class C20163jp {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final C19950g2 m57796b(C20654pp c20654pp, boolean z) {
        C19950g2.EnumC19951a enumC19951a;
        if (z) {
            enumC19951a = C19950g2.EnumC19951a.MANUAL;
        } else if (c20654pp.m55758k().m58294e()) {
            enumC19951a = C19950g2.EnumC19951a.AUTOMATIC_LOAD_WHILE_SHOW;
        } else {
            enumC19951a = C19950g2.EnumC19951a.AUTOMATIC_LOAD_AFTER_CLOSE;
        }
        return new C19950g2(enumC19951a, c20654pp.m55758k().m58289j(), c20654pp.m55758k().m58297b(), -1L);
    }
}
