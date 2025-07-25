package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.List;

/* loaded from: classes7.dex */
public class VastCompanionScenarioMerger {
    private boolean validToMerge(@NonNull VastCompanionScenario vastCompanionScenario, @NonNull VastCompanionScenario vastCompanionScenario2) {
        return validToMerge(vastCompanionScenario.vastScenarioCreativeData.universalAdId, vastCompanionScenario2.vastScenarioCreativeData.universalAdId);
    }

    @NonNull
    public VastCompanionScenario merge(@NonNull VastCompanionScenario vastCompanionScenario, @NonNull List<VastCompanionScenario> list) {
        Objects.requireNonNull(vastCompanionScenario, "Parameter companionScenario should not be null for VastCompanionScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperCompanionScenarios should not be null for VastCompanionScenarioMerger::merge");
        VastCompanionScenario vastCompanionScenario2 = vastCompanionScenario;
        for (VastCompanionScenario vastCompanionScenario3 : list) {
            if (validToMerge(vastCompanionScenario, vastCompanionScenario3)) {
                vastCompanionScenario2 = merge(vastCompanionScenario2, vastCompanionScenario3);
            }
        }
        return vastCompanionScenario2;
    }

    private boolean validToMerge(@NonNull UniversalAdId universalAdId, @NonNull UniversalAdId universalAdId2) {
        return universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT);
    }

    @NonNull
    private VastCompanionScenario merge(@NonNull VastCompanionScenario vastCompanionScenario, @NonNull VastCompanionScenario vastCompanionScenario2) {
        return vastCompanionScenario.newBuilder().setTrackingEvents(VastScenarioMergeUtils.merge(vastCompanionScenario.trackingEvents, vastCompanionScenario2.trackingEvents)).setCompanionClickTrackings(VastScenarioMergeUtils.merge(vastCompanionScenario.companionClickTrackings, vastCompanionScenario2.companionClickTrackings)).setCompanionClickThrough(TextUtils.isEmpty(vastCompanionScenario.companionClickThrough) ? vastCompanionScenario2.companionClickThrough : vastCompanionScenario.companionClickThrough).build();
    }
}
