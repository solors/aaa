package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j */
/* loaded from: classes7.dex */
public abstract class AbstractC25263j {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j$a */
    /* loaded from: classes7.dex */
    public static final class C25264a extends AbstractC25263j {

        /* renamed from: a */
        public final int f65600a;

        public C25264a(int i) {
            super(null);
            this.f65600a = i;
        }

        /* renamed from: a */
        public final int m44876a() {
            return this.f65600a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C25264a) && this.f65600a == ((C25264a) obj).f65600a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65600a);
        }

        @NotNull
        public String toString() {
            return "Html(webViewId=" + this.f65600a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j$b */
    /* loaded from: classes7.dex */
    public static final class C25265b extends AbstractC25263j {
        @NotNull

        /* renamed from: a */
        public final String f65601a;

        /* renamed from: b */
        public final int f65602b;

        /* renamed from: c */
        public final int f65603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25265b(@NotNull String imageUrl, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.f65601a = imageUrl;
            this.f65602b = i;
            this.f65603c = i2;
        }

        /* renamed from: a */
        public final int m44875a() {
            return this.f65603c;
        }

        @NotNull
        /* renamed from: b */
        public final String m44874b() {
            return this.f65601a;
        }

        /* renamed from: c */
        public final int m44873c() {
            return this.f65602b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25265b)) {
                return false;
            }
            C25265b c25265b = (C25265b) obj;
            if (Intrinsics.m17075f(this.f65601a, c25265b.f65601a) && this.f65602b == c25265b.f65602b && this.f65603c == c25265b.f65603c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f65601a.hashCode() * 31) + Integer.hashCode(this.f65602b)) * 31) + Integer.hashCode(this.f65603c);
        }

        @NotNull
        public String toString() {
            return "Image(imageUrl=" + this.f65601a + ", w=" + this.f65602b + ", h=" + this.f65603c + ')';
        }
    }

    public /* synthetic */ AbstractC25263j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25263j() {
    }
}
