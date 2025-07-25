package sg.bigo.ads.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.common.utils.C43836q;

/* loaded from: classes10.dex */
public class AdConfig {
    private static final String EMPTY_APP_KEY = "empty_app_id";
    public static final String EXTRA_KEY_HOST_RULES = "host_rules";
    public static final int GENDER_FEMALE = 1;
    public static final int GENDER_MALE = 2;
    private long activatedTime;
    private int age;
    @NonNull
    private String appKey;
    private String channel;
    private boolean debug;
    private Map<String, String> extra;
    private int gender;

    /* loaded from: classes10.dex */
    public static class Builder {
        private String appKey;
        private String channel;
        private boolean debug;
        private final Map<String, String> extra;
        private int age = 0;
        private int gender = 0;
        private long activatedTime = 0;

        public Builder() {
            HashMap hashMap = new HashMap();
            this.extra = hashMap;
            if (!TextUtils.isEmpty("api.o84tf0.ru")) {
                hashMap.put("host_rules", "[{\"country\":\"ru\",\"host\":\"api.o84tf0.ru\"}]");
            }
        }

        public Builder addExtra(String str, String str2) {
            if (!C43836q.m4837a((CharSequence) str) && !C43836q.m4837a((CharSequence) str2)) {
                this.extra.put(str, str2);
            }
            return this;
        }

        public AdConfig build() {
            String str;
            AdConfig adConfig = new AdConfig();
            if (TextUtils.isEmpty(this.appKey)) {
                str = AdConfig.EMPTY_APP_KEY;
            } else {
                str = this.appKey;
            }
            adConfig.appKey = str;
            adConfig.channel = this.channel;
            adConfig.extra = this.extra;
            adConfig.debug = this.debug;
            adConfig.age = this.age;
            adConfig.gender = this.gender;
            adConfig.activatedTime = this.activatedTime;
            return adConfig;
        }

        public Builder setActivatedTime(long j) {
            this.activatedTime = j;
            return this;
        }

        public Builder setAge(int i) {
            this.age = i;
            return this;
        }

        public Builder setAppId(String str) {
            this.appKey = str;
            return this;
        }

        public Builder setChannel(String str) {
            this.channel = str;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.debug = z;
            return this;
        }

        public Builder setGender(int i) {
            this.gender = i;
            return this;
        }
    }

    private AdConfig() {
    }

    public long getActivatedTime() {
        return this.activatedTime;
    }

    public int getAge() {
        return this.age;
    }

    @NonNull
    public String getAppKey() {
        return this.appKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getExtra(String str) {
        if (!C43836q.m4837a((CharSequence) str)) {
            return this.extra.get(str);
        }
        return "";
    }

    public int getGender() {
        return this.gender;
    }

    public boolean isDebug() {
        return this.debug;
    }
}
