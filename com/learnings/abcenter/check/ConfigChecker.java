package com.learnings.abcenter.check;

import android.os.Bundle;
import android.text.TextUtils;
import com.learnings.abcenter.AbCenterHelper;
import com.learnings.abcenter.model.p401v5.AbConfigV5;
import com.learnings.abcenter.model.p401v5.AbExperiment;
import com.learnings.abcenter.model.p402v6.AbConfigV6;
import com.learnings.abcenter.model.p402v6.AbExp;
import com.learnings.abcenter.model.p402v6.AbStrategy;
import com.learnings.abcenter.util.AbCenterAnalyzeUtil;
import com.learnings.abcenter.util.AbCenterLogUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ConfigChecker {
    private static final long MAX_VERSION = 999999999999999L;
    private static final List<Long> sHasSendVersionCodeList = new ArrayList();
    private final AbCenterHelper.From mFrom;
    private long mVersionCode;

    public ConfigChecker(long j, AbCenterHelper.From from) {
        this.mVersionCode = j;
        this.mFrom = from;
    }

    public boolean checkConfig(AbConfigV5 abConfigV5) {
        if (abConfigV5 == null) {
            return true;
        }
        this.mVersionCode = abConfigV5.getVersionCode();
        List<AbExperiment> experimentList = abConfigV5.getExperimentList();
        if (experimentList == null || experimentList.isEmpty()) {
            sendConfigErrorEvent();
            return true;
        }
        return false;
    }

    public boolean checkIndexOfBounds(List<?> list, int i) {
        boolean z = true;
        if (i >= 0 && i <= list.size() - 1) {
            z = false;
        }
        if (z) {
            sendConfigErrorEvent();
        }
        return z;
    }

    public boolean checkListNullOrEmpty(List<?> list) {
        boolean isListNullOrEmpty = CheckUtil.isListNullOrEmpty(list);
        if (isListNullOrEmpty) {
            sendConfigErrorEvent();
        }
        return isListNullOrEmpty;
    }

    public boolean checkMapNullOrEmpty(Map<?, ?> map) {
        boolean isMapNullOrEmpty = CheckUtil.isMapNullOrEmpty(map);
        if (isMapNullOrEmpty) {
            sendConfigErrorEvent();
        }
        return isMapNullOrEmpty;
    }

    public boolean checkNull(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sendConfigErrorEvent();
        }
        return z;
    }

    public double checkParseEndValueDouble(List<?> list) {
        double d;
        Object obj;
        if (list == null) {
            return Double.MAX_VALUE;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            d = Double.MAX_VALUE;
        }
        if (list.isEmpty() || (obj = list.get(1)) == null) {
            return Double.MAX_VALUE;
        }
        d = checkString2Double(obj.toString());
        if (d <= 0.0d) {
            sendConfigErrorEvent();
            return Double.MAX_VALUE;
        }
        return d;
    }

    public int checkParseEndValueInteger(List<Integer> list) {
        int i;
        if (list == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            i = Integer.MAX_VALUE;
        }
        if (list.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        i = list.get(1).intValue();
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public long checkParseEndValueLong(List<String> list) {
        long j;
        if (list == null) {
            return MAX_VERSION;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            j = 999999999999999L;
        }
        if (list.isEmpty()) {
            return MAX_VERSION;
        }
        j = checkString2Long(list.get(1));
        if (j <= 0) {
            return MAX_VERSION;
        }
        return j;
    }

    public long checkParseEndValueVersionLong(List<?> list) {
        long j;
        Object obj;
        if (list == null) {
            return MAX_VERSION;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            j = 999999999999999L;
        }
        if (list.isEmpty() || (obj = list.get(1)) == null) {
            return MAX_VERSION;
        }
        j = checkString2Long(obj.toString());
        if (j <= 0) {
            sendConfigErrorEvent();
            return MAX_VERSION;
        }
        return j;
    }

    public double checkParseStartValueDouble(List<?> list) {
        double d;
        Object obj;
        if (list == null) {
            return 0.0d;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            d = 0.0d;
        }
        if (list.isEmpty() || (obj = list.get(0)) == null) {
            return 0.0d;
        }
        d = checkString2Double(obj.toString());
        if (d < 0.0d) {
            sendConfigErrorEvent();
            return 0.0d;
        }
        return d;
    }

    public int checkParseStartValueInteger(List<Integer> list) {
        int i;
        if (list == null) {
            return 0;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            i = 0;
        }
        if (list.isEmpty()) {
            return 0;
        }
        i = list.get(0).intValue();
        if (i < 0) {
            sendConfigErrorEvent();
            return 0;
        }
        return i;
    }

    public long checkParseStartValueLong(List<String> list) {
        long j;
        if (list == null) {
            return 0L;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            j = 0;
        }
        if (list.isEmpty()) {
            return 0L;
        }
        j = checkString2Long(list.get(0));
        if (j < 0) {
            sendConfigErrorEvent();
            return 0L;
        }
        return j;
    }

    public long checkParseStartValueVersionLong(List<?> list) {
        long j;
        Object obj;
        if (list == null) {
            return 0L;
        }
        try {
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            j = 0;
        }
        if (list.isEmpty() || (obj = list.get(0)) == null) {
            return 0L;
        }
        j = checkString2Long(obj.toString());
        if (j < 0) {
            sendConfigErrorEvent();
            return 0L;
        }
        return j;
    }

    public double checkString2Double(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            return 0.0d;
        }
    }

    public long checkString2Long(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            sendConfigErrorEvent();
            return 0L;
        }
    }

    public boolean checkStringNullOrEmpty(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        if (isEmpty) {
            sendConfigErrorEvent();
        }
        return isEmpty;
    }

    public void sendConfigErrorEvent() {
        List<Long> list = sHasSendVersionCodeList;
        if (list.contains(Long.valueOf(this.mVersionCode))) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_versioncode", String.valueOf(this.mVersionCode));
        AbCenterHelper.From from = this.mFrom;
        if (from != null) {
            bundle.putString("type", from.getName());
        }
        if (AbCenterLogUtil.isShowLog()) {
            AbCenterLogUtil.log("sendEvent: " + AbCenterAnalyzeUtil.getEventLog("learnings_abtest_error", bundle));
        }
        AbCenterAnalyzeUtil.sendEvent("learnings_abtest_error", bundle);
        list.add(Long.valueOf(this.mVersionCode));
    }

    public ConfigChecker(AbCenterHelper.From from) {
        this.mFrom = from;
    }

    public boolean checkConfig(AbConfigV6 abConfigV6) {
        if (abConfigV6 == null) {
            return true;
        }
        this.mVersionCode = abConfigV6.getVersionCode();
        List<AbExp> expList = abConfigV6.getExpList();
        List<AbStrategy> strategyList = abConfigV6.getStrategyList();
        if (expList == null || expList.isEmpty()) {
            if (strategyList == null || strategyList.isEmpty()) {
                sendConfigErrorEvent();
                return true;
            }
            return false;
        }
        return false;
    }
}
