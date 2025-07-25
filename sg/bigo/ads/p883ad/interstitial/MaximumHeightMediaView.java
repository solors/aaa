package sg.bigo.ads.p883ad.interstitial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.MediaView;

/* renamed from: sg.bigo.ads.ad.interstitial.MaximumHeightMediaView */
/* loaded from: classes10.dex */
public class MaximumHeightMediaView extends MediaView {

    /* renamed from: a */
    private int f112430a;

    public MaximumHeightMediaView(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f112430a;
        if (i3 > 0 && size > i3) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f112430a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f112430a = i;
    }

    public MaximumHeightMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaximumHeightMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
