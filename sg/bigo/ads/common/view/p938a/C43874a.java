package sg.bigo.ads.common.view.p938a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.p921i.AbstractC43706a;
import sg.bigo.ads.common.view.p938a.C43877d;

/* renamed from: sg.bigo.ads.common.view.a.a */
/* loaded from: classes10.dex */
public final class C43874a extends AbstractC43706a {

    /* renamed from: b */
    public C43875b f114875b;

    @Override // sg.bigo.ads.common.p921i.AbstractC43706a, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f114413a;
        if (drawable == null) {
            return;
        }
        if ((drawable instanceof C43877d.C43880a) && !(!((C43877d.C43880a) drawable).f114904a.f114891e)) {
            return;
        }
        if (this.f114875b == null) {
            super.draw(canvas);
            return;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        Rect rect = new Rect();
        this.f114875b.m4719a(fArr);
        this.f114875b.m4720a(rect);
        Rect bounds = getBounds();
        Rect rect2 = new Rect(rect.left, rect.top, bounds.width() - rect.right, bounds.height() - rect.bottom);
        path.addRoundRect(new RectF(rect2), fArr, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        Drawable m4715e = this.f114875b.m4715e();
        if (m4715e != null) {
            m4715e.setBounds(rect2);
            m4715e.draw(canvas);
        }
    }
}
