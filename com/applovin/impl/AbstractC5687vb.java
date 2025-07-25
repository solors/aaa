package com.applovin.impl;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.vb */
/* loaded from: classes2.dex */
public abstract class AbstractC5687vb {
    /* renamed from: a */
    private static Collection m93937a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return AbstractC4519hc.m98739a(iterable.iterator());
    }

    /* renamed from: b */
    public static Object m93934b(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return m93935a(list);
            }
            throw new NoSuchElementException();
        }
        return AbstractC5767wb.m93589b(iterable.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object[] m93933c(Iterable iterable) {
        return m93937a(iterable).toArray();
    }

    /* renamed from: d */
    public static String m93932d(Iterable iterable) {
        return AbstractC5767wb.m93586d(iterable.iterator());
    }

    /* renamed from: a */
    public static Object m93936a(Iterable iterable, Object obj) {
        return AbstractC5767wb.m93593a(iterable.iterator(), obj);
    }

    /* renamed from: a */
    private static Object m93935a(List list) {
        return list.get(list.size() - 1);
    }
}
