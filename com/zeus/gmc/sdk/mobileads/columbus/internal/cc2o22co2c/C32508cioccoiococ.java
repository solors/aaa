package com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.TextureView$SurfaceTextureListenerC32290cicic;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.cioccoiococ */
/* loaded from: classes8.dex */
public class C32508cioccoiococ {
    private static volatile C32508cioccoiococ c2oc2i = null;
    private static final String coi222o222 = "VideoPlayerManager";
    private TextureView$SurfaceTextureListenerC32290cicic coo2iico;

    private C32508cioccoiococ() {
    }

    public static synchronized C32508cioccoiococ coi222o222() {
        C32508cioccoiococ c32508cioccoiococ;
        synchronized (C32508cioccoiococ.class) {
            if (c2oc2i == null) {
                synchronized (C32508cioccoiococ.class) {
                    if (c2oc2i == null) {
                        c2oc2i = new C32508cioccoiococ();
                    }
                }
            }
            c32508cioccoiococ = c2oc2i;
        }
        return c32508cioccoiococ;
    }

    public TextureView$SurfaceTextureListenerC32290cicic coo2iico() {
        return this.coo2iico;
    }

    public void coo2iico(TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic) {
        this.coo2iico = textureView$SurfaceTextureListenerC32290cicic;
    }

    public boolean coo2iico(int i) {
        TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic = this.coo2iico;
        if (textureView$SurfaceTextureListenerC32290cicic != null && textureView$SurfaceTextureListenerC32290cicic.getContext() != null) {
            if (i == 24) {
                coo2iico(true);
            } else if (i == 25) {
                coo2iico(false);
            }
        }
        return false;
    }

    private void coo2iico(boolean z) {
        TextureView$SurfaceTextureListenerC32290cicic textureView$SurfaceTextureListenerC32290cicic = this.coo2iico;
        if (textureView$SurfaceTextureListenerC32290cicic != null) {
            textureView$SurfaceTextureListenerC32290cicic.coo2iico(z);
        }
    }
}
