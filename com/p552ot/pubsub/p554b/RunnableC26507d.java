package com.p552ot.pubsub.p554b;

import com.p552ot.pubsub.p554b.C26502a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ot.pubsub.b.d */
/* loaded from: classes7.dex */
class RunnableC26507d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69326a;

    /* renamed from: b */
    final /* synthetic */ C26502a.HandlerC26504b f69327b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26507d(C26502a.HandlerC26504b handlerC26504b, String str) {
        this.f69327b = handlerC26504b;
        this.f69326a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentHashMap concurrentHashMap;
        C26502a.m41428b(Arrays.asList(this.f69326a));
        concurrentHashMap = C26502a.f69292A;
        concurrentHashMap.put(this.f69326a, Boolean.FALSE);
    }
}
