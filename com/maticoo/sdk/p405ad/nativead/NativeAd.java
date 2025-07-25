package com.maticoo.sdk.p405ad.nativead;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.maticoo.sdk.p405ad.IMcAd;
import com.maticoo.sdk.p405ad.nativead.view.MediaView;
import com.maticoo.sdk.p405ad.utils.CloseReason;
import java.util.List;

/* renamed from: com.maticoo.sdk.ad.nativead.NativeAd */
/* loaded from: classes6.dex */
public abstract class NativeAd implements IMcAd {

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAd$ImageContent */
    /* loaded from: classes6.dex */
    public static abstract class ImageContent {
        public abstract Drawable getDrawable();

        public abstract String getUrl();
    }

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAd$MediaContent */
    /* loaded from: classes6.dex */
    public static abstract class MediaContent {
        public static final int TYPE_IMAGE = 0;
        public static final int TYPE_VIDEO = 1;

        public abstract String getContentUrl();
    }

    public abstract void destroy();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract ImageContent getIcon();

    public abstract MediaContent getMediaContent();

    public abstract View getTemplateView();

    public abstract void recordDisplay(View view);

    public abstract void registerViewForInteraction(View view, MediaView mediaView, List<View> list);

    public abstract void reportCloseReason(CloseReason closeReason);
}
