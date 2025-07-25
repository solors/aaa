package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Yi */
/* loaded from: classes9.dex */
public final class C34356Yi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ String f93842a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f93843b;

    public C34356Yi(String str, byte[] bArr) {
        this.f93842a = str;
        this.f93843b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.setSessionExtra(this.f93842a, this.f93843b);
    }
}
