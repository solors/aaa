package com.bytedance.adsdk.ugeno.p222iR;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* renamed from: com.bytedance.adsdk.ugeno.iR.Kg */
/* loaded from: classes3.dex */
public class C7114Kg {

    /* renamed from: bX */
    private static TypedValue f15284bX;

    /* renamed from: IL */
    private static final Object f15283IL = new Object();

    /* renamed from: bg */
    public static Handler f15285bg = new Handler(Looper.getMainLooper());

    /* renamed from: IL */
    public static int m90011IL(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: bg */
    public static float m90006bg(Context context, String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    /* renamed from: bg */
    public static float m90009bg(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: bg */
    public static Bitmap m90007bg(Context context, Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                return null;
            }
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(i);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static Drawable m90008bg(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: bg */
    public static boolean m90010bg() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* renamed from: bg */
    public static void m90005bg(Runnable runnable) {
        if (m90010bg()) {
            runnable.run();
        } else {
            f15285bg.post(runnable);
        }
    }
}
