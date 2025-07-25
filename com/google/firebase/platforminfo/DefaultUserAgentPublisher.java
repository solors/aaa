package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a */
    private final String f43414a;

    /* renamed from: b */
    private final GlobalLibraryVersionRegistrar f43415b;

    DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f43414a = m66469c(set);
        this.f43415b = globalLibraryVersionRegistrar;
    }

    /* renamed from: b */
    public static /* synthetic */ UserAgentPublisher m66470b(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    /* renamed from: c */
    private static String m66469c(Set<LibraryVersion> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb2.append(next.getLibraryName());
            sb2.append('/');
            sb2.append(next.getVersion());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(LibraryVersion.class)).factory(new ComponentFactory() { // from class: com.google.firebase.platforminfo.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                UserAgentPublisher m66470b;
                m66470b = DefaultUserAgentPublisher.m66470b(componentContainer);
                return m66470b;
            }
        }).build();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.f43415b.getRegisteredVersions().isEmpty()) {
            return this.f43414a;
        }
        return this.f43414a + ' ' + m66469c(this.f43415b.getRegisteredVersions());
    }
}
