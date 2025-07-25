package com.amazon.device.ads;

import android.content.Context;
import android.provider.Settings;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DisplayUtils {
    private static final int[][] rotationArray = {new int[]{1, 0, 9, 8}, new int[]{0, 9, 8, 1}};

    DisplayUtils() {
    }

    public static int determineCanonicalScreenOrientation() {
        Context context = AdRegistration.getContext();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        char c = 0;
        if (i != 1 ? i != 2 || rotation == 1 || rotation == 3 : rotation == 0 || rotation == 2) {
            c = 1;
        }
        return rotationArray[c ^ 1][rotation];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int determineSimpleOrientation() {
        int i = AdRegistration.getContext().getResources().getConfiguration().orientation;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isRotationLocked() {
        boolean z = false;
        try {
            if (Settings.System.getInt(AdRegistration.getContext().getContentResolver(), "accelerometer_rotation") == 1) {
                z = true;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return !z;
    }
}
