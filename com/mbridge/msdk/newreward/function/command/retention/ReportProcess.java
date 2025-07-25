package com.mbridge.msdk.newreward.function.command.retention;

import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;
import com.mbridge.msdk.newreward.p477a.AdapterModel;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ReportProcess {
    static AdapterModel adapterModel;

    public static void init(AdapterModel adapterModel2) {
        adapterModel = adapterModel2;
    }

    public static void reportProcessAtThisTime(Object obj) {
        Method[] declaredMethods;
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (!method.isAnnotationPresent(ReportAnnotation.MethodInfo.class)) {
                return;
            }
            ReportAnnotation.MethodInfo methodInfo = (ReportAnnotation.MethodInfo) method.getAnnotation(ReportAnnotation.MethodInfo.class);
        }
    }
}
