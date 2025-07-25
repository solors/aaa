package io.bidmachine.rendering.measurer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes9.dex */
public interface MeasurerFactory {
    @Nullable
    HtmlMeasurer createHtmlMeasurer(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map);

    @Nullable
    VideoMeasurer createVideoMeasurer(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map);
}
