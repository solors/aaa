package com.yandex.div.core.view2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.core.view2.r0 */
/* loaded from: classes8.dex */
public final class ShadowCache {
    @NotNull

    /* renamed from: a */
    public static final ShadowCache f75880a = new ShadowCache();
    @NotNull

    /* renamed from: b */
    private static final Paint f75881b = new Paint();
    @NotNull

    /* renamed from: c */
    private static final Map<C29741a, NinePatch> f75882c = new LinkedHashMap();

    /* compiled from: ShadowCache.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.r0$a */
    /* loaded from: classes8.dex */
    public static final class C29741a {
        @NotNull

        /* renamed from: a */
        private final float[] f75883a;

        /* renamed from: b */
        private final float f75884b;

        public C29741a(@NotNull float[] radii, float f) {
            Intrinsics.checkNotNullParameter(radii, "radii");
            this.f75883a = radii;
            this.f75884b = f;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z;
            if (!(obj instanceof C29741a)) {
                return false;
            }
            C29741a c29741a = (C29741a) obj;
            if (this.f75884b == c29741a.f75884b) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !Arrays.equals(this.f75883a, c29741a.f75883a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f75883a) * 31) + Float.hashCode(this.f75884b);
        }
    }

    private ShadowCache() {
    }

    /* renamed from: a */
    private final void m36711a(Bitmap bitmap, Context context, Bitmap bitmap2, float f) {
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.A_8(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap2);
        create2.setRadius(f);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(bitmap2);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
    }

    /* renamed from: b */
    private final NinePatch m36710b(Context context, float[] fArr, float f) {
        float m16909m;
        float f2;
        float max = f + Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]);
        float max2 = f + Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]);
        m16909m = _Ranges.m16909m(f, 1.0f, 25.0f);
        if (f <= 25.0f) {
            f2 = 1.0f;
        } else {
            f2 = 25.0f / f;
        }
        float f3 = f * 2;
        int i = (int) ((max + f3) * f2);
        int i2 = (int) ((f3 + max2) * f2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          ….Config.ALPHA_8\n        )");
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(\n          ….Config.ALPHA_8\n        )");
        m36708d(createBitmap, max, max2, fArr, m16909m, f2);
        m36711a(createBitmap, context, createBitmap2, m16909m);
        createBitmap.recycle();
        if (f2 < 1.0f) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap2, (int) (createBitmap2.getWidth() / f2), (int) (createBitmap2.getHeight() / f2), true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
            createBitmap2.recycle();
            createBitmap2 = createScaledBitmap;
        }
        return m36706f(createBitmap2);
    }

    /* renamed from: c */
    private final byte[] m36709c(int i, int i2) {
        int i3 = i2 / 2;
        int i4 = i / 2;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i4 - 1);
        order.putInt(i4 + 1);
        order.putInt(i3 - 1);
        order.putInt(i3 + 1);
        for (int i5 = 0; i5 < 9; i5++) {
            order.putInt(1);
        }
        byte[] array = order.array();
        Intrinsics.checkNotNullExpressionValue(array, "buffer.array()");
        return array;
    }

    /* renamed from: d */
    private final void m36708d(Bitmap bitmap, float f, float f2, float[] fArr, float f3, float f4) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f, f2);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int save = canvas.save();
        canvas.translate(f3, f3);
        try {
            int save2 = canvas.save();
            canvas.scale(f4, f4, 0.0f, 0.0f);
            roundRectShape.draw(canvas, f75881b);
            canvas.restoreToCount(save2);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: f */
    private final NinePatch m36706f(Bitmap bitmap) {
        return new NinePatch(bitmap, m36709c(bitmap.getWidth(), bitmap.getHeight()));
    }

    @NotNull
    /* renamed from: e */
    public final NinePatch m36707e(@NotNull Context context, @NotNull float[] radii, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(radii, "radii");
        Map<C29741a, NinePatch> map = f75882c;
        C29741a c29741a = new C29741a(radii, f);
        NinePatch ninePatch = map.get(c29741a);
        if (ninePatch == null) {
            ninePatch = f75880a.m36710b(context, radii, f);
            map.put(c29741a, ninePatch);
        }
        return ninePatch;
    }
}
