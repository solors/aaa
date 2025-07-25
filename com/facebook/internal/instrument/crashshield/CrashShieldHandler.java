package com.facebook.internal.instrument.crashshield;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CrashShieldHandler.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CrashShieldHandler {
    @NotNull
    public static final CrashShieldHandler INSTANCE = new CrashShieldHandler();
    private static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());
    private static boolean enabled;

    private CrashShieldHandler() {
    }

    @VisibleForTesting
    public static final void disable() {
        enabled = false;
    }

    public static final void enable() {
        enabled = true;
    }

    public static final void handleThrowable(@Nullable Throwable th, @NotNull Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        if (!enabled) {
            return;
        }
        crashingObjects.add(o);
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            ExceptionAnalyzer.execute(th);
            InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
            InstrumentData.Builder.build(th, InstrumentData.Type.CrashShield).save();
        }
        scheduleCrashInDebug(th);
    }

    @VisibleForTesting
    public static final boolean isDebug() {
        return false;
    }

    public static final boolean isObjectCrashing(@NotNull Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return crashingObjects.contains(o);
    }

    public static final void reset() {
        resetCrashingObjects();
    }

    public static final void resetCrashingObjects() {
        crashingObjects.clear();
    }

    @VisibleForTesting
    public static final void scheduleCrashInDebug(@Nullable final Throwable th) {
        if (isDebug()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.internal.instrument.crashshield.CrashShieldHandler$scheduleCrashInDebug$1
                @Override // java.lang.Runnable
                public void run() {
                    throw new RuntimeException(th);
                }
            });
        }
    }

    public static final void methodFinished(@Nullable Object obj) {
    }
}
