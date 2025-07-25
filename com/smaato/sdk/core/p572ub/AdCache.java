package com.smaato.sdk.core.p572ub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Predicate;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.smaato.sdk.core.ub.AdCache */
/* loaded from: classes7.dex */
public class AdCache<T> {
    private final Map<String, C27276a<T>> cache = new ConcurrentHashMap();
    private final int capacity;
    private final Predicate<T> validator;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.smaato.sdk.core.ub.AdCache$a */
    /* loaded from: classes7.dex */
    public static class C27276a<T> extends AbstractQueue<T> {

        /* renamed from: b */
        private final Queue<T> f71895b = new ConcurrentLinkedQueue();

        /* renamed from: c */
        private final int f71896c;

        C27276a(int i) {
            this.f71896c = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<T> iterator() {
            return this.f71895b.iterator();
        }

        @Override // java.util.Queue
        public boolean offer(T t) {
            if (this.f71895b.size() < this.f71896c && this.f71895b.offer(t)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Queue
        public T peek() {
            return this.f71895b.peek();
        }

        @Override // java.util.Queue
        public T poll() {
            return this.f71895b.poll();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f71895b.size();
        }
    }

    public AdCache(int i, Predicate<T> predicate) {
        this.capacity = i;
        this.validator = predicate;
    }

    private C27276a<T> getOrCreateBucket(String str) {
        C27276a<T> put;
        C27276a<T> c27276a = this.cache.get(str);
        if (c27276a == null && (put = this.cache.put(str, (c27276a = new C27276a<>(this.capacity)))) != null) {
            return put;
        }
        return c27276a;
    }

    @Nullable
    public T get(@NonNull String str) {
        return getOrCreateBucket(str).peek();
    }

    @Nullable
    public T getAndRemove(@NonNull String str, @NonNull Predicate<T> predicate) {
        Iterator<T> it = getOrCreateBucket(str).iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.test(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public boolean put(@NonNull String str, @NonNull T t) {
        return getOrCreateBucket(str).offer(t);
    }

    public int remainingCapacity(@NonNull String str) {
        return this.capacity - getOrCreateBucket(str).size();
    }

    public int trim(@NonNull String str) {
        C27276a<T> orCreateBucket = getOrCreateBucket(str);
        Iterator<T> it = orCreateBucket.iterator();
        while (it.hasNext()) {
            if (!this.validator.test(it.next())) {
                it.remove();
            }
        }
        return this.capacity - orCreateBucket.size();
    }
}
