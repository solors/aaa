package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pn */
/* loaded from: classes8.dex */
public final class View$OnTouchListenerC31142pn implements View.OnTouchListener, View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final View.OnClickListener f84019a;

    /* renamed from: b */
    private final int f84020b;

    /* renamed from: c */
    private boolean f84021c;

    /* renamed from: d */
    private float f84022d;

    /* renamed from: e */
    private float f84023e;

    public View$OnTouchListenerC31142pn(@NotNull Context context, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f84019a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f84020b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f84019a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f84021c = false;
                    }
                } else if (this.f84021c) {
                    int i2 = (int) (x - this.f84022d);
                    int i3 = (int) (y - this.f84023e);
                    if ((i3 * i3) + (i2 * i2) > this.f84020b) {
                        this.f84021c = false;
                    }
                }
            } else if (!this.f84021c) {
                return true;
            } else {
                this.f84019a.onClick(view);
                return true;
            }
        } else {
            this.f84022d = x;
            this.f84023e = y;
            this.f84021c = true;
        }
        return false;
    }
}
