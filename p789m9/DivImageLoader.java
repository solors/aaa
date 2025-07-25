package p789m9;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* renamed from: m9.d */
/* loaded from: classes8.dex */
public interface DivImageLoader {
    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    default LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    default LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImageBytes(str, divImageDownloadCallback);
    }
}
