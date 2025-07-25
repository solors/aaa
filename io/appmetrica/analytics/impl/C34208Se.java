package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.Se */
/* loaded from: classes9.dex */
public final class C34208Se implements Parcelable {

    /* renamed from: a */
    public final ContentValues f93495a;

    /* renamed from: b */
    public final ResultReceiver f93496b;

    /* renamed from: c */
    public static final String f93494c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C34208Se> CREATOR = new C34184Re();

    public C34208Se(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f93495a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f93494c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f93496b = resultReceiver;
    }

    /* renamed from: a */
    public final void m22283a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap m22487b = AbstractC34024Kl.m22487b(map);
            synchronized (this) {
                this.f93495a.put("PROCESS_CFG_CLIDS", AbstractC34451cb.m21877b(m22487b));
            }
        }
    }

    /* renamed from: b */
    public final void m22281b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f93495a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC34679kn.m21470a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    /* renamed from: c */
    public final void m22279c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f93495a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            m22271j();
        }
    }

    /* renamed from: d */
    public final void m22277d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                m22281b(appMetricaConfig);
                m22283a(appMetricaConfig);
                m22279c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m22276e() {
        return this.f93495a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public final String m22275f() {
        return this.f93495a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public final Integer m22274g() {
        return this.f93495a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public final String m22273h() {
        return this.f93495a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public final boolean m22272i() {
        return this.f93495a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    /* renamed from: j */
    public final synchronized void m22271j() {
        this.f93495a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f93495a + ", mDataResultReceiver=" + this.f93496b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f93495a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f93496b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public final HashMap m22284a() {
        return AbstractC34451cb.m21876c(this.f93495a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: c */
    public final ResultReceiver m22280c() {
        return this.f93496b;
    }

    /* renamed from: d */
    public final String m22278d() {
        return this.f93495a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public C34208Se(C34208Se c34208Se) {
        synchronized (c34208Se) {
            this.f93495a = new ContentValues(c34208Se.f93495a);
            this.f93496b = c34208Se.f93496b;
        }
    }

    /* renamed from: b */
    public final ArrayList m22282b() {
        String asString = this.f93495a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC34451cb.m21878b(asString);
    }

    public C34208Se(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f93495a = contentValues == null ? new ContentValues() : contentValues;
        this.f93496b = resultReceiver;
    }
}
