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

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.DeviceCategoryCompare */
/* loaded from: classes6.dex */
public class DeviceCategoryCompare extends AbsAreaCompare {
    public DeviceCategoryCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new DeviceRamCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        String deviceCategory = getAbUserTagData().getDeviceCategory();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getDeviceCategory())) {
            deviceCategory = AbCenterDebugUtil.getDeviceCategory();
        }
        List<String> deviceCategory2 = abParamsBoundary.getDeviceCategory();
        if (isListEmpty(deviceCategory2)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        for (String str : deviceCategory2) {
            if (equals(deviceCategory, str)) {
                return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
            }
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        int size;
        List<String> deviceCategory = abParamsBoundary.getDeviceCategory();
        List<String> deviceCategory2 = abParamsBoundary2.getDeviceCategory();
        int i = Integer.MAX_VALUE;
        if (isListEmpty(deviceCategory)) {
            size = Integer.MAX_VALUE;
        } else {
            size = deviceCategory.size();
        }
        if (!isListEmpty(deviceCategory2)) {
            i = deviceCategory2.size();
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
