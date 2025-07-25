package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vo1<T extends View> {
    @Nullable
    /* renamed from: a */
    public static View m28247a(@NotNull Context context, @NotNull Class layoutClass, @LayoutRes int i, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutClass, "layoutClass");
        try {
            return (View) layoutClass.cast(LayoutInflater.from(context).inflate(i, viewGroup, false));
        } catch (Exception e) {
            um0.m28727b(e);
            return null;
        }
    }
}
