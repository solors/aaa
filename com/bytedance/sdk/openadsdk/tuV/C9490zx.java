package com.bytedance.sdk.openadsdk.tuV;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.zx */
/* loaded from: classes3.dex */
public class C9490zx {

    /* renamed from: IL */
    protected static String f21117IL = null;

    /* renamed from: Kg */
    public static int f21118Kg = 2;

    /* renamed from: PX */
    public static int f21119PX = 32;

    /* renamed from: VB */
    public static int f21120VB = 16;

    /* renamed from: WR */
    public static int f21121WR = 4;

    /* renamed from: bX */
    protected static int f21122bX = 1;

    /* renamed from: bg */
    protected static String f21123bg = "images";

    /* renamed from: eo */
    public static int f21124eo = 8;
    protected static int eqN = 30;

    /* renamed from: iR */
    public static int f21125iR = 1;
    public static int ldr = 0;

    /* renamed from: zx */
    protected static long f21126zx = 15360;

    /* renamed from: IL */
    public static boolean m82719IL(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public static boolean m82716bg(Context context, String str) {
        return false;
    }

    /* renamed from: IL */
    public static float m82720IL(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public static Bitmap m82715bg(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: bg */
    public static boolean m82717bg(Context context, int i) {
        boolean m82716bg;
        boolean m82716bg2;
        if (ldr == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                m82716bg = m82716bg(context, "android.permission.READ_MEDIA_IMAGES");
                m82716bg2 = true;
            } else {
                m82716bg = m82716bg(context, "android.permission.READ_EXTERNAL_STORAGE");
                m82716bg2 = m82716bg(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean m82716bg3 = m82716bg(context, "android.permission.CAMERA");
            boolean m82716bg4 = m82716bg(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (m82716bg && m82716bg2) {
                ldr |= f21125iR;
            }
            if (m82716bg3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                ldr |= f21118Kg;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                ldr |= f21121WR;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                ldr |= f21124eo;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                ldr |= f21120VB;
            }
            if (m82716bg4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                ldr |= f21119PX;
            }
        }
        return (ldr & i) != 0;
    }

    /* renamed from: bg */
    public static boolean m82718bg(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
                return !z2 && z;
            }
        }
        z2 = true;
        if (z2) {
        }
    }
}
