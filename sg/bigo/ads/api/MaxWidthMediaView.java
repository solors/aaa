package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public class MaxWidthMediaView extends MediaView {

    /* renamed from: a */
    private int f114018a;

    public MaxWidthMediaView(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f114018a;
        if (i3 > 0 && size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(this.f114018a, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxWidth(int i) {
        this.f114018a = i;
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxWidthMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
