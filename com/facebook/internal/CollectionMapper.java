package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class CollectionMapper {

    /* loaded from: classes4.dex */
    public interface Collection<T> {
        Object get(T t);

        Iterator<T> keyIterator();

        void set(T t, Object obj, OnErrorListener onErrorListener);
    }

    /* loaded from: classes4.dex */
    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    /* loaded from: classes4.dex */
    public interface OnMapValueCompleteListener extends OnErrorListener {
        void onComplete(Object obj);
    }

    /* loaded from: classes4.dex */
    public interface OnMapperCompleteListener extends OnErrorListener {
        void onComplete();
    }

    /* loaded from: classes4.dex */
    public interface ValueMapper {
        void mapValue(Object obj, OnMapValueCompleteListener onMapValueCompleteListener);
    }

    /* renamed from: com.facebook.internal.CollectionMapper$a */
    /* loaded from: classes4.dex */
    class C13435a implements OnMapperCompleteListener {

        /* renamed from: a */
        final /* synthetic */ Mutable f24715a;

        /* renamed from: b */
        final /* synthetic */ Mutable f24716b;

        /* renamed from: c */
        final /* synthetic */ OnMapperCompleteListener f24717c;

        C13435a(Mutable mutable, Mutable mutable2, OnMapperCompleteListener onMapperCompleteListener) {
            this.f24715a = mutable;
            this.f24716b = mutable2;
            this.f24717c = onMapperCompleteListener;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
        @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
        public void onComplete() {
            if (((Boolean) this.f24715a.value).booleanValue()) {
                return;
            }
            Mutable mutable = this.f24716b;
            ?? valueOf = Integer.valueOf(((Integer) mutable.value).intValue() - 1);
            mutable.value = valueOf;
            if (valueOf.intValue() == 0) {
                this.f24717c.onComplete();
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            if (((Boolean) this.f24715a.value).booleanValue()) {
                return;
            }
            this.f24715a.value = Boolean.TRUE;
            this.f24717c.onError(facebookException);
        }
    }

    /* renamed from: com.facebook.internal.CollectionMapper$b */
    /* loaded from: classes4.dex */
    class C13436b implements OnMapValueCompleteListener {

        /* renamed from: a */
        final /* synthetic */ Collection f24718a;

        /* renamed from: b */
        final /* synthetic */ Object f24719b;

        /* renamed from: c */
        final /* synthetic */ OnMapperCompleteListener f24720c;

        C13436b(Collection collection, Object obj, OnMapperCompleteListener onMapperCompleteListener) {
            this.f24718a = collection;
            this.f24719b = obj;
            this.f24720c = onMapperCompleteListener;
        }

        @Override // com.facebook.internal.CollectionMapper.OnMapValueCompleteListener
        public void onComplete(Object obj) {
            this.f24718a.set(this.f24719b, obj, this.f24720c);
            this.f24720c.onComplete();
        }

        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            this.f24720c.onError(facebookException);
        }
    }

    private CollectionMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void iterate(Collection<T> collection, ValueMapper valueMapper, OnMapperCompleteListener onMapperCompleteListener) {
        Mutable mutable = new Mutable(Boolean.FALSE);
        Mutable mutable2 = new Mutable(1);
        C13435a c13435a = new C13435a(mutable, mutable2, onMapperCompleteListener);
        Iterator keyIterator = collection.keyIterator();
        LinkedList linkedList = new LinkedList();
        while (keyIterator.hasNext()) {
            linkedList.add(keyIterator.next());
        }
        for (Object obj : linkedList) {
            Object obj2 = collection.get(obj);
            C13436b c13436b = new C13436b(collection, obj, c13435a);
            T t = mutable2.value;
            Integer num = (Integer) t;
            mutable2.value = (T) Integer.valueOf(((Integer) t).intValue() + 1);
            valueMapper.mapValue(obj2, c13436b);
        }
        c13435a.onComplete();
    }
}
