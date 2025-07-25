package com.p551my.tracker.recsys;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.device.iap.internal.p106c.C3718b;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p551my.tracker.MyTracker;
import com.p551my.tracker.obfuscated.AbstractC26465z;
import com.p551my.tracker.obfuscated.C26325g;
import com.p551my.tracker.obfuscated.C26468z0;
import com.p551my.tracker.recsys.OfferRequest;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.tracker.recsys.OfferRequest */
/* loaded from: classes7.dex */
public final class OfferRequest {

    /* renamed from: a */
    final OnCompleteListener f69139a;

    /* renamed from: b */
    final Handler f69140b;
    public final String data;
    public final List<String> placementIds;
    public final Boolean reset;
    public final String userId;

    /* renamed from: d */
    private final AtomicBoolean f69142d = new AtomicBoolean(false);

    /* renamed from: c */
    final String f69141c = "https://recsys.tracker.my.com/api/public/v3/rec/item";

    /* renamed from: com.my.tracker.recsys.OfferRequest$OnCompleteListener */
    /* loaded from: classes7.dex */
    public interface OnCompleteListener {
        void onComplete(OfferRequest offerRequest, List<Offer> list, String str);
    }

    /* renamed from: com.my.tracker.recsys.OfferRequest$a */
    /* loaded from: classes7.dex */
    public class C26479a implements AbstractC26465z.InterfaceC26466a {
        C26479a() {
            OfferRequest.this = r1;
        }

        @Override // com.p551my.tracker.obfuscated.AbstractC26465z.InterfaceC26466a
        /* renamed from: a */
        public String mo41493a() {
            return "application/json";
        }

        @Override // com.p551my.tracker.obfuscated.AbstractC26465z.InterfaceC26466a
        /* renamed from: a */
        public void mo41492a(OutputStream outputStream) {
            if (TextUtils.isEmpty(OfferRequest.this.data)) {
                return;
            }
            outputStream.write(OfferRequest.this.data.getBytes("UTF-8"));
        }
    }

    public OfferRequest(String str, List<String> list, String str2, Boolean bool, OnCompleteListener onCompleteListener, Handler handler) {
        this.userId = str;
        this.placementIds = list;
        this.data = str2;
        this.reset = bool;
        this.f69139a = onCompleteListener;
        this.f69140b = handler;
    }

    /* renamed from: b */
    public static /* synthetic */ void m41495b(OnCompleteListener onCompleteListener, OfferRequest offerRequest, List list, String str) {
        onCompleteListener.onComplete(offerRequest, list, str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m41494c(OfferRequest offerRequest) {
        offerRequest.m41500a();
    }

    /* renamed from: a */
    String m41496a(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("custom_user_id", this.userId);
        buildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, str2);
        Boolean bool = this.reset;
        if (bool != null) {
            buildUpon.appendQueryParameter(C3718b.f3282au, String.valueOf(bool));
        }
        if (!this.placementIds.isEmpty()) {
            int size = this.placementIds.size();
            for (int i = 0; i < size; i++) {
                buildUpon.appendQueryParameter("placement_id", this.placementIds.get(i));
            }
        }
        return buildUpon.toString();
    }

    public void send() {
        if (this.f69139a == null) {
            C26468z0.m41528a("OfferRequest: listener is null, offers from response can not be returned");
        } else if (!this.f69142d.compareAndSet(false, true)) {
            C26468z0.m41528a("OfferRequest: send has already been called");
        } else {
            C26325g.m42072b(new Runnable() { // from class: com.my.tracker.recsys.b
                @Override // java.lang.Runnable
                public final void run() {
                    OfferRequest.m41494c(OfferRequest.this);
                }
            });
        }
    }

    /* renamed from: a */
    static List<Offer> m41497a(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("placement_id");
                int optInt = jSONObject.optInt("test_id");
                int optInt2 = jSONObject.optInt("split_id");
                JSONObject jSONObject2 = jSONObject.getJSONObject("offer");
                arrayList.add(new Offer(optString, jSONObject2.optString(FirebaseAnalytics.Param.ITEM_ID), jSONObject2.optDouble("price"), jSONObject2.optDouble("discount_price"), jSONObject2.optInt("value"), jSONObject2.optInt("discount_value"), optInt, optInt2));
            }
            return arrayList;
        } catch (Throwable unused) {
            C26468z0.m41528a("OfferRequest: error occurred while parsing values from json response");
            return null;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m41500a() {
        String id2 = MyTracker.getTrackerConfig().getId();
        if (TextUtils.isEmpty(id2)) {
            C26468z0.m41525b("OfferRequest: MyTracker hasn't been initialized yet, MyTracker.initTracker() should be called first");
            m41498a(this, this.f69140b, this.f69139a, (AbstractC26465z.C26467b<String>) null);
            return;
        }
        m41498a(this, this.f69140b, this.f69139a, AbstractC26465z.m41534a(new C26479a(), null, false).mo41533a(m41496a(this.f69141c, id2)));
    }

    /* renamed from: a */
    static void m41498a(final OfferRequest offerRequest, Handler handler, final OnCompleteListener onCompleteListener, AbstractC26465z.C26467b<String> c26467b) {
        final String str;
        final List<Offer> list = null;
        if (c26467b == null) {
            str = "MyTracker hasn't been initialized yet";
        } else if (c26467b.m41531b()) {
            String m41532a = c26467b.m41532a();
            if (TextUtils.isEmpty(m41532a)) {
                C26468z0.m41528a("OfferRequest: http response is empty ");
                str = "Empty response";
            } else {
                List<Offer> m41497a = m41497a(m41532a);
                if (m41497a == null) {
                    C26468z0.m41528a("OfferRequest: error while parsing offers from response");
                    str = "Offers parsing error";
                } else {
                    list = m41497a;
                    str = null;
                }
            }
        } else {
            C26468z0.m41528a("OfferRequest: http response is unsuccessful");
            str = "Unsuccessful response";
        }
        handler.post(new Runnable() { // from class: com.my.tracker.recsys.a
            @Override // java.lang.Runnable
            public final void run() {
                OfferRequest.m41495b(OfferRequest.OnCompleteListener.this, offerRequest, list, str);
            }
        });
    }
}
