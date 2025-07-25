package com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LruCache;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.C32559coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.C32633cco22;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.c2oc2i */
/* loaded from: classes8.dex */
public class C32477c2oc2i {
    private static final LruCache<String, C32559coo2iico> c2oc2i;
    private static final boolean cioccoiococ = false;
    private static final int coi222o222;
    private static final String coo2iico = "MediaViewSelectorHelper";

    static {
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
        coi222o222 = maxMemory;
        c2oc2i = new LruCache<>(maxMemory);
    }

    private C32477c2oc2i() {
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c4 -> B:73:0x00c7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.C32559coo2iico coi222o222(android.content.Context r8, java.lang.String r9, android.graphics.Bitmap.Config r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.C32477c2oc2i.coi222o222(android.content.Context, java.lang.String, android.graphics.Bitmap$Config):com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.coo2iico");
    }

    private static void coo2iico(String str, C32559coo2iico c32559coo2iico) {
    }

    public static C32559coo2iico coo2iico(Context context, String str, long j, Bitmap.Config config) {
        return coo2iico(context, C32633cco22.coo2iico(context).coo2iico(C32633cco22.C32636cioccoiococ.coo2iico(str, j), 10000L, null), config);
    }

    public static C32559coo2iico coo2iico(Context context, String str, Bitmap.Config config) {
        try {
            if (TextUtils.isEmpty(str)) {
                MLog.m25889e(coo2iico, "filePath == null");
                return null;
            }
            AndroidUtils.avoidOnMainThread();
            C32559coo2iico c32559coo2iico = c2oc2i.get(str);
            if (c32559coo2iico == null) {
                C32559coo2iico coi222o2222 = coi222o222(context, str, config);
                coo2iico(str, coi222o2222);
                return coi222o2222;
            }
            return c32559coo2iico;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "GetBitmap Exception", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.C32559coo2iico coo2iico(android.content.Context r8, android.net.Uri r9) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            android.content.ContentResolver r0 = r8.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r9)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r3
            r3 = 0
            android.graphics.BitmapFactory.decodeStream(r0, r3, r1)
            com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.coo2iico r4 = new com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.coo2iico
            r4.<init>()
            boolean r5 = com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.C32481coo2iico.coo2iico(r1)
            if (r5 == 0) goto L47
            r4.coo2iico(r2)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L3c
            android.content.ContentResolver r5 = r8.getContentResolver()
            android.graphics.ImageDecoder$Source r5 = com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.C32476a.m25903a(r5, r9)
            android.graphics.drawable.Drawable r5 = p780m0.C38181b.m15475a(r5)
            r4.coo2iico(r5)
            goto L47
        L3c:
            com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coi222o222 r5 = new com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coi222o222
            r5.<init>(r8)
            r5.setGIFResource(r0)
            r4.coo2iico(r5)
        L47:
            r0.close()
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            r5 = -1
            if (r0 == r5) goto L93
            if (r1 != r5) goto L54
            goto L93
        L54:
            if (r0 <= r1) goto L60
            float r5 = (float) r0
            r6 = 1139802112(0x43f00000, float:480.0)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L60
            float r5 = r5 / r6
            int r0 = (int) r5
            goto L6d
        L60:
            if (r0 >= r1) goto L6c
            float r0 = (float) r1
            r1 = 1145569280(0x44480000, float:800.0)
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L6c
            float r0 = r0 / r1
            int r0 = (int) r0
            goto L6d
        L6c:
            r0 = r2
        L6d:
            if (r0 > 0) goto L70
            goto L71
        L70:
            r2 = r0
        L71:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inSampleSize = r2
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r1
            android.content.ContentResolver r8 = r8.getContentResolver()
            java.io.InputStream r8 = r8.openInputStream(r9)
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r8, r3, r0)
            r8.close()
            android.graphics.Bitmap r8 = coo2iico(r9)
            r4.coo2iico(r8)
            return r4
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.C32477c2oc2i.coo2iico(android.content.Context, android.net.Uri):com.zeus.gmc.sdk.mobileads.columbus.internal.ccoc2oic.coo2iico");
    }

    public static Bitmap coo2iico(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.toByteArray().length / 1024 <= 100) {
            return bitmap;
        }
        for (int i = 100; byteArrayOutputStream.toByteArray().length / 1024 > 100 && i > 0; i -= 20) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }
}
