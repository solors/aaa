package net.pubnative.lite.sdk.utils;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.utils.PrebidUtils;

/* loaded from: classes10.dex */
public class HeaderBiddingUtils {
    private static final double ECPM_POINTS_DIVIDER = 1000.0d;

    /* loaded from: classes10.dex */
    public interface KEYS {
        public static final String PN_BID = "pn_bid";
    }

    /* loaded from: classes10.dex */
    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    private static String getBidECPM(C38595Ad c38595Ad, KeywordMode keywordMode) {
        String str;
        Double valueOf = Double.valueOf(c38595Ad.getECPM().doubleValue() / ECPM_POINTS_DIVIDER);
        if (keywordMode == KeywordMode.TWO_DECIMALS) {
            str = "%.2f";
        } else {
            str = "%.3f";
        }
        return String.format(Locale.ENGLISH, str, valueOf);
    }

    public static String getBidFromPoints(Integer num, PrebidUtils.KeywordMode keywordMode) {
        String str;
        Double valueOf = Double.valueOf(num.doubleValue() / ECPM_POINTS_DIVIDER);
        if (keywordMode == PrebidUtils.KeywordMode.TWO_DECIMALS) {
            str = "%.2f";
        } else {
            str = "%.3f";
        }
        return String.format(Locale.ENGLISH, str, valueOf);
    }

    public static String getHeaderBiddingKeywords(C38595Ad c38595Ad) {
        return getHeaderBiddingKeywords(c38595Ad, "");
    }

    public static Bundle getHeaderBiddingKeywordsBundle(C38595Ad c38595Ad) {
        return getHeaderBiddingKeywordsBundle(c38595Ad, "");
    }

    public static Set<String> getHeaderBiddingKeywordsSet(C38595Ad c38595Ad) {
        return getHeaderBiddingKeywordsSet(c38595Ad, "");
    }

    public static String getHeaderBiddingKeywords(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywords(c38595Ad, "", keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsBundle(c38595Ad, "", keywordMode);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsSet(c38595Ad, "", keywordMode);
    }

    public static String getHeaderBiddingKeywords(C38595Ad c38595Ad, String str) {
        return getHeaderBiddingKeywords(c38595Ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(C38595Ad c38595Ad, String str) {
        return getHeaderBiddingKeywordsBundle(c38595Ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(C38595Ad c38595Ad, String str) {
        return getHeaderBiddingKeywordsSet(c38595Ad, str, KeywordMode.THREE_DECIMALS);
    }

    public static String getHeaderBiddingKeywords(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        return "pn_bid:" + getBidECPM(c38595Ad, keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        Bundle bundle = new Bundle();
        bundle.putString(KEYS.PN_BID, getBidECPM(c38595Ad, keywordMode));
        return bundle;
    }

    public static Set<String> getHeaderBiddingKeywordsSet(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        linkedHashSet.add(KEYS.PN_BID.concat(":").concat(getBidECPM(c38595Ad, keywordMode)));
        return linkedHashSet;
    }
}
