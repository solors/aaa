package com.smaato.sdk.video.vast.vastplayer;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.video.vast.model.MediaFile;

/* loaded from: classes7.dex */
public class VideoViewResizeManager {
    @NonNull
    private final Size mediaFileSize;

    VideoViewResizeManager(@NonNull Size size) {
        this.mediaFileSize = size;
    }

    @NonNull
    public static VideoViewResizeManager create(@NonNull MediaFile mediaFile) {
        int round;
        Float f = mediaFile.width;
        int i = 0;
        if (f == null) {
            round = 0;
        } else {
            round = Math.round(f.floatValue());
        }
        Float f2 = mediaFile.height;
        if (f2 != null) {
            i = Math.round(f2.floatValue());
        }
        if (round == 0 || i == 0) {
            round = 16;
            i = 9;
        }
        return new VideoViewResizeManager(new Size(round, i));
    }

    public void resizeToContainerSizes(@NonNull VideoPlayerView videoPlayerView, int i, int i2, int i3, int i4) {
        boolean z;
        if (i3 != 0 && i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = this.mediaFileSize.width;
        }
        if (!z) {
            i4 = this.mediaFileSize.height;
        }
        float f = i3;
        float f2 = i4;
        float f3 = i;
        float f4 = i2;
        if (f3 / f4 > f / f2) {
            i = Math.round(f * (f4 / f2));
        } else {
            i2 = Math.round(f2 * (f3 / f));
        }
        videoPlayerView.setVideoSize(i, i2);
    }
}
