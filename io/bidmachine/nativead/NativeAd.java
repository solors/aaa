package io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Set;

/* loaded from: classes9.dex */
public final class NativeAd extends BidMachineAd<NativeAd, NativeRequest, NativeAdObject, AdObjectParams, UnifiedNativeAdRequestParams, NativeListener> implements NativePublicData, NativeContainer {
    public NativeAd(@NonNull Context context) {
        super(context, AdsType.Native);
    }

    private boolean hasLoadedObject() {
        if (getLoadedAdObject() == null) {
            log("not loaded, please load ads first");
            return false;
        }
        return true;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getCallToAction() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getCallToAction();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getDescription() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getDescription();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getIcon() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getIcon();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public ImageData getMainImage() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getMainImage();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    @Nullable
    public View getProviderView(@NonNull Context context) {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getProviderView(context);
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    public float getRating() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getRating();
        }
        return -1.0f;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getTitle() {
        if (hasLoadedObject()) {
            return getLoadedAdObject().getTitle();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    public boolean hasVideo() {
        if (hasLoadedObject() && getLoadedAdObject().hasVideo()) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public boolean isViewRegistered() {
        if (hasLoadedObject() && getLoadedAdObject().isViewRegistered()) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void registerView(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set) {
        NativeAdObject prepareShow = prepareShow(false);
        if (prepareShow == null) {
            return;
        }
        prepareShow.registerView(viewGroup, view, nativeMediaView, set);
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void unregisterView() {
        if (hasLoadedObject()) {
            getLoadedAdObject().unregisterView();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    public NativeAdObject createAdObject(@NonNull ContextProvider contextProvider, @NonNull NativeRequest nativeRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedNativeAd createNativeAd = networkAdapter.createNativeAd();
        if (createNativeAd == null) {
            return null;
        }
        return new NativeAdObject(contextProvider, adProcessCallback, nativeRequest, adObjectParams, createNativeAd);
    }
}
