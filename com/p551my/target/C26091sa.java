package com.p551my.target;

import android.content.Context;
import com.p551my.target.AbstractC25749f5;
import com.p551my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.my.target.sa */
/* loaded from: classes7.dex */
public final class C26091sa {

    /* renamed from: a */
    public final List f67866a;

    public C26091sa(List list) {
        this.f67866a = list;
    }

    /* renamed from: a */
    public void m42892a(Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43678b("VideoLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f67866a.size());
        for (VideoData videoData : this.f67866a) {
            C26067ra.m43019a().m43016b(videoData.getUrl(), new C26092a(videoData, countDownLatch), context);
        }
        try {
            countDownLatch.await();
            AbstractC25846ja.m43680a("VideoLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            AbstractC25846ja.m43680a("VideoLoaderUtils: awaiting media files load failed");
        }
    }

    /* renamed from: com.my.target.sa$a */
    /* loaded from: classes7.dex */
    public class C26092a implements AbstractC25749f5.InterfaceC25750a {

        /* renamed from: a */
        public final /* synthetic */ VideoData f67867a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f67868b;

        public C26092a(VideoData videoData, CountDownLatch countDownLatch) {
            this.f67867a = videoData;
            this.f67868b = countDownLatch;
        }

        @Override // com.p551my.target.AbstractC25749f5.InterfaceC25750a
        /* renamed from: a */
        public void mo42889a() {
            this.f67867a.setData(null);
            this.f67868b.countDown();
        }

        @Override // com.p551my.target.AbstractC25749f5.InterfaceC25750a
        /* renamed from: a */
        public void mo42888a(String str) {
            this.f67867a.setData(str);
            this.f67868b.countDown();
        }
    }

    /* renamed from: a */
    public static C26091sa m42891a(VideoData videoData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(videoData);
        return new C26091sa(arrayList);
    }

    /* renamed from: a */
    public static C26091sa m42890a(List list) {
        return new C26091sa(list);
    }
}
