package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a */
    private final FusedLocationProviderClient f92506a;

    /* renamed from: b */
    private final LocationListener f92507b;

    /* renamed from: c */
    private final LocationCallback f92508c;

    /* renamed from: d */
    private final Looper f92509d;

    /* renamed from: e */
    private final Executor f92510e;

    /* renamed from: f */
    private final long f92511f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1 */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class C337321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f92512a;

        static {
            int[] iArr = new int[Priority.values().length];
            f92512a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92512a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92512a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class ClientProvider {

        /* renamed from: a */
        private final Context f92513a;

        ClientProvider(Context context) {
            this.f92513a = context;
        }

        /* renamed from: a */
        final FusedLocationProviderClient m22798a() {
            return new FusedLocationProviderClient(this.f92513a);
        }
    }

    /* loaded from: classes9.dex */
    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        int i;
        FusedLocationProviderClient fusedLocationProviderClient = this.f92506a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f92511f);
        int i2 = C337321.f92512a[priority.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    i = 105;
                } else {
                    i = 100;
                }
            } else {
                i = 102;
            }
        } else {
            i = 104;
        }
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i), this.f92508c, this.f92509d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f92506a.removeLocationUpdates(this.f92508c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f92506a.getLastLocation().addOnSuccessListener(this.f92510e, new GplOnSuccessListener(this.f92507b));
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.f92506a = clientProvider.m22798a();
        this.f92507b = locationListener;
        this.f92509d = looper;
        this.f92510e = executor;
        this.f92511f = j;
        this.f92508c = new GplLocationCallback(locationListener);
    }
}
