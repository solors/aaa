package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class MapMaker {

    /* renamed from: a */
    boolean f40317a;

    /* renamed from: b */
    int f40318b = -1;

    /* renamed from: c */
    int f40319c = -1;

    /* renamed from: d */
    MapMakerInternalMap.Strength f40320d;

    /* renamed from: e */
    MapMakerInternalMap.Strength f40321e;

    /* renamed from: f */
    Equivalence<Object> f40322f;

    /* loaded from: classes4.dex */
    enum Dummy {
        VALUE
    }

    /* renamed from: a */
    public int m69163a() {
        int i = this.f40319c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: b */
    public int m69162b() {
        int i = this.f40318b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: c */
    public Equivalence<Object> m69161c() {
        return (Equivalence) MoreObjects.firstNonNull(this.f40322f, m69160d().mo69100c());
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i) {
        boolean z;
        int i2 = this.f40319c;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.f40319c = i;
        return this;
    }

    /* renamed from: d */
    public MapMakerInternalMap.Strength m69160d() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f40320d, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: e */
    public MapMakerInternalMap.Strength m69159e() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f40321e, MapMakerInternalMap.Strength.STRONG);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    /* renamed from: f */
    public MapMaker m69158f(Equivalence<Object> equivalence) {
        boolean z;
        Equivalence<Object> equivalence2 = this.f40322f;
        if (equivalence2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "key equivalence was already set to %s", equivalence2);
        this.f40322f = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.f40317a = true;
        return this;
    }

    /* renamed from: g */
    public MapMaker m69157g(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f40320d;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Key strength was already set to %s", strength2);
        this.f40320d = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f40317a = true;
        }
        return this;
    }

    /* renamed from: h */
    public MapMaker m69156h(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f40321e;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Value strength was already set to %s", strength2);
        this.f40321e = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f40317a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i) {
        boolean z;
        int i2 = this.f40318b;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "initial capacity was already set to %s", i2);
        if (i < 0) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        this.f40318b = i;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        if (!this.f40317a) {
            return new ConcurrentHashMap(m69162b(), 0.75f, m69163a());
        }
        return MapMakerInternalMap.m69153b(this);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.f40318b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.f40319c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f40320d;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f40321e;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f40322f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
        return m69157g(MapMakerInternalMap.Strength.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
        return m69156h(MapMakerInternalMap.Strength.WEAK);
    }
}
