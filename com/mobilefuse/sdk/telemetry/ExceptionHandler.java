package com.mobilefuse.sdk.telemetry;

import android.util.Log;
import com.mobilefuse.sdk.telemetry.ExceptionHandler;
import com.mobilefuse.sdk.telemetry.implementations.SentryService;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpers;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44986p;
import p804nd.C38513v;

/* compiled from: ExceptionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ExceptionHandler {
    @NotNull
    public static final Companion Companion;
    private static final List<TelemetryBreadcrumb> breadcrumbs;
    private static TelemetryService instance;
    private static final Map<String, String> modules;
    @NotNull
    private static String releaseVersion;
    private static double sampleRate;
    private static final Map<String, String> variables;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        breadcrumbs = new ArrayList();
        modules = new LinkedHashMap();
        variables = new LinkedHashMap();
        instance = new SentryService();
        releaseVersion = "Unset";
        try {
            companion.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.8.0");
            companion.registerModule("kotlin", KotlinVersion.CURRENT.toString());
        } catch (Throwable unused) {
        }
    }

    public static final void captureException(@NotNull Throwable th, @NotNull String str) {
        Companion.captureException(th, str);
    }

    @NotNull
    public static final String getReleaseVersion() {
        return releaseVersion;
    }

    public static final double getSampleRate() {
        return sampleRate;
    }

    public static final void logBreadcrumb(@NotNull String str, @NotNull String str2, @Nullable Map<String, String> map) {
        Companion.logBreadcrumb(str, str2, map);
    }

    public static final void registerModule(@NotNull String str, @NotNull String str2) {
        Companion.registerModule(str, str2);
    }

    public static final void registerVariable(@NotNull String str, @NotNull String str2) {
        Companion.registerVariable(str, str2);
    }

    public static final void setReleaseVersion(@NotNull String str) {
        releaseVersion = str;
    }

    public static final void setSampleRate(double d) {
        Companion.setSampleRate(d);
    }

    public static final void setTelemetryService(@NotNull TelemetryService telemetryService) {
        Companion.setTelemetryService(telemetryService);
    }

    /* compiled from: ExceptionHandler.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean getShouldTransmitToServer() {
            Companion companion = ExceptionHandler.Companion;
            if (companion.getSampleRate() <= 0 || Math.random() > companion.getSampleRate()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logBreadcrumb$default(Companion companion, String str, String str2, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            companion.logBreadcrumb(str, str2, map);
        }

        public final void captureException(@NotNull Throwable e, @NotNull String sender) {
            Intrinsics.checkNotNullParameter(e, "e");
            Intrinsics.checkNotNullParameter(sender, "sender");
            try {
                Log.w("MobileFuse.Stability", "Gracefully handling an exception:");
                e.printStackTrace();
                if (getShouldTransmitToServer()) {
                    ExceptionHandler.instance.captureException(e, sender, ExceptionHandler.breadcrumbs, ExceptionHandler.modules, ExceptionHandler.variables);
                }
            } catch (Throwable unused) {
            }
        }

        @NotNull
        public final String getReleaseVersion() {
            return ExceptionHandler.releaseVersion;
        }

        public final double getSampleRate() {
            return ExceptionHandler.sampleRate;
        }

        public final void logBreadcrumb(@NotNull String category, @NotNull String message, @Nullable Map<String, String> map) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                ExceptionHandler.breadcrumbs.add(new TelemetryBreadcrumb(message, category, map, 0L, 8, null));
                if (map != null) {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message + ' ' + SentryHelpers.getJson(map));
                } else {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message);
                }
            } catch (Throwable unused) {
            }
        }

        public final void registerModule(@NotNull String module, @NotNull String version) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(version, "version");
            try {
                ExceptionHandler.modules.put(module, version);
            } catch (Throwable unused) {
            }
        }

        public final void registerVariable(@NotNull String variable, @NotNull String value) {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                ExceptionHandler.variables.put(variable, value);
            } catch (Throwable unused) {
            }
        }

        public final void setReleaseVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            ExceptionHandler.releaseVersion = str;
        }

        public final void setSampleRate(double d) {
            Map<String, String> m17291g;
            ExceptionHandler.sampleRate = d;
            Companion companion = ExceptionHandler.Companion;
            m17291g = MapsJVM.m17291g(C38513v.m14532a("rate", String.valueOf(companion.getSampleRate())));
            companion.logBreadcrumb("telemetry", "Adjusted sample rate", m17291g);
        }

        public final void setTelemetryService(@NotNull TelemetryService service) {
            Intrinsics.checkNotNullParameter(service, "service");
            ExceptionHandler.instance = service;
        }

        public final void updateSampleRateFromServer() {
            try {
                new Thread(new Runnable() { // from class: com.mobilefuse.sdk.telemetry.ExceptionHandler$Companion$updateSampleRateFromServer$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        List m16611C0;
                        try {
                            m16611C0 = C37690r.m16611C0("1.8.0", new String[]{"-"}, false, 0, 6, null);
                            ExceptionHandler.Companion companion = ExceptionHandler.Companion;
                            URL url = new URL("https://cdn.mobilefuse.com/sdk/sample-rate/android/" + ((String) m16611C0.get(0)));
                            companion.setSampleRate(Double.parseDouble(new String(C44986p.m1165e(url), Charsets.UTF_8)));
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
            } catch (Throwable unused) {
            }
        }

        public static /* synthetic */ void getReleaseVersion$annotations() {
        }

        public static /* synthetic */ void getSampleRate$annotations() {
        }
    }
}
