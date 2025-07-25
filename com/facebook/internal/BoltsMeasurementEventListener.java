package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BoltsMeasurementEventListener.kt */
@Metadata
/* loaded from: classes4.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    @NotNull
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
    @NotNull
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    @NotNull
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    @Nullable
    private static BoltsMeasurementEventListener singleton;
    @NotNull
    private final Context applicationContext;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener access$getSingleton$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.open();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            singleton = boltsMeasurementEventListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
        }
    }

    private final void close() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Nullable
    public static final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return Companion.getInstance(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    private final void open() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            close();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            Set<String> set = null;
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("event_name");
            }
            String m17064q = Intrinsics.m17064q(BOLTS_MEASUREMENT_EVENT_PREFIX, stringExtra);
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY);
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            internalAppEventsLogger.logEvent(m17064q, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    /* compiled from: BoltsMeasurementEventListener.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.access$getSingleton$cp();
        }

        @NotNull
        public final String getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release() {
            return BoltsMeasurementEventListener.access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp();
        }

        @VisibleForTesting
        /* renamed from: getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations */
        public static /* synthetic */ void m78738x83b588fd() {
        }
    }
}
