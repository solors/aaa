package com.smaato.sdk.video.vast.vastplayer.system;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.video.vast.vastplayer.exception.IOVideoPlayerException;
import com.smaato.sdk.video.vast.vastplayer.exception.MalformedVideoPlayerException;
import com.smaato.sdk.video.vast.vastplayer.exception.TimeoutVideoPlayerException;
import com.smaato.sdk.video.vast.vastplayer.exception.UnknownVideoPlayerException;
import com.smaato.sdk.video.vast.vastplayer.exception.UnsupportedVideoPlayerException;
import com.smaato.sdk.video.vast.vastplayer.exception.VideoPlayerException;

/* renamed from: com.smaato.sdk.video.vast.vastplayer.system.a */
/* loaded from: classes7.dex */
final class MetadataMapperUtils {
    @NonNull
    /* renamed from: a */
    private static VideoPlayerException m38535a(@Nullable Integer num) {
        if (num == null) {
            return new UnknownVideoPlayerException();
        }
        int intValue = num.intValue();
        if (intValue != -1010) {
            if (intValue != -1007) {
                if (intValue != -1004) {
                    if (intValue != -110) {
                        return new UnknownVideoPlayerException();
                    }
                    return new TimeoutVideoPlayerException();
                }
                return new IOVideoPlayerException();
            }
            return new MalformedVideoPlayerException();
        }
        return new UnsupportedVideoPlayerException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public static Metadata m38534b(int i, int i2) {
        return new Metadata.Builder().putInt("what", i).putInt("extra", i2).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public static VideoPlayerException m38533c(@Nullable Metadata metadata) {
        Integer num;
        Integer num2 = null;
        if (metadata == null) {
            num = null;
        } else {
            num = metadata.getInt("what");
        }
        if (metadata != null) {
            num2 = metadata.getInt("extra");
        }
        if (num == null) {
            return new UnknownVideoPlayerException();
        }
        if (num.intValue() == 1) {
            return m38535a(num2);
        }
        return new UnknownVideoPlayerException();
    }
}
