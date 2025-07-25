package com.meevii.abtest.model;

import android.content.Context;
import android.text.TextUtils;
import com.meevii.abtest.AbTestManager;
import com.meevii.abtest.util.AbUtil;
import java.util.List;

/* loaded from: classes6.dex */
public class AbInitParams {
    private AbTestManager.AbResultCallback abResultCallback;
    private Context context;
    private String defaultConfigFileName;
    private List<String> filterGroupKeyList;
    private boolean isDebug;
    private boolean isDyeing;
    private boolean isShowLog;
    private boolean isUpdateByAccountId = true;
    private String productionId;

    public void checkNecessaryParams() {
        Context context = this.context;
        if (context != null) {
            this.context = context.getApplicationContext();
            if (!TextUtils.isEmpty(this.defaultConfigFileName)) {
                if (!TextUtils.isEmpty(this.productionId)) {
                    if (AbUtil.isApkInRelease(this.context) && this.isDebug) {
                        throw new RuntimeException("Apk is release，But isDebug = true，the correct isDebug must be false");
                    }
                    if (this.abResultCallback != null) {
                        return;
                    }
                    throw new IllegalArgumentException("abResultCallback can not be null");
                }
                throw new IllegalArgumentException("productionId can not be empty or null");
            }
            throw new IllegalArgumentException("defaultConfigFileName can not be empty or null");
        }
        throw new IllegalArgumentException("context can not be null");
    }

    public AbTestManager.AbResultCallback getAbResultCallback() {
        return this.abResultCallback;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDefaultConfigFileName() {
        return this.defaultConfigFileName;
    }

    public List<String> getFilterGroupKeyList() {
        return this.filterGroupKeyList;
    }

    public String getProductionId() {
        return this.productionId;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public boolean isDyeing() {
        return this.isDyeing;
    }

    public boolean isShowLog() {
        return this.isShowLog;
    }

    public boolean isUpdateByAccountId() {
        return this.isUpdateByAccountId;
    }

    public AbInitParams setAbResultCallback(AbTestManager.AbResultCallback abResultCallback) {
        this.abResultCallback = abResultCallback;
        return this;
    }

    public AbInitParams setContext(Context context) {
        this.context = context;
        return this;
    }

    public AbInitParams setDebug(boolean z) {
        this.isDebug = z;
        return this;
    }

    public AbInitParams setDefaultConfigFileName(String str) {
        this.defaultConfigFileName = str;
        return this;
    }

    public AbInitParams setDyeing(boolean z) {
        this.isDyeing = z;
        return this;
    }

    public AbInitParams setFilterGroupKeyList(List<String> list) {
        this.filterGroupKeyList = list;
        return this;
    }

    public AbInitParams setProductionId(String str) {
        this.productionId = str;
        return this;
    }

    public AbInitParams setShowLog(boolean z) {
        this.isShowLog = z;
        return this;
    }

    public AbInitParams setUpdateByAccountId(boolean z) {
        this.isUpdateByAccountId = z;
        return this;
    }
}
