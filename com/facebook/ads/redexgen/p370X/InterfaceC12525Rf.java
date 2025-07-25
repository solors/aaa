package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rf */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC12525Rf {
    void A8o();

    boolean A90();

    boolean A91();

    boolean A9a();

    void AEN(boolean z, int i);

    void AGo(int i);

    void AGt(EnumC12476Qs enumC12476Qs, int i);

    void AH1(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC12476Qs getStartReason();

    EnumC12527Rh getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC12528Ri interfaceC12528Ri);

    void setup(Uri uri);
}
