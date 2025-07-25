package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.utils.RandomUtils;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.b0 */
/* loaded from: classes7.dex */
public final class GenericMacros {
    @NonNull

    /* renamed from: a */
    private final DateFormatUtils f72828a;
    @NonNull

    /* renamed from: b */
    private final RandomUtils f72829b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericMacros(@NonNull DateFormatUtils dateFormatUtils, @NonNull RandomUtils randomUtils) {
        this.f72828a = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils);
        this.f72829b = (RandomUtils) Objects.requireNonNull(randomUtils);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public Map<String, String> m38720a() {
        return Maps.mapOf(Maps.entryOf("[TIMESTAMP]", this.f72828a.currentTimestamp()), Maps.entryOf("[CACHEBUSTING]", this.f72829b.random8DigitNumber()));
    }
}
