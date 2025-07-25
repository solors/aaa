package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.LivingDayCompare */
/* loaded from: classes6.dex */
public class LivingDayCompare extends AbsAreaCompare {
    public LivingDayCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new OsVersionCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        List<Integer> livingDaysRange = abParamsBoundary.getLivingDaysRange();
        int livingDays = getAbUserTagData().getLivingDays();
        if (AbCenterDebugUtil.getLivingDays() > 0) {
            livingDays = AbCenterDebugUtil.getLivingDays();
        }
        int parseStartValueInteger = parseStartValueInteger(livingDaysRange);
        int parseEndValueInteger = parseEndValueInteger(livingDaysRange);
        if ((parseStartValueInteger >= parseEndValueInteger && livingDays == parseEndValueInteger) || (livingDays >= parseStartValueInteger && livingDays <= parseEndValueInteger)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        List<Integer> livingDaysRange = abParamsBoundary.getLivingDaysRange();
        int parseStartValueInteger = parseStartValueInteger(livingDaysRange);
        int parseEndValueInteger = parseEndValueInteger(livingDaysRange);
        List<Integer> livingDaysRange2 = abParamsBoundary2.getLivingDaysRange();
        int parseStartValueInteger2 = parseStartValueInteger(livingDaysRange2);
        int parseEndValueInteger2 = parseEndValueInteger(livingDaysRange2);
        if (parseStartValueInteger == parseStartValueInteger2 && parseEndValueInteger == parseEndValueInteger2) {
            return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
        }
        if (parseStartValueInteger >= parseStartValueInteger2 && parseEndValueInteger <= parseEndValueInteger2) {
            return true;
        }
        if ((parseStartValueInteger2 < parseStartValueInteger || parseEndValueInteger2 > parseEndValueInteger) && parseStartValueInteger < parseStartValueInteger2) {
            return true;
        }
        return false;
    }
}
