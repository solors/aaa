package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes10.dex */
public class HeightScrollView extends ScrollView {

    /* renamed from: a */
    private InterfaceC43850a f114716a;

    /* renamed from: b */
    private boolean f114717b;

    /* renamed from: c */
    private View f114718c;

    /* renamed from: d */
    private int f114719d;

    /* renamed from: sg.bigo.ads.common.view.HeightScrollView$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43850a {
        /* renamed from: a */
        void mo4782a(int i);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.f114717b = true;
        this.f114719d = 0;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        View view = this.f114718c;
        if (view != null) {
            this.f114719d = view.getHeight() - i2;
        }
        InterfaceC43850a interfaceC43850a = this.f114716a;
        if (interfaceC43850a != null) {
            interfaceC43850a.mo4782a(i2);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.f114717b) {
            if (this.f114718c != null && y < this.f114719d) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public void setBlankView(View view) {
        this.f114718c = view;
    }

    public void setOnScrollListener(InterfaceC43850a interfaceC43850a) {
        this.f114716a = interfaceC43850a;
    }

    public void setScrollEnable(boolean z) {
        this.f114717b = z;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114717b = true;
        this.f114719d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114717b = true;
        this.f114719d = 0;
    }
}
