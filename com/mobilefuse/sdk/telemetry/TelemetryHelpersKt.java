package com.mobilefuse.sdk.telemetry;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.ReversedViews;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TelemetryHelpers.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryHelpersKt {
    @NotNull
    public static final String beautifyJsonValue(@NotNull String value) {
        boolean z;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (value.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return value;
            }
            String jSONObject = new JSONObject(value).toString(4);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString(4)");
            return jSONObject;
        } catch (Throwable unused) {
            return value;
        }
    }

    @NotNull
    public static final List<TelemetryDataModel> getActions(@NotNull TelemetryActionReceiver getActions, @NotNull LogLevel logLevel, @Nullable TelemetryActionType telemetryActionType) {
        Intrinsics.checkNotNullParameter(getActions, "$this$getActions");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        ArrayList arrayList = new ArrayList();
        for (TelemetryDataModel telemetryDataModel : getActions.getActions()) {
            if (LogLevelKt.contains(telemetryDataModel.getLogLevel(), logLevel) && (telemetryActionType == null || telemetryDataModel.getType() == telemetryActionType)) {
                arrayList.add(telemetryDataModel);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getActions$default(TelemetryActionReceiver telemetryActionReceiver, LogLevel logLevel, TelemetryActionType telemetryActionType, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = LogLevel.DEBUG;
        }
        if ((i & 2) != 0) {
            telemetryActionType = null;
        }
        return getActions(telemetryActionReceiver, logLevel, telemetryActionType);
    }

    @NotNull
    public static final Object getBeautifyValue(@NotNull TelemetryActionParam beautifyValue) {
        Intrinsics.checkNotNullParameter(beautifyValue, "$this$beautifyValue");
        if (!(beautifyValue.getValue() instanceof String)) {
            return beautifyValue.getValue();
        }
        if (beautifyValue.getType() == TelemetryBaseParamType.BODY) {
            return beautifyJsonValue(beautifyValue.getValue().toString());
        }
        return beautifyValue.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0018  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> getBreadcrumbExtras(@org.jetbrains.annotations.NotNull com.mobilefuse.sdk.telemetry.TelemetryDataModel r3) {
        /*
            java.lang.String r0 = "$this$breadcrumbExtras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r3 = r3.getExtras()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            com.mobilefuse.sdk.telemetry.TelemetryActionParam r1 = (com.mobilefuse.sdk.telemetry.TelemetryActionParam) r1
            boolean r2 = r1.getIncludeToBreadcrumb()
            if (r2 != 0) goto L25
            goto L12
        L25:
            com.mobilefuse.sdk.telemetry.TelemetryParamType r2 = r1.getType()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L12
            goto L12
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.telemetry.TelemetryHelpersKt.getBreadcrumbExtras(com.mobilefuse.sdk.telemetry.TelemetryAction):java.util.Map");
    }

    @NotNull
    public static final String getEscapedName(@NotNull TelemetryParamType escapedName) {
        Intrinsics.checkNotNullParameter(escapedName, "$this$escapedName");
        return "[[" + escapedName + "]]";
    }

    public static final long getHttpActionRequestTime(@NotNull TelemetryActionReceiver getHttpActionRequestTime, @NotNull TelemetryDataModel responseAction) {
        Object obj;
        Intrinsics.checkNotNullParameter(getHttpActionRequestTime, "$this$getHttpActionRequestTime");
        Intrinsics.checkNotNullParameter(responseAction, "responseAction");
        TelemetryActionParam lastParamOrNull = getLastParamOrNull(responseAction, TelemetryBaseParamType.REQUEST_ACTION_INSTANCE);
        if (lastParamOrNull != null) {
            obj = lastParamOrNull.getValue();
        } else {
            obj = null;
        }
        if (obj != null && (obj instanceof TelemetryDataModel)) {
            return responseAction.getTimestamp() - ((TelemetryDataModel) obj).getTimestamp();
        }
        return -1L;
    }

    @Nullable
    public static final TelemetryDataModel getLastAction(@NotNull TelemetryActionReceiver getLastAction, @NotNull LogLevel logLevel, @Nullable TelemetryActionType telemetryActionType) {
        Object m17576C0;
        Intrinsics.checkNotNullParameter(getLastAction, "$this$getLastAction");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        m17576C0 = _Collections.m17576C0(getActions(getLastAction, logLevel, telemetryActionType));
        return (TelemetryDataModel) m17576C0;
    }

    public static /* synthetic */ TelemetryDataModel getLastAction$default(TelemetryActionReceiver telemetryActionReceiver, LogLevel logLevel, TelemetryActionType telemetryActionType, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = LogLevel.DEBUG;
        }
        if ((i & 2) != 0) {
            telemetryActionType = null;
        }
        return getLastAction(telemetryActionReceiver, logLevel, telemetryActionType);
    }

    @Nullable
    public static final TelemetryDataModel getLastActionWithParamOrNull(@NotNull TelemetryActionReceiver getLastActionWithParamOrNull, @NotNull TelemetryParamType paramType) {
        List<TelemetryDataModel> m17597X;
        Intrinsics.checkNotNullParameter(getLastActionWithParamOrNull, "$this$getLastActionWithParamOrNull");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        m17597X = ReversedViews.m17597X(getLastActionWithParamOrNull.getActions());
        for (TelemetryDataModel telemetryDataModel : m17597X) {
            if (getLastParamOrNull(telemetryDataModel, paramType) != null) {
                return telemetryDataModel;
            }
        }
        return null;
    }

    @Nullable
    public static final TelemetryDataModel getLastHttpResponseAction(@NotNull TelemetryActionReceiver lastHttpResponseAction) {
        Intrinsics.checkNotNullParameter(lastHttpResponseAction, "$this$lastHttpResponseAction");
        return getLastActionWithParamOrNull(lastHttpResponseAction, TelemetryBaseParamType.REQUEST_ACTION_INSTANCE);
    }

    @Nullable
    public static final TelemetryActionParam getLastParamOrNull(@NotNull TelemetryDataModel getLastParamOrNull, @NotNull TelemetryParamType paramType) {
        TelemetryActionParam telemetryActionParam;
        Intrinsics.checkNotNullParameter(getLastParamOrNull, "$this$getLastParamOrNull");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        List<TelemetryActionParam> extras = getLastParamOrNull.getExtras();
        ListIterator<TelemetryActionParam> listIterator = extras.listIterator(extras.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                telemetryActionParam = listIterator.previous();
                if (Intrinsics.m17075f(telemetryActionParam.getType(), paramType)) {
                    break;
                }
            } else {
                telemetryActionParam = null;
                break;
            }
        }
        return telemetryActionParam;
    }

    @NotNull
    public static final String getLogTime(@NotNull TelemetryDataModel logTime) {
        Intrinsics.checkNotNullParameter(logTime, "$this$logTime");
        return logTimeSince(logTime, Telemetry.Companion.getAppLaunchAction());
    }

    @NotNull
    public static final String getLogs(@NotNull TelemetryDataModel logs) {
        boolean z;
        int m16566e0;
        Intrinsics.checkNotNullParameter(logs, "$this$logs");
        String logExtraMessage = logs.getType().getLogExtraMessage();
        boolean z2 = true;
        if (logExtraMessage.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            logExtraMessage = logs.getType().getMessage();
        }
        String str = "";
        for (TelemetryActionParam telemetryActionParam : logs.getExtras()) {
            if (telemetryActionParam.getType().getPrintInLogs()) {
                m16566e0 = C37690r.m16566e0(logExtraMessage, getEscapedName(telemetryActionParam.getType()), 0, false, 6, null);
                if (m16566e0 >= 0) {
                    logExtraMessage = StringsJVM.m16628I(logExtraMessage, getEscapedName(telemetryActionParam.getType()), getBeautifyValue(telemetryActionParam).toString(), false, 4, null);
                } else if (logs.getType().getIncludeImplicitParamsInLogs()) {
                    str = str + "\n    + " + telemetryActionParam.getType().getValue() + " = " + getBeautifyValue(telemetryActionParam);
                }
            }
        }
        String replace = new Regex("\\[\\[(.*?)\\]\\]").replace(logExtraMessage, "");
        if (str.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            return replace + str;
        }
        return replace;
    }

    @NotNull
    public static final String getStackTraceLog(@NotNull Throwable stackTraceLog) {
        Intrinsics.checkNotNullParameter(stackTraceLog, "$this$stackTraceLog");
        StringWriter stringWriter = new StringWriter();
        stackTraceLog.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "with(StringWriter()) {\n …\n        toString()\n    }");
        return stringWriter2;
    }

    @NotNull
    public static final TelemetryDataModel getTelemetryAction(@NotNull Throwable telemetryAction) {
        List m17160s;
        Intrinsics.checkNotNullParameter(telemetryAction, "$this$telemetryAction");
        TelemetryActionParam telemetryActionParam = new TelemetryActionParam(TelemetryBaseParamType.EXCEPTION_DETAILS, getStackTraceLog(telemetryAction), false, 4, null);
        String telemetryActionSender = getTelemetryActionSender(telemetryAction);
        TelemetryBaseTypes telemetryBaseTypes = TelemetryBaseTypes.ACTION_EXCEPTION;
        m17160s = C37563v.m17160s(telemetryActionParam);
        return new TelemetryDataModel(telemetryActionSender, telemetryBaseTypes, m17160s, LogLevel.ERROR, 0L, 16, null);
    }

    @NotNull
    public static final String getTelemetryActionSender(@NotNull Object telemetryActionSender) {
        String name;
        boolean z;
        Intrinsics.checkNotNullParameter(telemetryActionSender, "$this$telemetryActionSender");
        try {
            if (!Telemetry.Companion.getStoreActionsEnabled()) {
                name = "unknown source";
            } else if (telemetryActionSender instanceof String) {
                name = (String) telemetryActionSender;
            } else {
                boolean z2 = false;
                if (telemetryActionSender instanceof Class) {
                    if (((Class) telemetryActionSender).getSimpleName().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        name = ((Class) telemetryActionSender).getSimpleName();
                    }
                }
                if (telemetryActionSender.getClass().getSimpleName().length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    name = telemetryActionSender.getClass().getSimpleName();
                } else {
                    name = telemetryActionSender.getClass().getName();
                }
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (!Telemetry.storeActi…unknown source\"\n        }");
            return name;
        } catch (Throwable unused) {
            return "unknown source";
        }
    }

    @NotNull
    public static final Date getTimestampDate(@NotNull TelemetryDataModel timestampDate) {
        Intrinsics.checkNotNullParameter(timestampDate, "$this$timestampDate");
        return new Date(timestampDate.getTimestamp());
    }

    public static final void logBreadcrumb(@NotNull TelemetryDataModel logBreadcrumb) {
        Intrinsics.checkNotNullParameter(logBreadcrumb, "$this$logBreadcrumb");
        try {
            if (!logBreadcrumb.getType().getEnabledBreadcrumbSending()) {
                return;
            }
            ExceptionHandler.Companion.logBreadcrumb(logBreadcrumb.getType().getCategory(), logBreadcrumb.getType().getMessage(), getBreadcrumbExtras(logBreadcrumb));
        } catch (Throwable unused) {
        }
    }

    @NotNull
    public static final String logTimeSince(@NotNull TelemetryDataModel logTimeSince, @NotNull TelemetryDataModel earlierAction) {
        Intrinsics.checkNotNullParameter(logTimeSince, "$this$logTimeSince");
        Intrinsics.checkNotNullParameter(earlierAction, "earlierAction");
        String format = TelemetryHelpers.Companion.getTimeLogFormat().format(new Date(logTimeSince.getTimestamp() - earlierAction.getTimestamp()));
        Intrinsics.checkNotNullExpressionValue(format, "TelemetryHelpers.timeLog…earlierAction.timestamp))");
        return format;
    }
}
