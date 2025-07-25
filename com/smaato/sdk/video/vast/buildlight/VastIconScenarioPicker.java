package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import java.util.List;

/* loaded from: classes7.dex */
public class VastIconScenarioPicker {
    @NonNull
    private final VastIconScenarioMapper vastIconScenarioMapper;

    public VastIconScenarioPicker(@NonNull VastIconScenarioMapper vastIconScenarioMapper) {
        this.vastIconScenarioMapper = (VastIconScenarioMapper) Objects.requireNonNull(vastIconScenarioMapper);
    }

    @Nullable
    public VastIconScenario pickIconScenario(@NonNull Logger logger, @NonNull List<Icon> list, boolean z) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(list);
        VastIconScenario vastIconScenario = null;
        if (list.isEmpty()) {
            return null;
        }
        for (Icon icon : list) {
            if (!icon.staticResources.isEmpty() || !icon.iFrameResources.isEmpty() || !icon.htmlResources.isEmpty()) {
                vastIconScenario = this.vastIconScenarioMapper.mapVastIconScenario(logger, icon, z);
                if (vastIconScenario != null) {
                    break;
                }
            }
        }
        return vastIconScenario;
    }
}
