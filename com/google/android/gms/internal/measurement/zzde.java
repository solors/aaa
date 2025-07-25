package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzde extends zzbx implements zzdb {
    public zzde() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdb) {
            return (zzdb) queryLocalInterface;
        }
        return new zzdd(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdg zzdiVar;
        zzdg zzdgVar;
        zzdg zzdgVar2 = null;
        zzdg zzdgVar3 = null;
        zzdg zzdgVar4 = null;
        zzdg zzdgVar5 = null;
        zzdh zzdhVar = null;
        zzdh zzdhVar2 = null;
        zzdh zzdhVar3 = null;
        zzdg zzdgVar6 = null;
        zzdg zzdgVar7 = null;
        zzdg zzdgVar8 = null;
        zzdg zzdgVar9 = null;
        zzdg zzdgVar10 = null;
        zzdg zzdgVar11 = null;
        zzdm zzdmVar = null;
        zzdg zzdgVar12 = null;
        zzdg zzdgVar13 = null;
        zzdg zzdgVar14 = null;
        zzdg zzdgVar15 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                zzbw.zzb(parcel);
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzdo) zzbw.zza(parcel, zzdo.CREATOR), readLong);
                break;
            case 2:
                boolean zzc = zzbw.zzc(parcel);
                boolean zzc2 = zzbw.zzc(parcel);
                long readLong2 = parcel.readLong();
                zzbw.zzb(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzbw.zza(parcel, Bundle.CREATOR), zzc, zzc2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdgVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzdg) {
                        zzdiVar = (zzdg) queryLocalInterface;
                    } else {
                        zzdiVar = new zzdi(readStrongBinder);
                    }
                    zzdgVar = zzdiVar;
                }
                long readLong3 = parcel.readLong();
                zzbw.zzb(parcel);
                logEventAndBundle(readString, readString2, bundle, zzdgVar, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzc3 = zzbw.zzc(parcel);
                long readLong4 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserProperty(readString3, readString4, asInterface, zzc3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean zzc4 = zzbw.zzc(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzdg) {
                        zzdgVar2 = (zzdg) queryLocalInterface2;
                    } else {
                        zzdgVar2 = new zzdi(readStrongBinder2);
                    }
                }
                zzbw.zzb(parcel);
                getUserProperties(readString5, readString6, zzc4, zzdgVar2);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzdg) {
                        zzdgVar15 = (zzdg) queryLocalInterface3;
                    } else {
                        zzdgVar15 = new zzdi(readStrongBinder3);
                    }
                }
                zzbw.zzb(parcel);
                getMaxUserProperties(readString7, zzdgVar15);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                zzbw.zzb(parcel);
                setConditionalUserProperty((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                zzbw.zzb(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzdg) {
                        zzdgVar14 = (zzdg) queryLocalInterface4;
                    } else {
                        zzdgVar14 = new zzdi(readStrongBinder4);
                    }
                }
                zzbw.zzb(parcel);
                getConditionalUserProperties(readString9, readString10, zzdgVar14);
                break;
            case 11:
                boolean zzc5 = zzbw.zzc(parcel);
                long readLong7 = parcel.readLong();
                zzbw.zzb(parcel);
                setMeasurementEnabled(zzc5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                zzbw.zzb(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                zzbw.zzb(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                zzbw.zzb(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbw.zzb(parcel);
                setCurrentScreen(asInterface2, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzdg) {
                        zzdgVar13 = (zzdg) queryLocalInterface5;
                    } else {
                        zzdgVar13 = new zzdi(readStrongBinder5);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenName(zzdgVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzdg) {
                        zzdgVar12 = (zzdg) queryLocalInterface6;
                    } else {
                        zzdgVar12 = new zzdi(readStrongBinder6);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenClass(zzdgVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzdm) {
                        zzdmVar = (zzdm) queryLocalInterface7;
                    } else {
                        zzdmVar = new zzdl(readStrongBinder7);
                    }
                }
                zzbw.zzb(parcel);
                setInstanceIdProvider(zzdmVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzdg) {
                        zzdgVar11 = (zzdg) queryLocalInterface8;
                    } else {
                        zzdgVar11 = new zzdi(readStrongBinder8);
                    }
                }
                zzbw.zzb(parcel);
                getCachedAppInstanceId(zzdgVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzdg) {
                        zzdgVar10 = (zzdg) queryLocalInterface9;
                    } else {
                        zzdgVar10 = new zzdi(readStrongBinder9);
                    }
                }
                zzbw.zzb(parcel);
                getAppInstanceId(zzdgVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzdg) {
                        zzdgVar9 = (zzdg) queryLocalInterface10;
                    } else {
                        zzdgVar9 = new zzdi(readStrongBinder10);
                    }
                }
                zzbw.zzb(parcel);
                getGmpAppId(zzdgVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzdg) {
                        zzdgVar8 = (zzdg) queryLocalInterface11;
                    } else {
                        zzdgVar8 = new zzdi(readStrongBinder11);
                    }
                }
                zzbw.zzb(parcel);
                generateEventId(zzdgVar8);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbw.zzb(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbw.zzb(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStarted(asInterface3, readLong14);
                break;
            case 26:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStopped(asInterface4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityDestroyed(asInterface5, readLong17);
                break;
            case 29:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityPaused(asInterface6, readLong18);
                break;
            case 30:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityResumed(asInterface7, readLong19);
                break;
            case 31:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzdg) {
                        zzdgVar7 = (zzdg) queryLocalInterface12;
                    } else {
                        zzdgVar7 = new zzdi(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivitySaveInstanceState(asInterface8, zzdgVar7, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzdg) {
                        zzdgVar6 = (zzdg) queryLocalInterface13;
                    } else {
                        zzdgVar6 = new zzdi(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                zzbw.zzb(parcel);
                performAction(bundle2, zzdgVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                logHealthData(readInt, readString15, asInterface9, asInterface10, asInterface11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzdh) {
                        zzdhVar3 = (zzdh) queryLocalInterface14;
                    } else {
                        zzdhVar3 = new zzdj(readStrongBinder14);
                    }
                }
                zzbw.zzb(parcel);
                setEventInterceptor(zzdhVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzdh) {
                        zzdhVar2 = (zzdh) queryLocalInterface15;
                    } else {
                        zzdhVar2 = new zzdj(readStrongBinder15);
                    }
                }
                zzbw.zzb(parcel);
                registerOnMeasurementEventListener(zzdhVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzdh) {
                        zzdhVar = (zzdh) queryLocalInterface16;
                    } else {
                        zzdhVar = new zzdj(readStrongBinder16);
                    }
                }
                zzbw.zzb(parcel);
                unregisterOnMeasurementEventListener(zzdhVar);
                break;
            case 37:
                HashMap zza = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                initForTests(zza);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzdg) {
                        zzdgVar5 = (zzdg) queryLocalInterface17;
                    } else {
                        zzdgVar5 = new zzdi(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                zzbw.zzb(parcel);
                getTestFlag(zzdgVar5, readInt2);
                break;
            case 39:
                boolean zzc6 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                setDataCollectionEnabled(zzc6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzdg) {
                        zzdgVar4 = (zzdg) queryLocalInterface18;
                    } else {
                        zzdgVar4 = new zzdi(readStrongBinder18);
                    }
                }
                zzbw.zzb(parcel);
                isDataCollectionEnabled(zzdgVar4);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                zzbw.zzb(parcel);
                setDefaultEventParameters((Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                zzbw.zzb(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsent((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsentThirdParty((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof zzdg) {
                        zzdgVar3 = (zzdg) queryLocalInterface19;
                    } else {
                        zzdgVar3 = new zzdi(readStrongBinder19);
                    }
                }
                zzbw.zzb(parcel);
                getSessionId(zzdgVar3);
                break;
            case 48:
                zzbw.zzb(parcel);
                setSgtmDebugInfo((Intent) zzbw.zza(parcel, Intent.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
