package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.P2 */
/* loaded from: classes9.dex */
public final class C34125P2 implements InterfaceC34867rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(Object obj) {
        C34517en[] c34517enArr = ((C34598hn) obj).f94585a;
        if (c34517enArr != null && c34517enArr.length != 0) {
            return new C34814pn(this, true, "");
        }
        return new C34814pn(this, false, "attributes list is empty");
    }
}
