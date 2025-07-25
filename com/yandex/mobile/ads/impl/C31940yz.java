package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yz */
/* loaded from: classes8.dex */
public final class C31940yz {
    /* renamed from: a */
    public static final void m26513a(@NotNull Dialog dialog) {
        boolean z;
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Activity ownerActivity = dialog.getOwnerActivity();
        if (ownerActivity != null && (ownerActivity.isFinishing() || ownerActivity.isDestroyed())) {
            z = false;
        } else {
            z = true;
        }
        if (dialog.isShowing() && z) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                Object[] args = new Object[0];
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
    }
}
