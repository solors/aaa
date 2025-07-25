package com.p551my.target.common.models.videomotion;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.my.target.common.models.videomotion.VideoMotionData */
/* loaded from: classes7.dex */
public class VideoMotionData {
    @Nullable
    public final Disclaimer disclaimer;
    @NonNull
    public final Header header;
    @NonNull
    public final List<VideoMotionItem> videoMotionItemList;

    public VideoMotionData(@NonNull Header header, @NonNull List<VideoMotionItem> list, @Nullable Disclaimer disclaimer) {
        this.header = header;
        this.videoMotionItemList = list;
        this.disclaimer = disclaimer;
    }

    @NonNull
    public String toString() {
        return "VideoMotionData{header=" + this.header + ", videoMotionItemList=" + this.videoMotionItemList + ", disclaimer=" + this.disclaimer + '}';
    }
}
