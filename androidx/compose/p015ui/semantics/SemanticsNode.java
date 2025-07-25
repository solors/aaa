package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.layout.AlignmentLine;
import androidx.compose.p015ui.layout.LayoutCoordinatesKt;
import androidx.compose.p015ui.layout.LayoutInfo;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.node.Owner;
import androidx.compose.p015ui.node.RootForTest;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsNode.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
/* loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    @Nullable
    private SemanticsNode fakeNodeParent;

    /* renamed from: id */
    private final int f507id;
    private boolean isFake;
    @NotNull
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    @NotNull
    private final SemanticsEntity outerSemanticsEntity;
    @NotNull
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@NotNull SemanticsEntity outerSemanticsEntity, boolean z) {
        Intrinsics.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
        this.outerSemanticsEntity = outerSemanticsEntity;
        this.mergingEnabled = z;
        this.unmergedConfig = outerSemanticsEntity.collapsedSemanticsConfiguration();
        this.f507id = outerSemanticsEntity.getModifier().getId();
        this.layoutNode = outerSemanticsEntity.getLayoutNode();
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        Role role;
        String str;
        Object m17529r0;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m109286fakeSemanticsNodeypyhhiA(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list2 != null) {
                m17529r0 = _Collections.m17529r0(list2);
                str = (String) m17529r0;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m109286fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA  reason: not valid java name */
    private final SemanticsNode m109286fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsEntity(new LayoutNode(true).getInnerLayoutNodeWrapper$ui_release(), new SemanticsModifierCore(role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this), false, false, function1)), false);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list, boolean z) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, z, false, 2, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                findOneLayerOfMergingSemanticsNodes$default(semanticsNode, list, false, 2, null);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, z);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        if (this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            return true;
        }
        return false;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (!this.unmergedConfig.isClearingSemantics()) {
            List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
            int size = unmergedChildren$ui_release$default.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
                if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                    semanticsNode.mergeConfig(semanticsConfiguration);
                }
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z, z2);
    }

    @NotNull
    public final LayoutNodeWrapper findWrapperToGetBounds$ui_release() {
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            SemanticsEntity outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (outerMergingSemantics == null) {
                outerMergingSemantics = this.outerSemanticsEntity;
            }
            return outerMergingSemantics.getLayoutNodeWrapper();
        }
        return this.outerSemanticsEntity.getLayoutNodeWrapper();
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return findWrapperToGetBounds$ui_release().get(alignmentLine);
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        if (!this.layoutNode.isAttached()) {
            return Rect.Companion.getZero();
        }
        return LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        if (!this.layoutNode.isAttached()) {
            return Rect.Companion.getZero();
        }
        return LayoutCoordinatesKt.boundsInWindow(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return getChildren(false, !this.mergingEnabled, false);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    public final int getId() {
        return this.f507id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @NotNull
    public final SemanticsEntity getOuterSemanticsEntity$ui_release() {
        return this.outerSemanticsEntity;
    }

    @Nullable
    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsEntity semanticsEntity;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode != null) {
            semanticsEntity = SemanticsNodeKt.getOuterSemantics(layoutNode);
        } else {
            semanticsEntity = null;
        }
        if (semanticsEntity == null) {
            return null;
        }
        return new SemanticsNode(semanticsEntity, this.mergingEnabled);
    }

    /* renamed from: getPositionInRoot-F1C5BW0  reason: not valid java name */
    public final long m109287getPositionInRootF1C5BW0() {
        if (!this.layoutNode.isAttached()) {
            return Offset.Companion.m107307getZeroF1C5BW0();
        }
        return LayoutCoordinatesKt.positionInRoot(findWrapperToGetBounds$ui_release());
    }

    /* renamed from: getPositionInWindow-F1C5BW0  reason: not valid java name */
    public final long m109288getPositionInWindowF1C5BW0() {
        if (!this.layoutNode.isAttached()) {
            return Offset.Companion.m107307getZeroF1C5BW0();
        }
        return LayoutCoordinatesKt.positionInWindow(findWrapperToGetBounds$ui_release());
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, false, true);
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildrenSortedByBounds$ui_release() {
        return getChildren(true, false, true);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m109289getSizeYbymL2g() {
        return findWrapperToGetBounds$ui_release().mo109022getSizeYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsEntity semanticsEntity;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            semanticsEntity = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (semanticsEntity == null) {
                semanticsEntity = this.outerSemanticsEntity;
            }
        } else {
            semanticsEntity = this.outerSemanticsEntity;
        }
        return semanticsEntity.touchBoundsInRoot();
    }

    @NotNull
    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final boolean isRoot() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    public final void setFake$ui_release(boolean z) {
        this.isFake = z;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z, boolean z2) {
        List findOneLayerOfSemanticsWrappers$default;
        List<SemanticsNode> m17166m;
        if (this.isFake) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            findOneLayerOfSemanticsWrappers$default = SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$default(this.layoutNode, null, 1, null);
        } else {
            findOneLayerOfSemanticsWrappers$default = SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        }
        int size = findOneLayerOfSemanticsWrappers$default.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((SemanticsEntity) findOneLayerOfSemanticsWrappers$default.get(i), this.mergingEnabled));
        }
        if (z2) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean z, boolean z2, boolean z3) {
        List<SemanticsNode> m17166m;
        if (!z2 && this.unmergedConfig.isClearingSemantics()) {
            m17166m = C37563v.m17166m();
            return m17166m;
        } else if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, z, 1, null);
        } else {
            return unmergedChildren$ui_release(z, z3);
        }
    }
}
