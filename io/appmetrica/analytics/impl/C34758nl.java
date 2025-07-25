package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nl */
/* loaded from: classes9.dex */
public final class C34758nl {

    /* renamed from: A */
    public final C33952Hl f95037A;

    /* renamed from: B */
    public final Map f95038B;

    /* renamed from: C */
    public final C35061z9 f95039C;

    /* renamed from: a */
    public final String f95040a;

    /* renamed from: b */
    public final List f95041b;

    /* renamed from: c */
    public final String f95042c;

    /* renamed from: d */
    public final String f95043d;

    /* renamed from: e */
    public final String f95044e;

    /* renamed from: f */
    public final List f95045f;

    /* renamed from: g */
    public final List f95046g;

    /* renamed from: h */
    public final List f95047h;

    /* renamed from: i */
    public final Map f95048i;

    /* renamed from: j */
    public final String f95049j;

    /* renamed from: k */
    public final String f95050k;

    /* renamed from: l */
    public final String f95051l;

    /* renamed from: m */
    public final C33760A4 f95052m;

    /* renamed from: n */
    public final long f95053n;

    /* renamed from: o */
    public final boolean f95054o;

    /* renamed from: p */
    public final boolean f95055p;

    /* renamed from: q */
    public final String f95056q;

    /* renamed from: r */
    public final C34048Ll f95057r;

    /* renamed from: s */
    public final C34160Qd f95058s;

    /* renamed from: t */
    public final RetryPolicyConfig f95059t;

    /* renamed from: u */
    public final long f95060u;

    /* renamed from: v */
    public final long f95061v;

    /* renamed from: w */
    public final boolean f95062w;

    /* renamed from: x */
    public final BillingConfig f95063x;

    /* renamed from: y */
    public final C34951v3 f95064y;

    /* renamed from: z */
    public final C34739n2 f95065z;

    public C34758nl(C34731ml c34731ml) {
        List unmodifiableListCopy;
        List unmodifiableListCopy2;
        List unmodifiableListCopy3;
        List unmodifiableListCopy4;
        String str;
        long j;
        long j2;
        C33952Hl c33952Hl;
        C33952Hl c33952Hl2;
        Map map;
        Map map2;
        C35061z9 c35061z9;
        this.f95040a = c34731ml.f94937a;
        List list = c34731ml.f94938b;
        if (list == null) {
            unmodifiableListCopy = null;
        } else {
            unmodifiableListCopy = CollectionUtils.unmodifiableListCopy(list);
        }
        this.f95041b = unmodifiableListCopy;
        this.f95042c = c34731ml.f94939c;
        this.f95043d = c34731ml.f94940d;
        this.f95044e = c34731ml.f94941e;
        List list2 = c34731ml.f94942f;
        if (list2 == null) {
            unmodifiableListCopy2 = null;
        } else {
            unmodifiableListCopy2 = CollectionUtils.unmodifiableListCopy(list2);
        }
        this.f95045f = unmodifiableListCopy2;
        List list3 = c34731ml.f94943g;
        if (list3 == null) {
            unmodifiableListCopy3 = null;
        } else {
            unmodifiableListCopy3 = CollectionUtils.unmodifiableListCopy(list3);
        }
        this.f95046g = unmodifiableListCopy3;
        List list4 = c34731ml.f94944h;
        if (list4 == null) {
            unmodifiableListCopy4 = null;
        } else {
            unmodifiableListCopy4 = CollectionUtils.unmodifiableListCopy(list4);
        }
        this.f95047h = unmodifiableListCopy4;
        Map map3 = c34731ml.f94945i;
        this.f95048i = map3 != null ? CollectionUtils.unmodifiableMapCopy(map3) : null;
        this.f95049j = c34731ml.f94946j;
        this.f95050k = c34731ml.f94947k;
        this.f95052m = c34731ml.f94949m;
        this.f95058s = c34731ml.f94950n;
        this.f95053n = c34731ml.f94951o;
        this.f95054o = c34731ml.f94952p;
        this.f95051l = c34731ml.f94948l;
        this.f95055p = c34731ml.f94953q;
        str = c34731ml.f94954r;
        this.f95056q = str;
        this.f95057r = c34731ml.f94955s;
        j = c34731ml.f94956t;
        this.f95060u = j;
        j2 = c34731ml.f94957u;
        this.f95061v = j2;
        this.f95062w = c34731ml.f94958v;
        RetryPolicyConfig retryPolicyConfig = c34731ml.f94959w;
        if (retryPolicyConfig == null) {
            C33802Bl c33802Bl = new C33802Bl();
            this.f95059t = new RetryPolicyConfig(c33802Bl.f92656w, c33802Bl.f92657x);
        } else {
            this.f95059t = retryPolicyConfig;
        }
        this.f95063x = c34731ml.f94960x;
        this.f95064y = c34731ml.f94961y;
        this.f95065z = c34731ml.f94962z;
        c33952Hl = c34731ml.f94934A;
        if (c33952Hl != null) {
            c33952Hl2 = c34731ml.f94934A;
        } else {
            c33952Hl2 = new C33952Hl(AbstractC33938H7.f92948a.f95700a);
        }
        this.f95037A = c33952Hl2;
        map = c34731ml.f94935B;
        if (map != null) {
            map2 = c34731ml.f94935B;
        } else {
            map2 = Collections.emptyMap();
        }
        this.f95038B = map2;
        c35061z9 = c34731ml.f94936C;
        this.f95039C = c35061z9;
    }

