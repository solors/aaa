package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class AFb1sSDK {
    @NotNull
    private final AFa1pSDK AFKeystoreWrapper;

    public AFb1sSDK(@NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        this.AFKeystoreWrapper = aFa1pSDK;
    }

    public final void afInfoLog() {
        try {
            Map<Integer, Object> map = AFc1iSDK.afDebugLog;
            Object obj = map.get(2118739094);
            if (obj == null) {
                obj = ((Class) AFc1iSDK.AFInAppEventParameterName(88 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 42277), 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(2118739094, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            try {
                Object[] objArr = {this.AFKeystoreWrapper};
                Object obj2 = map.get(569888260);
                if (obj2 == null) {
                    obj2 = ((Class) AFc1iSDK.AFInAppEventParameterName(88 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 42277), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35)).getMethod("AFInAppEventParameterName", AFa1pSDK.class);
                    map.put(569888260, obj2);
                }
                ((Method) obj2).invoke(newInstance, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
