package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* renamed from: com.google.firebase.ktx.FirebaseCommonLegacyRegistrar */
/* loaded from: classes4.dex */
public final class Logging implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        List<Component<?>> m17175e;
        m17175e = CollectionsJVM.m17175e(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, com.google.firebase.BuildConfig.VERSION_NAME));
        return m17175e;
    }
}
