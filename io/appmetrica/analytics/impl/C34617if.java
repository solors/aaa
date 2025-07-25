package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.if */
/* loaded from: classes9.dex */
public final class C34617if implements InterfaceC34867rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(Object obj) {
        Integer num = (Integer) obj;
        if (num != null && num.intValue() <= 0) {
            return new C34814pn(this, false, "Invalid quantity value " + num);
        }
        return new C34814pn(this, true, "");
    }
}
