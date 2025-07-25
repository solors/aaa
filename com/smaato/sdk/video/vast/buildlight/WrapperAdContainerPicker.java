package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.C27719Ad;
import com.smaato.sdk.video.vast.model.Wrapper;
import java.util.List;

/* loaded from: classes7.dex */
public class WrapperAdContainerPicker {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public AdContainer<Wrapper> pickWrapperContainer(@NonNull List<C27719Ad> list) {
        if (list.size() == 1) {
            C27719Ad c27719Ad = list.get(0);
            Wrapper wrapper = c27719Ad.wrapper;
            if (wrapper != null) {
                return new AdContainer<>(c27719Ad, wrapper);
            }
            return null;
        }
        for (C27719Ad c27719Ad2 : list) {
            Wrapper wrapper2 = c27719Ad2.wrapper;
            if (wrapper2 != null && c27719Ad2.sequence == null) {
                return new AdContainer<>(c27719Ad2, wrapper2);
            }
        }
        return null;
    }
}
