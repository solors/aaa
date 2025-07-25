package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ox */
/* loaded from: classes8.dex */
public final class C31072ox implements InterfaceC31568ub {
    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35620n = uiElements.m35620n();
        if (m35620n != null) {
            m35620n.setText(C29880R.C29886string.monetization_ads_internal_instream_sponsored_default);
            m35620n.setVisibility(0);
        }
        ImageView m35621m = uiElements.m35621m();
        if (m35621m != null) {
            m35621m.setImageDrawable(ContextCompat.getDrawable(m35621m.getContext(), C29880R.C29882drawable.monetization_ads_instream_internal_advertiser));
            m35621m.setVisibility(0);
        }
    }
}
