package com.learnings.abcenter.calculate.p399v5.area;

import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.List;
import java.util.Map;

/* renamed from: com.learnings.abcenter.calculate.v5.area.AbsAreaCompare */
/* loaded from: classes6.dex */
public abstract class AbsAreaCompare implements IAreaCompare {
    private final AbUserTagData mAbUserTagData;
    private final ConfigChecker mConfigChecker;

    public AbsAreaCompare(AbUserTagData abUserTagData, ConfigChecker configChecker) {
        this.mAbUserTagData = abUserTagData;
        this.mConfigChecker = configChecker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean equals(String str, String str2) {
        return AbCenterUtil.equals(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbUserTagData getAbUserTagData() {
        return this.mAbUserTagData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ConfigChecker getConfigChecker() {
        return this.mConfigChecker;
    }

    protected abstract IAreaCompare getNextPriorityAreaCompare();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isListEmpty(List<?> list) {
        return CheckUtil.isListNullOrEmpty(list);
    }

    protected boolean isMapEmpty(Map<?, ?> map) {
        return CheckUtil.isMapNullOrEmpty(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isStringNullOrEmpty(String str) {
        return this.mConfigChecker.checkStringNullOrEmpty(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int parseEndValueInteger(List<Integer> list) {
        return this.mConfigChecker.checkParseEndValueInteger(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long parseEndValueLong(List<String> list) {
        return this.mConfigChecker.checkParseEndValueLong(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int parseStartValueInteger(List<Integer> list) {
        return this.mConfigChecker.checkParseStartValueInteger(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long parseStartValueLong(List<String> list) {
        return this.mConfigChecker.checkParseStartValueLong(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long string2Long(String str) {
        return this.mConfigChecker.checkString2Long(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String versionName2VersionNum(String str) {
        return AbCenterUtil.versionName2VersionNum(str);
    }
}
