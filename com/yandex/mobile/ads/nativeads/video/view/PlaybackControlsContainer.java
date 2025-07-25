package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.C29880R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.bt0
    @Nullable
    public TextView getCountDownProgress() {
        View findViewById = findViewById(C29880R.C29884id.video_count_down_control);
        if (findViewById instanceof TextView) {
            return (TextView) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.bt0
    @Nullable
    public CheckBox getMuteControl() {
        View findViewById = findViewById(C29880R.C29884id.video_mute_control);
        if (findViewById instanceof CheckBox) {
            return (CheckBox) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, com.yandex.mobile.ads.impl.bt0
    @Nullable
    public ProgressBar getVideoProgress() {
        View findViewById = findViewById(C29880R.C29884id.video_progress_control);
        if (findViewById instanceof ProgressBar) {
            return (ProgressBar) findViewById;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
