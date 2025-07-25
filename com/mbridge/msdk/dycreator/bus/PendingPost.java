package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
final class PendingPost {

    /* renamed from: d */
    private static final List<PendingPost> f55937d = new ArrayList();

    /* renamed from: a */
    Object f55938a;

    /* renamed from: b */
    Subscription f55939b;

    /* renamed from: c */
    PendingPost f55940c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f55938a = obj;
        this.f55939b = subscription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PendingPost m52963a(Subscription subscription, Object obj) {
        List<PendingPost> list = f55937d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                PendingPost remove = list.remove(size - 1);
                remove.f55938a = obj;
                remove.f55939b = subscription;
                remove.f55940c = null;
                return remove;
            }
            return new PendingPost(obj, subscription);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m52964a(PendingPost pendingPost) {
        pendingPost.f55938a = null;
        pendingPost.f55939b = null;
        pendingPost.f55940c = null;
        List<PendingPost> list = f55937d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
