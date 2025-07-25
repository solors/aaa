package com.learnings.unity.abtest;

import java.util.List;

/* loaded from: classes6.dex */
public class AbTestSettings {
    private String defaultConfigFileName;
    private List<String> filterGroupKeyList;
    private boolean isDebug;
    private boolean isDyeing;
    private boolean isShowLog;
    private boolean isUpdateByAccountId = true;
    private String productionId;

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

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public void setDefaultConfigFileName(String str) {
        this.defaultConfigFileName = str;
    }

    public void setDyeing(boolean z) {
        this.isDyeing = z;
    }

    public void setFilterGroupKeyList(List<String> list) {
        this.filterGroupKeyList = list;
    }

    public void setProductionId(String str) {
        this.productionId = str;
    }

    public void setShowLog(boolean z) {
        this.isShowLog = z;
    }

    public void setUpdateByAccountId(boolean z) {
        this.isUpdateByAccountId = z;
    }
}
