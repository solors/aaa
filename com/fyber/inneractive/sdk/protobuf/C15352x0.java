package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.x0 */
/* loaded from: classes4.dex */
public final class C15352x0 implements InterfaceC15220C0 {

    /* renamed from: a */
    public final InterfaceC15220C0[] f30337a;

    public C15352x0(InterfaceC15220C0... interfaceC15220C0Arr) {
        this.f30337a = interfaceC15220C0Arr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15220C0
    /* renamed from: a */
    public final boolean mo76710a(Class cls) {
        for (InterfaceC15220C0 interfaceC15220C0 : this.f30337a) {
            if (interfaceC15220C0.mo76710a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15220C0
    /* renamed from: b */
    public final C15267S0 mo76709b(Class cls) {
        InterfaceC15220C0[] interfaceC15220C0Arr;
        for (InterfaceC15220C0 interfaceC15220C0 : this.f30337a) {
            if (interfaceC15220C0.mo76710a(cls)) {
                return interfaceC15220C0.mo76709b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
