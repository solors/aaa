package com.mbridge.msdk.newinterstitial.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes6.dex */
public class NewInterstitialListenerWrapper implements RewardVideoListener {

    /* renamed from: a */
    private final NewInterstitialListener f58013a;

    /* renamed from: b */
    private final Handler f58014b = new Handler(Looper.getMainLooper());

    public NewInterstitialListenerWrapper(NewInterstitialListener newInterstitialListener) {
        this.f58013a = newInterstitialListener;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(final MBridgeIds mBridgeIds, final boolean z, final int i) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onAdCloseWithNIReward(mBridgeIds, new RewardInfo(z, i));
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onLoadCampaignSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onResourceLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f58014b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f58013a != null) {
                    NewInterstitialListenerWrapper.this.f58013a.onResourceLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}
