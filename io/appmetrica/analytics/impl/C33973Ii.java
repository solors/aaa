package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ii */
/* loaded from: classes9.dex */
public final class C33973Ii implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ String f93034a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f93035b;

    public C33973Ii(String str, Throwable th) {
        this.f93034a = str;
        this.f93035b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportError(this.f93034a, this.f93035b);
    }
}
