package com.maticoo.sdk.video.core;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes6.dex */
public abstract class RewardedVideoAdListener {

    /* loaded from: classes6.dex */
    static class DefaultVideoAdListener {
        private static RewardedVideoAdListener defaultLister = new RewardedVideoAdListener() { // from class: com.maticoo.sdk.video.core.RewardedVideoAdListener.DefaultVideoAdListener.1
            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoClicked() {
            }

            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoClosed() {
            }

            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoFinish() {
            }

            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoStart() {
            }

            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoError(Exception exc) {
            }

            @Override // com.maticoo.sdk.video.core.RewardedVideoAdListener
            public void videoRewarded(String str, String str2) {
            }
        };

        DefaultVideoAdListener() {
        }

        public static RewardedVideoAdListener getWrappedListener(RewardedVideoAdListener rewardedVideoAdListener) {
            if (rewardedVideoAdListener == null) {
                return defaultLister;
            }
            return rewardedVideoAdListener;
        }
    }

    public abstract void videoClicked();

    public abstract void videoClosed();

    public abstract void videoError(Exception exc);

    public abstract void videoFinish();

    public abstract void videoRewarded(String str, String str2);

    public abstract void videoStart();
}
