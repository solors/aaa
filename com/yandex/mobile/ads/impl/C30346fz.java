package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.instream.view.InstreamMuteView;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.b62;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.yandex.mobile.ads.impl.fz */
/* loaded from: classes8.dex */
public final class C30346fz {
    @NotNull

    /* renamed from: a */
    private final vk0 f79359a;
    @NotNull

    /* renamed from: b */
    private final vo1<ExtendedVideoAdControlsContainer> f79360b;

    public C30346fz(@NotNull vk0 instreamDesign) {
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        this.f79359a = instreamDesign;
        this.f79360b = new vo1<>();
    }

    @Nullable
    /* renamed from: a */
    public final b62 m34055a(@NotNull Context context, @NotNull ViewGroup rootView) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        vk0 instreamDesign = this.f79359a;
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        int ordinal = instreamDesign.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = C29880R.C29885layout.monetization_ads_internal_instream_skin_v2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = C29880R.C29885layout.monetization_ads_internal_instream_skin_v1;
        }
        this.f79360b.getClass();
        ExtendedVideoAdControlsContainer extendedVideoAdControlsContainer = (ExtendedVideoAdControlsContainer) vo1.m28247a(context, ExtendedVideoAdControlsContainer.class, i, rootView);
        if (extendedVideoAdControlsContainer != null) {
            View findViewById = extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.instream_skip);
            View findViewById2 = extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.instream_cta_container);
            ImageView imageView = (ImageView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.feedback);
            return new b62(new b62.C29995a(extendedVideoAdControlsContainer).m35602d((ImageView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.sponsored_image)).m35608b((ImageView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.favicon)).m35607b((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.call_to_action)).m35614a((ImageView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.instream_call_to_action)).m35611a((s01) ((InstreamMuteView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.instream_mute))).m35613a((ProgressBar) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.instream_progress_display_view)).m35609b(findViewById).m35598e((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.sponsored)).m35604c((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.domain)).m35612a((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.ad_position)).m35599e((ImageView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.trademark_icon)).m35596f((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.trademark_delimiter)).m35601d((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.timer_value)).m35615a(findViewById2).m35605c(imageView).m35594g((TextView) extendedVideoAdControlsContainer.findViewById(C29880R.C29884id.warning)), 0);
        }
        return null;
    }
}
