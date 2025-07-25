package com.smaato.sdk.core.violationreporter;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.ironsource.C20517nb;
import com.ironsource.C21320zk;
import com.smaato.sdk.core.violationreporter.AutoValue_Report;
import java.util.Collection;
import java.util.List;
import net.pubnative.lite.sdk.models.APIMeta;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class Report {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Report build();

        public abstract Builder setAdMarkup(String str);

        public abstract Builder setAdSpace(String str);

        public abstract Builder setApiKey(String str);

        public abstract Builder setApiVersion(String str);

        public abstract Builder setAsnId(String str);

        public abstract Builder setBundleId(String str);

        public abstract Builder setClickUrl(String str);

        public abstract Builder setCreativeId(String str);

        public abstract Builder setError(String str);

        public abstract Builder setOriginalUrl(String str);

        public abstract Builder setPlatform(String str);

        public abstract Builder setPublisher(String str);

        public abstract Builder setRedirectUrl(String str);

        public abstract Builder setSci(String str);

        public abstract Builder setSdkVersion(String str);

        public abstract Builder setSessionId(String str);

        public abstract Builder setTimestamp(String str);

        public abstract Builder setTraceUrls(List<String> list);

        public abstract Builder setType(String str);

        public abstract Builder setViolatedUrl(String str);
    }

    @NonNull
    /* renamed from: a */
    public static Builder m39322a() {
        return new AutoValue_Report.C27326b();
    }

    @NonNull
    /* renamed from: b */
    public abstract String mo39317b();

    @NonNull
    /* renamed from: c */
    public abstract String mo39316c();

    @NonNull
    /* renamed from: d */
    public abstract String mo39315d();

    @NonNull
    /* renamed from: e */
    public abstract String mo39314e();

    @NonNull
    /* renamed from: f */
    public abstract String mo39313f();

    @NonNull
    /* renamed from: g */
    public abstract String mo39312g();

    @NonNull
    /* renamed from: h */
    public abstract String mo39311h();

    @NonNull
    /* renamed from: i */
    public abstract String mo39310i();

    @NonNull
    /* renamed from: j */
    public abstract String mo39309j();

    @NonNull
    /* renamed from: k */
    public abstract String mo39308k();

    @NonNull
    /* renamed from: l */
    public abstract String mo39307l();

    @NonNull
    /* renamed from: m */
    public abstract String mo39306m();

    @NonNull
    /* renamed from: n */
    public abstract String mo39305n();

    @NonNull
    /* renamed from: o */
    public abstract String mo39304o();

    @NonNull
    /* renamed from: p */
    public abstract String mo39303p();

    @NonNull
    /* renamed from: q */
    public abstract String mo39302q();

    @NonNull
    /* renamed from: r */
    public abstract String mo39301r();

    @NonNull
    /* renamed from: s */
    public abstract List<String> mo39300s();

    @NonNull
    /* renamed from: t */
    public abstract String mo39299t();

    @NonNull
    /* renamed from: u */
    public abstract String mo39298u();

    @NonNull
    /* renamed from: v */
    public JSONObject m39321v() throws JSONException {
        return new JSONObject().put("sci", mo39304o()).put("timestamp", mo39301r()).put("error", mo39309j()).put(C20517nb.f52176b, mo39303p()).put("bundleid", mo39312g()).put("type", mo39299t()).put("violatedurl", mo39298u()).put(C21320zk.f54769b, mo39306m()).put("platform", mo39307l()).put("adspace", mo39316c()).put("sessionid", mo39302q()).put("apikey", mo39315d()).put("apiversion", mo39314e()).put("originalurl", mo39308k()).put(APIMeta.CREATIVE_ID, mo39310i()).put("asnid", mo39313f()).put("redirecturl", mo39305n()).put("clickurl", mo39311h()).put("admarkup", mo39317b()).put("traceurls", new JSONArray((Collection) mo39300s()));
    }
}
