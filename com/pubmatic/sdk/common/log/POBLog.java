package com.pubmatic.sdk.common.log;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@Keep
/* loaded from: classes7.dex */
public class POBLog {
    @NonNull
    private static final POBLog sSelf = new POBLog();
    private final ArrayList<POBLogging> loggers = new ArrayList<>();
    private OpenWrapSDK.LogLevel mLogLevel;

    @Keep
    /* loaded from: classes7.dex */
    public static class POBLogMessage {
        static final String SDK_TAG = "OpenWrapSDK: ";
        final OpenWrapSDK.LogLevel mLogLevel;
        final String mMsg;
        final String mTAG;

        POBLogMessage(String str, String str2, OpenWrapSDK.LogLevel logLevel) {
            this.mTAG = SDK_TAG + str;
            this.mMsg = str2;
            this.mLogLevel = logLevel;
        }
    }

    @Keep
    /* loaded from: classes7.dex */
    public interface POBLogging {
        void log(POBLogMessage pOBLogMessage);
    }

    private POBLog() {
        this.mLogLevel = OpenWrapSDK.LogLevel.Warn;
        addLoggerInternal(new POBDefaultLogger());
        Context applicationContext = getApplicationContext();
        if (applicationContext != null && POBUtils.isDebugBuild(applicationContext)) {
            this.mLogLevel = OpenWrapSDK.LogLevel.Debug;
        }
    }

    public static void addLogger(POBLogging pOBLogging) {
        sSelf.addLoggerInternal(pOBLogging);
    }

    private void addLoggerInternal(POBLogging pOBLogging) {
        this.loggers.add(pOBLogging);
    }

    public static ArrayList<POBLogging> allLoggers() {
        return sSelf.allLoggersInternal();
    }

    private ArrayList<POBLogging> allLoggersInternal() {
        return this.loggers;
    }

    public static void debug(String str, @Nullable String str2, @Nullable Object... objArr) {
        sSelf.log(str, OpenWrapSDK.LogLevel.Debug, str2, objArr);
    }

    public static void error(String str, @Nullable String str2, @Nullable Object... objArr) {
        sSelf.log(str, OpenWrapSDK.LogLevel.Error, str2, objArr);
    }

    @Nullable
    private static Context getApplicationContext() {
        Application application;
        try {
            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Exception unused) {
            application = null;
        }
        if (application == null) {
            return null;
        }
        return application.getApplicationContext();
    }

    public static OpenWrapSDK.LogLevel getLogLevel() {
        return sSelf.mLogLevel;
    }

    public static void info(String str, @Nullable String str2, @Nullable Object... objArr) {
        sSelf.log(str, OpenWrapSDK.LogLevel.Info, str2, objArr);
    }

    private void log(String str, OpenWrapSDK.LogLevel logLevel, @Nullable String str2, @Nullable Object... objArr) {
        String format;
        if (logLevel.getLevel() >= this.mLogLevel.getLevel()) {
            try {
                format = String.format(Locale.US, str2, objArr);
            } catch (Exception unused) {
                format = String.format(Locale.US, "%s %s", str2, Arrays.toString(objArr));
            }
            POBLogMessage pOBLogMessage = new POBLogMessage(str, format, logLevel);
            for (int i = 0; i < this.loggers.size(); i++) {
                this.loggers.get(i).log(pOBLogMessage);
            }
        }
    }

    public static void setLogLevel(OpenWrapSDK.LogLevel logLevel) {
        sSelf.mLogLevel = logLevel;
    }

    public static void verbose(String str, String str2, Object... objArr) {
        sSelf.log(str, OpenWrapSDK.LogLevel.Verbose, str2, objArr);
    }

    public static void warn(String str, @Nullable String str2, @Nullable Object... objArr) {
        sSelf.log(str, OpenWrapSDK.LogLevel.Warn, str2, objArr);
    }
}
