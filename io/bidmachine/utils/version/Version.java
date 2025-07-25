package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes9.dex */
public class Version implements Comparable<Version> {
    private final int major;
    private final int minor;
    private final int patch;

    public Version(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    @Nullable
    public static Version parseVersion(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < split.length; i4++) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            i3 = (i3 * 100) + Integer.parseInt(split[i4]);
                        } else {
                            i3 = Integer.parseInt(split[2]);
                        }
                    } else {
                        i2 = Integer.parseInt(split[1]);
                    }
                } else {
                    i = Integer.parseInt(split[0]);
                }
            }
            return new Version(i, i2, i3);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major == version.major && this.minor == version.minor && this.patch == version.patch) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.major), Integer.valueOf(this.minor), Integer.valueOf(this.patch));
    }

    public boolean isAfter(@NonNull Version version) {
        if (compareTo(version) > 0) {
            return true;
        }
        return false;
    }

    public boolean isAfterOrEquals(@NonNull Version version) {
        if (compareTo(version) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isBefore(@NonNull Version version) {
        if (compareTo(version) < 0) {
            return true;
        }
        return false;
    }

    public boolean isBeforeOrEquals(@NonNull Version version) {
        if (compareTo(version) <= 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        int compare = Integer.compare(this.major, version.major);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.minor, version.minor);
        return compare2 != 0 ? compare2 : Integer.compare(this.patch, version.patch);
    }
}
