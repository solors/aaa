package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.y3 */
/* loaded from: classes7.dex */
public class C26243y3 extends AbstractC26054r3 {
    @Nullable
    private ImageData optimalLandscapeImage;
    @Nullable
    private ImageData optimalPortraitImage;
    @NonNull
    private final List<ImageData> portraitImages = new ArrayList();
    @NonNull
    private final List<ImageData> landscapeImages = new ArrayList();

    private C26243y3() {
    }

    @NonNull
    public static C26243y3 fromCompanion(@NonNull C25726e1 c25726e1) {
        C26243y3 newBanner = newBanner();
        newBanner.setId(c25726e1.getId());
        String staticResource = c25726e1.getStaticResource();
        if (staticResource != null) {
            newBanner.addPortraitImage(ImageData.newImageData(staticResource, c25726e1.getWidth(), c25726e1.getHeight()));
            newBanner.getStatHolder().m44005a(c25726e1.getStatHolder(), 0.0f);
            newBanner.trackingLink = c25726e1.trackingLink;
        }
        return newBanner;
    }

    @NonNull
    public static C26243y3 newBanner() {
        return new C26243y3();
    }

    public void addLandscapeImage(@NonNull ImageData imageData) {
        this.landscapeImages.add(imageData);
    }

    public void addPortraitImage(@NonNull ImageData imageData) {
        this.portraitImages.add(imageData);
    }

    @NonNull
    public List<ImageData> getLandscapeImages() {
        return new ArrayList(this.landscapeImages);
    }

    @Nullable
    public ImageData getOptimalLandscapeImage() {
        return this.optimalLandscapeImage;
    }

    @Nullable
    public ImageData getOptimalPortraitImage() {
        return this.optimalPortraitImage;
    }

    @NonNull
    public List<ImageData> getPortraitImages() {
        return new ArrayList(this.portraitImages);
    }

    public void setOptimalLandscapeImage(@Nullable ImageData imageData) {
        this.optimalLandscapeImage = imageData;
    }

    public void setOptimalPortraitImage(@Nullable ImageData imageData) {
        this.optimalPortraitImage = imageData;
    }
}
