package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.FirstInstallTimeCompare */
/* loaded from: classes6.dex */
public class FirstInstallTimeCompare extends AbsAreaCompare {
    public FirstInstallTimeCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new CountryCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        long firstInstallTime = getAbUserTagData().getFirstInstallTime();
        if (AbCenterDebugUtil.getFirstInstallTime() > 0) {
            firstInstallTime = AbCenterDebugUtil.getFirstInstallTime();
        }
        if (firstInstallTime >= abParamsBoundary.getCreateDt()) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        long createDt = abParamsBoundary.getCreateDt();
        long createDt2 = abParamsBoundary2.getCreateDt();
        if (createDt <= 0) {
            createDt = 0;
        }
        if (createDt2 <= 0) {
            createDt2 = 0;
        }
        int i = (createDt > createDt2 ? 1 : (createDt == createDt2 ? 0 : -1));
        if (i == 0) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
