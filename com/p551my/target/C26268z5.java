package com.p551my.target;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.p551my.target.C26268z5;

/* renamed from: com.my.target.z5 */
/* loaded from: classes7.dex */
public class C26268z5 extends C25789h0 {

    /* renamed from: d */
    public InterfaceC26269a f68416d;

    /* renamed from: e */
    public boolean f68417e;

    /* renamed from: f */
    public boolean f68418f;

    /* renamed from: g */
    public int f68419g;

    /* renamed from: com.my.target.z5$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26269a {
        /* renamed from: a */
        void mo42247a(boolean z);

        /* renamed from: b */
        void mo42246b();
    }

    /* renamed from: com.my.target.z5$b */
    /* loaded from: classes7.dex */
    public static class C26270b extends GestureDetector {

        /* renamed from: a */
        public final View f68420a;

        /* renamed from: b */
        public InterfaceC26271a f68421b;

        /* renamed from: com.my.target.z5$b$a */
        /* loaded from: classes7.dex */
        public interface InterfaceC26271a {
            /* renamed from: a */
            void mo42224a();
        }

        public C26270b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        /* renamed from: a */
        public final boolean m42244a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }

        public C26270b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f68420a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void m42245a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f68421b == null) {
                        AbstractC25846ja.m43680a("MraidWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        return;
                    }
                    AbstractC25846ja.m43680a("MraidWebView$ViewGestureDetector: Gestures - user clicked");
                    this.f68421b.mo42224a();
                    return;
                } else if (action != 2 || !m42244a(motionEvent, this.f68420a)) {
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void m42243a(InterfaceC26271a interfaceC26271a) {
            this.f68421b = interfaceC26271a;
        }
    }

    public C26268z5(Context context) {
        super(context);
        boolean z;
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f68417e = z;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        final C26270b c26270b = new C26270b(getContext(), this);
        c26270b.m42243a(new C26270b.InterfaceC26271a() { // from class: com.my.target.zf
            @Override // com.p551my.target.C26268z5.C26270b.InterfaceC26271a
            /* renamed from: a */
            public final void mo42224a() {
                C26268z5.m42250g(C26268z5.this);
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.ag
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C26268z5.m42253a(C26268z5.C26270b.this, view, motionEvent);
            }
        });
    }

    /* renamed from: g */
    public static /* synthetic */ void m42250g(C26268z5 c26268z5) {
        c26268z5.m42248i();
    }

    /* renamed from: i */
    public /* synthetic */ void m42248i() {
        this.f68418f = true;
    }

    /* renamed from: a */
    public final void m42254a(int i, int i2) {
        int i3 = ((float) i) / ((float) i2) > 1.0f ? 2 : 1;
        if (i3 != this.f68419g) {
            this.f68419g = i3;
            InterfaceC26269a interfaceC26269a = this.f68416d;
            if (interfaceC26269a != null) {
                interfaceC26269a.mo42246b();
            }
        }
    }

    /* renamed from: h */
    public boolean m42249h() {
        return this.f68417e;
    }

    @Override // com.p551my.target.C25789h0, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m42254a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f68417e) {
            this.f68417e = z;
            InterfaceC26269a interfaceC26269a = this.f68416d;
            if (interfaceC26269a != null) {
                interfaceC26269a.mo42247a(z);
            }
        }
    }

    @VisibleForTesting
    public void setClicked(boolean z) {
        this.f68418f = z;
    }

    public void setVisibilityChangedListener(@Nullable InterfaceC26269a interfaceC26269a) {
        this.f68416d = interfaceC26269a;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m42253a(C26270b c26270b, View view, MotionEvent motionEvent) {
        c26270b.m42245a(motionEvent);
        return false;
    }

    /* renamed from: g */
    public boolean m42251g() {
        return this.f68418f;
    }

    /* renamed from: a */
    public void m42252a(boolean z) {
        AbstractC25846ja.m43680a("MraidWebView: Pause, finishing " + z);
        if (z) {
            m43808f();
            m43815a("");
        }
        m43810d();
    }
}
