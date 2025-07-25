package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class ConstantDeviceInfo {
    @NotNull
    public static final String APP_PLATFORM = "android";
    @NotNull
    public static final ConstantDeviceInfo INSTANCE = new ConstantDeviceInfo();
    @NotNull
    public static final String MANUFACTURER = Build.MANUFACTURER;
    @NotNull
    public static final String MODEL = Build.MODEL;
    @NotNull
    public static final String OS_VERSION = Build.VERSION.RELEASE;
    @SuppressLint({"AnnotateVersionCheck"})
    public static final int OS_API_LEVEL = Build.VERSION.SDK_INT;
    @NotNull
    public static final String DEVICE_ROOT_STATUS = String.valueOf(RootChecker.isRootedPhone());

    private ConstantDeviceInfo() {
    }
}
