package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jr */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12044Jr implements InterfaceC12579SX {
    public final C12052Jz A00;
    public final EnumC12584Sc A01;

    public AbstractC12044Jr(C12052Jz c12052Jz, EnumC12584Sc enumC12584Sc) {
        this.A00 = c12052Jz;
        this.A01 = enumC12584Sc;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12579SX
    public void A3v(Map<InterfaceC12561SF, EnumC12584Sc> map, Map<SyncModifiableBundle, EnumC12571SP> map2) {
        map.put(this.A00, this.A01);
    }
}
