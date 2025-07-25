package io.bidmachine.rendering.measurer;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public class CompositeVideoMeasurer extends BaseCompositeMeasurer<VideoMeasurer, View> implements VideoMeasurer {
    public CompositeVideoMeasurer(@NonNull List<VideoMeasurer> list) {
        super(list);
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaCompleted() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaCompleted();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaFirstQuartile() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaFirstQuartile();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaMidpoint() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaMidpoint();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaPaused() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaPaused();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaResumed() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaResumed();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaSkipped() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaSkipped();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaStarted(float f, float f2) {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaStarted(f, f2);
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaThirdQuartile() {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaThirdQuartile();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaVolumeChanged(float f) {
        for (VideoMeasurer videoMeasurer : this.f97813a) {
            videoMeasurer.onMediaVolumeChanged(f);
        }
    }
}
