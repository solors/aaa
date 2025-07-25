package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.CampaignIdCompare */
/* loaded from: classes6.dex */
public class CampaignIdCompare extends AbsAreaCompare {
    public CampaignIdCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new DeviceCategoryCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        String campaignId = getAbUserTagData().getCampaignId();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getCampaignId())) {
            campaignId = AbCenterDebugUtil.getCampaignId();
        }
        List<String> campaignId2 = abParamsBoundary.getCampaignId();
        if (isListEmpty(campaignId2)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        for (String str : campaignId2) {
            if (equals(campaignId, str)) {
                return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
            }
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        int size;
        List<String> campaignId = abParamsBoundary.getCampaignId();
        List<String> campaignId2 = abParamsBoundary2.getCampaignId();
        int i = Integer.MAX_VALUE;
        if (isListEmpty(campaignId)) {
            size = Integer.MAX_VALUE;
        } else {
            size = campaignId.size();
        }
        if (!isListEmpty(campaignId2)) {
            i = campaignId2.size();
        }
        if (size == i) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (size < i) {
            return true;
        }
        return false;
    }
}
