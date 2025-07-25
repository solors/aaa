package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.learnings.abcenter.model.v6.AbResult */
/* loaded from: classes6.dex */
public class AbResult {
    private Map<String, AbResultData> allDataMap;
    private Set<String> emptyExpTagSet;
    private List<AbFlowDomainResult> flowDomainResultList;
    private long versionCode;

    /* renamed from: com.learnings.abcenter.model.v6.AbResult$AbFlowDomainResult */
    /* loaded from: classes6.dex */
    public static class AbFlowDomainResult {
        private List<AbFlowDomainData> abFlowDomainDataList;

        /* renamed from: com.learnings.abcenter.model.v6.AbResult$AbFlowDomainResult$AbFlowDomainData */
        /* loaded from: classes6.dex */
        public static class AbFlowDomainData {
            private String domainTag;
            private String domainValue;

            /* renamed from: id */
            private String f54852id;

            public String getDomainTag() {
                return this.domainTag;
            }

            public String getDomainValue() {
                return this.domainValue;
            }

            public String getId() {
                return this.f54852id;
            }

            public void setDomainTag(String str) {
                this.domainTag = str;
            }

            public void setDomainValue(String str) {
                this.domainValue = str;
            }

            public void setId(String str) {
                this.f54852id = str;
            }

            public String toString() {
                return "{id='" + this.f54852id + "', domainTag='" + this.domainTag + "', domainValue='" + this.domainValue + "'}";
            }
        }

        public void addAbFlowDomainData(AbFlowDomainData abFlowDomainData) {
            getAbFlowDomainDataList().add(abFlowDomainData);
        }

        public List<AbFlowDomainData> getAbFlowDomainDataList() {
            if (this.abFlowDomainDataList == null) {
                this.abFlowDomainDataList = new ArrayList();
            }
            return this.abFlowDomainDataList;
        }

        public String getRootAbFlowDomainTag() {
            try {
                return getAbFlowDomainDataList().get(0).getDomainTag();
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean isEmpty() {
            return CheckUtil.isListNullOrEmpty(getAbFlowDomainDataList());
        }
    }

    /* renamed from: com.learnings.abcenter.model.v6.AbResult$AbGroupStatus */
    /* loaded from: classes6.dex */
    public enum AbGroupStatus {
        VALID,
        INVALID,
        UNKNOWN
    }

    /* renamed from: com.learnings.abcenter.model.v6.AbResult$AbResultData */
    /* loaded from: classes6.dex */
    public static class AbResultData {
        private String dyeingTime;
        private AbGroupStatus groupStatus;
        private String key;
        private String tag;
        private AbResultType type;
        private Object value;

        public String getDyeingTime() {
            return this.dyeingTime;
        }

        public AbGroupStatus getGroupStatus() {
            return this.groupStatus;
        }

        public String getKey() {
            return this.key;
        }

        public String getTag() {
            return this.tag;
        }

        public AbResultType getType() {
            return this.type;
        }

        public Object getValue() {
            return this.value;
        }

        public void setDyeingTime(String str) {
            this.dyeingTime = str;
        }

        public void setGroupStatus(AbGroupStatus abGroupStatus) {
            this.groupStatus = abGroupStatus;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setType(AbResultType abResultType) {
            this.type = abResultType;
        }

        public void setValue(Object obj) {
            this.value = obj;
        }

        public String toString() {
            return "{key='" + this.key + "', type=" + this.type + ", value=" + this.value + ", tag='" + this.tag + "', groupStatus=" + this.groupStatus + ", dyeingTime='" + this.dyeingTime + "'}";
        }
    }

    /* renamed from: com.learnings.abcenter.model.v6.AbResult$AbResultType */
    /* loaded from: classes6.dex */
    public enum AbResultType {
        EXP,
        STRATEGY
    }

    public Map<String, AbResultData> getAllDataMap() {
        if (this.allDataMap == null) {
            this.allDataMap = new HashMap();
        }
        return this.allDataMap;
    }

    public Set<String> getEmptyExpTagSet() {
        if (this.emptyExpTagSet == null) {
            this.emptyExpTagSet = new TreeSet();
        }
        return this.emptyExpTagSet;
    }

    public List<AbFlowDomainResult> getFlowDomainResultList() {
        if (this.flowDomainResultList == null) {
            this.flowDomainResultList = new ArrayList();
        }
        return this.flowDomainResultList;
    }

    public String getFlowDomainResultListString() {
        ArrayList arrayList = new ArrayList();
        for (AbFlowDomainResult abFlowDomainResult : getFlowDomainResultList()) {
            if (abFlowDomainResult != null && !abFlowDomainResult.isEmpty()) {
                for (AbFlowDomainResult.AbFlowDomainData abFlowDomainData : abFlowDomainResult.getAbFlowDomainDataList()) {
                    if (abFlowDomainData != null) {
                        arrayList.add(abFlowDomainData.toString());
                    }
                }
            }
        }
        return arrayList.toString();
    }

    public long getVersionCode() {
        return this.versionCode;
    }

    public void setAllDataMap(Map<String, AbResultData> map) {
        this.allDataMap = map;
    }

    public void setEmptyExpTagSet(Set<String> set) {
        this.emptyExpTagSet = set;
    }

    public void setFlowDomainResultList(List<AbFlowDomainResult> list) {
        this.flowDomainResultList = list;
    }

    public void setVersionCode(long j) {
        this.versionCode = j;
    }
}
