package com.amazon.aps.ads.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbDeviceData;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsUtils.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsUtils {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "ApsUtils";
    @NotNull
    private static final String AMAZON_SCHEME = ApsAdWebViewSupportClient.AMAZON_SCHEME;
    @NotNull
    private static final String AMAZON_APP_STORE_LINK = ApsAdWebViewSupportClient.AMAZON_APP_STORE_LINK;
    @NotNull
    private static final String GOOGLE_PLAY_STORE_LINK = ApsAdWebViewSupportClient.GOOGLE_PLAY_STORE_LINK;

    /* compiled from: ApsUtils.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void directAppStoreLinkToBrowser(@NotNull Context context, @NotNull Uri uri) throws ActivityNotFoundException, NullPointerException {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (Intrinsics.m17075f(getAMAZON_SCHEME(), uri.getScheme())) {
                ApsLog.m102717d(getTAG(), "Amazon app store unavailable in the device");
                str = Intrinsics.m17064q(getAMAZON_APP_STORE_LINK(), uri.getQuery());
            } else {
                ApsLog.m102717d(getTAG(), "App store unavailable in the device");
                str = getGOOGLE_PLAY_STORE_LINK() + ((Object) uri.getHost()) + '?' + ((Object) uri.getQuery());
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }

        @NotNull
        public final String getAMAZON_APP_STORE_LINK() {
            return ApsUtils.AMAZON_APP_STORE_LINK;
        }

        @NotNull
        public final String getAMAZON_SCHEME() {
            return ApsUtils.AMAZON_SCHEME;
        }

        @NotNull
        public final String getGOOGLE_PLAY_STORE_LINK() {
            return ApsUtils.GOOGLE_PLAY_STORE_LINK;
        }

        @NotNull
        public final String getTAG() {
            return ApsUtils.TAG;
        }

        public final boolean isNullOrEmpty(@Nullable String str) {
            boolean m16614z;
            boolean m16614z2;
            m16614z = StringsJVM.m16614z(str, null, false, 2, null);
            if (!m16614z) {
                m16614z2 = StringsJVM.m16614z(str, "", false, 2, null);
                if (!m16614z2) {
                    return false;
                }
            }
            return true;
        }

        public final void setupMetrics(@Nullable Context context) {
            String str;
            if (context != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ApsMetrics.Companion companion = ApsMetrics.Companion;
                String sDKFramework = DtbCommonUtils.getSDKFramework();
                if (DtbDeviceDataRetriever.isTablet()) {
                    str = "tablet";
                } else {
                    str = "phone";
                }
                companion.init(context, new ApsMetricsDeviceInfo(sDKFramework, DtbDeviceDataRetriever.getScreenSize(displayMetrics, "portrait"), str, DtbDeviceData.getConnectionType(), null, 16, null), new ApsMetricsSdkInfo(Aps.getSdkVersion()));
            }
        }
    }

    private ApsUtils() {
    }
}
