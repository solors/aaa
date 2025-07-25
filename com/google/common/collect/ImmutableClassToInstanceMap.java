package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.Immutable;
import com.p552ot.pubsub.p553a.C26485b;
import java.io.Serializable;
import java.util.Map;

@Immutable(containerOf = {C26485b.f69244a})
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* renamed from: c */
    private static final ImmutableClassToInstanceMap<Object> f40023c = new ImmutableClassToInstanceMap<>(ImmutableMap.m69397of());

    /* renamed from: b */
    private final ImmutableMap<Class<? extends B>, B> f40024b;

    /* loaded from: classes4.dex */
    public static final class Builder<B> {

        /* renamed from: a */
        private final ImmutableMap.Builder<Class<? extends B>, B> f40025a = ImmutableMap.builder();

        /* renamed from: a */
        private static <B, T extends B> T m69434a(Class<T> cls, B b) {
            return (T) Primitives.wrap(cls).cast(b);
        }

        public ImmutableClassToInstanceMap<B> build() {
            ImmutableMap<Class<? extends B>, B> buildOrThrow = this.f40025a.buildOrThrow();
            if (buildOrThrow.isEmpty()) {
                return ImmutableClassToInstanceMap.m69436of();
            }
            return new ImmutableClassToInstanceMap<>(buildOrThrow);
        }

        @CanIgnoreReturnValue
        public <T extends B> Builder<B> put(Class<T> cls, T t) {
            this.f40025a.put(cls, t);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public <T extends B> Builder<B> putAll(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.f40025a.put(key, m69434a(key, entry.getValue()));
            }
            return this;
        }
    }

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        return new Builder().putAll(map).build();
    }

    /* renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m69436of() {
        return (ImmutableClassToInstanceMap<B>) f40023c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T extends B, java.lang.Object] */
    @Override // com.google.common.collect.ClassToInstanceMap
    public <T extends B> T getInstance(Class<T> cls) {
        return this.f40024b.get(Preconditions.checkNotNull(cls));
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        if (isEmpty()) {
            return m69436of();
        }
        return this;
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.f40024b = immutableMap;
    }

    /* renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m69435of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m69396of(cls, t));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<Class<? extends B>, B> delegate() {
        return this.f40024b;
    }
}
