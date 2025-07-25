package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.C14542b;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.h */
/* loaded from: classes4.dex */
public final class C14615h {

    /* renamed from: a */
    public Integer f27726a;

    /* renamed from: b */
    public Integer f27727b;

    /* renamed from: c */
    public String f27728c;

    /* renamed from: d */
    public C14619l f27729d;

    /* renamed from: e */
    public String f27730e;

    /* renamed from: f */
    public String f27731f;

    /* renamed from: g */
    public String f27732g;

    /* renamed from: i */
    public C14542b f27734i;

    /* renamed from: h */
    public final ArrayList f27733h = new ArrayList();

    /* renamed from: j */
    public final ArrayList f27735j = new ArrayList();

    /* renamed from: a */
    public final boolean m77752a() {
        if (TextUtils.isEmpty(this.f27731f) && TextUtils.isEmpty(this.f27730e) && this.f27729d == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f27726a);
        sb2.append(" h:");
        sb2.append(this.f27727b);
        sb2.append(" ctr:");
        sb2.append(this.f27732g);
        sb2.append(" clt:");
        sb2.append(this.f27733h);
        if (!TextUtils.isEmpty(this.f27731f)) {
            sb2.append(" html:");
            sb2.append(this.f27731f);
        }
        if (this.f27729d != null) {
            sb2.append(" static:");
            sb2.append(this.f27729d.f27738b);
            sb2.append("creative:");
            sb2.append(this.f27729d.f27737a);
        }
        if (!TextUtils.isEmpty(this.f27730e)) {
            sb2.append(" iframe:");
            sb2.append(this.f27730e);
        }
        sb2.append(" events:");
        sb2.append(this.f27735j);
        if (this.f27734i != null) {
            sb2.append(" reason:");
            sb2.append(this.f27734i.f27552a);
        }
        return sb2.toString();
    }
}
