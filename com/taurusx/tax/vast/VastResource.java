package com.taurusx.tax.vast;

import androidx.media3.common.MimeTypes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.p606j.C28518e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class VastResource implements Serializable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: f */
    public static final List<String> f74354f;
    @NotNull

    /* renamed from: g */
    public static final List<String> f74355g;
    @SerializedName("resource")
    @Expose
    @NotNull

    /* renamed from: a */
    public final String f74356a;
    @SerializedName("type")
    @Expose
    @NotNull

    /* renamed from: b */
    public final Type f74357b;
    @SerializedName(Reporting.Key.CREATIVE_TYPE)
    @Expose
    @NotNull

    /* renamed from: c */
    public final CreativeType f74358c;
    @SerializedName("width")
    @Expose

    /* renamed from: d */
    public final int f74359d;
    @SerializedName("height")
    @Expose

    /* renamed from: e */
    public final int f74360e;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {

        @Metadata
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[1] = 1;
                iArr[0] = 2;
                iArr[2] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager resourceXmlManager, @NotNull Type type, int i, int i2) {
            String m38030a;
            Intrinsics.checkNotNullParameter(resourceXmlManager, "resourceXmlManager");
            Intrinsics.checkNotNullParameter(type, "type");
            String m38029a = C28518e.m38029a(C28518e.m38014c(resourceXmlManager.f74363a, "StaticResource"), "creativeType");
            String lowerCase = m38029a != null ? m38029a.toLowerCase() : null;
            CreativeType creativeType = CreativeType.NONE;
            int ordinal = type.ordinal();
            if (ordinal != 0) {
                boolean z = true;
                if (ordinal != 1) {
                    m38030a = ordinal != 2 ? null : C28518e.m38030a(C28518e.m38014c(resourceXmlManager.f74363a, "IFrameResource"));
                } else {
                    m38030a = C28518e.m38030a(C28518e.m38014c(resourceXmlManager.f74363a, "StaticResource"));
                    if (!VastResource.f74354f.contains(lowerCase) && !VastResource.f74355g.contains(lowerCase)) {
                        z = false;
                    }
                    if (!z) {
                        m38030a = null;
                    }
                    creativeType = VastResource.f74354f.contains(lowerCase) ? CreativeType.IMAGE : null;
                    if (creativeType == null) {
                        creativeType = CreativeType.JAVASCRIPT;
                    }
                }
            } else {
                m38030a = C28518e.m38030a(C28518e.m38014c(resourceXmlManager.f74363a, "HTMLResource"));
            }
            String str = m38030a;
            CreativeType creativeType2 = creativeType;
            if (str == null) {
                return null;
            }
            return new VastResource(str, type, creativeType2, i, i2);
        }

        public Companion() {
        }

        @Nullable
        public final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager resourceXmlManager, int i, int i2) {
            Object m17529r0;
            Intrinsics.checkNotNullParameter(resourceXmlManager, "resourceXmlManager");
            Type[] valuesCustom = Type.valuesCustom();
            ArrayList arrayList = new ArrayList();
            for (Type type : valuesCustom) {
                VastResource fromVastResourceXmlManager = VastResource.Companion.fromVastResourceXmlManager(resourceXmlManager, type, i, i2);
                if (fromVastResourceXmlManager != null) {
                    arrayList.add(fromVastResourceXmlManager);
                }
            }
            m17529r0 = _Collections.m17529r0(arrayList);
            return (VastResource) m17529r0;
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public enum CreativeType {
        NONE,
        IMAGE,
        JAVASCRIPT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CreativeType[] valuesCustom() {
            CreativeType[] valuesCustom = values();
            return (CreativeType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    @Metadata
    /* loaded from: classes7.dex */
    public enum Type {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE,
        BLURRED_LAST_FRAME;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            return (Type[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    static {
        List<String> m17163p;
        List<String> m17175e;
        m17163p = C37563v.m17163p("image/jpeg", "image/png", MimeTypes.IMAGE_BMP, "image/gif", "image/jpg");
        f74354f = m17163p;
        m17175e = CollectionsJVM.m17175e("application/x-javascript");
        f74355g = m17175e;
    }

    public VastResource(@NotNull String resource, @NotNull Type type, @NotNull CreativeType creativeType, int i, int i2) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.f74356a = resource;
        this.f74357b = type;
        this.f74358c = creativeType;
        this.f74359d = i;
        this.f74360e = i2;
    }

    @Nullable
    public static final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager vastResourceXmlManager, int i, int i2) {
        return Companion.fromVastResourceXmlManager(vastResourceXmlManager, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastResource)) {
            return false;
        }
        VastResource vastResource = (VastResource) obj;
        if (Intrinsics.m17075f(this.f74356a, vastResource.f74356a) && this.f74357b == vastResource.f74357b && this.f74358c == vastResource.f74358c && this.f74359d == vastResource.f74359d && this.f74360e == vastResource.f74360e) {
            return true;
        }
        return false;
    }

    @NotNull
    public final CreativeType getCreativeType() {
        return this.f74358c;
    }

    public final int getHeight() {
        return this.f74360e;
    }

    @Nullable
    public final String getHtmlResourceValue() {
        Type type = this.f74357b;
        if (type == Type.HTML_RESOURCE) {
            return this.f74356a;
        }
        if (type == Type.IFRAME_RESOURCE) {
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f74359d + "\" height=\"" + this.f74360e + "\" src=\"" + this.f74356a + "\"></iframe>";
        }
        Type type2 = Type.STATIC_RESOURCE;
        if (type == type2 && this.f74358c == CreativeType.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f74356a + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (type == type2 && this.f74358c == CreativeType.JAVASCRIPT) {
            return "<script src=\"" + this.f74356a + "\"></script>";
        } else if (type == Type.BLURRED_LAST_FRAME) {
            return this.f74356a;
        } else {
            return null;
        }
    }

    @NotNull
    public final String getResource() {
        return this.f74356a;
    }

    @NotNull
    public final Type getType() {
        return this.f74357b;
    }

    public final int getWidth() {
        return this.f74359d;
    }

    public int hashCode() {
        return (((((((this.f74356a.hashCode() * 31) + this.f74357b.hashCode()) * 31) + this.f74358c.hashCode()) * 31) + this.f74359d) * 31) + this.f74360e;
    }

    public final void initializeWebView(@NotNull VastWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (getHtmlResourceValue() != null) {
            webView.m37811b();
        }
    }

    @NotNull
    public String toString() {
        return "VastResource(resource='" + this.f74356a + "', type=" + this.f74357b + ", creativeType=" + this.f74358c + ", width=" + this.f74359d + ", height=" + this.f74360e + ')';
    }

    @Nullable
    public static final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager vastResourceXmlManager, @NotNull Type type, int i, int i2) {
        return Companion.fromVastResourceXmlManager(vastResourceXmlManager, type, i, i2);
    }
}
