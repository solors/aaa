package com.unity3d.services;

import android.content.Context;
import com.unity3d.services.core.p621di.IServiceComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* compiled from: IServiceComponent.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UnityAdsSDK$load$$inlined$inject$default$2 extends Lambda implements Functions<Context> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$load$$inlined$inject$default$2(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Context invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, Reflection.m17042b(Context.class));
    }
}
