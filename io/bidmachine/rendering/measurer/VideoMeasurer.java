package io.bidmachine.rendering.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.model.Error;

/* loaded from: classes9.dex */
public interface VideoMeasurer extends Measurer<View> {
    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void destroy(@Nullable Runnable runnable);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onClicked();

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onError(@NonNull Error error);

    void onMediaCompleted();

    void onMediaFirstQuartile();

    void onMediaMidpoint();

    void onMediaPaused();

    void onMediaResumed();

    void onMediaSkipped();

    void onMediaStarted(float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2);

    void onMediaThirdQuartile();

    void onMediaVolumeChanged(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onShown();

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    /* synthetic */ void onViewAddedToContainer(@NonNull View view, @NonNull ViewGroup viewGroup);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onViewCreated(@NonNull View view);

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    /* synthetic */ void onViewReady(@NonNull View view);
}
