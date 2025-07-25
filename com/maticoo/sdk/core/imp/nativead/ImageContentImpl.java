package com.maticoo.sdk.core.imp.nativead;

import android.graphics.drawable.Drawable;
import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.utils.Cache;
import com.maticoo.sdk.p405ad.utils.DownloadManager;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.File;

/* loaded from: classes6.dex */
public class ImageContentImpl extends NativeAd.ImageContent {
    private Drawable imageDrawable;
    private String imageUrl;

    public ImageContentImpl(String str) {
        this.imageUrl = str;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd.ImageContent
    public Drawable getDrawable() {
        if (this.imageDrawable == null) {
            try {
                File cacheFile = Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), this.imageUrl, null);
                if (cacheFile != null) {
                    this.imageDrawable = Drawable.createFromPath(cacheFile.getPath());
                } else {
                    DownloadManager.getInstance().downloadFile(this.imageUrl, null);
                }
            } catch (Exception e) {
                DeveloperLog.LogD("LocalImage getDrawable, exception : ", e);
            }
        }
        return this.imageDrawable;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd.ImageContent
    public String getUrl() {
        return this.imageUrl;
    }
}
