package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC19947g;
import com.ironsource.InterfaceC20020h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.sdk.controller.k */
/* loaded from: classes6.dex */
public interface InterfaceC20859k {

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.k$a */
    /* loaded from: classes6.dex */
    public static final class C20860a implements InterfaceC19947g {
        @Override // com.ironsource.InterfaceC19947g
        @NotNull
        /* renamed from: a */
        public Intent mo55219a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.k$b */
    /* loaded from: classes6.dex */
    public static final class C20861b implements InterfaceC20020h {
        @Override // com.ironsource.InterfaceC20020h
        @NotNull
        /* renamed from: a */
        public Intent mo55218a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, OpenUrlActivity.class);
        }
    }
}
