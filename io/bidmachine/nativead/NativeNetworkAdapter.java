package io.bidmachine.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ImageData;
import io.bidmachine.nativead.view.NativeMediaView;
import java.util.Set;

/* loaded from: classes9.dex */
public class NativeNetworkAdapter implements NativeData {
    private String callToAction;
    private String clickUrl;
    private String description;
    private boolean hasVideo;
    private ImageData iconImageData;
    private ImageData mainImageData;
    private String title;
    private String videoAdm;
    private String videoUrl;
    private float rating = -1.0f;
    private boolean isNetworkControlLoadingAssets = true;

    @Nullable
    public ViewGroup configureContainer(@NonNull Context context) {
        return null;
    }

    public boolean configureMediaView(@NonNull NativeMediaView nativeMediaView) {
        return false;
    }

    @Nullable
    public View createProviderView(@NonNull Context context) {
        return null;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getClickUrl() {
        return this.clickUrl;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getDescription() {
        return this.description;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getIcon() {
        return this.iconImageData;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getMainImage() {
        return this.mainImageData;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public float getRating() {
        return this.rating;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public String getTitle() {
        return this.title;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoAdm() {
        return this.videoAdm;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
    public boolean hasVideo() {
        return this.hasVideo;
    }

    public boolean isNetworkControlLoadingAssets() {
        return this.isNetworkControlLoadingAssets;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(getTitle()) && !TextUtils.isEmpty(getDescription()) && !TextUtils.isEmpty(getCallToAction())) {
            return true;
        }
        return false;
    }

    public NativeNetworkAdapter setCallToAction(String str) {
        this.callToAction = str;
        return this;
    }

    public NativeNetworkAdapter setClickUrl(String str) {
        this.clickUrl = str;
        return this;
    }

    public NativeNetworkAdapter setDescription(String str) {
        this.description = str;
        return this;
    }

    public NativeNetworkAdapter setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public NativeNetworkAdapter setIcon(ImageData imageData) {
        this.iconImageData = imageData;
        return this;
    }

    public NativeNetworkAdapter setMainImage(ImageData imageData) {
        this.mainImageData = imageData;
        return this;
    }

    public NativeNetworkAdapter setNetworkControlLoadingAssets(boolean z) {
        this.isNetworkControlLoadingAssets = z;
        return this;
    }

    public NativeNetworkAdapter setRating(float f) {
        this.rating = f;
        return this;
    }

    public NativeNetworkAdapter setTitle(String str) {
        this.title = str;
        return this;
    }

    public NativeNetworkAdapter setVideoAdm(String str) {
        this.videoAdm = str;
        return this;
    }

    public NativeNetworkAdapter setVideoUrl(String str) {
        this.videoUrl = str;
        return this;
    }

    public void destroy() {
    }

    public void unregisterNative() {
    }

    public void registerNative(@NonNull ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set) {
    }
}
