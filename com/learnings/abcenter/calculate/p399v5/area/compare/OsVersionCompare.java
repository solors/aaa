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

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.OsVersionCompare */
/* loaded from: classes6.dex */
public class OsVersionCompare extends AbsAreaCompare {
    public OsVersionCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new AdIdentifyCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        List<String> osVersionRange = abParamsBoundary.getOsVersionRange();
        String osVersion = getAbUserTagData().getOsVersion();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getOsVersion())) {
            osVersion = AbCenterDebugUtil.getOsVersion();
        }
        long string2Long = string2Long(versionName2VersionNum(osVersion));
        long parseStartValueLong = parseStartValueLong(osVersionRange);
        long parseEndValueLong = parseEndValueLong(osVersionRange);
        if ((parseStartValueLong >= parseEndValueLong && string2Long == parseEndValueLong) || (string2Long >= parseStartValueLong && string2Long <= parseEndValueLong)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        List<String> osVersionRange = abParamsBoundary.getOsVersionRange();
        long parseStartValueLong = parseStartValueLong(osVersionRange);
        long parseEndValueLong = parseEndValueLong(osVersionRange);
        List<String> osVersionRange2 = abParamsBoundary2.getOsVersionRange();
        long parseStartValueLong2 = parseStartValueLong(osVersionRange2);
        long parseEndValueLong2 = parseEndValueLong(osVersionRange2);
        int i = (parseStartValueLong > parseStartValueLong2 ? 1 : (parseStartValueLong == parseStartValueLong2 ? 0 : -1));
        if (i == 0 && parseEndValueLong == parseEndValueLong2) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (i >= 0 && parseEndValueLong <= parseEndValueLong2) {
            return true;
        }
        if ((parseStartValueLong2 < parseStartValueLong || parseEndValueLong2 > parseEndValueLong) && i < 0) {
            return true;
        }
        return false;
    }
}
