package io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ReflectionUtils;
import java.util.Map;

/* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.n */
/* loaded from: classes9.dex */
class C35438n {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static AdManagerAdRequest m20493a(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = adUnit.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : adUnit.getCustomTargetingMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting2(key, value);
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static BMError m20492a(@NonNull BMError bMError, @NonNull AdError adError) {
        return new BMError(bMError, adError.getCode(), adError.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public static InternalAdLoadData m20496a(@Nullable BaseAdView baseAdView) {
        if (baseAdView == null) {
            return null;
        }
        Waterfall.Result.EstimatedPrice m20491a = m20491a(baseAdView, new String[]{"zza", "zzj", "zza", "a", "a", "k", ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT});
        ResponseInfo responseInfo = baseAdView.getResponseInfo();
        String responseInfo2 = responseInfo != null ? responseInfo.toString() : null;
        if (m20491a == null && responseInfo2 == null) {
            return null;
        }
        return new InternalAdLoadData(m20491a, responseInfo2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public static InternalAdLoadData m20495a(@Nullable InterstitialAd interstitialAd) {
        if (interstitialAd == null) {
            return null;
        }
        return new InternalAdLoadData(m20491a(interstitialAd, new String[]{"zzc", "zza", "a", "a", "k", ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), interstitialAd.getResponseInfo().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public static InternalAdLoadData m20494a(@Nullable RewardedAd rewardedAd) {
        if (rewardedAd == null) {
            return null;
        }
        return new InternalAdLoadData(m20491a(rewardedAd, new String[]{"zzb", "zza", "b", "k", ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), rewardedAd.getResponseInfo().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static Waterfall.Result.EstimatedPrice m20497a(@NonNull AdValue adValue) {
        return Waterfall.Result.EstimatedPrice.newBuilder().setValue(DoubleValue.newBuilder().setValue(adValue.getValueMicros()).build()).setCurrency(StringValue.newBuilder().setValue(adValue.getCurrencyCode()).build()).setPrecision(UInt32Value.newBuilder().setValue(adValue.getPrecisionType()).build()).build();
    }

    @Nullable
    @WorkerThread
    /* renamed from: a */
    static Waterfall.Result.EstimatedPrice m20491a(@NonNull Object obj, @NonNull String[] strArr) {
        try {
            Object findValueByPath = ReflectionUtils.findValueByPath(obj, strArr);
            if (findValueByPath == null) {
                return null;
            }
            Integer num = (Integer) ReflectionUtils.findValue(findValueByPath, "b");
            String str = (String) ReflectionUtils.findValue(findValueByPath, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            Number number = (Number) ReflectionUtils.findValue(findValueByPath, "d");
            Double valueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            if (num == null && str == null && valueOf == null) {
                return null;
            }
            Waterfall.Result.EstimatedPrice.Builder newBuilder = Waterfall.Result.EstimatedPrice.newBuilder();
            if (valueOf != null) {
                newBuilder.setValue(DoubleValue.newBuilder().setValue(valueOf.doubleValue()).build());
            }
            if (str != null) {
                newBuilder.setCurrency(StringValue.newBuilder().setValue(str).build());
            }
            if (num != null) {
                newBuilder.setPrecision(UInt32Value.newBuilder().setValue(num.intValue()).build());
            }
            return newBuilder.build();
        } catch (Throwable unused) {
            return null;
        }
    }
}
