package sg.bigo.ads.common.p907ab;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.C43840t;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.common.ab.a */
/* loaded from: classes10.dex */
public final class C43593a {
    @NonNull
    /* renamed from: a */
    public static boolean m5331a(View view, @NonNull Rect rect) {
        if (view != null && C43841u.m4793d(view)) {
            if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                return false;
            }
            return view.getGlobalVisibleRect(rect);
        }
        C43840t.m4813a();
        return false;
    }
}
