package com.facebook.ads.redexgen.p370X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.RZ */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC12519RZ implements View.OnTouchListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC12145LX A00;

    public View$OnTouchListenerC12519RZ(TextureView$SurfaceTextureListenerC12145LX textureView$SurfaceTextureListenerC12145LX) {
        this.A00 = textureView$SurfaceTextureListenerC12145LX;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MediaController mediaController;
        MediaController mediaController2;
        MediaController mediaController3;
        MediaController mediaController4;
        mediaController = this.A00.A09;
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A09;
            if (mediaController2.isShowing()) {
                mediaController4 = this.A00.A09;
                mediaController4.hide();
            } else {
                mediaController3 = this.A00.A09;
                mediaController3.show();
            }
        }
        return true;
    }
}
