package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC20176k;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.InterfaceC20397q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mediationsdk.demandOnly.h */
/* loaded from: classes6.dex */
public interface InterfaceC20371h extends InterfaceC20397q {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC20372a implements InterfaceC20371h {
        @Nullable

        /* renamed from: a */
        private final String f51461a;
        @Nullable

        /* renamed from: b */
        private final String f51462b;

        /* renamed from: c */
        private final boolean f51463c;

        public AbstractC20372a(@Nullable String str, @Nullable String str2, boolean z) {
            this.f51461a = str;
            this.f51462b = str2;
            this.f51463c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20397q
        @Nullable
        /* renamed from: a */
        public abstract IronSourceError mo56886a();

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20371h
        @Nullable
        /* renamed from: b */
        public String mo56955b() {
            return this.f51462b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20371h
        @Nullable
        /* renamed from: c */
        public String mo56954c() {
            return this.f51461a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20371h
        /* renamed from: d */
        public boolean mo56953d() {
            return this.f51463c;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$b */
    /* loaded from: classes6.dex */
    public static final class C20373b extends AbstractC20372a {
        @NotNull

        /* renamed from: d */
        private final String f51464d;
        @Nullable

        /* renamed from: e */
        private final Activity f51465e;
        @Nullable

        /* renamed from: f */
        private final ISDemandOnlyBannerLayout f51466f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20373b(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f51464d = adFormat;
            this.f51465e = activity;
            this.f51466f = iSDemandOnlyBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20371h.AbstractC20372a, com.ironsource.mediationsdk.demandOnly.InterfaceC20397q
        @Nullable
        /* renamed from: a */
        public IronSourceError mo56886a() {
            IronSourceError m56885a = new InterfaceC20397q.C20398a(this.f51464d).m56885a(this);
            if (m56885a != null) {
                return m56885a;
            }
            return null;
        }

        @Nullable
        /* renamed from: f */
        public final Activity m56952f() {
            return this.f51465e;
        }

        @Nullable
        /* renamed from: g */
        public final ISDemandOnlyBannerLayout m56951g() {
            return this.f51466f;
        }

        public /* synthetic */ C20373b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$c */
    /* loaded from: classes6.dex */
    public static final class C20374c {
        @NotNull

        /* renamed from: a */
        private String f51467a = "";
        @Nullable

        /* renamed from: b */
        private Activity f51468b;
        @Nullable

        /* renamed from: c */
        private String f51469c;

        /* renamed from: d */
        private boolean f51470d;
        @Nullable

        /* renamed from: e */
        private String f51471e;
        @Nullable

        /* renamed from: f */
        private ISDemandOnlyBannerLayout f51472f;

        @NotNull
        /* renamed from: a */
        public final C20373b m56950a() {
            return new C20373b(this.f51467a, this.f51468b, this.f51469c, this.f51472f, this.f51471e, this.f51470d);
        }

        @NotNull
        /* renamed from: b */
        public final C20374c m56942b(@Nullable String str) {
            this.f51469c = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56949a(@Nullable Activity activity) {
            this.f51468b = activity;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C20375d m56943b() {
            return new C20375d(this.f51467a, this.f51468b, this.f51469c, this.f51471e, this.f51470d);
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56948a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f51468b = activity;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56947a(@NotNull IronSource.AD_UNIT adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String ad_unit = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(ad_unit, "adFormat.toString()");
            this.f51467a = ad_unit;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56946a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f51472f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56945a(@Nullable String str) {
            this.f51471e = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20374c m56944a(boolean z) {
            this.f51470d = z;
            return this;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.h$d */
    /* loaded from: classes6.dex */
    public static final class C20375d extends AbstractC20372a implements InterfaceC20176k {
        @NotNull

        /* renamed from: d */
        private final String f51473d;
        @Nullable

        /* renamed from: e */
        private final Activity f51474e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20375d(@NotNull String adFormat, @Nullable Activity activity, @Nullable String str, @Nullable String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f51473d = adFormat;
            this.f51474e = activity;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC20371h.AbstractC20372a, com.ironsource.mediationsdk.demandOnly.InterfaceC20397q
        @Nullable
        /* renamed from: a */
        public IronSourceError mo56886a() {
            IronSourceError m56884a = new InterfaceC20397q.C20399b(this.f51473d).m56884a(this);
            if (m56884a != null) {
                return m56884a;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC20176k
        @Nullable
        /* renamed from: e */
        public Activity mo56941e() {
            return this.f51474e;
        }

        public /* synthetic */ C20375d(String str, Activity activity, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }
    }

    @Nullable
    /* renamed from: b */
    String mo56955b();

    @Nullable
    /* renamed from: c */
    String mo56954c();

    /* renamed from: d */
    boolean mo56953d();
}
