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

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.MediaSourceCompare */
/* loaded from: classes6.dex */
public class MediaSourceCompare extends AbsAreaCompare {
    public MediaSourceCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new CampaignIdCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        String mediaSource = getAbUserTagData().getMediaSource();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getMediaSource())) {
            mediaSource = AbCenterDebugUtil.getMediaSource();
        }
        List<String> mediaSource2 = abParamsBoundary.getMediaSource();
        if (isListEmpty(mediaSource2)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        for (String str : mediaSource2) {
            if (equals(mediaSource, str)) {
                return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
            }
        }
        return true;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        int size;
        List<String> mediaSource = abParamsBoundary.getMediaSource();
        List<String> mediaSource2 = abParamsBoundary2.getMediaSource();
        int i = Integer.MAX_VALUE;
        if (isListEmpty(mediaSource)) {
            size = Integer.MAX_VALUE;
        } else {
            size = mediaSource.size();
        }
        if (!isListEmpty(mediaSource2)) {
            i = mediaSource2.size();
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
