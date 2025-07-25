package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.AbstractC14492T;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class InneractiveNativeVideoContentController extends AbstractC14492T {

    /* renamed from: a */
    public WeakReference f27364a;

    /* loaded from: classes4.dex */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14481H
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) AbstractC15471s.m76459a(this.f27364a)) != null) {
            ((Renderer) this.f27364a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) AbstractC15471s.m76459a(this.f27364a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f27364a = new WeakReference(renderer);
    }
}
