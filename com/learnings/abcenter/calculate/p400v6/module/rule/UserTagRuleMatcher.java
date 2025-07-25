package com.learnings.abcenter.calculate.p400v6.module.rule;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p402v6.AbCondition;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.UserTagRuleMatcher */
/* loaded from: classes6.dex */
public class UserTagRuleMatcher extends BaseRuleMatcher {
    public UserTagRuleMatcher(ConfigChecker configChecker) {
        super(configChecker);
    }

    private List<AbCondition.AbConditionGroup.AbConditionRule.AbUserTagRule> getAbUserTagRuleList(AbCondition.AbConditionGroup.AbConditionRule abConditionRule) {
        try {
            return (List) abConditionRule.getValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean isUserTagNotMatching(AbUserTagData abUserTagData, AbCondition.AbConditionGroup.AbConditionRule.AbUserTagRule abUserTagRule) {
        if (isNull(abUserTagRule)) {
            return true;
        }
        String tagId = abUserTagRule.getTagId();
        if (isStringNullOrEmpty(tagId)) {
            return true;
        }
        List<String> tagValueList = abUserTagRule.getTagValueList();
        if (isListEmpty(tagValueList)) {
            return true;
        }
        String tagValue = abUserTagData.getTagValue(tagId);
        List<String> listFromJson = AbCenterUtil.getListFromJson(tagValue);
        String opType = abUserTagRule.getOpType();
        opType.hashCode();
        if (!opType.equals(AbCenterConstant.OP_TYPE_NOT_IN)) {
            if (!opType.equals("in")) {
                return true;
            }
            if (abUserTagRule.isList()) {
                if (listFromJson == null) {
                    return true;
                }
                if (abUserTagRule.isFullMatch()) {
                    return !AbCenterUtil.isListContains(listFromJson, tagValueList);
                }
                return !AbCenterUtil.isListMixed(listFromJson, tagValueList);
            }
            return !tagValueList.contains(tagValue);
        } else if (abUserTagRule.isList()) {
            if (listFromJson == null) {
                return true;
            }
            return AbCenterUtil.isListContains(listFromJson, tagValueList);
        } else if (AbCenterUtil.isInvalidString(tagValue)) {
            return true;
        } else {
            return tagValueList.contains(tagValue);
        }
    }

    @Override // com.learnings.abcenter.calculate.p400v6.module.rule.IRuleMatcher
    public boolean isRuleMatch(AbCondition.AbConditionGroup.AbConditionRule abConditionRule, AbUserTagData abUserTagData, Context context) {
        List<AbCondition.AbConditionGroup.AbConditionRule.AbUserTagRule> abUserTagRuleList = getAbUserTagRuleList(abConditionRule);
        if (isListEmpty(abUserTagRuleList)) {
            return true;
        }
        for (AbCondition.AbConditionGroup.AbConditionRule.AbUserTagRule abUserTagRule : abUserTagRuleList) {
            if (isUserTagNotMatching(abUserTagData, abUserTagRule)) {
                return false;
            }
        }
        return true;
    }
}
