package com.facebook.ads.redexgen.p370X;

import android.hardware.display.DisplayManager;

/* renamed from: com.facebook.ads.redexgen.X.IW */
/* loaded from: assets/audience_network.dex */
public final class C11963IW implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C11965IY A01;

    public C11963IW(C11965IY c11965iy, DisplayManager displayManager) {
        this.A01 = c11965iy;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
