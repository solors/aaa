package ua;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ua.c */
/* loaded from: classes8.dex */
public final class NinePatchDrawable extends Drawable {
    @NotNull

    /* renamed from: h */
    private static final C44452a f116654h = new C44452a(null);

    /* renamed from: a */
    private int f116655a;

    /* renamed from: b */
    private int f116656b;

    /* renamed from: c */
    private int f116657c;

    /* renamed from: d */
    private int f116658d;
    @Nullable

    /* renamed from: e */
    private Bitmap f116659e;
    @Nullable

    /* renamed from: f */
    private NinePatch f116660f;
    @NotNull

    /* renamed from: g */
    private final Paint f116661g = new Paint(3);

    /* compiled from: NinePatchDrawable.kt */
    @Metadata
    /* renamed from: ua.c$a */
    /* loaded from: classes8.dex */
    private static final class C44452a {
        private C44452a() {
        }

        public /* synthetic */ C44452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final NinePatch m2925a(Bitmap bitmap) {
        return new NinePatch(bitmap, m2924b(bitmap.getWidth(), bitmap.getHeight(), this.f116655a, this.f116656b, this.f116657c, this.f116658d));
    }

    /* renamed from: b */
    private final byte[] m2924b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2 - i3;
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
        order.putInt(i4);
        order.putInt(i - i5);
        order.putInt(i6);
        order.putInt(i7);
        for (int i8 = 0; i8 < 9; i8++) {
            order.putInt(1);
        }
        byte[] array = order.array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(allocationSize)…   }\n            .array()");
        return array;
    }

    /* renamed from: c */
    public final void m2923c(@Nullable Bitmap bitmap) {
        NinePatch ninePatch;
        this.f116659e = bitmap;
        if (bitmap != null) {
            ninePatch = m2925a(bitmap);
        } else {
            ninePatch = null;
        }
        this.f116660f = ninePatch;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void m2922d(int i) {
        this.f116655a = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NinePatch ninePatch = this.f116660f;
        if (ninePatch != null) {
            ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.f116661g);
        }
    }

    /* renamed from: e */
    public final void m2921e(int i) {
        this.f116656b = i;
        invalidateSelf();
    }

    /* renamed from: f */
    public final void m2920f(int i) {
        this.f116657c = i;
        invalidateSelf();
    }

    /* renamed from: g */
    public final void m2919g(int i) {
        this.f116658d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f116661g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f116661g.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
