package net.pubnative.lite.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.impl.C4801lz;
import com.facebook.AuthenticationTokenClaims;
import com.ironsource.C19577ad;
import com.ironsource.C20517nb;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ProtoExtConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.Topic;
import net.pubnative.lite.sdk.models.bidstream.BidParam;
import net.pubnative.lite.sdk.models.bidstream.Signal;

/* loaded from: classes10.dex */
public final class PNApiUrlComposer {
    private static Uri buildUri(String str, PNAdRequest pNAdRequest) {
        Field[] declaredFields;
        String valueOf;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("api");
        buildUpon.appendPath("v3");
        buildUpon.appendPath("native");
        if (!TextUtils.isEmpty(pNAdRequest.appToken)) {
            buildUpon.appendQueryParameter("apptoken", pNAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101934os)) {
            buildUpon.appendQueryParameter("os", pNAdRequest.f101934os);
        }
        if (!TextUtils.isEmpty(pNAdRequest.osver)) {
            buildUpon.appendQueryParameter("osver", pNAdRequest.osver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.devicemodel)) {
            buildUpon.appendQueryParameter(C20517nb.f52188n, pNAdRequest.devicemodel);
        }
        if (!TextUtils.isEmpty(pNAdRequest.make)) {
            buildUpon.appendQueryParameter("make", pNAdRequest.make);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceHeight)) {
            buildUpon.appendQueryParameter("dh", pNAdRequest.deviceHeight);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceWidth)) {
            buildUpon.appendQueryParameter("dw", pNAdRequest.deviceWidth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.orientation)) {
            buildUpon.appendQueryParameter("scro", pNAdRequest.orientation);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ppi)) {
            buildUpon.appendQueryParameter("ppi", pNAdRequest.ppi);
        }
        if (!TextUtils.isEmpty(pNAdRequest.pxratio)) {
            buildUpon.appendQueryParameter("pxratio", pNAdRequest.pxratio);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101932js)) {
            buildUpon.appendQueryParameter("js", pNAdRequest.f101932js);
        }
        if (!TextUtils.isEmpty(pNAdRequest.soundSetting)) {
            buildUpon.appendQueryParameter(AuthenticationTokenClaims.JSON_KEY_AUD, pNAdRequest.soundSetting);
        }
        if (!TextUtils.isEmpty(pNAdRequest.dnt)) {
            buildUpon.appendQueryParameter("dnt", pNAdRequest.dnt);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101931al)) {
            buildUpon.appendQueryParameter(CampaignEx.JSON_KEY_AD_AL, pNAdRequest.f101931al);
        }
        if (!TextUtils.isEmpty(pNAdRequest.width)) {
            buildUpon.appendQueryParameter(POBNativeConstants.NATIVE_IMAGE_WIDTH, pNAdRequest.width);
        }
        if (!TextUtils.isEmpty(pNAdRequest.height)) {
            buildUpon.appendQueryParameter("h", pNAdRequest.height);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101933mf)) {
            buildUpon.appendQueryParameter("mf", pNAdRequest.f101933mf);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101930af)) {
            buildUpon.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, pNAdRequest.f101930af);
        }
        if (!TextUtils.isEmpty(pNAdRequest.zoneId)) {
            buildUpon.appendQueryParameter("zoneid", pNAdRequest.zoneId);
        }
        if (!TextUtils.isEmpty(pNAdRequest.testMode)) {
            buildUpon.appendQueryParameter(Constants.KEY_TEST, pNAdRequest.testMode);
        }
        if (!TextUtils.isEmpty(pNAdRequest.locale)) {
            buildUpon.appendQueryParameter(CommonUrlParts.LOCALE, pNAdRequest.locale);
        }
        if (!TextUtils.isEmpty(pNAdRequest.language)) {
            buildUpon.appendQueryParameter("language", pNAdRequest.language);
        }
        if (!TextUtils.isEmpty(pNAdRequest.langb)) {
            buildUpon.appendQueryParameter("langb", pNAdRequest.langb);
        }
        if (!TextUtils.isEmpty(pNAdRequest.latitude)) {
            buildUpon.appendQueryParameter(C19577ad.f49134q, pNAdRequest.latitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.longitude)) {
            buildUpon.appendQueryParameter("long", pNAdRequest.longitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gender)) {
            buildUpon.appendQueryParameter("gender", pNAdRequest.gender);
        }
        if (!TextUtils.isEmpty(pNAdRequest.age)) {
            buildUpon.appendQueryParameter("age", pNAdRequest.age);
        }
        if (!TextUtils.isEmpty(pNAdRequest.bundleid)) {
            buildUpon.appendQueryParameter("bundleid", pNAdRequest.bundleid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.keywords)) {
            buildUpon.appendQueryParameter("keywords", pNAdRequest.keywords);
        }
        if (!TextUtils.isEmpty(pNAdRequest.coppa)) {
            buildUpon.appendQueryParameter("coppa", pNAdRequest.coppa);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gid)) {
            buildUpon.appendQueryParameter("gid", pNAdRequest.gid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidmd5)) {
            buildUpon.appendQueryParameter("gidmd5", pNAdRequest.gidmd5);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidsha1)) {
            buildUpon.appendQueryParameter("gidsha1", pNAdRequest.gidsha1);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanager)) {
            buildUpon.appendQueryParameter("displaymanager", pNAdRequest.displaymanager);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanagerver)) {
            buildUpon.appendQueryParameter("displaymanagerver", pNAdRequest.displaymanagerver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpn)) {
            buildUpon.appendQueryParameter(ProtoExtConstants.Source.OMID_PN, pNAdRequest.omidpn);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpv)) {
            buildUpon.appendQueryParameter(ProtoExtConstants.Source.OMID_PV, pNAdRequest.omidpv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101935rv)) {
            buildUpon.appendQueryParameter("rv", pNAdRequest.f101935rv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.usprivacy)) {
            buildUpon.appendQueryParameter("usprivacy", pNAdRequest.usprivacy);
        }
        if (!TextUtils.isEmpty(pNAdRequest.userconsent)) {
            buildUpon.appendQueryParameter("userconsent", pNAdRequest.userconsent);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppstring)) {
            buildUpon.appendQueryParameter("gpp", pNAdRequest.gppstring);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppsid)) {
            buildUpon.appendQueryParameter("gppsid", pNAdRequest.gppsid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.carrier)) {
            buildUpon.appendQueryParameter("carrier", pNAdRequest.carrier);
        }
        if (!TextUtils.isEmpty(pNAdRequest.connectiontype)) {
            buildUpon.appendQueryParameter(C20517nb.f52179e, pNAdRequest.connectiontype);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmnc)) {
            buildUpon.appendQueryParameter("mccmnc", pNAdRequest.mccmnc);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmncsim)) {
            buildUpon.appendQueryParameter("mccmncsim", pNAdRequest.mccmncsim);
        }
        if (!TextUtils.isEmpty(pNAdRequest.geofetch)) {
            buildUpon.appendQueryParameter("geofetch", pNAdRequest.geofetch);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sua)) {
            buildUpon.appendQueryParameter("sua", pNAdRequest.sua);
        }
        if (!TextUtils.isEmpty(pNAdRequest.f101929ae)) {
            buildUpon.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, pNAdRequest.f101929ae);
        }
        if (!TextUtils.isEmpty(pNAdRequest.protocol)) {
            buildUpon.appendQueryParameter("protocol", pNAdRequest.protocol);
        }
        if (!TextUtils.isEmpty(pNAdRequest.api)) {
            buildUpon.appendQueryParameter("api", pNAdRequest.api);
        }
        if (!TextUtils.isEmpty(pNAdRequest.impdepth)) {
            buildUpon.appendQueryParameter("impdepth", pNAdRequest.impdepth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ageofapp)) {
            buildUpon.appendQueryParameter("ageofapp", pNAdRequest.ageofapp);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sessionduration)) {
            buildUpon.appendQueryParameter("sessionduration", pNAdRequest.sessionduration);
        }
        String str2 = "";
        if (!pNAdRequest.getSignals().isEmpty()) {
            for (Signal signal : pNAdRequest.getSignals()) {
                for (Field field : signal.getClass().getDeclaredFields()) {
                    BidParam bidParam = (BidParam) field.getAnnotation(BidParam.class);
                    if (bidParam != null) {
                        try {
                            if (Iterable.class.isAssignableFrom(field.getType())) {
                                String valueOf2 = String.valueOf(field.get(signal));
                                valueOf = valueOf2.substring(1, valueOf2.length() - 1).replaceAll("\\s+", "");
                            } else {
                                valueOf = String.valueOf(field.get(signal));
                            }
                            if (!TextUtils.isEmpty(valueOf) && !valueOf.equals("null") && !TextUtils.isEmpty(bidParam.name())) {
                                buildUpon.appendQueryParameter(bidParam.name(), valueOf);
                            }
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
            }
        }
        List<Topic> list = pNAdRequest.topics;
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Topic topic : pNAdRequest.topics) {
                String concat = String.valueOf(topic.getTaxonomyVersion()).concat(",").concat(topic.getTaxonomyVersionName().replaceAll("\\s", "+"));
                if (!hashMap.containsKey(concat)) {
                    hashMap.put(concat, new ArrayList());
                }
                ArrayList arrayList = (ArrayList) hashMap.get(concat);
                Objects.requireNonNull(arrayList);
                arrayList.add(String.valueOf(topic.getId()));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                str2 = str2.concat((String) entry.getKey()).concat(",").concat(C4801lz.m97621a(",", (ArrayList) entry.getValue())).concat("_");
            }
            buildUpon.appendQueryParameter("psut", str2.substring(0, str2.length() - 1));
        }
        return buildUpon.build();
    }

    public static String buildUrl(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).toString();
    }

    public static String getUrlQuery(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).getQuery();
    }
}
