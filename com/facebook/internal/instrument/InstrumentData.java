package com.facebook.internal.instrument;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentData.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class InstrumentData {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String PARAM_APP_VERSION = "app_version";
    @NotNull
    private static final String PARAM_CALLSTACK = "callstack";
    @NotNull
    private static final String PARAM_DEVICE_MODEL = "device_model";
    @NotNull
    private static final String PARAM_DEVICE_OS = "device_os_version";
    @NotNull
    private static final String PARAM_FEATURE_NAMES = "feature_names";
    @NotNull
    private static final String PARAM_REASON = "reason";
    @NotNull
    private static final String PARAM_TIMESTAMP = "timestamp";
    @NotNull
    private static final String PARAM_TYPE = "type";
    @NotNull
    private static final String UNKNOWN = "Unknown";
    @Nullable
    private String appVersion;
    @Nullable
    private String cause;
    @Nullable
    private JSONArray featureNames;
    @NotNull
    private String filename;
    @Nullable
    private String stackTrace;
    @Nullable
    private Long timestamp;
    @Nullable
    private Type type;

    /* compiled from: InstrumentData.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        @NotNull
        public static final InstrumentData build(@Nullable Throwable th, @NotNull Type t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new InstrumentData(th, t, (DefaultConstructorMarker) null);
        }

        @NotNull
        public static final InstrumentData load(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }

        @NotNull
        public static final InstrumentData build(@NotNull JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new InstrumentData(features, (DefaultConstructorMarker) null);
        }

        @NotNull
        public static final InstrumentData build(@Nullable String str, @Nullable String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: InstrumentData.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type getType(String str) {
            boolean m16624M;
            boolean m16624M2;
            boolean m16624M3;
            boolean m16624M4;
            boolean m16624M5;
            m16624M = StringsJVM.m16624M(str, InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(str, InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, null);
                if (!m16624M2) {
                    m16624M3 = StringsJVM.m16624M(str, InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, null);
                    if (!m16624M3) {
                        m16624M4 = StringsJVM.m16624M(str, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, null);
                        if (!m16624M4) {
                            m16624M5 = StringsJVM.m16624M(str, InstrumentUtility.ANR_REPORT_PREFIX, false, 2, null);
                            if (m16624M5) {
                                return Type.AnrReport;
                            }
                            return Type.Unknown;
                        }
                        return Type.Analysis;
                    }
                    return Type.ThreadCheck;
                }
                return Type.CrashShield;
            }
            return Type.CrashReport;
        }
    }

    /* compiled from: InstrumentData.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: InstrumentData.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final String getLogPrefix() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "Unknown";
                            }
                            return InstrumentUtility.THREAD_CHECK_PREFIX;
                        }
                        return InstrumentUtility.CRASH_SHIELD_PREFIX;
                    }
                    return InstrumentUtility.CRASH_REPORT_PREFIX;
                }
                return InstrumentUtility.ANR_REPORT_PREFIX;
            }
            return InstrumentUtility.ANALYSIS_REPORT_PREFIX;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "Unknown";
                            }
                            return "ThreadCheck";
                        }
                        return "CrashShield";
                    }
                    return "CrashReport";
                }
                return "AnrReport";
            }
            return "Analysis";
        }
    }

    /* compiled from: InstrumentData.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getParameters() {
        int i;
        Type type = this.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return null;
            }
            return getExceptionReportParameters();
        }
        return getAnalysisReportParameters();
    }

    public final void clear() {
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(@NotNull InstrumentData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = data.timestamp;
        if (l2 == null) {
            return 1;
        }
        return Intrinsics.m17070k(l2.longValue(), longValue);
    }

    public final boolean isValid() {
        int i;
        Type type = this.type;
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if ((i != 3 && i != 4 && i != 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void save() {
        if (!isValid()) {
            return;
        }
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.writeFile(this.filename, toString());
    }

    @NotNull
    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            String jSONObject = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = parameters.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANALYSIS_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    private InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.filename = stringBuffer2;
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANR_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        this.type = Companion.getType(name);
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        JSONObject readFile = InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0L));
            this.appVersion = readFile.optString(PARAM_APP_VERSION, null);
            this.cause = readFile.optString("reason", null);
            this.stackTrace = readFile.optString(PARAM_CALLSTACK, null);
            this.featureNames = readFile.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }
}
