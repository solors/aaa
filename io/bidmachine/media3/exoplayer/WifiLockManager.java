package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import com.ironsource.C20747r8;
import io.bidmachine.media3.common.util.Log;

/* renamed from: io.bidmachine.media3.exoplayer.k2 */
/* loaded from: classes9.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    @Nullable
    private WifiManager.WifiLock wifiLock;
    @Nullable
    private final WifiManager wifiManager;

    public WifiLockManager(Context context) {
        this.wifiManager = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
    }

    private void updateWifiLock() {
        WifiManager.WifiLock wifiLock = this.wifiLock;
        if (wifiLock == null) {
            return;
        }
        if (this.enabled && this.stayAwake) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.wifiLock == null) {
            WifiManager wifiManager = this.wifiManager;
            if (wifiManager == null) {
                Log.m19945w(TAG, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, WIFI_LOCK_TAG);
            this.wifiLock = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.enabled = z;
        updateWifiLock();
    }

    public void setStayAwake(boolean z) {
        this.stayAwake = z;
        updateWifiLock();
    }
}
