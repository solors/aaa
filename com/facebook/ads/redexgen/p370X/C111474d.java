package com.facebook.ads.redexgen.p370X;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4d */
/* loaded from: assets/audience_network.dex */
public class C111474d extends Observable<AbstractC111484e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC111484e) this.mObservers.get(size)).A00();
        }
    }
}
