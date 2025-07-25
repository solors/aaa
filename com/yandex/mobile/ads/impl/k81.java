package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class k81 {
    @NotNull

    /* renamed from: a */
    private final d92 f81334a;
    @NotNull

    /* renamed from: b */
    private final i71 f81335b;

    /* renamed from: c */
    private final double f81336c;

    public /* synthetic */ k81(e71 e71Var, d92 d92Var) {
        this(e71Var, d92Var, new i71(e71Var));
    }

    /* renamed from: b */
    public static /* synthetic */ void m32626b(k81 k81Var, CheckBox checkBox, View view) {
        m32627a(k81Var, checkBox, view);
    }

    /* renamed from: a */
    public final void m32628a(@Nullable bt0 bt0Var) {
        if (bt0Var != null) {
            final CheckBox muteControl = bt0Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.rr2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k81.m32626b(k81.this, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f81334a.m34985d() ? 0 : 8);
            }
            ProgressBar videoProgress = bt0Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f81334a.m34987b() ? 8 : 0);
            }
            TextView countDownProgress = bt0Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    public k81(@NotNull e71 nativeVideoAdPlayer, @NotNull d92 videoOptions, @NotNull i71 playerVolumeManager) {
        double d;
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f81334a = videoOptions;
        this.f81335b = playerVolumeManager;
        Double m34988a = videoOptions.m34988a();
        if (m34988a != null) {
            m34988a = ((m34988a.doubleValue() > 0.0d ? 1 : (m34988a.doubleValue() == 0.0d ? 0 : -1)) == 0) ^ true ? m34988a : null;
            if (m34988a != null) {
                d = m34988a.doubleValue();
                this.f81336c = d;
            }
        }
        d = 1.0d;
        this.f81336c = d;
    }

    /* renamed from: a */
    public static final void m32627a(k81 this$0, CheckBox checkBox, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81335b.m33356a(Double.valueOf(checkBox.isChecked() ^ true ? this$0.f81336c : 0.0d));
    }
}
