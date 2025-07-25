package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;
import p678g1.C33182b;
import p678g1.EnumC33181a;

/* loaded from: classes9.dex */
public class IabUtils {
    @NonNull
    private static final EnumC33181a DEFAULT_CACHE_CONTROL = EnumC33181a.FullLoad;

    /* renamed from: io.bidmachine.utils.IabUtils$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class C37113a {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod = iArr;
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @NonNull
    public static BMError mapError(@NonNull C33182b c33182b) {
        BMError bMError;
        int m24487c = c33182b.m24487c();
        if (m24487c != 1) {
            if (m24487c != 3) {
                if (m24487c != 5) {
                    if (m24487c != 6) {
                        if (m24487c != 7) {
                            bMError = BMError.InternalUnknownError;
                        }
                    } else {
                        bMError = BMError.Expired;
                    }
                } else {
                    bMError = BMError.PlaceholderTimeout;
                }
            }
            bMError = BMError.NoFill;
        } else {
            bMError = BMError.NoConnection;
        }
        return new BMError(bMError, m24487c, c33182b.m24486d());
    }

    @NonNull
    public static EnumC33181a toCacheControl(@Nullable Object obj) {
        CreativeLoadingMethod valueOf;
        if (obj == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        if (obj instanceof EnumC33181a) {
            return (EnumC33181a) obj;
        }
        if (obj instanceof CreativeLoadingMethod) {
            valueOf = (CreativeLoadingMethod) obj;
        } else {
            if (obj instanceof String) {
                try {
                    valueOf = CreativeLoadingMethod.valueOf((String) obj);
                } catch (IllegalArgumentException unused) {
                }
            }
            valueOf = null;
        }
        if (valueOf != null) {
            int i = C37113a.$SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[valueOf.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return DEFAULT_CACHE_CONTROL;
                }
                return EnumC33181a.PartialLoad;
            }
            return EnumC33181a.Stream;
        }
        return DEFAULT_CACHE_CONTROL;
    }

    @Nullable
    public static C10507d transform(@Nullable AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            C10507d c10507d = new C10507d();
            c10507d.m79388O(controlAsset.getMargin());
            c10507d.m79384S(controlAsset.getPadding());
            c10507d.m79396G(controlAsset.getContent());
            c10507d.m79395H(Utils.safeParseColor(controlAsset.getFill()));
            c10507d.m79393J(Integer.valueOf(controlAsset.getFontStyle()));
            c10507d.m79378Y(Integer.valueOf(controlAsset.getWidth()));
            c10507d.m79392K(Integer.valueOf(controlAsset.getHeight()));
            c10507d.m79391L(Float.valueOf(controlAsset.getHideafter()));
            c10507d.m79390M(Utils.parseHorizontalPosition(controlAsset.getX()));
            c10507d.m79380W(Utils.parseVerticalPosition(controlAsset.getY()));
            c10507d.m79387P(Float.valueOf(controlAsset.getOpacity()));
            c10507d.m79386Q(Boolean.valueOf(controlAsset.getOutlined()));
            c10507d.m79383T(Utils.safeParseColor(controlAsset.getStroke()));
            c10507d.m79382U(Float.valueOf(controlAsset.getStrokeWidth()));
            c10507d.m79381V(controlAsset.getStyle());
            c10507d.m79379X(Boolean.valueOf(controlAsset.getVisible()));
            return c10507d;
        } catch (Exception unused) {
            return null;
        }
    }
}
