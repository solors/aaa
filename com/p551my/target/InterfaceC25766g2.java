package com.p551my.target;

import android.content.Context;
import com.p551my.target.ads.Reward;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.g2 */
/* loaded from: classes7.dex */
public interface InterfaceC25766g2 {

    /* renamed from: com.my.target.g2$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25767a {
        void onClick();

        void onDismiss();

        void onDisplay();

        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);

        void onStartDisplaying();

        void onVideoCompleted();
    }

    /* renamed from: com.my.target.g2$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25768b {
        void onReward(Reward reward);
    }

    /* renamed from: a */
    void mo42791a(Context context);

    /* renamed from: a */
    void mo42787a(InterfaceC25768b interfaceC25768b);

    /* renamed from: b */
    String mo42785b();

    /* renamed from: c */
    float mo42784c();

    void destroy();

    void dismiss();
}
