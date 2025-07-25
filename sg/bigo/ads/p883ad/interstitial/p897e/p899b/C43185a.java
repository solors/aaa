package sg.bigo.ads.p883ad.interstitial.p897e.p899b;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.p883ad.interstitial.p897e.AbstractC43198d;
import sg.bigo.ads.p883ad.interstitial.p897e.C43204j;

/* renamed from: sg.bigo.ads.ad.interstitial.e.b.a */
/* loaded from: classes10.dex */
public final class C43185a extends RealtimeBlurLinearLayout {

    /* renamed from: a */
    public AbstractC43198d f113025a;

    public C43185a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    public final AbstractC43198d getIconAdsRenderStyle() {
        return this.f113025a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        AbstractC43198d abstractC43198d = this.f113025a;
        if ((abstractC43198d instanceof C43204j) && abstractC43198d.m5958b() == 4) {
            int defaultSize = (int) ((i3 * 2) + (((View.getDefaultSize(Integer.MIN_VALUE, i) - (((C43204j) this.f113025a).f113076i * 3.0f)) / 4.0f) * 3.0f));
            setMeasuredDimension(defaultSize, getMeasuredHeight());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                measureChildWithMargins(getChildAt(i4), makeMeasureSpec, 0, i2, 0);
            }
        }
    }

    private C43185a(@NonNull Context context, byte b) {
        this(context, (char) 0);
    }

    private C43185a(@NonNull Context context, char c) {
        super(context, null, 0);
    }
}
