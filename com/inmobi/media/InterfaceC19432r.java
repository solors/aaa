package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;

/* renamed from: com.inmobi.media.r */
/* loaded from: classes6.dex */
public interface InterfaceC19432r {
    /* renamed from: a */
    void mo59923a();

    /* renamed from: a */
    void mo59922a(byte b, Map map);

    /* renamed from: b */
    void mo59921b();

    /* renamed from: c */
    boolean mo59920c();

    /* renamed from: e */
    void mo59919e();

    AdConfig getAdConfig();

    String getAdType();

    String getCreativeId();

    Object getDataModel();

    InterfaceC19418q getFullScreenEventsListener();

    String getImpressionId();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    AbstractC19347kc getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
