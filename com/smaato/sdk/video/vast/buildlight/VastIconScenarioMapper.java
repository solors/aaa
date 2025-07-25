package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;

/* loaded from: classes7.dex */
public class VastIconScenarioMapper {
    @Nullable
    public VastIconScenario mapVastIconScenario(@NonNull Logger logger, @NonNull Icon icon, boolean z) {
        StaticResource staticResource;
        String str;
        String str2;
        Objects.requireNonNull(logger);
        try {
            VastScenarioResourceData.Builder builder = new VastScenarioResourceData.Builder();
            if (icon.staticResources.isEmpty()) {
                staticResource = null;
            } else {
                staticResource = icon.staticResources.get(0);
            }
            VastScenarioResourceData.Builder staticResource2 = builder.setStaticResource(staticResource);
            if (icon.htmlResources.isEmpty()) {
                str = null;
            } else {
                str = icon.htmlResources.get(0);
            }
            VastScenarioResourceData.Builder htmlResources = staticResource2.setHtmlResources(str);
            if (icon.iFrameResources.isEmpty()) {
                str2 = null;
            } else {
                str2 = icon.iFrameResources.get(0);
            }
            VastScenarioResourceData build = htmlResources.setIFrameResources(str2).build(z);
            long convertDurationStringToMilliseconds = VastVideoPlayerTimeConverterUtils.convertDurationStringToMilliseconds(icon.duration, logger);
            return new VastIconScenario.Builder().setVastScenarioResourceData(build).setIconClicks(icon.iconClicks).setIconViewTrackings(icon.iconViewTrackings).setWidth(icon.width).setHeight(icon.height).setXPosition(icon.xPosition).setYPosition(icon.yPosition).setPxRatio(icon.pxRatio).setOffset(VastVideoPlayerTimeConverterUtils.convertOffsetStringToMilliseconds(icon.offset, convertDurationStringToMilliseconds, logger)).setProgram(icon.program).setApiFramework(icon.apiFramework).setDuration(convertDurationStringToMilliseconds).build();
        } catch (VastElementMissingException e) {
            logger.error(LogDomain.VAST, e, "Cannot build VastIconScenario", new Object[0]);
            return null;
        }
    }
}
