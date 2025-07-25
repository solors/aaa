package io.bidmachine.utils.version;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* loaded from: classes9.dex */
public class VersionRange {
    @Nullable
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;
    @Nullable

    /* renamed from: to */
    private final Version f97988to;

    public VersionRange(@Nullable Version version, @Nullable Version version2, boolean z, boolean z2) {
        this.from = version;
        this.f97988to = version2;
        this.isInclusiveFrom = z;
        this.isInclusiveTo = z2;
    }

    @VisibleForTesting
    static boolean isAfter(@NonNull Version version, @NonNull Version version2, boolean z) {
        if ((z && version2.isAfterOrEquals(version)) || (!z && version2.isAfter(version))) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    static boolean isBefore(@NonNull Version version, @NonNull Version version2, boolean z) {
        if ((z && version2.isBeforeOrEquals(version)) || (!z && version2.isBefore(version))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:5:0x0008, B:11:0x0020, B:17:0x003d, B:19:0x0047, B:21:0x004d, B:23:0x0054, B:16:0x0034, B:10:0x001c), top: B:26:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:5:0x0008, B:11:0x0020, B:17:0x003d, B:19:0x0047, B:21:0x004d, B:23:0x0054, B:16:0x0034, B:10:0x001c), top: B:26:0x0008 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.bidmachine.utils.version.VersionRange parseVersionRange(@androidx.annotation.NonNull java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "["
            boolean r0 = r8.startsWith(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "("
            boolean r2 = r8.startsWith(r2)     // Catch: java.lang.Throwable -> L66
            r3 = 1
            if (r0 != 0) goto L1c
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r0 = r3
            goto L20
        L1c:
            java.lang.String r8 = r8.substring(r3)     // Catch: java.lang.Throwable -> L66
        L20:
            java.lang.String r2 = "]"
            boolean r2 = r8.endsWith(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = ")"
            boolean r4 = r8.endsWith(r4)     // Catch: java.lang.Throwable -> L66
            r5 = 0
            if (r2 != 0) goto L34
            if (r4 == 0) goto L32
            goto L34
        L32:
            r2 = r3
            goto L3d
        L34:
            int r4 = r8.length()     // Catch: java.lang.Throwable -> L66
            int r4 = r4 - r3
            java.lang.String r8 = r8.substring(r5, r4)     // Catch: java.lang.Throwable -> L66
        L3d:
            java.lang.String r4 = "-"
            java.lang.String[] r4 = r8.split(r4)     // Catch: java.lang.Throwable -> L66
            int r6 = r4.length     // Catch: java.lang.Throwable -> L66
            r7 = 2
            if (r6 >= r7) goto L54
            io.bidmachine.utils.version.Version r8 = io.bidmachine.utils.version.Version.parseVersion(r8)     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L53
            io.bidmachine.utils.version.VersionRange r3 = new io.bidmachine.utils.version.VersionRange     // Catch: java.lang.Throwable -> L66
            r3.<init>(r8, r8, r0, r2)     // Catch: java.lang.Throwable -> L66
            r1 = r3
        L53:
            return r1
        L54:
            r8 = r4[r5]     // Catch: java.lang.Throwable -> L66
            io.bidmachine.utils.version.Version r8 = io.bidmachine.utils.version.Version.parseVersion(r8)     // Catch: java.lang.Throwable -> L66
            r3 = r4[r3]     // Catch: java.lang.Throwable -> L66
            io.bidmachine.utils.version.Version r3 = io.bidmachine.utils.version.Version.parseVersion(r3)     // Catch: java.lang.Throwable -> L66
            io.bidmachine.utils.version.VersionRange r4 = new io.bidmachine.utils.version.VersionRange     // Catch: java.lang.Throwable -> L66
            r4.<init>(r8, r3, r0, r2)     // Catch: java.lang.Throwable -> L66
            return r4
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.utils.version.VersionRange.parseVersionRange(java.lang.String):io.bidmachine.utils.version.VersionRange");
    }

    public boolean contains(@NonNull Version version) {
        Version version2;
        Version version3 = this.from;
        if (version3 != null && this.f97988to != null && isAfter(version3, version, this.isInclusiveFrom) && isBefore(this.f97988to, version, this.isInclusiveTo)) {
            return true;
        }
        Version version4 = this.from;
        if (version4 != null && this.f97988to == null && isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.f97988to) != null && isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        if (this.from == null && this.f97988to == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionRange versionRange = (VersionRange) obj;
        if (this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && Objects.equals(this.from, versionRange.from) && Objects.equals(this.f97988to, versionRange.f97988to)) {
            return true;
        }
        return false;
    }
}
