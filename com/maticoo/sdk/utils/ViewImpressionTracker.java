package com.maticoo.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ViewImpressionTracker {
    private double minImpressionPercent;
    private WeakReference<ViewTreeObserver> treeObserverWeakReference;
    private Handler visibilityCheckHandler = new Handler(Looper.getMainLooper());
    private VisibilityCheckRunnable visibilityCheckRunnable = new VisibilityCheckRunnable();
    private boolean isVisibilityScheduled = false;
    private boolean setViewTreeObserverSucceed = false;
    private Map<View, ImpressionListener> trackedViewMap = new HashMap();
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.maticoo.sdk.utils.ViewImpressionTracker.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewImpressionTracker.this.scheduleVisibilityCheck();
            return true;
        }
    };

    /* loaded from: classes6.dex */
    public interface ImpressionListener {
        void onImpression(View view);
    }

    /* loaded from: classes6.dex */
    public class VisibilityCheckRunnable implements Runnable {
        private List<View> visibleViews = new ArrayList();

        public VisibilityCheckRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewImpressionTracker.this.isVisibilityScheduled = false;
            this.visibleViews.clear();
            for (View view : ViewImpressionTracker.this.trackedViewMap.keySet()) {
                if (ViewUtils.calViewVisiblePercent(view) >= ViewImpressionTracker.this.minImpressionPercent) {
                    this.visibleViews.add(view);
                }
            }
            for (View view2 : this.visibleViews) {
                ImpressionListener impressionListener = (ImpressionListener) ViewImpressionTracker.this.trackedViewMap.get(view2);
                if (impressionListener != null) {
                    impressionListener.onImpression(view2);
                }
                ViewImpressionTracker.this.removeView(view2);
            }
            this.visibleViews.clear();
            if (ViewImpressionTracker.this.trackedViewMap.isEmpty()) {
                ViewImpressionTracker.this.stopViewTreeObserver();
            }
            if (!ViewImpressionTracker.this.trackedViewMap.isEmpty() && !ViewImpressionTracker.this.setViewTreeObserverSucceed) {
                ViewImpressionTracker.this.scheduleVisibilityCheck();
            }
        }
    }

    public ViewImpressionTracker() {
        this.minImpressionPercent = 0.7d;
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value != null) {
            this.minImpressionPercent = value.getVisibleRate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityCheckHandler.removeCallbacks(this.visibilityCheckRunnable);
        this.visibilityCheckHandler.postDelayed(this.visibilityCheckRunnable, 100L);
    }

    private boolean setViewTreeObserver(View view) {
        WeakReference<ViewTreeObserver> weakReference = this.treeObserverWeakReference;
        if (weakReference != null) {
            weakReference.clear();
            this.treeObserverWeakReference = null;
        }
        if (view == null) {
            DeveloperLog.LogD("view is null, return false");
            return false;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        DeveloperLog.LogD("1 rootView = " + view + "  viewTreeObserver = " + viewTreeObserver.hashCode());
        if (!viewTreeObserver.isAlive()) {
            DeveloperLog.LogD("viewTreeObserver is not alive, return false");
            return false;
        }
        this.treeObserverWeakReference = new WeakReference<>(viewTreeObserver);
        viewTreeObserver.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopViewTreeObserver() {
        ViewTreeObserver viewTreeObserver;
        WeakReference<ViewTreeObserver> weakReference = this.treeObserverWeakReference;
        if (weakReference == null || (viewTreeObserver = weakReference.get()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        DeveloperLog.LogD("stopViewTreeObserver, success");
        viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
    }

    public void addView(View view, ImpressionListener impressionListener) {
        if (view != null && impressionListener != null) {
            DeveloperLog.LogD("start check ad impl, minImpressionPercent = " + this.minImpressionPercent);
            if (this.minImpressionPercent <= 0.0d) {
                impressionListener.onImpression(view);
                return;
            }
            this.setViewTreeObserverSucceed = setViewTreeObserver(view);
            DeveloperLog.LogD("start check ad impl, setViewTreeObserverSucceed = " + this.setViewTreeObserverSucceed + "   view" + view);
            scheduleVisibilityCheck();
            this.trackedViewMap.put(view, impressionListener);
        }
    }

    public void destroy() {
        DeveloperLog.LogD("destroy, ViewImpressionTracker: " + hashCode());
        stopViewTreeObserver();
        this.trackedViewMap.clear();
        this.visibilityCheckHandler.removeCallbacks(this.visibilityCheckRunnable);
        WeakReference<ViewTreeObserver> weakReference = this.treeObserverWeakReference;
        if (weakReference != null) {
            ViewTreeObserver viewTreeObserver = weakReference.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
            }
            this.treeObserverWeakReference.clear();
        }
    }

    public void removeView(View view) {
        this.trackedViewMap.remove(view);
    }
}
