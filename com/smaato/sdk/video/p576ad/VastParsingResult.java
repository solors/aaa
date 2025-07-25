package com.smaato.sdk.video.p576ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Set;

/* renamed from: com.smaato.sdk.video.ad.VastParsingResult */
/* loaded from: classes7.dex */
public class VastParsingResult {
    @NonNull
    public final Set<String> errorUrls;
    @NonNull
    public final Set<Integer> errors;
    @Nullable
    public final VastScenario vastScenario;

    public VastParsingResult(@Nullable VastScenario vastScenario, @NonNull Set<Integer> set, @NonNull Set<String> set2) {
        this.vastScenario = vastScenario;
        this.errors = set;
        this.errorUrls = set2;
    }
}
