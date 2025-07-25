package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.C19093S2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.S2 */
/* loaded from: classes6.dex */
public final class C19093S2 extends AbstractC19515wc {

    /* renamed from: n */
    public final InterfaceC18850A4 f47679n;

    /* renamed from: o */
    public final String f47680o;

    /* renamed from: p */
    public final ViewTreeObserver.OnPreDrawListener f47681p;

    /* renamed from: q */
    public final WeakReference f47682q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19093S2(C19072Q6 visibilityChecker, Activity activity, InterfaceC18850A4 interfaceC18850A4) {
        super(visibilityChecker, (byte) 1, interfaceC18850A4);
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f47679n = interfaceC18850A4;
        String TAG = C19093S2.class.getSimpleName();
        this.f47680o = TAG;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f47682q = new WeakReference(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: o3.b2
                {
                    C19093S2.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return C19093S2.m60723a(C19093S2.this);
                }
            };
            this.f47681p = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61255b(TAG, "Visibility Tracker was unable to track views because the  root view tree observer was not alive");
        }
    }

    /* renamed from: a */
    public static final boolean m60723a(C19093S2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m59596g();
        return true;
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: b */
    public final void mo59601b() {
        InterfaceC18850A4 interfaceC18850A4 = this.f47679n;
        if (interfaceC18850A4 != null) {
            String TAG = this.f47680o;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61254c(TAG, "unregisterPreDrawListener");
        }
        View view = (View) this.f47682q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f47681p);
            }
        }
        super.mo59601b();
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: c */
    public final int mo59600c() {
        return 100;
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: e */
    public final void mo59598e() {
        InterfaceC18850A4 interfaceC18850A4 = this.f47679n;
        if (interfaceC18850A4 != null) {
            String TAG = this.f47680o;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61254c(TAG, "pause");
        }
        if (!this.f48853i.get()) {
            InterfaceC18850A4 interfaceC18850A42 = this.f47679n;
            if (interfaceC18850A42 != null) {
                String TAG2 = this.f47680o;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) interfaceC18850A42).m61254c(TAG2, "unregisterPreDrawListener");
            }
            View view = (View) this.f47682q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f47681p);
                }
            }
            super.mo59598e();
        }
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: f */
    public final void mo59597f() {
        InterfaceC18850A4 interfaceC18850A4 = this.f47679n;
        if (interfaceC18850A4 != null) {
            String TAG = this.f47680o;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61254c(TAG, "resume");
        }
        if (this.f48853i.get()) {
            View view = (View) this.f47682q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f47681p);
                } else {
                    InterfaceC18850A4 interfaceC18850A42 = this.f47679n;
                    if (interfaceC18850A42 != null) {
                        String TAG2 = this.f47680o;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        ((C18864B4) interfaceC18850A42).m61255b(TAG2, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                    }
                }
            }
            super.mo59597f();
        }
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: d */
    public final void mo59599d() {
    }
}
