package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.p938a.C43874a;
import sg.bigo.ads.common.view.p938a.C43875b;
import sg.bigo.ads.common.view.p938a.C43877d;
import sg.bigo.ads.common.view.p938a.InterfaceC43876c;

/* loaded from: classes10.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements InterfaceC43876c<RealtimeBlurLinearLayout> {

    /* renamed from: a */
    private final C43877d<RealtimeBlurLinearLayout> f114776a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof C43874a) {
            return ((C43874a) background).f114413a;
        }
        return background;
    }

    @Nullable
    public C43875b getBlurStyle() {
        return this.f114776a.f114890d.f114875b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C43877d<RealtimeBlurLinearLayout> c43877d = this.f114776a;
        View m4807a = C43841u.m4807a(c43877d.f114889c, c43877d.f114888b);
        c43877d.f114892f = m4807a;
        boolean z = false;
        if (m4807a != null) {
            m4807a.getViewTreeObserver().addOnPreDrawListener(c43877d.f114894h);
            c43877d.m4714a();
            if (c43877d.f114892f.getRootView() != c43877d.f114888b.getRootView()) {
                z = true;
            }
            c43877d.f114893g = z;
            if (z) {
                c43877d.f114892f.postInvalidate();
                return;
            }
            return;
        }
        c43877d.f114893g = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C43877d<RealtimeBlurLinearLayout> c43877d = this.f114776a;
        View view = c43877d.f114892f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(c43877d.f114894h);
        }
        c43877d.m4711b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        C43877d<RealtimeBlurLinearLayout> c43877d = this.f114776a;
        C43874a c43874a = c43877d.f114890d;
        if (drawable != c43874a) {
            c43874a.m5153a(drawable);
            c43877d.m4711b();
        }
        super.setBackground(c43877d.f114890d);
    }

    @Override // sg.bigo.ads.common.view.p938a.InterfaceC43876c
    public void setBlurStyle(@Nullable C43875b c43875b) {
        this.f114776a.setBlurStyle(c43875b);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C43877d<RealtimeBlurLinearLayout> c43877d = new C43877d<>(this);
        this.f114776a = c43877d;
        setBackground(c43877d.f114890d);
    }
}
