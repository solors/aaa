package com.mobilefuse.sdk.tracking;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.internal.IntervalTaskRunner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewVisibilityTracker.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ViewVisibilityTracker {
    private final int VISIBILITY_CHECK_DELAY_MS;
    @NotNull
    private final Context context;
    private OnVisibilityChangeListener listener;
    private final List<OnTimedVisibilityCompleteListener> timedListeners;
    private final IntervalTaskRunner timedVisibilityChecker;
    @NotNull
    private final View view;
    private int visiblePercent;

    /* compiled from: ViewVisibilityTracker.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface OnTimedVisibilityCompleteListener {
        int getRequiredMilliSeconds();

        int getRequiredViewPercent();

        int getTimeAtRequiredPercent();

        void onVisibilityComplete();

        void setTimeAtRequiredPercent(int i);
    }

    /* compiled from: ViewVisibilityTracker.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface OnVisibilityChangeListener {
        void onVisibilityChange(int i);
    }

    public ViewVisibilityTracker(@NotNull Context context, @NotNull View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        this.context = context;
        this.view = view;
        this.VISIBILITY_CHECK_DELAY_MS = 200;
        this.timedListeners = new ArrayList();
        IntervalTaskRunner intervalTaskRunner = new IntervalTaskRunner(200, true, new IntervalTaskRunner.Listener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$timedVisibilityChecker$1
            @Override // com.mobilefuse.sdk.internal.IntervalTaskRunner.Listener
            public final void onTaskRun() {
                ViewVisibilityTracker.access$checkTimedVisibility(ViewVisibilityTracker.this);
            }
        });
        this.timedVisibilityChecker = intervalTaskRunner;
        startVisibilityTracking();
        intervalTaskRunner.start();
    }

    public static final /* synthetic */ void access$checkTimedVisibility(ViewVisibilityTracker viewVisibilityTracker) {
        viewVisibilityTracker.checkTimedVisibility();
    }

    public static final /* synthetic */ void access$checkViewability(ViewVisibilityTracker viewVisibilityTracker) {
        viewVisibilityTracker.checkViewability();
    }

    public final void checkTimedVisibility() {
        try {
            checkViewability();
            HashSet hashSet = new HashSet();
            for (OnTimedVisibilityCompleteListener onTimedVisibilityCompleteListener : this.timedListeners) {
                int currentTimeMillis = (int) System.currentTimeMillis();
                if (this.visiblePercent >= onTimedVisibilityCompleteListener.getRequiredViewPercent() && onTimedVisibilityCompleteListener.getTimeAtRequiredPercent() == 0) {
                    onTimedVisibilityCompleteListener.setTimeAtRequiredPercent(currentTimeMillis);
                }
                if (this.visiblePercent < onTimedVisibilityCompleteListener.getRequiredViewPercent()) {
                    onTimedVisibilityCompleteListener.setTimeAtRequiredPercent(0);
                }
                if (onTimedVisibilityCompleteListener.getTimeAtRequiredPercent() < currentTimeMillis - onTimedVisibilityCompleteListener.getRequiredMilliSeconds()) {
                    onTimedVisibilityCompleteListener.onVisibilityComplete();
                    hashSet.add(onTimedVisibilityCompleteListener);
                }
            }
            this.timedListeners.removeAll(hashSet);
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final void checkViewability() {
        Rect rect = new Rect();
        int i = 0;
        if (!this.view.getGlobalVisibleRect(rect)) {
            this.visiblePercent = 0;
            return;
        }
        double height = rect.height() * rect.width();
        double height2 = this.view.getHeight() * this.view.getWidth();
        if (height2 != 0.0d) {
            i = (int) ((height / height2) * 100);
        }
        if (i != this.visiblePercent) {
            this.visiblePercent = i;
            OnVisibilityChangeListener onVisibilityChangeListener = this.listener;
            if (onVisibilityChangeListener != null) {
                onVisibilityChangeListener.onVisibilityChange(i);
            }
        }
    }

    private final void startVisibilityTracking() {
        try {
            this.view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$startVisibilityTracking$1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        ViewVisibilityTracker.access$checkViewability(ViewVisibilityTracker.this);
                    } catch (Throwable th) {
                        StabilityHelper.logException(ViewVisibilityTracker.this, th);
                    }
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    private final void stopVisibilityTracking() {
        try {
            this.view.getViewTreeObserver().removeOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$stopVisibilityTracking$1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        ViewVisibilityTracker.access$checkViewability(ViewVisibilityTracker.this);
                    } catch (Throwable th) {
                        StabilityHelper.logException(ViewVisibilityTracker.this, th);
                    }
                }
            });
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public final void dispose() {
        stopVisibilityTracking();
        this.timedVisibilityChecker.reset();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final int getVisiblePercent() {
        return this.visiblePercent;
    }

    public final void registerTimedVisibilityListener(final int i, final int i2, @NotNull final Functions<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.timedListeners.add(new OnTimedVisibilityCompleteListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$registerTimedVisibilityListener$timedListener$1
            private int timeAtRequiredPercent;

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public int getRequiredMilliSeconds() {
                return i;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public int getRequiredViewPercent() {
                return i2;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public int getTimeAtRequiredPercent() {
                return this.timeAtRequiredPercent;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public void onVisibilityComplete() {
                onComplete.invoke();
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public void setTimeAtRequiredPercent(int i3) {
                this.timeAtRequiredPercent = i3;
            }
        });
    }

    public final void setOnVisibilityChangeListener(@NotNull OnVisibilityChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setVisiblePercent(int i) {
        this.visiblePercent = i;
    }
}
