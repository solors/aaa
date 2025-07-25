package com.mobilefuse.sdk.network.model;

import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.user.Gender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.model.MfxBidRequestToMapKt */
/* loaded from: classes7.dex */
public final class MfxBidRequestToMap {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull MfxBidRequest toMap, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int intValue;
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tagid", toMap.getTagid());
        linkedHashMap.put("sdk_version", toMap.getSdkVersion());
        linkedHashMap.put("app_version", toMap.getAppVersion());
        boolean z7 = true;
        if (toMap.getTest()) {
            linkedHashMap.put(Constants.KEY_TEST, 1);
        }
        String ifa = toMap.getIfa();
        if (ifa != null && ifa.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_IFA, toMap.getIfa());
        }
        if (toMap.getLmt()) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_LMT, 1);
        }
        if (toMap.getDnt()) {
            linkedHashMap.put("dnt", 1);
        }
        String userAgent = toMap.getUserAgent();
        if (userAgent != null && userAgent.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            linkedHashMap.put("ua", toMap.getUserAgent());
        }
        String lang = toMap.getLang();
        if (lang != null && lang.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            linkedHashMap.put("lang", toMap.getLang());
        }
        DeviceType deviceType = toMap.getDeviceType();
        if (deviceType != null) {
            linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, Integer.valueOf(deviceType.getValue()));
        }
        if (toMap.getDeviceWidth() > 0) {
            linkedHashMap.put("device_w", Integer.valueOf(toMap.getDeviceWidth()));
        }
        if (toMap.getDeviceHeight() > 0) {
            linkedHashMap.put("device_h", Integer.valueOf(toMap.getDeviceHeight()));
        }
        Double lat = toMap.getLat();
        if (lat != null) {
            linkedHashMap.put(C19577ad.f49134q, Double.valueOf(lat.doubleValue()));
        }
        Double lon = toMap.getLon();
        if (lon != null) {
            linkedHashMap.put("lon", Double.valueOf(lon.doubleValue()));
        }
        Integer lastfix = toMap.getLastfix();
        if (lastfix != null) {
            linkedHashMap.put("lastfix", Integer.valueOf(lastfix.intValue()));
        }
        Integer accuracy = toMap.getAccuracy();
        if (accuracy != null) {
            linkedHashMap.put("accuracy", Integer.valueOf(accuracy.intValue()));
        }
        Double altitude = toMap.getAltitude();
        if (altitude != null) {
            linkedHashMap.put("altitude", Double.valueOf(altitude.doubleValue()));
        }
        Float pressure = toMap.getPressure();
        if (pressure != null) {
            linkedHashMap.put("pressure", Float.valueOf(pressure.floatValue()));
        }
        if (z) {
            for (Map.Entry<String, String> entry : toMap.getEidValues().entrySet()) {
                linkedHashMap.put("eid[" + entry.getKey() + ']', entry.getValue());
            }
        }
        String eidSource = toMap.getEidSource();
        if (eidSource != null && eidSource.length() != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            linkedHashMap.put("eid_source", toMap.getEidSource());
        }
        Integer yearOfBirth = toMap.getYearOfBirth();
        if (yearOfBirth != null && (intValue = yearOfBirth.intValue()) > 0) {
            linkedHashMap.put("yob", Integer.valueOf(intValue));
        }
        if (toMap.getGender() != Gender.UNKNOWN) {
            linkedHashMap.put("gender", toMap.getGender().getValue());
        }
        if (toMap.getCoppa()) {
            linkedHashMap.put("coppa", 1);
        }
        String gpp = toMap.getGpp();
        if (gpp != null && gpp.length() != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6) {
            linkedHashMap.put("gpp", toMap.getGpp());
        }
        String usPrivacy = toMap.getUsPrivacy();
        if (usPrivacy != null && usPrivacy.length() != 0) {
            z7 = false;
        }
        if (!z7) {
            linkedHashMap.put("us_privacy", toMap.getUsPrivacy());
        }
        if (toMap.getBannerWidth() > 0) {
            linkedHashMap.put("banner_width", Integer.valueOf(toMap.getBannerWidth()));
        }
        if (toMap.getBannerHeight() > 0) {
            linkedHashMap.put("banner_height", Integer.valueOf(toMap.getBannerHeight()));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map toMap$default(MfxBidRequest mfxBidRequest, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toMap(mfxBidRequest, z);
    }

    @NotNull
    public static final Map<String, String> toStringMap(@NotNull MfxBidRequest toStringMap) {
        int m17292f;
        Intrinsics.checkNotNullParameter(toStringMap, "$this$toStringMap");
        Map map$default = toMap$default(toStringMap, false, 1, null);
        m17292f = MapsJVM.m17292f(map$default.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m17292f);
        for (Map.Entry entry : map$default.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
