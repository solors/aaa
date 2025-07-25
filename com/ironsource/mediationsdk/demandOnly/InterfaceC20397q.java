package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20371h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mediationsdk.demandOnly.q */
/* loaded from: classes6.dex */
public interface InterfaceC20397q {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.q$a */
    /* loaded from: classes6.dex */
    public static final class C20398a {
        @NotNull

        /* renamed from: a */
        private final String f51545a;

        public C20398a(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f51545a = adFormat;
        }

        @Nullable
        /* renamed from: a */
        public final IronSourceError m56885a(@NotNull InterfaceC20371h loadParams) {
            boolean z;
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            InterfaceC20371h.C20373b c20373b = (InterfaceC20371h.C20373b) loadParams;
            if (c20373b.m56952f() == null) {
                return new IronSourceError(1060, this.f51545a + " was initialized and loaded without Activity");
            } else if (c20373b.m56951g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            } else {
                if (c20373b.m56951g().isDestroyed()) {
                    return new IronSourceError(510, "Banner layout is destroyed");
                }
                ISBannerSize size = c20373b.m56951g().getSize();
                if (size == null) {
                    return new IronSourceError(510, "Missing banner size");
                }
                if (C20410l.f51634f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                    return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
                }
                if (c20373b.mo56954c() == null) {
                    return new IronSourceError(510, "Missing instance Id");
                }
                String mo56955b = c20373b.mo56955b();
                if (mo56955b != null && mo56955b.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && loadParams.mo56953d()) {
                    return new IronSourceError(510, "Missing adm");
                }
                return null;
            }
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.q$b */
    /* loaded from: classes6.dex */
    public static final class C20399b {
        @NotNull

        /* renamed from: a */
        private final String f51546a;

        public C20399b(@NotNull String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f51546a = adFormat;
        }

        @Nullable
        /* renamed from: a */
        public final IronSourceError m56884a(@NotNull InterfaceC20371h.C20375d loadParams) {
            boolean z;
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.mo56941e() == null) {
                return new IronSourceError(1060, this.f51546a + " was initialized and loaded without Activity");
            } else if (loadParams.mo56954c() == null) {
                return new IronSourceError(510, "Missing instance Id");
            } else {
                String mo56955b = loadParams.mo56955b();
                if (mo56955b != null && mo56955b.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && loadParams.mo56953d()) {
                    return new IronSourceError(510, "Missing adm");
                }
                return null;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    IronSourceError mo56886a();
}
