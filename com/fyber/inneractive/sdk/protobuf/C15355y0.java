package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.protobuf.y0 */
/* loaded from: classes4.dex */
public final class C15355y0 {

    /* renamed from: b */
    public static final C15349w0 f30342b = new C15349w0();

    /* renamed from: a */
    public final InterfaceC15220C0 f30343a;

    public C15355y0() {
        InterfaceC15220C0 interfaceC15220C0;
        try {
            interfaceC15220C0 = (InterfaceC15220C0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC15220C0 = f30342b;
        }
        C15352x0 c15352x0 = new C15352x0(C15266S.f30207a, interfaceC15220C0);
        Charset charset = AbstractC15319m0.f30280a;
        this.f30343a = c15352x0;
    }
}
