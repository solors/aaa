package com.meevii.abtest.business.result.provider.p540v6.config;

import com.learnings.abcenter.AbCenterHelper;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.model.p402v6.AbConfigV6;
import com.learnings.abcenter.model.p402v6.AbResult;
import com.meevii.abtest.model.AbInitParams;

/* renamed from: com.meevii.abtest.business.result.provider.v6.config.StorageConfigProcessorV6 */
/* loaded from: classes6.dex */
public class StorageConfigProcessorV6 extends BaseConfigProcessorV6 {
    private static final String TAG = "LocalConfigProcessor_V6";

    public StorageConfigProcessorV6(AbInitParams abInitParams, AbCenterHelper abCenterHelper) {
        super(abInitParams, abCenterHelper);
    }

    @Override // com.meevii.abtest.business.result.provider.p540v6.config.BaseConfigProcessorV6
    public AbResult calculateAbResult(AbUserTagData abUserTagData) {
        AbConfigV6 fromJson = AbConfigV6.getFromJson(getLocalConfigJson());
        if (fromJson == null) {
            return null;
        }
        return getAbCenterHelper().calculateAbResult(fromJson, abUserTagData);
    }
}
