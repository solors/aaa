package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c */
/* loaded from: classes7.dex */
public abstract class AbstractC24691c {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$a */
    /* loaded from: classes7.dex */
    public static final class C24692a extends AbstractC24691c {
        @NotNull

        /* renamed from: a */
        public final File f63758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24692a(@NotNull File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.f63758a = file;
        }

        @NotNull
        /* renamed from: a */
        public final File m45920a() {
            return this.f63758a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C24692a) && Intrinsics.m17075f(this.f63758a, ((C24692a) obj).f63758a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f63758a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Complete(file=" + this.f63758a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$b */
    /* loaded from: classes7.dex */
    public static final class C24693b extends AbstractC24691c {
        @NotNull

        /* renamed from: a */
        public final InterfaceC24650f.AbstractC24651a.AbstractC24652a f63759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24693b(@NotNull InterfaceC24650f.AbstractC24651a.AbstractC24652a failure) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f63759a = failure;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC24650f.AbstractC24651a.AbstractC24652a m45919a() {
            return this.f63759a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C24693b) && Intrinsics.m17075f(this.f63759a, ((C24693b) obj).f63759a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f63759a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f63759a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$c */
    /* loaded from: classes7.dex */
    public static final class C24694c extends AbstractC24691c {
        @NotNull

        /* renamed from: a */
        public final File f63760a;
        @NotNull

        /* renamed from: b */
        public final C24695d f63761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24694c(@NotNull File file, @NotNull C24695d progress) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f63760a = file;
            this.f63761b = progress;
        }

        @NotNull
        /* renamed from: a */
        public final File m45918a() {
            return this.f63760a;
        }

        @NotNull
        /* renamed from: b */
        public final C24695d m45917b() {
            return this.f63761b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24694c)) {
                return false;
            }
            C24694c c24694c = (C24694c) obj;
            if (Intrinsics.m17075f(this.f63760a, c24694c.f63760a) && Intrinsics.m17075f(this.f63761b, c24694c.f63761b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f63760a.hashCode() * 31) + this.f63761b.hashCode();
        }

        @NotNull
        public String toString() {
            return "InProgress(file=" + this.f63760a + ", progress=" + this.f63761b + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$d */
    /* loaded from: classes7.dex */
    public static final class C24695d {

        /* renamed from: a */
        public final long f63762a;

        /* renamed from: b */
        public final long f63763b;

        public C24695d(long j, long j2) {
            this.f63762a = j;
            this.f63763b = j2;
        }

        /* renamed from: a */
        public final long m45916a() {
            return this.f63762a;
        }

        /* renamed from: b */
        public final long m45915b() {
            return this.f63763b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24695d)) {
                return false;
            }
            C24695d c24695d = (C24695d) obj;
            if (this.f63762a == c24695d.f63762a && this.f63763b == c24695d.f63763b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f63762a) * 31) + Long.hashCode(this.f63763b);
        }

        @NotNull
        public String toString() {
            return "Progress(bytesDownloaded=" + this.f63762a + ", totalBytes=" + this.f63763b + ')';
        }
    }

    public /* synthetic */ AbstractC24691c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC24691c() {
    }
}
