package com.google.firebase.remoteconfig;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigKtxRegistrar */
/* loaded from: classes4.dex */
public final class RemoteConfig implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        List<Component<?>> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
