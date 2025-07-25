package com.p551my.target;

import com.p551my.target.ads.MyTargetView;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.j2 */
/* loaded from: classes7.dex */
public interface InterfaceC25835j2 {

    /* renamed from: com.my.target.j2$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25836a {
        /* renamed from: a */
        void mo42666a();

        /* renamed from: a */
        void mo42665a(C25656b5 c25656b5);

        /* renamed from: b */
        void mo42664b();

        /* renamed from: c */
        void mo42663c();

        /* renamed from: d */
        void mo42662d();

        void onClick();

        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);
    }

    /* renamed from: a */
    void mo42825a();

    /* renamed from: a */
    void mo42822a(MyTargetView.AdSize adSize);

    /* renamed from: a */
    void mo42815a(InterfaceC25836a interfaceC25836a);

    /* renamed from: b */
    String mo42813b();

    /* renamed from: c */
    float mo42812c();

    void destroy();

    void pause();

    void prepare();

    void start();

    void stop();
}
