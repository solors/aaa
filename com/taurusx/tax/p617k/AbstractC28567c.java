package com.taurusx.tax.p617k;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.Creative;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.taurusx.tax.k.c */
/* loaded from: classes7.dex */
public abstract class AbstractC28567c {

    /* renamed from: a */
    public final Node f74057a;

    public AbstractC28567c(Node node) {
        C28530n.m37997a(node);
        this.f74057a = node;
    }

    /* renamed from: a */
    public List<C28568d> m37918a() {
        List<Node> m38012d;
        ArrayList arrayList = new ArrayList();
        Node m38014c = C28518e.m38014c(this.f74057a, "Creatives");
        if (m38014c == null) {
            return arrayList;
        }
        List<Node> m38012d2 = C28518e.m38012d(m38014c, Creative.NAME);
        if (m38012d2 == null) {
            return arrayList;
        }
        for (Node node : m38012d2) {
            Node m38014c2 = C28518e.m38014c(node, "CompanionAds");
            if (m38014c2 != null && (m38012d = C28518e.m38012d(m38014c2, "Companion")) != null) {
                for (Node node2 : m38012d) {
                    arrayList.add(new C28568d(node2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<VastTracker> m37917b() {
        ArrayList arrayList = new ArrayList();
        List<Node> m38012d = C28518e.m38012d(this.f74057a, "Error");
        if (m38012d == null) {
            return arrayList;
        }
        for (Node node : m38012d) {
            String m38030a = C28518e.m38030a(node);
            if (!TextUtils.isEmpty(m38030a)) {
                arrayList.add(new VastTracker.Builder(m38030a).isRepeatable(true).build());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<VastTracker> m37916c() {
        List<Node> m38012d = C28518e.m38012d(this.f74057a, "Impression");
        ArrayList arrayList = new ArrayList();
        for (Node node : m38012d) {
            String m38030a = C28518e.m38030a(node);
            if (!TextUtils.isEmpty(m38030a)) {
                arrayList.add(new VastTracker.Builder(m38030a).build());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C28570f> m37915d() {
        ArrayList arrayList = new ArrayList();
        Node m38014c = C28518e.m38014c(this.f74057a, "Creatives");
        if (m38014c == null) {
            return arrayList;
        }
        List<Node> m38012d = C28518e.m38012d(m38014c, Creative.NAME);
        if (m38012d == null) {
            return arrayList;
        }
        for (Node node : m38012d) {
            Node m38014c2 = C28518e.m38014c(node, "Linear");
            if (m38014c2 != null) {
                arrayList.add(new C28570f(m38014c2));
            }
        }
        return arrayList;
    }
}
