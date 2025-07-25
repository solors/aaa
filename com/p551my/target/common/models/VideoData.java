package com.p551my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25730e5;
import com.p551my.target.AbstractC25846ja;
import java.util.List;

/* renamed from: com.my.target.common.models.VideoData */
/* loaded from: classes7.dex */
public final class VideoData extends AbstractC25730e5 {
    public static final String M3U8 = ".m3u8";
    private int bitrate;
    private final boolean cacheable;

    private VideoData(@NonNull String str, int i, int i2) {
        super(str);
        this.width = i;
        this.height = i2;
        this.cacheable = !this.url.endsWith(M3U8);
    }

    @Nullable
    public static VideoData chooseBest(@NonNull List<VideoData> list, int i) {
        VideoData videoData = null;
        int i2 = 0;
        for (VideoData videoData2 : list) {
            int height = videoData2.getHeight();
            if (videoData == null || ((height <= i && i2 > i) || ((height <= i && height > i2) || (height > i && height < i2)))) {
                videoData = videoData2;
                i2 = height;
            }
        }
        AbstractC25846ja.m43680a("VideoData: Accepted videoData quality = " + i2 + "p");
        return videoData;
    }

    @NonNull
    public static VideoData newVideoData(@NonNull String str, int i, int i2) {
        return new VideoData(str, i, i2);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public boolean isCacheable() {
        return this.cacheable;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }
}
