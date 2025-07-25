package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.measurement.C14590i;
import com.fyber.inneractive.sdk.util.AbstractC15480w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.g */
/* loaded from: classes4.dex */
public abstract class AbstractC14614g {

    /* renamed from: a */
    public String f27719a;

    /* renamed from: e */
    public C14622o f27723e;

    /* renamed from: d */
    public final ArrayList f27722d = new ArrayList();

    /* renamed from: f */
    public int f27724f = 0;

    /* renamed from: g */
    public final ArrayList f27725g = new ArrayList(1);

    /* renamed from: b */
    public final ArrayList f27720b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f27721c = new ArrayList();

    /* renamed from: a */
    public final void m77754a(Node node) {
        C14629v c14629v;
        Node m76445d = AbstractC15480w0.m76445d(node, "AdVerifications");
        if (m76445d != null) {
            Iterator it = AbstractC15480w0.m76446c(m76445d, Verification.NAME).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                C14590i c14590i = null;
                if (node2 != null) {
                    C14590i c14590i2 = new C14590i();
                    c14590i2.f27641e = AbstractC15480w0.m76447b(node2, Verification.VENDOR);
                    Node m76445d2 = AbstractC15480w0.m76445d(node2, "JavaScriptResource");
                    if (m76445d2 != null) {
                        c14590i2.f27643g = true;
                        try {
                            c14590i2.f27642f = AbstractC15480w0.m76449a(m76445d2);
                            c14590i2.f27638b = AbstractC15480w0.m76447b(m76445d2, "apiFramework");
                            c14590i2.f27637a = new URL(c14590i2.f27642f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node m76445d3 = AbstractC15480w0.m76445d(node2, "TrackingEvents");
                    if (m76445d3 != null) {
                        Iterator it2 = AbstractC15480w0.m76446c(m76445d3, Tracking.NAME).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            if (node3 == null) {
                                c14629v = null;
                            } else {
                                c14629v = new C14629v();
                                c14629v.f27760a = AbstractC15480w0.m76447b(node3, "event");
                                c14629v.f27761b = AbstractC15480w0.m76449a(node3);
                                c14629v.f27762c = AbstractC15480w0.m76447b(node3, "offset");
                            }
                            if (node3 != null && c14629v.f27760a.equalsIgnoreCase("verificationNotExecuted")) {
                                c14590i2.m77781a(EnumC14630w.EVENT_VERIFICATION_NOT_EXECUTED, c14629v.f27761b);
                            }
                        }
                    }
                    Node m76445d4 = AbstractC15480w0.m76445d(node2, Verification.VERIFICATION_PARAMETERS);
                    if (m76445d4 != null) {
                        c14590i2.f27640d = AbstractC15480w0.m76449a(m76445d4);
                    }
                    c14590i = c14590i2;
                }
                if (c14590i != null) {
                    IAlog.m76529a("Verification Found - %s", c14590i.toString());
                    this.f27722d.add(c14590i);
                }
            }
        }
    }

    /* renamed from: b */
    public void m77753b(Node node) {
        Iterator it;
        C14620m c14620m;
        C14615h c14615h;
        Iterator it2;
        C14629v c14629v;
        C14629v c14629v2;
        Iterator it3;
        Iterator it4;
        C14625r c14625r;
        AbstractC14614g abstractC14614g = this;
        Node m76445d = AbstractC15480w0.m76445d(node, "AdSystem");
        if (m76445d != null) {
            AbstractC15480w0.m76447b(m76445d, "version");
            AbstractC15480w0.m76449a(m76445d);
        }
        Node m76445d2 = AbstractC15480w0.m76445d(node, "Error");
        if (m76445d2 != null) {
            String m76449a = AbstractC15480w0.m76449a(m76445d2);
            if (!TextUtils.isEmpty(m76449a)) {
                abstractC14614g.f27719a = m76449a;
            }
        }
        Iterator it5 = AbstractC15480w0.m76446c(node, "Impression").iterator();
        while (it5.hasNext()) {
            String m76449a2 = AbstractC15480w0.m76449a((Node) it5.next());
            if (!TextUtils.isEmpty(m76449a2)) {
                abstractC14614g.f27720b.add(m76449a2);
            }
        }
        Node m76445d3 = AbstractC15480w0.m76445d(node, "Creatives");
        if (m76445d3 != null) {
            Iterator it6 = AbstractC15480w0.m76446c(m76445d3, Creative.NAME).iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    c14620m = null;
                } else {
                    C14620m c14620m2 = new C14620m();
                    if (TextUtils.isEmpty(AbstractC15480w0.m76447b(node2, "AdID"))) {
                        AbstractC15480w0.m76447b(node2, "adId");
                    }
                    AbstractC15480w0.m76447b(node2, "id");
                    AbstractC15480w0.m76448a(node2, "sequence");
                    Node m76445d4 = AbstractC15480w0.m76445d(node2, "Linear");
                    if (m76445d4 != null) {
                        C14624q c14624q = new C14624q();
                        it = it6;
                        Node m76445d5 = AbstractC15480w0.m76445d(m76445d4, Linear.MEDIA_FILES);
                        if (m76445d5 != null) {
                            ArrayList m76446c = AbstractC15480w0.m76446c(m76445d5, MediaFile.NAME);
                            if (!m76446c.isEmpty()) {
                                c14624q.f27746a = new ArrayList();
                                Iterator it7 = m76446c.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        c14625r = null;
                                    } else {
                                        it4 = it7;
                                        c14625r = new C14625r();
                                        c14625r.f27751a = AbstractC15480w0.m76447b(node3, "delivery");
                                        c14625r.f27752b = AbstractC15480w0.m76448a(node3, "width");
                                        c14625r.f27753c = AbstractC15480w0.m76448a(node3, "height");
                                        c14625r.f27754d = AbstractC15480w0.m76447b(node3, "type");
                                        AbstractC15480w0.m76447b(node3, "id");
                                        c14625r.f27756f = AbstractC15480w0.m76447b(node3, "apiFramework");
                                        c14625r.f27755e = AbstractC15480w0.m76448a(node3, MediaFile.BITRATE);
                                        String m76447b = AbstractC15480w0.m76447b(node3, MediaFile.MAINTAIN_ASPECT_RATIO);
                                        if (!TextUtils.isEmpty(m76447b)) {
                                            try {
                                                Boolean.valueOf(m76447b);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String m76447b2 = AbstractC15480w0.m76447b(node3, MediaFile.SCALABLE);
                                        if (!TextUtils.isEmpty(m76447b2)) {
                                            try {
                                                Boolean.valueOf(m76447b2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        c14625r.f27757g = AbstractC15480w0.m76449a(node3);
                                    }
                                    if (c14625r != null) {
                                        c14624q.f27746a.add(c14625r);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node m76445d6 = AbstractC15480w0.m76445d(m76445d4, "VideoClicks");
                        if (m76445d6 != null) {
                            c14624q.f27748c = AbstractC15480w0.m76449a(AbstractC15480w0.m76445d(m76445d6, VideoClicks.CLICK_THROUGH));
                            ArrayList m76446c2 = AbstractC15480w0.m76446c(m76445d6, VideoClicks.CLICK_TRACKING);
                            if (!m76446c2.isEmpty()) {
                                c14624q.f27749d = new ArrayList();
                                Iterator it8 = m76446c2.iterator();
                                while (it8.hasNext()) {
                                    String m76449a3 = AbstractC15480w0.m76449a((Node) it8.next());
                                    if (!TextUtils.isEmpty(m76449a3)) {
                                        c14624q.f27749d.add(m76449a3);
                                    }
                                }
                            }
                        }
                        Node m76445d7 = AbstractC15480w0.m76445d(m76445d4, "TrackingEvents");
                        if (m76445d7 != null) {
                            ArrayList m76446c3 = AbstractC15480w0.m76446c(m76445d7, Tracking.NAME);
                            if (!m76446c3.isEmpty()) {
                                c14624q.f27747b = new ArrayList();
                                Iterator it9 = m76446c3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        c14629v2 = null;
                                    } else {
                                        c14629v2 = new C14629v();
                                        it3 = it9;
                                        c14629v2.f27760a = AbstractC15480w0.m76447b(node4, "event");
                                        c14629v2.f27761b = AbstractC15480w0.m76449a(node4);
                                        c14629v2.f27762c = AbstractC15480w0.m76447b(node4, "offset");
                                    }
                                    if (c14629v2 != null) {
                                        c14624q.f27747b.add(c14629v2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node m76445d8 = AbstractC15480w0.m76445d(m76445d4, Linear.DURATION);
                        if (m76445d8 != null) {
                            c14624q.f27750e = AbstractC15480w0.m76449a(m76445d8);
                        }
                        c14620m2.f27739a = c14624q;
                    } else {
                        it = it6;
                    }
                    Node m76445d9 = AbstractC15480w0.m76445d(node2, "CompanionAds");
                    if (m76445d9 != null) {
                        C14617j c14617j = new C14617j();
                        String m76447b3 = AbstractC15480w0.m76447b(m76445d9, "required");
                        if (!"all".equalsIgnoreCase(m76447b3)) {
                            "none".equalsIgnoreCase(m76447b3);
                        }
                        ArrayList m76446c4 = AbstractC15480w0.m76446c(m76445d9, "Companion");
                        c14617j.f27736a.clear();
                        Iterator it10 = m76446c4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                c14615h = null;
                            } else {
                                c14615h = new C14615h();
                                c14615h.f27726a = AbstractC15480w0.m76448a(node5, "width");
                                c14615h.f27727b = AbstractC15480w0.m76448a(node5, "height");
                                c14615h.f27728c = AbstractC15480w0.m76447b(node5, "id");
                                AbstractC15480w0.m76447b(node5, "apiFramework");
                                AbstractC15480w0.m76448a(node5, Companion.EXPANDED_WIDTH);
                                AbstractC15480w0.m76448a(node5, Companion.EXPANDED_HEIGHT);
                                Node m76445d10 = AbstractC15480w0.m76445d(node5, "StaticResource");
                                if (m76445d10 != null) {
                                    C14619l c14619l = new C14619l();
                                    it2 = it10;
                                    c14619l.f27737a = AbstractC15480w0.m76447b(m76445d10, "creativeType");
                                    c14619l.f27738b = AbstractC15480w0.m76449a(m76445d10);
                                    c14615h.f27729d = c14619l;
                                } else {
                                    it2 = it10;
                                }
                                Node m76445d11 = AbstractC15480w0.m76445d(node5, "HTMLResource");
                                if (m76445d11 != null) {
                                    c14615h.f27731f = AbstractC15480w0.m76449a(m76445d11);
                                }
                                Node m76445d12 = AbstractC15480w0.m76445d(node5, "IFrameResource");
                                if (m76445d12 != null) {
                                    c14615h.f27730e = AbstractC15480w0.m76449a(m76445d12);
                                }
                                Node m76445d13 = AbstractC15480w0.m76445d(node5, Companion.COMPANION_CLICK_THROUGH);
                                if (m76445d13 != null) {
                                    c14615h.f27732g = AbstractC15480w0.m76449a(m76445d13);
                                }
                                c14615h.f27733h.clear();
                                ArrayList m76446c5 = AbstractC15480w0.m76446c(node5, Companion.COMPANION_CLICK_TRACKING);
                                if (m76446c5.size() > 0) {
                                    Iterator it11 = m76446c5.iterator();
                                    while (it11.hasNext()) {
                                        String m76449a4 = AbstractC15480w0.m76449a((Node) it11.next());
                                        if (!TextUtils.isEmpty(m76449a4)) {
                                            c14615h.f27733h.add(m76449a4);
                                        }
                                    }
                                }
                                c14615h.f27735j.clear();
                                Node m76445d14 = AbstractC15480w0.m76445d(node5, "TrackingEvents");
                                if (m76445d14 != null) {
                                    ArrayList m76446c6 = AbstractC15480w0.m76446c(m76445d14, Tracking.NAME);
                                    if (!m76446c6.isEmpty()) {
                                        Iterator it12 = m76446c6.iterator();
                                        while (it12.hasNext()) {
                                            Node node6 = (Node) it12.next();
                                            if (node6 == null) {
                                                c14629v = null;
                                            } else {
                                                c14629v = new C14629v();
                                                c14629v.f27760a = AbstractC15480w0.m76447b(node6, "event");
                                                c14629v.f27761b = AbstractC15480w0.m76449a(node6);
                                                c14629v.f27762c = AbstractC15480w0.m76447b(node6, "offset");
                                            }
                                            if (c14629v != null) {
                                                c14615h.f27735j.add(c14629v);
                                            }
                                        }
                                    }
                                }
                            }
                            if (c14615h != null) {
                                c14617j.f27736a.add(c14615h);
                            }
                            it10 = it2;
                        }
                        c14620m2.f27740b = c14617j;
                    }
                    c14620m = c14620m2;
                }
                abstractC14614g = this;
                if (c14620m != null) {
                    abstractC14614g.f27721c.add(c14620m);
                }
                it6 = it;
            }
        }
        Node m76445d15 = AbstractC15480w0.m76445d(node, "Extensions");
        if (m76445d15 != null) {
            Iterator it13 = AbstractC15480w0.m76446c(m76445d15, Extension.NAME).iterator();
            while (it13.hasNext()) {
                Node node7 = (Node) it13.next();
                if ("AdVerifications".equalsIgnoreCase(AbstractC15480w0.m76447b(node7, "type"))) {
                    abstractC14614g.m77754a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(AbstractC15480w0.m76447b(node7, "type"))) {
                    IAlog.m76529a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node m76445d16 = AbstractC15480w0.m76445d(node7, "FMPCompanionAssets");
                    if (m76445d16 != null) {
                        C14622o c14622o = new C14622o();
                        String m76447b4 = AbstractC15480w0.m76447b(m76445d16, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(m76447b4) || "0".equals(m76447b4)) {
                            c14622o.f27745d = false;
                        }
                        Node m76445d17 = AbstractC15480w0.m76445d(m76445d16, "Name");
                        if (m76445d17 != null) {
                            c14622o.f27742a = AbstractC15480w0.m76449a(m76445d17);
                        }
                        Node m76445d18 = AbstractC15480w0.m76445d(m76445d16, InLine.DESCRIPTION);
                        if (m76445d18 != null) {
                            AbstractC15480w0.m76449a(m76445d18);
                        }
                        c14622o.f27743b.clear();
                        Node m76445d19 = AbstractC15480w0.m76445d(m76445d16, Linear.ICONS);
                        if (m76445d19 != null) {
                            Iterator it14 = AbstractC15480w0.m76446c(m76445d19, "Icon").iterator();
                            while (it14.hasNext()) {
                                c14622o.f27743b.add(AbstractC15480w0.m76449a((Node) it14.next()));
                            }
                        }
                        Node m76445d20 = AbstractC15480w0.m76445d(m76445d16, "Rating");
                        if (m76445d20 != null) {
                            try {
                                Float.parseFloat(AbstractC15480w0.m76449a(m76445d20));
                            } catch (Exception unused3) {
                            }
                        }
                        Node m76445d21 = AbstractC15480w0.m76445d(m76445d16, "Screenshots");
                        if (m76445d21 != null) {
                            c14622o.f27744c = new ArrayList();
                            Iterator it15 = AbstractC15480w0.m76446c(m76445d21, "Screenshot").iterator();
                            while (it15.hasNext()) {
                                String m76449a5 = AbstractC15480w0.m76449a((Node) it15.next());
                                if (!TextUtils.isEmpty(m76449a5)) {
                                    c14622o.f27744c.add(m76449a5);
                                }
                            }
                        }
                        abstractC14614g.f27723e = c14622o;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(AbstractC15480w0.m76447b(node7, "type"))) {
                    Node m76445d22 = AbstractC15480w0.m76445d(node7, "DynamicVideoControlsURL");
                    C14621n c14621n = new C14621n();
                    if (m76445d22 != null) {
                        c14621n.f27741a = AbstractC15480w0.m76449a(m76445d22);
                    }
                    if (!TextUtils.isEmpty(c14621n.f27741a)) {
                        abstractC14614g.f27725g.add(c14621n);
                    }
                }
            }
        }
        m77754a(node);
    }
}
