package com.learnings.abcenter.calculate.p399v5.area.compare;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare;
import com.learnings.abcenter.calculate.p399v5.area.IAreaCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.learnings.abcenter.calculate.v5.area.compare.FlowDomainCompare */
/* loaded from: classes6.dex */
public class FlowDomainCompare extends AbsAreaCompare {
    public FlowDomainCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        super(abUserTagData, configChecker);
    }

    public static /* synthetic */ int lambda$mergeFlowDomains$0(AbParamsBoundary.AbFlowDomain abFlowDomain, AbParamsBoundary.AbFlowDomain abFlowDomain2) {
        return Integer.compare(abFlowDomain.getPriority(), abFlowDomain2.getPriority());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.AbsAreaCompare
    protected IAreaCompare getNextPriorityAreaCompare() {
        return new FirstAppVersionCompare(getAbUserTagData(), getConfigChecker());
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean isBoundaryNotMatching(Context context, AbParamsBoundary abParamsBoundary) {
        List<AbParamsBoundary.AbFlowDomain> flowDomains = abParamsBoundary.getFlowDomains();
        if (isListEmpty(flowDomains)) {
            return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
        }
        for (AbParamsBoundary.AbFlowDomain abFlowDomain : flowDomains) {
            if (abFlowDomain != null) {
                String domainTag = abFlowDomain.getDomainTag();
                if (isStringNullOrEmpty(domainTag)) {
                    continue;
                } else {
                    List<String> domainTagValue = abFlowDomain.getDomainTagValue();
                    if (isListEmpty(domainTagValue)) {
                        continue;
                    } else {
                        String calculateMoFlowDomainValue = getAbUserTagData().getCalculateMoFlowDomainValue(domainTag);
                        if (!TextUtils.isEmpty(calculateMoFlowDomainValue) && !domainTagValue.contains(calculateMoFlowDomainValue)) {
                            return true;
                        }
                    }
                }
            }
        }
        return getNextPriorityAreaCompare().isBoundaryNotMatching(context, abParamsBoundary);
    }

    public List<AbParamsBoundary.AbFlowDomain> mergeFlowDomains(List<AbParamsBoundary.AbFlowDomain> list, List<AbParamsBoundary.AbFlowDomain> list2) {
        HashMap hashMap = new HashMap();
        if (!isListEmpty(list)) {
            for (AbParamsBoundary.AbFlowDomain abFlowDomain : list) {
                if (abFlowDomain != null) {
                    String domainTag = abFlowDomain.getDomainTag();
                    if (!isStringNullOrEmpty(domainTag)) {
                        hashMap.put(domainTag, abFlowDomain);
                    }
                }
            }
        }
        if (!isListEmpty(list2)) {
            for (AbParamsBoundary.AbFlowDomain abFlowDomain2 : list2) {
                if (abFlowDomain2 != null) {
                    String domainTag2 = abFlowDomain2.getDomainTag();
                    if (!isStringNullOrEmpty(domainTag2)) {
                        hashMap.put(domainTag2, abFlowDomain2);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        Collections.sort(arrayList, new Comparator() { // from class: com.learnings.abcenter.calculate.v5.area.compare.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$mergeFlowDomains$0;
                lambda$mergeFlowDomains$0 = FlowDomainCompare.lambda$mergeFlowDomains$0((AbParamsBoundary.AbFlowDomain) obj, (AbParamsBoundary.AbFlowDomain) obj2);
                return lambda$mergeFlowDomains$0;
            }
        });
        return arrayList;
    }

    @Override // com.learnings.abcenter.calculate.p399v5.area.IAreaCompare
    public boolean switchBoundary(AbParamsBoundary abParamsBoundary, AbParamsBoundary abParamsBoundary2) {
        Map<String, AbParamsBoundary.AbFlowDomain> abFlowDomainMap = abParamsBoundary.getAbFlowDomainMap();
        Map<String, AbParamsBoundary.AbFlowDomain> abFlowDomainMap2 = abParamsBoundary2.getAbFlowDomainMap();
        for (AbParamsBoundary.AbFlowDomain abFlowDomain : mergeFlowDomains(abParamsBoundary.getFlowDomains(), abParamsBoundary2.getFlowDomains())) {
            AbParamsBoundary.AbFlowDomain abFlowDomain2 = abFlowDomainMap.get(abFlowDomain.getDomainTag());
            AbParamsBoundary.AbFlowDomain abFlowDomain3 = abFlowDomainMap2.get(abFlowDomain.getDomainTag());
            if (abFlowDomain2 != null && abFlowDomain3 != null) {
                if (abFlowDomain2.getDomainTagValueSize() != abFlowDomain3.getDomainTagValueSize()) {
                    if (abFlowDomain2.getDomainTagValueSize() < abFlowDomain3.getDomainTagValueSize()) {
                        return true;
                    }
                    return false;
                }
            } else if (abFlowDomain2 == null && abFlowDomain3 != null) {
                return false;
            } else {
                if (abFlowDomain2 != null && abFlowDomain3 == null) {
                    return true;
                }
            }
        }
        return getNextPriorityAreaCompare().switchBoundary(abParamsBoundary, abParamsBoundary2);
    }
}
