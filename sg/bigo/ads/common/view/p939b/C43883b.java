package sg.bigo.ads.common.view.p939b;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
/* renamed from: sg.bigo.ads.common.view.b.b */
/* loaded from: classes10.dex */
public final class C43883b extends ViewOutlineProvider {

    /* renamed from: a */
    private final float f114909a;

    public C43883b() {
        this(Float.NaN);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Rect rect;
        Path clipPath;
        if ((view instanceof InterfaceC43882a) && (clipPath = ((InterfaceC43882a) view).getClipPath()) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(clipPath);
            } else {
                outline.setConvexPath(clipPath);
            }
        } else if (!Float.isNaN(this.f114909a)) {
            Drawable background = view.getBackground();
            if (background != null) {
                rect = background.getBounds();
            } else {
                rect = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
            }
            outline.setRoundRect(rect, this.f114909a);
        }
    }

    public C43883b(float f) {
        this.f114909a = f;
    }
}
