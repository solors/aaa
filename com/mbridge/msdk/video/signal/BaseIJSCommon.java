package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.videocommon.p538d.RewardUnitSetting;

/* renamed from: com.mbridge.msdk.video.signal.a */
/* loaded from: classes6.dex */
public interface BaseIJSCommon extends IJSCommonClick {

    /* compiled from: BaseIJSCommon.java */
    /* renamed from: com.mbridge.msdk.video.signal.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC23135a extends NativeListener.NativeTrackingListener {
        /* renamed from: a */
        void mo48592a();

        /* renamed from: a */
        void mo48591a(int i, String str);

        /* renamed from: a */
        void mo48590a(boolean z);

        /* renamed from: b */
        void mo48589b();
    }

    /* renamed from: a */
    int mo48618a();

    /* renamed from: a */
    void mo48617a(int i);

    /* renamed from: a */
    void mo48586a(int i, String str);

    /* renamed from: a */
    void mo48585a(Activity activity);

    /* renamed from: a */
    void mo48616a(AdEvents adEvents);

    /* renamed from: a */
    void mo48615a(AdSession adSession);

    /* renamed from: a */
    void mo48614a(MediaEvents mediaEvents);

    /* renamed from: a */
    void mo48613a(InterfaceC23135a interfaceC23135a);

    /* renamed from: a */
    void mo48612a(RewardUnitSetting rewardUnitSetting);

    /* renamed from: a */
    void mo48611a(String str);

    /* renamed from: a */
    void mo48619a(boolean z);

    /* renamed from: b */
    void mo48609b(int i);

    /* renamed from: b */
    void mo48577b(String str);

    /* renamed from: b */
    void mo48608b(boolean z);

    /* renamed from: b */
    boolean mo48610b();

    /* renamed from: c */
    String mo48575c();

    /* renamed from: c */
    void mo48607c(int i);

    /* renamed from: d */
    void mo48572d();

    /* renamed from: d */
    void mo48606d(int i);

    /* renamed from: e */
    void mo48605e();

    /* renamed from: e */
    void mo48604e(int i);

    /* renamed from: f */
    void mo48569f();

    /* renamed from: f */
    void mo48603f(int i);

    /* renamed from: g */
    int mo48602g();

    /* renamed from: g */
    String mo48568g(int i);

    /* renamed from: h */
    int mo48601h();

    /* renamed from: h */
    void mo48600h(int i);

    /* renamed from: i */
    String mo48567i();
}
