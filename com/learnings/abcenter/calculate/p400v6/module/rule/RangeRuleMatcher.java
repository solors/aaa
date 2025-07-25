package com.learnings.abcenter.calculate.p400v6.module.rule;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.model.p402v6.AbCondition;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterDebugUtil;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.RangeRuleMatcher */
/* loaded from: classes6.dex */
public class RangeRuleMatcher extends BaseRuleMatcher {
    public RangeRuleMatcher(ConfigChecker configChecker) {
        super(configChecker);
    }

    @Override // com.learnings.abcenter.calculate.p400v6.module.rule.IRuleMatcher
    public boolean isRuleMatch(AbCondition.AbConditionGroup.AbConditionRule abConditionRule, AbUserTagData abUserTagData, Context context) {
        List<?> list = getList(abConditionRule.getValue());
        if (isListEmpty(list)) {
            return false;
        }
        String key = abConditionRule.getKey();
        String tagValue = abUserTagData.getTagValue(key);
        String opType = abConditionRule.getOpType();
        if (!TextUtils.isEmpty(AbCenterDebugUtil.getDebugValue(key))) {
            tagValue = AbCenterDebugUtil.getDebugValue(key);
        }
        if (TextUtils.isEmpty(tagValue)) {
            return false;
        }
        String valueType = abConditionRule.getValueType();
        valueType.hashCode();
        if (valueType.equals(AbCenterConstant.VALUE_TYPE_NUMBER)) {
            return isRuleMatch(opType, parseStartValueDouble(list), parseEndValueDouble(list), string2Double(tagValue));
        }
        if (valueType.equals("version")) {
            return isRuleMatch(opType, parseStartValueVersionLong(list), parseEndValueVersionLong(list), string2Long(versionName2VersionNum(tagValue)));
        }
        return false;
    }

    private boolean isRuleMatch(String str, double d, double d2, double d3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3029889:
                if (str.equals(AbCenterConstant.OP_TYPE_BOTH)) {
                    c = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 1;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 2;
                    break;
                }
                break;
            case 1833230003:
                if (str.equals(AbCenterConstant.OP_TYPE_NEITHER)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return d3 >= d && d3 <= d2;
            case 1:
                return d3 >= d && d3 < d2;
            case 2:
                return d3 > d && d3 <= d2;
            case 3:
                return d3 > d && d3 < d2;
            default:
                return false;
        }
    }
}
