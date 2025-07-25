package com.learnings.abcenter.calculate.p400v6.module.rule;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p402v6.AbCondition;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterDebugUtil;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.ListRuleMatcher */
/* loaded from: classes6.dex */
public class ListRuleMatcher extends BaseRuleMatcher {
    public ListRuleMatcher(ConfigChecker configChecker) {
        super(configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p400v6.module.rule.IRuleMatcher
    public boolean isRuleMatch(AbCondition.AbConditionGroup.AbConditionRule abConditionRule, AbUserTagData abUserTagData, Context context) {
        List<String> stringList = getStringList(abConditionRule.getValue());
        if (isListEmpty(stringList)) {
            return false;
        }
        String key = abConditionRule.getKey();
        String tagValue = abUserTagData.getTagValue(key);
        if (equals("country", abConditionRule.getKey())) {
            tagValue = AbCenterUtil.getCountry(context);
        }
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getDebugValue(key))) {
            tagValue = AbCenterDebugUtil.getDebugValue(key);
        }
        String opType = abConditionRule.getOpType();
        opType.hashCode();
        if (!opType.equals(AbCenterConstant.OP_TYPE_NOT_IN)) {
            if (!opType.equals("in")) {
                return false;
            }
            return AbCenterUtil.contains(stringList, tagValue);
        } else if (AbCenterUtil.isInvalidString(tagValue)) {
            return false;
        } else {
            return !AbCenterUtil.contains(stringList, tagValue);
        }
    }
}
