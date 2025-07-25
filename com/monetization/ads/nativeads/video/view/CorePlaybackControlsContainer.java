package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.bt0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class CorePlaybackControlsContainer extends FrameLayout implements bt0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public TextView getCountDownProgress() {
        return (TextView) findViewById(C29880R.C29884id.video_count_down_control);
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(C29880R.C29884id.video_mute_control);
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(C29880R.C29884id.video_progress_control);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
