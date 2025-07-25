package com.learnings.abcenter.calculate.p400v6.module.rule;

import com.learnings.abcenter.check.ConfigChecker;
import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.learnings.abcenter.calculate.v6.module.rule.BaseRuleMatcher */
/* loaded from: classes6.dex */
public abstract class BaseRuleMatcher implements IRuleMatcher {
    private final ConfigChecker mConfigChecker;

    public BaseRuleMatcher(ConfigChecker configChecker) {
        this.mConfigChecker = configChecker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean contains(String str, String str2) {
        return AbCenterUtil.contains(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean equals(String str, String str2) {
        return AbCenterUtil.equals(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<?> getList(Object obj) {
        try {
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> getStringList(Object obj) {
        try {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(String.valueOf(obj2));
                }
                return arrayList;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isListEmpty(List<?> list) {
        return CheckUtil.isListNullOrEmpty(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isNull(Object obj) {
        return this.mConfigChecker.checkNull(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isStringNullOrEmpty(String str) {
        return this.mConfigChecker.checkStringNullOrEmpty(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double parseEndValueDouble(List<?> list) {
        return this.mConfigChecker.checkParseEndValueDouble(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long parseEndValueVersionLong(List<?> list) {
        return this.mConfigChecker.checkParseEndValueVersionLong(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double parseStartValueDouble(List<?> list) {
        return this.mConfigChecker.checkParseStartValueDouble(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long parseStartValueVersionLong(List<?> list) {
        return this.mConfigChecker.checkParseStartValueVersionLong(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double string2Double(String str) {
        return this.mConfigChecker.checkString2Double(str);
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
