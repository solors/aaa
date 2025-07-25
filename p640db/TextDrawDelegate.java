package p640db;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: db.a */
/* loaded from: classes8.dex */
public final class TextDrawDelegate {
    @NotNull

    /* renamed from: a */
    private final SliderTextStyle f89572a;
    @NotNull

    /* renamed from: b */
    private final Rect f89573b;
    @NotNull

    /* renamed from: c */
    private final Paint f89574c;
    @Nullable

    /* renamed from: d */
    private String f89575d;

    /* renamed from: e */
    private float f89576e;

    /* renamed from: f */
    private float f89577f;

    public TextDrawDelegate(@NotNull SliderTextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.f89572a = textStyle;
        this.f89573b = new Rect();
        Paint paint = new Paint(1);
        paint.setTextSize(textStyle.m36208a());
        paint.setColor(textStyle.m36204e());
        paint.setTypeface(textStyle.m36207b());
        paint.setStyle(Paint.Style.FILL);
        this.f89574c = paint;
    }

    /* renamed from: a */
    public final void m25668a(@NotNull Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String str = this.f89575d;
        if (str != null) {
            canvas.drawText(str, (f - this.f89576e) + this.f89572a.m36206c(), f2 + this.f89577f + this.f89572a.m36205d(), this.f89574c);
        }
    }

    /* renamed from: b */
    public final void m25667b(@Nullable String str) {
        int i;
        this.f89575d = str;
        Paint paint = this.f89574c;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        paint.getTextBounds(str, 0, i, this.f89573b);
        this.f89576e = this.f89574c.measureText(this.f89575d) / 2.0f;
        this.f89577f = this.f89573b.height() / 2.0f;
    }
}