    /* renamed from: a */
    public final C34731ml m21244a(C33760A4 c33760a4) {
        C34731ml c34731ml = new C34731ml(c33760a4);
        c34731ml.f94937a = this.f95040a;
        c34731ml.f94942f = this.f95045f;
        c34731ml.f94943g = this.f95046g;
        c34731ml.f94946j = this.f95049j;
        c34731ml.f94938b = this.f95041b;
        c34731ml.f94939c = this.f95042c;
        c34731ml.f94940d = this.f95043d;
        c34731ml.f94941e = this.f95044e;
        c34731ml.f94944h = this.f95047h;
        c34731ml.f94945i = this.f95048i;
        c34731ml.f94947k = this.f95050k;
        c34731ml.f94948l = this.f95051l;
        c34731ml.f94953q = this.f95055p;
        c34731ml.f94951o = this.f95053n;
        c34731ml.f94952p = this.f95054o;
        c34731ml.f94954r = this.f95056q;
        c34731ml.f94950n = this.f95058s;
        c34731ml.f94956t = this.f95060u;
        c34731ml.f94957u = this.f95061v;
        c34731ml.f94955s = this.f95057r;
        c34731ml.f94958v = this.f95062w;
        c34731ml.f94959w = this.f95059t;
        c34731ml.f94961y = this.f95064y;
        c34731ml.f94960x = this.f95063x;
        c34731ml.f94962z = this.f95065z;
        c34731ml.f94934A = this.f95037A;
        c34731ml.f94935B = this.f95038B;
        c34731ml.f94936C = this.f95039C;
        return c34731ml;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f95040a + "', reportUrls=" + this.f95041b + ", getAdUrl='" + this.f95042c + "', reportAdUrl='" + this.f95043d + "', certificateUrl='" + this.f95044e + "', hostUrlsFromStartup=" + this.f95045f + ", hostUrlsFromClient=" + this.f95046g + ", diagnosticUrls=" + this.f95047h + ", customSdkHosts=" + this.f95048i + ", encodedClidsFromResponse='" + this.f95049j + "', lastClientClidsForStartupRequest='" + this.f95050k + "', lastChosenForRequestClids='" + this.f95051l + "', collectingFlags=" + this.f95052m + ", obtainTime=" + this.f95053n + ", hadFirstStartup=" + this.f95054o + ", startupDidNotOverrideClids=" + this.f95055p + ", countryInit='" + this.f95056q + "', statSending=" + this.f95057r + ", permissionsCollectingConfig=" + this.f95058s + ", retryPolicyConfig=" + this.f95059t + ", obtainServerTime=" + this.f95060u + ", firstStartupServerTime=" + this.f95061v + ", outdated=" + this.f95062w + ", autoInappCollectingConfig=" + this.f95063x + ", cacheControl=" + this.f95064y + ", attributionConfig=" + this.f95065z + ", startupUpdateConfig=" + this.f95037A + ", modulesRemoteConfigs=" + this.f95038B + ", externalAttributionConfig=" + this.f95039C + '}';
    }
}
