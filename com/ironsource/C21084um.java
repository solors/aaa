package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.um */
/* loaded from: classes6.dex */
public final class C21084um implements InterfaceC21021tm {
    @Override // com.ironsource.InterfaceC21021tm
    /* renamed from: a */
    public void mo54614a(@NotNull Activity activity, @NotNull C20473mi adInstance, @NotNull Map<String, String> showParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC21021tm
    /* renamed from: a */
    public boolean mo54613a(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
