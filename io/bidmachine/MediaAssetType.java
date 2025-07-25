package io.bidmachine;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public enum MediaAssetType {
    Icon,
    Image,
    Video,
    All;

    public static boolean isAll(@NonNull List<MediaAssetType> list) {
        if (!list.contains(All) && (!list.contains(Icon) || !list.contains(Image) || !list.contains(Video))) {
            return false;
        }
        return true;
    }
}
