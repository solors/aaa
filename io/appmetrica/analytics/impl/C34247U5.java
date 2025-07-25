package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.U5 */
/* loaded from: classes9.dex */
public class C34247U5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C34247U5> CREATOR = new C34223T5();
    @Nullable

    /* renamed from: a */
    protected String f93553a;
    @Nullable

    /* renamed from: b */
    protected String f93554b;

    /* renamed from: c */
    public String f93555c;

    /* renamed from: d */
    public int f93556d;

    /* renamed from: e */
    public int f93557e;

    /* renamed from: f */
    public Pair f93558f;

    /* renamed from: g */
    public int f93559g;

    /* renamed from: h */
    public String f93560h;

    /* renamed from: i */
    public long f93561i;

    /* renamed from: j */
    public long f93562j;

    /* renamed from: k */
    public EnumC34423ba f93563k;

    /* renamed from: l */
    public EnumC34692l9 f93564l;

    /* renamed from: m */
    public Bundle f93565m;

    /* renamed from: n */
    public Boolean f93566n;

    /* renamed from: o */
    public Integer f93567o;

    /* renamed from: p */
    public Map f93568p;

    public C34247U5() {
        this("", 0);
    }

    /* renamed from: a */
    public final void m22201a(String str, String str2) {
        if (this.f93558f == null) {
            this.f93558f = new Pair(str, str2);
        }
    }

    @Nullable
    /* renamed from: b */
    public final Pair<String, String> m22200b() {
        return this.f93558f;
    }

    /* renamed from: c */
    public final void m22194c(@Nullable Bundle bundle) {
        this.f93565m = bundle;
    }

    /* renamed from: d */
    public final long m22192d() {
        return this.f93561i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m22189e() {
        return this.f93562j;
    }

    @Nullable
    /* renamed from: f */
    public final String m22187f() {
        return this.f93555c;
    }

    @NonNull
    /* renamed from: g */
    public final EnumC34423ba m22186g() {
        return this.f93563k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f93559g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f93557e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f93568p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f93553a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f93556d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f93554b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f93554b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    /* renamed from: h */
    public final Integer m22185h() {
        return this.f93567o;
    }

    @Nullable
    /* renamed from: i */
    public final Bundle m22184i() {
        return this.f93565m;
    }

    @Nullable
    /* renamed from: j */
    public final String m22183j() {
        return this.f93560h;
    }

    @Nullable
    /* renamed from: k */
    public final EnumC34692l9 m22182k() {
        return this.f93564l;
    }

    /* renamed from: l */
    public final boolean m22181l() {
        if (this.f93553a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m22180m() {
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        if (-1 == this.f93556d) {
            return true;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.f93559g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.f93557e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f93568p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f93553a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.f93556d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f93554b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        String str;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(Base64.encode(bArr, 0));
        }
        this.f93554b = str;
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = this.f93553a;
        objArr[1] = EnumC34324Xa.m22102a(this.f93556d).f93763b;
        String str = this.f93554b;
        if (str == null) {
            str = null;
        } else if (str.length() > 500) {
            str = str.substring(0, 500);
        }
        objArr[2] = str;
        return String.format(locale, "[event: %s, type: %s, value: %s]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f93553a);
        bundle.putString("CounterReport.Value", this.f93554b);
        bundle.putInt("CounterReport.Type", this.f93556d);
        bundle.putInt("CounterReport.CustomType", this.f93557e);
        bundle.putInt("CounterReport.TRUNCATED", this.f93559g);
        bundle.putString("CounterReport.ProfileID", this.f93560h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f93563k.f94026a);
        Bundle bundle2 = this.f93565m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f93555c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f93558f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f93561i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f93562j);
        EnumC34692l9 enumC34692l9 = this.f93564l;
        if (enumC34692l9 != null) {
            bundle.putInt("CounterReport.Source", enumC34692l9.f94824a);
        }
        Boolean bool = this.f93566n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f93567o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f93568p));
        parcel.writeBundle(bundle);
    }

    public C34247U5(@Nullable String str, int i) {
        this("", str, i);
    }

    @NonNull
    /* renamed from: e */
    public static C34247U5 m22188e(@NonNull C34247U5 c34247u5) {
        return m22210a(c34247u5, EnumC34324Xa.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: b */
    public final void m22196b(@Nullable String str) {
        this.f93555c = str;
    }

    /* renamed from: c */
    public void mo21908c(@Nullable String str) {
        this.f93560h = str;
    }

    @NonNull
    /* renamed from: d */
    public final Bundle m22191d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C34247U5(@Nullable String str, @Nullable String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m22214a(long j) {
        this.f93561i = j;
    }

    /* renamed from: b */
    public final void m22199b(long j) {
        this.f93562j = j;
    }

    @Nullable
    /* renamed from: c */
    public final Boolean m22195c() {
        return this.f93566n;
    }

    @VisibleForTesting
    public C34247U5(@Nullable String str, @Nullable String str2, int i, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f93563k = EnumC34423ba.UNKNOWN;
        this.f93568p = new HashMap();
        this.f93553a = str2;
        this.f93556d = i;
        this.f93554b = str;
        this.f93561i = systemTimeProvider.elapsedRealtime();
        this.f93562j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    /* renamed from: b */
    public static C34247U5 m22198b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                C34247U5 c34247u5 = (C34247U5) bundle.getParcelable("CounterReport.Object");
                if (c34247u5 != null) {
                    return c34247u5;
                }
            } catch (Throwable unused) {
                return new C34247U5("", 0);
            }
        }
        return new C34247U5("", 0);
    }

    @NonNull
    /* renamed from: c */
    public static C34247U5 m22193c(@NonNull C34247U5 c34247u5) {
        return m22210a(c34247u5, EnumC34324Xa.EVENT_TYPE_INIT);
    }

    @NonNull
    /* renamed from: d */
    public static C34247U5 m22190d(@NonNull C34247U5 c34247u5) {
        C34247U5 c34247u52 = new C34247U5("", 0);
        c34247u52.f93562j = c34247u5.f93562j;
        c34247u52.f93561i = c34247u5.f93561i;
        c34247u52.f93558f = c34247u5.f93558f;
        c34247u52.f93555c = c34247u5.f93555c;
        c34247u52.f93565m = c34247u5.f93565m;
        c34247u52.f93568p = c34247u5.f93568p;
        c34247u52.f93560h = c34247u5.f93560h;
        return c34247u52;
    }

    /* renamed from: a */
    public final void m22206a(@NonNull EnumC34423ba enumC34423ba) {
        this.f93563k = enumC34423ba;
    }

    /* renamed from: a */
    public final void m22205a(@Nullable EnumC34692l9 enumC34692l9) {
        this.f93564l = enumC34692l9;
    }

    /* renamed from: a */
    public final void m22204a(@Nullable Boolean bool) {
        this.f93566n = bool;
    }

    /* renamed from: a */
    public final void m22203a(@Nullable Integer num) {
        this.f93567o = num;
    }

    /* renamed from: a */
    public static Pair m22213a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public static C34247U5 m22197b(@NonNull C34247U5 c34247u5) {
        return m22210a(c34247u5, EnumC34324Xa.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: a */
    public static C34247U5 m22210a(C34247U5 c34247u5, EnumC34324Xa enumC34324Xa) {
        C34247U5 m22190d = m22190d(c34247u5);
        m22190d.f93556d = enumC34324Xa.f93762a;
        return m22190d;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22212a(@NonNull C34247U5 c34247u5) {
        return m22210a(c34247u5, EnumC34324Xa.EVENT_TYPE_ALIVE);
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22211a(@NonNull C34247U5 c34247u5, @NonNull C34012K9 c34012k9) {
        C34247U5 m22210a = m22210a(c34247u5, EnumC34324Xa.EVENT_TYPE_START);
        m22210a.setValueBytes(MessageNano.toByteArray(new C34773o9().fromModel(new C34746n9((String) c34012k9.f93125a.m22168a()))));
        m22210a.f93562j = c34247u5.f93562j;
        m22210a.f93561i = c34247u5.f93561i;
        return m22210a;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22208a(@NonNull C34247U5 c34247u5, @NonNull Collection<PermissionState> collection, @Nullable C33883F2 c33883f2, @NonNull C34496e2 c34496e2, @NonNull List<String> list) {
        String str;
        String str2;
        C34247U5 m22190d = m22190d(c34247u5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c33883f2 != null) {
                jSONObject.put("background_restricted", c33883f2.f92812b);
                EnumC33858E2 enumC33858E2 = c33883f2.f92811a;
                c34496e2.getClass();
                if (enumC33858E2 != null) {
                    int ordinal = enumC33858E2.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        m22190d.f93556d = 12288;
        m22190d.setValue(str);
        return m22190d;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22209a(@NonNull C34247U5 c34247u5, @Nullable String str) {
        C34247U5 m22190d = m22190d(c34247u5);
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        m22190d.f93556d = 12289;
        m22190d.setValue(str);
        return m22190d;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22215a() {
        C34247U5 c34247u5 = new C34247U5("", 0);
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        c34247u5.f93556d = 16384;
        return c34247u5;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22207a(@NonNull C34304We c34304We) {
        String str = "";
        int i = 0;
        C34247U5 c34247u5 = new C34247U5("", "", 0);
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        c34247u5.f93556d = 40976;
        ProductInfo productInfo = c34304We.f93648a;
        C34512ei c34512ei = new C34512ei();
        c34512ei.f94269a = productInfo.quantity;
        c34512ei.f94274f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        c34512ei.f94270b = str.getBytes();
        c34512ei.f94271c = productInfo.sku.getBytes();
        C34379Zh c34379Zh = new C34379Zh();
        c34379Zh.f93892a = productInfo.purchaseOriginalJson.getBytes();
        c34379Zh.f93893b = productInfo.signature.getBytes();
        c34512ei.f94273e = c34379Zh;
        c34512ei.f94275g = true;
        c34512ei.f94276h = 1;
        c34512ei.f94277i = AbstractC34280Ve.f93601a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        C34485di c34485di = new C34485di();
        c34485di.f94209a = productInfo.purchaseToken.getBytes();
        c34485di.f94210b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        c34512ei.f94278j = c34485di;
        if (productInfo.type == ProductType.SUBS) {
            C34458ci c34458ci = new C34458ci();
            c34458ci.f94102a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                C34431bi c34431bi = new C34431bi();
                c34431bi.f94036a = period.number;
                int i2 = AbstractC34280Ve.f93602b[period.timeUnit.ordinal()];
                c34431bi.f94037b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                c34458ci.f94103b = c34431bi;
            }
            C34404ai c34404ai = new C34404ai();
            c34404ai.f93971a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                C34431bi c34431bi2 = new C34431bi();
                c34431bi2.f94036a = period2.number;
                int i3 = AbstractC34280Ve.f93602b[period2.timeUnit.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 == 3) {
                    i = 3;
                } else if (i3 == 4) {
                    i = 4;
                }
                c34431bi2.f94037b = i;
                c34404ai.f93972b = c34431bi2;
            }
            c34404ai.f93973c = productInfo.introductoryPriceCycles;
            c34458ci.f94104c = c34404ai;
            c34512ei.f94279k = c34458ci;
        }
        c34247u5.setValueBytes(MessageNano.toByteArray(c34512ei));
        return c34247u5;
    }

    @NonNull
    /* renamed from: a */
    public static C34247U5 m22202a(@NonNull String str) {
        C34247U5 c34247u5 = new C34247U5("", 0);
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        c34247u5.f93556d = 12320;
        c34247u5.f93554b = str;
        c34247u5.f93564l = EnumC34692l9.JS;
        return c34247u5;
    }
}
