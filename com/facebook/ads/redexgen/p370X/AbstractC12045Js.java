package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Js */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12045Js implements InterfaceC12579SX {
    public final EnumC12571SP A00;
    public final AbstractC1129579 A01;

    public AbstractC12045Js(AbstractC1129579 abstractC1129579, EnumC12571SP enumC12571SP) {
        this.A01 = abstractC1129579;
        this.A00 = enumC12571SP;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12579SX
    public void A3v(Map<InterfaceC12561SF, EnumC12584Sc> map, Map<SyncModifiableBundle, EnumC12571SP> map2) {
        map2.put(null, this.A00);
    }
}
