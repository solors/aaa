package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.AdIdentifyCompare */
/* loaded from: classes6.dex */
public class AdIdentifyCompare extends AbsAreaCompare {
    public AdIdentifyCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new UserTagCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        if (!TextUtils.isEmpty(abParamsBoundary.getHasAdIdentify()) && !equals("all", abParamsBoundary.getHasAdIdentify())) {
            String hasAdIdentify = getAbUserTagData().getHasAdIdentify();
            if (!TextUtils.isEmpty(AbCenterDebugUtil.getHasAdIdentify())) {
                hasAdIdentify = AbCenterDebugUtil.getHasAdIdentify();
            }
            if (equals(abParamsBoundary.getHasAdIdentify(), hasAdIdentify)) {
                return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
            }
            return true;
        }
        return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        boolean z;
        boolean z2;
        String hasAdIdentify = abParamsBoundary.getHasAdIdentify();
        String hasAdIdentify2 = abParamsBoundary2.getHasAdIdentify();
        if (!equals("all", hasAdIdentify) && !TextUtils.isEmpty(hasAdIdentify)) {
            z = false;
        } else {
            z = true;
        }
        if (!equals("all", hasAdIdentify2) && !TextUtils.isEmpty(hasAdIdentify2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (z) {
            return false;
        }
        if (z2) {
            return true;
        }
        return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
    }
}
