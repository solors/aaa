package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class InstrumentUtility {
    @NotNull
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";
    @NotNull
    public static final String ANR_REPORT_PREFIX = "anr_log_";
    @NotNull
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";
    @NotNull
    public static final String CRASH_REPORT_PREFIX = "crash_log_";
    @NotNull
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";
    @NotNull
    public static final String ERROR_REPORT_PREFIX = "error_log_";
    @NotNull
    private static final String FBSDK_PREFIX = "com.facebook";
    @NotNull
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();
    @NotNull
    private static final String INSTRUMENT_DIR = "instrument";
    @NotNull
    private static final String METASDK_PREFIX = "com.meta";
    @NotNull
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";
    @NotNull
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(@Nullable String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null) {
            return new File(instrumentReportDir, str).delete();
        }
        return false;
    }

    @Nullable
    public static final String getCause(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    @Nullable
    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    @Nullable
    public static final String getStackTrace(@Nullable Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean isFromFbOrMeta(@NotNull StackTraceElement element) {
        boolean m16624M;
        boolean m16624M2;
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        m16624M = StringsJVM.m16624M(className, FBSDK_PREFIX, false, 2, null);
        if (!m16624M) {
            String className2 = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            m16624M2 = StringsJVM.m16624M(className2, METASDK_PREFIX, false, 2, null);
            if (!m16624M2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isSDKRelatedException(@Nullable Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement element = stackTrace[i];
                i++;
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (isFromFbOrMeta(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        boolean m16624M;
        boolean m16624M2;
        boolean m16624M3;
        boolean m16624M4;
        boolean m16624M5;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (isFromFbOrMeta(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    m16624M = StringsJVM.m16624M(className, CODELESS_PREFIX, false, 2, null);
                    if (!m16624M) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        m16624M5 = StringsJVM.m16624M(className2, SUGGESTED_EVENTS_PREFIX, false, 2, null);
                        if (!m16624M5) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    m16624M2 = StringsJVM.m16624M(methodName, "onClick", false, 2, null);
                    if (m16624M2) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        m16624M3 = StringsJVM.m16624M(methodName2, "onItemClick", false, 2, null);
                        if (m16624M3) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            m16624M4 = StringsJVM.m16624M(methodName3, "onTouch", false, 2, null);
                            if (!m16624M4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: s1.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m110152listAnrReportFiles$lambda1;
                m110152listAnrReportFiles$lambda1 = InstrumentUtility.m110152listAnrReportFiles$lambda1(file, str);
                return m110152listAnrReportFiles$lambda1;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* renamed from: listAnrReportFiles$lambda-1 */
    public static final boolean m110152listAnrReportFiles$lambda1(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANR_REPORT_PREFIX}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m16766e(name);
    }

    @NotNull
    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: s1.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m110153listExceptionAnalysisReportFiles$lambda2;
                m110153listExceptionAnalysisReportFiles$lambda2 = InstrumentUtility.m110153listExceptionAnalysisReportFiles$lambda2(file, str);
                return m110153listExceptionAnalysisReportFiles$lambda2;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* renamed from: listExceptionAnalysisReportFiles$lambda-2 */
    public static final boolean m110153listExceptionAnalysisReportFiles$lambda2(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANALYSIS_REPORT_PREFIX}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m16766e(name);
    }

    @NotNull
    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: s1.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m110154listExceptionReportFiles$lambda3;
                m110154listExceptionReportFiles$lambda3 = InstrumentUtility.m110154listExceptionReportFiles$lambda3(file, str);
                return m110154listExceptionReportFiles$lambda3;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* renamed from: listExceptionReportFiles$lambda-3 */
    public static final boolean m110154listExceptionReportFiles$lambda3(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).m16766e(name);
    }

    @Nullable
    public static final JSONObject readFile(@Nullable String str, boolean z) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null) {
            try {
                return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, str))));
            } catch (Exception unused) {
                if (z) {
                    deleteFile(str);
                }
            }
        }
        return null;
    }

    public static final void sendReports(@Nullable String str, @NotNull JSONArray reports, @Nullable GraphRequest.Callback callback) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> keys = dataProcessingOptions.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.Companion;
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            companion.newPostRequest(null, format, jSONObject, callback).executeAsync();
        } catch (JSONException unused) {
        }
    }

    public static final void writeFile(@Nullable String str, @Nullable String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public static final String getStackTrace(@NotNull Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
