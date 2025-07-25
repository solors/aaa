package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.VersionNumCompare */
/* loaded from: classes6.dex */
public class VersionNumCompare extends AbsAreaCompare {
    public VersionNumCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new FirstInstallTimeCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        String appVersion = getAbUserTagData().getAppVersion();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getAppVersion())) {
            appVersion = AbCenterDebugUtil.getAppVersion();
        }
        if (string2Long(versionName2VersionNum(appVersion)) >= string2Long(abParamsBoundary.getVersionNum())) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        int i = (string2Long(abParamsBoundary.getVersionNum()) > string2Long(abParamsBoundary2.getVersionNum()) ? 1 : (string2Long(abParamsBoundary.getVersionNum()) == string2Long(abParamsBoundary2.getVersionNum()) ? 0 : -1));
        if (i == 0) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
