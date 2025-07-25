package com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LruCache;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.C32633cco22;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coi222o222 */
/* loaded from: classes8.dex */
public class C32648coi222o222 {
    private static final LruCache<String, Bitmap> c2oc2i;
    private static final boolean cioccoiococ = false;
    private static final int coi222o222;
    private static final String coo2iico = "SplashUIHelper";

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    class C32649coo2iico extends LruCache<String, Bitmap> {
        C32649coo2iico(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: coo2iico */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    static {
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
        coi222o222 = maxMemory;
        c2oc2i = new C32649coo2iico(maxMemory);
    }

    private C32648coi222o222() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap coi222o222(java.lang.String r9, android.graphics.Bitmap.Config r10) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.C32648coi222o222.coi222o222(java.lang.String, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private static void coo2iico(String str, Bitmap bitmap) {
    }

    public static Bitmap coo2iico(Context context, String str, long j, Bitmap.Config config) {
        return coo2iico(C32633cco22.coo2iico(context).coo2iico(C32633cco22.C32636cioccoiococ.coo2iico(str, j), 10000L, null), config);
    }

    public static Bitmap coo2iico(Context context, String str, IAdInfoEntity iAdInfoEntity, Bitmap.Config config) {
        return coo2iico(C32633cco22.coo2iico(context).coo2iico(C32633cco22.C32636cioccoiococ.coo2iico(str, iAdInfoEntity), 10000L, null), config);
    }

    public static Bitmap coo2iico(String str, Bitmap.Config config) {
        try {
            if (TextUtils.isEmpty(str)) {
                MLog.m25889e(coo2iico, "filePath == null");
                return null;
            }
            AndroidUtils.avoidOnMainThread();
            Bitmap bitmap = c2oc2i.get(str);
            if (bitmap == null) {
                Bitmap coi222o2222 = coi222o222(str, config);
                coo2iico(str, coi222o2222);
                return coi222o2222;
            }
            return bitmap;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "GetBitmap Exception", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap coo2iico(android.content.Context r7, android.net.Uri r8) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r8)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r3
            r3 = 0
            android.graphics.BitmapFactory.decodeStream(r0, r3, r1)
            r0.close()
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            r4 = -1
            if (r0 == r4) goto L61
            if (r1 != r4) goto L25
            goto L61
        L25:
            if (r0 <= r1) goto L31
            float r4 = (float) r0
            r5 = 1139802112(0x43f00000, float:480.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L31
            float r4 = r4 / r5
            int r0 = (int) r4
            goto L3e
        L31:
            if (r0 >= r1) goto L3d
            float r0 = (float) r1
            r1 = 1145569280(0x44480000, float:800.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3d
            float r0 = r0 / r1
            int r0 = (int) r0
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 > 0) goto L41
            goto L42
        L41:
            r2 = r0
        L42:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inSampleSize = r2
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r1
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.io.InputStream r7 = r7.openInputStream(r8)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r7, r3, r0)
            r7.close()
            android.graphics.Bitmap r7 = coo2iico(r8)
            return r7
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.internal.cioc2.C32648coi222o222.coo2iico(android.content.Context, android.net.Uri):android.graphics.Bitmap");
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
