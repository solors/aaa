package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
final class RestrictedComponentContainer implements ComponentContainer {

    /* renamed from: a */
    private final Set<Qualified<?>> f42131a;

    /* renamed from: b */
    private final Set<Qualified<?>> f42132b;

    /* renamed from: c */
    private final Set<Qualified<?>> f42133c;

    /* renamed from: d */
    private final Set<Qualified<?>> f42134d;

    /* renamed from: e */
    private final Set<Qualified<?>> f42135e;

    /* renamed from: f */
    private final Set<Class<?>> f42136f;

    /* renamed from: g */
    private final ComponentContainer f42137g;

    /* loaded from: classes4.dex */
    private static class RestrictedPublisher implements Publisher {

        /* renamed from: a */
        private final Set<Class<?>> f42138a;

        /* renamed from: b */
        private final Publisher f42139b;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.f42138a = set;
            this.f42139b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(Event<?> event) {
            if (this.f42138a.contains(event.getType())) {
                this.f42139b.publish(event);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.f42131a = Collections.unmodifiableSet(hashSet);
        this.f42132b = Collections.unmodifiableSet(hashSet2);
        this.f42133c = Collections.unmodifiableSet(hashSet3);
        this.f42134d = Collections.unmodifiableSet(hashSet4);
        this.f42135e = Collections.unmodifiableSet(hashSet5);
        this.f42136f = component.getPublishedEvents();
        this.f42137g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        if (this.f42131a.contains(Qualified.unqualified(cls))) {
            T t = (T) this.f42137g.get(cls);
            return !cls.equals(Publisher.class) ? t : (T) new RestrictedPublisher(this.f42136f, (Publisher) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Class<T> cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Qualified<T> qualified) {
        if (this.f42134d.contains(qualified)) {
            return this.f42137g.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        if (this.f42133c.contains(qualified)) {
            return this.f42137g.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Qualified<T> qualified) {
        if (this.f42132b.contains(qualified)) {
            return this.f42137g.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        if (this.f42135e.contains(qualified)) {
            return this.f42137g.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Qualified<T> qualified) {
        if (this.f42131a.contains(qualified)) {
            return (T) this.f42137g.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}
