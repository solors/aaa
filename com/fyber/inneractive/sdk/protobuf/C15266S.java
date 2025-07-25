package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.S */
/* loaded from: classes4.dex */
public final class C15266S implements InterfaceC15220C0 {

    /* renamed from: a */
    public static final C15266S f30207a = new C15266S();

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15220C0
    /* renamed from: a */
    public final boolean mo76710a(Class cls) {
        return AbstractC15283a0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC15220C0
    /* renamed from: b */
    public final C15267S0 mo76709b(Class cls) {
        if (AbstractC15283a0.class.isAssignableFrom(cls)) {
            try {
                return (C15267S0) AbstractC15283a0.getDefaultInstance(cls.asSubclass(AbstractC15283a0.class)).buildMessageInfo();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
