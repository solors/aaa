package com.p551my.tracker.recsys;

import android.os.Handler;
import com.p551my.tracker.obfuscated.C26325g;
import com.p551my.tracker.recsys.OfferRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.tracker.recsys.OfferRequestBuilder */
/* loaded from: classes7.dex */
public final class OfferRequestBuilder {

    /* renamed from: a */
    private final String f69144a;

    /* renamed from: e */
    private OfferRequest.OnCompleteListener f69148e;

    /* renamed from: b */
    private final List<String> f69145b = new ArrayList();

    /* renamed from: c */
    private String f69146c = null;

    /* renamed from: d */
    private Boolean f69147d = null;

    /* renamed from: f */
    private Handler f69149f = C26325g.f68588a;

    private OfferRequestBuilder(String str) {
        this.f69144a = str;
    }

    public static OfferRequestBuilder newBuilder(String str) {
        return new OfferRequestBuilder(str);
    }

    public OfferRequest build() {
        return new OfferRequest(this.f69144a, this.f69145b, this.f69146c, this.f69147d, this.f69148e, this.f69149f);
    }

    public OfferRequestBuilder withData(String str) {
        this.f69146c = str;
        return this;
    }

    public OfferRequestBuilder withHandler(Handler handler) {
        this.f69149f = handler;
        return this;
    }

    public OfferRequestBuilder withPlacementIds(String... strArr) {
        if (!this.f69145b.isEmpty()) {
            this.f69145b.clear();
        }
        if (strArr == null) {
            return this;
        }
        for (String str : strArr) {
            if (str != null && !this.f69145b.contains(str)) {
                this.f69145b.add(str);
            }
        }
        return this;
    }

    public OfferRequestBuilder withRequestListener(OfferRequest.OnCompleteListener onCompleteListener) {
        this.f69148e = onCompleteListener;
        return this;
    }

    public OfferRequestBuilder withReset(boolean z) {
        this.f69147d = Boolean.valueOf(z);
        return this;
    }
}
