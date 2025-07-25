package net.pubnative.lite.sdk.visibility;

import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class VisibilityTracker {
    private static final String TAG = "VisibilityTracker";
    private static final int VISIBILITY_CHECK_DELAY = 100;
    protected WeakReference<View> mDeviceView = null;
    protected WeakReference<Listener> mListener = null;
    protected final List<PubnativeVisibilityTrackerItem> mTrackedViews = new ArrayList();
    protected Handler mHandler = new Handler();
    protected boolean mIsVisibilityCheckScheduled = false;
    protected final VisibilityRunnable mVisibilityRunnable = new VisibilityRunnable();
    protected ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: net.pubnative.lite.sdk.visibility.b
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            return VisibilityTracker.m14132a(VisibilityTracker.this);
        }
    };

    /* loaded from: classes10.dex */
    public interface Listener {
        void onVisibilityCheck(List<View> list, List<View> list2);
    }

    /* loaded from: classes10.dex */
    public static class PubnativeVisibilityTrackerItem {
        private final String TAG = PubnativeVisibilityTrackerItem.class.getSimpleName();
        public double mMinVisibilityPercent;
        public View mTrackingView;

        protected PubnativeVisibilityTrackerItem() {
        }

        public boolean equals(Object obj) {
            if (obj instanceof View) {
                return obj.equals(this.mTrackingView);
            }
            return super.equals(obj);
        }
    }

    /* loaded from: classes10.dex */
    public class VisibilityRunnable implements Runnable {
        private final Rect mVisibleRect = new Rect();
        private final ArrayList<View> mInvisibleViews = new ArrayList<>();
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        VisibilityRunnable() {
            VisibilityTracker.this = r1;
        }

        protected boolean isVisible(PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem) {
            View view = pubnativeVisibilityTrackerItem.mTrackingView;
            if (view == null || !view.isShown() || view.getParent() == null || !view.getLocalVisibleRect(this.mVisibleRect) || (this.mVisibleRect.height() * this.mVisibleRect.width()) / (view.getHeight() * view.getWidth()) < pubnativeVisibilityTrackerItem.mMinVisibilityPercent) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisibilityTracker visibilityTracker = VisibilityTracker.this;
            visibilityTracker.mIsVisibilityCheckScheduled = false;
            for (PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem : visibilityTracker.mTrackedViews) {
                if (isVisible(pubnativeVisibilityTrackerItem)) {
                    this.mVisibleViews.add(pubnativeVisibilityTrackerItem.mTrackingView);
                } else {
                    this.mInvisibleViews.add(pubnativeVisibilityTrackerItem.mTrackingView);
                }
            }
            WeakReference<Listener> weakReference = VisibilityTracker.this.mListener;
            if (weakReference != null && weakReference.get() != null) {
                VisibilityTracker.this.mListener.get().onVisibilityCheck(this.mVisibleViews, this.mInvisibleViews);
            }
            this.mInvisibleViews.clear();
            this.mVisibleViews.clear();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m14132a(VisibilityTracker visibilityTracker) {
        return visibilityTracker.lambda$new$0();
    }

    public /* synthetic */ boolean lambda$new$0() {
        WeakReference<Listener> weakReference = this.mListener;
        if (weakReference != null && weakReference.get() != null) {
            scheduleVisibilityCheck();
            return true;
        }
        clear();
        return true;
    }

    public void addView(View view, double d) {
        if (this.mDeviceView == null) {
            this.mDeviceView = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(this.mOnPreDrawListener);
            } else {
                Log.d(TAG, "Unable to start tracking, Window ViewTreeObserver is not alive");
            }
        }
        if (containsTrackedView(view)) {
            return;
        }
        PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem = new PubnativeVisibilityTrackerItem();
        pubnativeVisibilityTrackerItem.mTrackingView = view;
        pubnativeVisibilityTrackerItem.mMinVisibilityPercent = d;
        this.mTrackedViews.add(pubnativeVisibilityTrackerItem);
        scheduleVisibilityCheck();
    }

    public void clear() {
        View view;
        this.mHandler.removeMessages(0);
        this.mTrackedViews.clear();
        this.mIsVisibilityCheckScheduled = false;
        WeakReference<View> weakReference = this.mDeviceView;
        if (weakReference != null && (view = weakReference.get()) != null && this.mOnPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
            }
            this.mOnPreDrawListener = null;
        }
        this.mListener = null;
    }

    protected boolean containsTrackedView(View view) {
        if (indexOfTrackedView(view) >= 0) {
            return true;
        }
        return false;
    }

    protected int indexOfTrackedView(View view) {
        for (int i = 0; i < this.mTrackedViews.size(); i++) {
            if (this.mTrackedViews.get(i).equals(view)) {
                return i;
            }
        }
        return -1;
    }

    public void removeView(View view) {
        this.mTrackedViews.remove(view);
    }

    protected void scheduleVisibilityCheck() {
        if (!this.mIsVisibilityCheckScheduled) {
            this.mIsVisibilityCheckScheduled = true;
            this.mHandler.postDelayed(this.mVisibilityRunnable, 100L);
        }
    }

    public void setListener(Listener listener) {
        this.mListener = new WeakReference<>(listener);
    }
}
