package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.a0 */
/* loaded from: classes7.dex */
public final class ErrorInfoMacros {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public Map<String, String> m38722a(@Nullable Integer num) {
        String valueOf;
        Map.Entry[] entryArr = new Map.Entry[1];
        if (num == null) {
            valueOf = "-2";
        } else {
            valueOf = String.valueOf(num);
        }
        entryArr[0] = Maps.entryOf("[ERRORCODE]", valueOf);
        return Maps.mapOf(entryArr);
    }
}
