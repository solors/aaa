package com.learnings.abcenter.calculate.p400v6.module.rule;

import android.content.Context;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.model.p402v6.AbCondition;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.IRuleMatcher */
/* loaded from: classes6.dex */
public interface IRuleMatcher {
    boolean isRuleMatch(AbCondition.AbConditionGroup.AbConditionRule abConditionRule, AbUserTagData abUserTagData, Context context);
}
