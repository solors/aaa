package com.p551my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.my.target.z0 */
/* loaded from: classes7.dex */
public class C26261z0 extends FrameLayout {

    /* renamed from: a */
    public final int f68395a;

    /* renamed from: b */
    public final BitmapDrawable f68396b;

    /* renamed from: c */
    public final int f68397c;

    /* renamed from: d */
    public final int f68398d;

    /* renamed from: e */
    public final int f68399e;

    /* renamed from: f */
    public final Rect f68400f;

    /* renamed from: g */
    public final Rect f68401g;

    /* renamed from: h */
    public final Rect f68402h;

    /* renamed from: i */
    public final Rect f68403i;

    /* renamed from: j */
    public InterfaceC26262a f68404j;

    /* renamed from: k */
    public boolean f68405k;

    /* renamed from: l */
    public boolean f68406l;

    /* renamed from: m */
    public int f68407m;

    /* renamed from: com.my.target.z0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26262a {
        /* renamed from: c */
        void mo42227c();
    }

    public C26261z0(Context context) {
        super(context);
        this.f68400f = new Rect();
        this.f68401g = new Rect();
        this.f68402h = new Rect();
        this.f68403i = new Rect();
        this.f68407m = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC25764g0.m43887a(C25869ka.m43585e(context).m43598b(30)));
        this.f68396b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f68395a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f68397c = C25869ka.m43610a(50, context);
        this.f68398d = C25869ka.m43610a(30, context);
        this.f68399e = C25869ka.m43610a(8, context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void m42277a(int i, Rect rect, Rect rect2) {
        Gravity.apply(this.f68407m, i, i, rect, rect2);
    }

    /* renamed from: b */
    public void m42276b(int i, Rect rect, Rect rect2) {
        int i2 = this.f68398d;
        Gravity.apply(i, i2, i2, rect, rect2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f68405k) {
            this.f68405k = false;
            this.f68400f.set(0, 0, getWidth(), getHeight());
            m42277a(this.f68397c, this.f68400f, this.f68401g);
            this.f68403i.set(this.f68401g);
            Rect rect = this.f68403i;
            int i = this.f68399e;
            rect.inset(i, i);
            m42277a(this.f68398d, this.f68403i, this.f68402h);
            this.f68396b.setBounds(this.f68402h);
        }
        if (this.f68396b.isVisible()) {
            this.f68396b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return m42278a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f68405k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r5 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            android.graphics.drawable.BitmapDrawable r2 = r4.f68396b
            boolean r2 = r2.isVisible()
            r3 = 0
            if (r2 == 0) goto L35
            int r2 = r4.f68395a
            boolean r0 = r4.m42278a(r0, r1, r2)
            if (r0 == 0) goto L35
            int r5 = r5.getAction()
            r0 = 1
            if (r5 == 0) goto L32
            if (r5 == r0) goto L28
            r1 = 3
            if (r5 == r1) goto L2f
            goto L34
        L28:
            boolean r5 = r4.f68406l
            if (r5 == 0) goto L34
            r4.m42279a()
        L2f:
            r4.f68406l = r3
            goto L34
        L32:
            r4.f68406l = r0
        L34:
            return r0
        L35:
            super.onTouchEvent(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C26261z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @VisibleForTesting
    public void setCloseBounds(@NonNull Rect rect) {
        this.f68401g.set(rect);
    }

    public void setCloseGravity(int i) {
        this.f68407m = i;
    }

    public void setCloseVisible(boolean z) {
        String str;
        if (z) {
            str = "close_button";
        } else {
            str = "closeable_layout";
        }
        C25869ka.m43601a(this, str);
        if (this.f68396b.setVisible(z, false)) {
            invalidate(this.f68401g);
        }
    }

    public void setOnCloseListener(@Nullable InterfaceC26262a interfaceC26262a) {
        this.f68404j = interfaceC26262a;
    }

    /* renamed from: a */
    public final void m42279a() {
        playSoundEffect(0);
        InterfaceC26262a interfaceC26262a = this.f68404j;
        if (interfaceC26262a != null) {
            interfaceC26262a.mo42227c();
        }
    }

    /* renamed from: a */
    public boolean m42278a(int i, int i2, int i3) {
        Rect rect = this.f68401g;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }
}
