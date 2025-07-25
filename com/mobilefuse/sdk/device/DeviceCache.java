package com.mobilefuse.sdk.device;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.utils.SharedPreferenceFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceCache.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DeviceCache {
    @Nullable
    private static SharedPreferences defaultAppSharedPrefs;
    @NotNull
    public static final DeviceCache INSTANCE = new DeviceCache();
    private static final String MF_SHARED_PREFS_FILE_NAME = "com.mobilefuse.sdk.data";
    @NotNull
    private static final Functions<SharedPreferences> mfSharedPrefs = SharedPreferenceFactory.createLazySharedPrefs(MF_SHARED_PREFS_FILE_NAME);

    private DeviceCache() {
    }

    @Nullable
    public final SharedPreferences getDefaultAppSharedPrefs() {
        return defaultAppSharedPrefs;
    }

    @NotNull
    public final Functions<SharedPreferences> getMfSharedPrefs() {
        return mfSharedPrefs;
    }

    public final void initDefaultAppSharedPrefs() {
        SchedulersKt.safelyRunOnBgThread$default(null, DeviceCache$initDefaultAppSharedPrefs$1.INSTANCE, 1, null);
    }
}
