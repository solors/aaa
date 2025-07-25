package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1l */
/* loaded from: assets/audience_network.dex */
public class C109721l extends C110232a {
    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final C110933k A08(View view, C110933k c110933k) {
        WindowInsets result = (WindowInsets) C110933k.A01(c110933k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C110933k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final C110933k A09(View view, C110933k c110933k) {
        WindowInsets result = (WindowInsets) C110933k.A01(c110933k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C110933k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.p370X.C110763S
    public final void A0F(View view, final InterfaceC110613D interfaceC110613D) {
        if (interfaceC110613D == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C110933k compatInsets = interfaceC110613D.ABA(view2, C110933k.A00(windowInsets));
                    return (WindowInsets) C110933k.A01(compatInsets);
                }
            });
        }
    }
}
