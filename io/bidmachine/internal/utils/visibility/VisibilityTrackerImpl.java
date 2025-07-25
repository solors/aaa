package io.bidmachine.internal.utils.visibility;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilityParams;
import io.bidmachine.internal.utils.LogSafeRunnable;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class VisibilityTrackerImpl implements VisibilityTracker {
    private static final int AFD_MAX_COUNT_OVERLAPPED_VIEWS = 3;
    private static final int CHECK_DELAY = 100;
    private static final int NO_TRACK = -1;
    private boolean isFinishedRequested;
    private boolean isFinishedTracked;
    private boolean isShownTracked;
    private long lastShownTimeMs;
    @NonNull
    private final VisibilityParams visibilityParams;
    @NonNull
    private final VisibilityTrackerListener visibilityTrackerListener;
    @NonNull
    private final WeakReference<View> weakView;
    @NonNull
    private final ViewTreeObserver.OnPreDrawListener preDrawListener = new ViewTreeObserver$OnPreDrawListenerC35728d();
    @NonNull
    private final Runnable checkRunnable = new C35726b();
    @NonNull
    private final Runnable finishRunnable = new C35727c();
    @NonNull
    private final Object lock = new Object();
    @NonNull
    private final AtomicBoolean isStarted = new AtomicBoolean(false);
    @NonNull
    private final AtomicBoolean isCheckerScheduled = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.internal.utils.visibility.VisibilityTrackerImpl$b */
    /* loaded from: classes9.dex */
    public class C35726b implements LogSafeRunnable {
        private C35726b() {
            VisibilityTrackerImpl.this = r1;
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onRun() throws Throwable {
            if (!VisibilityTrackerImpl.this.check()) {
                VisibilityTrackerImpl.this.forceScheduleChecker();
            }
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onThrows(@NonNull Throwable th) throws Throwable {
            super.onThrows(th);
            VisibilityTrackerImpl.this.forceScheduleChecker();
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.internal.utils.visibility.VisibilityTrackerImpl$c */
    /* loaded from: classes9.dex */
    public class C35727c implements LogSafeRunnable {
        private C35727c() {
            VisibilityTrackerImpl.this = r1;
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        public void onRun() throws Throwable {
            VisibilityTrackerImpl.this.stop();
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable
        @CallSuper
        public /* bridge */ /* synthetic */ void onThrows(@NonNull Throwable th) throws Throwable {
            super.onThrows(th);
        }

        @Override // io.bidmachine.internal.utils.LogSafeRunnable, io.bidmachine.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.internal.utils.visibility.VisibilityTrackerImpl$d */
    /* loaded from: classes9.dex */
    public class ViewTreeObserver$OnPreDrawListenerC35728d implements ViewTreeObserver.OnPreDrawListener {
        private ViewTreeObserver$OnPreDrawListenerC35728d() {
            VisibilityTrackerImpl.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            VisibilityTrackerImpl.this.scheduleChecker();
            return true;
        }
    }

    public VisibilityTrackerImpl(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        this.weakView = new WeakReference<>(view);
        this.visibilityParams = visibilityParams;
        this.visibilityTrackerListener = visibilityTrackerListener;
    }

    public boolean check() {
        View view = getView();
        if (view == null) {
            stop();
            return true;
        } else if (this.isShownTracked && this.isFinishedTracked) {
            stop();
            return true;
        } else {
            long timeThresholdMs = this.visibilityParams.getTimeThresholdMs();
            if (isVisibilityVerified(view, this.visibilityParams.getPixelThreshold(), this.visibilityParams.isIgnoreWindowFocus(), this.visibilityParams.isIgnoreOverlap()) && this.visibilityTrackerListener.onViewShown()) {
                this.isShownTracked = true;
                if (!this.isFinishedRequested && !this.isFinishedTracked) {
                    Utils.onUiThread(this.finishRunnable, timeThresholdMs);
                    this.lastShownTimeMs = System.currentTimeMillis();
                    this.isFinishedRequested = true;
                }
            } else if (!this.isFinishedTracked) {
                Utils.cancelUiThreadTask(this.finishRunnable);
                this.lastShownTimeMs = 0L;
                this.isFinishedRequested = false;
            }
            return false;
        }
    }

    @Nullable
    private View findContentOrRootView(@NonNull View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
        }
        return view2;
    }

    public void forceScheduleChecker() {
        this.isCheckerScheduled.set(false);
        scheduleChecker();
    }

    private boolean isVisibilityVerified(@NonNull View view, final float f, boolean z, boolean z2) {
        final String view2;
        try {
            view2 = view.toString();
        } catch (Exception e) {
            Logger.m20086w(e);
        }
        if (!view.isShown()) {
            Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$isVisibilityVerified$2;
                    lambda$isVisibilityVerified$2 = VisibilityTrackerImpl.lambda$isVisibilityVerified$2(view2);
                    return lambda$isVisibilityVerified$2;
                }
            });
            return false;
        } else if (Utils.isViewTransparent(view)) {
            Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.f
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$isVisibilityVerified$3;
                    lambda$isVisibilityVerified$3 = VisibilityTrackerImpl.lambda$isVisibilityVerified$3(view2);
                    return lambda$isVisibilityVerified$3;
                }
            });
            return false;
        } else if (!z && !view.hasWindowFocus()) {
            Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.g
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$isVisibilityVerified$4;
                    lambda$isVisibilityVerified$4 = VisibilityTrackerImpl.lambda$isVisibilityVerified$4(view2);
                    return lambda$isVisibilityVerified$4;
                }
            });
            return false;
        } else {
            float width = view.getWidth() * view.getHeight();
            if (width == 0.0f) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.h
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$isVisibilityVerified$5;
                        lambda$isVisibilityVerified$5 = VisibilityTrackerImpl.lambda$isVisibilityVerified$5(view2);
                        return lambda$isVisibilityVerified$5;
                    }
                });
                return false;
            }
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.i
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$isVisibilityVerified$6;
                        lambda$isVisibilityVerified$6 = VisibilityTrackerImpl.lambda$isVisibilityVerified$6(view2);
                        return lambda$isVisibilityVerified$6;
                    }
                });
                return false;
            }
            final float width2 = (rect.width() * rect.height()) / width;
            if (width2 < f) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.j
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$isVisibilityVerified$7;
                        lambda$isVisibilityVerified$7 = VisibilityTrackerImpl.lambda$isVisibilityVerified$7(width2, f, view2);
                        return lambda$isVisibilityVerified$7;
                    }
                });
                return false;
            }
            View findContentOrRootView = findContentOrRootView(view);
            if (findContentOrRootView == null) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.k
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$isVisibilityVerified$8;
                        lambda$isVisibilityVerified$8 = VisibilityTrackerImpl.lambda$isVisibilityVerified$8(view2);
                        return lambda$isVisibilityVerified$8;
                    }
                });
                return false;
            }
            Rect rect2 = new Rect();
            findContentOrRootView.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.l
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$isVisibilityVerified$9;
                        lambda$isVisibilityVerified$9 = VisibilityTrackerImpl.lambda$isVisibilityVerified$9(view2);
                        return lambda$isVisibilityVerified$9;
                    }
                });
                return false;
            }
            if (!z2) {
                ViewGroup viewGroup = (ViewGroup) view.getRootView();
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                final int i = 0;
                while (viewGroup2 != null) {
                    for (int indexOfChild = viewGroup2.indexOfChild(view) + 1; indexOfChild < viewGroup2.getChildCount(); indexOfChild++) {
                        final View childAt = viewGroup2.getChildAt(indexOfChild);
                        if (childAt.getVisibility() == 0) {
                            Rect viewRectangle = Utils.getViewRectangle(childAt);
                            if (Rect.intersects(rect, viewRectangle)) {
                                final float viewNotOverlappedAreaPercent = viewNotOverlappedAreaPercent(rect, viewRectangle);
                                if (viewNotOverlappedAreaPercent < f) {
                                    Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.b
                                        @Override // io.bidmachine.utils.lazy.LazyValue
                                        public final Object get() {
                                            String lambda$isVisibilityVerified$10;
                                            lambda$isVisibilityVerified$10 = VisibilityTrackerImpl.lambda$isVisibilityVerified$10(viewNotOverlappedAreaPercent, f, view2, childAt);
                                            return lambda$isVisibilityVerified$10;
                                        }
                                    });
                                    return false;
                                }
                                i++;
                                if (i >= 3) {
                                    Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.c
                                        @Override // io.bidmachine.utils.lazy.LazyValue
                                        public final Object get() {
                                            String lambda$isVisibilityVerified$11;
                                            lambda$isVisibilityVerified$11 = VisibilityTrackerImpl.lambda$isVisibilityVerified$11(i, view2);
                                            return lambda$isVisibilityVerified$11;
                                        }
                                    });
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (viewGroup2 != viewGroup) {
                        ViewGroup viewGroup3 = viewGroup2;
                        viewGroup2 = (ViewGroup) viewGroup2.getParent();
                        view = viewGroup3;
                    } else {
                        viewGroup2 = null;
                    }
                }
            }
            return true;
        }
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$10(float f, float f2, String str, View view) {
        return String.format("Show wasn't tracked: ad view is covered by another view (visible percent - %s / %s, ad view - %s, overlapping view - %s)", Float.valueOf(f), Float.valueOf(f2), str, view);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$11(int i, String str) {
        return String.format("Show wasn't tracked: ad view is covered by too many views (overlapping views count - %s, ad view - %s)", Integer.valueOf(i), str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$2(String str) {
        return String.format("Show wasn't tracked: view visibility verification failed - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$3(String str) {
        return String.format("Show wasn't tracked: view transparent verification failed - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$4(String str) {
        return String.format("Show wasn't tracked: window focus verification failed - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$5(String str) {
        return String.format("Show wasn't tracked: view size verification failed - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$6(String str) {
        return String.format("Show wasn't tracked: global visibility verification failed - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$7(float f, float f2, String str) {
        return String.format("Show wasn't tracked: ad view not completely visible (%s / %s) - %s", Float.valueOf(f), Float.valueOf(f2), str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$8(String str) {
        return String.format("Show wasn't tracked: content or root layout not found - %s", str);
    }

    public static /* synthetic */ String lambda$isVisibilityVerified$9(String str) {
        return String.format("Show wasn't tracked: ad view is out of current window - %s", str);
    }

    public static /* synthetic */ String lambda$start$0(View view) {
        return String.format("Start tracking - %s", view);
    }

    public static /* synthetic */ String lambda$stop$1(View view) {
        return String.format("Stop tracking - %s", view);
    }

    public void scheduleChecker() {
        if (!this.isCheckerScheduled.compareAndSet(false, true)) {
            return;
        }
        Utils.cancelUiThreadTask(this.checkRunnable);
        Utils.onUiThread(this.checkRunnable, 100L);
    }

    private float viewNotOverlappedAreaPercent(@NonNull Rect rect, @NonNull Rect rect2) {
        int width = rect.width() * rect.height();
        if (width == 0) {
            return 0.0f;
        }
        return (width - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / width;
    }

    @Nullable
    @VisibleForTesting
    View getView() {
        return this.weakView.get();
    }

    @Override // io.bidmachine.internal.utils.visibility.VisibilityTracker
    public void start() {
        synchronized (this.lock) {
            if (!this.isStarted.compareAndSet(false, true)) {
                return;
            }
            final View view = getView();
            if (view == null) {
                stop();
                return;
            }
            Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.d
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$start$0;
                    lambda$start$0 = VisibilityTrackerImpl.lambda$start$0(view);
                    return lambda$start$0;
                }
            });
            view.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        }
    }

    @Override // io.bidmachine.internal.utils.visibility.VisibilityTracker
    public void stop() {
        synchronized (this.lock) {
            this.isStarted.set(false);
            final View view = getView();
            if (view != null) {
                Logger.m20096d(new LazyValue() { // from class: io.bidmachine.internal.utils.visibility.a
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$stop$1;
                        lambda$stop$1 = VisibilityTrackerImpl.lambda$stop$1(view);
                        return lambda$stop$1;
                    }
                });
                long timeThresholdMs = this.visibilityParams.getTimeThresholdMs();
                if (this.isShownTracked && !this.isFinishedTracked && timeThresholdMs > -1 && this.lastShownTimeMs > 0 && System.currentTimeMillis() - this.lastShownTimeMs >= timeThresholdMs) {
                    this.isFinishedTracked = true;
                    this.visibilityTrackerListener.onViewTrackingFinished();
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
                }
            }
            Utils.cancelUiThreadTask(this.checkRunnable);
            Utils.cancelUiThreadTask(this.finishRunnable);
        }
    }
}
