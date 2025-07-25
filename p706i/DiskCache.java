package p706i;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.ranges._Ranges;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.AbstractC39215l;
import okio.C39223s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: i.a */
/* loaded from: classes2.dex */
public interface DiskCache {

    /* compiled from: DiskCache.kt */
    @Metadata
    /* renamed from: i.a$a */
    /* loaded from: classes2.dex */
    public static final class C33578a {
        @Nullable

        /* renamed from: a */
        private C39223s0 f91775a;

        /* renamed from: f */
        private long f91780f;
        @NotNull

        /* renamed from: b */
        private AbstractC39215l f91776b = AbstractC39215l.f102976b;

        /* renamed from: c */
        private double f91777c = 0.02d;

        /* renamed from: d */
        private long f91778d = 10485760;

        /* renamed from: e */
        private long f91779e = 262144000;
        @NotNull

        /* renamed from: g */
        private CoroutineDispatcher f91781g = Dispatchers.m16377b();

        @NotNull
        /* renamed from: a */
        public final DiskCache m23324a() {
            long j;
            C39223s0 c39223s0 = this.f91775a;
            if (c39223s0 != null) {
                if (this.f91777c > 0.0d) {
                    try {
                        StatFs statFs = new StatFs(c39223s0.toFile().getAbsolutePath());
                        j = _Ranges.m16906p((long) (this.f91777c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f91778d, this.f91779e);
                    } catch (Exception unused) {
                        j = this.f91778d;
                    }
                } else {
                    j = this.f91780f;
                }
                return new RealDiskCache(j, c39223s0, this.f91776b, this.f91781g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        @NotNull
        /* renamed from: b */
        public final C33578a m23323b(@NotNull File file) {
            return m23322c(C39223s0.C39224a.m13447d(C39223s0.f103001c, file, false, 1, null));
        }

        @NotNull
        /* renamed from: c */
        public final C33578a m23322c(@NotNull C39223s0 c39223s0) {
            this.f91775a = c39223s0;
            return this;
        }
    }

    /* compiled from: DiskCache.kt */
    @Metadata
    /* renamed from: i.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC33579b {
        @Nullable
        /* renamed from: a */
        InterfaceC33580c mo23260a();

        void abort();

        @NotNull
        C39223s0 getData();

        @NotNull
        C39223s0 getMetadata();
    }

    /* compiled from: DiskCache.kt */
    @Metadata
    /* renamed from: i.a$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC33580c extends Closeable {
        @Nullable
        /* renamed from: C */
        InterfaceC33579b mo23258C();

        @NotNull
        C39223s0 getData();

        @NotNull
        C39223s0 getMetadata();
    }

    @Nullable
    /* renamed from: a */
    InterfaceC33579b mo23264a(@NotNull String str);

    @Nullable
    InterfaceC33580c get(@NotNull String str);

    @NotNull
    AbstractC39215l getFileSystem();
}
