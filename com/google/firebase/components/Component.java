package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Component<T> {

    /* renamed from: a */
    private final String f42078a;

    /* renamed from: b */
    private final Set<Qualified<? super T>> f42079b;

    /* renamed from: c */
    private final Set<Dependency> f42080c;

    /* renamed from: d */
    private final int f42081d;

    /* renamed from: e */
    private final int f42082e;

    /* renamed from: f */
    private final ComponentFactory<T> f42083f;

    /* renamed from: g */
    private final Set<Class<?>> f42084g;

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static <T> Component<T> intoSet(final T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m67374f;
                m67374f = Component.m67374f(t, componentContainer);
                return m67374f;
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).m67365b();
    }

    @Deprecated
    /* renamed from: of */
    public static <T> Component<T> m67369of(Class<T> cls, final T t) {
        return builder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.e
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m67372h;
                m67372h = Component.m67372h(t, componentContainer);
                return m67372h;
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.f42080c;
    }

    public ComponentFactory<T> getFactory() {
        return this.f42083f;
    }

    @Nullable
    public String getName() {
        return this.f42078a;
    }

    public Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.f42079b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f42084g;
    }

    public boolean isAlwaysEager() {
        if (this.f42081d == 1) {
            return true;
        }
        return false;
    }

    public boolean isEagerInDefaultApp() {
        if (this.f42081d == 2) {
            return true;
        }
        return false;
    }

    public boolean isLazy() {
        if (this.f42081d == 0) {
            return true;
        }
        return false;
    }

    public boolean isValue() {
        if (this.f42082e == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f42079b.toArray()) + ">{" + this.f42081d + ", type=" + this.f42082e + ", deps=" + Arrays.toString(this.f42080c.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.f42078a, this.f42079b, this.f42080c, this.f42081d, this.f42082e, componentFactory, this.f42084g);
    }

    /* loaded from: classes4.dex */
    public static class Builder<T> {

        /* renamed from: a */
        private String f42085a;

        /* renamed from: b */
        private final Set<Qualified<? super T>> f42086b;

        /* renamed from: c */
        private final Set<Dependency> f42087c;

        /* renamed from: d */
        private int f42088d;

        /* renamed from: e */
        private int f42089e;

        /* renamed from: f */
        private ComponentFactory<T> f42090f;

        /* renamed from: g */
        private final Set<Class<?>> f42091g;

        /* JADX INFO: Access modifiers changed from: private */
        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder<T> m67365b() {
            this.f42089e = 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        private Builder<T> m67364c(int i) {
            boolean z;
            if (this.f42088d == 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Instantiation type has already been set.");
            this.f42088d = i;
            return this;
        }

        /* renamed from: d */
        private void m67363d(Qualified<?> qualified) {
            Preconditions.checkArgument(!this.f42086b.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            m67363d(dependency.getInterface());
            this.f42087c.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            return m67364c(1);
        }

        public Component<T> build() {
            boolean z;
            if (this.f42090f != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Missing required property: factory.");
            return new Component<>(this.f42085a, new HashSet(this.f42086b), new HashSet(this.f42087c), this.f42088d, this.f42089e, this.f42090f, this.f42091g);
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            return m67364c(2);
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.f42090f = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.f42085a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.f42091g.add(cls);
            return this;
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.f42085a = null;
            HashSet hashSet = new HashSet();
            this.f42086b = hashSet;
            this.f42087c = new HashSet();
            this.f42088d = 0;
            this.f42089e = 0;
            this.f42091g = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.f42086b.add(Qualified.unqualified(cls2));
            }
        }

        @SafeVarargs
        private Builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
            this.f42085a = null;
            HashSet hashSet = new HashSet();
            this.f42086b = hashSet;
            this.f42087c = new HashSet();
            this.f42088d = 0;
            this.f42089e = 0;
            this.f42091g = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified<? super T> qualified2 : qualifiedArr) {
                Preconditions.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.f42086b, qualifiedArr);
        }
    }

    private Component(@Nullable String str, Set<Qualified<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.f42078a = str;
        this.f42079b = Collections.unmodifiableSet(set);
        this.f42080c = Collections.unmodifiableSet(set2);
        this.f42081d = i;
        this.f42082e = i2;
        this.f42083f = componentFactory;
        this.f42084g = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(final T t, Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new ComponentFactory() { // from class: com.google.firebase.components.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m67373g;
                m67373g = Component.m67373g(t, componentContainer);
                return m67373g;
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Qualified<T> qualified) {
        return builder(qualified).m67365b();
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> Component<T> m67367of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m67371i;
                m67371i = Component.m67371i(t, componentContainer);
                return m67371i;
            }
        }).build();
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> Component<T> m67368of(final T t, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m67370j;
                m67370j = Component.m67370j(t, componentContainer);
                return m67370j;
            }
        }).build();
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Object m67374f(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m67373g(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Object m67372h(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Object m67371i(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m67370j(Object obj, ComponentContainer componentContainer) {
        return obj;
    }
}
