package p734j1;

import androidx.annotation.FloatRange;
import java.io.Serializable;

/* renamed from: j1.d */
/* loaded from: classes3.dex */
public interface InterfaceC37249d extends Serializable {
    void onVideoCompleted();

    void onVideoFirstQuartile();

    void onVideoMidpoint();

    void onVideoPaused();

    void onVideoResumed();

    void onVideoSkipped();

    void onVideoStarted(float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2);

    void onVideoThirdQuartile();

    void onVideoVolumeChanged(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);
}
