package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.C27719Ad;
import java.util.List;

/* loaded from: classes7.dex */
public class InLineChecker {
    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasInLine(@NonNull List<C27719Ad> list) {
        if (list.size() == 1) {
            if (list.get(0).inLine == null) {
                return false;
            }
            return true;
        }
        for (C27719Ad c27719Ad : list) {
            if (c27719Ad.inLine != null && c27719Ad.sequence == null) {
                return true;
            }
        }
        return false;
    }
}
