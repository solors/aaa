package p045cb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import com.yandex.div.internal.widget.indicator.AbstractC29814d;
import com.yandex.div.internal.widget.indicator.C29817e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: cb.b */
/* loaded from: classes8.dex */
public final class RoundedRect implements SingleIndicatorDrawer {
    @NotNull

    /* renamed from: a */
    private final C29817e f1947a;
    @NotNull

    /* renamed from: b */
    private final Paint f1948b;
    @NotNull

    /* renamed from: c */
    private final Paint f1949c;
    @NotNull

    /* renamed from: d */
    private final RectF f1950d;

    public RoundedRect(@NotNull C29817e params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f1947a = params;
        this.f1948b = new Paint();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f1949c = paint;
        this.f1950d = new RectF();
    }

    @Override // p045cb.SingleIndicatorDrawer
    /* renamed from: a */
    public void mo103528a(@NotNull Canvas canvas, @NotNull RectF rect) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        AbstractC29814d m36322a = this.f1947a.m36322a();
        Intrinsics.m17073h(m36322a, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        AbstractC29814d.C29816b c29816b = (AbstractC29814d.C29816b) m36322a;
        AbstractC29811c.C29813b mo36326d = c29816b.mo36326d();
        this.f1948b.setColor(this.f1947a.m36322a().mo36327c());
        canvas.drawRoundRect(rect, mo36326d.m36333e(), mo36326d.m36333e(), this.f1948b);
        if (c29816b.m36324f() != 0) {
            if (c29816b.m36323g() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Paint paint = this.f1949c;
                paint.setColor(c29816b.m36324f());
                paint.setStrokeWidth(c29816b.m36323g());
                canvas.drawRoundRect(rect, mo36326d.m36333e(), mo36326d.m36333e(), this.f1949c);
            }
        }
    }

    @Override // p045cb.SingleIndicatorDrawer
    /* renamed from: b */
    public void mo103527b(@NotNull Canvas canvas, float f, float f2, @NotNull AbstractC29811c itemSize, int i, float f3, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(itemSize, "itemSize");
        AbstractC29811c.C29813b c29813b = (AbstractC29811c.C29813b) itemSize;
        this.f1948b.setColor(i);
        RectF rectF = this.f1950d;
        rectF.left = (float) Math.ceil(f - (c29813b.m36331g() / 2.0f));
        rectF.top = (float) Math.ceil(f2 - (c29813b.m36332f() / 2.0f));
        rectF.right = (float) Math.ceil(f + (c29813b.m36331g() / 2.0f));
        float ceil = (float) Math.ceil(f2 + (c29813b.m36332f() / 2.0f));
        rectF.bottom = ceil;
        if (f3 > 0.0f) {
            float f4 = f3 / 2.0f;
            rectF.left += f4;
            rectF.top += f4;
            rectF.right -= f4;
            rectF.bottom = ceil - f4;
        }
        canvas.drawRoundRect(this.f1950d, c29813b.m36333e(), c29813b.m36333e(), this.f1948b);
        if (i2 != 0) {
            if (f3 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Paint paint = this.f1949c;
                paint.setColor(i2);
                paint.setStrokeWidth(f3);
                canvas.drawRoundRect(this.f1950d, c29813b.m36333e(), c29813b.m36333e(), this.f1949c);
            }
        }
    }
}
