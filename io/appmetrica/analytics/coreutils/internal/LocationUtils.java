package io.appmetrica.analytics.coreutils.internal;

import android.location.Location;
import android.os.Parcel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class LocationUtils {
    @NotNull
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    @Nullable
    public static final Location bytesToLocation(@Nullable byte[] bArr) {
        if (bArr != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                Location location = (Location) obtain.readValue(Location.class.getClassLoader());
                obtain.recycle();
                return location;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }

    @Nullable
    public static final byte[] locationToBytes(@Nullable Location location) {
        if (location != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeValue(location);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            } catch (Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }
}
