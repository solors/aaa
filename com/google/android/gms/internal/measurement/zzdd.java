package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzdd extends zzbu implements zzdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeLong(j);
        zzb(23, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, bundle);
        zzb(9, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeLong(j);
        zzb(43, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeLong(j);
        zzb(24, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void generateEventId(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(22, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getAppInstanceId(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(20, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCachedAppInstanceId(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(19, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getConditionalUserProperties(String str, String str2, zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, zzdgVar);
        zzb(10, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenClass(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(17, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getCurrentScreenName(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(16, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getGmpAppId(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(21, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getMaxUserProperties(String str, zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        zzbw.zza(m72288a_, zzdgVar);
        zzb(6, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getSessionId(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(46, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getTestFlag(zzdg zzdgVar, int i) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        m72288a_.writeInt(i);
        zzb(38, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void getUserProperties(String str, String str2, boolean z, zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, z);
        zzbw.zza(m72288a_, zzdgVar);
        zzb(5, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void initForTests(Map map) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeMap(map);
        zzb(37, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void initialize(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        zzbw.zza(m72288a_, zzdoVar);
        m72288a_.writeLong(j);
        zzb(1, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void isDataCollectionEnabled(zzdg zzdgVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdgVar);
        zzb(40, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, bundle);
        zzbw.zza(m72288a_, z);
        zzbw.zza(m72288a_, z2);
        m72288a_.writeLong(j);
        zzb(2, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdgVar, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, bundle);
        zzbw.zza(m72288a_, zzdgVar);
        m72288a_.writeLong(j);
        zzb(3, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeInt(i);
        m72288a_.writeString(str);
        zzbw.zza(m72288a_, iObjectWrapper);
        zzbw.zza(m72288a_, iObjectWrapper2);
        zzbw.zza(m72288a_, iObjectWrapper3);
        zzb(33, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        zzbw.zza(m72288a_, bundle);
        m72288a_.writeLong(j);
        zzb(27, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeLong(j);
        zzb(28, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeLong(j);
        zzb(29, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeLong(j);
        zzb(30, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdg zzdgVar, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        zzbw.zza(m72288a_, zzdgVar);
        m72288a_.writeLong(j);
        zzb(31, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeLong(j);
        zzb(25, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeLong(j);
        zzb(26, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void performAction(Bundle bundle, zzdg zzdgVar, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        zzbw.zza(m72288a_, zzdgVar);
        m72288a_.writeLong(j);
        zzb(32, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void registerOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdhVar);
        zzb(35, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeLong(j);
        zzb(12, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        m72288a_.writeLong(j);
        zzb(8, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        m72288a_.writeLong(j);
        zzb(44, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        m72288a_.writeLong(j);
        zzb(45, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, iObjectWrapper);
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        m72288a_.writeLong(j);
        zzb(15, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, z);
        zzb(39, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        zzb(42, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setEventInterceptor(zzdh zzdhVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdhVar);
        zzb(34, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setInstanceIdProvider(zzdm zzdmVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdmVar);
        zzb(18, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, z);
        m72288a_.writeLong(j);
        zzb(11, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeLong(j);
        zzb(13, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeLong(j);
        zzb(14, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, intent);
        zzb(48, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeLong(j);
        zzb(7, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, iObjectWrapper);
        zzbw.zza(m72288a_, z);
        m72288a_.writeLong(j);
        zzb(4, m72288a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void unregisterOnMeasurementEventListener(zzdh zzdhVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, zzdhVar);
        zzb(36, m72288a_);
    }
}
