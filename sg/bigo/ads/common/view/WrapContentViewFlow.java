package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes10.dex */
public class WrapContentViewFlow extends ViewFlow {
    public WrapContentViewFlow(Context context) {
        this(context, null);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow, android.view.View
    protected void onMeasure(int i, int i2) {
        int childMeasureSpec;
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i2);
        this.f114819j = Math.min(defaultSize / 10, this.f114818i);
        ((ViewFlow) this).f114810a = Math.min(Math.max(0, ((ViewFlow) this).f114810a), ((ViewFlow) this).f114811b - 1);
        int i3 = defaultSize - (this.f114813d * 2);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childAt != this.f114814e && childAt != this.f114815f) {
                    ViewFlow.C43868b c43868b = (ViewFlow.C43868b) childAt.getLayoutParams();
                    if (c43868b != null) {
                        int i6 = ((ViewGroup.LayoutParams) c43868b).width;
                        if (i6 != -2) {
                            if (i6 != -1) {
                                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                            } else {
                                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                            }
                        } else {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, this.f114813d * 2, i6);
                        }
                        childAt.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
                        i4 = Math.max(i4, childAt.getMeasuredHeight());
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
                }
            }
        }
        setMeasuredDimension(defaultSize, Math.min(i4, defaultSize2));
    }

    public WrapContentViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
