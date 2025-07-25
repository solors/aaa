package com.learnings.abcenter.model.p401v5;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.bykv.p135vk.openvk.preload.falconx.statistic.StatisticData;
import com.learnings.abcenter.AbCenterHelper;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.p399v5.area.compare.FlowDomainCompare;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.learnings.abcenter.model.v5.AbFinalData */
/* loaded from: classes6.dex */
public class AbFinalData {
    private Map<String, List<String>> abTestTagConf;
    private Map<String, Object> data = new HashMap();
    private Set<String> emptyTestTagConf;
    private long versionCode;

    private static String calculateExpGroupId(AbConfigV5 abConfigV5, String str, String str2, ConfigChecker configChecker) {
        AbLayer abLayer;
        if (!configChecker.checkListNullOrEmpty(abConfigV5.getLayers())) {
            Iterator<AbLayer> it = abConfigV5.getLayers().iterator();
            while (it.hasNext()) {
                abLayer = it.next();
                if (!configChecker.checkNull(abLayer) && !configChecker.checkStringNullOrEmpty(abLayer.getId()) && !configChecker.checkListNullOrEmpty(abLayer.getBuckets()) && !configChecker.checkStringNullOrEmpty(str) && TextUtils.equals(abLayer.getId(), str)) {
                    break;
                }
            }
        }
        abLayer = null;
        if (configChecker.checkNull(abLayer)) {
            return null;
        }
        int calculateIndex = calculateIndex(abLayer.getId(), str2);
        if (configChecker.checkIndexOfBounds(abLayer.getBuckets(), calculateIndex)) {
            return null;
        }
        return abLayer.getBuckets().get(calculateIndex);
    }

    public static Map<String, String> calculateFlowDomain(AbConfigV5 abConfigV5, AbUserTagData abUserTagData, Context context, AbCenterHelper.From from) {
        HashMap hashMap = new HashMap();
        List<AbFlowDomainParam> flowDomainParams = abConfigV5.getFlowDomainParams();
        if (CheckUtil.isListNullOrEmpty(flowDomainParams)) {
            return hashMap;
        }
        ConfigChecker configChecker = new ConfigChecker(abConfigV5.getVersionCode(), from);
        for (AbFlowDomainParam abFlowDomainParam : flowDomainParams) {
            if (!configChecker.checkNull(abFlowDomainParam) && !configChecker.checkStringNullOrEmpty(abFlowDomainParam.getId()) && !configChecker.checkStringNullOrEmpty(abFlowDomainParam.getDomainTag()) && !configChecker.checkListNullOrEmpty(abFlowDomainParam.getBuckets())) {
                String domainTag = abFlowDomainParam.getDomainTag();
                List<String> keepHit = abFlowDomainParam.getKeepHit();
                if (!CheckUtil.isListNullOrEmpty(keepHit)) {
                    String originMoFlowDomainValue = abUserTagData.getOriginMoFlowDomainValue(domainTag);
                    if (keepHit.contains(originMoFlowDomainValue)) {
                        hashMap.put(domainTag, originMoFlowDomainValue);
                    }
                }
                int calculateIndex = calculateIndex(abFlowDomainParam.getId(), AbCenterUtil.getGroupId(context));
                if (!configChecker.checkIndexOfBounds(abFlowDomainParam.getBuckets(), calculateIndex)) {
                    hashMap.put(domainTag, abFlowDomainParam.getBuckets().get(calculateIndex));
                }
            }
        }
        return hashMap;
    }

    private static int calculateIndex(String str, String str2) {
        return new BigInteger(new BigInteger(AbCenterUtil.md5(str + str2).substring(16), 16).toString(10)).mod(new BigInteger(StatisticData.ERROR_CODE_NOT_FOUND, 10)).intValue();
    }

    private static AbExperimentGroup calculateParamsGroup(AbExperiment abExperiment, String str, ConfigChecker configChecker) {
        if (configChecker.checkListNullOrEmpty(abExperiment.getGroupList())) {
            return null;
        }
        for (AbExperimentGroup abExperimentGroup : abExperiment.getGroupList()) {
            if (!configChecker.checkNull(abExperimentGroup) && !configChecker.checkNull(abExperimentGroup.getValue()) && !configChecker.checkStringNullOrEmpty(abExperimentGroup.getTag()) && TextUtils.equals(abExperimentGroup.getTag(), str)) {
                return abExperimentGroup;
            }
        }
        return null;
    }

