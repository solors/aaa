package com.bykv.p135vk.openvk.preload.geckox.p172d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.p169b.DownloadException;
import com.bykv.p135vk.openvk.preload.geckox.p169b.MD5Exception;
import com.bykv.p135vk.openvk.preload.p163b.RetryInterceptor;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.g */
/* loaded from: classes3.dex */
public class RetryFullDownloadInterceptor extends RetryInterceptor<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: d */
    private int f14043d = 0;

    @Override // com.bykv.p135vk.openvk.preload.p163b.RetryInterceptor
    /* renamed from: a */
    protected final boolean mo91296a(Throwable th) {
        GeckoLogger.m91260w("gecko-debug-tag", "full update failed and retry", th);
        if (this.f14043d >= m91445g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th instanceof DownloadException) || (th instanceof MD5Exception);
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.RetryInterceptor
    /* renamed from: a */
    protected final /* synthetic */ Pair<Uri, UpdatePackage> mo91297a() {
        UpdatePackage m91445g = m91445g();
        List<String> urlList = m91445g.getFullPackage().getUrlList();
        int i = this.f14043d;
        this.f14043d = i + 1;
        return new Pair<>(Uri.parse(urlList.get(i)), m91445g);
    }
}
