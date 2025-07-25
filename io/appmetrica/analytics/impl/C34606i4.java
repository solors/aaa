package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.i4 */
/* loaded from: classes9.dex */
public final class C34606i4 {

    /* renamed from: a */
    public final IdentifiersResult f94597a;

    /* renamed from: b */
    public final IdentifiersResult f94598b;

    /* renamed from: c */
    public final IdentifiersResult f94599c;

    /* renamed from: d */
    public final IdentifiersResult f94600d;

    /* renamed from: e */
    public final IdentifiersResult f94601e;

    /* renamed from: f */
    public final IdentifiersResult f94602f;

    /* renamed from: g */
    public final IdentifiersResult f94603g;

    /* renamed from: h */
    public final IdentifiersResult f94604h;

    /* renamed from: i */
    public final IdentifiersResult f94605i;

    /* renamed from: j */
    public final IdentifiersResult f94606j;

    /* renamed from: k */
    public final IdentifiersResult f94607k;

    /* renamed from: l */
    public final long f94608l;

    /* renamed from: m */
    public final long f94609m;

    /* renamed from: n */
    public final C34227T9 f94610n;

    /* renamed from: o */
    public final Bundle f94611o;

    public C34606i4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j, long j2, C34227T9 c34227t9, Bundle bundle) {
        this.f94597a = identifiersResult;
        this.f94598b = identifiersResult2;
        this.f94599c = identifiersResult3;
        this.f94600d = identifiersResult4;
        this.f94601e = identifiersResult5;
        this.f94602f = identifiersResult6;
        this.f94603g = identifiersResult7;
        this.f94604h = identifiersResult8;
        this.f94605i = identifiersResult9;
        this.f94606j = identifiersResult10;
        this.f94607k = identifiersResult11;
        this.f94608l = j;
        this.f94609m = j2;
        this.f94610n = c34227t9;
        this.f94611o = bundle;
    }

    /* renamed from: a */
    public static IdentifiersResult m21555a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    /* renamed from: b */
    public final void m21552b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f94597a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f94598b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle(KiwiConstants.f2694Z, bundle3);
        IdentifiersResult identifiersResult3 = this.f94599c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f94600d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f94601e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f94602f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f94603g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f94604h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle(IronSourceConstants.TYPE_GAID, bundle9);
        IdentifiersResult identifiersResult9 = this.f94605i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f94606j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f94607k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f94608l);
        bundle.putLong("NextStartupTime", this.f94609m);
        C34227T9 c34227t9 = this.f94610n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c34227t9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C34693la.f94825C.m21439m().m22693h());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f94597a + ", mDeviceIdData=" + this.f94598b + ", mDeviceIdHashData=" + this.f94599c + ", mReportAdUrlData=" + this.f94600d + ", mGetAdUrlData=" + this.f94601e + ", mResponseClidsData=" + this.f94602f + ", mClientClidsForRequestData=" + this.f94603g + ", mGaidData=" + this.f94604h + ", mHoaidData=" + this.f94605i + ", yandexAdvIdData=" + this.f94606j + ", customSdkHostsData=" + this.f94607k + ", mServerTimeOffset=" + this.f94608l + ", nextStartupTime=" + this.f94609m + ", features=" + this.f94610n + ", modulesConfig=" + this.f94611o + '}';
    }

    /* renamed from: a */
    public static C34227T9 m21556a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C34227T9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C34227T9 c34227t9 = (C34227T9) parcelable;
        return c34227t9 == null ? new C34227T9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c34227t9;
    }

    /* renamed from: a */
    public static IdentifiersResult m21553a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    public static C34227T9 m21554a(Boolean bool) {
        boolean z = bool != null;
        return new C34227T9(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
