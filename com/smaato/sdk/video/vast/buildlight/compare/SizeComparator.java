package com.smaato.sdk.video.vast.buildlight.compare;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings;
import com.smaato.sdk.video.vast.model.Sized;
import java.util.Comparator;

/* loaded from: classes7.dex */
public class SizeComparator<T extends Sized> implements Comparator<T> {
    @NonNull
    private final VastConfigurationSettings configurationSettings;

    public SizeComparator(@NonNull VastConfigurationSettings vastConfigurationSettings) {
        this.configurationSettings = vastConfigurationSettings;
    }

    @Override // java.util.Comparator
    public int compare(@Nullable T t, @Nullable T t2) {
        if (t != null || t2 == null) {
            if (t2 != null || t == null) {
                if (t2 == null) {
                    return 0;
                }
                return Float.compare(Math.abs(this.configurationSettings.displayWidth - (t.getWidth() == null ? 0.0f : t.getWidth().floatValue())) + Math.abs(this.configurationSettings.displayHeight - (t.getHeight() == null ? 0.0f : t.getHeight().floatValue())), Math.abs(this.configurationSettings.displayWidth - (t2.getWidth() == null ? 0.0f : t2.getWidth().floatValue())) + Math.abs(this.configurationSettings.displayHeight - (t2.getHeight() != null ? t2.getHeight().floatValue() : 0.0f)));
            }
            return -1;
        }
        return 1;
    }
}
