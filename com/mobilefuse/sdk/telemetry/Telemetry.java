package com.mobilefuse.sdk.telemetry;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.StabilityHelperBridge;
import com.mobilefuse.sdk.info.GetAppInstallSource;
import com.mobilefuse.sdk.telemetry.ExceptionHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Telemetry.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Telemetry {
    @NotNull
    public static final Companion Companion;
    private static final Map<Integer, TelemetryAgent> agents;
    @NotNull
    private static TelemetryDataModel appLaunchAction;
    private static final TelemetryDataModel defaultAppLaunchAction;
    private static boolean enabled;
    private static boolean exceptionHandlerEnabled;
    private static boolean initialized;
    private static final List<TelemetryDataModel> mutableActions;
    private static boolean storeActionsEnabled;

    /* compiled from: Telemetry.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion implements TelemetryActionReceiver {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void setAppLaunchAction(TelemetryDataModel telemetryDataModel) {
            Telemetry.appLaunchAction = telemetryDataModel;
        }

        public final void setInitialized(boolean z) {
            Telemetry.initialized = z;
        }

        public final void clear() {
            Telemetry.mutableActions.clear();
            for (TelemetryAgent telemetryAgent : Telemetry.agents.values()) {
                telemetryAgent.clearActions$mobilefuse_sdk_telemetry_release();
            }
            Telemetry.agents.clear();
        }

        @Override // com.mobilefuse.sdk.telemetry.TelemetryActionReceiver
        @NotNull
        public List<TelemetryDataModel> getActions() {
            List<TelemetryDataModel> mutableActions = Telemetry.mutableActions;
            Intrinsics.checkNotNullExpressionValue(mutableActions, "mutableActions");
            return mutableActions;
        }

        @Nullable
        public final TelemetryAgent getAgent(@NotNull Object owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (TelemetryAgent) Telemetry.agents.get(Integer.valueOf(owner.hashCode()));
        }

        @NotNull
        public final TelemetryDataModel getAppLaunchAction() {
            return Telemetry.appLaunchAction;
        }

        public final boolean getEnabled() {
            return Telemetry.enabled;
        }

        public final boolean getExceptionHandlerEnabled() {
            return Telemetry.exceptionHandlerEnabled;
        }

        public final boolean getInitialized() {
            return Telemetry.initialized;
        }

        public final boolean getStoreActionsEnabled() {
            return Telemetry.storeActionsEnabled;
        }

        public final void initialize(@NotNull Context context, @NotNull String releaseVersion) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            if (getInitialized()) {
                return;
            }
            setInitialized(true);
            StabilityHelperBridge stabilityHelperBridge = StabilityHelperBridge.INSTANCE;
            stabilityHelperBridge.setLogExceptionFn(new Telemetry$Companion$initialize$1(this));
            ExceptionHandler.Companion companion = ExceptionHandler.Companion;
            stabilityHelperBridge.setRegisterExceptionHandlerVariableFn(new Telemetry$Companion$initialize$2(companion));
            try {
                companion.setReleaseVersion(releaseVersion);
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                String packageName = applicationContext.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.applicationContext.packageName");
                companion.registerVariable("app.bundle", packageName);
                PackageManager packageManager = context.getPackageManager();
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
                PackageInfo packageInfo = packageManager.getPackageInfo(applicationContext2.getPackageName(), 0);
                String str = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(str, "info.versionName");
                companion.registerVariable("app.versionName", str);
                companion.registerVariable("app.versionCode", "" + packageInfo.versionCode);
                companion.registerVariable("app.installSource", GetAppInstallSource.getAppInstallSource(context));
            } catch (Throwable unused) {
            }
        }

        public final void logException(@NotNull Object sender, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(exception, "exception");
            try {
                String simpleName = Reflection.m17042b(sender.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = sender.getClass().getSimpleName();
                }
                Intrinsics.checkNotNullExpressionValue(simpleName, "sender::class.simpleName…er::class.java.simpleName");
                logException(simpleName, exception);
            } catch (Throwable unused) {
            }
        }

        public final synchronized void onAction(@NotNull TelemetryDataModel action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (getStoreActionsEnabled()) {
                Telemetry.mutableActions.add(action);
            }
            if (getExceptionHandlerEnabled()) {
                TelemetryHelpersKt.logBreadcrumb(action);
            }
        }

        public final void onAppLaunch(@NotNull Object sender) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            clear();
            setAppLaunchAction(TelemetryActionFactory.createAction$default(sender, TelemetryBaseTypes.APP_LAUNCHED, null, null, 12, null));
            onAction(getAppLaunchAction());
        }

        public final void onAppLaunchInternally(@NotNull Object sender) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            if (getAppLaunchAction() != Telemetry.defaultAppLaunchAction) {
                return;
            }
            onAppLaunch(sender);
        }

        public final void registerAgent$mobilefuse_sdk_telemetry_release(@NotNull TelemetryAgent agent) {
            Intrinsics.checkNotNullParameter(agent, "agent");
            Telemetry.agents.put(Integer.valueOf(agent.getOwnerHashCode()), agent);
        }

        @VisibleForTesting
        public final void reset() {
            clear();
        }

        public final void setEnabled(boolean z) {
            Companion companion = Telemetry.Companion;
            companion.setExceptionHandlerEnabled(z);
            companion.setStoreActionsEnabled(z);
            Telemetry.enabled = z;
        }

        public final void setExceptionHandlerEnabled(boolean z) {
            Telemetry.exceptionHandlerEnabled = z;
        }

        public final void setStoreActionsEnabled(boolean z) {
            Telemetry.storeActionsEnabled = z;
        }

        public final void logException(@NotNull String sender, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (getExceptionHandlerEnabled()) {
                try {
                    onAction(TelemetryHelpersKt.getTelemetryAction(exception));
                    ExceptionHandler.Companion.captureException(exception, sender);
                    return;
                } catch (Throwable unused) {
                    Debugging.logDebug$default(this, "Exception caught by " + sender, null, 2, null);
                    exception.printStackTrace();
                    return;
                }
            }
            exception.printStackTrace();
            throw exception;
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        public static /* synthetic */ void getExceptionHandlerEnabled$annotations() {
        }

        public static /* synthetic */ void getInitialized$annotations() {
        }

        public static /* synthetic */ void getStoreActionsEnabled$annotations() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        enabled = true;
        exceptionHandlerEnabled = true;
        agents = new LinkedHashMap();
        mutableActions = Collections.synchronizedList(new ArrayList());
        TelemetryDataModel telemetryDataModel = new TelemetryDataModel(TelemetryHelpersKt.getTelemetryActionSender(companion), TelemetryBaseTypes.APP_LAUNCHED, null, null, 0L, 28, null);
        defaultAppLaunchAction = telemetryDataModel;
        appLaunchAction = telemetryDataModel;
    }

    public static final void clear() {
        Companion.clear();
    }

    @Nullable
    public static final TelemetryAgent getAgent(@NotNull Object obj) {
        return Companion.getAgent(obj);
    }

    public static final boolean getEnabled() {
        return enabled;
    }

    public static final boolean getExceptionHandlerEnabled() {
        return exceptionHandlerEnabled;
    }

    public static final boolean getInitialized() {
        return initialized;
    }

    public static final boolean getStoreActionsEnabled() {
        return storeActionsEnabled;
    }

    public static final void initialize(@NotNull Context context, @NotNull String str) {
        Companion.initialize(context, str);
    }

    public static final void logException(@NotNull Object obj, @NotNull Throwable th) {
        Companion.logException(obj, th);
    }

    public static final synchronized void onAction(@NotNull TelemetryDataModel telemetryDataModel) {
        synchronized (Telemetry.class) {
            Companion.onAction(telemetryDataModel);
        }
    }

    public static final void onAppLaunch(@NotNull Object obj) {
        Companion.onAppLaunch(obj);
    }

    public static final void onAppLaunchInternally(@NotNull Object obj) {
        Companion.onAppLaunchInternally(obj);
    }

    @VisibleForTesting
    public static final void reset() {
        Companion.reset();
    }

    public static final void setEnabled(boolean z) {
        Companion.setEnabled(z);
    }

    public static final void setExceptionHandlerEnabled(boolean z) {
        exceptionHandlerEnabled = z;
    }

    private static final void setInitialized(boolean z) {
        initialized = z;
    }

    public static final void setStoreActionsEnabled(boolean z) {
        storeActionsEnabled = z;
    }

    public static final void logException(@NotNull String str, @NotNull Throwable th) {
        Companion.logException(str, th);
    }
}
