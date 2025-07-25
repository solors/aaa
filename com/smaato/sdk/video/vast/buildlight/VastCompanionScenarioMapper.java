package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;

/* loaded from: classes7.dex */
public class VastCompanionScenarioMapper {
    @Nullable
    public VastCompanionScenario mapVastCompanionScenario(@NonNull Logger logger, @NonNull Companion companion, @NonNull VastScenarioCreativeData vastScenarioCreativeData, boolean z) {
        StaticResource staticResource;
        String str;
        String str2;
        Objects.requireNonNull(logger);
        try {
            VastScenarioResourceData.Builder builder = new VastScenarioResourceData.Builder();
            if (companion.staticResources.isEmpty()) {
                staticResource = null;
            } else {
                staticResource = companion.staticResources.get(0);
            }
            VastScenarioResourceData.Builder staticResource2 = builder.setStaticResource(staticResource);
            if (companion.htmlResources.isEmpty()) {
                str = null;
            } else {
                str = companion.htmlResources.get(0);
            }
            VastScenarioResourceData.Builder htmlResources = staticResource2.setHtmlResources(str);
            if (companion.iFrameResources.isEmpty()) {
                str2 = null;
            } else {
                str2 = companion.iFrameResources.get(0);
            }
            return new VastCompanionScenario.Builder().setVastScenarioResourceData(htmlResources.setIFrameResources(str2).build(z)).setVastScenarioCreativeData(vastScenarioCreativeData).setId(companion.f72477id).setAdParameters(companion.adParameters).setAdSlotID(companion.adSlotID).setAltText(companion.altText).setApiFramework(companion.apiFramework).setWidth(companion.width).setHeight(companion.height).setAssetHeight(companion.assetHeight).setAssetWidth(companion.assetWidth).setExpandedHeight(companion.expandedHeight).setExpandedWidth(companion.expandedWidth).setPxRatio(companion.pxRatio).setTrackingEvents(companion.trackingEvents).setCompanionClickThrough(companion.companionClickThrough).setCompanionClickTrackings(companion.companionClickTrackings).build();
        } catch (VastElementMissingException e) {
            logger.error(LogDomain.VAST, e, "Cannot build VastCompanionScenario", new Object[0]);
            return null;
        }
    }
}
