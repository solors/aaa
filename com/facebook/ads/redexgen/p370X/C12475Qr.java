package com.facebook.ads.redexgen.p370X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qr */
/* loaded from: assets/audience_network.dex */
public final class C12475Qr extends ContentObserver {
    public final C12596So A00;

    public C12475Qr(Handler handler, C12596So c12596So) {
        super(handler);
        this.A00 = c12596So;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0e();
    }
}
