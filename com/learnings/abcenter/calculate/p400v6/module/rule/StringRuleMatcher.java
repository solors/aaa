package com.learnings.abcenter.calculate.p400v6.module.rule;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p402v6.AbCondition;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterDebugUtil;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.StringRuleMatcher */
/* loaded from: classes6.dex */
public class StringRuleMatcher extends BaseRuleMatcher {
    public StringRuleMatcher(ConfigChecker configChecker) {
        super(configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p400v6.module.rule.IRuleMatcher
    public boolean isRuleMatch(AbCondition.AbConditionGroup.AbConditionRule abConditionRule, AbUserTagData abUserTagData, Context context) {
        String key = abConditionRule.getKey();
        String tagValue = abUserTagData.getTagValue(key);
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getDebugValue(key))) {
            tagValue = AbCenterDebugUtil.getDebugValue(key);
        }
        if (equals("string", abConditionRule.getValueType())) {
            String obj = abConditionRule.getValue().toString();
            String opType = abConditionRule.getOpType();
            opType.hashCode();
            if (!opType.equals(AbCenterConstant.OP_TYPE_LIKE)) {
                if (opType.equals(AbCenterConstant.OP_TYPE_NOT_LIKE)) {
                    return !contains(tagValue, obj);
                }
                return false;
            }
            return contains(tagValue, obj);
        }
        return false;
    }
}
