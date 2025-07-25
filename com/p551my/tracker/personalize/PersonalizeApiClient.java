package com.p551my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.p551my.tracker.MyTracker;
import com.p551my.tracker.MyTrackerConfig;
import com.p551my.tracker.obfuscated.AbstractC26465z;
import com.p551my.tracker.obfuscated.C26325g;
import com.p551my.tracker.obfuscated.C26468z0;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.personalize.PersonalizeApiClient */
/* loaded from: classes7.dex */
public final class PersonalizeApiClient {

    /* renamed from: a */
    private final C26472a f69110a;

    /* renamed from: com.my.tracker.personalize.PersonalizeApiClient$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: a */
        private List<String> f69111a;

        /* renamed from: b */
        private Context f69112b;

        public PersonalizeApiClient build() {
            String id2 = MyTracker.getTrackerConfig().getId();
            String str = null;
            if (TextUtils.isEmpty(id2)) {
                C26468z0.m41528a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.f69112b;
            if (context != null) {
                str = MyTracker.getInstanceId(context);
            }
            return new PersonalizeApiClient(new C26472a(id2, str, this.f69111a));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.f69111a = list;
            this.f69112b = context;
            return this;
        }
    }

    /* renamed from: com.my.tracker.personalize.PersonalizeApiClient$OnCompleteListener */
    /* loaded from: classes7.dex */
    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    PersonalizeApiClient(C26472a c26472a) {
        this.f69110a = c26472a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(final PersonalizeRequest<T> personalizeRequest, final Handler handler, final OnCompleteListener<T> onCompleteListener) {
        final String m41517a = m41517a(personalizeRequest, this.f69110a);
        C26325g.m42072b(new Runnable() { // from class: com.my.tracker.personalize.e
            {
                PersonalizeApiClient.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PersonalizeApiClient.this.m41515a(m41517a, personalizeRequest, handler, onCompleteListener);
            }
        });
    }

    /* renamed from: a */
    private String m41517a(PersonalizeRequest<?> personalizeRequest, C26472a c26472a) {
        String str = c26472a.f69121b + "/api/v1/recommendation" + personalizeRequest.mo41509a();
        Map<String, List<String>> mo41511b = personalizeRequest.mo41511b();
        mo41511b.remove(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY);
        if (mo41511b.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, List<String>> entry : mo41511b.entrySet()) {
            String key = entry.getKey();
            for (String str2 : entry.getValue()) {
                buildUpon.appendQueryParameter(key, str2);
            }
        }
        buildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, c26472a.f69120a);
        return buildUpon.toString();
    }

    /* renamed from: a */
    public /* synthetic */ void m41521a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* renamed from: a */
    public /* synthetic */ void m41520a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    /* renamed from: a */
    private <T> void m41518a(PersonalizeRequest<T> personalizeRequest, AbstractC26465z.C26467b<String> c26467b, Handler handler, OnCompleteListener<T> onCompleteListener) {
        T t;
        String str;
        String str2;
        if (c26467b == null) {
            C26468z0.m41528a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            t = null;
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String m41532a = c26467b.m41532a();
            if (!TextUtils.isEmpty(m41532a)) {
                try {
                    C26474c<T> mo41506a = personalizeRequest.mo41510c().mo41506a(new JSONObject(m41532a));
                    String m41508a = mo41506a.m41508a();
                    if (m41508a != null) {
                        m41516a(personalizeRequest, null, null, handler, m41508a, onCompleteListener);
                    } else {
                        m41516a(personalizeRequest, mo41506a.m41507b(), m41532a, handler, null, onCompleteListener);
                    }
                    return;
                } catch (Throwable th) {
                    String str3 = "Can't parse JSON with error: " + th.getMessage();
                    C26468z0.m41528a("PersonalizeApiClient: " + str3);
                    m41516a(personalizeRequest, null, null, handler, str3, onCompleteListener);
                    return;
                }
            }
            C26468z0.m41528a("PersonalizeApiClient: HTTP response is empty");
            t = null;
            str = null;
            str2 = "HTTP response is empty";
        }
        m41516a(personalizeRequest, t, str, handler, str2, onCompleteListener);
    }

    /* renamed from: a */
    private <T> void m41516a(final PersonalizeRequest<T> personalizeRequest, T t, String str, Handler handler, final String str2, final OnCompleteListener<T> onCompleteListener) {
        Runnable runnable;
        if (handler == null) {
            handler = C26325g.f68588a;
        }
        if (TextUtils.isEmpty(str2)) {
            final PersonalizeResponse personalizeResponse = new PersonalizeResponse(t, null, str);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.g
                {
                    PersonalizeApiClient.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PersonalizeApiClient.this.m41521a(onCompleteListener, personalizeRequest, personalizeResponse);
                }
            };
        } else {
            C26468z0.m41525b("PersonalizeApiClient: " + str2);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.f
                {
                    PersonalizeApiClient.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PersonalizeApiClient.this.m41520a(onCompleteListener, personalizeRequest, str2);
                }
            };
        }
        handler.post(runnable);
    }

    /* renamed from: a */
    public /* synthetic */ void m41515a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        m41518a(personalizeRequest, AbstractC26465z.m41535a((MyTrackerConfig.OkHttpClientProvider) null).mo41533a(str), handler, onCompleteListener);
    }
}
