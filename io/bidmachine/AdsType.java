package io.bidmachine;

import android.graphics.Point;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.C10729Ad;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Logger;
import io.bidmachine.displays.DisplayPlacementBuilder;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.displays.VideoPlacementBuilder;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public enum AdsType {
    Banner("banner", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder<UnifiedBannerAdRequestParams>(false) { // from class: io.bidmachine.AdsType.a
        @Override // io.bidmachine.displays.DisplayPlacementBuilder, io.bidmachine.displays.ISizableDisplayPlacement
        public Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams) {
            BannerSize bannerSize = unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize();
            return new Point(bannerSize.width, bannerSize.height);
        }
    }}),
    Interstitial("interstitial", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(true)}),
    Rewarded("rewarded", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new VideoPlacementBuilder(false)}),
    Native("native", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new PlacementBuilder<UnifiedNativeAdRequestParams>() { // from class: io.bidmachine.displays.NativePlacementBuilder
        static final int CTA_ASSET_ID = 8;
        static final int DESC_ASSET_ID = 127;
        static final int ICON_ASSET_ID = 124;
        static final int IMAGE_ASSET_ID = 128;
        static final int RATING_ASSET_ID = 7;
        static final int TITLE_ASSET_ID = 123;
        static final int VIDEO_ASSET_ID = 4;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ctaAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder descAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ratingAsset;
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder titleAsset;

        static {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            titleAsset = newBuilder;
            newBuilder.setId(123);
            newBuilder.setReq(true);
            newBuilder.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            descAsset = newBuilder2;
            newBuilder2.setId(127);
            newBuilder2.setReq(true);
            newBuilder2.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            ctaAsset = newBuilder3;
            newBuilder3.setId(8);
            newBuilder3.setReq(true);
            newBuilder3.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            ratingAsset = newBuilder4;
            newBuilder4.setId(7);
            newBuilder4.setReq(false);
            newBuilder4.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
        }

        {
            AdContentType adContentType = AdContentType.All;
        }

        @NonNull
        @VisibleForTesting
        static Placement.DisplayPlacement.NativeFormat.AssetFormat createIconAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            newBuilder.setId(124);
            newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Icon));
            newBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return newBuilder.build();
        }

        @NonNull
        @VisibleForTesting
        static Placement.DisplayPlacement.NativeFormat.AssetFormat createImageAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            newBuilder.setId(128);
            newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Image));
            newBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return newBuilder.build();
        }

        @NonNull
        @VisibleForTesting
        static Placement.DisplayPlacement.NativeFormat.AssetFormat createVideoAsset(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            newBuilder.setId(4);
            newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Video));
            newBuilder.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
            return newBuilder.build();
        }

        @Override // io.bidmachine.displays.PlacementBuilder
        @Nullable
        public AdObjectParams createAdObjectParams(@NonNull C10729Ad c10729Ad) {
            AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(c10729Ad);
            if (createHeaderBiddingAdObjectParams == null && c10729Ad.hasDisplay() && c10729Ad.getDisplay().hasNative()) {
                return new NativeAdObjectParams(c10729Ad);
            }
            return createHeaderBiddingAdObjectParams;
        }

        @Override // io.bidmachine.displays.PlacementBuilder
        @NonNull
        public /* bridge */ /* synthetic */ Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull AdsType adsType, @NonNull Collection collection, @NonNull List list, int i) throws Exception {
            return createPlacement2(contextProvider, unifiedNativeAdRequestParams, adsType, (Collection<NetworkConfig>) collection, (List<NetworkAdUnit>) list, i);
        }

        @NonNull
        /* renamed from: createPlacement  reason: avoid collision after fix types in other method */
        public Message.Builder createPlacement2(@NonNull ContextProvider contextProvider, @NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i) throws Exception {
            Placement.DisplayPlacement.Builder addAllMime = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES));
            Placement.DisplayPlacement.NativeFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
            newBuilder.addAsset(titleAsset);
            newBuilder.addAsset(descAsset);
            newBuilder.addAsset(ctaAsset);
            newBuilder.addAsset(ratingAsset);
            newBuilder.addAsset(createIconAsset(unifiedNativeAdRequestParams));
            newBuilder.addAsset(createImageAsset(unifiedNativeAdRequestParams));
            newBuilder.addAsset(createVideoAsset(unifiedNativeAdRequestParams));
            addAllMime.setNativefmt(newBuilder);
            HeaderBiddingPlacement.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedNativeAdRequestParams, adsType, collection, list, i);
            if (createHeaderBiddingPlacement != null) {
                addAllMime.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
            }
            return addAllMime;
        }
    }});
    
    @NonNull
    private final ApiRequest.ApiAuctionDataBinder binder;
    @NonNull
    private final String name;
    @NonNull
    private final PlacementBuilder[] placementBuilders;
    @NonNull
    private final Executor placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

    /* renamed from: io.bidmachine.AdsType$b */
    /* loaded from: classes9.dex */
    public class RunnableC35159b implements Runnable {
        final /* synthetic */ UnifiedAdRequestParams val$adRequestParams;
        final /* synthetic */ ContextProvider val$contextProvider;
        final /* synthetic */ List val$networkAdUnits;
        final /* synthetic */ Collection val$networkConfigList;
        final /* synthetic */ int val$networksLoadingTimeOutSec;
        final /* synthetic */ PlacementBuilder val$placementBuilder;
        final /* synthetic */ List val$placementList;
        final /* synthetic */ CountDownLatch val$syncLock;

        RunnableC35159b(PlacementBuilder placementBuilder, ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, Collection collection, List list, int i, List list2, CountDownLatch countDownLatch) {
            AdsType.this = r1;
            this.val$placementBuilder = placementBuilder;
            this.val$contextProvider = contextProvider;
            this.val$adRequestParams = unifiedAdRequestParams;
            this.val$networkConfigList = collection;
            this.val$networkAdUnits = list;
            this.val$networksLoadingTimeOutSec = i;
            this.val$placementList = list2;
            this.val$syncLock = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Message.Builder createPlacement = this.val$placementBuilder.createPlacement(this.val$contextProvider, this.val$adRequestParams, AdsType.this, this.val$networkConfigList, this.val$networkAdUnits, this.val$networksLoadingTimeOutSec);
                synchronized (this.val$placementList) {
                    this.val$placementList.add(createPlacement);
                }
                this.val$syncLock.countDown();
            } catch (Exception e) {
                Logger.m20086w(e);
                this.val$syncLock.countDown();
            }
        }
    }

    AdsType(@NonNull String str, @NonNull ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, @NonNull PlacementBuilder[] placementBuilderArr) {
        this.name = str;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = placementBuilderArr;
    }

    public void collectPlacements(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull Collection<NetworkConfig> collection, @NonNull List<Message.Builder> list, @NonNull List<NetworkAdUnit> list2, int i) {
        PlacementBuilder[] placementBuilderArr;
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        PlacementBuilder[] placementBuilderArr2 = adsType.placementBuilders;
        int length = placementBuilderArr2.length;
        int i2 = 0;
        while (i2 < length) {
            PlacementBuilder placementBuilder = placementBuilderArr2[i2];
            if (adRequest.isPlacementBuilderMatch(placementBuilder)) {
                placementBuilderArr = placementBuilderArr2;
                adsType.placementCreateExecutor.execute(new RunnableC35159b(placementBuilder, contextProvider, unifiedAdRequestParams, collection, list2, i, list, countDownLatch));
            } else {
                placementBuilderArr = placementBuilderArr2;
                countDownLatch.countDown();
            }
            i2++;
            adsType = this;
            placementBuilderArr2 = placementBuilderArr;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Logger.m20086w(e);
        }
    }

    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull C10729Ad c10729Ad) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            AdObjectParams createAdObjectParams = placementBuilder.createAdObjectParams(c10729Ad);
            if (createAdObjectParams != null) {
                return createAdObjectParams;
            }
        }
        return null;
    }

    @Nullable
    public NetworkAdapter findNetworkAdapter(@NonNull C10729Ad c10729Ad) {
        NetworkAdapter networkAdapter;
        HeaderBiddingAd obtainHeaderBiddingAd = obtainHeaderBiddingAd(c10729Ad);
        if (obtainHeaderBiddingAd != null) {
            networkAdapter = NetworkRegistry.getAdapter(obtainHeaderBiddingAd.getBidder());
        } else {
            networkAdapter = null;
        }
        if (networkAdapter == null) {
            if (this == Native) {
                return NetworkRegistry.getAdapter(NastAdapter.KEY);
            }
            if (c10729Ad.hasDisplay()) {
                return NetworkRegistry.getAdapter("mraid");
            }
            if (c10729Ad.hasVideo()) {
                return NetworkRegistry.getAdapter("vast");
            }
            return networkAdapter;
        }
        return networkAdapter;
    }

    @NonNull
    public ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        if (this != Interstitial && this != Rewarded) {
            return false;
        }
        return true;
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull C10729Ad c10729Ad) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            HeaderBiddingAd obtainHeaderBiddingAd = placementBuilder.obtainHeaderBiddingAd(c10729Ad);
            if (obtainHeaderBiddingAd != null) {
                return obtainHeaderBiddingAd;
            }
        }
        return null;
    }
}
