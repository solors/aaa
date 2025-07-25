package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cb */
/* loaded from: classes8.dex */
public final class C30080cb {
    @NotNull

    /* renamed from: a */
    private final C31027ob f77572a;
    @NotNull

    /* renamed from: b */
    private final bo0 f77573b;

    /* renamed from: com.yandex.mobile.ads.impl.cb$a */
    /* loaded from: classes8.dex */
    private static final class View$OnClickListenerC30081a implements View.OnClickListener {
        @NotNull

        /* renamed from: a */
        private final Dialog f77574a;
        @NotNull

        /* renamed from: b */
        private final bo0 f77575b;

        public View$OnClickListenerC30081a(@NotNull Dialog dialog, @NotNull bo0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f77574a = dialog;
            this.f77575b = keyboardUtils;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77575b.getClass();
            bo0.m35456a(view);
            C31940yz.m26513a(this.f77574a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cb$b */
    /* loaded from: classes8.dex */
    private static final class View$OnTouchListenerC30082b implements View.OnTouchListener {
        @NotNull

        /* renamed from: a */
        private final View f77576a;
        @NotNull

        /* renamed from: b */
        private final Dialog f77577b;
        @NotNull

        /* renamed from: c */
        private final bo0 f77578c;

        /* renamed from: d */
        private float f77579d;

        public View$OnTouchListenerC30082b(@NotNull ViewGroup adTuneContainer, @NotNull Dialog dialog, @NotNull bo0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f77576a = adTuneContainer;
            this.f77577b = dialog;
            this.f77578c = keyboardUtils;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            float rawY = event.getRawY();
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return false;
                    }
                    float f = this.f77579d;
                    if (rawY > f) {
                        this.f77576a.setTranslationY(rawY - f);
                        return true;
                    }
                    this.f77576a.setTranslationY(0.0f);
                    return true;
                } else if (rawY <= this.f77579d) {
                    return true;
                } else {
                    this.f77578c.getClass();
                    bo0.m35456a(view);
                    C31940yz.m26513a(this.f77577b);
                    return true;
                }
            }
            this.f77579d = rawY;
            return true;
        }
    }

    public /* synthetic */ C30080cb() {
        this(new C31027ob(), new bo0());
    }

    /* renamed from: a */
    public final void m35321a(@NotNull ViewGroup adTuneContainer, @NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f77572a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        View findViewById = adTuneContainer.findViewById(C29880R.C29884id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new View$OnTouchListenerC30082b(adTuneContainer, dialog, this.f77573b));
        }
        this.f77572a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(C29880R.C29884id.adtune_background_view);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC30081a(dialog, this.f77573b));
        }
    }

    public C30080cb(@NotNull C31027ob adtuneViewProvider, @NotNull bo0 keyboardUtils) {
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
        this.f77572a = adtuneViewProvider;
        this.f77573b = keyboardUtils;
    }
}
