package com.meevii.abtest.business.result.provider.p540v6.config;

import android.content.Context;
import com.learnings.abcenter.AbCenterHelper;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.model.AbTotalConfig;
import com.learnings.abcenter.model.p402v6.AbResult;
import com.meevii.abtest.model.AbInitParams;
import com.meevii.abtest.util.Constant;
import com.meevii.abtest.util.IOUtil;

/* renamed from: com.meevii.abtest.business.result.provider.v6.config.BaseConfigProcessorV6 */
/* loaded from: classes6.dex */
public class BaseConfigProcessorV6 {
    private final AbCenterHelper mAbCenterHelper;
    private final AbInitParams mAbInitParams;

    public BaseConfigProcessorV6(AbInitParams abInitParams, AbCenterHelper abCenterHelper) {
        this.mAbInitParams = abInitParams;
        this.mAbCenterHelper = abCenterHelper;
    }

    public AbResult calculateAbResult(AbUserTagData abUserTagData) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbCenterHelper getAbCenterHelper() {
        return this.mAbCenterHelper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getAssetsConfigJson() {
        return new AbTotalConfig(IOUtil.loadAbTestFromAssets(getContext(), this.mAbInitParams.getDefaultConfigFileName()), 4).getConfigJsonV6();
    }

    protected Context getContext() {
        return this.mAbInitParams.getContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getLocalConfigJson() {
        return IOUtil.loadAbTestDataFromDisk(getContext(), Constant.DISK_CACHE_FILE_NAME_CONFIG_V6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean saveLocalConfig(String str) {
        return IOUtil.saveAbTestDataToDisk(getContext(), Constant.DISK_CACHE_FILE_NAME_CONFIG_V6, str);
    }

    public AbResult calculateAbResult(AbTotalConfig abTotalConfig, AbUserTagData abUserTagData) {
        return null;
    }
}
