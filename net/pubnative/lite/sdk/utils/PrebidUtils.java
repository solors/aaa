package net.pubnative.lite.sdk.utils;

import android.os.Bundle;
import java.util.Set;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.utils.HeaderBiddingUtils;

/* loaded from: classes10.dex */
public class PrebidUtils {

    /* loaded from: classes10.dex */
    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    public static String getBidFromPoints(Integer num, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getBidFromPoints(num, keywordMode);
    }

    public static String getPrebidKeywords(C38595Ad c38595Ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(c38595Ad);
    }

    public static Bundle getPrebidKeywordsBundle(C38595Ad c38595Ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(c38595Ad);
    }

    public static Set<String> getPrebidKeywordsSet(C38595Ad c38595Ad) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(c38595Ad);
    }

    private static HeaderBiddingUtils.KeywordMode mapKeywordMode(KeywordMode keywordMode) {
        if (keywordMode == KeywordMode.TWO_DECIMALS) {
            return HeaderBiddingUtils.KeywordMode.TWO_DECIMALS;
        }
        return HeaderBiddingUtils.KeywordMode.THREE_DECIMALS;
    }

    public static String getPrebidKeywords(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(c38595Ad, mapKeywordMode(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(c38595Ad, mapKeywordMode(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(C38595Ad c38595Ad, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(c38595Ad, mapKeywordMode(keywordMode));
    }

    public static String getPrebidKeywords(C38595Ad c38595Ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(c38595Ad, str);
    }

    public static Bundle getPrebidKeywordsBundle(C38595Ad c38595Ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(c38595Ad, str);
    }

    public static Set<String> getPrebidKeywordsSet(C38595Ad c38595Ad, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(c38595Ad, str);
    }

    public static String getPrebidKeywords(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(c38595Ad, str, mapKeywordMode(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(c38595Ad, str, mapKeywordMode(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(C38595Ad c38595Ad, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(c38595Ad, str, mapKeywordMode(keywordMode));
    }
}
