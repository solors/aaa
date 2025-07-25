package com.yandex.div.core.view2.backbutton;

import android.view.KeyEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.core.view2.backbutton.a */
/* loaded from: classes8.dex */
public final class BackKeyPressedHelper {
    @NotNull

    /* renamed from: a */
    private final View f75455a;
    @Nullable

    /* renamed from: b */
    private InterfaceC29643a f75456b;

    /* compiled from: BackKeyPressedHelper.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.backbutton.a$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29643a {
        /* renamed from: a */
        boolean mo37099a();
    }

    public BackKeyPressedHelper(@NotNull View mOwnerView) {
        Intrinsics.checkNotNullParameter(mOwnerView, "mOwnerView");
        this.f75455a = mOwnerView;
    }

    /* renamed from: e */
    private final void m37118e() {
        View rootView;
        if (this.f75456b != null && this.f75455a.hasWindowFocus()) {
            View view = this.f75455a;
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            if (view.isShown()) {
                view.requestFocus();
            } else if (view.hasFocus() && (rootView = view.getRootView()) != null) {
                rootView.requestFocus(33);
            }
        }
    }

    /* renamed from: a */
    public final boolean m37122a(int i, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f75456b != null && i == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = this.f75455a.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, this);
                }
                return true;
            } else if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = this.f75455a.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled()) {
                    InterfaceC29643a interfaceC29643a = this.f75456b;
                    Intrinsics.m17074g(interfaceC29643a);
                    return interfaceC29643a.mo37099a();
                }
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m37121b() {
        m37118e();
    }

    /* renamed from: c */
    public final void m37120c(boolean z) {
        if (z) {
            m37118e();
        }
    }

    /* renamed from: d */
    public final void m37119d(@Nullable InterfaceC29643a interfaceC29643a) {
        this.f75456b = interfaceC29643a;
        m37118e();
    }
}
