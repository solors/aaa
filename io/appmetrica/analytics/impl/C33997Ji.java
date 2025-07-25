package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ji */
/* loaded from: classes9.dex */
public final class C33997Ji implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ String f93071a;

    /* renamed from: b */
    public final /* synthetic */ String f93072b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f93073c;

    public C33997Ji(String str, String str2, Throwable th) {
        this.f93071a = str;
        this.f93072b = str2;
        this.f93073c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportError(this.f93071a, this.f93072b, this.f93073c);
    }
}
