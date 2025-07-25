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

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.DeviceResolutionCompare */
/* loaded from: classes6.dex */
public class DeviceResolutionCompare extends AbsAreaCompare {
    public DeviceResolutionCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new LivingDayCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        String deviceResolution = getAbUserTagData().getDeviceResolution();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getDeviceResolution())) {
            deviceResolution = AbCenterDebugUtil.getDeviceResolution();
        }
        List<String> deviceResolutionType = abParamsBoundary.getDeviceResolutionType();
        if (isListEmpty(deviceResolutionType)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        for (String str : deviceResolutionType) {
            if (equals(deviceResolution, str)) {
                return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
            }
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        int size;
        List<String> deviceResolutionType = abParamsBoundary.getDeviceResolutionType();
        List<String> deviceResolutionType2 = abParamsBoundary2.getDeviceResolutionType();
        int i = Integer.MAX_VALUE;
        if (isListEmpty(deviceResolutionType)) {
            size = Integer.MAX_VALUE;
        } else {
            size = deviceResolutionType.size();
        }
        if (!isListEmpty(deviceResolutionType2)) {
            i = deviceResolutionType2.size();
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
