package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.cache.C14265b;
import com.fyber.inneractive.sdk.p377ui.C15401b;
import com.fyber.inneractive.sdk.util.AbstractC15430V;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.C15429U;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.W */
/* loaded from: classes4.dex */
public final class C14688W extends C14687V {
    public C14688W(C15401b c15401b, Context context, C14265b c14265b) {
        super(c15401b, context, c14265b);
    }

    @Override // com.fyber.inneractive.sdk.network.C14687V, com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: a */
    public final C14681O mo77696a(C14714l c14714l, Map map, int i) {
        List list;
        C14681O c14681o = new C14681O();
        try {
            InputStream inputStream = c14714l.f27884c;
            Bitmap bitmap = null;
            if (map != null) {
                list = (List) map.get("Content-Length");
            } else {
                list = null;
            }
            int i2 = -1;
            if (list != null) {
                i2 = AbstractC15471s.m76461a((String) list.get(0), -1);
            }
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap decodeStream = BitmapFactory.decodeStream(new C15429U(inputStream, atomicInteger));
            if (atomicInteger.get() == i2) {
                bitmap = decodeStream;
            }
            if (bitmap != null) {
                String m76515a = AbstractC15430V.m76515a(bitmap);
                c14681o.f27810a = bitmap;
                c14681o.f27811b = m76515a;
            }
            return c14681o;
        } catch (Exception e) {
            IAlog.m76530a("failed parse cacheable network request", e, new Object[0]);
            throw new C14680N(e);
        }
    }
}
