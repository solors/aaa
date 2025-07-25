package com.meevii.adsdk.core.config.model;

import android.text.TextUtils;
import com.learnings.abcenter.model.p401v5.AbFinalData;
import com.meevii.adsdk.common.Platform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class AdConfigResult {
    private static final Set<String> sAllTagSet = new HashSet();
    private String allStrategy;
    private String allTag;
    private Map<String, String> flowDomainData;
    private String mediation;
    private List<NetworkConfig> networkConfig;
    private List<StrategyResult> strategyResultList;
    private long versionCode;

    /* loaded from: classes6.dex */
    public static class StrategyResult {
        private Plan plan;
        private String planId;
        private String strategyId;

        public Plan getPlan() {
            return this.plan;
        }

        public String getPlanId() {
            return this.planId;
        }

        public String getStrategyId() {
            return this.strategyId;
        }

        public void setPlan(Plan plan) {
            this.plan = plan;
        }

        public void setPlanId(String str) {
            this.planId = str;
        }

        public void setStrategyId(String str) {
            this.strategyId = str;
        }
    }

    public static AdConfigResult generate(AdConfig adConfig, AbFinalData abFinalData, Map<String, StrategyResult> map, Map<String, String> map2) {
        AdConfigResult adConfigResult = new AdConfigResult();
        adConfigResult.setNetworkConfig(adConfig.getNetworkConfigList());
        adConfigResult.setVersionCode(adConfig.getVersionCode());
        adConfigResult.setAllTag(abFinalData);
        adConfigResult.setStrategyResultList(new ArrayList(map.values()));
        adConfigResult.setFlowDomainData(map2);
        return adConfigResult;
    }

    public String getAllStrategy() {
        if (TextUtils.isEmpty(this.allStrategy)) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < this.strategyResultList.size(); i++) {
                if (i > 0) {
                    sb2.append(",");
                }
                sb2.append(this.strategyResultList.get(i).getStrategyId());
            }
            this.allStrategy = sb2.toString();
        }
        return this.allStrategy;
    }

    public String getAllTag() {
        return this.allTag;
    }

    public Map<String, String> getFlowDomainData() {
        return this.flowDomainData;
    }

    public String getMediation() {
        if (TextUtils.isEmpty(this.mediation)) {
            HashSet hashSet = new HashSet();
            for (StrategyResult strategyResult : this.strategyResultList) {
                for (OptionAdUnit optionAdUnit : strategyResult.getPlan().getOptionAdUnits()) {
                    hashSet.add(optionAdUnit.getRequestNetwork());
                }
            }
            String str = "inhouse";
            if (hashSet.size() == 1) {
                if (hashSet.contains(Platform.APPLOVINMAX.getName())) {
                    str = "max";
                }
                this.mediation = str;
            } else {
                this.mediation = "inhouse";
            }
        }
        return this.mediation;
    }

    public List<NetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }

    public List<StrategyResult> getStrategyResultList() {
        return this.strategyResultList;
    }

    public long getVersionCode() {
        return this.versionCode;
    }

    public void setAllTag(AbFinalData abFinalData) {
        Map<String, List<String>> abTestTagConf = abFinalData.getAbTestTagConf();
        if (abTestTagConf != null && !abTestTagConf.isEmpty()) {
            sAllTagSet.addAll(abTestTagConf.keySet());
        }
        Set<String> emptyTestTagConf = abFinalData.getEmptyTestTagConf();
        if (emptyTestTagConf != null && !emptyTestTagConf.isEmpty()) {
            sAllTagSet.addAll(emptyTestTagConf);
        }
        ArrayList<String> arrayList = new ArrayList(sAllTagSet);
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            sb2.append(str);
        }
        this.allTag = sb2.toString();
    }

    public void setFlowDomainData(Map<String, String> map) {
        this.flowDomainData = map;
    }

    public void setNetworkConfig(List<NetworkConfig> list) {
        this.networkConfig = list;
    }

    public void setStrategyResultList(List<StrategyResult> list) {
        this.strategyResultList = list;
    }

    public void setVersionCode(long j) {
        this.versionCode = j;
    }
}
