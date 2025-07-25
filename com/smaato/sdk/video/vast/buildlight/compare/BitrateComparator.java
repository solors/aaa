package com.smaato.sdk.video.vast.buildlight.compare;

import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Comparator;

/* loaded from: classes7.dex */
public class BitrateComparator implements Comparator<MediaFile> {
    private final int desiredBitrate;
    private final boolean isConnectionFast;

    public BitrateComparator(int i, boolean z) {
        this.desiredBitrate = i;
        this.isConnectionFast = z;
    }

    @Override // java.util.Comparator
    public int compare(@Nullable MediaFile mediaFile, @Nullable MediaFile mediaFile2) {
        if ((mediaFile == null) ^ (mediaFile2 == null)) {
            return mediaFile == null ? 1 : -1;
        } else if (mediaFile == null) {
            return 0;
        } else {
            Integer num = mediaFile.bitrate;
            float intValue = num == null ? 0.0f : num.intValue();
            Integer num2 = mediaFile2.bitrate;
            float intValue2 = num2 != null ? num2.intValue() : 0.0f;
            if (this.isConnectionFast) {
                return Float.compare(Math.abs(this.desiredBitrate - intValue), Math.abs(this.desiredBitrate - intValue2));
            }
            return Float.compare(intValue, intValue2);
        }
    }
}
