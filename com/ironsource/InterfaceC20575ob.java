package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ob */
/* loaded from: classes6.dex */
public interface InterfaceC20575ob<T> {

    @Metadata
    /* renamed from: com.ironsource.ob$a */
    /* loaded from: classes6.dex */
    public static final class C20576a<T> implements InterfaceC20575ob<T> {
        @NotNull

        /* renamed from: a */
        private final ArrayList<T> f52302a;
        @NotNull

        /* renamed from: b */
        private final ArrayList<T> f52303b;

        public C20576a(@NotNull ArrayList<T> a, @NotNull ArrayList<T> b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            this.f52302a = a;
            this.f52303b = b;
        }

        @Override // com.ironsource.InterfaceC20575ob
        public boolean contains(T t) {
            if (!this.f52302a.contains(t) && !this.f52303b.contains(t)) {
                return false;
            }
            return true;
        }

        @Override // com.ironsource.InterfaceC20575ob
        public int size() {
            return this.f52302a.size() + this.f52303b.size();
        }

        @Override // com.ironsource.InterfaceC20575ob
        @NotNull
        public List<T> value() {
            List<T> m17569J0;
            m17569J0 = _Collections.m17569J0(this.f52302a, this.f52303b);
            return m17569J0;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.ob$b */
    /* loaded from: classes6.dex */
    public static final class C20577b<T> implements InterfaceC20575ob<T> {
        @NotNull

        /* renamed from: a */
        private final InterfaceC20575ob<T> f52304a;
        @NotNull

        /* renamed from: b */
        private final Comparator<T> f52305b;

        public C20577b(@NotNull InterfaceC20575ob<T> collection, @NotNull Comparator<T> comparator) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.f52304a = collection;
            this.f52305b = comparator;
        }

        @Override // com.ironsource.InterfaceC20575ob
        public boolean contains(T t) {
            return this.f52304a.contains(t);
        }

        @Override // com.ironsource.InterfaceC20575ob
        public int size() {
            return this.f52304a.size();
        }

        @Override // com.ironsource.InterfaceC20575ob
        @NotNull
        public List<T> value() {
            List<T> m17560S0;
            m17560S0 = _Collections.m17560S0(this.f52304a.value(), this.f52305b);
            return m17560S0;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.ob$c */
    /* loaded from: classes6.dex */
    public static final class C20578c<T> implements InterfaceC20575ob<T> {

        /* renamed from: a */
        private final int f52306a;
        @NotNull

        /* renamed from: b */
        private final List<T> f52307b;

        public C20578c(@NotNull InterfaceC20575ob<T> collection, int i) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.f52306a = i;
            this.f52307b = collection.value();
        }

        @NotNull
        /* renamed from: a */
        public final List<T> m56036a() {
            List<T> m17166m;
            int size = this.f52307b.size();
            int i = this.f52306a;
            if (size <= i) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            List<T> list = this.f52307b;
            return list.subList(i, list.size());
        }

        @NotNull
        /* renamed from: b */
        public final List<T> m56035b() {
            int m16912j;
            List<T> list = this.f52307b;
            m16912j = _Ranges.m16912j(list.size(), this.f52306a);
            return list.subList(0, m16912j);
        }

        @Override // com.ironsource.InterfaceC20575ob
        public boolean contains(T t) {
            return this.f52307b.contains(t);
        }

        @Override // com.ironsource.InterfaceC20575ob
        public int size() {
            return this.f52307b.size();
        }

        @Override // com.ironsource.InterfaceC20575ob
        @NotNull
        public List<T> value() {
            return this.f52307b;
        }
    }

    boolean contains(T t);

    int size();

    @NotNull
    List<T> value();
}
