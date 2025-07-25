package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.UserTagCompare */
/* loaded from: classes6.dex */
public class UserTagCompare extends AbsAreaCompare {
    public UserTagCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    private boolean isUserTagNotMatching(String str, List<String> list, boolean z) {
        String tagValue = getAbUserTagData().getTagValue(str);
        List<String> listFromJson = AbCenterUtil.getListFromJson(tagValue);
        if (listFromJson == null) {
            return !list.contains(tagValue);
        }
        if (z) {
            return !AbCenterUtil.isListContains(listFromJson, list);
        }
        return !AbCenterUtil.isListMixed(listFromJson, list);
    }

    public static /* synthetic */ int lambda$mergeUserTags$0(AbParamsBoundary.AbUserTag abUserTag, AbParamsBoundary.AbUserTag abUserTag2) {
        return Integer.compare(abUserTag.getPriority(), abUserTag2.getPriority());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return null;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        List<AbParamsBoundary.AbUserTag> userTags = abParamsBoundary.getUserTags();
        if (isListEmpty(userTags)) {
            return false;
        }
        for (AbParamsBoundary.AbUserTag abUserTag : userTags) {
            if (abUserTag != null) {
                String tagId = abUserTag.getTagId();
                if (isStringNullOrEmpty(tagId)) {
                    continue;
                } else {
                    List<String> tagValue = abUserTag.getTagValue();
                    if (!isListEmpty(tagValue) && isUserTagNotMatching(tagId, tagValue, abUserTag.IsFullMatch())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<AbParamsBoundary.AbUserTag> mergeUserTags(List<AbParamsBoundary.AbUserTag> list, List<AbParamsBoundary.AbUserTag> list2) {
        HashMap hashMap = new HashMap();
        if (!isListEmpty(list)) {
            for (AbParamsBoundary.AbUserTag abUserTag : list) {
                if (abUserTag != null) {
                    String tagId = abUserTag.getTagId();
                    if (!isStringNullOrEmpty(tagId)) {
                        hashMap.put(tagId, abUserTag);
                    }
                }
            }
        }
        if (!isListEmpty(list2)) {
            for (AbParamsBoundary.AbUserTag abUserTag2 : list2) {
                if (abUserTag2 != null) {
                    String tagId2 = abUserTag2.getTagId();
                    if (!isStringNullOrEmpty(tagId2)) {
                        hashMap.put(tagId2, abUserTag2);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        Collections.sort(arrayList, new Comparator() { // from class: com.learnings.abcenter.calculate.v5.area.compare.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$mergeUserTags$0;
                lambda$mergeUserTags$0 = UserTagCompare.lambda$mergeUserTags$0((AbParamsBoundary.AbUserTag) obj, (AbParamsBoundary.AbUserTag) obj2);
                return lambda$mergeUserTags$0;
            }
        });
        return arrayList;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        Map<String, AbParamsBoundary.AbUserTag> abUserTagMap = abParamsBoundary.getAbUserTagMap();
        Map<String, AbParamsBoundary.AbUserTag> abUserTagMap2 = abParamsBoundary2.getAbUserTagMap();
        for (AbParamsBoundary.AbUserTag abUserTag : mergeUserTags(abParamsBoundary.getUserTags(), abParamsBoundary2.getUserTags())) {
            AbParamsBoundary.AbUserTag abUserTag2 = abUserTagMap.get(abUserTag.getTagId());
            AbParamsBoundary.AbUserTag abUserTag3 = abUserTagMap2.get(abUserTag.getTagId());
            if (abUserTag2 == null && abUserTag3 != null) {
                return false;
            }
            if (abUserTag2 != null && abUserTag3 == null) {
                return true;
            }
            if (abUserTag2 != null) {
                if (abUserTag2.getTagSize() == abUserTag3.getTagSize()) {
                    if (abUserTag2.getFullMath() != abUserTag3.getFullMath()) {
                        return abUserTag2.IsFullMatch();
                    }
                } else if (abUserTag2.IsFullMatch() && abUserTag3.IsFullMatch()) {
                    if (abUserTag2.getTagSize() > abUserTag3.getTagSize()) {
                        return true;
                    }
                    return false;
                } else if (!abUserTag2.IsFullMatch() && !abUserTag3.IsFullMatch()) {
                    if (abUserTag2.getTagSize() < abUserTag3.getTagSize()) {
                        return true;
                    }
                    return false;
                } else {
                    return abUserTag2.IsFullMatch();
                }
            }
        }
        return true;
    }
}
