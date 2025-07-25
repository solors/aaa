package com.ironsource;

import com.ironsource.C19950g2;
import kotlin.Metadata;

@Metadata
/* renamed from: com.ironsource.b6 */
/* loaded from: classes6.dex */
public final class C19618b6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final C19950g2 m59351b(C20512n6 c20512n6) {
        C19950g2.EnumC19951a enumC19951a;
        if (c20512n6.m56189d().m58294e()) {
            enumC19951a = C19950g2.EnumC19951a.MANUAL_WITH_LOAD_ON_SHOW;
        } else {
            enumC19951a = C19950g2.EnumC19951a.MANUAL_WITH_AUTOMATIC_RELOAD;
        }
        return new C19950g2(enumC19951a, c20512n6.m56189d().m58289j(), c20512n6.m56189d().m58297b(), c20512n6.m56184i() * 1000);
    }
}
