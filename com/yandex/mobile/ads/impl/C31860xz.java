package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xz */
/* loaded from: classes8.dex */
public final class C31860xz implements InterfaceC31308rq {
    @Nullable

    /* renamed from: a */
    private Dialog f87948a;

    /* renamed from: b */
    public static /* synthetic */ void m27154b(C31860xz c31860xz, DialogInterface dialogInterface) {
        m27155a(c31860xz, dialogInterface);
    }

    /* renamed from: a */
    public final void m27156a(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f87948a = dialog;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.a13
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C31860xz.m27154b(C31860xz.this, dialogInterface);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31308rq
    /* renamed from: f */
    public final void mo27153f() {
        Dialog dialog = this.f87948a;
        if (dialog != null) {
            C31940yz.m26513a(dialog);
        }
    }

    /* renamed from: a */
    public static final void m27155a(C31860xz this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.f87948a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        this$0.f87948a = null;
    }
}
