package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WakeLocks.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WakeLocksHolder {
    @NotNull
    public static final WakeLocksHolder INSTANCE = new WakeLocksHolder();
    @NotNull
    private static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    private WakeLocksHolder() {
    }

    @NotNull
    public final WeakHashMap<PowerManager.WakeLock, String> getWakeLocks() {
        return wakeLocks;
    }
}
