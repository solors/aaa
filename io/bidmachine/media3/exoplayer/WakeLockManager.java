package io.bidmachine.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Log;

/* renamed from: io.bidmachine.media3.exoplayer.j2 */
/* loaded from: classes9.dex */
final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    @Nullable
    private final PowerManager powerManager;
    private boolean stayAwake;
    @Nullable
    private PowerManager.WakeLock wakeLock;

    public WakeLockManager(Context context) {
        this.powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void updateWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.wakeLock == null) {
            PowerManager powerManager = this.powerManager;
            if (powerManager == null) {
                Log.m19945w(TAG, "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
            this.wakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.enabled = z;
        updateWakeLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWakeLock();
    }
}
