package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastRawMediaFileScenario;
import java.util.List;

/* loaded from: classes7.dex */
public class VastMediaFileScenarioMerger {
    @NonNull
    private final VideoClicksMerger videoClicksMerger;

    public VastMediaFileScenarioMerger(@NonNull VideoClicksMerger videoClicksMerger) {
        this.videoClicksMerger = (VideoClicksMerger) Objects.requireNonNull(videoClicksMerger, "Parameter videoClicksMerger should not be null for VastMediaFileScenarioMerger::new");
    }

    private boolean validToMerge(@NonNull VastMediaFileScenario vastMediaFileScenario, @NonNull VastRawMediaFileScenario vastRawMediaFileScenario) {
        return validToMerge(vastMediaFileScenario.vastScenarioCreativeData.universalAdId, vastRawMediaFileScenario.vastScenarioCreativeData.universalAdId);
    }

    @NonNull
    public VastMediaFileScenario merge(@NonNull VastMediaFileScenario vastMediaFileScenario, @NonNull List<VastRawMediaFileScenario> list) {
        Objects.requireNonNull(vastMediaFileScenario, "Parameter mediaFileScenario should not be null for VastMediaFileScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperMediaFileScenarios should not be null for VastMediaFileScenarioMerger::merge");
        VastMediaFileScenario vastMediaFileScenario2 = vastMediaFileScenario;
        for (VastRawMediaFileScenario vastRawMediaFileScenario : list) {
            if (validToMerge(vastMediaFileScenario, vastRawMediaFileScenario)) {
                vastMediaFileScenario2 = merge(vastMediaFileScenario2, vastRawMediaFileScenario);
            }
        }
        return vastMediaFileScenario2;
    }

    private boolean validToMerge(@NonNull UniversalAdId universalAdId, @NonNull UniversalAdId universalAdId2) {
        return universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT);
    }

    @NonNull
    private VastMediaFileScenario merge(@NonNull VastMediaFileScenario vastMediaFileScenario, @NonNull VastRawMediaFileScenario vastRawMediaFileScenario) {
        VastMediaFileScenario.Builder trackingEvents = vastMediaFileScenario.newBuilder().setVideoClicks(this.videoClicksMerger.merge(vastMediaFileScenario.videoClicks, vastRawMediaFileScenario.videoClicks)).setTrackingEvents(VastScenarioMergeUtils.merge(vastMediaFileScenario.trackingEvents, vastRawMediaFileScenario.trackingEvents));
        VastIconScenario vastIconScenario = vastMediaFileScenario.vastIconScenario;
        if (vastIconScenario == null) {
            vastIconScenario = vastRawMediaFileScenario.vastIconScenario;
        }
        return trackingEvents.setVastIconScenario(vastIconScenario).build();
    }
}
