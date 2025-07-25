package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.media.AudioManager;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class SoundUtils {
    private static final long CACHE_DURATION_MS = 2000;
    private static final String TAG = "SoundUtils";
    private static long lastCheckedTime = 0;
    private static boolean lastMutedState = true;

    public static boolean isSoundMuted(Context context) {
        boolean z;
        if (context == null) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastCheckedTime < 2000) {
            Logger.m14229d(TAG, "Returning lastMutedState");
            return lastMutedState;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                if (audioManager.getStreamVolume(2) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                lastMutedState = z;
                lastCheckedTime = currentTimeMillis;
                Logger.m14229d(TAG, "Update and return lastMutedState");
                return lastMutedState;
            }
        } catch (SecurityException e) {
            HyBid.reportException((Exception) e);
            Logger.m14226e(TAG, "Security Error fetching sound state: ", e);
        } catch (Exception e2) {
            HyBid.reportException(e2);
            Logger.m14226e(TAG, "Error fetching sound state: ", e2);
        }
        return true;
    }
}
