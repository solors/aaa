package p853r;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37784p;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import p853r.AbstractC39420c;
import sd.C42688d;
import sd.IntrinsicsJvm;

@Metadata
/* renamed from: r.l */
/* loaded from: classes2.dex */
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    /* compiled from: ViewSizeResolver.kt */
    @Metadata
    /* renamed from: r.l$a */
    /* loaded from: classes2.dex */
    public static final class C39427a {

        /* compiled from: ViewSizeResolver.kt */
        @Metadata
        /* renamed from: r.l$a$a */
        /* loaded from: classes2.dex */
        static final class C39428a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            final /* synthetic */ ViewSizeResolver<T> f103652g;

            /* renamed from: h */
            final /* synthetic */ ViewTreeObserver f103653h;

            /* renamed from: i */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC39429b f103654i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C39428a(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver$OnPreDrawListenerC39429b viewTreeObserver$OnPreDrawListenerC39429b) {
                super(1);
                this.f103652g = viewSizeResolver;
                this.f103653h = viewTreeObserver;
                this.f103654i = viewTreeObserver$OnPreDrawListenerC39429b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.f99208a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                C39427a.m12712g(this.f103652g, this.f103653h, this.f103654i);
            }
        }

        /* compiled from: ViewSizeResolver.kt */
        @Metadata
        /* renamed from: r.l$a$b */
        /* loaded from: classes2.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC39429b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            private boolean f103655b;

            /* renamed from: c */
            final /* synthetic */ ViewSizeResolver<T> f103656c;

            /* renamed from: d */
            final /* synthetic */ ViewTreeObserver f103657d;

            /* renamed from: f */
            final /* synthetic */ InterfaceC37780o<C39424i> f103658f;

            /* JADX WARN: Multi-variable type inference failed */
            ViewTreeObserver$OnPreDrawListenerC39429b(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, InterfaceC37780o<? super C39424i> interfaceC37780o) {
                this.f103656c = viewSizeResolver;
                this.f103657d = viewTreeObserver;
                this.f103658f = interfaceC37780o;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C39424i m12714e = C39427a.m12714e(this.f103656c);
                if (m12714e != null) {
                    C39427a.m12712g(this.f103656c, this.f103657d, this);
                    if (!this.f103655b) {
                        this.f103655b = true;
                        this.f103658f.resumeWith(Result.m14549b(m12714e));
                    }
                }
                return true;
            }
        }

        /* renamed from: c */
        private static <T extends View> AbstractC39420c m12716c(ViewSizeResolver<T> viewSizeResolver, int i, int i2, int i3) {
            if (i == -2) {
                return AbstractC39420c.C39422b.f103636a;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return Dimension.m12727a(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return Dimension.m12727a(i5);
            }
            return null;
        }

        /* renamed from: d */
        private static <T extends View> AbstractC39420c m12715d(ViewSizeResolver<T> viewSizeResolver) {
            int i;
            int i2;
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = -1;
            }
            int height = viewSizeResolver.getView().getHeight();
            if (viewSizeResolver.mo12719a()) {
                i2 = viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom();
            } else {
                i2 = 0;
            }
            return m12716c(viewSizeResolver, i, height, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static <T extends View> C39424i m12714e(ViewSizeResolver<T> viewSizeResolver) {
            AbstractC39420c m12715d;
            AbstractC39420c m12713f = m12713f(viewSizeResolver);
            if (m12713f == null || (m12715d = m12715d(viewSizeResolver)) == null) {
                return null;
            }
            return new C39424i(m12713f, m12715d);
        }

        /* renamed from: f */
        private static <T extends View> AbstractC39420c m12713f(ViewSizeResolver<T> viewSizeResolver) {
            int i;
            int i2;
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = -1;
            }
            int width = viewSizeResolver.getView().getWidth();
            if (viewSizeResolver.mo12719a()) {
                i2 = viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight();
            } else {
                i2 = 0;
            }
            return m12716c(viewSizeResolver, i, width, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static <T extends View> void m12712g(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        @Nullable
        /* renamed from: h */
        public static <T extends View> Object m12711h(@NotNull ViewSizeResolver<T> viewSizeResolver, @NotNull Continuation<? super C39424i> continuation) {
            Continuation m6961c;
            Object m6959e;
            C39424i m12714e = m12714e(viewSizeResolver);
            if (m12714e == null) {
                m6961c = IntrinsicsJvm.m6961c(continuation);
                C37784p c37784p = new C37784p(m6961c, 1);
                c37784p.m16132y();
                ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC39429b viewTreeObserver$OnPreDrawListenerC39429b = new ViewTreeObserver$OnPreDrawListenerC39429b(viewSizeResolver, viewTreeObserver, c37784p);
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC39429b);
                c37784p.mo15160z(new C39428a(viewSizeResolver, viewTreeObserver, viewTreeObserver$OnPreDrawListenerC39429b));
                Object m16135u = c37784p.m16135u();
                m6959e = C42688d.m6959e();
                if (m16135u == m6959e) {
                    C37591h.m17084c(continuation);
                }
                return m16135u;
            }
            return m12714e;
        }
    }

    /* renamed from: a */
    boolean mo12719a();

    @NotNull
    T getView();
}
