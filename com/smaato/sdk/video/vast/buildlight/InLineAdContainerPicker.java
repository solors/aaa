package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.C27719Ad;
import com.smaato.sdk.video.vast.model.InLine;
import java.util.List;

/* loaded from: classes7.dex */
public class InLineAdContainerPicker {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public AdContainer<InLine> pickInLineContainer(@NonNull List<C27719Ad> list) {
        if (list.size() == 1) {
            C27719Ad c27719Ad = list.get(0);
            InLine inLine = c27719Ad.inLine;
            if (inLine != null) {
                return new AdContainer<>(c27719Ad, inLine);
            }
            return null;
        }
        for (C27719Ad c27719Ad2 : list) {
            InLine inLine2 = c27719Ad2.inLine;
            if (inLine2 != null && c27719Ad2.sequence == null) {
                return new AdContainer<>(c27719Ad2, inLine2);
            }
        }
        return null;
    }
}
