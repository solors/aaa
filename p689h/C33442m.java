package p689h;

import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExifUtils.kt */
@Metadata
/* renamed from: h.m */
/* loaded from: classes2.dex */
public final class C33442m {
    @NotNull

    /* renamed from: a */
    public static final C33442m f91266a = new C33442m();
    @NotNull

    /* renamed from: b */
    private static final Paint f91267b = new Paint(3);

    private C33442m() {
    }

    @NotNull
    /* renamed from: a */
    public final ExifUtils m23935a(@Nullable String str, @NotNull BufferedSource bufferedSource, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        if (C33443n.m23931c(exifOrientationPolicy, str)) {
            ExifInterface exifInterface = new ExifInterface(new C33441k(bufferedSource.peek().inputStream()));
            return new ExifUtils(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return ExifUtils.f91257d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r5 == false) goto L27;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m23934b(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r8, @org.jetbrains.annotations.NotNull p689h.ExifUtils r9) {
        /*
            r7 = this;
            boolean r0 = r9.m23938b()
            if (r0 != 0) goto Ld
            boolean r0 = p689h.C33443n.m23933a(r9)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.m23938b()
            if (r2 == 0) goto L2d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L2d:
            boolean r2 = p689h.C33443n.m23933a(r9)
            if (r2 == 0) goto L3b
            int r2 = r9.m23939a()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L3b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L58
            r3 = r5
            goto L59
        L58:
            r3 = r6
        L59:
            if (r3 == 0) goto L65
            float r3 = r1.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L62
            goto L63
        L62:
            r5 = r6
        L63:
            if (r5 != 0) goto L6c
        L65:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L6c:
            boolean r9 = p689h.C33443n.m23932b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L88
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = p1003v.Bitmaps.m2854c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            goto L9b
        L88:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = p1003v.Bitmaps.m2854c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
        L9b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = p689h.C33442m.f91267b
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p689h.C33442m.m23934b(android.graphics.Bitmap, h.j):android.graphics.Bitmap");
    }
}
