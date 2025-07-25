package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastScenarioMergeUtils {
    private VastScenarioMergeUtils() {
    }

    @NonNull
    public static <T> List<T> merge(@NonNull List<T> list, @NonNull List<T> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
