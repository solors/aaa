package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5Z */
/* loaded from: assets/audience_network.dex */
public final class C112055Z implements BidderTokenProviderApi {
    public final C112636W A00 = new C112636W();

    public final C112636W A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C112075b.A09(context));
    }
}
