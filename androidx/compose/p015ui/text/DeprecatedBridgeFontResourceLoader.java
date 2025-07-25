package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.font.Font;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontKt;
import androidx.compose.p015ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p015ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextLayoutResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader */
/* loaded from: classes.dex */
public final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static Map<FontFamily.Resolver, Font.ResourceLoader> cache = new LinkedHashMap();
    @NotNull
    private static final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    @NotNull
    private final FontFamily.Resolver fontFamilyResolver;

    /* compiled from: TextLayoutResult.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Font.ResourceLoader from(@NotNull FontFamily.Resolver fontFamilyResolver) {
            Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = companion.getCache().get(fontFamilyResolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(fontFamilyResolver, null);
                companion.getCache().put(fontFamilyResolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        @NotNull
        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        @NotNull
        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(@NotNull Map<FontFamily.Resolver, Font.ResourceLoader> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            DeprecatedBridgeFontResourceLoader.cache = map;
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver);
    }

    @Override // androidx.compose.p015ui.text.font.Font.ResourceLoader
    @NotNull
    public Object load(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        return FontFamily.Resolver.m109438resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo109408getStyle_LCdwA(), 0, 8, null).getValue();
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }
}
