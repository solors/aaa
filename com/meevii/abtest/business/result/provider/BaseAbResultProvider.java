package com.meevii.abtest.business.result.provider;

import android.content.Context;
import com.learnings.abcenter.AbCenterHelper;
import com.meevii.abtest.model.AbInitParams;

/* loaded from: classes6.dex */
public abstract class BaseAbResultProvider implements IAbResultProvider {
    private final AbCenterHelper mAbCenterHelper;
    private final AbInitParams mAbInitParams;

    public BaseAbResultProvider(AbInitParams abInitParams, AbCenterHelper abCenterHelper) {
        this.mAbInitParams = abInitParams;
        this.mAbCenterHelper = abCenterHelper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbCenterHelper getAbCenterHelper() {
        return this.mAbCenterHelper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbInitParams getAbInitParams() {
        return this.mAbInitParams;
    }

    protected Context getContext() {
        return this.mAbInitParams.getContext();
    }
}
