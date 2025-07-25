package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: com.facebook.ads.redexgen.X.MA */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12184MA {
    public static Bitmap A00(C13029Zs c13029Zs, Bitmap bitmap, int i) throws RSRuntimeException {
        RenderScript renderScript = null;
        Allocation allocation = null;
        Allocation output = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            renderScript = RenderScript.create(c13029Zs);
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            allocation = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            output = Allocation.createTyped(renderScript, allocation.getType());
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptIntrinsicBlur.setInput(allocation);
            scriptIntrinsicBlur.setRadius(i);
            scriptIntrinsicBlur.forEach(output);
            output.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (output != null) {
                output.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
        }
    }

    public static Bitmap A01(C13029Zs c13029Zs, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth() / i2;
        int height = bitmap.getHeight() / i2;
        if (width == 0 || height == 0) {
            return null;
        }
        int height2 = Build.VERSION.SDK_INT;
        if (height2 < 18) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / i2, 1.0f / i2);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            Bitmap A00 = A00(c13029Zs, createBitmap, i);
            if (i2 != 1) {
                int height3 = bitmap.getWidth();
                int width2 = bitmap.getHeight();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A00, height3, width2, true);
                A00.recycle();
                return createScaledBitmap;
            }
            return A00;
        } catch (RSRuntimeException unused) {
            return new C12771Vf().A02(createBitmap, i);
        }
    }
}
