package com.smaato.sdk.nativead.model.utils;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.model.NativeAdComponents;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class IconImagesLoader {
    private final Application application;
    private final Logger logger;
    private final SimpleHttpClient simpleHttpClient;

    public IconImagesLoader(SimpleHttpClient simpleHttpClient, Logger logger, Application application) {
        this.application = application;
        this.logger = logger;
        this.simpleHttpClient = simpleHttpClient;
    }

    private Drawable createDrawable(Bitmap bitmap) {
        return new BitmapDrawable(this.application.getResources(), bitmap);
    }

    public NativeAdComponents loadIconAndImages(NativeAdComponents nativeAdComponents) {
        NativeAdAssets assets = nativeAdComponents.assets();
        NativeAdAssets.Builder buildUpon = assets.buildUpon();
        if (assets.icon() != null) {
            try {
                buildUpon.icon(assets.icon().withDrawable(createDrawable(this.simpleHttpClient.readBitmap(assets.icon().uri().toString()))));
            } catch (IOException e) {
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.NETWORK;
                logger.error(logDomain, "Error loading icon: " + assets.icon().uri(), e);
            }
        }
        if (!assets.images().isEmpty()) {
            ArrayList arrayList = new ArrayList(assets.images().size());
            for (NativeAdAssets.Image image : assets.images()) {
                try {
                    arrayList.add(image.withDrawable(createDrawable(this.simpleHttpClient.readBitmap(image.uri().toString()))));
                } catch (IOException e2) {
                    Logger logger2 = this.logger;
                    LogDomain logDomain2 = LogDomain.NETWORK;
                    logger2.error(logDomain2, "Error loading image: " + image.uri(), e2);
                }
            }
            buildUpon.images(arrayList);
        }
        return nativeAdComponents.buildUpon().assets(buildUpon.build()).build();
    }
}
