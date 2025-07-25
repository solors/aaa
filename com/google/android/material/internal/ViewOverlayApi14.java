package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes5.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {

    /* renamed from: a */
    protected OverlayViewGroup f37854a;

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@NonNull Drawable drawable) {
        this.f37854a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@NonNull Drawable drawable) {
        this.f37854a.remove(drawable);
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* loaded from: classes5.dex */
    static class OverlayViewGroup extends ViewGroup {

        /* renamed from: g */
        static Method f37855g;

        /* renamed from: b */
        ViewGroup f37856b;

        /* renamed from: c */
        View f37857c;

        /* renamed from: d */
        ArrayList<Drawable> f37858d;

        /* renamed from: f */
        private boolean f37859f;

        static {
            try {
                Class cls = Integer.TYPE;
                f37855g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        /* renamed from: a */
        private void m71288a() {
            if (!this.f37859f) {
                return;
            }
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }

        /* renamed from: b */
        private void m71287b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f37858d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f37859f = true;
                    this.f37856b.removeView(this);
                }
            }
        }

        /* renamed from: c */
        private void m71286c(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f37856b.getLocationOnScreen(iArr2);
            this.f37857c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void add(Drawable drawable) {
            m71288a();
            if (this.f37858d == null) {
                this.f37858d = new ArrayList<>();
            }
            if (this.f37858d.contains(drawable)) {
                return;
            }
            this.f37858d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr;
            int[] iArr2;
            int size;
            this.f37856b.getLocationOnScreen(new int[2]);
            this.f37857c.getLocationOnScreen(new int[2]);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f37857c.getWidth(), this.f37857c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f37858d;
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            for (int i = 0; i < size; i++) {
                this.f37858d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f37856b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f37856b != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m71286c(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
            if (this.f37856b != null && f37855g != null) {
                try {
                    m71286c(new int[2]);
                    f37855g.invoke(this.f37856b, Integer.valueOf(i), Integer.valueOf(i2), rect);
                    return null;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void remove(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f37858d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m71287b();
            }
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@NonNull Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (!super.verifyDrawable(drawable) && ((arrayList = this.f37858d) == null || !arrayList.contains(drawable))) {
                return false;
            }
            return true;
        }

        public void remove(View view) {
            super.removeView(view);
            m71287b();
        }

        public void add(View view) {
            m71288a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f37856b && viewGroup.getParent() != null && ViewCompat.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f37856b.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }
    }
}
