package com.smaato.sdk.richmedia.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.lifecycle.ActivityProvider;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.util.ViewUtils;
import com.smaato.sdk.richmedia.widget.ClosableView;
import com.smaato.sdk.richmedia.widget.ExpandManager;
import com.smaato.sdk.richmedia_light.C27626R;

/* renamed from: com.smaato.sdk.richmedia.widget.g */
/* loaded from: classes7.dex */
public final class ExpandManager {
    @Nullable

    /* renamed from: a */
    private Dialog f72376a;

    /* compiled from: ExpandManager.java */
    /* renamed from: com.smaato.sdk.richmedia.widget.g$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC27598a {
        /* renamed from: a */
        void mo38952a(@NonNull ImageButton imageButton);

        void onCloseClicked(@NonNull ImageButton imageButton);

        void onFailedToExpand();
    }

    /* renamed from: a */
    public static /* synthetic */ void m38963a(ExpandManager expandManager, InterfaceC27598a interfaceC27598a, ClosableView closableView) {
        expandManager.m38956h(interfaceC27598a, closableView);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m38962b(ExpandManager expandManager, InterfaceC27598a interfaceC27598a, ClosableView closableView, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return expandManager.m38954j(interfaceC27598a, closableView, dialogInterface, i, keyEvent);
    }

    /* renamed from: c */
    public static /* synthetic */ void m38961c(InterfaceC27598a interfaceC27598a, ClosableView closableView, DialogInterface dialogInterface) {
        m38955i(interfaceC27598a, closableView, dialogInterface);
    }

    /* renamed from: d */
    public static /* synthetic */ void m38960d(ExpandManager expandManager, Dialog dialog) {
        expandManager.m38957g(dialog);
    }

    /* renamed from: g */
    public /* synthetic */ void m38957g(Dialog dialog) {
        dialog.dismiss();
        this.f72376a = null;
    }

    /* renamed from: i */
    public static /* synthetic */ void m38955i(InterfaceC27598a interfaceC27598a, ClosableView closableView, DialogInterface dialogInterface) {
        interfaceC27598a.mo38952a(closableView.getCloseButton());
    }

    /* renamed from: j */
    public /* synthetic */ boolean m38954j(InterfaceC27598a interfaceC27598a, ClosableView closableView, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            m38956h(interfaceC27598a, closableView);
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public void m38956h(@NonNull InterfaceC27598a interfaceC27598a, @NonNull ClosableView closableView) {
        interfaceC27598a.onCloseClicked(closableView.getCloseButton());
    }

    /* renamed from: e */
    public void m38959e() {
        Objects.onNotNull(this.f72376a, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.c
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ExpandManager.m38960d(ExpandManager.this, (Dialog) obj);
            }
        });
    }

    /* renamed from: f */
    public void m38958f(@NonNull View view, @NonNull final InterfaceC27598a interfaceC27598a) {
        Activity currentActivity = ActivityProvider.get().getCurrentActivity();
        if (currentActivity == null) {
            interfaceC27598a.onFailedToExpand();
            return;
        }
        final ClosableView closableView = new ClosableView(currentActivity);
        closableView.setOnCloseClickListener(new ClosableView.OnCloseClickListener() { // from class: com.smaato.sdk.richmedia.widget.d
            @Override // com.smaato.sdk.richmedia.widget.ClosableView.OnCloseClickListener
            public final void onCloseClick() {
                ExpandManager.m38963a(ExpandManager.this, interfaceC27598a, closableView);
            }
        });
        ViewUtils.removeFromParent(view);
        closableView.addContent(view);
        Dialog dialog = new Dialog(currentActivity, C27626R.C27632style.smaato_sdk_richmedia_expandable_dialog);
        this.f72376a = dialog;
        dialog.setContentView(closableView);
        this.f72376a.setCanceledOnTouchOutside(false);
        this.f72376a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.smaato.sdk.richmedia.widget.e
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ExpandManager.m38961c(ExpandManager.InterfaceC27598a.this, closableView, dialogInterface);
            }
        });
        this.f72376a.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.smaato.sdk.richmedia.widget.f
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return ExpandManager.m38962b(ExpandManager.this, interfaceC27598a, closableView, dialogInterface, i, keyEvent);
            }
        });
        this.f72376a.show();
    }
}
