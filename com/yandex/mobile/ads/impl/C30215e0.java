package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.e0 */
/* loaded from: classes8.dex */
public final class C30215e0 {
    @NotNull

    /* renamed from: a */
    private final al1 f78394a;
    @NotNull

    /* renamed from: b */
    private final at0 f78395b;
    @NotNull

    /* renamed from: c */
    private final C30137d0 f78396c;

    public /* synthetic */ C30215e0() {
        this(new al1(), new at0(), new C30137d0());
    }

    @NotNull
    /* renamed from: a */
    public final c71 m34736a(@NotNull Context context, @NotNull d92 videoOptions, @NotNull bt0 customControls, @LayoutRes int i) {
        CheckBox checkBox;
        ProgressBar progressBar;
        TextView textView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(customControls, "customControls");
        c71 actionViewsContainer = new c71(context, this.f78394a.m35835a(context), this.f78395b.m35772a(context, i, customControls));
        this.f78396c.getClass();
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        bt0 m35347a = actionViewsContainer.m35347a();
        actionViewsContainer.m35346b().setVisibility(8);
        CheckBox checkBox2 = null;
        if (m35347a != null) {
            checkBox = m35347a.getMuteControl();
        } else {
            checkBox = null;
        }
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        if (m35347a != null) {
            progressBar = m35347a.getVideoProgress();
        } else {
            progressBar = null;
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (m35347a != null) {
            textView = m35347a.getCountDownProgress();
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (m35347a != null) {
            checkBox2 = m35347a.getMuteControl();
        }
        if (checkBox2 != null) {
            checkBox2.setChecked(videoOptions.m34984e());
        }
        return actionViewsContainer;
    }

    public C30215e0(@NotNull al1 replayActionViewCreator, @NotNull at0 controlsContainerCreator, @NotNull C30137d0 mediaControlsContainerConfigurator) {
        Intrinsics.checkNotNullParameter(replayActionViewCreator, "replayActionViewCreator");
        Intrinsics.checkNotNullParameter(controlsContainerCreator, "controlsContainerCreator");
        Intrinsics.checkNotNullParameter(mediaControlsContainerConfigurator, "mediaControlsContainerConfigurator");
        this.f78394a = replayActionViewCreator;
        this.f78395b = controlsContainerCreator;
        this.f78396c = mediaControlsContainerConfigurator;
    }
}
