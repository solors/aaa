package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.publisher.nativead.model.C24165a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C25060a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b */
/* loaded from: classes7.dex */
public abstract class AbstractC24173b {
    @NotNull

    /* renamed from: a */
    public final C24165a.AbstractC24166a f62629a;

    /* renamed from: b */
    public final int f62630b;

    /* renamed from: c */
    public final boolean f62631c;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$a */
    /* loaded from: classes7.dex */
    public static final class C24174a extends AbstractC24173b {
        @NotNull

        /* renamed from: d */
        public final String f62632d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24174a(@NotNull C24165a.AbstractC24166a.C24167a originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.f62632d = originAsset.m46846c();
        }

        @NotNull
        /* renamed from: b */
        public final String m46836b() {
            return this.f62632d;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b */
    /* loaded from: classes7.dex */
    public static final class C24175b extends AbstractC24173b {
        @NotNull

        /* renamed from: d */
        public final Uri f62633d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24175b(@NotNull C24165a.AbstractC24166a.C24168b originAsset, @NotNull Uri precachedAssetUri) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(precachedAssetUri, "precachedAssetUri");
            this.f62633d = precachedAssetUri;
        }

        @NotNull
        /* renamed from: b */
        public final Uri m46835b() {
            return this.f62633d;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$c */
    /* loaded from: classes7.dex */
    public static final class C24176c extends AbstractC24173b {
        @NotNull

        /* renamed from: d */
        public final String f62634d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24176c(@NotNull C24165a.AbstractC24166a.C24169c originAsset) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.f62634d = originAsset.m46844c();
        }

        @NotNull
        /* renamed from: b */
        public final String m46834b() {
            return this.f62634d;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$d */
    /* loaded from: classes7.dex */
    public static final class C24177d extends AbstractC24173b {
        @NotNull

        /* renamed from: d */
        public final C25060a f62635d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24177d(@NotNull C24165a.AbstractC24166a.C24170d originAsset, @NotNull C25060a vastAd) {
            super(originAsset, null);
            Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            Intrinsics.checkNotNullParameter(vastAd, "vastAd");
            this.f62635d = vastAd;
        }

        @NotNull
        /* renamed from: b */
        public final C25060a m46833b() {
            return this.f62635d;
        }
    }

    public /* synthetic */ AbstractC24173b(C24165a.AbstractC24166a abstractC24166a, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC24166a);
    }

    @NotNull
    /* renamed from: a */
    public final C24165a.AbstractC24166a m46837a() {
        return this.f62629a;
    }

    public AbstractC24173b(C24165a.AbstractC24166a abstractC24166a) {
        this.f62629a = abstractC24166a;
        this.f62630b = abstractC24166a.m46848a();
        this.f62631c = abstractC24166a.m46847b();
    }
}
