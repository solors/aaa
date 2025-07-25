package com.smaato.sdk.video.vast.buildlight.compare;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Comparator;

/* loaded from: classes7.dex */
public class MediaFileComparator implements Comparator<MediaFile> {
    @NonNull
    private final BitrateComparator bitrateComparator;
    @NonNull
    private final SizeComparator<MediaFile> sizeComparator;

    public MediaFileComparator(@NonNull SizeComparator<MediaFile> sizeComparator, @NonNull BitrateComparator bitrateComparator) {
        this.sizeComparator = (SizeComparator) Objects.requireNonNull(sizeComparator, "sizeComparator can not be null in MediaFileComparator");
        this.bitrateComparator = (BitrateComparator) Objects.requireNonNull(bitrateComparator, "bitrateComparator cannot be null in MediaFileComparator");
    }

    @Override // java.util.Comparator
    public int compare(@Nullable MediaFile mediaFile, @Nullable MediaFile mediaFile2) {
        int compare = this.sizeComparator.compare(mediaFile, mediaFile2);
        return compare == 0 ? this.bitrateComparator.compare(mediaFile, mediaFile2) : compare;
    }
}
