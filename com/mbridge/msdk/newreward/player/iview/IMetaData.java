package com.mbridge.msdk.newreward.player.iview;

import android.view.ViewGroup;
import com.mbridge.msdk.foundation.same.report.p452d.ParameterWrapper;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;

/* loaded from: classes6.dex */
public interface IMetaData {
    @ReportAnnotation.MethodInfo(className = "IMetaData", methodName = "report", methodParameter = "1", reportType = "3")
    void activityReport(String str);

    @ReportAnnotation.MethodInfo(className = "IMetaData", methodName = "report", methodParameter = "1", reportType = "3")
    void activityReport(String str, ParameterWrapper parameterWrapper);

    Object getDate();

    ViewGroup getRootViewGroup();

    @ReportAnnotation.MethodInfo(isParameter = true, key = "2000131", reportType = "1")
    void onShowFail(String str, int i);

    void setDate(Object obj);
}
