package com.learnings.abcenter.calculate;

import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.model.p401v5.AbConfigV5;
import com.learnings.abcenter.model.p401v5.AbFinalData;
import com.learnings.abcenter.model.p402v6.AbConfigV6;
import com.learnings.abcenter.model.p402v6.AbResult;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IAbCalculator {
    AbFinalData calculateAbResult(AbConfigV5 abConfigV5, AbUserTagData abUserTagData);

    AbFinalData calculateAbResult(AbConfigV5 abConfigV5, AbUserTagData abUserTagData, Map<String, String> map);

    AbFinalData calculateAbResult(AbFinalData abFinalData, AbConfigV5 abConfigV5, AbUserTagData abUserTagData);

    AbResult calculateAbResult(AbConfigV6 abConfigV6, AbUserTagData abUserTagData);

    Map<String, String> calculateFlowDomain(AbConfigV5 abConfigV5, AbUserTagData abUserTagData);

    void markKeepHittingDyeing(String str, String str2);
}
