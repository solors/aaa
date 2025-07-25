package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import android.telephony.TelephonyManager;

/* renamed from: com.pgl.ssdk.v */
/* loaded from: classes7.dex */
public class C26668v {

    /* renamed from: a */
    public static int f69971a = -1;

    /* renamed from: b */
    public static int f69972b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pgl.ssdk.v$a */
    /* loaded from: classes7.dex */
    public static class RunnableC26669a implements Runnable {
        RunnableC26669a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C26668v.f69972b = C26668v.m40735b(C26676x.m40709b());
            SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
            if (m40743a != null) {
                m40743a.edit().putInt("camera_count", C26668v.f69972b).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m40735b(Context context) {
        int i = f69972b;
        if (i != -1) {
            return i;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f69972b = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f69972b = -1;
            }
        } else {
            f69972b = -2;
        }
        return f69972b;
    }

    /* renamed from: c */
    public static int m40734c(Context context) {
        TelephonyManager telephonyManager;
        if (f69971a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            f69971a = telephonyManager.getSimState();
        }
        return f69971a;
    }

    /* renamed from: a */
    public static int m40737a() {
        int i;
        int i2 = f69972b;
        if (i2 != -1) {
            return i2;
        }
        SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
        if (m40743a != null && (i = m40743a.getInt("camera_count", -1)) != -1) {
            f69972b = i;
            return i;
        }
        C26652o0.m40800b(new RunnableC26669a());
        return -1;
    }
}
