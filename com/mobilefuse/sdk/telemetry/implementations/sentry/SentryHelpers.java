package com.mobilefuse.sdk.telemetry.implementations.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._CollectionsJvm;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpersKt */
/* loaded from: classes7.dex */
public final class SentryHelpers {
    @NotNull
    public static final JSONObject getJson(@NotNull Map<String, String> json) {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : json.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @NotNull
    public static final SentryException getSentryException(@NotNull Throwable sentryException) {
        boolean z;
        String str;
        String m16628I;
        Intrinsics.checkNotNullParameter(sentryException, "$this$sentryException");
        Package r0 = sentryException.getClass().getPackage();
        String str2 = "";
        String str3 = (r0 == null || (str3 = r0.getName()) == null) ? "" : "";
        if (str3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "";
        } else {
            str = str3 + '.';
        }
        String name = sentryException.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "javaClass.name");
        m16628I = StringsJVM.m16628I(name, str, "", false, 4, null);
        String message = sentryException.getMessage();
        if (message != null) {
            str2 = message;
        }
        return new SentryException(m16628I, str2, str3, getSentryStackTrace(sentryException));
    }

    private static final List<SentryStackFrame> getSentryFrames(Throwable th) {
        int i;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement it : stackTrace) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String methodName = it.getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "it.methodName");
            String fileName = it.getFileName();
            if (fileName == null) {
                fileName = "";
            }
            if (it.getLineNumber() >= 0) {
                i = it.getLineNumber();
            } else {
                i = 0;
            }
            String className = it.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            arrayList.add(new SentryStackFrame(methodName, fileName, i, className));
        }
        _CollectionsJvm.m17580d0(arrayList);
        return arrayList;
    }

    private static final SentryStackTrace getSentryStackTrace(Throwable th) {
        return new SentryStackTrace(getSentryFrames(th));
    }
}
