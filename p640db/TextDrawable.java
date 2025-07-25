package p640db;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: db.b */
/* loaded from: classes8.dex */
public final class TextDrawable extends Drawable {
    @NotNull

    /* renamed from: a */
    private final SliderTextStyle f89578a;
    @NotNull

    /* renamed from: b */
    private TextDrawDelegate f89579b;
    @NotNull

    /* renamed from: c */
    private final RectF f89580c;

    public TextDrawable(@NotNull SliderTextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.f89578a = textStyle;
        this.f89579b = new TextDrawDelegate(textStyle);
        this.f89580c = new RectF();
    }

    /* renamed from: a */
    public final void m25666a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f89579b.m25667b(text);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f89580c.set(getBounds());
        this.f89579b.m25668a(canvas, this.f89580c.centerX(), this.f89580c.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.f89578a.m36208a() + Math.abs(this.f89578a.m36205d()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.f89580c.width() + Math.abs(this.f89578a.m36206c()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
