package sb;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p671fb.Expression;

@Metadata
/* renamed from: sb.g2 */
/* loaded from: classes8.dex */
public interface DivBase {
    @Nullable
    /* renamed from: a */
    List<DivVisibilityAction> mo7530a();

    @Nullable
    /* renamed from: b */
    Expression<Long> mo7528b();

    @Nullable
    /* renamed from: c */
    List<DivVariable> mo7526c();

    @Nullable
    /* renamed from: d */
    DivEdgeInsets mo7524d();

    @Nullable
    /* renamed from: e */
    Expression<Long> mo7522e();

    @Nullable
    /* renamed from: f */
    Expression<String> mo7520f();

    @Nullable
    /* renamed from: g */
    Expression<DivAlignmentHorizontal> mo7519g();

    @NotNull
    Expression<Double> getAlpha();

    @Nullable
    List<DivBackground> getBackground();

    @Nullable
    List<DivExtension> getExtensions();

    @NotNull
    DivSize getHeight();

    @Nullable
    String getId();

    @Nullable
    DivTransform getTransform();

    @NotNull
    Expression<DivVisibility> getVisibility();

    @NotNull
    DivSize getWidth();

    @Nullable
    /* renamed from: h */
    List<DivTooltip> mo7518h();

    @Nullable
    /* renamed from: i */
    DivAppearanceTransition mo7517i();

    @Nullable
    /* renamed from: j */
    DivChangeTransition mo7516j();

    @Nullable
    /* renamed from: k */
    List<DivDisappearAction> mo7515k();

    @Nullable
    /* renamed from: m */
    List<DivTransitionTrigger> mo7514m();

    @Nullable
    /* renamed from: n */
    Expression<DivAlignmentVertical> mo7513n();

    @Nullable
    /* renamed from: o */
    DivFocus mo7512o();

    @Nullable
    /* renamed from: p */
    DivAccessibility mo7511p();

    @Nullable
    /* renamed from: r */
    DivEdgeInsets mo7510r();

    @Nullable
    /* renamed from: s */
    List<DivAction> mo7509s();

    @Nullable
    /* renamed from: t */
    DivLayoutProvider mo7508t();

    @Nullable
    /* renamed from: u */
    DivVisibilityAction mo7507u();

    @Nullable
    /* renamed from: v */
    DivAppearanceTransition mo7506v();

    @Nullable
    /* renamed from: w */
    DivBorder mo7505w();
}
