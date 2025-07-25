package com.meevii.abtest.business.result.provider;

import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.model.AbTotalConfig;
import com.learnings.abcenter.model.p402v6.AbResult;

/* loaded from: classes6.dex */
public interface IAbResultProvider {
    AbResult init(AbUserTagData abUserTagData);

    AbResult onGroupIdChange(AbUserTagData abUserTagData);

    AbResult onRemoteConfigChange(AbTotalConfig abTotalConfig, AbUserTagData abUserTagData);

    AbResult onUserTagChange(AbUserTagData abUserTagData);
}