    public static AbFinalData createFromConfigData(AbConfigV5 abConfigV5, AbUserTagData abUserTagData, Context context, boolean z, AbCenterHelper.From from) {
        String calculateExpGroupId;
        AbParamsBoundary boundary;
        Iterator<AbExperiment> it;
        String groupId = AbCenterUtil.getGroupId(context);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArraySet arraySet = new ArraySet();
        AbFinalData abFinalData = new AbFinalData();
        abFinalData.data = hashMap;
        abFinalData.abTestTagConf = hashMap3;
        abFinalData.emptyTestTagConf = arraySet;
        if (abConfigV5 == null) {
            return abFinalData;
        }
        abFinalData.versionCode = abConfigV5.getVersionCode();
        ConfigChecker configChecker = new ConfigChecker(abConfigV5.getVersionCode(), from);
        if (configChecker.checkListNullOrEmpty(abConfigV5.getExperimentList())) {
            return abFinalData;
        }
        AbKeepHittingData.resetKeepHittingData(context, abConfigV5, from, configChecker);
        Map<String, AbKeepHittingData> keepHittingDataMap = AbKeepHittingData.getKeepHittingDataMap(context, from);
        Iterator<AbExperiment> it2 = abConfigV5.getExperimentList().iterator();
        while (it2.hasNext()) {
            AbExperiment next = it2.next();
            if (!configChecker.checkNull(next) && !configChecker.checkStringNullOrEmpty(next.getKey()) && (boundary = next.getBoundary()) != null) {
                AbKeepHittingData abKeepHittingData = keepHittingDataMap.get(next.getKey());
                if (abKeepHittingData != null && abKeepHittingData.isDyeing()) {
                    if (TextUtils.equals(abKeepHittingData.getExpId(), next.getExpId())) {
                        hashMap2.put(next.getKey(), next);
                    }
                } else {
                    FlowDomainCompare flowDomainCompare = new FlowDomainCompare(abUserTagData, configChecker);
                    if (!flowDomainCompare.isBoundaryNotMatching(context, boundary)) {
                        Map<String, AbKeepHittingData> map = keepHittingDataMap;
                        AbExperiment abExperiment = (AbExperiment) hashMap2.get(next.getKey());
                        if (abExperiment == null) {
                            hashMap2.put(next.getKey(), next);
                            it = it2;
                        } else {
                            it = it2;
                            if (flowDomainCompare.switchBoundary(boundary, abExperiment.getBoundary())) {
                                hashMap2.put(next.getKey(), next);
                            } else {
                                hashMap2.put(next.getKey(), abExperiment);
                            }
                        }
                        keepHittingDataMap = map;
                        it2 = it;
                    }
                }
            }
        }
        ArrayList<AbExperiment> arrayList = new ArrayList(hashMap2.values());
        HashMap hashMap4 = new HashMap();
        for (AbExperiment abExperiment2 : arrayList) {
            if (!abExperiment2.isPublished()) {
                setParamsDefaultValue(abExperiment2, hashMap, configChecker);
            } else {
                if (hashMap4.containsKey(abExperiment2.getLayerId())) {
                    calculateExpGroupId = (String) hashMap4.get(abExperiment2.getLayerId());
                } else {
                    calculateExpGroupId = calculateExpGroupId(abConfigV5, abExperiment2.getLayerId(), groupId, configChecker);
                    if (!configChecker.checkNull(calculateExpGroupId)) {
                        hashMap4.put(abExperiment2.getLayerId(), calculateExpGroupId);
                    }
                }
                AbExperimentGroup calculateParamsGroup = calculateParamsGroup(abExperiment2, calculateExpGroupId, configChecker);
                if (calculateParamsGroup != null) {
                    if (!abExperiment2.isEmpty()) {
                        hashMap.put(abExperiment2.getKey(), calculateParamsGroup.getValue());
                        List list = (List) hashMap3.get(calculateParamsGroup.getTag());
                        if (list == null) {
                            list = new ArrayList();
                            hashMap3.put(calculateParamsGroup.getTag(), list);
                        }
                        if (!list.contains(abExperiment2.getKey())) {
                            list.add(abExperiment2.getKey());
                        }
                        AbKeepHittingData.addKeepHittingData(abExperiment2, calculateParamsGroup.getTag(), context, z, from, configChecker);
                    } else {
                        arraySet.add(calculateParamsGroup.getTag());
                    }
                } else if (!abExperiment2.isEmpty()) {
                    setParamsDefaultValue(abExperiment2, hashMap, configChecker);
                }
            }
        }
        return abFinalData;
    }

    public static AbFinalData getFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (AbFinalData) AbCenterUtil.getGson().fromJson(str, (Class<Object>) AbFinalData.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static AbFinalData mergeAbFinalData(AbFinalData abFinalData, AbFinalData abFinalData2) {
        if (abFinalData == null) {
            return abFinalData2;
        }
        if (abFinalData2 == null) {
            return abFinalData;
        }
        long j = abFinalData.versionCode;
        long j2 = abFinalData2.versionCode;
        if (j > j2) {
            return abFinalData;
        }
        abFinalData.abTestTagConf = abFinalData2.abTestTagConf;
        abFinalData.emptyTestTagConf = abFinalData2.emptyTestTagConf;
        abFinalData.versionCode = j2;
        abFinalData.data.putAll(abFinalData2.data);
        return abFinalData;
    }

    public static AbFinalData mergeFullConfigData(AbFinalData abFinalData, AbConfigV5 abConfigV5, AbUserTagData abUserTagData, Context context, boolean z, AbCenterHelper.From from) {
        if (abConfigV5 == null) {
            return abFinalData;
        }
        return mergeAbFinalData(abFinalData, createFromConfigData(abConfigV5, abUserTagData, context, z, from));
    }

    private static void setParamsDefaultValue(AbExperiment abExperiment, Map<String, Object> map, ConfigChecker configChecker) {
        if (configChecker.checkListNullOrEmpty(abExperiment.getGroupList())) {
            return;
        }
        AbExperimentGroup abExperimentGroup = abExperiment.getGroupList().get(0);
        if (!configChecker.checkNull(abExperimentGroup) && !configChecker.checkNull(abExperimentGroup.getValue())) {
            map.put(abExperiment.getKey(), abExperimentGroup.getValue());
        }
    }

    public Map<String, List<String>> getAbTestTagConf() {
        return this.abTestTagConf;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Set<String> getEmptyTestTagConf() {
        return this.emptyTestTagConf;
    }

    public long getVersionCode() {
        return this.versionCode;
    }

    public String toJson() {
        return AbCenterUtil.getGson().toJson(this);
    }
}
