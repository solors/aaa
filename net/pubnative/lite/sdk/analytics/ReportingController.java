package net.pubnative.lite.sdk.analytics;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTracker;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTrackerCallback;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class ReportingController {
    private static final String TAG = "ReportingController";
    private List<ReportingEvent> adEventList;
    private List<ReportingTracker> adFiredTrackers;
    private final List<ReportingEventCallback> mListeners = new ArrayList();
    private final List<ReportingTrackerCallback> mTrackerListeners = new ArrayList();

    /* renamed from: a */
    public static /* synthetic */ void m14468a(ReportingController reportingController, ReportingTracker reportingTracker) {
        reportingController.lambda$reportFiredTracker$1(reportingTracker);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14467b(ReportingController reportingController, ReportingEvent reportingEvent) {
        reportingController.lambda$reportEvent$0(reportingEvent);
    }

    public /* synthetic */ void lambda$reportEvent$0(ReportingEvent reportingEvent) {
        ReportingEventCallback reportingEventCallback;
        for (int i = 0; i < this.mListeners.size(); i++) {
            try {
                if (i < this.mListeners.size() && (reportingEventCallback = this.mListeners.get(i)) != null) {
                    reportingEventCallback.onEvent(reportingEvent);
                }
            } catch (Exception e) {
                Logger.m14229d("exception - " + ReportingController.class.getSimpleName(), e.toString());
            }
        }
    }

    public /* synthetic */ void lambda$reportFiredTracker$1(ReportingTracker reportingTracker) {
        ReportingTrackerCallback reportingTrackerCallback;
        for (int i = 0; i < this.mTrackerListeners.size(); i++) {
            try {
                if (i < this.mTrackerListeners.size() && (reportingTrackerCallback = this.mTrackerListeners.get(i)) != null) {
                    reportingTrackerCallback.onFire(reportingTracker);
                }
            } catch (Exception e) {
                Logger.m14229d("exception - " + ReportingController.class.getSimpleName(), e.toString());
            }
        }
    }

    public void addCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            if (reportingEventCallback != null) {
                if (!this.mListeners.contains(reportingEventCallback)) {
                    this.mListeners.add(reportingEventCallback);
                }
            }
        }
    }

    public void addTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            if (reportingTrackerCallback != null) {
                if (!this.mTrackerListeners.contains(reportingTrackerCallback)) {
                    this.mTrackerListeners.add(reportingTrackerCallback);
                }
            }
        }
    }

    public void cacheAdEventList(List<ReportingEvent> list) {
        this.adEventList = list;
    }

    public void clearAdEventList() {
        List<ReportingEvent> list = this.adEventList;
        if (list != null) {
            list.clear();
        }
    }

    public void clearFiredTrackerstList() {
        List<ReportingTracker> list = this.adFiredTrackers;
        if (list != null) {
            list.clear();
        }
    }

    public List<ReportingEvent> getAdEventList() {
        return this.adEventList;
    }

    public List<ReportingTracker> getFiredTrackersList() {
        return this.adFiredTrackers;
    }

    public boolean removeCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            if (reportingEventCallback == null) {
                return false;
            }
            int indexOf = this.mListeners.indexOf(reportingEventCallback);
            if (indexOf == -1) {
                return false;
            }
            this.mListeners.remove(indexOf);
            return true;
        }
    }

    public boolean removeTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            if (reportingTrackerCallback == null) {
                return false;
            }
            int indexOf = this.mTrackerListeners.indexOf(reportingTrackerCallback);
            if (indexOf == -1) {
                return false;
            }
            this.mTrackerListeners.remove(indexOf);
            return true;
        }
    }

    public synchronized void reportEvent(final ReportingEvent reportingEvent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ve.b
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.m14467b(ReportingController.this, reportingEvent);
            }
        });
    }

    public synchronized void reportFiredTracker(final ReportingTracker reportingTracker) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ve.a
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.m14468a(ReportingController.this, reportingTracker);
            }
        });
    }
}
