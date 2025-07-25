package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.ViewableImpression;

/* loaded from: classes7.dex */
public class ViewableImpressionMerger {
    @Nullable
    public ViewableImpression merge(@Nullable ViewableImpression viewableImpression, @Nullable ViewableImpression viewableImpression2) {
        if (viewableImpression == null) {
            return viewableImpression2;
        }
        if (viewableImpression2 == null) {
            return viewableImpression;
        }
        return new ViewableImpression.Builder().setId(viewableImpression.f72495id).setViewable(VastScenarioMergeUtils.merge(viewableImpression.viewable, viewableImpression2.viewable)).setNotViewable(VastScenarioMergeUtils.merge(viewableImpression.notViewable, viewableImpression2.notViewable)).setViewUndetermined(VastScenarioMergeUtils.merge(viewableImpression.viewUndetermined, viewableImpression2.viewUndetermined)).build();
    }
}
