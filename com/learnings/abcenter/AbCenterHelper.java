package com.learnings.abcenter;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.calculate.BaseAbCalculator;
import com.learnings.abcenter.calculate.p399v5.AbCalculatorV5;
import com.learnings.abcenter.calculate.p400v6.AbCalculatorV6;
import com.learnings.abcenter.model.p401v5.AbConfigV5;
import com.learnings.abcenter.model.p401v5.AbFinalData;
import com.learnings.abcenter.model.p402v6.AbConfigV6;
import com.learnings.abcenter.model.p402v6.AbResult;
import com.learnings.abcenter.util.AbCenterLogUtil;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.Map;

/* loaded from: classes6.dex */
public class AbCenterHelper {
    private boolean isDyeing;
    private final Context mContext;
    private final From mFrom;

    /* loaded from: classes6.dex */
    public enum AbCalculatorType {
        V5,
        V6
    }

    /* loaded from: classes6.dex */
    public enum From {
        ABTEST_SDK(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS),
        AD_SDK(C26485b.f69244a);
        
        private final String name;

        From(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public AbCenterHelper(Context context, From from) {
        this.mContext = context;
        this.mFrom = from;
    }

    private BaseAbCalculator getAbCalculator(AbCalculatorType abCalculatorType) {
        if (abCalculatorType == AbCalculatorType.V5) {
            return new AbCalculatorV5(this.mContext, this.mFrom, this.isDyeing);
        }
        return new AbCalculatorV6(this.mContext, this.mFrom, this.isDyeing);
    }

    public AbFinalData calculateAbResult(AbFinalData abFinalData, AbConfigV5 abConfigV5, AbUserTagData abUserTagData) {
        return getAbCalculator(AbCalculatorType.V5).calculateAbResult(abFinalData, abConfigV5, abUserTagData);
    }

    public Map<String, String> calculateFlowDomain(AbConfigV5 abConfigV5, AbUserTagData abUserTagData) {
        return getAbCalculator(AbCalculatorType.V5).calculateFlowDomain(abConfigV5, abUserTagData);
    }

    public void markKeepHittingDyeing(String str, String str2, AbResult.AbGroupStatus abGroupStatus) {
        if (abGroupStatus == AbResult.AbGroupStatus.UNKNOWN) {
            getAbCalculator(AbCalculatorType.V5).markKeepHittingDyeing(str, str2);
        } else {
            getAbCalculator(AbCalculatorType.V6).markKeepHittingDyeing(str, str2);
        }
    }

    public AbCenterHelper setDyeing(boolean z) {
        this.isDyeing = z;
        return this;
    }

    public AbCenterHelper setShowLog(boolean z) {
        AbCenterLogUtil.setShowLog(z);
        return this;
    }

    public AbFinalData calculateAbResult(AbConfigV5 abConfigV5, AbUserTagData abUserTagData) {
        return getAbCalculator(AbCalculatorType.V5).calculateAbResult(abConfigV5, abUserTagData);
    }

    public AbFinalData calculateAbResult(AbConfigV5 abConfigV5, AbUserTagData abUserTagData, Map<String, String> map) {
        return getAbCalculator(AbCalculatorType.V5).calculateAbResult(abConfigV5, abUserTagData, map);
    }

    public AbResult calculateAbResult(AbConfigV6 abConfigV6, AbUserTagData abUserTagData) {
        return getAbCalculator(AbCalculatorType.V6).calculateAbResult(abConfigV6, abUserTagData);
    }
}
