package com.explorestack.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;

/* renamed from: com.explorestack.iab.mraid.u */
/* loaded from: classes3.dex */
public class C10498u {
    @Nullable

    /* renamed from: a */
    private C10499a f23977a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.mraid.u$a */
    /* loaded from: classes3.dex */
    public static class C10499a {
        @NonNull

        /* renamed from: a */
        private final View[] f23978a;
        @Nullable

        /* renamed from: b */
        private Runnable f23979b;

        /* renamed from: c */
        private int f23980c;

        /* renamed from: d */
        final Runnable f23981d = new RunnableC10500a();

        /* renamed from: com.explorestack.iab.mraid.u$a$a */
        /* loaded from: classes3.dex */
        class RunnableC10500a implements Runnable {

            /* renamed from: com.explorestack.iab.mraid.u$a$a$a */
            /* loaded from: classes3.dex */
            class ViewTreeObserver$OnPreDrawListenerC10501a implements ViewTreeObserver.OnPreDrawListener {

                /* renamed from: b */
                final /* synthetic */ View f23983b;

                ViewTreeObserver$OnPreDrawListenerC10501a(View view) {
                    this.f23983b = view;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    this.f23983b.getViewTreeObserver().removeOnPreDrawListener(this);
                    C10499a.this.m79410d();
                    return true;
                }
            }

            RunnableC10500a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View[] viewArr;
                for (View view : C10499a.this.f23978a) {
                    if (view.getHeight() <= 0 && view.getWidth() <= 0) {
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC10501a(view));
                    } else {
                        C10499a.this.m79410d();
                    }
                }
            }
        }

        public C10499a(@NonNull View[] viewArr) {
            this.f23978a = viewArr;
        }

        /* renamed from: a */
        void m79413a() {
            C10512g.m79305l(this.f23981d);
            this.f23979b = null;
        }

        /* renamed from: b */
        public void m79412b(@NonNull Runnable runnable) {
            this.f23979b = runnable;
            this.f23980c = this.f23978a.length;
            C10512g.m79322K(this.f23981d);
        }

        /* renamed from: d */
        void m79410d() {
            Runnable runnable;
            int i = this.f23980c - 1;
            this.f23980c = i;
            if (i == 0 && (runnable = this.f23979b) != null) {
                runnable.run();
                this.f23979b = null;
            }
        }
    }

    /* renamed from: a */
    public C10499a m79415a(@NonNull View... viewArr) {
        m79414b();
        C10499a c10499a = new C10499a(viewArr);
        this.f23977a = c10499a;
        return c10499a;
    }

    /* renamed from: b */
    public void m79414b() {
        C10499a c10499a = this.f23977a;
        if (c10499a != null) {
            c10499a.m79413a();
            this.f23977a = null;
        }
    }
}
