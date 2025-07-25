package net.pubnative.lite.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.request.BrandVersion;
import net.pubnative.lite.sdk.models.request.UserAgent;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class UserAgentProvider {
    private static final String KEY_USER_AGENT = "hybid_user_agent";
    private static final String KEY_USER_AGENT_LAST_VERSION = "hybid_user_agent_last_version";
    private static final String PREFERENCES_USER_AGENT = "net.pubnative.lite.useragent";
    private static final String TAG = "UserAgentProvider";
    private UserAgent mStructuredUserAgent;
    private String mUserAgent;

    /* loaded from: classes10.dex */
    public static final class Architecture {
        private static final String ARM = "arm";
        private static final String BITNESS_32 = "32";
        private static final String BITNESS_64 = "64";
        private static final String MIPS = "mips";
        private static final String X86 = "x86";
        private final String bitness;
        private final String name;

        public Architecture(String str, String str2) {
            this.name = str;
            this.bitness = str2;
        }

        public String getBitness() {
            return this.bitness;
        }

        public String getName() {
            return this.name;
        }
    }

    private List<BrandVersion> extractBrowserInfo(String str) {
        BrandVersion brandVersion = new BrandVersion();
        brandVersion.setBrand(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
        brandVersion.setVersion(Collections.singletonList(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        if (TextUtils.isEmpty(str)) {
            return Collections.singletonList(brandVersion);
        }
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile("Chrome\\/([\\d.]+)");
        Pattern compile2 = Pattern.compile("Chromium\\/([\\d.]+)");
        Pattern compile3 = Pattern.compile("Firefox\\/([\\d.]+)");
        Pattern compile4 = Pattern.compile("Mobile Safari\\/([\\d.]+)");
        Pattern compile5 = Pattern.compile("AppleWebKit\\/([\\d.]+)");
        Pattern compile6 = Pattern.compile("Edg\\/([\\d.]+)");
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            arrayList.add(parseBrowser("Chrome", matcher));
        }
        Matcher matcher2 = compile2.matcher(str);
        if (matcher2.find()) {
            arrayList.add(parseBrowser("Chromium", matcher2));
        }
        Matcher matcher3 = compile3.matcher(str);
        if (matcher3.find()) {
            arrayList.add(parseBrowser("Firefox", matcher3));
        }
        Matcher matcher4 = compile4.matcher(str);
        if (matcher4.find()) {
            arrayList.add(parseBrowser("Mobile Safari", matcher4));
        }
        Matcher matcher5 = compile5.matcher(str);
        if (matcher5.find()) {
            arrayList.add(parseBrowser("AppleWebKit", matcher5));
        }
        Matcher matcher6 = compile6.matcher(str);
        if (matcher6.find()) {
            arrayList.add(parseBrowser("Edge", matcher6));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(brandVersion);
        }
        return arrayList;
    }

    private Architecture getArchitecture() {
        String str;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length > 0) {
            str = strArr[0];
        } else {
            str = Build.CPU_ABI;
        }
        String str2 = "x86";
        if (!str.contains("x86")) {
            str2 = "arm";
            if (!str.contains("arm")) {
                str2 = "mips";
                if (!str.contains("mips")) {
                    str2 = str;
                }
            }
        }
        return new Architecture(str2, getBitness(str));
    }

    private String getBitness(String str) {
        if (TextUtils.isEmpty(str) || str.contains("64")) {
            return "64";
        }
        return "32";
    }

    private boolean isValidUserAgent(int i) {
        if (i == -1 || i != Build.VERSION.SDK_INT) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$fetchUserAgent$0(Context context, SharedPreferences sharedPreferences) {
        try {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            this.mUserAgent = userAgentString;
            fetchStructuredUserAgent(userAgentString);
            if (!TextUtils.isEmpty(this.mUserAgent)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(KEY_USER_AGENT, this.mUserAgent);
                edit.putInt(KEY_USER_AGENT_LAST_VERSION, Build.VERSION.SDK_INT);
                edit.apply();
            }
        } catch (RuntimeException e) {
            fetchStructuredUserAgent(null);
            Logger.m14227e(TAG, e.getMessage());
            HyBid.reportException((Exception) e);
        }
    }

    private BrandVersion parseBrowser(String str, Matcher matcher) {
        BrandVersion brandVersion = new BrandVersion();
        brandVersion.setBrand(str);
        String group = matcher.group(1);
        if (TextUtils.isEmpty(group)) {
            brandVersion.setVersion(Collections.singletonList(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        } else {
            String[] split = group.split("\\.");
            if (split.length > 0) {
                brandVersion.setVersion(Arrays.asList(split));
            } else {
                brandVersion.setVersion(Collections.singletonList(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
            }
        }
        return brandVersion;
    }

    public void fetchStructuredUserAgent(String str) {
        if (this.mStructuredUserAgent == null) {
            BrandVersion brandVersion = new BrandVersion();
            brandVersion.setBrand("Android");
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(Build.VERSION.RELEASE));
            brandVersion.setVersion(arrayList);
            UserAgent userAgent = new UserAgent();
            this.mStructuredUserAgent = userAgent;
            userAgent.setSource(0);
            this.mStructuredUserAgent.setMobile(1);
            Architecture architecture = getArchitecture();
            if (!TextUtils.isEmpty(architecture.getName())) {
                this.mStructuredUserAgent.setArchitecture(architecture.getName());
                this.mStructuredUserAgent.setBitness(architecture.getBitness());
            }
            this.mStructuredUserAgent.setModel(Build.MODEL);
            this.mStructuredUserAgent.setPlatform(brandVersion);
            this.mStructuredUserAgent.setBrowsers(extractBrowserInfo(str));
        }
    }

    public void fetchUserAgent(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_USER_AGENT, 0);
        String string = sharedPreferences.getString(KEY_USER_AGENT, "");
        int i = sharedPreferences.getInt(KEY_USER_AGENT_LAST_VERSION, -1);
        if (!TextUtils.isEmpty(string) && isValidUserAgent(i)) {
            this.mUserAgent = string;
            fetchStructuredUserAgent(string);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.f
            {
                UserAgentProvider.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserAgentProvider.this.lambda$fetchUserAgent$0(context, sharedPreferences);
            }
        });
    }

    public UserAgent getStructuredUserAgent() {
        return this.mStructuredUserAgent;
    }

    public String getUserAgent() {
        return this.mUserAgent;
    }

    public void initialise(Context context) {
        fetchUserAgent(context);
    }
}
