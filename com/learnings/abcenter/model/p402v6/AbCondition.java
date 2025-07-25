package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbCondition */
/* loaded from: classes6.dex */
public class AbCondition {
    private List<AbConditionGroup> conditionGroupList;
    private String conditionGroupType;

    /* renamed from: com.learnings.abcenter.model.v6.AbCondition$AbConditionGroup */
    /* loaded from: classes6.dex */
    public static class AbConditionGroup {
        private List<AbConditionRule> conditionRuleList;
        private String conditionType;

        /* renamed from: com.learnings.abcenter.model.v6.AbCondition$AbConditionGroup$AbConditionRule */
        /* loaded from: classes6.dex */
        public static class AbConditionRule {
            private String key;
            private String opType;
            private String ruleType;
            private Object value;
            private String valueType;

            /* renamed from: com.learnings.abcenter.model.v6.AbCondition$AbConditionGroup$AbConditionRule$AbUserTagRule */
            /* loaded from: classes6.dex */
            public static class AbUserTagRule {
                private boolean isFullMatch;
                private boolean isList;
                private String opType;
                private String tagId;
                private List<String> tagValueList;

                /* JADX INFO: Access modifiers changed from: private */
                public static AbUserTagRule getFromJson(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        return null;
                    }
                    try {
                        AbUserTagRule abUserTagRule = new AbUserTagRule();
                        abUserTagRule.setTagId(AbCenterUtil.optString(jSONObject, "tag_id"));
                        abUserTagRule.setOpType(AbCenterUtil.optString(jSONObject, "op_type"));
                        abUserTagRule.setList(jSONObject.optBoolean("is_list"));
                        abUserTagRule.setFullMatch(jSONObject.optBoolean("is_full_match"));
                        abUserTagRule.setTagValueList(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("tag_values")));
                        return abUserTagRule;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                public String getOpType() {
                    return this.opType;
                }

                public String getTagId() {
                    return this.tagId;
                }

                public List<String> getTagValueList() {
                    return this.tagValueList;
                }

                public boolean isFullMatch() {
                    return this.isFullMatch;
                }

                public boolean isList() {
                    return this.isList;
                }

                public void setFullMatch(boolean z) {
                    this.isFullMatch = z;
                }

                public void setList(boolean z) {
                    this.isList = z;
                }

                public void setOpType(String str) {
                    this.opType = str;
                }

                public void setTagId(String str) {
                    this.tagId = str;
                }

                public void setTagValueList(List<String> list) {
                    this.tagValueList = list;
                }
            }

            private static List<AbUserTagRule> getAbUserTagRuleListFromJson(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(AbUserTagRule.getFromJson(jSONArray.optJSONObject(i)));
                    }
                    return arrayList;
                } catch (Throwable unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static AbConditionRule getFromJson(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    AbConditionRule abConditionRule = new AbConditionRule();
                    abConditionRule.setKey(AbCenterUtil.optString(jSONObject, "key"));
                    abConditionRule.setRuleType(AbCenterUtil.optString(jSONObject, "rule_type"));
                    abConditionRule.setOpType(AbCenterUtil.optString(jSONObject, "op_type"));
                    abConditionRule.setValueType(AbCenterUtil.optString(jSONObject, "value_type"));
                    if (AbCenterUtil.equals(abConditionRule.getValueType(), AbCenterConstant.VALUE_TYPE_USER_TAG)) {
                        abConditionRule.setValue(getAbUserTagRuleListFromJson(jSONObject.optJSONArray("value")));
                    } else {
                        abConditionRule.setValue(AbValue.getValue(jSONObject));
                    }
                    return abConditionRule;
                } catch (Throwable unused) {
                    return null;
                }
            }

            public String getKey() {
                return this.key;
            }

            public String getOpType() {
                return this.opType;
            }

            public String getRuleType() {
                return this.ruleType;
            }

            public Object getValue() {
                return this.value;
            }

            public String getValueType() {
                return this.valueType;
            }

            public void setKey(String str) {
                this.key = str;
            }

            public void setOpType(String str) {
                this.opType = str;
            }

            public void setRuleType(String str) {
                this.ruleType = str;
            }

            public void setValue(Object obj) {
                this.value = obj;
            }

            public void setValueType(String str) {
                this.valueType = str;
            }
        }

        private static List<AbConditionRule> getAbConditionRuleListFromJson(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(AbConditionRule.getFromJson(jSONArray.optJSONObject(i)));
                }
                return arrayList;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AbConditionGroup getFromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                AbConditionGroup abConditionGroup = new AbConditionGroup();
                abConditionGroup.setConditionType(AbCenterUtil.optString(jSONObject, "condition_type"));
                abConditionGroup.setConditionRuleList(getAbConditionRuleListFromJson(jSONObject.optJSONArray("condition_rules")));
                return abConditionGroup;
            } catch (Throwable unused) {
                return null;
            }
        }

        public List<AbConditionRule> getConditionRuleList() {
            return this.conditionRuleList;
        }

        public String getConditionType() {
            return this.conditionType;
        }

        public void setConditionRuleList(List<AbConditionRule> list) {
            this.conditionRuleList = list;
        }

        public void setConditionType(String str) {
            this.conditionType = str;
        }
    }

    private static List<AbConditionGroup> getAbConditionGroupListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbConditionGroup.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbCondition getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbCondition abCondition = new AbCondition();
            abCondition.setConditionGroupType(AbCenterUtil.optString(jSONObject, "condition_group_type"));
            abCondition.setConditionGroupList(getAbConditionGroupListFromJson(jSONObject.optJSONArray("condition_groups")));
            return abCondition;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<AbConditionGroup> getConditionGroupList() {
        return this.conditionGroupList;
    }

    public String getConditionGroupType() {
        return this.conditionGroupType;
    }

    public void setConditionGroupList(List<AbConditionGroup> list) {
        this.conditionGroupList = list;
    }

    public void setConditionGroupType(String str) {
        this.conditionGroupType = str;
    }
}
