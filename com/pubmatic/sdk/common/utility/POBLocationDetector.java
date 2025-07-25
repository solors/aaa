package com.pubmatic.sdk.common.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class POBLocationDetector implements LocationListener {
    @NonNull

    /* renamed from: a */
    private final Context f70294a;
    @Nullable

    /* renamed from: b */
    private Location f70295b;
    @Nullable

    /* renamed from: c */
    private LocationManager f70296c;

    /* renamed from: d */
    private long f70297d = 0;

    /* renamed from: e */
    private long f70298e = 600000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.utility.POBLocationDetector$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C26729a {

        /* renamed from: a */
        static final /* synthetic */ int[] f70299a;

        static {
            int[] iArr = new int[EnumC26730b.values().length];
            f70299a = iArr;
            try {
                iArr[EnumC26730b.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70299a[EnumC26730b.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70299a[EnumC26730b.PASSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.common.utility.POBLocationDetector$b */
    /* loaded from: classes7.dex */
    public enum EnumC26730b {
        NETWORK("network"),
        GPS("gps"),
        PASSIVE("passive");
        

        /* renamed from: e */
        private final String f70304e;

        EnumC26730b(String str) {
            this.f70304e = str;
        }

        /* renamed from: a */
        boolean m40543a(Context context) {
            int i = C26729a.f70299a[ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    return false;
                }
                return POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
            } else if (!POBUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION") && !POBUtils.hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                return false;
            } else {
                return true;
            }
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f70304e;
        }
    }

    public POBLocationDetector(@NonNull Context context) {
        this.f70294a = context;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private void m40549a() {
        LocationManager m40548a = m40548a(this.f70294a);
        if (m40548a != null) {
            try {
                EnumC26730b enumC26730b = EnumC26730b.NETWORK;
                if (!m40548a.isProviderEnabled(enumC26730b.toString())) {
                    enumC26730b = EnumC26730b.GPS;
                }
                if (enumC26730b.m40543a(this.f70294a)) {
                    try {
                        POBLog.info("PMLocationDetector", "Requesting %s location", enumC26730b.toString());
                        m40548a.requestLocationUpdates(enumC26730b.toString(), 0L, 0.0f, this);
                        return;
                    } catch (Exception e) {
                        POBLog.info("PMLocationDetector", "Unable to request location updates. Error: %s", e.getMessage());
                        return;
                    }
                }
                POBLog.info("PMLocationDetector", "No permission to fetch GPS location", new Object[0]);
                return;
            } catch (Exception e2) {
                POBLog.warn("PMLocationDetector", "Unable to check network provider status. Error : %s", e2.getMessage());
                return;
            }
        }
        POBLog.info("PMLocationDetector", "Location Manager is not available to fetch GPS location", new Object[0]);
    }

    /* renamed from: b */
    private boolean m40545b() {
        if (this.f70297d == 0 || SystemClock.elapsedRealtime() - this.f70297d >= this.f70298e) {
            return true;
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    private void m40544c() {
        LocationManager m40548a = m40548a(this.f70294a);
        if (m40548a != null) {
            try {
                m40548a.removeUpdates(this);
            } catch (Exception e) {
                POBLog.warn("PMLocationDetector", "Unable to remove location updates. Error : %s" + e.getMessage(), new Object[0]);
            }
        }
    }

    @Nullable
    public Address getAddress() {
        Location location = getLocation();
        if (location != null) {
            try {
                List<Address> fromLocation = new Geocoder(this.f70294a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                if (fromLocation != null && !fromLocation.isEmpty()) {
                    return fromLocation.get(0);
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        Location location = getLocation();
        if (location != null) {
            try {
                List<Address> fromLocation = new Geocoder(this.f70294a, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                if (fromLocation != null && !fromLocation.isEmpty()) {
                    return fromLocation.get(0).getCountryCode();
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public Location getLocation() {
        EnumC26730b enumC26730b = EnumC26730b.GPS;
        if (!enumC26730b.m40543a(this.f70294a) && !EnumC26730b.NETWORK.m40543a(this.f70294a)) {
            return null;
        }
        if (m40545b()) {
            m40549a();
            Location m40546a = m40546a(m40547a(this.f70294a, enumC26730b), m40547a(this.f70294a, EnumC26730b.NETWORK));
            this.f70295b = m40546a;
            if (m40546a == null) {
                this.f70295b = m40547a(this.f70294a, EnumC26730b.PASSIVE);
            }
            if (this.f70295b != null) {
                this.f70297d = SystemClock.elapsedRealtime();
            }
            m40544c();
        }
        return this.f70295b;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NonNull Location location) {
        POBLog.info("PMLocationDetector", "On location changed : %s on time : %s", location.toString(), Long.valueOf(location.getTime()));
        this.f70295b = location;
        m40544c();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(@NonNull String str) {
        POBLog.info("PMLocationDetector", "On location provider disabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(@NonNull String str) {
        POBLog.info("PMLocationDetector", "On location provider enabled", new Object[0]);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        POBLog.info("PMLocationDetector", "On location provider status changed : %s", Integer.valueOf(i));
    }

    public void setLocationUpdateIntervalInMs(long j) {
        this.f70298e = j;
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private Location m40547a(Context context, EnumC26730b enumC26730b) {
        LocationManager m40548a;
        if (enumC26730b.m40543a(context) && (m40548a = m40548a(context)) != null) {
            try {
                this.f70295b = m40548a.getLastKnownLocation(enumC26730b.toString());
            } catch (IllegalArgumentException e) {
                POBLog.error("PMLocationDetector", "Unable to fetch the location. Error : %s", e.getMessage());
            } catch (SecurityException unused) {
                POBLog.error("PMLocationDetector", "Unable to fetch the location as user has restricted/denied location access to this app.", new Object[0]);
            } catch (Exception e2) {
                POBLog.error("PMLocationDetector", "Unable to fetch the location due to unknown reason. Error : %s", e2.getMessage());
            }
        }
        return this.f70295b;
    }

    @Nullable
    /* renamed from: a */
    private Location m40546a(@Nullable Location location, @Nullable Location location2) {
        return location == null ? location2 : (location2 != null && location.getTime() <= location2.getTime()) ? location2 : location;
    }

    @Nullable
    /* renamed from: a */
    private LocationManager m40548a(@NonNull Context context) {
        if (this.f70296c == null) {
            try {
                this.f70296c = (LocationManager) context.getSystemService("location");
            } catch (Exception e) {
                POBLog.warn("PMLocationDetector", "Unable to get location manager. Error : %s" + e.getMessage(), new Object[0]);
            }
        }
        return this.f70296c;
    }
}
