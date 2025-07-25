package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayOutputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coi222o222 */
/* loaded from: classes8.dex */
public class C32468coi222o222 {
    private static final String coo2iico = "BitmapUtils";

    private C32468coi222o222() {
    }

    public static Bitmap coi222o222(String str) {
        Bitmap coo2iico2 = coo2iico(str);
        Bitmap bitmap = null;
        if (coo2iico2 == null) {
            return null;
        }
        try {
            bitmap = Bitmap.createBitmap(coo2iico2.getWidth(), coo2iico2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, coo2iico2.getWidth(), coo2iico2.getHeight());
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(coo2iico2, rect, rect, paint);
            return bitmap;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getRoundedCornerBitmap had exception: ", e);
            return bitmap;
        }
    }

    public static Bitmap coo2iico(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null) {
            return null;
        }
        float height = (i2 * 1.0f) / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale((i * 1.0f) / bitmap.getWidth(), height);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = i4;
        RectF rectF = new RectF(f, f, i - i4, i2 - i4);
        float f2 = i3;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (i4 > 0) {
            Paint paint2 = new Paint(1);
            paint2.setColor(-16711936);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f);
            canvas.drawRoundRect(rectF, f2, f2, paint2);
        }
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap coo2iico(java.lang.String r6) {
        /*
            java.lang.String r0 = "close file input stream exception"
            java.lang.String r1 = "BitmapUtils"
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1d java.io.FileNotFoundException -> L1f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L1d java.io.FileNotFoundException -> L1f
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> L1b java.io.FileNotFoundException -> L20
            r2.close()     // Catch: java.io.IOException -> L19
            goto L3d
        L19:
            r6 = move-exception
            goto L3a
        L1b:
            r6 = move-exception
            goto L41
        L1d:
            r6 = move-exception
            goto L40
        L1f:
            r2 = r3
        L20:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "file not found exception, path = "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25889e(r1, r6)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L19
            goto L3d
        L3a:
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r1, r0, r6)
        L3d:
            return r3
        L3e:
            r6 = move-exception
            r3 = r2
        L40:
            r2 = r3
        L41:
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r2 = move-exception
            com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r1, r0, r2)
        L4b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32468coi222o222.coo2iico(java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap coo2iico(Context context, Bitmap bitmap, int i, float f) {
        if (context == null || bitmap == null) {
            return bitmap;
        }
        Bitmap bitmap2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            bitmap2 = Bitmap.createScaledBitmap(decodeByteArray, Math.round(decodeByteArray.getWidth() * f), Math.round(decodeByteArray.getHeight() * f), true);
            RenderScript create = RenderScript.create(context);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setInput(createFromBitmap);
            create2.setRadius(i);
            create2.forEach(createTyped);
            createTyped.copyTo(bitmap2);
            create.destroy();
            return bitmap2;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "getBlurBitmap had exception", e);
            return bitmap2;
        }
    }
}
