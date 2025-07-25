package p045cb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import com.yandex.div.internal.widget.indicator.C29817e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: cb.a */
/* loaded from: classes8.dex */
public final class Circle implements SingleIndicatorDrawer {
    @NotNull

    /* renamed from: a */
    private final C29817e f1944a;
    @NotNull

    /* renamed from: b */
    private final Paint f1945b;
    @NotNull

    /* renamed from: c */
    private final RectF f1946c;

    public Circle(@NotNull C29817e params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f1944a = params;
        this.f1945b = new Paint();
        this.f1946c = new RectF();
    }

    @Override // p045cb.SingleIndicatorDrawer
    /* renamed from: a */
    public void mo103528a(@NotNull Canvas canvas, @NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f1945b.setColor(this.f1944a.m36322a().mo36327c());
        canvas.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, this.f1945b);
    }

    @Override // p045cb.SingleIndicatorDrawer
    /* renamed from: b */
    public void mo103527b(@NotNull Canvas canvas, float f, float f2, @NotNull AbstractC29811c itemSize, int i, float f3, int i2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(itemSize, "itemSize");
        AbstractC29811c.C29812a c29812a = (AbstractC29811c.C29812a) itemSize;
        this.f1945b.setColor(i);
        RectF rectF = this.f1946c;
        rectF.left = f - c29812a.m36336d();
        rectF.top = f2 - c29812a.m36336d();
        rectF.right = f + c29812a.m36336d();
        rectF.bottom = f2 + c29812a.m36336d();
        canvas.drawCircle(this.f1946c.centerX(), this.f1946c.centerY(), c29812a.m36336d(), this.f1945b);
    }
}
