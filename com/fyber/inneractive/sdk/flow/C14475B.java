package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C14238y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14348a;
import com.fyber.inneractive.sdk.config.global.C14349b;
import com.fyber.inneractive.sdk.config.global.C14381k;
import com.fyber.inneractive.sdk.config.global.C14382l;
import com.fyber.inneractive.sdk.config.global.C14387q;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.AbstractC14361h;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C14713k0;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.B */
/* loaded from: classes4.dex */
public final class C14475B {

    /* renamed from: a */
    public final /* synthetic */ C14238y f27394a;

    /* renamed from: b */
    public final /* synthetic */ C14388r f27395b;

    /* renamed from: c */
    public final /* synthetic */ String f27396c;

    /* renamed from: d */
    public final /* synthetic */ C14479F f27397d;

    public C14475B(C14479F c14479f, C14238y c14238y, C14388r c14388r, String str) {
        this.f27397d = c14479f;
        this.f27394a = c14238y;
        this.f27395b = c14388r;
        this.f27396c = str;
    }

    /* renamed from: a */
    public final void m77876a() {
        C14387q c14387q;
        C14349b c14349b;
        C14381k c14381k;
        C14382l c14382l;
        C14387q c14387q2;
        C14479F c14479f = this.f27397d;
        c14479f.getClass();
        IAlog.m76529a("%s : InneractiveAdSpotImpl markup data available", IAlog.m76531a(c14479f));
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f27394a.f26909a;
        if (admParametersOuterClass$AdmParameters != null) {
            C14388r c14388r = this.f27395b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            c14388r.getClass();
            C14348a c14348a = IAConfigManager.f27060O.f27102z;
            c14348a.getClass();
            for (AbstractC14361h abstractC14361h : c14388r.f27218b.values()) {
                if (abstractC14361h != null && (c14382l = c14348a.f27183a) != null && (c14387q2 = (C14387q) c14382l.f27212a.get(abstractC14361h.f27198b)) != null) {
                    abstractC14361h.f27214a = c14387q2.f27214a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            C14348a c14348a2 = IAConfigManager.f27060O.f27102z;
            c14348a2.f27184b = c14388r;
            for (AbstractC14361h abstractC14361h2 : c14388r.f27218b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    C14382l c14382l2 = c14348a2.f27183a;
                    if (c14382l2 != null && (c14387q = (C14387q) c14382l2.f27212a.get(abstractC14361h2.f27198b)) != null && (c14349b = (C14349b) c14387q.f27216c.get(identifier)) != null) {
                        Iterator it = c14349b.f27187c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c14381k = null;
                                break;
                            }
                            c14381k = (C14381k) it.next();
                            if (c14381k.f27210b.equals(variant)) {
                                break;
                            }
                        }
                        abstractC14361h2.f27199c.put(c14349b.f27185a, c14349b);
                        if (c14381k != null) {
                            abstractC14361h2.f27200d.put(c14349b.f27185a, c14381k);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m77875a(Exception exc, InneractiveErrorCode inneractiveErrorCode, AbstractC15386e... abstractC15386eArr) {
        EnumC14730t enumC14730t;
        C14479F c14479f = this.f27397d;
        c14479f.getClass();
        IAlog.m76529a("%s : InneractiveAdSpotImpl data error", IAlog.m76531a(c14479f));
        AbstractC15386e abstractC15386e = abstractC15386eArr.length > 0 ? abstractC15386eArr[0] : null;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, EnumC14527i.ADM_FETCH_FAILED);
        C14477D c14477d = this.f27397d.f27403d;
        if (c14477d != null) {
            c14477d.m77874a(null, abstractC15386e, inneractiveInfrastructureError);
        }
        C14534p c14534p = this.f27397d.f27411l;
        if (c14534p != null) {
            IAlog.m76525e("%sgot handleFailedLoading! with: %s", c14534p.mo77825d(), inneractiveInfrastructureError);
            InterfaceC14532n interfaceC14532n = c14534p.f27532b;
            if (interfaceC14532n != null) {
                ((C14477D) interfaceC14532n).m77874a(null, abstractC15386e, inneractiveInfrastructureError);
            }
            c14534p.mo77824a(null, abstractC15386e);
        }
        C14479F c14479f2 = this.f27397d;
        String str = this.f27396c;
        C14388r c14388r = this.f27395b;
        c14479f2.getClass();
        if (!inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR) && !inneractiveErrorCode.equals(InneractiveErrorCode.NO_FILL)) {
            enumC14730t = EnumC14730t.FATAL_ADM_PARSING_ERROR;
        } else {
            enumC14730t = EnumC14730t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        }
        if (abstractC15386e != null) {
            abstractC15386e.f30448D = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof C14713k0) {
            C14713k0 c14713k0 = (C14713k0) exc;
            name = "NetworkStackException";
        }
        JSONArray m77925b = c14388r.m77925b();
        C14740w c14740w = new C14740w(abstractC15386e);
        c14740w.f27930b = enumC14730t;
        c14740w.f27929a = null;
        c14740w.f27932d = m77925b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception", name);
        } catch (Exception unused) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "exception", name);
        }
        String localizedMessage = exc.getLocalizedMessage();
        String str2 = exc;
        if (localizedMessage != null) {
            str2 = exc.getLocalizedMessage();
        }
        try {
            jSONObject.put("message", str2);
        } catch (Exception unused2) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "message", str2);
        }
        try {
            jSONObject.put("admPayload", str);
        } catch (Exception unused3) {
            IAlog.m76524f("Got exception adding param to json object: %s, %s", "admPayload", str);
        }
        c14740w.f27934f.put(jSONObject);
        c14740w.m77658a((String) null);
    }
}
