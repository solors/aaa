package com.mobilefuse.sdk.mraid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.mraid.MraidFeatureDetection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MraidFeatureDetection.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MraidFeatureDetection {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean initialized;
    private static boolean locationSupport;
    private static boolean smsSupport;
    private static boolean telSupport;
    private static boolean vpaidSupported;

    public static final boolean getLocationSupport() {
        return locationSupport;
    }

    public static final boolean getSmsSupport() {
        return smsSupport;
    }

    public static final boolean getTelSupport() {
        return telSupport;
    }

    public static final boolean getVpaidSupported() {
        return vpaidSupported;
    }

    public static final void initialize(@NotNull Context context) {
        Companion.initialize(context);
    }

    private static final void setLocationSupport(boolean z) {
        locationSupport = z;
    }

    private static final void setSmsSupport(boolean z) {
        smsSupport = z;
    }

    private static final void setTelSupport(boolean z) {
        telSupport = z;
    }

    private static final void setVpaidSupported(boolean z) {
        vpaidSupported = z;
    }

    /* compiled from: MraidFeatureDetection.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void setInitialized(boolean z) {
            MraidFeatureDetection.initialized = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setLocationSupport(boolean z) {
            MraidFeatureDetection.locationSupport = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setSmsSupport(boolean z) {
            MraidFeatureDetection.smsSupport = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setTelSupport(boolean z) {
            MraidFeatureDetection.telSupport = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setVpaidSupported(boolean z) {
            MraidFeatureDetection.vpaidSupported = z;
        }

        public final boolean getInitialized() {
            return MraidFeatureDetection.initialized;
        }

        public final boolean getLocationSupport() {
            return MraidFeatureDetection.locationSupport;
        }

        public final boolean getSmsSupport() {
            return MraidFeatureDetection.smsSupport;
        }

        public final boolean getTelSupport() {
            return MraidFeatureDetection.telSupport;
        }

        public final boolean getVpaidSupported() {
            return MraidFeatureDetection.vpaidSupported;
        }

        public final void initialize(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getInitialized()) {
                return;
            }
            setInitialized(true);
            new Thread(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidFeatureDetection$Companion$initialize$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    try {
                        MraidFeatureDetection.Companion.setSmsSupport(Utils.hasIntent(context, new Intent("android.intent.action.VIEW", Uri.parse("sms:0123456789"))));
                    } catch (Throwable th) {
                        StabilityHelper.logException(MraidFeatureDetection.Companion, th);
                    }
                    try {
                        MraidFeatureDetection.Companion.setTelSupport(Utils.hasIntent(context, new Intent("android.intent.action.VIEW", Uri.parse("tel:0123456789"))));
                    } catch (Throwable th2) {
                        StabilityHelper.logException(MraidFeatureDetection.Companion, th2);
                    }
                    try {
                        MraidFeatureDetection.Companion companion = MraidFeatureDetection.Companion;
                        if (!Utils.hasManifestPermission(context, "android.permission.ACCESS_FINE_LOCATION") && !Utils.hasManifestPermission(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                            z = false;
                            companion.setLocationSupport(z);
                        }
                        z = true;
                        companion.setLocationSupport(z);
                    } catch (Throwable th3) {
                        StabilityHelper.logException(MraidFeatureDetection.Companion, th3);
                    }
                }
            }).start();
        }

        public static /* synthetic */ void getLocationSupport$annotations() {
        }

        public static /* synthetic */ void getSmsSupport$annotations() {
        }

        public static /* synthetic */ void getTelSupport$annotations() {
        }

        public static /* synthetic */ void getVpaidSupported$annotations() {
        }
    }
}
