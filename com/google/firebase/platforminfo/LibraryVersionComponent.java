package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;

/* loaded from: classes4.dex */
public class LibraryVersionComponent {

    /* loaded from: classes4.dex */
    public interface VersionExtractor<T> {
        String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ LibraryVersion m66466b(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
        return LibraryVersion.m66468a(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(LibraryVersion.m66468a(str, str2), LibraryVersion.class);
    }

    public static Component<?> fromContext(final String str, final VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(LibraryVersion.class).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                LibraryVersion m66466b;
                m66466b = LibraryVersionComponent.m66466b(str, versionExtractor, componentContainer);
                return m66466b;
            }
        }).build();
    }
}
