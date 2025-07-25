package sg.bigo.ads.common.p931s;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.s.b */
/* loaded from: classes10.dex */
public final class C43780b implements InterfaceC43615f {

    /* renamed from: a */
    public static final long f114560a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: b */
    public boolean f114561b;

    /* renamed from: c */
    public double f114562c;

    /* renamed from: d */
    public double f114563d;

    /* renamed from: e */
    public String f114564e;

    /* renamed from: f */
    public String f114565f;

    /* renamed from: g */
    public String f114566g;

    /* renamed from: h */
    public long f114567h;

    /* renamed from: i */
    private final Context f114568i;

    /* renamed from: j */
    private final AtomicBoolean f114569j;

    /* renamed from: k */
    private Runnable f114570k;

    public C43780b(@NonNull Context context) {
        this(context, 0L);
    }

    public final String toString() {
        return "{longitude=" + this.f114562c + ", latitude=" + this.f114563d + ", countryCode='" + this.f114564e + "', state='" + this.f114565f + "', city='" + this.f114566g + "', updateTime='" + this.f114567h + "'}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C43780b(@NonNull Context context, long j) {
        this.f114561b = false;
        this.f114569j = new AtomicBoolean(false);
        this.f114570k = new Runnable() { // from class: sg.bigo.ads.common.s.b.1
            @Override // java.lang.Runnable
            public final void run() {
                List<Address> list;
                try {
                    list = new Geocoder(C43780b.this.f114568i, Locale.ENGLISH).getFromLocation(C43780b.this.f114563d, C43780b.this.f114562c, 1);
                } catch (IOException e) {
                    C43782a.m5009a(0, "Location", "code io error, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d + ", " + e.getMessage());
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    Address address = list.get(0);
                    if (address != null) {
                        String locality = address.getLocality();
                        if (!TextUtils.isEmpty(locality)) {
                            C43780b.this.f114566g = locality.toLowerCase(Locale.ENGLISH);
                        }
                        String adminArea = address.getAdminArea();
                        if (TextUtils.isEmpty(adminArea)) {
                            adminArea = address.getSubAdminArea();
                        }
                        if (!TextUtils.isEmpty(adminArea)) {
                            C43780b.this.f114565f = adminArea.toLowerCase(Locale.ENGLISH);
                        }
                        String countryCode = address.getCountryCode();
                        if (!TextUtils.isEmpty(countryCode)) {
                            C43780b.this.f114564e = countryCode.toLowerCase(Locale.ENGLISH);
                        }
                    }
                } else {
                    C43782a.m5009a(0, "Location", "address is empty, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C43780b.this);
                C43782a.m5010a(0, 3, "Location", sb2.toString());
                C43780b.this.f114569j.set(false);
            }
        };
        this.f114568i = context;
        this.f114567h = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C43780b(@NonNull Context context, @NonNull Location location) {
        this.f114561b = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f114569j = atomicBoolean;
        this.f114570k = new Runnable() { // from class: sg.bigo.ads.common.s.b.1
            @Override // java.lang.Runnable
            public final void run() {
                List<Address> list;
                try {
                    list = new Geocoder(C43780b.this.f114568i, Locale.ENGLISH).getFromLocation(C43780b.this.f114563d, C43780b.this.f114562c, 1);
                } catch (IOException e) {
                    C43782a.m5009a(0, "Location", "code io error, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d + ", " + e.getMessage());
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    Address address = list.get(0);
                    if (address != null) {
                        String locality = address.getLocality();
                        if (!TextUtils.isEmpty(locality)) {
                            C43780b.this.f114566g = locality.toLowerCase(Locale.ENGLISH);
                        }
                        String adminArea = address.getAdminArea();
                        if (TextUtils.isEmpty(adminArea)) {
                            adminArea = address.getSubAdminArea();
                        }
                        if (!TextUtils.isEmpty(adminArea)) {
                            C43780b.this.f114565f = adminArea.toLowerCase(Locale.ENGLISH);
                        }
                        String countryCode = address.getCountryCode();
                        if (!TextUtils.isEmpty(countryCode)) {
                            C43780b.this.f114564e = countryCode.toLowerCase(Locale.ENGLISH);
                        }
                    }
                } else {
                    C43782a.m5009a(0, "Location", "address is empty, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C43780b.this);
                C43782a.m5010a(0, 3, "Location", sb2.toString());
                C43780b.this.f114569j.set(false);
            }
        };
        this.f114568i = context.getApplicationContext();
        this.f114567h = System.currentTimeMillis();
        this.f114562c = location.getLongitude();
        this.f114563d = location.getLatitude();
        if (!atomicBoolean.compareAndSet(false, true)) {
            C43727d.m5106a(this.f114570k);
        }
        C43727d.m5108a(1, this.f114570k);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.f114562c);
        parcel.writeDouble(this.f114563d);
        parcel.writeString(this.f114564e);
        parcel.writeString(this.f114565f);
        parcel.writeString(this.f114566g);
        parcel.writeLong(this.f114567h);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f114562c = parcel.readDouble();
        this.f114563d = parcel.readDouble();
        this.f114564e = parcel.readString();
        this.f114565f = parcel.readString();
        this.f114566g = parcel.readString();
        this.f114567h = parcel.readLong();
    }

    public C43780b(@NonNull Context context, @NonNull Parcel parcel) {
        this.f114561b = false;
        this.f114569j = new AtomicBoolean(false);
        this.f114570k = new Runnable() { // from class: sg.bigo.ads.common.s.b.1
            @Override // java.lang.Runnable
            public final void run() {
                List<Address> list;
                try {
                    list = new Geocoder(C43780b.this.f114568i, Locale.ENGLISH).getFromLocation(C43780b.this.f114563d, C43780b.this.f114562c, 1);
                } catch (IOException e) {
                    C43782a.m5009a(0, "Location", "code io error, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d + ", " + e.getMessage());
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    Address address = list.get(0);
                    if (address != null) {
                        String locality = address.getLocality();
                        if (!TextUtils.isEmpty(locality)) {
                            C43780b.this.f114566g = locality.toLowerCase(Locale.ENGLISH);
                        }
                        String adminArea = address.getAdminArea();
                        if (TextUtils.isEmpty(adminArea)) {
                            adminArea = address.getSubAdminArea();
                        }
                        if (!TextUtils.isEmpty(adminArea)) {
                            C43780b.this.f114565f = adminArea.toLowerCase(Locale.ENGLISH);
                        }
                        String countryCode = address.getCountryCode();
                        if (!TextUtils.isEmpty(countryCode)) {
                            C43780b.this.f114564e = countryCode.toLowerCase(Locale.ENGLISH);
                        }
                    }
                } else {
                    C43782a.m5009a(0, "Location", "address is empty, longitude=" + C43780b.this.f114562c + ", latitude=" + C43780b.this.f114563d);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C43780b.this);
                C43782a.m5010a(0, 3, "Location", sb2.toString());
                C43780b.this.f114569j.set(false);
            }
        };
        this.f114568i = context;
        mo4437b(parcel);
    }
}
