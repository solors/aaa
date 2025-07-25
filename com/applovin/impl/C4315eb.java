package com.applovin.impl;

import com.applovin.impl.AbstractC4387fb;
import com.applovin.impl.AbstractC4453gb;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.applovin.impl.eb */
/* loaded from: classes2.dex */
public class C4315eb extends AbstractC4453gb implements InterfaceC4317ec {

    /* renamed from: com.applovin.impl.eb$a */
    /* loaded from: classes2.dex */
    public static final class C4316a extends AbstractC4453gb.C4455b {
        @Override // com.applovin.impl.AbstractC4453gb.C4455b
        /* renamed from: b */
        public C4316a mo98979a(Object obj, Iterable iterable) {
            super.mo98979a(obj, iterable);
            return this;
        }

        /* renamed from: c */
        public C4315eb m99564c() {
            return (C4315eb) super.m98980a();
        }

        /* renamed from: b */
        public C4316a m99565b(Object obj, Object... objArr) {
            super.m98978a(obj, objArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4315eb(AbstractC4387fb abstractC4387fb, int i) {
        super(abstractC4387fb, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4315eb m99570a(Collection collection, Comparator comparator) {
        AbstractC4247db m99837a;
        if (collection.isEmpty()) {
            return m99567l();
        }
        AbstractC4387fb.C4388a c4388a = new AbstractC4387fb.C4388a(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                m99837a = AbstractC4247db.m99838a(collection2);
            } else {
                m99837a = AbstractC4247db.m99837a(comparator, (Iterable) collection2);
            }
            if (!m99837a.isEmpty()) {
                c4388a.m99374a(key, m99837a);
                i += m99837a.size();
            }
        }
        return new C4315eb(c4388a.m99377a(), i);
    }

    /* renamed from: k */
    public static C4316a m99568k() {
        return new C4316a();
    }

    /* renamed from: l */
    public static C4315eb m99567l() {
        return C5172q7.f9159g;
    }

    /* renamed from: b */
    public AbstractC4247db m99569b(Object obj) {
        AbstractC4247db abstractC4247db = (AbstractC4247db) this.f6375d.get(obj);
        if (abstractC4247db == null) {
            return AbstractC4247db.m99829h();
        }
        return abstractC4247db;
    }
}
