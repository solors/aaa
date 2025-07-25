package com.facebook.ads.redexgen.p370X;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.d2 */
/* loaded from: assets/audience_network.dex */
public final class C13222d2 implements InterfaceC1086703<File> {
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086703
    public final C1086602<File> A3i(File file, InterfaceC108850L interfaceC108850L) {
        if (file.exists()) {
            return new C1086602<>(true, file);
        }
        return new C1086602<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086703
    public final void A4q(File file, InterfaceC108850L interfaceC108850L) {
    }
}
