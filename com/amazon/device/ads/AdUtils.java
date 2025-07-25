package com.amazon.device.ads;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashSet;

/* loaded from: classes2.dex */
class AdUtils {
    public static final String REQUIRED_ACTIVITY = "com.amazon.device.ads.AdActivity";
    private static AdUtilsExecutor executor = new AdUtilsExecutor();

    /* loaded from: classes2.dex */
    static class AdUtilsExecutor {
        private boolean hasRequiredActivities;
        private final HashSet<String> requiredActivities;

        AdUtilsExecutor() {
            HashSet<String> hashSet = new HashSet<>();
            this.requiredActivities = hashSet;
            this.hasRequiredActivities = false;
            hashSet.add(AdUtils.REQUIRED_ACTIVITY);
        }

        double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
            double d = i3 / i;
            double d2 = i4 / i2;
            if ((d2 < d || d == 0.0d) && d2 != 0.0d) {
                d = d2;
            }
            if (d == 0.0d) {
                return 1.0d;
            }
            return d;
        }

        int deviceIndependentPixelToPixel(int i) {
            float scalingFactorAsFloat;
            if (i == -1) {
                scalingFactorAsFloat = i;
            } else {
                scalingFactorAsFloat = i * getScalingFactorAsFloat();
            }
            return (int) scalingFactorAsFloat;
        }

        float getScalingFactorAsFloat() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) AdRegistration.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.scaledDensity;
        }

        int pixelToDeviceIndependentPixel(int i) {
            return (int) (i / getScalingFactorAsFloat());
        }
    }

    private AdUtils() {
    }

    public static double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
        return executor.calculateScalingMultiplier(i, i2, i3, i4);
    }

    public static int deviceIndependentPixelToPixel(int i) {
        return executor.deviceIndependentPixelToPixel(i);
    }

    public static float getScalingFactorAsFloat() {
        return executor.getScalingFactorAsFloat();
    }

    public static int pixelToDeviceIndependentPixel(int i) {
        return executor.pixelToDeviceIndependentPixel(i);
    }
}
