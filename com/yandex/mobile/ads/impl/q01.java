package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class q01<K, V> extends AbstractC30817m<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: g */
    transient uy1<? extends List<V>> f84139g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q01(Map<K, Collection<V>> map, uy1<? extends List<V>> uy1Var) {
        super(map);
        this.f84139g = (uy1) uf1.m28793a(uy1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f84139g = (uy1) objectInputStream.readObject();
        m31228a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f84139g);
        objectOutputStream.writeObject(m31227c());
    }
}
