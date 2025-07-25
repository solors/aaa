package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.Y */
/* loaded from: classes4.dex */
public final class C15278Y extends AbstractC15225E {

    /* renamed from: a */
    public final InterfaceC15226E0 f30228a;

    /* renamed from: b */
    public final Object f30229b;

    /* renamed from: c */
    public final InterfaceC15226E0 f30230c;

    /* renamed from: d */
    public final C15276X f30231d;

    public C15278Y(InterfaceC15226E0 interfaceC15226E0, Object obj, InterfaceC15226E0 interfaceC15226E02, C15276X c15276x) {
        if (interfaceC15226E0 != null) {
            if (c15276x.f30222c == EnumC15245K1.MESSAGE && interfaceC15226E02 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f30228a = interfaceC15226E0;
            this.f30229b = obj;
            this.f30230c = interfaceC15226E02;
            this.f30231d = c15276x;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
