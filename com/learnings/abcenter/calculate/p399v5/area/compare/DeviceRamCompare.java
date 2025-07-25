package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterDebugUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.DeviceRamCompare */
/* loaded from: classes6.dex */
public class DeviceRamCompare extends AbsAreaCompare {
    public DeviceRamCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new DeviceResolutionCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        List<Integer> deviceRamTypeRange = abParamsBoundary.getDeviceRamTypeRange();
        double deviceRam = getAbUserTagData().getDeviceRam();
        if (AbCenterDebugUtil.getDeviceRam() > 0.0d) {
            deviceRam = AbCenterDebugUtil.getDeviceRam();
        }
        int parseStartValueInteger = parseStartValueInteger(deviceRamTypeRange);
        int parseEndValueInteger = parseEndValueInteger(deviceRamTypeRange);
        if ((parseStartValueInteger >= parseEndValueInteger && deviceRam == parseEndValueInteger) || (deviceRam > parseStartValueInteger && deviceRam <= parseEndValueInteger)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        List<Integer> deviceRamTypeRange = abParamsBoundary.getDeviceRamTypeRange();
        int parseStartValueInteger = parseStartValueInteger(deviceRamTypeRange);
        int parseEndValueInteger = parseEndValueInteger(deviceRamTypeRange);
        List<Integer> deviceRamTypeRange2 = abParamsBoundary2.getDeviceRamTypeRange();
        int parseStartValueInteger2 = parseStartValueInteger(deviceRamTypeRange2);
        int parseEndValueInteger2 = parseEndValueInteger(deviceRamTypeRange2);
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
