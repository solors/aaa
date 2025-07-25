package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.A7 */
/* loaded from: classes9.dex */
public final class C33763A7 {

    /* renamed from: a */
    public final InterfaceC33916Ga f92562a;

    /* renamed from: b */
    public String f92563b = "";

    public C33763A7(InterfaceC33916Ga interfaceC33916Ga) {
        this.f92562a = interfaceC33916Ga;
    }

    /* renamed from: a */
    public final void m22783a(String str, boolean z) {
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null && !Intrinsics.m17075f(this.f92563b, str)) {
                this.f92563b = str;
                this.f92562a.mo21510a(str, z);
            }
        }
    }
}
