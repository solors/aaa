package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadCheckHandler.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ThreadCheckHandler {
    @NotNull
    public static final ThreadCheckHandler INSTANCE = new ThreadCheckHandler();
    private static final String TAG = ThreadCheckHandler.class.getCanonicalName();
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    public static final void enable() {
        enabled = true;
    }

    private final void log(String str, Class<?> cls, String str2, String str3) {
        if (!enabled) {
            return;
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        Exception exc = new Exception();
        Log.e(TAG, format, exc);
        InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
        InstrumentData.Builder.build(exc, InstrumentData.Type.ThreadCheck).save();
    }

    public static final void uiThreadViolationDetected(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        INSTANCE.log("@UiThread", clazz, methodName, methodDesc);
    }

    public static final void workerThreadViolationDetected(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull String methodDesc) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        INSTANCE.log("@WorkerThread", clazz, methodName, methodDesc);
    }
}
