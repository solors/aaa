package com.mbridge.msdk.out;

import java.util.List;

/* loaded from: classes6.dex */
public class NativeListener {

    /* loaded from: classes6.dex */
    public interface FilpListener {
        void filpEvent(int i);
    }

    /* loaded from: classes6.dex */
    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i);

        void onLoggingImpression(int i);
    }

    /* loaded from: classes6.dex */
    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    /* loaded from: classes6.dex */
    public static class Template {
        private int adNum;

        /* renamed from: id */
        private int f58739id;

        public Template(int i, int i2) {
            this.f58739id = i;
            this.adNum = i2;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.f58739id;
        }

        public void setAdNum(int i) {
            this.adNum = i;
        }

        public void setId(int i) {
            this.f58739id = i;
        }
    }

    /* loaded from: classes6.dex */
    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
