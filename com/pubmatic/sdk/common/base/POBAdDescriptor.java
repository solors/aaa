package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface POBAdDescriptor {
    public static final int BID_STATUS_NOT_OK = 0;
    public static final int BID_STATUS_OK = 1;
    public static final String CREATIVE_TYPE_BANNER = "banner";
    public static final String CREATIVE_TYPE_NATIVE = "native";
    public static final String CREATIVE_TYPE_VIDEO = "video";
    public static final String DYNAMIC_PRICE_BID = "dynamic";
    public static final String STATIC_PRICE_BID = "static";

    @Nullable
    POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i, int i2);

    boolean enableDsaInfoIcon();

    @Nullable
    String getBundle();

    @Nullable
    List<String> getClickTrackers();

    int getContentHeight();

    int getContentWidth();

    @Nullable
    String getCreativeType();

    @Nullable
    String getDisplayedOnBehalfOf();

    @Nullable
    String getId();

    @NonNull
    POBImpressionCountingMethod getImpressionCountingMethod();

    @Nullable
    String getPaidBy();

    @Nullable
    JSONObject getRawBid();

    int getRefreshInterval();

    @Nullable
    String getRenderableContent();

    int getStatus();

    @Nullable
    Map<String, String> getTargetingInfo();

    @Nullable
    List<POBDSATransparencyInfo> getTransparencyData();

    boolean isCompanion();

    boolean isVideo();
}
