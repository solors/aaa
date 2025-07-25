package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;

/* loaded from: classes7.dex */
public class VastScenarioCreativeDataMapper {
    @NonNull
    public VastScenarioCreativeData mapVastScenarioCreativeData(@NonNull Creative creative) {
        return new VastScenarioCreativeData.Builder().setUniversalAdId(creative.universalAdId).setAdId(creative.adId).setId(creative.f72480id).setApiFramework(creative.apiFramework).setSequence(creative.sequence).build();
    }
}
